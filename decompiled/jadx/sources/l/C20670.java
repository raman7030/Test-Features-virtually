package l;

/* JADX INFO: renamed from: l.᩷ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20670 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f66570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f66571;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f66572;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9248 f66567 = new C9248(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f66568 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f66569 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66566 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f66573 = new C17714();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47290() {
        return this.f66570;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47287(InterfaceC8424 interfaceC8424, C23615 c23615, int i) {
        if (i <= 0) {
            m47286(interfaceC8424);
            return 0;
        }
        boolean z = this.f66571;
        C17714 c17714 = this.f66573;
        long j = -9223372036854775807L;
        if (z) {
            if (this.f66569 == -9223372036854775807L) {
                m47286(interfaceC8424);
                return 0;
            }
            if (this.f66572) {
                long j2 = this.f66568;
                if (j2 == -9223372036854775807L) {
                    m47286(interfaceC8424);
                    return 0;
                }
                C9248 c9248 = this.f66567;
                this.f66566 = c9248.m23736(this.f66569) - c9248.m23734(j2);
                m47286(interfaceC8424);
                return 0;
            }
            int iMin = (int) Math.min(112800, interfaceC8424.getLength());
            long j3 = 0;
            if (interfaceC8424.getPosition() != j3) {
                c23615.f76532 = j3;
                return 1;
            }
            c17714.m41481(iMin);
            interfaceC8424.mo22066();
            interfaceC8424.mo22061(0, iMin, c17714.m41482());
            int iM41483 = c17714.m41483();
            for (int iM41485 = c17714.m41485(); iM41485 < iM41483; iM41485++) {
                if (c17714.m41482()[iM41485] == 71) {
                    long jM28860 = C11807.m28860(c17714, iM41485, i);
                    if (jM28860 != -9223372036854775807L) {
                        j = jM28860;
                        break;
                    }
                }
            }
            this.f66568 = j;
            this.f66572 = true;
            return 0;
        }
        long length = interfaceC8424.getLength();
        int iMin2 = (int) Math.min(112800, length);
        long j4 = length - ((long) iMin2);
        if (interfaceC8424.getPosition() != j4) {
            c23615.f76532 = j4;
            return 1;
        }
        c17714.m41481(iMin2);
        interfaceC8424.mo22066();
        interfaceC8424.mo22061(0, iMin2, c17714.m41482());
        int iM41486 = c17714.m41485();
        int iM41484 = c17714.m41483();
        for (int i2 = iM41484 - 188; i2 >= iM41486; i2--) {
            byte[] bArrM41482 = c17714.m41482();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iM41486 && i5 < iM41484 && bArrM41482[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jM28861 = C11807.m28860(c17714, i2, i);
                        if (jM28861 == -9223372036854775807L) {
                            break;
                        }
                        j = jM28861;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.f66569 = j;
        this.f66571 = true;
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m47288() {
        return this.f66566;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9248 m47289() {
        return this.f66567;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47286(InterfaceC8424 interfaceC8424) {
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f66573;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
        this.f66570 = true;
        interfaceC8424.mo22066();
    }
}
