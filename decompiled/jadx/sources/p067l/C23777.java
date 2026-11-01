package p067l;

/* JADX INFO: renamed from: l.᩹᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C1TK */
/* JADX INFO: loaded from: classes.dex */
public final class C23777 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ֫ */
    public int f75620;

    public C23777(int i) {
        this.f75620 = i + 8;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4 + 3] & 255) == 235) {
                int i5 = i4 + 2;
                int i6 = i4 + 1;
                int i7 = (((((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8)) | (bArr[i4] & 255)) << 2) - ((this.f75620 + i4) - i);
                bArr[i5] = (byte) (i7 >>> 18);
                bArr[i6] = (byte) (i7 >>> 10);
                bArr[i4] = (byte) (i7 >>> 2);
            }
            i4 += 4;
        }
        int i8 = i4 - i;
        this.f75620 += i8;
        return i8;
    }
}
