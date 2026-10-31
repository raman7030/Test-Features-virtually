package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22732 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20864 f73433;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11026 f73434;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f73435;

    public C22732(C11026 c11026, C20864 c20864, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f73434 = c11026;
        this.f73433 = c20864;
        this.f73435 = dialogInterfaceC0206;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f73434.f33146, 300);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int i = ServiceC19288.f60689;
        C3765 c3765 = new C3765(0);
        int i2 = C14347.f43261;
        C19793.m45509(this.f73433, new C17170(0, c3765));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f73435;
        C11026 c11026 = this.f73434;
        C11026.m27361(c11026, dialogInterfaceC0206);
        new C11444(c11026).m20274();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C21374.m48459((CharSequence) this.f73434.f33146.getString(R.string.MT_Protector, exc.getMessage()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
