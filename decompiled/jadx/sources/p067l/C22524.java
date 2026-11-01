package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes5.dex */
public final class C22524 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public C17932 f71019;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C17828 f71020;

    public C22524(C17828 c17828) {
        this.f71020 = c17828;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C17828 c17828 = this.f71020;
        c17828.f53197.setVisibility(0);
        c17828.f53200 = true;
        c17828.f53193 = false;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C17828 c17828 = this.f71020;
        c17828.f53202.m31796();
        if (c17828.f53192) {
            this.f71019 = C17828.m40483(c17828);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C17828 c17828 = this.f71020;
        if (c17828.f53192) {
            c17828.f53203.m19929(this.f71019);
            if (this.f71019 == null) {
                C22682.m50793(R.string.MT_Protector);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C17828 c17828 = this.f71020;
        if (c17828.f53192) {
            c17828.f53193 = true;
            c17828.f53198.m13320((Throwable) exc);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C17828 c17828 = this.f71020;
        if (c17828.f53192) {
            c17828.f53197.setVisibility(8);
        }
        c17828.f53200 = false;
    }
}
