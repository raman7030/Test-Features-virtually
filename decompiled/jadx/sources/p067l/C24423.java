package p067l;

/* JADX INFO: renamed from: l.᩺᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TA0G */
/* JADX INFO: loaded from: classes2.dex */
public final class C24423 extends AbstractC14345 implements InterfaceC11212 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f77330;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f77331;

    @Override // p067l.InterfaceC11212
    /* JADX INFO: renamed from: ۡ */
    public final String mo11186() {
        return null;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC14345, p067l.InterfaceC3835
    /* JADX INFO: renamed from: ֫ */
    public final void mo7517(InterfaceC9571 interfaceC9571) {
        if (mo30257()) {
            ((AbstractC5628) interfaceC9571).m12484(m12483());
        }
        super.mo7517(interfaceC9571);
    }

    @Override // p067l.InterfaceC11212
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11185() {
        return m12483() != -1;
    }

    @Override // p067l.InterfaceC11212
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11187() {
        return (this.f77331 & 3) != 0 || (this.f77330 & 8) == 8;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 16) {
            throw new C19258("Structure size is not 16");
        }
        byte b = bArr[i + 2];
        this.f77331 = C3775.m7365(i + 4, bArr);
        this.f77330 = C3775.m7365(i + 8, bArr);
        C3775.m7365(i + 12, bArr);
        return (i + 16) - i;
    }
}
