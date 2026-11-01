package p067l;

/* JADX INFO: renamed from: l.ܽܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18273 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final C10898 f54553;

    public C18273(C10898 c10898) {
        this.f54553 = c10898;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 != EnumC24133.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC24133).toString());
        }
        interfaceC24784.getLifecycle().mo21807(this);
        this.f54553.m25130();
    }
}
