package p067l;

/* JADX INFO: renamed from: l.ۚ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7158 extends AbstractC11853 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C23663 f18684;

    public final String toString() {
        return "resolveMethodCheck";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m16463(final C4036 c4036, final AbstractC6462 abstractC6462, C2733 c2733) {
        if (abstractC6462.m14792(c2733.f4594)) {
            c2733.m4255(C4848.m10276of((Object) abstractC6462), new InterfaceC5930() { // from class: l.᩵֫۠
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2734) {
                    this.f63579.m16463(c4036, c2734.m4250(abstractC6462), c2734);
                }
            });
            return;
        }
        C23663 c23663 = this.f18684;
        if (c23663.m52669(c4036, c23663.f75323.m19459(abstractC6462), false)) {
            return;
        }
        C15828 c15828 = c4036.f8855.f20027;
        m27162(c4036.f8850, EnumC22837.INACCESSIBLE_VARARGS, c2733, abstractC6462, C23047.m51425(c15828), c15828);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7158(C23663 c23663) {
        super(c23663);
        this.f18684 = c23663;
    }

    @Override // p067l.AbstractC11853, p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public final void mo13089(C4036 c4036, C8788 c8788, C4848 c4848, C4848 c4849, C3686 c3686) {
        super.mo13089(c4036, c8788, c4848, c4849, c3686);
        if (c8788.f23844.m41672()) {
            EnumC15511 enumC15511 = c8788.f23845;
            EnumC15511 enumC15512 = EnumC15511.CHECK;
            C23663 c23663 = this.f18684;
            if (enumC15511 == enumC15512 || !c23663.f75313) {
                m16463(c4036, c23663.f75323.m19455((AbstractC6462) c4849.last()), c8788.f23843);
            }
        }
    }

    @Override // p067l.AbstractC11853
    /* JADX INFO: renamed from: ֫ */
    public final void mo16465(InterfaceC5323 interfaceC5323, boolean z, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C8788 c8788, C3686 c3686) {
        new C19640(this.f18684, abstractC6463, new C2463(this, !c8788.f23844.m41671(), c8788, c3686, z)).mo15456(interfaceC5323, abstractC6462);
    }

    @Override // p067l.AbstractC11853, p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10096 mo13088(C4848 c4848) {
        return new C8911(this.f18684, c4848);
    }
}
