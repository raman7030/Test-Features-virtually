package p067l;

/* JADX INFO: renamed from: l.ܽ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18460 {

    /* JADX INFO: renamed from: ۧ */
    public static final C13097 f55182 = new C13097();

    /* JADX INFO: renamed from: ֫ */
    public final int[] f55183 = new int[261];

    public C18460() {
        m42015();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42015() {
        C13097 c13097 = f55182;
        c13097.m29963();
        System.arraycopy(c13097.f36814, 0, this.f55183, 0, 261);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m42016(int i, String str) {
        int i2;
        int i3 = 0;
        try {
            int i4 = 1;
            if (str.charAt(0) != '#') {
                if (str.startsWith("rgb:")) {
                    i2 = 1;
                    i4 = 4;
                } else {
                    i3 = Integer.parseInt(str);
                }
                if (i3 != 0) {
                    this.f55183[i] = i3;
                }
            }
            i2 = 0;
            int length = (str.length() - i4) - (i2 * 2);
            if (length % 3 == 0) {
                int i5 = length / 3;
                double dPow = 255.0d / (Math.pow(2.0d, i5 * 4) - 1.0d);
                String strSubstring = str.substring(i4, i4 + i5);
                int i6 = i2 + i5;
                int i7 = i4 + i6;
                String strSubstring2 = str.substring(i7, i7 + i5);
                int i8 = i7 + i6;
                String strSubstring3 = str.substring(i8, i5 + i8);
                i3 = (-16777216) | (((int) (((double) Integer.parseInt(strSubstring, 16)) * dPow)) << 16) | (((int) (((double) Integer.parseInt(strSubstring2, 16)) * dPow)) << 8) | ((int) (((double) Integer.parseInt(strSubstring3, 16)) * dPow));
            }
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
        }
        if (i3 != 0) {
            this.f55183[i] = i3;
        }
    }
}
