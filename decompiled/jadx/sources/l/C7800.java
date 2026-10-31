package l;

/* JADX INFO: renamed from: l.۟᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C7800 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16475 f24098;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f24099;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12392 f24100;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15893 f24101;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24102;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24103;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15545 f24104;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6928 f24105;

    static {
        ApplicationC12518.m30701(76);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C7800(C16475 c16475) {
        this.f24098 = c16475;
        this.f24099 = C9170.m23579(c16475.getViewLifecycleOwner());
        this.f24101 = c16475.f50651;
        this.f24100 = c16475.f50649;
        this.f24104 = c16475.f50646;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f24100.m30485();
        this.f24103 = true;
        C16475 c16475 = this.f24098;
        c16475.f50640++;
        c16475.f50654 = this;
        c16475.f50647 = true;
        c16475.f50638 = false;
        c16475.f50649.m30314(c16475.f50656, true, false);
        c16475.f50648 = false;
        c16475.f50646.m36677(".java");
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() throws Exception {
        C16475 c16475 = this.f24098;
        if (c16475.f50654 == this && this.f24099.m23581() && c16475.f50644) {
            C6928 c6928 = this.f24105;
            C15893 c15893 = this.f24101;
            if (c6928 != null) {
                c15893.m37666(c6928);
            } else if (!(c15893.m37667() instanceof C21040)) {
                c15893.m37666(new C21040());
            }
            c15893.mo7983(c16475.f50650, c16475.f50649.m30436());
            if (this.f24102) {
                c16475.f50649.m30410();
            } else {
                c16475.f50649.m30360();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16475 c16475 = this.f24098;
        if (c16475.f50654 == this && this.f24099.m23581()) {
            C16475.m38787(c16475, exc);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16475 c16475 = this.f24098;
        try {
            if (this.f24103) {
                this.f24100.m30439();
            }
            if (c16475.f50654 != this || !this.f24099.m23581()) {
                C6928 c6928 = this.f24105;
                if (c6928 != null) {
                    c6928.close();
                }
            } else {
                if (c16475.f50644) {
                    c16475.f50649.m30314(c16475.f50656, false, !c16475.f50648);
                }
            }
        } finally {
            if (this.f24103) {
                c16475.f50640--;
            }
            if (c16475.f50654 == this) {
                c16475.f50654 = null;
                c16475.f50647 = false;
                c16475.f50638 = true;
            }
        }
    }
}
