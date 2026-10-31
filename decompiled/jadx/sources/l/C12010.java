package l;

/* JADX INFO: renamed from: l.ۨ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12010 extends C17375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13669 f35955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12136 f35956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3917 f35957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6615 f35958;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29359(C6615 c6615) {
        this.f35958 = c6615;
        this.f35957 = c6615.f6339;
        this.f35955 = null;
        this.f35956 = null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m29366(EnumC17734 enumC17734) {
        this.f35955 = null;
        this.f35956 = null;
        m40720(enumC17734);
        C12136 c12136 = this.f35956;
        if (c12136 != null) {
            throw c12136;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13669 m29363() {
        return this.f35955;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m29357(EnumC17734 enumC17734) {
        C6615 c6615 = this.f35958;
        if (c6615.f20355 != EnumC15204.f46543) {
            this.f35956 = C19462.m44860(this.f35957, c6615.f20363, "Incorrect TypeAnnotation \"{0}\" argument: (expected Integer),  \"{1}\"", new Object[]{enumC17734.m41546(), this.f35958.f20355});
            return -1;
        }
        int i = c6615.f20360;
        try {
            c6615.m18126();
            return i;
        } catch (C12136 e) {
            this.f35956 = e;
            return i;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m29358() {
        return this.f35956 != null;
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo29370(EnumC17734 enumC17734) {
        this.f35957.m45778("Type Param Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C22842(enumC17734, iM29357);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo29371(EnumC17734 enumC17734) {
        this.f35957.m45778("SuperType Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C12259(enumC17734, iM29357);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo29361(EnumC17734 enumC17734) {
        this.f35957.m45778("TypeParam Bound Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        int iM29358 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C11554(enumC17734, iM29357, iM29358);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo29367(EnumC17734 enumC17734) {
        this.f35957.m45778("Empty Target: ", new Object[0]);
        if (m29358()) {
            return;
        }
        this.f35955 = new C21432(enumC17734);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo29368(EnumC17734 enumC17734) {
        this.f35957.m45778("MethodParam Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C22137(enumC17734, iM29357);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo29360(EnumC17734 enumC17734) {
        this.f35957.m45778("Throws Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C10143(enumC17734, iM29357);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo29369(EnumC17734 enumC17734) {
        this.f35957.m45778("LocalVar Target: ", new Object[0]);
        C3087 c3087 = new C3087(enumC17734, 0);
        this.f35955 = c3087;
        do {
            C6615 c6615 = this.f35958;
            EnumC15204 enumC15204 = c6615.f20355;
            if (enumC15204 == EnumC15204.f46554 || enumC15204 == EnumC15204.f46442) {
                return;
            }
            try {
                c6615.m18132(EnumC15204.f46642);
            } catch (C12136 e) {
                this.f35956 = e;
            }
            if (m29358()) {
                return;
            }
            int iM29357 = m29357(enumC17734);
            if (m29358()) {
                return;
            }
            int iM29358 = m29357(enumC17734);
            if (m29358()) {
                return;
            }
            c3087.m9437(iM29357, iM29358, m29357(enumC17734));
            try {
                this.f35958.m18132(EnumC15204.f46442);
            } catch (C12136 e2) {
                this.f35956 = e2;
            }
        } while (!m29358());
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo29364(EnumC17734 enumC17734) {
        this.f35957.m45778("Catch Target: ", new Object[0]);
        this.f35955 = new C15080(enumC17734, m29357(enumC17734));
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo29365(EnumC17734 enumC17734) {
        this.f35957.m45778("Offset Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C12964(enumC17734, iM29357);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo29362(EnumC17734 enumC17734) {
        this.f35957.m45778("TypeArg Target: ", new Object[0]);
        int iM29357 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        int iM29358 = m29357(enumC17734);
        if (m29358()) {
            return;
        }
        this.f35955 = new C5909(enumC17734, iM29357, iM29358);
    }
}
