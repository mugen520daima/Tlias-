package com.weller.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

/**
 * JWT令牌工具类
 * 用于生成和解析JWT令牌
 */
public class JwtUtils {

    /**
     * 签名密钥（weller的base64编码）
     */
    private static final String SECRET_KEY = "d2VsbGVy";

    /**
     * 令牌过期时间（12小时）
     */
    private static final long EXPIRATION_TIME = 12 * 3600 * 1000;

    /**
     * 生成JWT令牌
     *
     * @param claims 自定义声明信息
     * @return 生成的JWT令牌字符串
     */
    public static String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY) // 指定加密算法和密钥
                .addClaims(claims) // 添加自定义信息
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // 设定过期时间（12小时）
                .compact(); // 生成令牌
    }

    /**
     * 解析JWT令牌
     *
     * @param token JWT令牌字符串
     * @return 解析后的声明信息
     */
    public static Claims parseToken(String token) throws Exception{
        return Jwts.parser()
                .setSigningKey(SECRET_KEY) // 指定密钥，要和生成令牌时使用的密钥一致
                .parseClaimsJws(token)
                .getBody();
    }
}