package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9112 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C17828 f24680;

    /* JADX INFO: renamed from: ܳ */
    public boolean f24681;

    /* JADX INFO: renamed from: ᩻ */
    public C17932 f24682;

    public C9112(C17828 c17828) {
        this.f24680 = c17828;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C17828 c17828 = this.f24680;
        c17828.f53197.setVisibility(0);
        c17828.f53200 = true;
        c17828.f53193 = false;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C17828 c17828 = this.f24680;
        c17828.f53202.m31796();
        if (c17828.f53192) {
            if (!c17828.f53195) {
                C12828 c12828M36366 = c17828.m36366(c17828.f53194.m38429());
                if (c12828M36366.m29398()) {
                    C17828.m40479(c17828, C14677.m33572(c12828M36366.m29399()));
                    this.f24681 = true;
                    return;
                }
            }
            c17828.f53195 = false;
            this.f24682 = C17828.m40483(c17828);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C17828 c17828 = this.f24680;
        if (c17828.f53192 && !this.f24681) {
            c17828.f53203.m19929(this.f24682);
            if (this.f24682 == null) {
                C22682.m50793(R.string.MT_Protector);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C17828 c17828 = this.f24680;
        if (c17828.f53192) {
            c17828.f53193 = true;
            c17828.f53198.m13320((Throwable) exc);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C17828 c17828 = this.f24680;
        if (c17828.f53192) {
            c17828.f53197.setVisibility(8);
        }
        c17828.f53200 = false;
    }
}
