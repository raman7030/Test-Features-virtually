package p067l;

/* JADX INFO: renamed from: l.۟᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C9782 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C18026 f27015;

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f27016;

    /* JADX INFO: renamed from: ۡ */
    public final C14146 f27017;

    /* JADX INFO: renamed from: ۢ */
    public final C17473 f27018;

    /* JADX INFO: renamed from: ܳ */
    public boolean f27019;

    /* JADX INFO: renamed from: ܺ */
    public boolean f27020;

    /* JADX INFO: renamed from: ᩷ */
    public final C17143 f27021;

    /* JADX INFO: renamed from: ᩻ */
    public C8953 f27022;

    static {
        ApplicationC14266.m56479(76);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public native void mo3405();

    public C9782(C18026 c18026) {
        this.f27015 = c18026;
        this.f27016 = C11084.m25530(c18026.getViewLifecycleOwner());
        this.f27018 = c18026.f53828;
        this.f27017 = c18026.f53826;
        this.f27021 = c18026.f53823;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f27017.m32549();
        this.f27020 = true;
        C18026 c18026 = this.f27015;
        c18026.f53817++;
        c18026.f53831 = this;
        c18026.f53824 = true;
        c18026.f53815 = false;
        c18026.f53826.m32378(c18026.f53833, true, false);
        c18026.f53825 = false;
        c18026.f53823.m38838(".java");
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() throws Exception {
        C18026 c18026 = this.f27015;
        if (c18026.f53831 == this && this.f27016.m25532() && c18026.f53821) {
            C8953 c8953 = this.f27022;
            C17473 c17473 = this.f27018;
            if (c8953 != null) {
                c17473.m39839(c8953);
            } else if (!(c17473.m39840() instanceof C22365)) {
                c17473.m39839(new C22365());
            }
            c17473.mo10031(c18026.f53827, c18026.f53826.m32500());
            if (this.f27019) {
                c18026.f53826.m32474();
            } else {
                c18026.f53826.m32424();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C18026 c18026 = this.f27015;
        if (c18026.f53831 == this && this.f27016.m25532()) {
            C18026.m41013(c18026, exc);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C18026 c18026 = this.f27015;
        try {
            if (this.f27020) {
                this.f27017.m32503();
            }
            if (c18026.f53831 != this || !this.f27016.m25532()) {
                C8953 c8953 = this.f27022;
                if (c8953 != null) {
                    c8953.close();
                }
            } else {
                if (c18026.f53821) {
                    c18026.f53826.m32378(c18026.f53833, false, !c18026.f53825);
                }
            }
        } finally {
            if (this.f27020) {
                c18026.f53817--;
            }
            if (c18026.f53831 == this) {
                c18026.f53831 = null;
                c18026.f53824 = false;
                c18026.f53815 = true;
            }
        }
    }
}
