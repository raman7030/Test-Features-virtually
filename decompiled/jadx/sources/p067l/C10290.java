package p067l;

/* JADX INFO: renamed from: l.۠ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10290 extends AbstractC11632 implements InterfaceC5145, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public final String f28462;

    /* JADX INFO: renamed from: ۙ */
    public final int f28463;

    /* JADX INFO: renamed from: ۤ */
    public C24787 f28464;

    /* JADX INFO: renamed from: ۫ */
    public final String f28465;

    /* JADX INFO: renamed from: ۬ */
    public C9384 f28466;

    /* JADX INFO: renamed from: ᩶ */
    public C9384 f28467;

    /* JADX INFO: renamed from: ᩹ */
    public final String f28468;

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ܽ */
    public final int mo10470() {
        return 3;
    }

    public C10290(String str, int i, String str2, String str3, int i2) {
        super(i);
        this.f28463 = i2;
        this.f28468 = str;
        this.f28465 = str2;
        this.f28462 = str3;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ֫ */
    public final int mo10988() {
        return this.f28463;
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC16954 mo10991() {
        C9384 c9384 = this.f28467;
        if (c9384 != null) {
            return c9384;
        }
        if (this.f28468 == null) {
            return null;
        }
        return new C2913(this);
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC22991 mo10989() {
        C24787 c24787 = this.f28464;
        if (c24787 != null) {
            return c24787;
        }
        if (this.f28465 == null) {
            return null;
        }
        return new C7608(this);
    }

    @Override // p067l.InterfaceC5145
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC16954 mo10990() {
        C9384 c9384 = this.f28466;
        if (c9384 != null) {
            return c9384;
        }
        if (this.f28462 == null) {
            return null;
        }
        return new C3584(this);
    }

    @Override // p067l.InterfaceC23250
    public final String getName() {
        return this.f28468;
    }

    @Override // p067l.InterfaceC23250
    public final String getType() {
        return this.f28465;
    }

    @Override // p067l.InterfaceC23250
    public final String getSignature() {
        return this.f28462;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f28467 = c20765.m46902(this.f28468);
        this.f28466 = c20765.m46902(this.f28462);
        String str = this.f28465;
        this.f28464 = str != null ? c20765.f71655.m36581(str) : null;
    }
}
