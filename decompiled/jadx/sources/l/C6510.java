package l;

/* JADX INFO: renamed from: l.ۜۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6510 implements InterfaceC20622 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int[] f20100 = new int[256];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f20101 = 0;

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = 8;
            int i3 = i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    int i4 = i3 & 1;
                    i3 >>>= 1;
                    if (i4 != 0) {
                        i3 ^= -306674912;
                    }
                }
            }
            f20100[i] = i3;
        }
    }

    @Override // l.InterfaceC20622
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = ~this.f20101;
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i4 = i + 1;
                i3 = (i3 >>> 8) ^ f20100[(bArr[i] ^ i3) & 255];
                i = i4;
            } else {
                this.f20101 = ~i3;
                return;
            }
        }
    }

    @Override // l.InterfaceC20622
    public final void reset() {
        this.f20101 = 0;
    }

    @Override // l.InterfaceC20622
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18009(long j) {
        this.f20101 = (int) (j & 4294967295L);
    }

    @Override // l.InterfaceC20622
    public final long getValue() {
        return ((long) this.f20101) & 4294967295L;
    }
}
