package l;

/* JADX INFO: renamed from: l.ᩳۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17812 extends AbstractC11422 {
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

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C17812(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 1, str);
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
        StringBuilder sb = new StringBuilder("SmbComDeleteDirectory[");
        sb.append(super.toString());
        sb.append(",directoryName=");
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
