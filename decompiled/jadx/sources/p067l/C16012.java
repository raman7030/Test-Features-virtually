package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public class C16012 implements InterfaceC3272 {

    /* JADX INFO: renamed from: ۙ */
    public AbstractC6462 f46378;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21378 f46379;

    /* JADX INFO: renamed from: ᩸ */
    public C15828 f46380;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC10564 f46381;

    public C16012(C21378 c21378, C15828 c15828) {
        this.f46379 = c21378;
        this.f46380 = c15828;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX INFO: renamed from: ۧ */
    public final C17939 m36391(C4614 c4614) {
        C21378 c21378;
        C23623 c23623;
        InterfaceC19740 interfaceC19740M9363;
        C5771 c5771;
        AbstractC6462 abstractC6462M36389 = m36389(c4614.f29256);
        C20271 c20271 = new C20271();
        C4848 c4848 = c4614.f10344;
        while (true) {
            C21865 c21865 = null;
            if (!c4848.m10293()) {
                return new C17939(abstractC6462M36389, c20271.m45783(), null);
            }
            AbstractC12224 abstractC12224 = (AbstractC12224) ((C24293) c4848.f11034).f76952;
            try {
                Iterator it = abstractC6462M36389.f16705.mo17983().m22456(abstractC12224).iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                        if (abstractC7783.f20405 == EnumC3600.f7343 && abstractC7783.f20406.mo14797().m10289() == 0) {
                            c5771 = (C5771) abstractC7783;
                        }
                        c21378 = this.f46379;
                        c23623 = c21378.f67388;
                        C22004 c22004 = c21378.f67412;
                        interfaceC19740M9363 = c23623.m9363(this.f46380.f45854);
                        try {
                            if (c21378.f67395) {
                                if (c21865 == null) {
                                    C12895 c12895 = C15675.f45417;
                                    c23623.m9354(new C12895("compiler", "annotation.method.not.found", abstractC6462M36389, abstractC12224));
                                } else {
                                    C18258 c18258M49312 = c21865.m49312();
                                    C12895 c12896 = C15675.f45417;
                                    c23623.m9354(new C12895("compiler", "annotation.method.not.found.reason", abstractC6462M36389, abstractC12224, c18258M49312));
                                }
                            }
                            c23623.m9363(interfaceC19740M9363);
                            c5771 = new C5771(1025L, abstractC12224, new C12497(C4848.m10283(), c22004.f69204, C4848.m10283(), c22004.f69163), abstractC6462M36389.f16705);
                        } catch (Throwable th) {
                            c23623.m9363(interfaceC19740M9363);
                            throw th;
                        }
                    } else {
                        c21378 = this.f46379;
                        c23623 = c21378.f67388;
                        C22004 c22005 = c21378.f67412;
                        interfaceC19740M9363 = c23623.m9363(this.f46380.f45854);
                        if (c21378.f67395) {
                            if (c21865 == null) {
                                C12895 c12897 = C15675.f45417;
                                c23623.m9354(new C12895("compiler", "annotation.method.not.found", abstractC6462M36389, abstractC12224));
                            } else {
                                C18258 c18258M49313 = c21865.m49312();
                                C12895 c12898 = C15675.f45417;
                                c23623.m9354(new C12895("compiler", "annotation.method.not.found.reason", abstractC6462M36389, abstractC12224, c18258M49313));
                            }
                        }
                        c23623.m9363(interfaceC19740M9363);
                        c5771 = new C5771(1025L, abstractC12224, new C12497(C4848.m10283(), c22005.f69204, C4848.m10283(), c22005.f69163), abstractC6462M36389.f16705);
                    }
                    c20271.m45777(new C24293(c5771, m36390(c5771.f20406.mo14787(), (AbstractC10564) ((C24293) c4848.f11034).f76953)));
                    c4848 = c4848.f11035;
                }
            } catch (C21865 e) {
                c21865 = e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10564 m36390(AbstractC6462 abstractC6462, AbstractC10564 abstractC10564) {
        AbstractC6462 abstractC6463 = this.f46378;
        try {
            this.f46378 = abstractC6462;
            abstractC10564.mo7611(this);
            return this.f46381;
        } finally {
            this.f46378 = abstractC6463;
        }
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26029(C19281 c19281) {
        this.f46381 = c19281;
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26025(C12576 c12576) {
        this.f46381 = c12576;
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26028(C18610 c18610) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26027(C17939 c17939) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26024(C3858 c3858) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26026(C15927 c15927) {
        throw new AssertionError();
    }

    @Override // p067l.InterfaceC3272
    /* JADX INFO: renamed from: ֫ */
    public final void mo5687(C5955 c5955) {
        C13818 c13818;
        AbstractC6462 abstractC6462 = c5955.f14713;
        AbstractC12224 abstractC12224 = c5955.f14714;
        AbstractC21195 abstractC21195 = m36389(abstractC6462).f16705;
        C13818 c13819 = null;
        try {
            Iterator it = abstractC21195.mo17983().m22456(abstractC12224).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c13818 = null;
                    break;
                }
                AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                if (abstractC7783.f20405 == EnumC3600.f7339) {
                    c13818 = (C13818) abstractC7783;
                    break;
                }
            }
            e = null;
            c13819 = c13818;
        } catch (C21865 e) {
            e = e;
        }
        if (c13819 == null) {
            C21378 c21378 = this.f46379;
            if (e != null) {
                C23623 c23623 = c21378.f67388;
                InterfaceC19740 interfaceC19740 = c21378.f67397;
                C18258 c18258M49312 = e.m49312();
                C12895 c12895 = C15675.f45417;
                c23623.m9354(new C12895("compiler", "unknown.enum.constant.reason", interfaceC19740, abstractC21195, abstractC12224, c18258M49312));
            } else {
                C23623 c23624 = c21378.f67388;
                InterfaceC19740 interfaceC19741 = c21378.f67397;
                C12895 c12896 = C15675.f45417;
                c23624.m9354(new C12895("compiler", "unknown.enum.constant", interfaceC19741, abstractC21195, abstractC12224));
            }
            this.f46381 = new C18610(abstractC21195.f20406, new C13818(0L, c5955.f14714, c21378.f67412.f69204, abstractC21195));
            return;
        }
        this.f46381 = new C18610(abstractC21195.f20406, c13819);
    }

    @Override // p067l.InterfaceC3272
    /* JADX INFO: renamed from: ֫ */
    public final void mo5688(C11320 c11320) {
        this.f46381 = new C12576(m36389(c11320.f31520), this.f46379.f67398);
    }

    @Override // p067l.InterfaceC3272
    /* JADX INFO: renamed from: ֫ */
    public final void mo5689(C24730 c24730) {
        C4848 c4848 = c24730.f78296;
        AbstractC10564[] abstractC10564Arr = new AbstractC10564[c4848.m10289()];
        AbstractC6462 abstractC6462M19455 = this.f46379.f67398.m19455(this.f46378);
        int i = 0;
        while (c4848.m10293()) {
            abstractC10564Arr[i] = m36390(abstractC6462M19455, (AbstractC10564) c4848.f11034);
            c4848 = c4848.f11035;
            i++;
        }
        this.f46381 = new C3858(this.f46378, abstractC10564Arr);
    }

    @Override // p067l.InterfaceC3272
    /* JADX INFO: renamed from: ֫ */
    public final void mo5686(C4614 c4614) {
        this.f46381 = m36391(c4614);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m36389(AbstractC6462 abstractC6462) {
        if (!(abstractC6462 instanceof C7296)) {
            return abstractC6462;
        }
        C7296 c7296 = (C7296) abstractC6462;
        C15828 c15828 = this.f46380;
        C1446.m31704(c15828.f20407.f20405 == EnumC3600.f7340);
        C21378 c21378 = this.f46379;
        C2417 c2417 = c21378.f67424;
        c21378.f67424 = (C2417) c15828.f20407;
        try {
            return c7296.m16846();
        } finally {
            c21378.f67424 = c2417;
        }
    }
}
