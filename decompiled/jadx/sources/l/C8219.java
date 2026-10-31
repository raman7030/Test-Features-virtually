package l;

/* JADX INFO: renamed from: l.۠ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8219 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f25322;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char[] f25323;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f25324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f25325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5397 f25326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f25327;

    public C8219(C5397 c5397, int i, int i2) {
        this.f25326 = c5397;
        this.f25322 = i;
        this.f25324 = i2;
        this.f25325 = new int[c5397.f16802.length + 1];
        for (int i3 = 0; i3 < c5397.f16805; i3++) {
            if (i3 < i || i3 >= i2) {
                int i4 = i3 + 1;
                int iM15403 = c5397.m15403(i3) - c5397.m15405(i3);
                int[] iArr = this.f25325;
                iArr[i3] = iArr[i3] + iM15403;
                iArr[i4] = iArr[i4] - iM15403;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21774() {
        int iM15403;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C5397 c5397 = this.f25326;
            int i4 = c5397.f16805;
            int[] iArr = this.f25325;
            if (i >= i4) {
                iArr[i4] = i2;
                if (i2 == 0) {
                    return;
                }
                this.f25323 = new char[i2];
                this.f25327 = (int[]) iArr.clone();
                for (int i5 = 0; i5 < c5397.f16805; i5++) {
                    if ((i5 < this.f25322 || i5 >= this.f25324) && (iM15403 = c5397.m15403(i5) - c5397.m15405(i5)) != 0) {
                        System.arraycopy(c5397.f16803, c5397.m15405(i5), this.f25323, iArr[i5], iM15403);
                    }
                }
                return;
            }
            i3 += iArr[i];
            iArr[i] = i2;
            long j = ((long) i2) + ((long) i3);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
            i++;
        }
    }
}
