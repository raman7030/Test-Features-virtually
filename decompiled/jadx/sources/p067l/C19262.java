package p067l;

/* JADX INFO: renamed from: l.ᩳۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public class C19262 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C11216 f57562;

    public C19262(C11216 c11216) {
        this.f57562 = c11216;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m43881(AbstractC7257 abstractC7257) {
        if (abstractC7257.f18925 == null) {
            if (abstractC7257.m16617(EnumC19998.f60735)) {
                abstractC7257.f18925 = m43880((C10471) abstractC7257);
            } else {
                abstractC7257.f18925 = this.f57562.f31193.f69201;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C12497 m43880(C10471 c10471) {
        AbstractC14355 abstractC14355;
        C22004 c22004 = this.f57562.f31193;
        AbstractC6462 abstractC6462 = c22004.f69201;
        if (c10471 != null && (abstractC14355 = c10471.f28966) != null && abstractC14355.m16617(EnumC19998.f60720) && ((C5107) c10471.f28966).f11988 == EnumC11353.VOID) {
            abstractC6462 = c22004.f69183;
        }
        return new C12497(C4848.m10283(), abstractC6462, C4848.m10283(), c22004.f69163);
    }

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public void mo12739(AbstractC7257 abstractC7257) {
        if (abstractC7257 == null) {
            return;
        }
        if (abstractC7257 instanceof AbstractC14355) {
            m43881(abstractC7257);
        }
        abstractC7257.mo3382(this);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        if (c9661.f26611 == null) {
            c9661.f26611 = this.f57562.f31193.f69198;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        if (c8320.f22260 == null) {
            c8320.f22260 = this.f57562.f31193.f69198;
        }
        mo12739(c8320.f22261);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3617(C7650 c7650) {
        m43881(c7650);
        if (c7650.f20027 == null) {
            c7650.f20027 = new C15828(0L, c7650.f20021, c7650.f18925, this.f57562.f31193.f69157);
        }
        super.mo3617(c7650);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        m43881(c10471);
        if (c10471.f28960 == null) {
            c10471.f28960 = new C5771(0L, c10471.f28959, c10471.f18925, this.f57562.f31193.f69157);
        }
        super.mo3801(c10471);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        m43881(c11281);
        C13818 c13818 = c11281.f31438;
        C11216 c11216 = this.f57562;
        if (c13818 == null) {
            C13818 c13819 = new C13818(0L, c11281.f31433, c11281.f18925, c11216.f31193.f69157);
            c11281.f31438 = c13819;
            c13819.f39049 = 0;
        }
        if (c11281.f31437 == null) {
            C18537 c18537 = c11216.f31198;
            c18537.f55352 = -1;
            c11281.f31437 = c18537.m42191();
        }
        super.mo3805(c11281);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        m43881(c17707);
        m43881(c17707.f52887);
        C11281 c11281 = c17707.f52887;
        if (c11281.f31438 == null) {
            c11281.f31438 = new C18511(0L, c11281.f31433, c11281.f18925, this.f57562.f31193.f69157);
            c17707.f52887.f31438.f39049 = 0;
        }
        mo12739(c17707.f52887);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        C11216 c11216 = this.f57562;
        C22004 c22004 = c11216.f31193;
        if (c20530.f63427 == null) {
            c20530.f63427 = new C5771(0L, c11216.f31178.f21737, m43880((C10471) null), c22004.f69157);
        }
        if (c20530.f63425 == null) {
            c20530.f63425 = c22004.f69201;
        }
        super.mo3832(c20530);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        if (c11674.f5602 == null) {
            C11216 c11216 = this.f57562;
            c11674.f5602 = new C3088(c11216.f31178.f21725, m43880((C10471) null), -1, c11216.f31193.f69157);
        }
        super.mo3806(c11674);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        if (c11003.f5602 == null) {
            C11216 c11216 = this.f57562;
            c11003.f5602 = new C3088(c11216.f31178.f21725, m43880((C10471) null), -1, c11216.f31193.f69157);
        }
        super.mo3803(c11003);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        if (c8598.f5602 == null) {
            C11216 c11216 = this.f57562;
            c8598.f5602 = new C3088(c11216.f31178.f21725, m43880((C10471) null), -1, c11216.f31193.f69157);
        }
        mo12739(c8598.f23105);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        super.mo3804(c11142);
        if (c11142.f30889 == null) {
            C11216 c11216 = this.f57562;
            c11142.f30889 = new C5771(0L, c11216.f31178.f21725, m43880((C10471) null), c11216.f31193.f69157);
        }
    }
}
