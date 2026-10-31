package l;

/* JADX INFO: renamed from: l.ᩴ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C18963 extends AbstractC11349 implements InterfaceC20764 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f59813;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2609 f59814;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2609 f59815;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59816;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC6652 f59817;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC6652 f59812 = EnumC6652.STATEMENT;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC6652 f59811 = EnumC6652.RULE;

    public C18963(EnumC6652 enumC6652, C2609 c2609, C2609 c26010, AbstractC5144 abstractC5144) {
        C12171.m29637(c2609);
        C12171.m29642(c2609.isEmpty() || c2609.f8240 != null);
        this.f59817 = enumC6652;
        this.f59815 = c2609;
        this.f59814 = c26010;
        this.f59813 = abstractC5144;
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1418(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.CASE;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m43779() {
        return (C2609) C5378.stream(this.f59815).filter(new C16628(1)).map(new C18554(10)).collect(C2609.m8240());
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2609 m43778() {
        if (this.f59817 == EnumC6652.STATEMENT) {
            return this.f59814;
        }
        return null;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11827(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57553;
    }
}
