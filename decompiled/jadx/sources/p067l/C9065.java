package p067l;

/* JADX INFO: renamed from: l.ۜ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9065 extends AbstractC25158 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C6383 f24593;

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final void mo20984(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258, boolean z) {
        C11281 c11281 = ((C6979) abstractC7257).f18157;
        C11281 c11282 = ((C6979) abstractC7258).f18157;
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
        return !(((C6979) abstractC7257).f18157.f31437.f18924 == -1);
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ۧ */
    public final C4848 mo20986(AbstractC7257 abstractC7257) {
        C6979 c6979 = (C6979) abstractC7257;
        C6383 c6383 = this.f24593;
        C6979 c69710 = (C6979) c6383.f16518.mo10751((AbstractC7257) c6979, (Object) null);
        C11281 c11281 = (C11281) this.f80498.f16518.mo10751((AbstractC7257) c6979.f18157, (Object) null);
        c11281.f31437 = null;
        c69710.f18157 = c11281;
        C18537 c18537 = c6383.f16515;
        c18537.m42189((InterfaceC5323) c6979.f18156);
        c69710.f18156 = c18537.m42145(0L, C4848.m10283());
        return C4848.m10276of((Object) c69710);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9065(C6383 c6383) {
        super(c6383, EnumC19998.f60705);
        this.f24593 = c6383;
    }
}
