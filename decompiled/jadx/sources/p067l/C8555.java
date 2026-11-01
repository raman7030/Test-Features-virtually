package p067l;

/* JADX INFO: renamed from: l.ۜۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8555 implements InterfaceC21967 {

    /* JADX INFO: renamed from: ۧ */
    public static int[] f22978 = new int[256];

    /* JADX INFO: renamed from: ֫ */
    public int f22979 = 0;

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
            f22978[i] = i3;
        }
    }

    @Override // p067l.InterfaceC21967
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = ~this.f22979;
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i4 = i + 1;
                i3 = (i3 >>> 8) ^ f22978[(bArr[i] ^ i3) & 255];
                i = i4;
            } else {
                this.f22979 = ~i3;
                return;
            }
        }
    }

    @Override // p067l.InterfaceC21967
    public final void reset() {
        this.f22979 = 0;
    }

    @Override // p067l.InterfaceC21967
    /* JADX INFO: renamed from: ֫ */
    public final void mo19958(long j) {
        this.f22979 = (int) (j & 4294967295L);
    }

    @Override // p067l.InterfaceC21967
    public final long getValue() {
        return ((long) this.f22979) & 4294967295L;
    }
}
