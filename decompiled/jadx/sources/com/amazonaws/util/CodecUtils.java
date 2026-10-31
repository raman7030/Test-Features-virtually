package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public enum CodecUtils {
    ;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m763(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char c = charArray[i2];
            if (c != '\r' && c != '\n' && c != ' ') {
                if (c > 127) {
                    throw new IllegalArgumentException("Invalid character found at position " + i2 + " for " + str);
                }
                bArr[i] = (byte) c;
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m765(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c > 127) {
                throw new IllegalArgumentException("Invalid character found at position " + i + " for " + str);
            }
            bArr[i] = (byte) c;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m764(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            cArr[i2] = (char) bArr[i];
            i++;
            i2++;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m766(int i, int i2) {
        if ((i & i2) != 0) {
            throw new IllegalArgumentException("Invalid last non-pad character detected");
        }
    }
}
