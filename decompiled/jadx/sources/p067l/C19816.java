package p067l;

/* JADX INFO: renamed from: l.ᩳ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89DN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19816 extends C18158 {

    /* JADX INFO: renamed from: ܳ */
    public int f60268;

    /* JADX INFO: renamed from: ܿ */
    public int f60269;

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ۧ */
    public final void mo9145(C2460 c2460) throws C14862 {
        c2460.m28121(2);
        this.f60268 = c2460.m28120() & 255;
        c2460.m28121(1);
        this.f60269 = c2460.m28124();
        c2460.m28124();
        c2460.m28121(4);
        c2460.m28122(this.f60268);
        c2460.m28121(this.f60269);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m45061() {
        return this.f60269;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45059(int i, byte[] bArr, int i2, int i3) {
        m45057(i, i3, this.f60269);
        m45057(i2, i3, bArr.length);
        System.arraycopy(this.f5706.m28106(), this.f60268 + i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m45058(int i) {
        m45057(i, 1, this.f60269);
        return this.f5706.m28106()[this.f60268 + i];
    }

    /* JADX INFO: renamed from: ۜ */
    public final byte[] m45060() {
        int i = this.f60269;
        byte[] bArr = new byte[i];
        m45059(0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45057(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i > i3 - i2) {
            StringBuilder sbM49005 = C21720.m49005("offset=", i, ", length=", ", size=", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
    }
}
