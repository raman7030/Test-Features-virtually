package l;

/* JADX INFO: renamed from: l.ᩳۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17954 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f55976;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15068 f55977;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20777 f55978;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f55979;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7185 f55980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9302 f55981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22707 f55982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f55983;

    public RunnableC17954(C20777 c20777, InterfaceC20445 interfaceC20445, C15068 c15068, int i, C7185 c7185, C9302 c9302, int i2, C22707 c22707) {
        this.f55978 = c20777;
        this.f55979 = interfaceC20445;
        this.f55977 = c15068;
        this.f55976 = i;
        this.f55980 = c7185;
        this.f55981 = c9302;
        this.f55983 = i2;
        this.f55982 = c22707;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM30359;
        boolean z;
        boolean z2;
        if (m41951() != 2) {
            return;
        }
        C7185 c7185 = this.f55980;
        if (c7185 != null && c7185.m19250()) {
            zM30359 = this.f55978.f67289.m30348(this.f55980.m19245(), this.f55980.m19241(), this.f55982.m50727());
        } else {
            zM30359 = this.f55978.f67289.m30359(this.f55982.m50727());
        }
        if (!zM30359) {
            this.f55978.f67289.postDelayed(this, 100L);
            return;
        }
        synchronized (this.f55978) {
            if (this.f55978.f67285.f52871 == this) {
                boolean z3 = this.f55978.f67285.f52866;
                z = this.f55978.f67285.f52868;
                this.f55978.f67285.f52871 = null;
                this.f55978.m47520();
                C7185 c7186 = this.f55980;
                if (c7186 == null || z3) {
                    this.f55978.m47532();
                } else if (!c7186.m19250()) {
                    C20777 c20777 = this.f55978;
                    C20777.m47498(c20777, this.f55979, c20777.f67285.f52869.m50726(this.f55982));
                } else {
                    this.f55978.m47489(this.f55979, this.f55980);
                }
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z2) {
            C12392 c12392 = this.f55978.f67289;
            c12392.m30405();
            c12392.invalidate();
            if (z) {
                this.f55978.m47506(this.f55979);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41951() {
        synchronized (this.f55978) {
            if (this.f55978.f67285.f52871 != this) {
                return 0;
            }
            int i = 1;
            boolean z = this.f55978.f67289.m30436() == this.f55979 && C20777.m47517(this.f55978) == this.f55977 && this.f55979.mo26548() == this.f55976 && this.f55978.f67287.f44223 == this.f55983 && this.f55978.f67285.f52874 == this.f55982 && this.f55978.m47502(this.f55979, this.f55976);
            boolean z2 = this.f55978.f67287.f44224 == this.f55981 && this.f55978.f67287.f44217 == this.f55980 && this.f55979.length() == this.f55981.m23880();
            if (z && z2) {
                if (this.f55978.f67289.isAttachedToWindow() && this.f55978.f67289.m30483() && !this.f55978.f67289.m30532()) {
                    i = 2;
                }
                return i;
            }
            this.f55978.f67285.f52871 = null;
            return 0;
        }
    }
}
