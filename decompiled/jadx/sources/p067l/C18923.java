package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܿܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18923 extends AbstractC15079 {

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f56466 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f56467;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6463 = (AbstractC6462) obj;
        boolean z = true;
        switch (C12889.f36249[abstractC6462.mo5577().ordinal()]) {
            case 3:
                return Boolean.valueOf(!abstractC6463.m14777(EnumC11353.CHAR) && abstractC6462.mo5577().m26309(abstractC6463.mo5577()));
            case 4:
                return Boolean.valueOf(!abstractC6463.m14777(EnumC11353.SHORT) && abstractC6462.mo5577().m26309(abstractC6463.mo5577()));
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC6462.mo5577().m26309(abstractC6463.mo5577()));
            case 10:
            case 11:
                return Boolean.valueOf(abstractC6462.m14777(abstractC6463.mo5577()));
            case 12:
                return Boolean.valueOf(this.f56467.m19486(abstractC6462.mo14803(), abstractC6463, false));
            case 13:
                if (!abstractC6463.m14777(EnumC11353.BOT) && !abstractC6463.m14777(EnumC11353.CLASS) && !abstractC6463.m14777(EnumC11353.ARRAY) && !abstractC6463.m14777(EnumC11353.TYPEVAR)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
            case 15:
                return Boolean.FALSE;
            default:
                throw new AssertionError("isSubtype " + abstractC6462.mo5577());
        }
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14564(C3108 c3108, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (c3108 == abstractC6462 || c3108.f16992 == abstractC6462 || abstractC6462.m14777(EnumC11353.ERROR) || abstractC6462.m14777(EnumC11353.UNKNOWN)) {
            return Boolean.TRUE;
        }
        if (abstractC6462.m14777(EnumC11353.BOT)) {
            return Boolean.FALSE;
        }
        c3108.m5296(EnumC20544.f63504, abstractC6462, this.f56467);
        return Boolean.TRUE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        boolean zM14777 = abstractC6462.m14777(EnumC11353.ARRAY);
        C8374 c8374 = this.f56467;
        if (zM14777) {
            if (c7251.f18916.mo14805()) {
                return Boolean.valueOf(c8374.m19490(c7251.f18916, c8374.m19455(abstractC6462)));
            }
            return Boolean.valueOf(c8374.m19486(c7251.f18916, c8374.m19455(abstractC6462), false));
        }
        if (abstractC6462.m14777(EnumC11353.CLASS)) {
            AbstractC12224 abstractC12224Mo17995 = abstractC6462.f16705.mo17995();
            C8200 c8200 = c8374.f22471;
            return Boolean.valueOf(abstractC12224Mo17995 == c8200.f21745 || abstractC12224Mo17995 == c8200.f21753 || abstractC12224Mo17995 == c8200.f21644);
        }
        return Boolean.FALSE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo11508(C13956 c13956, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        boolean zM19442;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        C8374 c8374 = this.f56467;
        AbstractC6462 abstractC6462M19467 = c8374.m19467(abstractC21195, c21333);
        if (abstractC6462M19467 == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (!abstractC6462M19467.m14777(EnumC11353.CLASS)) {
            return Boolean.valueOf(c8374.m19486(abstractC6462M19467, abstractC6462, false));
        }
        if (abstractC6462M19467.f16705 == abstractC6462.f16705) {
            if (!abstractC6462.mo14781()) {
                if (c8374.m19486(abstractC6462M19467.mo7201(), abstractC6462.mo7201(), false)) {
                    z = true;
                }
            } else {
                C10386 c10386 = new C10386(abstractC6462, abstractC6462M19467, c8374);
                HashSet hashSet = this.f56466;
                if (hashSet.add(c10386)) {
                    try {
                        zM19442 = c8374.m19442(abstractC6462.mo14802(), abstractC6462M19467.mo14802());
                        hashSet.remove(c10386);
                    } catch (Throwable th) {
                        hashSet.remove(c10386);
                        throw th;
                    }
                } else {
                    zM19442 = c8374.m19442(abstractC6462.mo14802(), m43021(abstractC6462M19467).mo14802());
                }
                if (zM19442) {
                    if (c8374.m19486(abstractC6462M19467.mo7201(), abstractC6462.mo7201(), false)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC6462 m43021(AbstractC6462 abstractC6462) {
        C21215 c21215;
        C8374 c8374 = this.f56467;
        C22004 c22004 = c8374.f22480;
        if (!abstractC6462.mo14781()) {
            return abstractC6462;
        }
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        try {
            c8374.m19440(abstractC6462.f16705.f20406, abstractC6462, c20271, c20272);
            if (c20271.isEmpty()) {
                return abstractC6462;
            }
            C20271 c20273 = new C20271();
            boolean z = false;
            for (AbstractC6462 abstractC6463 : c20272.m45783()) {
                AbstractC6462 abstractC6462M43021 = m43021(abstractC6463);
                if (abstractC6462M43021.mo14788() && !abstractC6462M43021.mo14786()) {
                    c21215 = new C21215(c22004.f69208, EnumC17268.UNBOUND, c22004.f69162, null, abstractC6462M43021.f16704);
                } else {
                    if (abstractC6462M43021 != abstractC6463) {
                        c21215 = new C21215(c8374.m19451(abstractC6462M43021), EnumC17268.EXTENDS, c22004.f69162, null, abstractC6462M43021.f16704);
                    }
                    c20273.m45777(abstractC6462M43021);
                }
                abstractC6462M43021 = c21215;
                z = true;
                c20273.m45777(abstractC6462M43021);
            }
            return z ? c8374.m19428(abstractC6462.f16705.f20406, c20271.m45783(), c20273.m45783()) : abstractC6462;
        } catch (C10877 e) {
            throw new AssertionError(e);
        }
    }

    public C18923(C8374 c8374) {
        this.f56467 = c8374;
    }
}
