package l;

import java.io.File;

/* JADX INFO: renamed from: l.ۗ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3100 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f9697;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f9698;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f9699;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f9700;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4043 f9701;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m9451(String str, C4043 c4043, boolean z) {
        if (z) {
            if (!c4043.f12816.f8303) {
                this.f9701 = null;
                return;
            }
        }
        File file = new File(str);
        this.f9700 = str;
        this.f9697 = file.length();
        this.f9699 = file.lastModified();
        this.f9698 = z;
        this.f9701 = c4043;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C4043 m9450(String str, long j, boolean z, boolean z2) {
        if (this.f9701 != null && str.equals(this.f9700) && this.f9701.f12825 == z && this.f9698 == z2) {
            File file = new File(str);
            if (file.length() == this.f9697 && file.lastModified() == this.f9699) {
                C4043 c4043 = this.f9701;
                long j2 = c4043.f12822;
                long j3 = c4043.f12827;
                long j4 = j2 - j3;
                long j5 = c4043.f12817 - j3;
                if (j4 >= 0 && j5 >= 0) {
                    long j6 = c4043.f12818;
                    if (j6 >= 0) {
                        long j7 = z ? j4 : j5;
                        if (j >= j7 && j6 != 0 && C13132.FOREVER_NS - j7 >= j6) {
                            long j8 = j - j7;
                            if (j8 < j6 && C13132.FOREVER_NS - j4 >= j8 && C13132.FOREVER_NS - j5 >= j8) {
                                C2632 c2632M8290 = c4043.f12816;
                                if (z2) {
                                    if (c2632M8290.f8303) {
                                        long j9 = c2632M8290.f8302;
                                        if (j9 >= 0) {
                                            long j10 = c2632M8290.f8304;
                                            if (j10 > 0 && j9 <= C13132.FOREVER_NS - j10) {
                                                long j11 = j4 + j8;
                                                long j12 = j10 + j9;
                                                if (j11 >= j9 && j11 < j12) {
                                                    c2632M8290 = c2632M8290.m8290(j11 - j9);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    return null;
                                }
                                C2632 c2632 = c2632M8290;
                                C4043 c4044 = this.f9701;
                                return C4043.m12142(true, z, j, c4044.f12826, j4 + j8, j5 + j8, j8, c4044.f12818, c4044.f12819, c4044.f12821, c4044.f12824, c2632);
                            }
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            this.f9701 = null;
            return null;
        }
        return null;
    }
}
