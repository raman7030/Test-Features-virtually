package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class Md5Utils {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m784(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 16384);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        byte[] bArrDigest = messageDigest.digest();
                        try {
                            bufferedInputStream.close();
                            return bArrDigest;
                        } catch (Exception e) {
                            LogFactory.m302(Md5Utils.class).mo294("Unable to close input stream of hash candidate: " + e);
                            return bArrDigest;
                        }
                    }
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Exception e3) {
                LogFactory.m302(Md5Utils.class).mo294("Unable to close input stream of hash candidate: " + e3);
            }
            throw th;
        }
    }
}
