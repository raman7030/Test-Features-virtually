package l;

/* JADX INFO: renamed from: l.ܽۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9U0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16400 extends AbstractC11422 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f50463;

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

    public C16400(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 6, str);
        this.f50463 = 6;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f50463, i, bArr);
        return 2;
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
        StringBuilder sb = new StringBuilder("SmbComDelete[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C19033.m43886(this.f50463, 4, ",fileName=", sb);
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
