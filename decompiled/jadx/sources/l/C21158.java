package l;

/* JADX INFO: renamed from: l.᩷᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C21158 extends AbstractC9163 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f68213;

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final void mo19027(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, boolean z) {
        C15580 c15580 = (C15580) abstractC5144;
        if (z) {
            return;
        }
        this.f68213.f13703.m7285(c15580, C14001.f42340);
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19028(AbstractC5144 abstractC5144) {
        C2609 c2609 = ((C15580) abstractC5144).f48010;
        return c2609 != null && c2609.m8249();
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ۧ */
    public final C2609 mo19029(AbstractC5144 abstractC5144) {
        C15580 c15580 = (C15580) this.f68213.f13705.mo8690(abstractC5144, (Object) null);
        c15580.f48010 = C2609.m8239();
        return C2609.of((Object) c15580);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21158(C4224 c4224) {
        super(c4224, EnumC11280.METHOD, EnumC18550.f57534);
        this.f68213 = c4224;
    }
}
