package p067l;

/* JADX INFO: renamed from: l.۟ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9599 extends C13623 implements InterfaceC5145, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C4155 f26458;

    /* JADX INFO: renamed from: ۙ */
    public C9384 f26459;

    /* JADX INFO: renamed from: ۬ */
    public C24787 f26460;

    /* JADX INFO: renamed from: ᩶ */
    public C9384 f26461;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9599(C4155 c4155, InterfaceC5145 interfaceC5145) {
        super(c4155, interfaceC5145);
        this.f26458 = c4155;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ֫ */
    public final int mo10988() {
        return ((InterfaceC5145) this.f38333).mo10988();
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC16954 mo10991() {
        C9384 c9384 = this.f26461;
        return c9384 != null ? c9384 : ((InterfaceC5145) this.f38333).mo10991();
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC22991 mo10989() {
        C24787 c24787 = this.f26460;
        if (c24787 != null) {
            return c24787;
        }
        InterfaceC22991 interfaceC22991Mo10989 = ((InterfaceC5145) this.f38333).mo10989();
        if (interfaceC22991Mo10989 == null) {
            return null;
        }
        return new C20508(this.f26458.f9170.m41469(), interfaceC22991Mo10989);
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC16954 mo10990() {
        C9384 c9384 = this.f26459;
        return c9384 != null ? c9384 : ((InterfaceC5145) this.f38333).mo10990();
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        InterfaceC22991 interfaceC22991Mo10989 = mo10989();
        if (interfaceC22991Mo10989 != null) {
            this.f26460 = c20765.f71655.m36581(interfaceC22991Mo10989.getType());
        }
        InterfaceC16954 interfaceC16954Mo10991 = mo10991();
        if (interfaceC16954Mo10991 != null) {
            this.f26461 = c20765.m46910(interfaceC16954Mo10991.getString());
        }
        InterfaceC16954 interfaceC16954Mo10990 = mo10990();
        if (interfaceC16954Mo10990 != null) {
            this.f26459 = c20765.m46910(interfaceC16954Mo10990.getString());
        }
    }
}
