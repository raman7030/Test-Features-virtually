package l;

/* JADX INFO: renamed from: l.۫ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBFE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12122 extends AbstractC14278 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC15834 f36205;

    public C12122(AbstractC15834 abstractC15834, C16395 c16395) {
        super(abstractC15834.m37483(), c16395);
        this.f36205 = abstractC15834;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo29539(AbstractC2988 abstractC2988) {
        C20069 c20069M37479 = this.f36205.m37479();
        C20069 c20069M9122 = abstractC2988.m9122(c20069M37479);
        if (c20069M9122 != c20069M37479) {
            this.f36205 = this.f36205.mo3530(m34042(), c20069M9122);
            m34044().m38618().m47177(this, c20069M37479);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29532(int i, C21480 c21480) {
        C20069 c20069M37479 = this.f36205.m37479();
        int size = c20069M37479.size();
        C20069 c20069 = new C20069(size);
        int i2 = 0;
        while (i2 < size) {
            c20069.m40988(i2, i2 == i ? c21480 : c20069M37479.m41004get(i2));
            i2++;
        }
        c20069.mo20349();
        C21480 c21480M41004get = c20069M37479.m41004get(i);
        if (c21480M41004get.m48652() != c21480.m48652()) {
            m34044().m38618().m47180(this, c21480M41004get, c21480);
        }
        this.f36205 = this.f36205.mo3530(m34042(), c20069);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29534(C20069 c20069) {
        if (this.f36205.m37479().size() != c20069.size()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.f36205 = this.f36205.mo3530(m34042(), c20069);
    }

    @Override // l.AbstractC14278
    public final Object clone() {
        return (C12122) super.clone();
    }

    @Override // l.AbstractC14278
    public final AbstractC14278 clone() {
        return (C12122) super.clone();
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20069 mo29535() {
        return this.f36205.m37479();
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return mo29538().mo2463();
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo29538() {
        return this.f36205.mo3530(m34042(), this.f36205.m37479());
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3135 mo29537() {
        return this.f36205.m37484();
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo29544() {
        C3135 c3135M37484 = this.f36205.m37484();
        if (c3135M37484.m9558() == 1) {
            boolean z = C5772.m16231() && mo29540() != null;
            int iM9562 = c3135M37484.m9562();
            if (iM9562 == 2 || iM9562 == 5 || iM9562 == 55) {
                return z;
            }
        }
        return true;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo29542() {
        return this.f36205;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21480 mo29540() {
        C21480 c21480M34042;
        if (this.f36205.m37484().m9562() == 54) {
            c21480M34042 = this.f36205.m37479().m41004get(0);
        } else {
            c21480M34042 = m34042();
        }
        if (c21480M34042 == null || c21480M34042.m48653() == null) {
            return null;
        }
        return c21480M34042;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m29541() {
        C20069 c20069M37479 = this.f36205.m37479();
        this.f36205 = this.f36205.mo3532();
        m34044().m38618().m47177(this, c20069M37479);
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo29536() {
        return this.f36205.m37484().m9562() == 2;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo29530() {
        return this.f36205.m37484().m9562() == 4;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo29543() {
        return this.f36205.m37481();
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo29533(InterfaceC17101 interfaceC17101) {
        if (mo29536()) {
            interfaceC17101.mo7531(this);
        } else {
            interfaceC17101.mo7534(this);
        }
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo29531() {
        return mo29536();
    }
}
