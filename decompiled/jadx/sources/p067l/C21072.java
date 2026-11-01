package p067l;

/* JADX INFO: renamed from: l.᩵᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C21072 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ᩸ */
    public int f66206;

    /* JADX INFO: renamed from: ܽ */
    public final int m47552() {
        return this.f66206;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        C3775.m7365(i, bArr);
        this.f66206 = C3775.m7365(i + 4, bArr);
        C3775.m7365(i + 8, bArr);
        C3775.m7365(i + 12, bArr);
        int i3 = i + 16;
        int i4 = i2 - 16;
        byte[] bArr2 = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
        }
        return i3 - i;
    }
}
