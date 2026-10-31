package l;

/* JADX INFO: renamed from: l.ܿ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C17629 extends AbstractC9163 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f53862;

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final void mo19027(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, boolean z) {
        C19110 c19110 = (C19110) abstractC5144;
        if (z) {
            return;
        }
        this.f53862.f13703.m7285(c19110.f60195, C14001.f42349);
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19028(AbstractC5144 abstractC5144) {
        C19110 c19110 = (C19110) abstractC5144;
        AbstractC4308 abstractC4308 = c19110.f60196.f16086;
        if (c19110.f60195 == null || !abstractC4308.m12913(EnumC9454.CLASS)) {
            return false;
        }
        C6319 c6319 = this.f53862.f13706;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        c6319.getClass();
        try {
            c6319.m17493(abstractC19810);
            return m41219(c19110.f60195).m8245() == 1;
        } catch (C6130 unused) {
            return false;
        }
    }

    @Override // l.AbstractC9163
    /* JADX INFO: renamed from: ۧ */
    public final C2609 mo19029(AbstractC5144 abstractC5144) {
        C19110 c19110 = (C19110) abstractC5144;
        C4224 c4224 = this.f53862;
        C8526 c8526 = (C8526) c4224.f13705.mo8690((AbstractC5144) m41219(c19110.f60195).f8240, (Object) null);
        C2609 c2609 = c8526.f26048;
        C2735 c2735 = c8526.f26043;
        C17013 c17013 = c4224.f13702;
        c17013.m39946((InterfaceC3109) c19110);
        return C2609.of((Object) c17013.m39955(c2735, c2609));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17629(C4224 c4224) {
        super(c4224, EnumC11280.LAMBDA, EnumC18550.f57548);
        this.f53862 = c4224;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ۡ֡۠] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m41219(C5557 c5557) {
        C18837 c18837 = new C18837();
        for (Object obj : c5557.f17179) {
            if (obj.m14709(EnumC18550.f57511)) {
                obj = (C8526) obj;
                if ((obj.f26046.f7169 & 68719476736L) == 0) {
                }
            }
            c18837.m43511(obj);
        }
        return c18837.m43517();
    }
}
