package p067l;

/* JADX INFO: renamed from: l.᩶᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B1TN */
/* JADX INFO: loaded from: classes5.dex */
public final class C21766 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ֫ */
    public int f68522;

    public C21766(int i) {
        this.f68522 = i + 4;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
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
                    int i9 = ((i7 | (bArr[i8] & 255)) << 1) - ((this.f68522 + i4) - i);
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
        this.f68522 += i10;
        return i10;
    }
}
