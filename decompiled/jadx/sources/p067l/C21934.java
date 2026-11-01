package p067l;

/* JADX INFO: renamed from: l.᩷ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8LV */
/* JADX INFO: loaded from: classes4.dex */
public final class C21934 {

    /* JADX INFO: renamed from: ֫ */
    public final long f68956;

    /* JADX INFO: renamed from: ۧ */
    public final int f68957;

    /* JADX INFO: renamed from: ܳ */
    public final long[] f68958;

    /* JADX INFO: renamed from: ܽ */
    public final int f68959;

    /* JADX INFO: renamed from: ܿ */
    public final C18777 f68960;

    /* JADX INFO: renamed from: ᩳ */
    public final long f68961;

    public C21934(C18777 c18777, long j, long j2, long[] jArr, int i, int i2) {
        C18777 c18778 = new C18777();
        c18778.f56106 = c18777.f56106;
        c18778.f56105 = c18777.f56105;
        c18778.f56103 = c18777.f56103;
        c18778.f56104 = c18777.f56104;
        c18778.f56101 = c18777.f56101;
        c18778.f56100 = c18777.f56100;
        c18778.f56102 = c18777.f56102;
        this.f68960 = c18778;
        this.f68961 = j;
        this.f68956 = j2;
        this.f68958 = jArr;
        this.f68957 = i;
        this.f68959 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21934 m49464(C18777 c18777, C19203 c19203) {
        long[] jArr;
        int i;
        int i2;
        int iM43739 = c19203.m43739();
        int iM43738 = (iM43739 & 1) != 0 ? c19203.m43738() : -1;
        long jM43725 = (iM43739 & 2) != 0 ? c19203.m43725() : -1L;
        if ((iM43739 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = c19203.m43702();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iM43739 & 8) != 0) {
            c19203.m43724(4);
        }
        if (c19203.m43703() >= 24) {
            c19203.m43724(21);
            int iM43737 = c19203.m43737();
            i2 = iM43737 & 4095;
            i = (16773120 & iM43737) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new C21934(c18777, iM43738, jM43725, jArr, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m49465() {
        long j = this.f68961;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        C18777 c18777 = this.f68960;
        return C5792.m12989(c18777.f56104, (j * ((long) c18777.f56102)) - 1);
    }
}
