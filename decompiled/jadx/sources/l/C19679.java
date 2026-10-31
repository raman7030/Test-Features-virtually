package l;

/* JADX INFO: renamed from: l.᩵᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C19679 implements InterfaceC8079 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63585;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m45255() {
        return this.f63585;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        C1480.m5123(i, bArr);
        this.f63585 = C1480.m5123(i + 4, bArr);
        C1480.m5123(i + 8, bArr);
        C1480.m5123(i + 12, bArr);
        int i3 = i + 16;
        int i4 = i2 - 16;
        byte[] bArr2 = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
        }
        return i3 - i;
    }
}
