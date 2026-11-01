package p067l;

/* JADX INFO: renamed from: l.֫ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8LK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3828 {

    /* JADX INFO: renamed from: ᩳ */
    public static final long[] f8202 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: ֫ */
    public int f8203;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f8204 = new byte[8];

    /* JADX INFO: renamed from: ܽ */
    public int f8205;

    /* JADX INFO: renamed from: ۧ */
    public final void m7481() {
        this.f8205 = 0;
        this.f8203 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m7480(InterfaceC10375 interfaceC10375, boolean z, boolean z2, int i) {
        int i2 = this.f8205;
        byte[] bArr = this.f8204;
        if (i2 == 0) {
            if (!interfaceC10375.mo24033(z, 0, 1, bArr)) {
                return -1L;
            }
            int iM7477 = m7477(bArr[0] & 255);
            this.f8203 = iM7477;
            if (iM7477 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f8205 = 1;
        }
        int i3 = this.f8203;
        if (i3 > i) {
            this.f8205 = 0;
            return -2L;
        }
        if (i3 != 1) {
            interfaceC10375.readFully(bArr, 1, i3 - 1);
        }
        this.f8205 = 0;
        return m7478(bArr, this.f8203, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7479() {
        return this.f8203;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7477(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j = f8202[i2] & ((long) i);
            i2++;
            if (j != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m7478(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f8202[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
