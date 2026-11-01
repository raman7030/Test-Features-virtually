package p067l;

/* JADX INFO: renamed from: l.᩻᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25094 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public byte f80060;

    /* JADX INFO: renamed from: ۡ֫ */
    public byte f80061;

    /* JADX INFO: renamed from: ۢ֫ */
    public byte[] f80062;

    /* JADX INFO: renamed from: ܺ֫ */
    public InterfaceC23282 f80063;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C25094(InterfaceC3341 interfaceC3341) {
        this(interfaceC3341, C12334.f34417);
    }

    public C25094(InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341, 17);
        this.f80062 = bArr;
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f80062 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55072(InterfaceC23282 interfaceC23282) {
        this.f80060 = (byte) 1;
        this.f80061 = interfaceC23282.mo11079();
        this.f80063 = interfaceC23282;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C9001(interfaceC20106.mo29602());
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return AbstractC5628.m12467(this.f80063.size() + 96);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(33L, i, bArr);
        bArr[i + 2] = this.f80060;
        bArr[i + 3] = this.f80061;
        C3775.m7366(0, i + 12, bArr);
        System.arraycopy(this.f80062, 0, bArr, i + 16, 16);
        int i2 = i + 32;
        C3775.m7364(i2 - m12492(), i + 8, bArr);
        int iMo11078 = this.f80063.mo11078(i2, bArr);
        C3775.m7366(iMo11078, i + 4, bArr);
        return (i2 + iMo11078) - i;
    }
}
