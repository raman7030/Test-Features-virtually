package p067l;

/* JADX INFO: renamed from: l.ۘ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8DO */
/* JADX INFO: loaded from: classes2.dex */
public final class C6384 {

    /* JADX INFO: renamed from: ֫ */
    public int f16527;

    /* JADX INFO: renamed from: ۜ */
    public int f16528;

    /* JADX INFO: renamed from: ۧ */
    public int f16529;

    /* JADX INFO: renamed from: ܳ */
    public boolean f16530;

    /* JADX INFO: renamed from: ܽ */
    public long f16531;

    /* JADX INFO: renamed from: ܿ */
    public int f16532;

    /* JADX INFO: renamed from: ᩳ */
    public int f16533;

    /* JADX INFO: renamed from: ᩷ */
    public long f16534;

    /* JADX INFO: renamed from: ᩻ */
    public int f16535;

    /* JADX INFO: renamed from: ۢ */
    public static final int[] f16526 = {3, 3, 3, 3, 2, 2, 3};

    /* JADX INFO: renamed from: ۡ */
    public static final int[] f16525 = {1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ֫ */
    public final void m14600(byte[] bArr) {
        bArr[0] = (byte) this.f16535;
        bArr[1] = (byte) this.f16527;
        bArr[2] = (byte) this.f16529;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14602(int i, C19203 c19203) throws C10998 {
        m14603();
        int iM43731 = c19203.m43731();
        int i2 = 0;
        if (c19203.m43703() < 2) {
            return false;
        }
        this.f16531 = m14599(c19203);
        this.f16528 = c19203.m43731() - iM43731;
        int iM43702 = c19203.m43702();
        this.f16533 = 1;
        if (iM43702 == 240) {
            this.f16535 = iM43702;
            while (c19203.m43702() != 247) {
            }
        } else if (iM43702 == 255) {
            int iM43703 = c19203.m43702();
            int iM14599 = m14599(c19203);
            this.f16535 = iM43702;
            if (iM43703 == 47) {
                c19203.m43730(iM43731);
                m14603();
                return false;
            }
            if (iM43703 == 81) {
                long jM43737 = c19203.m43737();
                this.f16534 = jM43737;
                if (jM43737 <= 0) {
                    throw C10998.m25388("Tempo event data value must be a non-zero positive value. Parsed value: " + this.f16534);
                }
                c19203.m43724(iM14599 - 3);
            } else {
                c19203.m43724(iM14599);
            }
        } else {
            boolean z = iM43702 < 128;
            if (!z) {
                i = iM43702;
            } else {
                if (i == Integer.MIN_VALUE) {
                    throw C10998.m25387("Running status in the first event.", (Throwable) null);
                }
                this.f16527 = iM43702;
                this.f16533 = 2;
            }
            if (i >= 128 && i <= 255) {
                if (i >= 240) {
                    i2 = f16525[i & 15];
                } else {
                    i2 = f16526[(i >> 4) & 7];
                }
            }
            if (!z && i2 > this.f16533) {
                this.f16527 = c19203.m43702();
                this.f16533++;
            }
            if (i2 > this.f16533) {
                this.f16529 = c19203.m43702();
                this.f16533++;
            }
            this.f16535 = i;
        }
        this.f16532 = c19203.m43731() - iM43731;
        c19203.m43730(iM43731);
        this.f16530 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14601() {
        return this.f16530;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14603() {
        this.f16530 = false;
        this.f16528 = -1;
        this.f16535 = Integer.MIN_VALUE;
        this.f16527 = Integer.MIN_VALUE;
        this.f16529 = Integer.MIN_VALUE;
        this.f16531 = -1L;
        this.f16532 = -1;
        this.f16533 = -1;
        this.f16534 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m14599(C19203 c19203) {
        int i = 0;
        int i2 = 0;
        do {
            int iM43702 = c19203.m43702();
            i = (i << 7) | (iM43702 & 127);
            i2++;
            if ((iM43702 & 128) == 0) {
                break;
            }
        } while (i2 <= 4);
        return i;
    }
}
