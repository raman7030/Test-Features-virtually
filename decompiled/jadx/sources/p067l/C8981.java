package p067l;

/* JADX INFO: renamed from: l.ۜᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8981 extends AbstractC19710 {

    /* JADX INFO: renamed from: ܿۧ */
    public int f24329;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        return 0;
    }

    public C8981(InterfaceC3341 interfaceC3341, String str, int i) {
        super(interfaceC3341, (byte) 37, (byte) 35);
        this.f59919 = str;
        this.f24329 = i;
        this.f59918 = -1;
        this.f59920 = 6;
        this.f59934 = 1;
        this.f59930 = 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        C3775.m7364(this.f24329, i + 2, bArr);
        return 4;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransPeekNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C10965.m25286(sb, this.f59919, "]"));
    }
}
