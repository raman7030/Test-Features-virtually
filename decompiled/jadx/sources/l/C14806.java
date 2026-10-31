package l;

/* JADX INFO: renamed from: l.ܳ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C14806 extends AbstractC23979 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f45199;

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final void mo19027(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, boolean z) {
        C9378 c9378 = (C9378) abstractC5144;
        C9378 c9379 = (C9378) abstractC5145;
        if (z) {
            return;
        }
        C4224 c4224 = this.f77746;
        if (c4224.f13706.m17550(c9378.f16086, c9379.f16086)) {
            c4224.f13703.m7285(c9378, C14001.f42341);
        }
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19028(AbstractC5144 abstractC5144) {
        C9378 c9378 = (C9378) abstractC5144;
        if (c9378.f28489.f17561.f17559 != EnumC1296.f4571 || c9378.f28487 == null || c9378.f28488.f16085 == -1) {
            return false;
        }
        this.f45199.f13708.getClass();
        C10721 c10721 = new C10721();
        c10721.f32305 = null;
        c10721.f32306 = true;
        c10721.mo10758(c9378.f28487);
        return c10721.f32305 == null;
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ۧ */
    public final C2609 mo19029(AbstractC5144 abstractC5144) {
        C9378 c9378 = (C9378) this.f77746.f13705.mo8690(abstractC5144, (Object) null);
        c9378.f28488 = null;
        return C2609.of((Object) c9378);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14806(C4224 c4224) {
        super(c4224, EnumC18550.f57578);
        this.f45199 = c4224;
    }
}
