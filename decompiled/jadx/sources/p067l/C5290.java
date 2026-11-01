package p067l;

/* JADX INFO: renamed from: l.ۗۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91HA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5290 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f12447;

    /* JADX INFO: renamed from: ۧ */
    public final C2582 f12448 = new C2582();

    /* JADX INFO: renamed from: ᩳ */
    public final short m11444(int i) {
        byte[] bArr = this.f12447;
        return (short) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
    }

    public C5290(byte[] bArr) {
        this.f12447 = bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m11440(int i) {
        return this.f12447[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m11442(int i) {
        return C17548.m39928(i, this.f12447);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m11443(int i) {
        return this.f12447[i] & 255;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m11441(int i) {
        return C17548.m39944(i, this.f12447);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m11439(int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = C17548.m39928(i, this.f12447);
            i += 4;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11436(int i, byte[] bArr) {
        System.arraycopy(this.f12447, i, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11435(int i) {
        if (i < 0) {
            return -1;
        }
        byte[] bArr = this.f12447;
        if (bArr.length < i) {
            return -1;
        }
        return bArr.length - i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C7972 m11445(int i) {
        C7972 c7972 = (C7972) this.f12448.m3892();
        if (c7972 != null) {
            c7972.m18459(i);
            return c7972;
        }
        return new C7972(this, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11437(C7972 c7972) {
        this.f12448.m3890(c7972);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m11438() {
        return this.f12447;
    }
}
