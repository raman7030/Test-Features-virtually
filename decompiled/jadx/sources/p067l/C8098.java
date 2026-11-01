package p067l;

/* JADX INFO: renamed from: l.ۛۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8098 extends AbstractC15119 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9085 f21355;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C19814 f21356;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8098(C9085 c9085, C24507 c24507, C19814 c19814) {
        super(c24507);
        this.f21355 = c9085;
        this.f21356 = c19814;
    }

    @Override // p067l.AbstractC15119
    /* JADX INFO: renamed from: ֫ */
    public final void mo18798(C15828 c15828) {
        this.f21355.m21027(c15828, this.f21356);
    }

    @Override // p067l.AbstractC15119
    /* JADX INFO: renamed from: ֫ */
    public final void mo18797(AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7783.f20407.f20405 == EnumC3600.f7343 && ((C13818) abstractC7783).m31487() == null) {
            C9085 c9085 = this.f21355;
            for (AbstractC25178 abstractC25178M21025 = c9085.m21025(); abstractC25178M21025 != null; abstractC25178M21025 = abstractC25178M21025.f80541) {
                if (abstractC25178M21025.f80538.mo3383() == EnumC19998.f60747) {
                    if (c9085.m21006(abstractC25178M21025.f80537, abstractC7783) == null) {
                        return;
                    } else {
                        ((C19814) abstractC25178M21025).m45053(abstractC7783, EnumC22497.CAPTURED_VAR);
                    }
                }
            }
        }
    }
}
