package l;

/* JADX INFO: renamed from: l.֫ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1938 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6485;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f6486 = new int[10];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6391(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f6486;
            if (i >= iArr.length) {
                return;
            }
            this.f6485 = (1 << i) | this.f6485;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m6396(int i) {
        return ((1 << i) & this.f6485) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6390(int i) {
        return this.f6486[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m6397() {
        return Integer.bitCount(this.f6485);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6389() {
        if ((this.f6485 & 2) != 0) {
            return this.f6486[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6395() {
        if ((this.f6485 & 16) != 0) {
            return this.f6486[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6394(int i) {
        return (this.f6485 & 32) != 0 ? this.f6486[5] : i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6393() {
        if ((this.f6485 & 128) != 0) {
            return this.f6486[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6392(C1938 c1938) {
        for (int i = 0; i < 10; i++) {
            if (c1938.m6396(i)) {
                m6391(i, c1938.f6486[i]);
            }
        }
    }
}
