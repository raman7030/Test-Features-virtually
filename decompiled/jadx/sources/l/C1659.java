package l;

/* JADX INFO: renamed from: l.֫ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C1659 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15893 f5796;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16475 f5797;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f5798;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6928 f5799;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12392 f5800;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9170 f5801;

    static {
        ApplicationC12518.m30701(23);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C1659(C16475 c16475) {
        this.f5797 = c16475;
        this.f5801 = C9170.m23579(c16475.getViewLifecycleOwner());
        this.f5796 = c16475.f50651;
        this.f5800 = c16475.f50649;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f5800.m30485();
        this.f5798 = true;
        C16475 c16475 = this.f5797;
        c16475.f50640++;
        c16475.f50654 = this;
        c16475.f50647 = true;
        c16475.f50649.m30314(c16475.f50656, true, false);
        c16475.f50648 = false;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() throws Exception {
        C16475 c16475 = this.f5797;
        if (c16475.f50654 == this && this.f5801.m23581() && c16475.f50644) {
            C6928 c6928 = this.f5799;
            C15893 c15893 = this.f5796;
            if (c6928 != null) {
                c15893.m37666(c6928);
            } else if (!(c15893.m37667() instanceof C21040)) {
                c15893.m37666(new C21040());
            }
            c15893.mo7983(c16475.f50650, c16475.f50649.m30436());
            c16475.f50649.m30360();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16475 c16475 = this.f5797;
        if (c16475.f50654 == this && this.f5801.m23581()) {
            C16475.m38787(c16475, exc);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16475 c16475 = this.f5797;
        try {
            if (this.f5798) {
                this.f5800.m30439();
            }
            if (c16475.f50654 != this || !this.f5801.m23581()) {
                C6928 c6928 = this.f5799;
                if (c6928 != null) {
                    c6928.close();
                }
            } else {
                if (c16475.f50644) {
                    c16475.f50646.m36686();
                    c16475.f50649.m30314(c16475.f50656, false, !c16475.f50648);
                }
            }
        } finally {
            if (this.f5798) {
                c16475.f50640--;
            }
            if (c16475.f50654 == this) {
                c16475.f50654 = null;
                c16475.f50647 = false;
            }
        }
    }
}
