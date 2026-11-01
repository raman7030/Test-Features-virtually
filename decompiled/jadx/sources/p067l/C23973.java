package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23973 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C22198 f76160;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12848 f76161;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ DialogInterfaceC2564 f76162;

    public C23973(C12848 c12848, C22198 c22198, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f76161 = c12848;
        this.f76160 = c22198;
        this.f76162 = dialogInterfaceC2564;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f76161.f36141, 300);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        int i = ServiceC20700.f63919;
        C5947 c5947 = new C5947(0);
        int i2 = C16004.f46352;
        C21180.m47820(this.f76160, new C18687(0, c5947));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f76162;
        C12848 c12848 = this.f76161;
        C12848.m29423(c12848, dialogInterfaceC2564);
        new C13245(c12848).m22250();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C22682.m50795((CharSequence) this.f76161.f36141.getString(R.string.MT_Protector, exc.getMessage()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
