package l;

/* JADX INFO: renamed from: l.ۜ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7046 extends AbstractC23979 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f21712;

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19027(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, boolean z) {
        C9378 c9378 = ((C4851) abstractC5144).f15325;
        C9378 c9379 = ((C4851) abstractC5145).f15325;
        if (z) {
            return;
        }
        C4224 c4224 = this.f77746;
        if (c4224.f13706.m17550(c9378.f16086, c9379.f16086)) {
            c4224.f13703.m7285(c9378, C14001.f42341);
        }
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo19028(AbstractC5144 abstractC5144) {
        return !(((C4851) abstractC5144).f15325.f28488.f16085 == -1);
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 mo19029(AbstractC5144 abstractC5144) {
        C4851 c4851 = (C4851) abstractC5144;
        C4224 c4224 = this.f21712;
        C4851 c4852 = (C4851) c4224.f13705.mo8690((AbstractC5144) c4851, (Object) null);
        C9378 c9378 = (C9378) this.f77746.f13705.mo8690((AbstractC5144) c4851.f15325, (Object) null);
        c9378.f28488 = null;
        c4852.f15325 = c9378;
        C17013 c17013 = c4224.f13702;
        c17013.m39946((InterfaceC3109) c4851.f15324);
        c4852.f15324 = c17013.m39902(0L, C2609.m8239());
        return C2609.of((Object) c4852);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7046(C4224 c4224) {
        super(c4224, EnumC18550.f57481);
        this.f21712 = c4224;
    }
}
