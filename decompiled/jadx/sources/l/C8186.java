package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8186 extends AbstractC0204 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1755 f25187;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f25188;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f25189;

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        m21688(c23901.f77274, this.f25186, this.f25188);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        if (c16432.f16086.m12913(EnumC9454.CLASS)) {
            C2609 c2609 = c16432.f50541;
            C2609 c2609Mo12938 = c16432.f16086.f13890.f17560.mo12938();
            AbstractC4308 abstractC4308 = c16432.f16086;
            C15240 c15240 = this.f25189;
            AbstractC4308 abstractC4308M36096 = c15240.m36096(abstractC4308);
            if (abstractC4308M36096 != null) {
                for (AbstractC5144 abstractC5144 : c16432.f50541) {
                    if (abstractC5144.f16086 == abstractC4308M36096) {
                        C22364 c22364 = c15240.f46757;
                        AbstractC4308 abstractC4309 = (AbstractC4308) c2609Mo12938.f8240;
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(abstractC5144, new C12281("compiler", "not.within.bounds", abstractC4308M36096, abstractC4309));
                    }
                    c2609Mo12938 = c2609Mo12938.f8241;
                }
            }
            boolean z = c16432.f16086.f13890.mo16083() == c15240.f46777.f18859;
            for (C2609 c2609Mo12939 = c16432.f16086.f13890.f17560.mo12938(); c2609.m8249() && c2609Mo12939.m8249(); c2609Mo12939 = c2609Mo12939.f8241) {
                m21688((AbstractC5144) c2609.f8240, (this.f25188 && z) ? false : true, false);
                c2609 = c2609.f8241;
            }
            if (c16432.f16086.mo4958().mo12920()) {
                c15240.f46757.m7273(c16432, C6241.f19231);
            }
            if (c16432.f50542.m14709(EnumC18550.f57581)) {
                m21689((C6262) c16432.f50542);
            }
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        boolean z = this.f25188;
        for (C2609 c2609 = c14315.f43170; c2609.m8249(); c2609 = c2609.f8241) {
            m21688((AbstractC5144) c2609.f8240, true, z);
        }
        AbstractC4308 abstractC4308 = c14315.f16086;
        this.f25189.m36124(c14315, new HashMap(), abstractC4308);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        AbstractC5144 abstractC5144 = c15726.f48501;
        if (abstractC5144 != null) {
            m21688(abstractC5144, true, this.f25188);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (c6262.f16086.m12913(EnumC9454.CLASS)) {
            m21689(c6262);
            if (c6262.f19397.f16086.mo12917() && c6262.f16086.f13890.f17560.mo12938().m8249()) {
                this.f25189.f46757.m7273(c6262, C6241.f19304);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21689(C6262 c6262) {
        if (c6262.f16086.f13890.mo15572() && c6262.f19397.f16086.mo12917()) {
            this.f25189.f46757.m7273(c6262, C6241.f19276);
        } else {
            c6262.f19397.mo988(this);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        c18257.f56779.mo988(this);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1373(C2882 c2882) {
        if (c2882.f16086.m12913(EnumC9454.VOID)) {
            this.f25189.f46757.m7273(c2882, C6241.f19153);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21688(AbstractC5144 abstractC5144, boolean z, boolean z2) {
        C15240 c15240 = this.f25189;
        if (abstractC5144 != null) {
            boolean z3 = this.f25186;
            this.f25186 = z;
            this.f25188 = z2;
            try {
                abstractC5144.mo988(this);
                if (z) {
                    c15240.m36135(abstractC5144, this.f25187);
                }
            } catch (C20515 e) {
                c15240.m36110(abstractC5144, e);
            } finally {
                this.f25186 = z3;
            }
        }
    }

    public C8186(C15240 c15240, C1755 c1755) {
        this.f25189 = c15240;
        this.f25187 = c1755;
    }
}
