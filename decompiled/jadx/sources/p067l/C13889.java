package p067l;

/* JADX INFO: renamed from: l.۫ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBFE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13889 extends AbstractC15938 {

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC17417 f39217;

    public C13889(AbstractC17417 abstractC17417, C17950 c17950) {
        super(abstractC17417.m39655(), c17950);
        this.f39217 = abstractC17417;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۧ */
    public final void mo31604(AbstractC5208 abstractC5208) {
        C21442 c21442M39651 = this.f39217.m39651();
        C21442 c21442M11173 = abstractC5208.m11173(c21442M39651);
        if (c21442M11173 != c21442M39651) {
            this.f39217 = this.f39217.mo5817(m36175(), c21442M11173);
            m36177().m40835().m49504(this, c21442M39651);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31597(int i, C22783 c22783) {
        C21442 c21442M39651 = this.f39217.m39651();
        int size = c21442M39651.size();
        C21442 c21442 = new C21442(size);
        int i2 = 0;
        while (i2 < size) {
            c21442.m43248(i2, i2 == i ? c22783 : c21442M39651.m56524get(i2));
            i2++;
        }
        c21442.mo22326();
        C22783 c22783M56524get = c21442M39651.m56524get(i);
        if (c22783M56524get.m50989() != c22783.m50989()) {
            m36177().m40835().m49507(this, c22783M56524get, c22783);
        }
        this.f39217 = this.f39217.mo5817(m36175(), c21442);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31599(C21442 c21442) {
        if (this.f39217.m39651().size() != c21442.size()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.f39217 = this.f39217.mo5817(m36175(), c21442);
    }

    @Override // p067l.AbstractC15938
    public final Object clone() {
        return (C13889) super.clone();
    }

    @Override // p067l.AbstractC15938
    public final AbstractC15938 clone() {
        return (C13889) super.clone();
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۘ */
    public final C21442 mo31600() {
        return this.f39217.m39651();
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return mo31603().mo4819();
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC17417 mo31603() {
        return this.f39217.mo5817(m36175(), this.f39217.m39651());
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۜ */
    public final C5348 mo31602() {
        return this.f39217.m39656();
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo31609() {
        C5348 c5348M39656 = this.f39217.m39656();
        if (c5348M39656.m11601() == 1) {
            boolean z = C7854.m18150() && mo31605() != null;
            int iM11605 = c5348M39656.m11605();
            if (iM11605 == 2 || iM11605 == 5 || iM11605 == 55) {
                return z;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC17417 mo31607() {
        return this.f39217;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ܳ */
    public final C22783 mo31605() {
        C22783 c22783M36175;
        if (this.f39217.m39656().m11605() == 54) {
            c22783M36175 = this.f39217.m39651().m56524get(0);
        } else {
            c22783M36175 = m36175();
        }
        if (c22783M36175 == null || c22783M36175.m50990() == null) {
            return null;
        }
        return c22783M36175;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m31606() {
        C21442 c21442M39651 = this.f39217.m39651();
        this.f39217 = this.f39217.mo5819();
        m36177().m40835().m49504(this, c21442M39651);
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo31601() {
        return this.f39217.m39656().m11605() == 2;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo31595() {
        return this.f39217.m39656().m11605() == 4;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo31608() {
        return this.f39217.m39653();
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ֫ */
    public final void mo31598(InterfaceC18621 interfaceC18621) {
        if (mo31601()) {
            interfaceC18621.mo9599(this);
        } else {
            interfaceC18621.mo9602(this);
        }
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo31596() {
        return mo31601();
    }
}
