package p067l;

/* JADX INFO: renamed from: l.᩹ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9ZZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C23321 extends AbstractC13224 {

    /* JADX INFO: renamed from: ֡֫ */
    public int f73383;

    /* JADX INFO: renamed from: ۚ֫ */
    public long f73384;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    public C23321(InterfaceC3341 interfaceC3341, String str, int i, long j) {
        super(interfaceC3341, (byte) 9, str);
        this.f73383 = i;
        this.f73384 = j;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f73383, i, bArr);
        C3775.m7366(this.f73384 / 1000, i + 2, bArr);
        return (i + 16) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m30241(this.f37152, i2, bArr)) - i;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSetInformation[");
        sb.append(super.toString());
        sb.append(",filename=");
        sb.append(this.f37152);
        sb.append(",fileAttributes=");
        sb.append(this.f73383);
        sb.append(",lastWriteTime=");
        return new String(C17520.m39893(sb, this.f73384, "]"));
    }
}
