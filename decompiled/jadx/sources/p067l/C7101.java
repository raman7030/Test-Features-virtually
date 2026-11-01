package p067l;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: renamed from: l.ۙ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C7101 {

    /* JADX INFO: renamed from: ֫ */
    public final long f18507;

    /* JADX INFO: renamed from: ۘ */
    public boolean f18509;

    /* JADX INFO: renamed from: ۢ */
    public boolean f18512;

    /* JADX INFO: renamed from: ܳ */
    public final C19171 f18514;

    /* JADX INFO: renamed from: ܺ */
    public long f18515;

    /* JADX INFO: renamed from: ܿ */
    public final C8442 f18517;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f18518;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f18520;

    /* JADX INFO: renamed from: ܽ */
    public int f18516 = 0;

    /* JADX INFO: renamed from: ۜ */
    public long f18510 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ */
    public long f18511 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷ */
    public long f18519 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۖ */
    public float f18508 = 1.0f;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC17980 f18513 = InterfaceC17980.f53699;

    public C7101(Context context, C19171 c19171, long j) {
        this.f18514 = c19171;
        this.f18507 = j;
        this.f18517 = new C8442(context);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16353() {
        this.f18509 = true;
        this.f18515 = C5792.m12990(this.f18513.mo35966());
        this.f18517.m19664();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m16355() {
        this.f18509 = false;
        this.f18519 = -9223372036854775807L;
        this.f18517.m19667();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16346(Surface surface) {
        this.f18520 = surface != null;
        this.f18518 = false;
        this.f18517.m19663(surface);
        this.f18516 = Math.min(this.f18516, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16344(float f) {
        this.f18517.m19661(f);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16352() {
        boolean z = this.f18516 != 3;
        this.f18516 = 3;
        this.f18515 = C5792.m12990(this.f18513.mo35966());
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16347(InterfaceC17980 interfaceC17980) {
        this.f18513 = interfaceC17980;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16343() {
        if (this.f18516 == 0) {
            this.f18516 = 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16348(boolean z) {
        if (z && (this.f18516 == 3 || (!this.f18520 && this.f18518))) {
            this.f18519 = -9223372036854775807L;
            return true;
        }
        if (this.f18519 == -9223372036854775807L) {
            return false;
        }
        if (this.f18513.mo35966() < this.f18519) {
            return true;
        }
        this.f18519 = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16351(boolean z) {
        this.f18512 = z;
        long j = this.f18507;
        this.f18519 = j > 0 ? this.f18513.mo35966() + j : -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX INFO: renamed from: ֫ */
    public final int m16342(long j, long j2, long j3, long j4, boolean z, boolean z2, C21854 c21854) {
        boolean z3;
        C21854.m49296(c21854);
        if (this.f18509 && this.f18510 == -9223372036854775807L) {
            this.f18510 = j2;
        }
        long j5 = this.f18511;
        C8442 c8442 = this.f18517;
        if (j5 != j) {
            c8442.m19666(j);
            this.f18511 = j;
        }
        long jM12990 = (long) ((j - j2) / ((double) this.f18508));
        if (this.f18509) {
            jM12990 -= C5792.m12990(this.f18513.mo35966()) - j3;
        }
        c21854.f68756 = jM12990;
        if (z && !z2) {
            return 3;
        }
        boolean z4 = this.f18520;
        C19171 c19171 = this.f18514;
        if (!z4) {
            this.f18518 = true;
            if (c19171.m43661(c21854.f68756, j2, z2, true)) {
                return 4;
            }
            return (!this.f18509 || c21854.f68756 >= 30000) ? 5 : 3;
        }
        long j6 = c21854.f68756;
        boolean z5 = false;
        if (this.f18519 == -9223372036854775807L || this.f18512) {
            int i = this.f18516;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            long jM12991 = C5792.m12990(this.f18513.mo35966()) - this.f18515;
                            if (this.f18509) {
                                long j7 = this.f18510;
                                if (j7 == -9223372036854775807L || j7 == j2 || j6 >= -30000 || jM12991 <= 100000) {
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
                z3 = this.f18509;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            return 0;
        }
        if (!this.f18509 || j2 == this.f18510) {
            return 5;
        }
        long jMo35967 = this.f18513.mo35967();
        c21854.f68757 = c8442.m19659((c21854.f68756 * 1000) + jMo35967);
        c21854.f68756 = (c21854.f68757 - jMo35967) / 1000;
        boolean z6 = (this.f18519 == -9223372036854775807L || this.f18512) ? false : true;
        if (c19171.m43661(c21854.f68756, j2, z2, z6)) {
            return 4;
        }
        if (c21854.f68756 < -30000 && !z2) {
            z5 = true;
        }
        if (z5) {
            return z6 ? 3 : 2;
        }
        return c21854.f68756 > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m16354() {
        this.f18517.m19660();
        this.f18511 = -9223372036854775807L;
        this.f18510 = -9223372036854775807L;
        this.f18516 = Math.min(this.f18516, 1);
        this.f18519 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16350(int i) {
        this.f18517.m19662(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16349(float f) {
        C23877.m52957(f > 0.0f);
        if (f == this.f18508) {
            return;
        }
        this.f18508 = f;
        this.f18517.m19665(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16345(int i) {
        if (i == 0) {
            this.f18516 = 1;
        } else if (i == 1) {
            this.f18516 = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f18516 = Math.min(this.f18516, 2);
        }
    }
}
