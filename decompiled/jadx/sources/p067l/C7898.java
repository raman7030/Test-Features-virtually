package p067l;

/* JADX INFO: renamed from: l.ۛۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA0W */
/* JADX INFO: loaded from: classes3.dex */
public final class C7898 extends AbstractC11883 {

    /* JADX INFO: renamed from: ܶ֫ */
    public long f20724;

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

    public C7898(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final long m18243() {
        return this.f20724;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f20724 = ((long) C3775.m7363(i, bArr)) & 65535;
        return 8;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndXResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C17520.m39893(sb, this.f20724, "]"));
    }
}
