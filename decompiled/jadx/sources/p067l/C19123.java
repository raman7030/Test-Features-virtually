package p067l;

/* JADX INFO: renamed from: l.ܿ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C19123 extends AbstractC11077 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C6383 f57055;

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final void mo20984(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258, boolean z) {
        C20530 c20530 = (C20530) abstractC7257;
        if (z) {
            return;
        }
        this.f57055.f16516.m9364(c20530.f63428, C15675.f45432);
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20985(AbstractC7257 abstractC7257) {
        C20530 c20530 = (C20530) abstractC7257;
        AbstractC6462 abstractC6462 = c20530.f63429.f18925;
        if (c20530.f63428 == null || !abstractC6462.m14777(EnumC11353.CLASS)) {
            return false;
        }
        C8374 c8374 = this.f57055.f16519;
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        c8374.getClass();
        try {
            c8374.m19433(abstractC21195);
            return m43465(c20530.f63428).m10289() == 1;
        } catch (C8194 unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ۧ */
    public final C4848 mo20986(AbstractC7257 abstractC7257) {
        C20530 c20530 = (C20530) abstractC7257;
        C6383 c6383 = this.f57055;
        C10471 c10471 = (C10471) c6383.f16518.mo10751((AbstractC7257) m43465(c20530.f63428).f11034, (Object) null);
        C4848 c4848 = c10471.f28963;
        C4968 c4968 = c10471.f28958;
        C18537 c18537 = c6383.f16515;
        c18537.m42189((InterfaceC5323) c20530);
        return C4848.m10276of((Object) c18537.m42198(c4968, c4848));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19123(C6383 c6383) {
        super(c6383, EnumC13089.LAMBDA, EnumC19998.f60772);
        this.f57055 = c6383;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ۡ֡۠] */
    /* JADX INFO: renamed from: ֫ */
    public static C4848 m43465(C7650 c7650) {
        C20271 c20271 = new C20271();
        for (Object obj : c7650.f20020) {
            if (obj.m16617(EnumC19998.f60735)) {
                obj = (C10471) obj;
                if ((obj.f28961.f9954 & 68719476736L) == 0) {
                }
            }
            c20271.m45777(obj);
        }
        return c20271.m45783();
    }
}
