package com.nicron.study.wmsapi.utils;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

public class EncryptPassword {
    public static String[] encryptPassword(String password) {
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();//生成盐值
        String cipherText = new Md5Hash(password, salt, 4).toString();
        String[] salt_cipherText = new String[]{salt, cipherText};
        return salt_cipherText;
    }

    public static String encodeCipherText(String password,String salt){
        String cipherText = new Md5Hash(password,salt,4).toString();
        return cipherText;
    }
}
