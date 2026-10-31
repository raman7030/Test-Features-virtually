package l;

/* JADX INFO: renamed from: l.᩹ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9ZZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C22046 extends AbstractC11422 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f70666;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public long f70667;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    public C22046(InterfaceC1023 interfaceC1023, String str, int i, long j) {
        super(interfaceC1023, (byte) 9, str);
        this.f70666 = i;
        this.f70667 = j;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f70666, i, bArr);
        C1480.m5124(this.f70667 / 1000, i + 2, bArr);
        return (i + 16) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m28197(this.f34156, i2, bArr)) - i;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSetInformation[");
        sb.append(super.toString());
        sb.append(",filename=");
        sb.append(this.f34156);
        sb.append(",fileAttributes=");
        sb.append(this.f70666);
        sb.append(",lastWriteTime=");
        return new String(C15942.m37718(sb, this.f70667, "]"));
    }
}
