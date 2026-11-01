package p067l;

/* JADX INFO: renamed from: l.֫ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3874 extends AbstractC13224 implements InterfaceC12553 {

    /* JADX INFO: renamed from: ۚ֫ */
    public static final InterfaceC4410 f8388 = C13128.m30022(C3874.class);

    /* JADX INFO: renamed from: ֡֫ */
    public int f8389;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    public C3874(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341, (byte) 4);
        this.f8389 = i;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3835 mo7658() {
        return (C9200) super.mo7658();
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13224 mo7658() {
        return (C9200) super.mo7658();
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15194 mo7658() {
        return (C9200) super.mo7658();
    }

    @Override // p067l.InterfaceC12553
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3835 mo7659(InterfaceC20106 interfaceC20106) {
        C9200 c9200 = new C9200(interfaceC20106.mo29602());
        mo30248((InterfaceC3835) c9200);
        return c9200;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f8389, i, bArr);
        int i2 = i + 2;
        if (this.f37136 != null) {
            int i3 = C7859.f20605;
            C3775.m7366(-1L, i2, bArr);
            return 6;
        }
        f8388.mo9196("SmbComClose without a digest");
        return 6;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComClose[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C5410.m11876(this.f8389, ",lastWriteTime=0]", sb));
    }
}
