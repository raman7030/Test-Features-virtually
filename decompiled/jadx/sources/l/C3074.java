package l;

/* JADX INFO: renamed from: l.ۗۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91HA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3074 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f9644;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0225 f9645 = new C0225();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short m9402(int i) {
        byte[] bArr = this.f9644;
        return (short) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
    }

    public C3074(byte[] bArr) {
        this.f9644 = bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m9398(int i) {
        return this.f9644[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m9400(int i) {
        return C15972.m37744(i, this.f9644);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m9401(int i) {
        return this.f9644[i] & 255;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m9399(int i) {
        return C15972.m37760(i, this.f9644);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m9397(int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = C15972.m37744(i, this.f9644);
            i += 4;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9394(int i, byte[] bArr) {
        System.arraycopy(this.f9644, i, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9393(int i) {
        if (i < 0) {
            return -1;
        }
        byte[] bArr = this.f9644;
        if (bArr.length < i) {
            return -1;
        }
        return bArr.length - i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5896 m9403(int i) {
        C5896 c5896 = (C5896) this.f9645.m1479();
        if (c5896 != null) {
            c5896.m16533(i);
            return c5896;
        }
        return new C5896(this, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9395(C5896 c5896) {
        this.f9645.m1477(c5896);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m9396() {
        return this.f9644;
    }
}
