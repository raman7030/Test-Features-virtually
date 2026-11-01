package p067l;

/* JADX INFO: renamed from: l.ۛ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8414 extends AbstractC15119 {

    /* JADX INFO: renamed from: ۧ */
    public C15828 f22560;

    /* JADX INFO: renamed from: ܽ */
    public C4848 f22561;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C24507 f22562;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC7783 f22563;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8414(C24507 c24507, C15828 c15828) {
        super(c24507);
        this.f22562 = c24507;
        this.f22560 = c15828;
        this.f22563 = c15828.f20407;
        this.f22561 = C4848.m10283();
    }

    @Override // p067l.AbstractC15119
    /* JADX INFO: renamed from: ֫ */
    public final void mo18798(C15828 c15828) {
        C4848 c4848 = (C4848) this.f22562.f77541.get(c15828);
        if (c4848 != null) {
            while (c4848.m10293()) {
                C13818 c13818 = (C13818) c4848.f11034;
                C4848 c4849 = this.f22561;
                while (true) {
                    if (c4849.m10293()) {
                        if (c4849.f11034 == c13818) {
                            break;
                        } else {
                            c4849 = c4849.f11035;
                        }
                    } else {
                        this.f22561 = this.f22561.m10290(c13818);
                        break;
                    }
                }
                c4848 = c4848.f11035;
            }
        }
    }

    @Override // p067l.AbstractC15119
    /* JADX INFO: renamed from: ֫ */
    public final void mo18797(AbstractC7783 abstractC7783) {
        EnumC3600 enumC3600 = abstractC7783.f20405;
        if (enumC3600 == EnumC3600.f7339 || enumC3600 == EnumC3600.f7343) {
            AbstractC7783 abstractC7784 = abstractC7783.f20407;
            C24507 c24507 = this.f22562;
            AbstractC7783 abstractC7785 = this.f22563;
            AbstractC7783 abstractC7786 = abstractC7784 != abstractC7785 ? (AbstractC7783) c24507.f77554.get(abstractC7783) : abstractC7783;
            if (abstractC7786 != null && abstractC7786.f20407 == abstractC7785) {
                C13818 c13818 = (C13818) abstractC7786;
                if (c13818.m31487() == null) {
                    for (C4848 c4848 = this.f22561; c4848.m10293(); c4848 = c4848.f11035) {
                        if (c4848.f11034 == c13818) {
                            return;
                        }
                    }
                    this.f22561 = this.f22561.m10290(c13818);
                    return;
                }
                return;
            }
            Object obj = c24507.f77576.f11034;
            if (obj == null || obj == abstractC7783) {
                return;
            }
            mo18797((AbstractC7783) obj);
        }
    }

    @Override // p067l.AbstractC15119, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        Object obj;
        C15828 c15828 = (C15828) c20530.f63427.f20407;
        if (c20530.f63432 == null && c15828.m18006() && (obj = this.f22562.f77576.f11034) != null) {
            mo18797((AbstractC7783) obj);
        }
        super.mo3832(c20530);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        Object obj;
        AbstractC12224 abstractC12224 = c8320.f22259;
        C24507 c24507 = this.f22562;
        if ((abstractC12224 == c24507.f77543.f21744 || c8320.f22259 == c24507.f77543.f21756) && c8320.f22261.f18925.f16705 != this.f22560 && (obj = c24507.f77576.f11034) != null) {
            mo18797((AbstractC7783) obj);
        }
        mo12739(c8320.f22261);
    }

    @Override // p067l.AbstractC15119, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        Object obj;
        AbstractC12224 abstractC12224M21428 = C9268.m21428(c17175.f51143);
        C24507 c24507 = this.f22562;
        if (abstractC12224M21428 == c24507.f77543.f21756 && ((C15828) C9268.m21438(c17175.f51143).f20407).m18006() && !c17175.f51143.m16617(EnumC19998.f60805) && (obj = c24507.f77576.f11034) != null) {
            mo18797((AbstractC7783) obj);
        }
        super.mo3820(c17175);
    }
}
