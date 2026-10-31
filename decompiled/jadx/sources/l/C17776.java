package l;

/* JADX INFO: renamed from: l.ᩳۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public class C17776 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f54368;

    public C17776(C9310 c9310) {
        this.f54368 = c9310;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41635(AbstractC5144 abstractC5144) {
        if (abstractC5144.f16086 == null) {
            if (abstractC5144.m14709(EnumC18550.f57511)) {
                abstractC5144.f16086 = m41634((C8526) abstractC5144);
            } else {
                abstractC5144.f16086 = this.f54368.f28244.f66519;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C10658 m41634(C8526 c8526) {
        AbstractC12612 abstractC12612;
        C20661 c20661 = this.f54368.f28244;
        AbstractC4308 abstractC4308 = c20661.f66519;
        if (c8526 != null && (abstractC12612 = c8526.f26051) != null && abstractC12612.m14709(EnumC18550.f57496) && ((C2882) c8526.f26051).f9190 == EnumC9454.VOID) {
            abstractC4308 = c20661.f66501;
        }
        return new C10658(C2609.m8239(), abstractC4308, C2609.m8239(), c20661.f66481);
    }

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public void mo10758(AbstractC5144 abstractC5144) {
        if (abstractC5144 == null) {
            return;
        }
        if (abstractC5144 instanceof AbstractC12612) {
            m41635(abstractC5144);
        }
        abstractC5144.mo988(this);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        if (c7673.f23697 == null) {
            c7673.f23697 = this.f54368.f28244.f66516;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (c6262.f19396 == null) {
            c6262.f19396 = this.f54368.f28244.f66516;
        }
        mo10758(c6262.f19397);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1215(C5557 c5557) {
        m41635(c5557);
        if (c5557.f17186 == null) {
            c5557.f17186 = new C14163(0L, c5557.f17180, c5557.f16086, this.f54368.f28244.f66475);
        }
        super.mo1215(c5557);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        m41635(c8526);
        if (c8526.f26045 == null) {
            c8526.f26045 = new C3581(0L, c8526.f26044, c8526.f16086, this.f54368.f28244.f66475);
        }
        super.mo1388(c8526);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        m41635(c9378);
        C12048 c12048 = c9378.f28489;
        C9310 c9310 = this.f54368;
        if (c12048 == null) {
            C12048 c12049 = new C12048(0L, c9378.f28484, c9378.f16086, c9310.f28244.f66475);
            c9378.f28489 = c12049;
            c12049.f36038 = 0;
        }
        if (c9378.f28488 == null) {
            C17013 c17013 = c9310.f28249;
            c17013.f52172 = -1;
            c9378.f28488 = c17013.m39948();
        }
        super.mo1392(c9378);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        m41635(c16139);
        m41635(c16139.f49721);
        C9378 c9378 = c16139.f49721;
        if (c9378.f28489 == null) {
            c9378.f28489 = new C16986(0L, c9378.f28484, c9378.f16086, this.f54368.f28244.f66475);
            c16139.f49721.f28489.f36038 = 0;
        }
        mo10758(c16139.f49721);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        C9310 c9310 = this.f54368;
        C20661 c20661 = c9310.f28244;
        if (c19110.f60194 == null) {
            c19110.f60194 = new C3581(0L, c9310.f28229.f18879, m41634((C8526) null), c20661.f66475);
        }
        if (c19110.f60192 == null) {
            c19110.f60192 = c20661.f66519;
        }
        super.mo1419(c19110);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        if (c9791.f2830 == null) {
            C9310 c9310 = this.f54368;
            c9791.f2830 = new C0758(c9310.f28229.f18867, m41634((C8526) null), -1, c9310.f28244.f66475);
        }
        super.mo1393(c9791);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        if (c9085.f2830 == null) {
            C9310 c9310 = this.f54368;
            c9085.f2830 = new C0758(c9310.f28229.f18867, m41634((C8526) null), -1, c9310.f28244.f66475);
        }
        super.mo1390(c9085);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        if (c6555.f2830 == null) {
            C9310 c9310 = this.f54368;
            c6555.f2830 = new C0758(c9310.f28229.f18867, m41634((C8526) null), -1, c9310.f28244.f66475);
        }
        mo10758(c6555.f20226);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        super.mo1391(c9232);
        if (c9232.f27943 == null) {
            C9310 c9310 = this.f54368;
            c9232.f27943 = new C3581(0L, c9310.f28229.f18867, m41634((C8526) null), c9310.f28244.f66475);
        }
    }
}
