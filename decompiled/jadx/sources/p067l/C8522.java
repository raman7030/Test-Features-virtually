package p067l;

/* JADX INFO: renamed from: l.ۜۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8522 implements InterfaceC24615 {

    /* JADX INFO: renamed from: ֫ */
    public final int f22867;

    /* JADX INFO: renamed from: ۧ */
    public final long f22868;

    /* JADX INFO: renamed from: ܳ */
    public final long[] f22869;

    /* JADX INFO: renamed from: ܽ */
    public final long f22870;

    /* JADX INFO: renamed from: ܿ */
    public final long[] f22871;

    /* JADX INFO: renamed from: ᩳ */
    public final long f22872;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8522 m19815(long j, long j2, C18777 c18777, C19203 c19203) {
        long j3;
        long jMax;
        int iM43702;
        c19203.m43724(6);
        int iM43739 = c19203.m43739();
        long j4 = j2 + ((long) c18777.f56103);
        long j5 = ((long) iM43739) + j4;
        int iM437310 = c19203.m43739();
        if (iM437310 <= 0) {
            return null;
        }
        long jM12989 = C5792.m12989(c18777.f56104, (((long) iM437310) * ((long) c18777.f56102)) - 1);
        int iM43710 = c19203.m43710();
        int iM43711 = c19203.m43710();
        int iM43712 = c19203.m43710();
        c19203.m43724(2);
        long j6 = j2 + ((long) c18777.f56103);
        long[] jArr = new long[iM43710];
        long[] jArr2 = new long[iM43710];
        int i = 0;
        while (i < iM43710) {
            long j7 = j5;
            long j8 = jM12989;
            jArr[i] = (((long) i) * jM12989) / ((long) iM43710);
            jArr2[i] = j6;
            if (iM43712 == 1) {
                iM43702 = c19203.m43702();
            } else if (iM43712 == 2) {
                iM43702 = c19203.m43710();
            } else if (iM43712 == 3) {
                iM43702 = c19203.m43737();
            } else {
                if (iM43712 != 4) {
                    return null;
                }
                iM43702 = c19203.m43738();
            }
            j6 += ((long) iM43702) * ((long) iM43711);
            i++;
            j5 = j7;
            jM12989 = j8;
        }
        long j9 = j5;
        long j10 = jM12989;
        if (j == -1 || j == j9) {
            j3 = j9;
        } else {
            StringBuilder sbM33191 = C14536.m33191("VBRI data size mismatch: ", ", ", j);
            j3 = j9;
            sbM33191.append(j3);
            C21334.m48351(sbM33191.toString());
        }
        if (j3 != j6) {
            StringBuilder sbM33192 = C14536.m33191("VBRI bytes and ToC mismatch (using max): ", ", ", j3);
            sbM33192.append(j6);
            sbM33192.append("\nSeeking will be inaccurate.");
            C21334.m48351(sbM33192.toString());
            jMax = Math.max(j3, j6);
        } else {
            jMax = j3;
        }
        return new C8522(jArr, jArr2, j10, j4, jMax, c18777.f56100);
    }

    public C8522(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f22869 = jArr;
        this.f22871 = jArr2;
        this.f22872 = j;
        this.f22870 = j2;
        this.f22868 = j3;
        this.f22867 = i;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        long[] jArr = this.f22869;
        int iM13012 = C5792.m13012(jArr, j, true);
        long j2 = jArr[iM13012];
        long[] jArr2 = this.f22871;
        C10731 c10731 = new C10731(j2, jArr2[iM13012]);
        if (j2 >= j || iM13012 == jArr.length - 1) {
            return new C8719(c10731, c10731);
        }
        int i = iM13012 + 1;
        return new C8719(c10731, new C10731(jArr[i], jArr2[i]));
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19817(long j) {
        return this.f22869[C5792.m13012(this.f22871, j, true)];
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f22872;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19816() {
        return this.f22870;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩳ */
    public final long mo19818() {
        return this.f22868;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19819() {
        return this.f22867;
    }
}
