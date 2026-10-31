package l;

/* JADX INFO: renamed from: l.ۨۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11463 extends AbstractC11422 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public long f34236;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C11463(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final long m28269() {
        return this.f34236;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f34236 = ((long) C1480.m5121(i, bArr)) & 65535;
        return 8;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C15942.m37718(sb, this.f34236, "]"));
    }
}
