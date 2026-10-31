package l;

/* JADX INFO: renamed from: l.ᩳ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17719 implements InterfaceC9330 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f54205 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17013 f54206;

    public C17719(C17013 c17013) {
        this.f54206 = c17013;
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24020(C17796 c17796) {
        this.f54205 = this.f54206.m39944(c17796.f26338.mo3258(), c17796.f54417);
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24016(C10741 c10741) {
        AbstractC4308 abstractC4308 = c10741.f32362;
        C17013 c17013 = this.f54206;
        C6262 c6262M39911 = c17013.m39911(c17013.m39965(abstractC4308), new C12048(25L, c17013.f52170.f18894, abstractC4308, abstractC4308.f13890));
        c6262M39911.f16086 = c17013.f52174.f66514;
        this.f54205 = c6262M39911;
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24019(C17090 c17090) {
        this.f54205 = this.f54206.m39954(c17090.f52397);
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24017(C14267 c14267) {
        boolean z = c14267 instanceof C20619;
        C17013 c17013 = this.f54206;
        if (z) {
            C12193 c12193 = ((C20619) c14267).f66338;
            C6262 c6262M39911 = c17013.m39911(c17013.m39965(c12193), new C12048(25L, c17013.f52170.f18894, c12193, c12193.f13890));
            c6262M39911.f16086 = c17013.f52174.f66514;
            this.f54205 = c6262M39911;
            return;
        }
        this.f54205 = c17013.m39948();
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24018(C16384 c16384) {
        if (c16384 instanceof C6507) {
            this.f54205 = m41496((C6507) c16384);
        } else {
            this.f54205 = m41497(c16384);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17551 m41497(C16384 c16384) {
        C18837 c18837 = new C18837();
        C2609 c2609 = c16384.f50417;
        while (true) {
            boolean zM8249 = c2609.m8249();
            C17013 c17013 = this.f54206;
            if (zM8249) {
                C23069 c23069 = (C23069) c2609.f8240;
                ((AbstractC8624) c23069.f74208).mo5382(this);
                AbstractC12612 abstractC12612 = this.f54205;
                C21080 c21080M39941 = c17013.m39941((AbstractC12612) c17013.m39914((AbstractC5698) c23069.f74207), abstractC12612);
                c21080M39941.f16086 = abstractC12612.f16086;
                c18837.m43511(c21080M39941);
                c2609 = c2609.f8241;
            } else {
                return c17013.m39932((AbstractC5144) c17013.m39965(c16384.f26338), c18837.m43517());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17551 m41496(C6507 c6507) {
        C18837 c18837 = new C18837();
        C2609 c2609 = c6507.f50417;
        while (true) {
            boolean zM8249 = c2609.m8249();
            C17013 c17013 = this.f54206;
            if (zM8249) {
                C23069 c23069 = (C23069) c2609.f8240;
                ((AbstractC8624) c23069.f74208).mo5382(this);
                AbstractC12612 abstractC12612 = this.f54205;
                C21080 c21080M39941 = c17013.m39941((AbstractC12612) c17013.m39914((AbstractC5698) c23069.f74207), abstractC12612);
                c21080M39941.f16086 = abstractC12612.f16086;
                c18837.m43511(c21080M39941);
                c2609 = c2609.f8241;
            } else {
                return c17013.m39966((AbstractC5144) c17013.m39965(c6507.f26338), c18837.m43517());
            }
        }
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24015(C1568 c1568) {
        C18837 c18837 = new C18837();
        int i = 0;
        while (true) {
            AbstractC8624[] abstractC8624Arr = c1568.f5564;
            if (i >= abstractC8624Arr.length) {
                C18404 c18404M39958 = this.f54206.m39958(null, C2609.m8239(), c18837.m43517());
                c18404M39958.f16086 = c1568.f26338;
                this.f54205 = c18404M39958;
                return;
            }
            abstractC8624Arr[i].mo5382(this);
            c18837.m43511(this.f54205);
            i++;
        }
    }
}
