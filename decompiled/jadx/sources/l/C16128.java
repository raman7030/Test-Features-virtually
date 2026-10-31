package l;

/* JADX INFO: renamed from: l.ܺᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16128 extends AbstractC18246 {
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

    public C16128(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 37, (byte) 83);
        this.f56701 = str;
        this.f56700 = -1;
        this.f56702 = 0;
        this.f56716 = 0;
        this.f56712 = 2;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        bArr[i] = m42528();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransWaitNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C9045.m23341(sb, this.f56701, "]"));
    }
}
