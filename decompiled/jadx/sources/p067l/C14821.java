package p067l;

/* JADX INFO: renamed from: l.۬۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 35M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14821 extends AbstractC8135 implements InterfaceC5145, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC22991 f42283;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC16954 f42284;

    /* JADX INFO: renamed from: ᩶ */
    public final int f42285;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC16954 f42286;

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ܽ */
    public final int mo10470() {
        return 3;
    }

    public C14821(int i, InterfaceC16954 interfaceC16954, InterfaceC22991 interfaceC22991, InterfaceC16954 interfaceC16955) {
        this.f42285 = i;
        this.f42286 = interfaceC16954;
        this.f42283 = interfaceC22991;
        this.f42284 = interfaceC16955;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ֫ */
    public final int mo10988() {
        return this.f42285;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC16954 mo10991() {
        return this.f42286;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC22991 mo10989() {
        return this.f42283;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC16954 mo10990() {
        return this.f42284;
    }

    @Override // p067l.InterfaceC23250
    public final String getName() {
        InterfaceC16954 interfaceC16954 = this.f42286;
        if (interfaceC16954 == null) {
            return null;
        }
        return interfaceC16954.getString();
    }

    @Override // p067l.InterfaceC23250
    public final String getType() {
        InterfaceC22991 interfaceC22991 = this.f42283;
        if (interfaceC22991 == null) {
            return null;
        }
        return interfaceC22991.getType();
    }

    @Override // p067l.InterfaceC23250
    public final String getSignature() {
        InterfaceC16954 interfaceC16954 = this.f42284;
        if (interfaceC16954 == null) {
            return null;
        }
        return interfaceC16954.getString();
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        InterfaceC16954 interfaceC16954 = this.f42286;
        if (interfaceC16954 != null) {
            this.f42286 = c20765.m46910(interfaceC16954.getString());
        }
        InterfaceC22991 interfaceC22991 = this.f42283;
        if (interfaceC22991 != null) {
            this.f42283 = c20765.f71655.m36581(interfaceC22991.getType());
        }
        InterfaceC16954 interfaceC16955 = this.f42284;
        if (interfaceC16955 != null) {
            this.f42284 = c20765.m46910(interfaceC16955.getString());
        }
    }
}
