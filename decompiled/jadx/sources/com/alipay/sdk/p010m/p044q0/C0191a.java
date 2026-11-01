package com.alipay.sdk.p010m.p044q0;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: com.alipay.sdk.m.q0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0191a {
    /* JADX INFO: renamed from: a */
    public static String m922a(String str) {
        byte[] bArrM926a;
        try {
            bArrM926a = m926a(m925a(), str.getBytes());
        } catch (Exception unused) {
            bArrM926a = null;
        }
        if (bArrM926a != null) {
            return m923a(bArrM926a);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m929b(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(m927b()));
        return cipher.doFinal(bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static String m930c(String str) {
        try {
            return new String(m929b(m925a(), m928b(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m928b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m925a() {
        return C0195e.m945a(new byte[]{PublicSuffixDatabase.EXCEPTION_MARKER, 83, -50, -89, -84, -114, UTF8.S_P4A, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m927b() {
        try {
            byte[] bArrM931a = C0192b.m931a("IUQSvE6r1TfFPdPEjfklLw==".getBytes(C0233a.f1077D), 2);
            if (bArrM931a != null) {
                return C0195e.m945a(bArrM931a);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m926a(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(m927b()));
        return cipher.doFinal(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public static String m923a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            m924a(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m924a(StringBuffer stringBuffer, byte b) {
        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
    }
}
