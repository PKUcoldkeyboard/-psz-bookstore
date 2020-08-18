package com.cuterwrite.rbspring.util;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

/**
 * 加密器类
 *
 * @author leverest
 * @version 2020/3/13 00:24
 */
public class PasswordEncrypter {
    /**
     * 对输入的密码进行加密
     *
     * @param plain 待加密的密码
     * @return 加密后的密码
     */
    public static String encrypt(String plain) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        // m, 最大内存使用(KB)
        int maxMemoryCost = 1 << 15;
        // p, 线程数
        int parallelism = 4;
        // t, 迭代次数
        int iterations = 4;
        try {
            return argon2.hash(iterations, maxMemoryCost, parallelism, plain);
        } catch (RuntimeException e) {
            return null;
        }
    }

    /**
     * 检验所给密码 plain 是否为真
     *
     * @param plain, 待检验的密码
     * @param hash,  真密码加密后的hash
     * @return 匹配成功返回 true, 否则返回 false
     */
    public static boolean verify(String plain, String hash) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.verify(hash, plain);
    }
}
