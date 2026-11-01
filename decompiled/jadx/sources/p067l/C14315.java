package p067l;

import java.util.Iterator;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.۫ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14315 extends AbstractC15655 {

    /* JADX INFO: renamed from: ۗ */
    public C6939 f40907;

    /* JADX INFO: renamed from: ۛ */
    public C14985 f40908;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C12955 f40909;

    /* JADX INFO: renamed from: ۫ */
    public C5598 f40910;

    /* JADX INFO: renamed from: ۬ */
    public C4036 f40911;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۙᩳ۠] */
    public C14315(C12955 c12955) {
        super(c12955, EnumC13844.IMPORTS_PHASE, new C21692(c12955));
        this.f40909 = c12955;
        this.f40907 = new BiConsumer() { // from class: l.ۙᩳ۠
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C12483 c12483 = (C12483) obj;
                C16852 c16852 = this.f18052.f40909.f36426;
                c12483.getClass();
                c16852.m38271(c12483, (C21865) obj2);
            }
        };
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C4036 c4036) {
        C15828 c15828 = c4036.f8855.f20027;
        if (c15828.f20407.f20405 == EnumC3600.f7351) {
            C3626 c3626 = c4036.f8851;
            EnumC19998 enumC19998 = EnumC19998.f60733;
            C4036 c4037 = c4036;
            while (c4037 != null && !c4037.f8850.m16617(enumC19998)) {
                c4037 = c4037.f8848;
            }
            m32886(c3626, c4037);
            this.f40909.f36439.add(c4036);
        }
        AbstractC7783 abstractC7783 = c15828.f20407;
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            abstractC7783.mo18020();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v0, types: [l.ۗᩳ۠] */
    /* JADX WARN: Type inference failed for: r10v1, types: [l.۬ᩳ۠] */
    /* JADX INFO: renamed from: ֫ */
    public void m32886(C3626 c3626, C4036 c4036) {
        if (c3626.f7511.m53832()) {
            return;
        }
        C5598 c5598 = this.f40910;
        C14985 c14985 = this.f40908;
        C12955 c12955 = this.f40909;
        InterfaceC5323 interfaceC5323M44729 = c12955.f36431.m44729();
        C6953 c6953M38273 = c12955.f36426.m38273(c12955.f36436);
        C4036 c4037 = this.f40911;
        try {
            this.f40911 = c4036;
            final C9794 c9794 = c4036.f8851.f7517;
            this.f40910 = new InterfaceC21056() { // from class: l.ۗᩳ۠
                @Override // p067l.InterfaceC21056
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo12403(AbstractC9655 abstractC9655, AbstractC7783 abstractC7783) {
                    C12955 c12956 = this.f13567.f40909;
                    if (!abstractC7783.mo17483()) {
                        return false;
                    }
                    c12956.f36426.getClass();
                    return C16852.m38236(abstractC7783, c9794) && abstractC7783.m17986((AbstractC21195) abstractC9655.f26587, c12956.f36442);
                }
            };
            this.f40908 = new InterfaceC21056() { // from class: l.۬ᩳ۠
                @Override // p067l.InterfaceC21056
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo12403(AbstractC9655 abstractC9655, AbstractC7783 abstractC7783) {
                    if (abstractC7783.f20405 != EnumC3600.f7354) {
                        return false;
                    }
                    this.f42814.f40909.f36426.getClass();
                    return C16852.m38236(abstractC7783, c9794);
                }
            };
            C9794 c9794M49593 = c12955.f36440.m49593(c12955.f36440.f69191, c12955.f36438.f21682);
            c9794M49593.mo18020();
            if (c9794M49593.f27061.m22460() && !c9794M49593.mo17485()) {
                throw new C24769(c12955.f36433.m18543(C13665.f38509).toString());
            }
            C18537 c18537 = c12955.f36425;
            c18537.m42189((InterfaceC5323) c3626);
            AbstractC14355 abstractC14355M42197 = c12955.f36425.m42197(c9794M49593);
            C12483 c12483 = new C12483();
            c12483.f34992 = abstractC14355M42197;
            c12483.f34991 = false;
            c12483.f18924 = c18537.f55352;
            c4036.f8851.f7511.m53831(c12955.f36442, c9794M49593.mo17983(), this.f40908, c12483, this.f40907);
            C5777 c5777M6848 = c3626.m6848();
            if (c3626.m6851() != null && c5777M6848 == null) {
                m32887(c3626.m6851());
            }
            Iterator it = c3626.m6849().iterator();
            while (it.hasNext()) {
                m32888((C12483) it.next());
            }
            if (c5777M6848 != null) {
                C4436 c4436 = c5777M6848.f14184;
                c12955.m29714(c5777M6848.f14182, c4436.f9953, c4036);
                c12955.f36441.m34508(c4436.f9953, c4036, c4036.f8851.f7510, (InterfaceC5323) null);
            }
            this.f40911 = c4037;
            c12955.f36426.m38273(c6953M38273);
            c12955.f36431.m44730(interfaceC5323M44729);
            this.f40910 = c5598;
            this.f40908 = c14985;
        } catch (Throwable th) {
            this.f40911 = c4037;
            c12955.f36426.m38273(c6953M38273);
            c12955.f36431.m44730(interfaceC5323M44729);
            this.f40910 = c5598;
            this.f40908 = c14985;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32887(C9800 c9800) {
        AbstractC14355 abstractC14355 = c9800.f27115;
        C12955 c12955 = this.f40909;
        if (abstractC14355 != null) {
            for (AbstractC7783 abstractC7783 = this.f40911.f8851.f7517; abstractC7783.f20407 != c12955.f36440.f69155; abstractC7783 = abstractC7783.f20407) {
                abstractC7783.f20407.mo18020();
                if (c12955.f36440.m49597(c12955.f36440.m49599(this.f40911.f8851.f7510, abstractC7783.f20407.mo17995()).f27063, abstractC7783.mo17995()) != null) {
                    C23623 c23623 = c12955.f36430;
                    int i = c9800.f18924;
                    C14040 c14040 = C8300.f21997;
                    c23623.m9348(i, new C14040("compiler", "pkg.clashes.with.class.of.same.name", abstractC7783));
                }
            }
        }
        C15099 c15099 = c12955.f36441;
        C4848 c4848 = c9800.f27114;
        C4036 c4036 = this.f40911;
        c15099.m34508(c4848, c4036, c4036.f8851.f7517, (InterfaceC5323) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32888(C12483 c12483) {
        C8320 c8320 = (C8320) c12483.f34992;
        AbstractC12224 abstractC12224M21428 = C9268.m21428(c8320);
        C4036 c4036 = this.f40911;
        C4036 c4036M8087 = c4036.m8087(c12483, c4036.f8849);
        C12955 c12955 = this.f40909;
        C11216 c11216 = c12955.f36427;
        c11216.getClass();
        AbstractC14355 abstractC14355 = ((C8320) c12483.f34992).f22261;
        boolean z = c12483.f34991;
        C17010 c17010 = z ? C17010.f50319 : C17010.f50312;
        C13286 c13286 = AbstractC6462.f16700;
        AbstractC21195 abstractC21195 = c11216.m25939(abstractC14355, c4036M8087, new C24626(c11216, c17010, c13286)).f16705;
        AbstractC12224 abstractC12224 = c12955.f36438.f21693;
        C6939 c6939 = this.f40907;
        if (abstractC12224M21428 == abstractC12224) {
            c12955.f36426.m38295(c8320.f22261);
            if (!z) {
                this.f40911.f8851.f7511.m53831(c12955.f36442, abstractC21195.mo17983(), this.f40908, c12483, this.f40907);
                return;
            } else {
                this.f40911.f8851.f7511.m53831(c12955.f36442, abstractC21195.mo17983(), this.f40910, c12483, c6939);
                return;
            }
        }
        if (!z) {
            C1446.m31704(c12955.f36434);
            C6953 c6953M38273 = c12955.f36426.m38273(c12955.f36443 ? c12955.f36436 : c12955.f36436.m15934(EnumC21706.DEPRECATION, EnumC21706.REMOVAL, EnumC21706.PREVIEW));
            try {
                c12955.f36434 = false;
                C11216 c11217 = c12955.f36427;
                c11217.getClass();
                AbstractC6462 abstractC6462M25963 = c11217.m25963(c8320, c4036M8087, c13286);
                c12955.f36434 = true;
                c12955.f36426.m38273(c6953M38273);
                AbstractC6462 abstractC6462Mo14811 = abstractC6462M25963.mo14811();
                AbstractC21195 abstractC21196 = abstractC6462Mo14811.m14777(EnumC11353.CLASS) ? abstractC6462Mo14811.f16705 : abstractC6462M25963.f16705;
                c12955.f36426.m38295(c8320);
                C4036 c4037 = this.f40911;
                if (abstractC21196.f20405 == EnumC3600.f7354) {
                    c12483.f34990 = c4037.f8851.f7513.m52772(abstractC21196.f20407.mo17983(), abstractC21196.f20407.mo17983(), abstractC21196);
                    return;
                }
                return;
            } catch (Throwable th) {
                c12955.f36434 = true;
                c12955.f36426.m38273(c6953M38273);
                throw th;
            }
        }
        if (abstractC21195.f20405 != EnumC3600.f7354) {
            c12955.f36430.m9359(EnumC21417.RECOVERABLE, c12483, C8300.f21991);
        } else {
            c12483.f34990 = c4036M8087.f8851.f7513.m52771(c12955.f36442, abstractC21195.mo17983(), abstractC12224M21428, this.f40910, c12483, c6939);
        }
        c12955.f36426.m38295(c8320.f22261);
    }
}
