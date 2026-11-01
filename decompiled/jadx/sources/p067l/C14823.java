package p067l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.۬۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14823 {

    /* JADX INFO: renamed from: ֫ */
    public final C5436 f42287;

    /* JADX INFO: renamed from: ۜ */
    public final int f42288;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14153 f42289;

    /* JADX INFO: renamed from: ܳ */
    public long f42290;

    /* JADX INFO: renamed from: ܽ */
    public long f42291;

    /* JADX INFO: renamed from: ܿ */
    public long f42292;

    /* JADX INFO: renamed from: ᩳ */
    public long f42293;

    /* JADX INFO: renamed from: ᩷ */
    public int f42294;

    /* JADX INFO: renamed from: ᩻ */
    public long f42295;

    public C14823(AudioTrack audioTrack, InterfaceC14153 interfaceC14153) {
        this.f42287 = new C5436(audioTrack);
        this.f42288 = audioTrack.getSampleRate();
        this.f42289 = interfaceC14153;
        m33855(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33858(float f, long j, long j2) {
        if (j - this.f42290 < this.f42295) {
            return;
        }
        this.f42290 = j;
        C5436 c5436 = this.f42287;
        boolean zM11951 = c5436.m11951();
        int i = this.f42288;
        if (zM11951) {
            long jM11950 = c5436.m11950();
            long jM11949 = c5436.m11949();
            long jM11951 = c5436.m11950();
            long jM12991 = C5792.m12991(j - jM11951, f) + C5792.m12989(i, jM11949);
            long jAbs = Math.abs(jM11950 - j);
            InterfaceC14153 interfaceC14153 = this.f42289;
            if (jAbs > 5000000) {
                long jM119410 = c5436.m11949();
                C20802 c20802 = (C20802) interfaceC14153;
                c20802.getClass();
                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                sb.append(jM119410);
                sb.append(", ");
                sb.append(jM11950);
                sb.append(", ");
                sb.append(j);
                sb.append(", ");
                sb.append(j2);
                sb.append(", ");
                C10072 c10072 = c20802.f65373;
                sb.append(C10072.m23530(c10072));
                sb.append(", ");
                sb.append(c10072.m23516());
                C21334.m48351(sb.toString());
                m33855(4);
            } else if (Math.abs(jM12991 - j2) > 5000000) {
                long jM119411 = c5436.m11949();
                C20802 c20803 = (C20802) interfaceC14153;
                c20803.getClass();
                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(jM119411);
                sb2.append(", ");
                sb2.append(jM11950);
                sb2.append(", ");
                sb2.append(j);
                sb2.append(", ");
                sb2.append(j2);
                sb2.append(", ");
                C10072 c10073 = c20803.f65373;
                sb2.append(C10072.m23530(c10073));
                sb2.append(", ");
                sb2.append(c10073.m23516());
                C21334.m48351(sb2.toString());
                m33855(4);
            } else if (this.f42294 == 4) {
                m33855(0);
            }
        }
        int i2 = this.f42294;
        if (i2 == 0) {
            if (!zM11951) {
                if (j - this.f42292 > 500000) {
                    m33855(3);
                    return;
                }
                return;
            } else {
                if (c5436.m11950() >= this.f42292) {
                    this.f42291 = c5436.m11949();
                    this.f42293 = c5436.m11950();
                    m33855(1);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (zM11951) {
                    return;
                }
                m33855(0);
                return;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (zM11951) {
                    m33855(0);
                    return;
                }
                return;
            }
        }
        if (!zM11951) {
            m33855(0);
            return;
        }
        long jM119412 = c5436.m11949();
        long j3 = this.f42291;
        if (jM119412 > j3) {
            long j4 = this.f42293;
            long jM12992 = C5792.m12991(j - j4, f) + C5792.m12989(i, j3);
            long jM119413 = c5436.m11949();
            long jM11952 = c5436.m11950();
            if (Math.abs((C5792.m12991(j - jM11952, f) + C5792.m12989(i, jM119413)) - jM12992) < 1000) {
                m33855(2);
                return;
            }
        }
        if (j - this.f42292 > 2000000) {
            m33855(3);
        } else {
            this.f42291 = c5436.m11949();
            this.f42293 = c5436.m11950();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m33859() {
        return this.f42294 == 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m33860() {
        int i = this.f42294;
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m33861() {
        m33855(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33857() {
        this.f42287.m11948();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33855(int i) {
        this.f42294 = i;
        if (i == 0) {
            this.f42290 = 0L;
            this.f42291 = -1L;
            this.f42293 = -9223372036854775807L;
            this.f42292 = System.nanoTime() / 1000;
            this.f42295 = 10000L;
            return;
        }
        if (i == 1) {
            this.f42295 = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f42295 = 10000000L;
        } else {
            if (i == 4) {
                this.f42295 = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m33856(long j, float f) {
        C5436 c5436 = this.f42287;
        long jM11949 = c5436.m11949();
        long jM11950 = c5436.m11950();
        return C5792.m12991(j - jM11950, f) + C5792.m12989(this.f42288, jM11949);
    }
}
