package p067l;

/* JADX INFO: renamed from: l.ᩴ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C20391 extends AbstractC13154 implements InterfaceC22102 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC7257 f63042;

    /* JADX INFO: renamed from: ۛ */
    public C4848 f63043;

    /* JADX INFO: renamed from: ۤ */
    public C4848 f63044;

    /* JADX INFO: renamed from: ۫ */
    public boolean f63045;

    /* JADX INFO: renamed from: ۬ */
    public final EnumC8690 f63046;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC8690 f63041 = EnumC8690.STATEMENT;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC8690 f63040 = EnumC8690.RULE;

    public C20391(EnumC8690 enumC8690, C4848 c4848, C4848 c4849, AbstractC7257 abstractC7257) {
        C1446.m31699(c4848);
        C1446.m31704(c4848.isEmpty() || c4848.f11034 != null);
        this.f63046 = enumC8690;
        this.f63044 = c4848;
        this.f63043 = c4849;
        this.f63042 = abstractC7257;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3831(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.CASE;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final C4848 m46046() {
        return (C4848) C7480.stream(this.f63044).filter(new C18172(1)).map(new C20002(10)).collect(C4848.m10284());
    }

    /* JADX INFO: renamed from: ۗ */
    public final C4848 m46045() {
        if (this.f63046 == EnumC8690.STATEMENT) {
            return this.f63043;
        }
        return null;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13763(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60777;
    }
}
