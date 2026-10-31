package l;

/* JADX INFO: renamed from: l.ᩳ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89DN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18358 extends C16614 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f57048;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57049;

    @Override // l.C16614
    /* JADX INFO: renamed from: ۧ */
    public final void mo7050(C0097 c0097) throws C13146 {
        c0097.m26096(2);
        this.f57048 = c0097.m26095() & 255;
        c0097.m26096(1);
        this.f57049 = c0097.m26099();
        c0097.m26099();
        c0097.m26096(4);
        c0097.m26097(this.f57048);
        c0097.m26096(this.f57049);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42789() {
        return this.f57049;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42787(int i, byte[] bArr, int i2, int i3) {
        m42785(i, i3, this.f57049);
        m42785(i2, i3, bArr.length);
        System.arraycopy(this.f2935.m26081(), this.f57048 + i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m42786(int i) {
        m42785(i, 1, this.f57049);
        return this.f2935.m26081()[this.f57048 + i];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m42788() {
        int i = this.f57049;
        byte[] bArr = new byte[i];
        m42787(0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42785(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i > i3 - i2) {
            StringBuilder sbM46682 = C20361.m46682("offset=", i, ", length=", ", size=", i2);
            sbM46682.append(i3);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
    }
}
