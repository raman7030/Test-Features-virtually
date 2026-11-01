package p067l;

/* JADX INFO: renamed from: l.᩷ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22013 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f69252;

    /* JADX INFO: renamed from: ܿ */
    public boolean f69253;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f69254;

    /* JADX INFO: renamed from: ۜ */
    public final C11157 f69249 = new C11157(0);

    /* JADX INFO: renamed from: ۧ */
    public long f69250 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ */
    public long f69251 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫ */
    public long f69248 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻ */
    public final C19203 f69255 = new C19203();

    /* JADX INFO: renamed from: ܽ */
    public final boolean m49617() {
        return this.f69252;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49614(InterfaceC10375 interfaceC10375, C24812 c24812, int i) {
        if (i <= 0) {
            m49613(interfaceC10375);
            return 0;
        }
        boolean z = this.f69253;
        C19203 c19203 = this.f69255;
        long j = -9223372036854775807L;
        if (z) {
            if (this.f69251 == -9223372036854775807L) {
                m49613(interfaceC10375);
                return 0;
            }
            if (this.f69254) {
                long j2 = this.f69250;
                if (j2 == -9223372036854775807L) {
                    m49613(interfaceC10375);
                    return 0;
                }
                C11157 c11157 = this.f69249;
                this.f69248 = c11157.m25737(this.f69251) - c11157.m25735(j2);
                m49613(interfaceC10375);
                return 0;
            }
            int iMin = (int) Math.min(112800, interfaceC10375.getLength());
            long j3 = 0;
            if (interfaceC10375.getPosition() != j3) {
                c24812.f79276 = j3;
                return 1;
            }
            c19203.m43727(iMin);
            interfaceC10375.mo24036();
            interfaceC10375.mo24031(0, iMin, c19203.m43728());
            int iM43729 = c19203.m43729();
            for (int iM43731 = c19203.m43731(); iM43731 < iM43729; iM43731++) {
                if (c19203.m43728()[iM43731] == 71) {
                    long jM30909 = C13590.m30909(c19203, iM43731, i);
                    if (jM30909 != -9223372036854775807L) {
                        j = jM30909;
                        break;
                    }
                }
            }
            this.f69250 = j;
            this.f69254 = true;
            return 0;
        }
        long length = interfaceC10375.getLength();
        int iMin2 = (int) Math.min(112800, length);
        long j4 = length - ((long) iMin2);
        if (interfaceC10375.getPosition() != j4) {
            c24812.f79276 = j4;
            return 1;
        }
        c19203.m43727(iMin2);
        interfaceC10375.mo24036();
        interfaceC10375.mo24031(0, iMin2, c19203.m43728());
        int iM43732 = c19203.m43731();
        int iM437210 = c19203.m43729();
        for (int i2 = iM437210 - 188; i2 >= iM43732; i2--) {
            byte[] bArrM43728 = c19203.m43728();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iM43732 && i5 < iM437210 && bArrM43728[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jM309010 = C13590.m30909(c19203, i2, i);
                        if (jM309010 == -9223372036854775807L) {
                            break;
                        }
                        j = jM309010;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.f69251 = j;
        this.f69253 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m49615() {
        return this.f69248;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11157 m49616() {
        return this.f69249;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49613(InterfaceC10375 interfaceC10375) {
        byte[] bArr = C5792.f14227;
        C19203 c19203 = this.f69255;
        c19203.getClass();
        c19203.m43708(bArr.length, bArr);
        this.f69252 = true;
        interfaceC10375.mo24036();
    }
}
