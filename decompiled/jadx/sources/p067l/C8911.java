package p067l;

/* JADX INFO: renamed from: l.ۜܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8911 implements InterfaceC10096 {

    /* JADX INFO: renamed from: ֫ */
    public C4848 f24149;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23663 f24150;

    public C8911(C23663 c23663, C4848 c4848) {
        this.f24150 = c23663;
        this.f24149 = c4848;
    }

    @Override // p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public final void mo13089(C4036 c4036, C8788 c8788, C4848 c4848, C4848 c4849, C3686 c3686) {
        AbstractC7783 abstractC7783 = c8788.f23847;
        int iM10289 = c4848.m10289();
        boolean zM41672 = c8788.f23844.m41672();
        C23663 c23663 = this.f24150;
        C4848 c4848M52639 = c23663.m52639(c4849, abstractC7783, iM10289, zM41672);
        while (c4848M52639.m10293()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848M52639.f11034;
            AbstractC6462 abstractC6463 = (AbstractC6462) this.f24149.f11034;
            C11216 c11216 = c23663.f75339;
            C12826.requireNonNull(c11216);
            C17010 c17010 = C17010.f50314;
            C25004 c25004 = new C25004(this, c8788, c3686, abstractC6463);
            EnumC23995 enumC23995 = EnumC23995.f76209;
            c11216.f31163.m38267((InterfaceC5323) null, (AbstractC6462) c4848.f11034, abstractC6462, c25004);
            c4848 = c4848.f11035;
            c4848M52639 = c4848M52639.f11035;
            this.f24149 = this.f24149.isEmpty() ? this.f24149 : this.f24149.f11035;
        }
    }

    @Override // p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10096 mo13088(C4848 c4848) {
        C1446.m31702("Cannot get here!");
        throw null;
    }
}
