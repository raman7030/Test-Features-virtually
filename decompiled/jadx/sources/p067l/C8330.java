package p067l;

/* JADX INFO: renamed from: l.ۛ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89UN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8330 extends AbstractC14345 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public byte[] f22278;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f22279;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC14345, p067l.InterfaceC3835
    /* JADX INFO: renamed from: ֫ */
    public final void mo7517(InterfaceC9571 interfaceC9571) {
        if (mo30257()) {
            interfaceC9571.mo12487(m12504());
        }
        super.mo7517(interfaceC9571);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo12494() {
        return m12485() != -1073741802 && super.mo12494();
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 9) {
            throw new C19258("Structure size != 9");
        }
        this.f22279 = C3775.m7363(i + 2, bArr);
        int iM7363 = C3775.m7363(i + 4, bArr);
        int iM7364 = C3775.m7363(i + 6, bArr);
        int i2 = i + 8;
        int iM12492 = i2 - (m12492() + iM7363);
        this.f22278 = new byte[iM7364];
        System.arraycopy(bArr, m12492() + iM7363, this.f22278, 0, iM7364);
        return ((i2 + iM12492) + iM7364) - i;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean m19218() {
        return (this.f22279 & 3) != 0;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final int m19217() {
        return this.f22279;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final byte[] m19219() {
        return this.f22278;
    }
}
