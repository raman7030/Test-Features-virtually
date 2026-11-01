package p067l;

/* JADX INFO: renamed from: l.֫ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4210 {

    /* JADX INFO: renamed from: ֫ */
    public int f9264;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f9265 = new int[10];

    /* JADX INFO: renamed from: ֫ */
    public final void m8548(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f9265;
            if (i >= iArr.length) {
                return;
            }
            this.f9264 = (1 << i) | this.f9264;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m8553(int i) {
        return ((1 << i) & this.f9264) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8547(int i) {
        return this.f9265[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m8554() {
        return Integer.bitCount(this.f9264);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8546() {
        if ((this.f9264 & 2) != 0) {
            return this.f9265[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8552() {
        if ((this.f9264 & 16) != 0) {
            return this.f9265[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m8551(int i) {
        return (this.f9264 & 32) != 0 ? this.f9265[5] : i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m8550() {
        if ((this.f9264 & 128) != 0) {
            return this.f9265[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8549(C4210 c4210) {
        for (int i = 0; i < 10; i++) {
            if (c4210.m8553(i)) {
                m8548(i, c4210.f9265[i]);
            }
        }
    }
}
