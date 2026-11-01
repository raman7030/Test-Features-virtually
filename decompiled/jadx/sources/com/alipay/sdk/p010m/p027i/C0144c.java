package com.alipay.sdk.p010m.p027i;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: renamed from: com.alipay.sdk.m.i.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0144c {

    /* JADX INFO: renamed from: a */
    public static volatile SecureRandom f491a;

    /* JADX INFO: renamed from: b */
    public static final char[] f492b = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    public static byte[] m698a(byte b) {
        return new byte[]{b};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m699a(char c) {
        return new byte[]{(byte) (c & 255)};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m700a(char c, char c2) {
        return new byte[]{(byte) (c & 255), (byte) (c2 & 255)};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m701a(int i) {
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m702a(long j) {
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m703a(short s) {
        return new byte[]{(byte) s, (byte) (s >> 8)};
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m706b() {
        byte[] bArr = new byte[2];
        m697a().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m707c() {
        byte[] bArr = new byte[4];
        m697a().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static String m705b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f492b;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static SecureRandom m697a() {
        if (f491a != null) {
            return f491a;
        }
        synchronized (C0144c.class) {
            if (f491a == null) {
                f491a = new SecureRandom();
            }
        }
        return f491a;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m704a(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (byte[] bArr3 : bArr) {
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr3, length);
                length2 = bArr3.length;
            } else {
                System.arraycopy(bArr3, 0, bArrCopyOf, length2, bArr3.length);
                length2 += bArr3.length;
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: a */
    public static String m696a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }
}
