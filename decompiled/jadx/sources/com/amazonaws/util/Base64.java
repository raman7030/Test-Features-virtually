package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public enum Base64 {
    ;


    /* JADX INFO: renamed from: ᩹ */
    public static final Base64Codec f1984 = new Base64Codec();

    /* JADX INFO: renamed from: ܽ */
    public static String m1909(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.m1929(f1984.m1913(bArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m1908(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : f1984.m1913(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m1906(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        int iM1928 = CodecUtils.m1928(str, bArr);
        f1984.getClass();
        return Base64Codec.m1911(iM1928, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m1907(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64Codec base64Codec = f1984;
        int length = bArr.length;
        base64Codec.getClass();
        return Base64Codec.m1911(length, bArr);
    }
}
