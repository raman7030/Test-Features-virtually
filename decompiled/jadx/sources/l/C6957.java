package l;

/* JADX INFO: renamed from: l.ۜᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6957 extends AbstractC18246 {

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f21447;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ */
    public final int mo2484(byte[] bArr) {
        return 0;
    }

    public C6957(InterfaceC1023 interfaceC1023, String str, int i) {
        super(interfaceC1023, (byte) 37, (byte) 35);
        this.f56701 = str;
        this.f21447 = i;
        this.f56700 = -1;
        this.f56702 = 6;
        this.f56716 = 1;
        this.f56712 = 2;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        bArr[i] = m42528();
        bArr[i + 1] = 0;
        C1480.m5122(this.f21447, i + 2, bArr);
        return 4;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransPeekNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C9045.m23341(sb, this.f56701, "]"));
    }
}
