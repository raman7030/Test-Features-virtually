package l;

/* JADX INFO: renamed from: l.֫ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C1584 extends AbstractC11422 implements InterfaceC10716 {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f5608 = C11321.m27961(C1584.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f5609;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    public C1584(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023, (byte) 4);
        this.f5609 = i;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 mo5429() {
        return (C7188) super.mo5429();
    }

    @Override // l.AbstractC11422, l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC11422 mo5429() {
        return (C7188) super.mo5429();
    }

    @Override // l.AbstractC11422, l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13495 mo5429() {
        return (C7188) super.mo5429();
    }

    @Override // l.InterfaceC10716
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 mo5430(InterfaceC18663 interfaceC18663) {
        C7188 c7188 = new C7188(interfaceC18663.mo27540());
        mo28204((InterfaceC1543) c7188);
        return c7188;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f5609, i, bArr);
        int i2 = i + 2;
        if (this.f34140 != null) {
            int i3 = C5777.f17758;
            C1480.m5124(-1L, i2, bArr);
            return 6;
        }
        f5608.mo7101("SmbComClose without a digest");
        return 6;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComClose[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C3200.m9831(this.f5609, ",lastWriteTime=0]", sb));
    }
}
