package p067l;

/* JADX INFO: renamed from: l.֫ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3907 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f8478;

    /* JADX INFO: renamed from: ܿ */
    public boolean f8479;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f8480;

    /* JADX INFO: renamed from: ۜ */
    public final C11157 f8475 = new C11157(0);

    /* JADX INFO: renamed from: ۧ */
    public long f8476 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ */
    public long f8477 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫ */
    public long f8474 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻ */
    public final C19203 f8481 = new C19203();

    /* JADX INFO: renamed from: ܽ */
    public final boolean m7730() {
        return this.f8478;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11157 m7729() {
        return this.f8475;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7727(InterfaceC10375 interfaceC10375, C24812 c24812) {
        boolean z = this.f8479;
        C19203 c19203 = this.f8481;
        long j = -9223372036854775807L;
        if (!z) {
            long length = interfaceC10375.getLength();
            int iMin = (int) Math.min(20000L, length);
            long j2 = length - ((long) iMin);
            if (interfaceC10375.getPosition() != j2) {
                c24812.f79276 = j2;
                return 1;
            }
            c19203.m43727(iMin);
            interfaceC10375.mo24036();
            interfaceC10375.mo24031(0, iMin, c19203.m43728());
            int iM43731 = c19203.m43731();
            for (int iM43729 = c19203.m43729() - 4; iM43729 >= iM43731; iM43729--) {
                if (m7724(iM43729, c19203.m43728()) == 442) {
                    c19203.m43730(iM43729 + 4);
                    long jM7725 = m7725(c19203);
                    if (jM7725 != -9223372036854775807L) {
                        j = jM7725;
                        break;
                    }
                }
            }
            this.f8477 = j;
            this.f8479 = true;
            return 0;
        }
        if (this.f8477 == -9223372036854775807L) {
            m7726(interfaceC10375);
            return 0;
        }
        if (this.f8480) {
            long j3 = this.f8476;
            if (j3 == -9223372036854775807L) {
                m7726(interfaceC10375);
                return 0;
            }
            C11157 c11157 = this.f8475;
            this.f8474 = c11157.m25737(this.f8477) - c11157.m25735(j3);
            m7726(interfaceC10375);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, interfaceC10375.getLength());
        long j4 = 0;
        if (interfaceC10375.getPosition() != j4) {
            c24812.f79276 = j4;
            return 1;
        }
        c19203.m43727(iMin2);
        interfaceC10375.mo24036();
        interfaceC10375.mo24031(0, iMin2, c19203.m43728());
        int iM437210 = c19203.m43729();
        for (int iM43732 = c19203.m43731(); iM43732 < iM437210 - 3; iM43732++) {
            if (m7724(iM43732, c19203.m43728()) == 442) {
                c19203.m43730(iM43732 + 4);
                long jM7726 = m7725(c19203);
                if (jM7726 != -9223372036854775807L) {
                    j = jM7726;
                    break;
                }
            }
        }
        this.f8476 = j;
        this.f8480 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m7728() {
        return this.f8474;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m7725(C19203 c19203) {
        int iM43731 = c19203.m43731();
        if (c19203.m43703() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c19203.m43707(0, 9, bArr);
        c19203.m43730(iM43731);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7726(InterfaceC10375 interfaceC10375) {
        byte[] bArr = C5792.f14227;
        C19203 c19203 = this.f8481;
        c19203.getClass();
        c19203.m43708(bArr.length, bArr);
        this.f8478 = true;
        interfaceC10375.mo24036();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7724(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
