package p067l;

/* JADX INFO: renamed from: l.᩶᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2GW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21836 extends AbstractC8108 {

    /* JADX INFO: renamed from: ۧ */
    public static final char[] f68710 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ֫ */
    public final boolean[] f68711;

    public C21836() {
        if ("-._~!$'()*,;&=@:+/".matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        char[] charArray = "-._~!$'()*,;&=@:+/".concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789").toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.f68711 = zArr;
    }

    @Override // p067l.AbstractC8108
    /* JADX INFO: renamed from: ֫ */
    public final char[] mo18804(int i) {
        boolean[] zArr = this.f68711;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        char[] cArr = f68710;
        if (i <= 127) {
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            return new char[]{'%', cArr[(i >>> 10) | 12], cArr[(i >>> 6) & 15], '%', cArr[((i >>> 4) & 3) | 8], cArr[i & 15]};
        }
        if (i <= 65535) {
            return new char[]{'%', 'E', cArr[i >>> 12], '%', cArr[((i >>> 10) & 3) | 8], cArr[(i >>> 6) & 15], '%', cArr[((i >>> 4) & 3) | 8], cArr[i & 15]};
        }
        if (i <= 1114111) {
            return new char[]{'%', 'F', cArr[(i >>> 18) & 7], '%', cArr[((i >>> 16) & 3) | 8], cArr[(i >>> 12) & 15], '%', cArr[((i >>> 10) & 3) | 8], cArr[(i >>> 6) & 15], '%', cArr[((i >>> 4) & 3) | 8], cArr[i & 15]};
        }
        throw new IllegalArgumentException(C20778.m46922(i, "Invalid unicode character value "));
    }

    @Override // p067l.AbstractC8108
    /* JADX INFO: renamed from: ֫ */
    public final int mo18802(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            boolean[] zArr = this.f68711;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m49258(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            boolean[] zArr = this.f68711;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return m18803(i, str);
            }
        }
        return str;
    }
}
