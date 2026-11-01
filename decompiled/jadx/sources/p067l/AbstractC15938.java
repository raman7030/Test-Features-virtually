package p067l;

/* JADX INFO: renamed from: l.ܳۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB9P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15938 implements InterfaceC2940, Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public final C17950 f46121;

    /* JADX INFO: renamed from: ᩹ */
    public C22783 f46122;

    /* JADX INFO: renamed from: ֡ */
    public boolean mo31595() {
        return false;
    }

    /* JADX INFO: renamed from: ֨ */
    public abstract boolean mo31596();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo31598(InterfaceC18621 interfaceC18621);

    /* JADX INFO: renamed from: ۘ */
    public abstract C21442 mo31600();

    /* JADX INFO: renamed from: ۚ */
    public boolean mo31601() {
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public abstract C5348 mo31602();

    /* JADX INFO: renamed from: ۠ */
    public abstract AbstractC17417 mo31603();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo31604(AbstractC5208 abstractC5208);

    /* JADX INFO: renamed from: ܺ */
    public abstract AbstractC17417 mo31607();

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo31608();

    /* JADX INFO: renamed from: ᩵ */
    public abstract boolean mo31609();

    public AbstractC15938(C22783 c22783, C17950 c17950) {
        if (c17950 == null) {
            throw new NullPointerException("block == null");
        }
        this.f46121 = c17950;
        this.f46122 = c22783;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13889 m36170(C3336 c3336, C17950 c17950) {
        return new C13889(c3336, c17950);
    }

    @Override // 
    public AbstractC15938 clone() {
        try {
            return (AbstractC15938) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final C22783 m36175() {
        return this.f46122;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36174(C22783 c22783) {
        this.f46122 = c22783;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17950 m36177() {
        return this.f46121;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36176(int i) {
        C22783 c22783 = this.f46122;
        return c22783 != null && c22783.m50989() == i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36171(int i) {
        C22783 c22783 = this.f46122;
        if (c22783 != null) {
            this.f46122 = c22783.m50983(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36173(C20101 c20101) {
        if (c20101 != this.f46122.m50990()) {
            if (c20101 == null || !c20101.equals(this.f46122.m50990())) {
                this.f46122 = C22783.m50973(this.f46122.m50989(), this.f46122.getType(), c20101);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36172(AbstractC5208 abstractC5208) {
        C22783 c22783 = this.f46122;
        this.f46122 = abstractC5208.mo11174(c22783);
        this.f46121.m40835().m49506(this, c22783);
        mo31604(abstractC5208);
    }

    /* JADX INFO: renamed from: ܳ */
    public C22783 mo31605() {
        C22783 c22783 = this.f46122;
        if (c22783 == null || c22783.m50990() == null) {
            return null;
        }
        return this.f46122;
    }
}
