package p067l;

/* JADX INFO: renamed from: l.ܳ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C16440 extends AbstractC25158 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C6383 f48315;

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final void mo20984(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258, boolean z) {
        C11281 c11281 = (C11281) abstractC7257;
        C11281 c11282 = (C11281) abstractC7258;
        if (z) {
            return;
        }
        C6383 c6383 = this.f80498;
        if (c6383.f16519.m19490(c11281.f18925, c11282.f18925)) {
            c6383.f16516.m9364(c11281, C15675.f45424);
        }
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20985(AbstractC7257 abstractC7257) {
        C11281 c11281 = (C11281) abstractC7257;
        if (c11281.f31438.f20407.f20405 != EnumC3600.f7343 || c11281.f31436 == null || c11281.f31437.f18924 == -1) {
            return false;
        }
        this.f48315.f16521.getClass();
        C12557 c12557 = new C12557();
        c12557.f35279 = null;
        c12557.f35280 = true;
        c12557.mo12739(c11281.f31436);
        return c12557.f35279 == null;
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ۧ */
    public final C4848 mo20986(AbstractC7257 abstractC7257) {
        C11281 c11281 = (C11281) this.f80498.f16518.mo10751(abstractC7257, (Object) null);
        c11281.f31437 = null;
        return C4848.m10276of((Object) c11281);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16440(C6383 c6383) {
        super(c6383, EnumC19998.f60802);
        this.f48315 = c6383;
    }
}
