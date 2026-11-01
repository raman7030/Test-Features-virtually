package p067l;

/* JADX INFO: renamed from: l.᩵ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20801 extends AbstractC20130 {

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7257 f65371;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12083 f65372;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
    }

    @Override // p067l.AbstractC20130
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17118() {
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46963(AbstractC7257 abstractC7257) {
        AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC7257);
        if (abstractC7257M21437.m16617(EnumC19998.f60790) || abstractC7257M21437.m16617(EnumC19998.f60805)) {
            AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC7257M21437);
            AbstractC7257 abstractC7258 = this.f65371;
            if (abstractC7258 == null || abstractC7783M21438.f20405 != EnumC3600.f7339 || abstractC7783M21438.f20407.f20405 != EnumC3600.f7343 || ((C13818) abstractC7783M21438).f39051 >= C9268.m21421(abstractC7258)) {
                return;
            }
            switch (C12754.f35819[this.f65371.mo3383().ordinal()]) {
                case 8:
                    C12083 c12083 = this.f65372;
                    if (!c12083.f33662) {
                        C23623 c23623 = c12083.f33667;
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(abstractC7257M21437, new C14040("compiler", "local.var.accessed.from.icls.needs.final", abstractC7783M21438));
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            m46962(abstractC7783M21438, abstractC7257M21437);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46962(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257) {
        C13370 c13370;
        switch (C12754.f35819[this.f65371.mo3383().ordinal()]) {
            case 8:
                c13370 = C13665.f38454;
                break;
            case 9:
                c13370 = C13665.f38514;
                break;
            case 10:
                c13370 = C13665.f38458;
                break;
            default:
                throw new AssertionError("Unexpected tree kind: " + this.f65371.mo3383());
        }
        C12083 c12083 = this.f65372;
        C23623 c23623 = c12083.f33667;
        C18258 c18258M18543 = c12083.f33670.m18543(c13370);
        C14040 c14040 = C8300.f21997;
        c23623.m9352(abstractC7257, new C14040("compiler", "cant.ref.non.effectively.final.var", abstractC7783, c18258M18543));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        AbstractC7257 abstractC7257 = this.f65371;
        try {
            this.f65371 = c7650.f20027.m17996() ? c7650 : null;
            super.mo3617(c7650);
        } finally {
            this.f65371 = abstractC7257;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        AbstractC7257 abstractC7257 = this.f65371;
        try {
            this.f65371 = c15834;
            super.mo3619(c15834);
        } finally {
            this.f65371 = abstractC7257;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3815(C15695 c15695) {
        mo12739(c15695.f45487);
        AbstractC7257 abstractC7257 = this.f65371;
        try {
            this.f65371 = c15695;
            mo12739(c15695.f45486);
        } finally {
            this.f65371 = abstractC7257;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        AbstractC7783 abstractC7783 = c9661.f26611;
        if (abstractC7783.f20405 == EnumC3600.f7339) {
            C13818 c13818 = (C13818) abstractC7783;
            AbstractC7257 abstractC7257 = this.f65371;
            if (abstractC7257 == null || c13818.f20407.f20405 != EnumC3600.f7343 || c13818.f39051 >= C9268.m21421(abstractC7257)) {
                return;
            }
            switch (C12754.f35819[this.f65371.mo3383().ordinal()]) {
                case 8:
                    C12083 c12083 = this.f65372;
                    if (!c12083.f33662) {
                        if ((c13818.f20409 & 16) == 0) {
                            C23623 c23623 = c12083.f33667;
                            C14040 c14040 = C8300.f21997;
                            c23623.m9352(c9661, new C14040("compiler", "local.var.accessed.from.icls.needs.final", c13818));
                            return;
                        }
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            if ((c13818.f20409 & 2199023255568L) == 0) {
                m46962(c13818, c9661);
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        AbstractC14355 abstractC14355M21424 = C9268.m21424(c22403.f70670);
        if (!(abstractC14355M21424 instanceof C9661)) {
            mo12739(abstractC14355M21424);
        }
        mo12739(c22403.f70671);
        m46963(abstractC14355M21424);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        mo12739(c11674.f32571);
        mo12739(c11674.f32570);
        m46963(c11674.f32571);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        int i = C12754.f35819[c8598.mo3383().ordinal()];
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            mo12739(c8598.f23105);
            m46963(c8598.f23105);
        } else {
            mo12739(c8598.f23105);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        AbstractC7783 abstractC7783M21438;
        for (AbstractC7257 abstractC7257 : c12622.f35422) {
            if (!abstractC7257.m16617(EnumC19998.f60802) && (abstractC7783M21438 = C9268.m21438(abstractC7257)) != null && (abstractC7783M21438.mo18003() & 2199023255568L) == 0) {
                C23623 c23623 = this.f65372.f33667;
                C14040 c14040 = C8300.f21997;
                c23623.m9352(abstractC7257, new C14040("compiler", "try.with.resources.expr.effectively.final.var", abstractC7783M21438));
            }
        }
        super.mo3809(c12622);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        mo12739(c4575.f10248);
    }

    public C20801(C12083 c12083) {
        this.f65372 = c12083;
    }
}
