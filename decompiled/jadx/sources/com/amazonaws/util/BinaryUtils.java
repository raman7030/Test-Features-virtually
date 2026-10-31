package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public class BinaryUtils {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m750(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b);
            if (hexString.length() == 1) {
                sb.append("0");
            } else if (hexString.length() == 8) {
                hexString = hexString.substring(6);
            }
            sb.append(hexString);
        }
        return StringUtils.m789(sb.toString());
    }
}
