package l;

/* JADX INFO: renamed from: l.۫֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12085 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f36140 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29467(int i, int i2) {
        char[] cArr = new char[i2];
        for (int i3 = i2; i3 > 0; i3--) {
            int i4 = i3 - 1;
            if (i4 < i2) {
                cArr[i4] = f36140[i & 15];
            }
            if (i != 0) {
                i >>>= 4;
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29468(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            byte b = bArr[i + i4];
            char[] cArr2 = f36140;
            cArr[i3] = cArr2[(b >> 4) & 15];
            i3 += 2;
            cArr[i5] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
