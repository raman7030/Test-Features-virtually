package p067l;

/* JADX INFO: renamed from: l.ۨۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13263 extends AbstractC13224 {

    /* JADX INFO: renamed from: ֡֫ */
    public long f37232;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public C13263(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final long m30313() {
        return this.f37232;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f37232 = ((long) C3775.m7363(i, bArr)) & 65535;
        return 8;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C17520.m39893(sb, this.f37232, "]"));
    }
}
