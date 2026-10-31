package l;

/* JADX INFO: renamed from: l.᩶᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B1TN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20410 implements InterfaceC10532 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f65846;

    public C20410(int i) {
        this.f65846 = i + 4;
    }

    @Override // l.InterfaceC10532
    /* JADX INFO: renamed from: ֫ */
    public final int mo10634(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = i4 + 1;
            byte b = bArr[i5];
            if ((b & 248) == 240) {
                int i6 = i4 + 3;
                byte b2 = bArr[i6];
                if ((b2 & 248) == 248) {
                    int i7 = ((b & 7) << 19) | ((bArr[i4] & 255) << 11) | ((b2 & 7) << 8);
                    int i8 = i4 + 2;
                    int i9 = ((i7 | (bArr[i8] & 255)) << 1) - ((this.f65846 + i4) - i);
                    bArr[i5] = (byte) (240 | ((i9 >>> 20) & 7));
                    bArr[i4] = (byte) (i9 >>> 12);
                    bArr[i6] = (byte) (((i9 >>> 9) & 7) | 248);
                    bArr[i8] = (byte) (i9 >>> 1);
                    i4 = i8;
                }
            }
            i4 += 2;
        }
        int i10 = i4 - i;
        this.f65846 += i10;
        return i10;
    }
}
