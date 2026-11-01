package p067l;

/* JADX INFO: renamed from: l.ۡۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29EQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10783 implements InterfaceC7155 {

    /* JADX INFO: renamed from: ᩷ */
    public static final byte[] f29880 = {-3, 83, 77, 66};

    /* JADX INFO: renamed from: ֫ */
    public int f29881;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f29882;

    /* JADX INFO: renamed from: ۧ */
    public int f29883;

    /* JADX INFO: renamed from: ܳ */
    public int f29884;

    /* JADX INFO: renamed from: ܽ */
    public int f29885;

    /* JADX INFO: renamed from: ܿ */
    public int f29886;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f29887;

    /* JADX INFO: renamed from: ᩻ */
    public long f29888;

    public C10783(long j, int i, byte[] bArr) {
        this.f29882 = new byte[16];
        this.f29887 = bArr;
        this.f29886 = i;
        this.f29884 = 0;
        this.f29881 = 1;
        this.f29888 = j;
    }

    public C10783() {
        this.f29882 = new byte[16];
        this.f29887 = new byte[16];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24845(C2460 c2460) {
        this.f29883 = c2460.m28108();
        c2460.m28102(4, f29880);
        byte[] bArr = this.f29882;
        c2460.m28102(bArr.length, bArr);
        byte[] bArr2 = this.f29887;
        c2460.m28102(bArr2.length, bArr2);
        c2460.m3478(16 - this.f29887.length);
        c2460.m28113(this.f29886);
        c2460.m28111(this.f29884);
        c2460.m28111(this.f29881);
        c2460.m28103(this.f29888);
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ֫ */
    public final void mo16457(C2460 c2460) throws C14862 {
        this.f29883 = c2460.m28108();
        C24864.m54596(c2460, f29880);
        if (this.f29882.length != 16) {
            this.f29882 = new byte[16];
        }
        byte[] bArr = this.f29882;
        c2460.m28112(bArr.length, bArr);
        if (this.f29887.length != 16) {
            this.f29887 = new byte[16];
        }
        byte[] bArr2 = this.f29887;
        c2460.m28112(bArr2.length, bArr2);
        this.f29886 = c2460.m28124();
        this.f29884 = c2460.m28125();
        this.f29881 = c2460.m28125();
        this.f29888 = c2460.m28115();
        this.f29885 = c2460.m28116();
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ֫ */
    public final int mo16456() {
        return this.f29883;
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ۧ */
    public final int mo16458() {
        return this.f29885;
    }

    /* JADX INFO: renamed from: ۜ */
    public final byte[] m24844() {
        return this.f29882;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m24849() {
        return this.f29887;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m24848() {
        return this.f29886;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m24846() {
        return this.f29884;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24847() {
        return this.f29881;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final long m24850() {
        return this.f29888;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24843(byte[] bArr) {
        return C24864.m54598(bArr, f29880);
    }
}
