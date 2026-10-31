package l;

/* JADX INFO: renamed from: l.֫ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1619 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5698;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f5699;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f5700;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9248 f5695 = new C9248(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f5696 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f5697 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f5694 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f5701 = new C17714();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m5500() {
        return this.f5698;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9248 m5499() {
        return this.f5695;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5497(InterfaceC8424 interfaceC8424, C23615 c23615) {
        boolean z = this.f5699;
        C17714 c17714 = this.f5701;
        long j = -9223372036854775807L;
        if (!z) {
            long length = interfaceC8424.getLength();
            int iMin = (int) Math.min(20000L, length);
            long j2 = length - ((long) iMin);
            if (interfaceC8424.getPosition() != j2) {
                c23615.f76532 = j2;
                return 1;
            }
            c17714.m41481(iMin);
            interfaceC8424.mo22066();
            interfaceC8424.mo22061(0, iMin, c17714.m41482());
            int iM41485 = c17714.m41485();
            for (int iM41483 = c17714.m41483() - 4; iM41483 >= iM41485; iM41483--) {
                if (m5494(iM41483, c17714.m41482()) == 442) {
                    c17714.m41484(iM41483 + 4);
                    long jM5495 = m5495(c17714);
                    if (jM5495 != -9223372036854775807L) {
                        j = jM5495;
                        break;
                    }
                }
            }
            this.f5697 = j;
            this.f5699 = true;
            return 0;
        }
        if (this.f5697 == -9223372036854775807L) {
            m5496(interfaceC8424);
            return 0;
        }
        if (this.f5700) {
            long j3 = this.f5696;
            if (j3 == -9223372036854775807L) {
                m5496(interfaceC8424);
                return 0;
            }
            C9248 c9248 = this.f5695;
            this.f5694 = c9248.m23736(this.f5697) - c9248.m23734(j3);
            m5496(interfaceC8424);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, interfaceC8424.getLength());
        long j4 = 0;
        if (interfaceC8424.getPosition() != j4) {
            c23615.f76532 = j4;
            return 1;
        }
        c17714.m41481(iMin2);
        interfaceC8424.mo22066();
        interfaceC8424.mo22061(0, iMin2, c17714.m41482());
        int iM41484 = c17714.m41483();
        for (int iM41486 = c17714.m41485(); iM41486 < iM41484 - 3; iM41486++) {
            if (m5494(iM41486, c17714.m41482()) == 442) {
                c17714.m41484(iM41486 + 4);
                long jM5496 = m5495(c17714);
                if (jM5496 != -9223372036854775807L) {
                    j = jM5496;
                    break;
                }
            }
        }
        this.f5696 = j;
        this.f5700 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m5498() {
        return this.f5694;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m5495(C17714 c17714) {
        int iM41485 = c17714.m41485();
        if (c17714.m41457() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c17714.m41461(0, 9, bArr);
        c17714.m41484(iM41485);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5496(InterfaceC8424 interfaceC8424) {
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f5701;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
        this.f5698 = true;
        interfaceC8424.mo22066();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5494(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
