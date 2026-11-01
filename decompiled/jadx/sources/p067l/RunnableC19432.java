package p067l;

/* JADX INFO: renamed from: l.ᩳۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19432 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final int f59173;

    /* JADX INFO: renamed from: ۙ */
    public final C16689 f59174;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C22115 f59175;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC21800 f59176;

    /* JADX INFO: renamed from: ۬ */
    public final C9197 f59177;

    /* JADX INFO: renamed from: ᩶ */
    public final C11209 f59178;

    /* JADX INFO: renamed from: ᩸ */
    public final C23949 f59179;

    /* JADX INFO: renamed from: ᩹ */
    public final int f59180;

    public RunnableC19432(C22115 c22115, InterfaceC21800 interfaceC21800, C16689 c16689, int i, C9197 c9197, C11209 c11209, int i2, C23949 c23949) {
        this.f59175 = c22115;
        this.f59176 = interfaceC21800;
        this.f59174 = c16689;
        this.f59173 = i;
        this.f59177 = c9197;
        this.f59178 = c11209;
        this.f59180 = i2;
        this.f59179 = c23949;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM32423;
        boolean z;
        boolean z2;
        if (m44200() != 2) {
            return;
        }
        C9197 c9197 = this.f59177;
        if (c9197 != null && c9197.m21197()) {
            zM32423 = this.f59175.f69973.m32412(this.f59177.m21192(), this.f59177.m21188(), this.f59179.m53053());
        } else {
            zM32423 = this.f59175.f69973.m32423(this.f59179.m53053());
        }
        if (!zM32423) {
            this.f59175.f69973.postDelayed(this, 100L);
            return;
        }
        synchronized (this.f59175) {
            if (this.f59175.f69969.f56053 == this) {
                boolean z3 = this.f59175.f69969.f56048;
                z = this.f59175.f69969.f56050;
                this.f59175.f69969.f56053 = null;
                this.f59175.m49848();
                C9197 c9198 = this.f59177;
                if (c9198 == null || z3) {
                    this.f59175.m49860();
                } else if (!c9198.m21197()) {
                    C22115 c22115 = this.f59175;
                    C22115.m49826(c22115, this.f59176, c22115.f69969.f56051.m53052(this.f59179));
                } else {
                    this.f59175.m49817(this.f59176, this.f59177);
                }
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z2) {
            C14146 c14146 = this.f59175.f69973;
            c14146.m32469();
            c14146.invalidate();
            if (z) {
                this.f59175.m49834(this.f59176);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m44200() {
        synchronized (this.f59175) {
            if (this.f59175.f69969.f56053 != this) {
                return 0;
            }
            int i = 1;
            boolean z = this.f59175.f69973.m32500() == this.f59176 && C22115.m49845(this.f59175) == this.f59174 && this.f59176.mo28581() == this.f59173 && this.f59175.f69971.f47317 == this.f59180 && this.f59175.f69969.f56056 == this.f59179 && this.f59175.m49830(this.f59176, this.f59173);
            boolean z2 = this.f59175.f69971.f47318 == this.f59178 && this.f59175.f69971.f47311 == this.f59177 && this.f59176.length() == this.f59178.m25889();
            if (z && z2) {
                if (this.f59175.f69973.isAttachedToWindow() && this.f59175.f69973.m32547() && !this.f59175.f69973.m32596()) {
                    i = 2;
                }
                return i;
            }
            this.f59175.f69969.f56053 = null;
            return 0;
        }
    }
}
