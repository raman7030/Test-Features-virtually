package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۨ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BA24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13695 extends AbstractC15015 {

    /* JADX INFO: renamed from: ۢ֫ */
    public String f38643;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C13695(String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, 3);
        this.f38643 = str;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C24423(interfaceC20106.mo29602());
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12477(AbstractC5628 abstractC5628) {
        abstractC5628.m12484(-1);
        return super.mo12477(abstractC5628);
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return AbstractC5628.m12467((this.f38643.length() * 2) + 72);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(9L, i, bArr);
        C3775.m7364(0, i + 2, bArr);
        byte[] bytes = this.f38643.getBytes(StandardCharsets.UTF_16LE);
        C3775.m7364(bytes.length, i + 6, bArr);
        int i2 = i + 8;
        C3775.m7364(i2 - m12492(), i + 4, bArr);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }
}
