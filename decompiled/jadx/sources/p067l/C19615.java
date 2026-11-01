package p067l;

/* JADX INFO: renamed from: l.ᩳܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19615 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩶ */
    public final String f59654;

    /* JADX INFO: renamed from: ᩸ */
    public final C12910 f59655;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f59656;

    /* JADX INFO: renamed from: ֫ */
    public final void m44516(AbstractC9381 abstractC9381, C16841 c16841) {
        C13045.m29867(c16841, "registry");
        C13045.m29867(abstractC9381, "lifecycle");
        if (this.f59656) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f59656 = true;
        abstractC9381.mo21806(this);
        c16841.m38200(this.f59654, this.f59655.m29583());
    }

    public C19615(String str, C12910 c12910) {
        this.f59654 = str;
        this.f59655 = c12910;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12910 m44515() {
        return this.f59655;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44517() {
        return this.f59656;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            this.f59656 = false;
            interfaceC24784.getLifecycle().mo21807(this);
        }
    }
}
