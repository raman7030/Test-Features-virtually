package p067l;

import java.io.File;

/* JADX INFO: renamed from: l.ۗ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5315 {

    /* JADX INFO: renamed from: ֫ */
    public long f12500;

    /* JADX INFO: renamed from: ۧ */
    public boolean f12501;

    /* JADX INFO: renamed from: ܽ */
    public long f12502;

    /* JADX INFO: renamed from: ܿ */
    public String f12503;

    /* JADX INFO: renamed from: ᩳ */
    public C6211 f12504;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m11494(String str, C6211 c6211, boolean z) {
        if (z) {
            if (!c6211.f15631.f11098) {
                this.f12504 = null;
                return;
            }
        }
        File file = new File(str);
        this.f12503 = str;
        this.f12500 = file.length();
        this.f12502 = file.lastModified();
        this.f12501 = z;
        this.f12504 = c6211;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C6211 m11493(String str, long j, boolean z, boolean z2) {
        if (this.f12504 != null && str.equals(this.f12503) && this.f12504.f15640 == z && this.f12501 == z2) {
            File file = new File(str);
            if (file.length() == this.f12500 && file.lastModified() == this.f12502) {
                C6211 c6211 = this.f12504;
                long j2 = c6211.f15637;
                long j3 = c6211.f15642;
                long j4 = j2 - j3;
                long j5 = c6211.f15632 - j3;
                if (j4 >= 0 && j5 >= 0) {
                    long j6 = c6211.f15633;
                    if (j6 >= 0) {
                        long j7 = z ? j4 : j5;
                        if (j >= j7 && j6 != 0 && C14849.FOREVER_NS - j7 >= j6) {
                            long j8 = j - j7;
                            if (j8 < j6 && C14849.FOREVER_NS - j4 >= j8 && C14849.FOREVER_NS - j5 >= j8) {
                                C4870 c4870M10334 = c6211.f15631;
                                if (z2) {
                                    if (c4870M10334.f11098) {
                                        long j9 = c4870M10334.f11097;
                                        if (j9 >= 0) {
                                            long j10 = c4870M10334.f11099;
                                            if (j10 > 0 && j9 <= C14849.FOREVER_NS - j10) {
                                                long j11 = j4 + j8;
                                                long j12 = j10 + j9;
                                                if (j11 >= j9 && j11 < j12) {
                                                    c4870M10334 = c4870M10334.m10334(j11 - j9);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    return null;
                                }
                                C4870 c4870 = c4870M10334;
                                C6211 c6212 = this.f12504;
                                return C6211.m14063(true, z, j, c6212.f15641, j4 + j8, j5 + j8, j8, c6212.f15633, c6212.f15634, c6212.f15636, c6212.f15639, c4870);
                            }
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            this.f12504 = null;
            return null;
        }
        return null;
    }
}
