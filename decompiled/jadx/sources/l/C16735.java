package l;

/* JADX INFO: renamed from: l.ܽܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16735 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8975 f51370;

    public C16735(C8975 c8975) {
        this.f51370 = c8975;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 != EnumC22901.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC22901).toString());
        }
        interfaceC23586.getLifecycle().mo19834(this);
        this.f51370.m23186();
    }
}
