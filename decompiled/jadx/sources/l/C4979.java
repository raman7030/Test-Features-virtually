package l;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: renamed from: l.ۙ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C4979 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f15673;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f15675;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f15678;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17679 f15680;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f15681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6390 f15683;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f15684;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f15686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15682 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f15676 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f15677 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f15685 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f15674 = 1.0f;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC16427 f15679 = InterfaceC16427.f50519;

    public C4979(Context context, C17679 c17679, long j) {
        this.f15680 = c17679;
        this.f15673 = j;
        this.f15683 = new C6390(context);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14449() {
        this.f15675 = true;
        this.f15681 = C3603.m11014(this.f15679.mo33834());
        this.f15683.m17717();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14451() {
        this.f15675 = false;
        this.f15685 = -9223372036854775807L;
        this.f15683.m17720();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14442(Surface surface) {
        this.f15686 = surface != null;
        this.f15684 = false;
        this.f15683.m17716(surface);
        this.f15682 = Math.min(this.f15682, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14440(float f) {
        this.f15683.m17714(f);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14448() {
        boolean z = this.f15682 != 3;
        this.f15682 = 3;
        this.f15681 = C3603.m11014(this.f15679.mo33834());
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14443(InterfaceC16427 interfaceC16427) {
        this.f15679 = interfaceC16427;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14439() {
        if (this.f15682 == 0) {
            this.f15682 = 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14444(boolean z) {
        if (z && (this.f15682 == 3 || (!this.f15686 && this.f15684))) {
            this.f15685 = -9223372036854775807L;
            return true;
        }
        if (this.f15685 == -9223372036854775807L) {
            return false;
        }
        if (this.f15679.mo33834() < this.f15685) {
            return true;
        }
        this.f15685 = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14447(boolean z) {
        this.f15678 = z;
        long j = this.f15673;
        this.f15685 = j > 0 ? this.f15679.mo33834() + j : -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14438(long j, long j2, long j3, long j4, boolean z, boolean z2, C20502 c20502) {
        boolean z3;
        C20502.m46973(c20502);
        if (this.f15675 && this.f15676 == -9223372036854775807L) {
            this.f15676 = j2;
        }
        long j5 = this.f15677;
        C6390 c6390 = this.f15683;
        if (j5 != j) {
            c6390.m17719(j);
            this.f15677 = j;
        }
        long jM11014 = (long) ((j - j2) / ((double) this.f15674));
        if (this.f15675) {
            jM11014 -= C3603.m11014(this.f15679.mo33834()) - j3;
        }
        c20502.f66077 = jM11014;
        if (z && !z2) {
            return 3;
        }
        boolean z4 = this.f15686;
        C17679 c17679 = this.f15680;
        if (!z4) {
            this.f15684 = true;
            if (c17679.m41415(c20502.f66077, j2, z2, true)) {
                return 4;
            }
            return (!this.f15675 || c20502.f66077 >= 30000) ? 5 : 3;
        }
        long j6 = c20502.f66077;
        boolean z5 = false;
        if (this.f15685 == -9223372036854775807L || this.f15678) {
            int i = this.f15682;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            long jM11015 = C3603.m11014(this.f15679.mo33834()) - this.f15681;
                            if (this.f15675) {
                                long j7 = this.f15676;
                                if (j7 == -9223372036854775807L || j7 == j2 || j6 >= -30000 || jM11015 <= 100000) {
                                }
                            }
                            z3 = false;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (j2 < j4) {
                        z3 = false;
                    }
                }
                z3 = true;
            } else {
                z3 = this.f15675;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            return 0;
        }
        if (!this.f15675 || j2 == this.f15676) {
            return 5;
        }
        long jMo33835 = this.f15679.mo33835();
        c20502.f66078 = c6390.m17712((c20502.f66077 * 1000) + jMo33835);
        c20502.f66077 = (c20502.f66078 - jMo33835) / 1000;
        boolean z6 = (this.f15685 == -9223372036854775807L || this.f15678) ? false : true;
        if (c17679.m41415(c20502.f66077, j2, z2, z6)) {
            return 4;
        }
        if (c20502.f66077 < -30000 && !z2) {
            z5 = true;
        }
        if (z5) {
            return z6 ? 3 : 2;
        }
        return c20502.f66077 > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14450() {
        this.f15683.m17713();
        this.f15677 = -9223372036854775807L;
        this.f15676 = -9223372036854775807L;
        this.f15682 = Math.min(this.f15682, 1);
        this.f15685 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14446(int i) {
        this.f15683.m17715(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14445(float f) {
        C22632.m50631(f > 0.0f);
        if (f == this.f15674) {
            return;
        }
        this.f15674 = f;
        this.f15683.m17718(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14441(int i) {
        if (i == 0) {
            this.f15682 = 1;
        } else if (i == 1) {
            this.f15682 = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f15682 = Math.min(this.f15682, 2);
        }
    }
}
