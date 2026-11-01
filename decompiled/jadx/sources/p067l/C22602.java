package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩸ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F42B */
/* JADX INFO: loaded from: classes5.dex */
public final class C22602 implements InterfaceC7059 {

    /* JADX INFO: renamed from: ֫ */
    public final C15492 f71343;

    /* JADX INFO: renamed from: ۧ */
    public final C5473 f71344;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f71345;

    /* JADX INFO: renamed from: ᩳ */
    public final C22004 f71346;

    /* JADX INFO: renamed from: ֫ */
    public static C22602 m50653(C5127 c5127) {
        C22602 c22602 = (C22602) c5127.m10904(C22602.class);
        return c22602 == null ? new C22602(c5127) : c22602;
    }

    public C22602(C5127 c5127) {
        new HashSet();
        this.f71345 = new HashMap();
        c5127.m10906(C22602.class, this);
        C6684.m15204(c5127);
        this.f71346 = C22004.m49577(c5127);
        this.f71344 = C5473.m12055(c5127);
        C8200.m18988(c5127);
        C8374.m19396(c5127);
        this.f71343 = C15492.m35238(c5127);
        C23663.m52629(c5127);
        C23623.m52439(c5127);
        EnumC12477.f34980.m28726(EnumC17840.m40515(c5127));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9794 m50655(C15828 c15828) {
        if (c15828.mo3347() == EnumC24473.MODULE) {
            return null;
        }
        return ((AbstractC7783) m50652(AbstractC7783.class, c15828)).m18008();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19129 m50656(InterfaceC11083 interfaceC11083) {
        AbstractC7783 abstractC7783 = (AbstractC7783) m50652(AbstractC7783.class, interfaceC11083);
        if (this.f71344.m12095() == this.f71346.f69147) {
            return null;
        }
        return abstractC7783.f20405 == EnumC3600.f7340 ? (InterfaceC19129) interfaceC11083 : abstractC7783.m18008().f27063;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC21812 m50660(InterfaceC13745 interfaceC13745) {
        AbstractC7783 abstractC7783 = (AbstractC7783) m50652(AbstractC7783.class, interfaceC13745);
        if ((abstractC7783.mo18003() & 68719476736L) != 0) {
            return EnumC21812.MANDATED;
        }
        if ((abstractC7783.mo18003() & X931RNG.BLOCK64_RESEED_MAX) != 0) {
            return EnumC21812.MANDATED;
        }
        return EnumC21812.EXPLICIT;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC21812 m50657(InterfaceC14415 interfaceC14415) {
        if (((C17939) m50652(C17939.class, interfaceC14415)).m40800()) {
            return EnumC21812.MANDATED;
        }
        return EnumC21812.EXPLICIT;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m50654(InterfaceC13745 interfaceC13745) {
        AbstractC7783 abstractC7783 = (AbstractC7783) m50652(AbstractC7783.class, interfaceC13745);
        C4848 c4848Mo9259 = abstractC7783.mo9259();
        while (abstractC7783.mo3347() == EnumC24473.CLASS) {
            AbstractC6462 abstractC6462Mo25528 = ((C15828) abstractC7783).mo25528();
            if (!abstractC6462Mo25528.m14777(EnumC11353.CLASS) || abstractC6462Mo25528.mo14812()) {
                break;
            }
            abstractC7783 = abstractC6462Mo25528.f16705;
            C22004 c22004 = this.f71346;
            if (abstractC7783 == c22004.f69208.f16705) {
                break;
            }
            C4848 c4848M10290 = c4848Mo9259;
            for (C17939 c17939 : abstractC7783.mo9259()) {
                if (c17939.f29256.f16705.m17984(c22004.f69176.f16705) != null) {
                    AbstractC6462 abstractC6462 = c17939.f29256;
                    Iterator it = c4848Mo9259.iterator();
                    do {
                        if (!it.hasNext()) {
                            c4848M10290 = c4848M10290.m10290(c17939);
                            break;
                        }
                    } while (((C17939) it.next()).f29256.f16705 != abstractC6462.f16705);
                }
            }
            c4848Mo9259 = c4848M10290;
        }
        return c4848Mo9259;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m50659(InterfaceC13745 interfaceC13745) {
        AbstractC21195 abstractC21195M17990;
        AbstractC7257 abstractC7257M21404;
        C3626 c3626;
        AbstractC7783 abstractC7783 = (AbstractC7783) m50652(AbstractC7783.class, interfaceC13745);
        int i = C16565.f48649[abstractC7783.f20405.ordinal()];
        if (i == 1) {
            abstractC21195M17990 = (C9794) abstractC7783;
        } else if (i == 2) {
            abstractC21195M17990 = (C2417) abstractC7783;
        } else {
            abstractC21195M17990 = abstractC7783.m17990();
        }
        C24293 c24293 = null;
        C4036 c4036M35240 = abstractC21195M17990 != null ? this.f71343.m35240(abstractC21195M17990) : null;
        if (c4036M35240 != null && (abstractC7257M21404 = C9268.m21404(abstractC7783, c4036M35240.f8850)) != null && (c3626 = c4036M35240.f8851) != null) {
            c24293 = new C24293(abstractC7257M21404, c3626);
        }
        if (c24293 == null) {
            return null;
        }
        AbstractC7257 abstractC7257 = (AbstractC7257) c24293.f76952;
        C10570 c10570 = ((C3626) c24293.f76953).f7515;
        if (c10570 == null) {
            return null;
        }
        return c10570.m24360(abstractC7257);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m50652(Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(obj.toString());
        }
        return cls.cast(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50658() {
        this.f71345.clear();
    }
}
