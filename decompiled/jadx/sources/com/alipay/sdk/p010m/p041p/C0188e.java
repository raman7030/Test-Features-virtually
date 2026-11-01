package com.alipay.sdk.p010m.p041p;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.alipay.sdk.m.p.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0188e {

    /* JADX INFO: renamed from: a */
    public static String f884a = "DESede/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: a */
    public static byte[] m911a(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(f884a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(C0186c.m907a(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m913b(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(f884a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(C0186c.m907a(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m910a(String str, String str2, String str3) {
        try {
            return new String(m911a(str, C0184a.m902a(str2), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m912b(String str, String str2, String str3) {
        try {
            return C0184a.m900a(m913b(str, str2.getBytes(), str3));
        } catch (Exception unused) {
            return null;
        }
    }
}
