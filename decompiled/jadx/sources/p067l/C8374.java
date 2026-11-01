package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C8374 {

    /* JADX INFO: renamed from: ۡ֫ */
    public static final C6468 f22436 = new C6468();

    /* JADX INFO: renamed from: ۢ֫ */
    public static final C3680 f22437 = new C12023();

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C24287 f22438 = new C24287();

    /* JADX INFO: renamed from: ֨ */
    public final C15492 f22440;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f22441;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC12224 f22449;

    /* JADX INFO: renamed from: ۧ */
    public C7921 f22456;

    /* JADX INFO: renamed from: ۨ */
    public final boolean f22458;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C3686 f22469;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C8200 f22471;

    /* JADX INFO: renamed from: ᩴ */
    public C8005 f22472;

    /* JADX INFO: renamed from: ᩷ */
    public final C16852 f22475;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C22004 f22480;

    /* JADX INFO: renamed from: ۜ֫ */
    public C4848 f22450 = C4848.m10283();

    /* JADX INFO: renamed from: ۛ */
    public final AbstractC14409 f22448 = new C14034(this);

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6363 f22466 = new C18252(this);

    /* JADX INFO: renamed from: ۘ */
    public C14229 f22445 = new C14229(this);

    /* JADX INFO: renamed from: ܳ */
    public Predicate f22462 = new C19594(this);

    /* JADX INFO: renamed from: ۤ */
    public AbstractC15079 f22455 = new C18923(this);

    /* JADX INFO: renamed from: ۫ */
    public AbstractC15079 f22459 = new C16240(this);

    /* JADX INFO: renamed from: ܺ */
    public AbstractC15079 f22465 = new C24958(this);

    /* JADX INFO: renamed from: ۙ */
    public AbstractC15079 f22446 = new C8865(this);

    /* JADX INFO: renamed from: ֡ */
    public AbstractC15079 f22439 = new C22277(this);

    /* JADX INFO: renamed from: ۖ */
    public final C3680 f22443 = new C11548();

    /* JADX INFO: renamed from: ۬ */
    public AbstractC14409 f22460 = new C7329();

    /* JADX INFO: renamed from: ۚ */
    public C3680 f22447 = new C3305(this);

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC6363 f22470 = new C10011(this);

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC6363 f22478 = new C16715(this);

    /* JADX INFO: renamed from: ۠ */
    public C3680 f22452 = new C22752(this);

    /* JADX INFO: renamed from: ܳ֫ */
    public AbstractC14409 f22463 = new C23422(this);

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC14409 f22474 = new C21411(this);

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC14409 f22473 = new C6658(this);

    /* JADX INFO: renamed from: ۗ */
    public HashMap f22444 = new HashMap();

    /* JADX INFO: renamed from: ۢ */
    public AbstractC14409 f22454 = new C5317(this);

    /* JADX INFO: renamed from: ᩹ */
    public C9535 f22477 = new C9535(this);

    /* JADX INFO: renamed from: ܰ */
    public C18432 f22461 = new C18432(this);

    /* JADX INFO: renamed from: ᩻ */
    public C6183 f22479 = new C6183(this);

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC15079 f22476 = new C13559(this, true);

    /* JADX INFO: renamed from: ܶ */
    public AbstractC15079 f22464 = new C13559(this, false);

    /* JADX INFO: renamed from: ֫֫ */
    public final C4351 f22442 = new C7999();

    /* JADX INFO: renamed from: ܽ֫ */
    public final C4351 f22467 = new C13364();

    /* JADX INFO: renamed from: ۧ֫ */
    public final C4351 f22457 = new C9340();

    /* JADX INFO: renamed from: ۡ */
    public HashMap f22453 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public C10682 f22468 = new C10682();

    /* JADX INFO: renamed from: ۟ */
    public HashSet f22451 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC6462 m19395(C8374 c8374, AbstractC6462 abstractC6462, boolean z, boolean z2) {
        c8374.getClass();
        return (AbstractC6462) abstractC6462.mo5291(new C11057(c8374, z, z2), (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8374 m19396(C5127 c5127) {
        C8374 c8374 = (C8374) c5127.m10905(f22436);
        return c8374 == null ? new C8374(c5127) : c8374;
    }

    public C8374(C5127 c5127) {
        c5127.m10908(f22436, this);
        this.f22480 = C22004.m49577(c5127);
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f22471 = c8200M18988;
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f22441 = EnumC12477.f34962.m28726(enumC17840M40515);
        this.f22458 = EnumC12477.f34984.m28726(enumC17840M40515);
        this.f22475 = C16852.m38215(c5127);
        this.f22440 = C15492.m35238(c5127);
        AbstractC14235 abstractC14235 = c8200M18988.f21738;
        abstractC14235.getClass();
        char[] charArray = "<captured wildcard>".toCharArray();
        this.f22449 = abstractC14235.mo17848(charArray, charArray.length);
        C16246.m37002(c5127);
        this.f22472 = C8005.m18541(c5127);
        this.f22469 = new C3686(null);
    }

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC6462 m19451(AbstractC6462 abstractC6462) {
        if (!abstractC6462.m14777(EnumC11353.WILDCARD)) {
            return abstractC6462;
        }
        C21215 c21215 = (C21215) abstractC6462;
        if (c21215.mo14788()) {
            C10485 c10485 = c21215.f66701;
            return c10485 == null ? this.f22480.f69208 : c10485.mo14803();
        }
        return m19451(c21215.f66703);
    }

    /* JADX INFO: renamed from: ۫ */
    public static AbstractC6462 m19413(AbstractC6462 abstractC6462) {
        if (!abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            return abstractC6462;
        }
        C10485 c10485 = (C10485) abstractC6462;
        return c10485.mo24195() ? m19413(c10485.mo14803()) : c10485;
    }

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6462 m19453(AbstractC6462 abstractC6462) {
        if (!abstractC6462.m14777(EnumC11353.WILDCARD)) {
            return abstractC6462;
        }
        C21215 c21215 = (C21215) abstractC6462;
        return c21215.mo14786() ? this.f22480.f69204 : m19453(c21215.f66703);
    }

    /* JADX INFO: renamed from: ۬ */
    public static AbstractC6462 m19414(AbstractC6462 abstractC6462) {
        return (abstractC6462.m14777(EnumC11353.TYPEVAR) && ((C10485) abstractC6462).mo24195()) ? m19414(abstractC6462.mo14791()) : abstractC6462;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m19466(AbstractC6462 abstractC6462, boolean z) {
        while (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            abstractC6462 = abstractC6462.mo14803();
        }
        return z ? m19463(abstractC6462) : abstractC6462;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 m19481(AbstractC6462 abstractC6462, C4848 c4848) {
        C5692 c5692 = new C5692(this, c4848);
        EnumC11728 enumC11728 = EnumC11728.f32761;
        abstractC6462.getClass();
        return (AbstractC6462) abstractC6462.mo5291(c5692, enumC11728);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m19480(AbstractC6462 abstractC6462) {
        InterfaceC22556 c2829 = new C2829(this);
        HashSet hashSet = new HashSet();
        abstractC6462.mo5291(c2829, hashSet);
        return C4848.m10279((Iterable) hashSet);
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m19454(AbstractC6462 abstractC6462) {
        AbstractC14409 abstractC14409 = this.f22448;
        abstractC14409.getClass();
        return ((Boolean) abstractC6462.mo5291(abstractC14409, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m19465(AbstractC6462 abstractC6462, AbstractC21195 abstractC21195) {
        AbstractC6363 abstractC6363 = this.f22466;
        abstractC6363.getClass();
        return (AbstractC6462) abstractC6462.mo5291(abstractC6363, abstractC21195);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m19496(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        AbstractC6462 abstractC6462M19503;
        if (abstractC6462.m14777(EnumC11353.ERROR)) {
            return true;
        }
        boolean zMo14805 = abstractC6462.mo14805();
        if (zMo14805 == abstractC6463.mo14805()) {
            return m19491(abstractC6462, abstractC6463, c3686);
        }
        EnumC11353 enumC11353 = EnumC11353.UNDETVAR;
        boolean zM14777 = abstractC6462.m14777(enumC11353);
        boolean zM14778 = abstractC6463.m14777(enumC11353);
        if (!zM14777 && !zM14778) {
            if (zMo14805) {
                abstractC6462M19503 = m19436(abstractC6462).f20406;
            } else {
                abstractC6462M19503 = m19503(abstractC6462);
            }
            return m19486(abstractC6462M19503, abstractC6463, true);
        }
        if (zM14777) {
            if (abstractC6463.mo14805()) {
                abstractC6463 = m19436(abstractC6463).f20406;
            }
            return m19486(abstractC6462, abstractC6463, true);
        }
        if (abstractC6462.mo14805()) {
            abstractC6462 = m19436(abstractC6462).f20406;
        }
        return m19486(abstractC6462, abstractC6463, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m19433(AbstractC21195 abstractC21195) {
        return this.f22445.m32702(abstractC21195).f42485;
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC6462 m19478(AbstractC6462 abstractC6462) {
        return this.f22445.m32702(abstractC6462.f16705).mo15694(abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m19462(C15828 c15828) {
        boolean z;
        try {
            m19433((AbstractC21195) c15828);
            z = true;
        } catch (C8194 unused) {
            z = false;
        }
        C1446.m31704(z);
        AbstractC7783 abstractC7783M19433 = m19433((AbstractC21195) c15828);
        C19043 c19043M19438 = m19438(c15828.f20406, false);
        C20271 c20271 = new C20271();
        for (AbstractC7783 abstractC7783 : c19043M19438.mo22457(abstractC7783M19433.f20408, this.f22462, EnumC3620.RECURSIVE)) {
            if (abstractC7783 != abstractC7783M19433 && abstractC7783M19433.mo12938(abstractC7783, c15828, this, false)) {
                Iterator it = c20271.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c20271.m45777(abstractC7783);
                        break;
                    }
                    AbstractC7783 abstractC7784 = (AbstractC7783) it.next();
                    if (m19490(abstractC7784.mo18010(this), abstractC7783.mo18010(this)) || (abstractC7784.mo12938(abstractC7783, c15828, this, false) && (m19404(c15828, (AbstractC21195) abstractC7784.m17990()) || ((C5771) abstractC7783).m12934((C15828) abstractC7784.f20407, this) != null))) {
                        break;
                    }
                }
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m19498(AbstractC6462 abstractC6462) {
        try {
            m19478(abstractC6462);
            return true;
        } catch (C8194 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final AbstractC6462 m19477(AbstractC6462 abstractC6462) {
        if (!C7480.stream(abstractC6462.mo14802()).anyMatch(new C22726(2))) {
            return abstractC6462;
        }
        C4848 c4848Mo14802 = abstractC6462.mo14802();
        C4848<AbstractC6462> c4848Mo14803 = abstractC6462.f16705.f20406.mo14802();
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6463 : c4848Mo14803) {
            AbstractC6462 abstractC6464 = (AbstractC6462) c4848Mo14802.f11034;
            AbstractC6462 abstractC6462Mo14803 = abstractC6463.mo14803();
            if (!((AbstractC6462) c4848Mo14802.f11034).m14777(EnumC11353.WILDCARD)) {
                c20271.m45777(abstractC6464);
            } else {
                C21215 c21215 = (C21215) abstractC6464;
                if (abstractC6462Mo14803.m14792(c4848Mo14803)) {
                    abstractC6462Mo14803 = c21215.f66703;
                } else {
                    int i = C12889.f36248[c21215.f66702.ordinal()];
                    if (i == 1) {
                        abstractC6462Mo14803 = m19495(abstractC6462Mo14803, c21215.f66703);
                    } else if (i == 2) {
                        abstractC6462Mo14803 = c21215.f66703;
                    } else if (i != 3) {
                        C1446.m31702("Cannot get here!");
                        throw null;
                    }
                }
                c20271.m45777(abstractC6462Mo14803);
            }
            c4848Mo14802 = c4848Mo14802.f11035;
        }
        return m19428(abstractC6462.f16705.f20406, c4848Mo14803, c20271.m45783());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m19435(C4036 c4036, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, long j) {
        if (abstractC6462 == null) {
            return null;
        }
        C22004 c22004 = this.f22480;
        if (abstractC6462 == c22004.f69201) {
            return null;
        }
        AbstractC7783 abstractC7783M19433 = m19433(abstractC6462.f16705);
        AbstractC6462 abstractC6462M19478 = m19478(abstractC6462);
        C15828 c15828 = new C15828(j, abstractC12224, c4036.f8855.f20027.mo3350());
        c15828.f20410 = InterfaceC8453.f22683;
        c15828.f45850 = new C12338(c15828);
        c15828.f45850.mo28415(new C5771(abstractC7783M19433.mo18003(), abstractC7783M19433.f20408, abstractC6462M19478, c15828));
        C21333 c21333 = new C21333(c15828, AbstractC6462.f16700, C4848.m10283());
        c21333.f67259 = c22004.f69208;
        c21333.f67261 = abstractC6462 instanceof C7921 ? m19505(abstractC6462) : C4848.m10276of((Object) abstractC6462);
        c15828.f20406 = c21333;
        c15828.f45858 = ((C15828) c15828.f20407).f45858;
        return c15828;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19404(C15828 c15828, AbstractC21195 abstractC21195) {
        InterfaceC19740 interfaceC19740 = c15828.f45854;
        if (interfaceC19740 != null && interfaceC19740.mo23287() == EnumC18398.CLASS && this.f22440.m35240(c15828) == null) {
            return false;
        }
        if (c15828 == abstractC21195) {
            return true;
        }
        Iterator it = m19450(c15828.f20406).iterator();
        while (it.hasNext()) {
            if (m19404((C15828) ((AbstractC6462) it.next()).f16705, abstractC21195)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m19491(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        boolean zM19400 = m19400(abstractC6462, abstractC6463, true, c3686);
        if (zM19400) {
            m19415(abstractC6462, abstractC6463, c3686);
        }
        return zM19400;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19400(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, boolean z, C3686 c3686) {
        AbstractC6462 abstractC6462M19467;
        EnumC11353 enumC11353 = EnumC11353.ARRAY;
        if (abstractC6462.m14777(enumC11353) && abstractC6463.m14777(enumC11353)) {
            if (((C7251) abstractC6462).f18916.mo14805()) {
                return m19490(m19455(abstractC6462), m19455(abstractC6463));
            }
            return m19400(m19455(abstractC6462), m19455(abstractC6463), false, c3686);
        }
        if (m19486(abstractC6462, abstractC6463, z)) {
            return true;
        }
        if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            return m19400(abstractC6462.mo14803(), abstractC6463, false, c3686);
        }
        if (abstractC6463.mo14784() || (abstractC6462M19467 = m19467(abstractC6463.f16705, abstractC6462)) == null || !abstractC6462M19467.mo14784()) {
            return false;
        }
        if (m19417(abstractC6463)) {
            c3686.m7111(EnumC21706.UNCHECKED);
            return true;
        }
        c3686.mo7112(EnumC21706.UNCHECKED);
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m19415(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        if (!abstractC6462.m14777(EnumC11353.ARRAY) || m19417(abstractC6462)) {
            return;
        }
        C7251 c7251 = (C7251) abstractC6462;
        int i = C12889.f36249[abstractC6463.mo5577().ordinal()];
        boolean z = false;
        if (i == 1) {
            z = (!(c7251 instanceof C2556) || (((C7251) abstractC6463) instanceof C2556) || m19417(c7251)) ? false : true;
        } else if (i == 2) {
            z = c7251 instanceof C2556;
        }
        if (z) {
            c3686.mo7112(EnumC21706.VARARGS);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m19486(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, boolean z) {
        AbstractC6462 abstractC6462M19414;
        if (abstractC6462.m14793(abstractC6463)) {
            return true;
        }
        if (abstractC6463.mo14804()) {
            return m19476(abstractC6463, abstractC6462);
        }
        if (abstractC6463.mo7388()) {
            Iterator it = m19450(abstractC6463).m10290(m19502(abstractC6463)).iterator();
            while (it.hasNext()) {
                if (!m19486(abstractC6462, (AbstractC6462) it.next(), z)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC6462.m14777(EnumC11353.UNDETVAR) && !abstractC6462.mo7388() && abstractC6463 != (abstractC6462M19414 = m19414(m19453(abstractC6463))) && !abstractC6462M19414.m14777(EnumC11353.BOT)) {
            if (z) {
                abstractC6462 = m19463(abstractC6462);
            }
            return m19486(abstractC6462, abstractC6462M19414, false);
        }
        if (z) {
            abstractC6462 = m19463(abstractC6462);
        }
        AbstractC15079 abstractC15079 = this.f22455;
        abstractC15079.getClass();
        return ((Boolean) abstractC6462.mo5291(abstractC15079, abstractC6463)).booleanValue();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m19476(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i != 16) {
            if (i != 17) {
                return m19486(abstractC6463, abstractC6462, true);
            }
            C3108 c3108 = (C3108) abstractC6462;
            if (abstractC6462 != abstractC6463 && c3108.f16992 != abstractC6463 && !abstractC6463.m14777(EnumC11353.ERROR) && !abstractC6463.m14777(EnumC11353.BOT)) {
                c3108.m5296(EnumC20544.f63505, abstractC6463, this);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m19489(C4848 c4848, C4848 c4849) {
        while (c4848.f11035 != null && c4849.f11035 != null && m19490((AbstractC6462) c4848.f11034, (AbstractC6462) c4849.f11034)) {
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
        return c4848.f11035 == null && c4849.f11035 == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19443(C5771 c5771) {
        C4848 c4848Mo14797 = c5771.f20406.mo14797();
        if ((c5771.f20409 & 256) == 0) {
            return false;
        }
        AbstractC7783 abstractC7783 = c5771.f20407;
        C22004 c22004 = this.f22480;
        return (abstractC7783 == c22004.f69185.f16705 || abstractC7783 == c22004.f69158.f16705) && c4848Mo14797.m10289() == 1 && ((AbstractC6462) c4848Mo14797.f11034).m14777(EnumC11353.ARRAY) && ((C7251) c4848Mo14797.f11034).f18916.f16705 == c22004.f69208.f16705;
    }

    /* JADX INFO: renamed from: ۧ */
    private C5771 m19409(C15828 c15828, C15828 c15829) {
        C5771 c5771;
        C5771 c5771M19409 = null;
        if (c15829 != c15828) {
            c15829.mo18020();
            if ((c15829.f20409 & 1536) == 0) {
                return null;
            }
        }
        c15829.mo18020();
        for (AbstractC7783 abstractC7783 : c15829.f45850.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                C5771 c5772 = (C5771) abstractC7783;
                C5771 c5771M12935 = c5772.m12935(c15828, this, true);
                if ((c5771M12935 == null || c5771M12935 == c5772) && this.f22441 && (c5771 = (C5771) m19423(c15828.f20406, c5772).f11034) != null && c5771.mo12938(c5772, c15828, this, true)) {
                    c5771M12935 = c5771;
                }
                if (c5771M12935 == null || c5771M12935 == c5772) {
                    c5771M19409 = c5772;
                    break;
                }
            }
        }
        if (c5771M19409 == null) {
            AbstractC6462 abstractC6462M19502 = m19502(c15829.f20406);
            if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
                c5771M19409 = m19409(c15828, (C15828) abstractC6462M19502.f16705);
            }
        }
        for (C4848 c4848M19450 = m19450(c15829.f20406); c5771M19409 == null && c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            c5771M19409 = m19409(c15828, (C15828) ((AbstractC6462) c4848M19450.f11034).f16705);
        }
        return c5771M19409;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m19490(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return ((Boolean) this.f22459.m23807(abstractC6463, abstractC6462)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19444(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i != 16) {
            if (i == 17) {
                if (abstractC6463.m14777(EnumC11353.WILDCARD)) {
                    C3108 c3108 = (C3108) abstractC6462;
                    int i2 = C12889.f36248[((C21215) abstractC6463).f66702.ordinal()];
                    if (i2 == 1) {
                        c3108.m5296(EnumC20544.f63504, m19451(abstractC6463), this);
                        return true;
                    }
                    if (i2 == 2) {
                        c3108.m5296(EnumC20544.f63505, m19453(abstractC6463), this);
                        return true;
                    }
                } else {
                    return m19490(abstractC6462, abstractC6463);
                }
            } else {
                return m19470(abstractC6463, abstractC6462);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19442(C4848 c4848, C4848 c4849) {
        while (c4848.m10293() && c4849.m10293() && m19470((AbstractC6462) c4848.f11034, (AbstractC6462) c4849.f11034)) {
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
        return c4848.isEmpty() && c4849.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19470(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return ((Boolean) this.f22465.m23807(abstractC6463, abstractC6462)).booleanValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19469(C4848 c4848, C4848 c4849) {
        while (c4848.m10293() && c4849.m10293()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
            AbstractC6462 abstractC6463 = (AbstractC6462) c4849.f11034;
            if (!m19490(abstractC6462, abstractC6463) && (!m19470(abstractC6462, abstractC6463) || !m19470(abstractC6463, abstractC6462))) {
                break;
            }
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
        return c4848.isEmpty() && c4849.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[RETURN] */
    /* JADX INFO: renamed from: ܽ */
    public final boolean m19485(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        boolean zBooleanValue;
        if (abstractC6462 != abstractC6463) {
            if (abstractC6462.mo14805() != abstractC6463.mo14805()) {
                AbstractC6462 abstractC6462M19466 = m19466(abstractC6462, false);
                if (!m19496(abstractC6462M19466, abstractC6463, c3686) && (!abstractC6463.mo14805() || !m19486(m19436(abstractC6463).f20406, abstractC6462M19466, true))) {
                    return false;
                }
            } else {
                C4848 c4848 = this.f22450;
                Object obj = c4848.f11034;
                AbstractC15079 abstractC15079 = this.f22446;
                if (c3686 != obj) {
                    try {
                        this.f22450 = c4848.m10290(c3686);
                        m19415(abstractC6462, abstractC6463, c3686);
                        abstractC15079.getClass();
                        zBooleanValue = ((Boolean) abstractC6462.mo5291(abstractC15079, abstractC6463)).booleanValue();
                        this.f22450 = this.f22450.f11035;
                    } catch (Throwable th) {
                        this.f22450 = this.f22450.f11035;
                        throw th;
                    }
                } else {
                    abstractC15079.getClass();
                    zBooleanValue = ((Boolean) abstractC6462.mo5291(abstractC15079, abstractC6463)).booleanValue();
                }
                if (zBooleanValue) {
                    EnumC11353 enumC11353 = EnumC11353.CLASS;
                    if (abstractC6462.m14777(enumC11353)) {
                        EnumC3600 enumC3600 = abstractC6462.f16705.f20405;
                        C17010 c17010 = C17010.f50319;
                        if (enumC3600.m6623(c17010) && abstractC6463.m14777(enumC11353) && abstractC6463.f16705.f20405.m6623(c17010) && (abstractC6462.f16705.m18019() || abstractC6463.f16705.m18019())) {
                            if (!abstractC6462.mo7388() && !abstractC6463.mo7388() && m19403((C15828) abstractC6462.f16705, (C15828) abstractC6463.f16705)) {
                                return false;
                            }
                        }
                    }
                }
                return zBooleanValue;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m19403(final C15828 c15828, C15828 c15829) {
        if (m19486(m19459(c15828.f20406), m19459(c15829.f20406), true)) {
            return false;
        }
        if (c15828.m17989() == c15829.m17989() && m19486(m19459(c15829.f20406), m19459(c15828.f20406), true)) {
            return false;
        }
        if (c15828.m17989() && !c15829.m17989()) {
            return m19403(c15829, c15828);
        }
        if (!c15828.m17989() && (c15828.f20409 & 16) != 0) {
            return true;
        }
        if (!c15828.m18019() && !c15829.m18019()) {
            return false;
        }
        C15828 c158210 = c15828.m18019() ? c15828 : c15829;
        if (c158210 == c15828) {
            c15828 = c15829;
        }
        return C7480.stream(c158210.f45853).allMatch(new Predicate() { // from class: l.ܺ۠֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m39613or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.m19403((C15828) ((AbstractC7783) obj), c15828);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m19484(C4848 c4848, C4848 c4849) {
        while (c4848.f11035 != null && c4849.f11035 != null) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
            AbstractC6462 abstractC6463 = (AbstractC6462) c4849.f11034;
            AbstractC15079 abstractC15079 = this.f22439;
            abstractC15079.getClass();
            if (((Boolean) abstractC6462.mo5291(abstractC15079, abstractC6463)).booleanValue()) {
                return true;
            }
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m19419(C4848 c4848) {
        return c4848.m10287((Function) this.f22443);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m19506(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        boolean zM19486;
        if (abstractC6462 == abstractC6463) {
            return false;
        }
        EnumC11353 enumC11353 = EnumC11353.TYPEVAR;
        if (abstractC6462.m14777(enumC11353)) {
            AbstractC6462 abstractC6462Mo14803 = ((C10485) abstractC6462).mo14803();
            if (abstractC6463.m14777(enumC11353)) {
                abstractC6463 = (AbstractC6462) m19466(abstractC6463, false).mo5291(new C11057(this, true, true), (Object) null);
            }
            zM19486 = m19485(abstractC6462Mo14803, abstractC6463, this.f22469);
        } else {
            if (!abstractC6463.m14777(EnumC11353.WILDCARD)) {
                abstractC6463 = m19413(abstractC6463);
            }
            if (abstractC6463.m14777(enumC11353)) {
                abstractC6463 = (AbstractC6462) m19466(abstractC6463, false).mo5291(new C11057(this, true, true), (Object) null);
            }
            zM19486 = m19486(abstractC6462, abstractC6463, true);
        }
        return !zM19486;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m19417(AbstractC6462 abstractC6462) {
        return ((Boolean) this.f22460.m33024(abstractC6462)).booleanValue();
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m19452(AbstractC6462 abstractC6462) {
        while (abstractC6462.m14777(EnumC11353.WILDCARD)) {
            abstractC6462 = m19451(abstractC6462);
        }
        return abstractC6462.m14777(EnumC11353.ARRAY);
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC6462 m19455(AbstractC6462 abstractC6462) {
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i == 1) {
            return ((C7251) abstractC6462).f18916;
        }
        if (i == 14) {
            return m19455(m19451(abstractC6462));
        }
        if (i == 16) {
            return abstractC6462;
        }
        if (i != 18) {
            return null;
        }
        return m19455(((C11945) abstractC6462).f16992);
    }

    /* JADX INFO: renamed from: ֨ */
    public final C7251 m19418(AbstractC6462 abstractC6462) {
        if (abstractC6462.m14777(EnumC11353.VOID) || abstractC6462.m14777(EnumC11353.PACKAGE)) {
            C1446.m31702("Type t must not be a VOID or PACKAGE type, " + abstractC6462.toString());
            throw null;
        }
        return new C7251(abstractC6462, this.f22480.f69187);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m19467(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6463 = abstractC7783.f20406;
        AbstractC6462 abstractC6464 = this.f22480.f69208;
        return abstractC6463 == abstractC6464 ? abstractC6464 : (AbstractC6462) this.f22470.m23807(abstractC7783, abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m19430(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i == 1) {
            if (m19486(abstractC6462, abstractC7783.f20406, true)) {
                return abstractC7783.f20406;
            }
            return null;
        }
        if (i != 2) {
            if (i == 12) {
                return m19467(abstractC7783, abstractC6462);
            }
            if (i != 16) {
                return null;
            }
            return abstractC6462;
        }
        do {
            AbstractC6462 abstractC6462M19467 = m19467(abstractC7783, abstractC6462);
            if (abstractC6462M19467 != null) {
                return abstractC6462M19467;
            }
            abstractC6462 = abstractC6462.mo7201();
        } while (abstractC6462.m14777(EnumC11353.CLASS));
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m19429(AbstractC6462 abstractC6462, AbstractC21195 abstractC21195) {
        EnumC11353 enumC11353;
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i == 1) {
            if (m19486(abstractC6462, abstractC21195.f20406, true)) {
                return abstractC21195.f20406;
            }
            return null;
        }
        if (i != 2) {
            if (i == 12) {
                return m19467(abstractC21195, abstractC6462);
            }
            if (i != 16) {
                return null;
            }
            return abstractC6462;
        }
        do {
            AbstractC6462 abstractC6462M19467 = m19467(abstractC21195, abstractC6462);
            if (abstractC6462M19467 != null) {
                return abstractC6462M19467;
            }
            AbstractC6462 abstractC6462Mo7201 = abstractC6462.mo7201();
            enumC11353 = EnumC11353.CLASS;
            if (abstractC6462Mo7201.m14777(enumC11353)) {
                abstractC6462 = abstractC6462Mo7201;
            } else {
                abstractC6462 = abstractC6462.f16705.f20407.m17990() != null ? abstractC6462.f16705.f20407.m17990().f20406 : AbstractC6462.f16700;
            }
        } while (abstractC6462.m14777(enumC11353));
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 m19483(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        if ((abstractC7783.mo18003() & 8) != 0) {
            return abstractC7783.f20406;
        }
        return (AbstractC6462) this.f22478.m23807(abstractC7783, abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19471(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        if (abstractC6462.m14777(EnumC11353.ERROR)) {
            return true;
        }
        if (abstractC6462.mo5577().m26309(EnumC11353.INT) && abstractC6462.mo14779() != null) {
            int iIntValue = ((Number) abstractC6462.mo14779()).intValue();
            int[] iArr = C12889.f36249;
            int i = iArr[abstractC6463.mo5577().ordinal()];
            if (i != 2) {
                if ((i == 3 || i == 4 || i == 5 || i == 6) && abstractC6463.mo5577().m26306(iIntValue)) {
                    return true;
                }
            } else {
                int i2 = iArr[m19503(abstractC6463).mo5577().ordinal()];
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    return m19471(abstractC6462, m19503(abstractC6463), c3686);
                }
            }
        }
        return m19496(abstractC6462, abstractC6463, c3686);
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC6462 m19459(AbstractC6462 abstractC6462) {
        return (abstractC6462.mo14805() || this.f22480.f69215.f16705 == abstractC6462.f16705) ? abstractC6462 : m19416(abstractC6462, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 m19416(AbstractC6462 abstractC6462, boolean z) {
        if (abstractC6462.mo14805()) {
            return abstractC6462;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C3680 c3680 = this.f22452;
        c3680.getClass();
        return (AbstractC6462) abstractC6462.mo5291(c3680, boolValueOf);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m19460(C4848 c4848) {
        return this.f22452.m7099(Boolean.FALSE, c4848);
    }

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC6462 m19458(AbstractC6462 abstractC6462) {
        return m19416(abstractC6462, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m19479(C4848 c4848) {
        return this.f22452.m7099(Boolean.TRUE, c4848);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C7921 m19474(C4848 c4848) {
        return m19434(c4848, ((AbstractC6462) c4848.f11034).f16705.m17989());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7921 m19434(C4848 c4848, boolean z) {
        AbstractC12224 abstractC12224M32717;
        AbstractC6462 abstractC6462M19459;
        C1446.m31704(c4848.m10293());
        AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
        C22004 c22004 = this.f22480;
        if (z) {
            c4848 = c4848.m10290(c22004.f69208);
        }
        boolean z2 = AbstractC6462.f16703;
        C8200 c8200 = this.f22471;
        if (z2) {
            abstractC12224M32717 = c8200.f21738.m32717(c4848.m10285(","));
        } else {
            abstractC12224M32717 = c8200.f21725;
        }
        C15828 c15828 = new C15828(1090524161L, abstractC12224M32717, null, c22004.f69157);
        C7921 c7921 = new C7921(c15828, AbstractC6462.f16700, C4848.m10283());
        c7921.f20781 = z;
        c15828.mo18020();
        C1446.m31704((c15828.f20409 & 16777216) != 0);
        AbstractC6462 abstractC6463 = (AbstractC6462) c4848.f11034;
        c7921.f67259 = abstractC6463;
        c7921.f67261 = c4848.f11035;
        C1446.m31701(c7921.f67259, (abstractC6463.f16705.f20410.mo9173() && c7921.f67259.mo14789()) ? false : true);
        c15828.f20406 = c7921;
        if (((AbstractC6462) c4848.f11034).m14777(EnumC11353.TYPEVAR)) {
            abstractC6462M19459 = c22004.f69208;
        } else {
            abstractC6462M19459 = m19459(abstractC6462);
        }
        c15828.f20411 = abstractC6462M19459;
        c15828.f45850 = new C12338(c15828);
        return c7921;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC6462 m19502(AbstractC6462 abstractC6462) {
        AbstractC14409 abstractC14409 = this.f22463;
        abstractC14409.getClass();
        return (AbstractC6462) abstractC6462.mo5291(abstractC14409, (Object) null);
    }

    /* JADX INFO: renamed from: ۖ */
    public final C4848 m19450(AbstractC6462 abstractC6462) {
        AbstractC14409 abstractC14409 = this.f22474;
        abstractC14409.getClass();
        return (C4848) abstractC6462.mo5291(abstractC14409, (Object) null);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C4848 m19505(AbstractC6462 abstractC6462) {
        return (C4848) this.f22473.m33024(abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19449(AbstractC21195 abstractC21195, AbstractC21195 abstractC21196) {
        Iterator it = m19450(abstractC21196.f20406).iterator();
        while (it.hasNext()) {
            if (abstractC21195 == ((AbstractC6462) it.next()).f16705) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX INFO: renamed from: ᩴ */
    public final boolean m19497(AbstractC6462 abstractC6462) {
        HashMap map = this.f22444;
        Boolean boolValueOf = (Boolean) map.get(abstractC6462);
        if (boolValueOf == null) {
            boolean z = false;
            if (!abstractC6462.mo14812()) {
                if (abstractC6462.mo14784() || (m19502(abstractC6462) != AbstractC6462.f16700 && m19497(m19502(abstractC6462)))) {
                    z = true;
                } else {
                    C4848 c4848M19450 = m19450(abstractC6462);
                    while (c4848M19450.m10293() && !m19497((AbstractC6462) c4848M19450.f11034)) {
                        c4848M19450 = c4848M19450.f11035;
                    }
                    if (c4848M19450.m10293()) {
                        z = true;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
            map.put(abstractC6462, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19441(C10485 c10485, C4848 c4848, boolean z) {
        AbstractC6462 abstractC6462M19434;
        if (c4848.f11035.isEmpty()) {
            abstractC6462M19434 = (AbstractC6462) c4848.f11034;
        } else {
            abstractC6462M19434 = m19434(c4848, z);
        }
        c10485.mo23233(abstractC6462M19434);
        c10485.f29023 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m19424(C10485 c10485) {
        if (c10485.mo14803().m14777(EnumC11353.NONE)) {
            return C4848.m10283();
        }
        if (c10485.mo14803().mo14812() || !c10485.mo14803().mo7388()) {
            return C4848.m10276of((Object) c10485.mo14803());
        }
        if ((m19459(c10485).f16705.mo18003() & 512) == 0) {
            return m19450(c10485).m10290(m19502(c10485));
        }
        return m19450(c10485);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 m19494(AbstractC6462 abstractC6462) {
        return (AbstractC6462) this.f22454.m33024(abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19472(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, boolean z) {
        return m19446(abstractC6462, abstractC6463, z) || m19446(abstractC6462, m19459(abstractC6463), z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19448(AbstractC21195 abstractC21195, AbstractC7783 abstractC7783) {
        Iterator it = this.f22480.f69208.f16705.mo17983().m22456(abstractC7783.f20408).iterator();
        while (it.hasNext()) {
            if (abstractC7783.mo12938((AbstractC7783) it.next(), abstractC21195, this, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18189 m19437(C4848 c4848, AbstractC6462 abstractC6462, boolean z) {
        C4848 c4848Mo14797 = ((AbstractC7783) c4848.f11034).mo18010(this).mo14797();
        Iterator it = c4848.iterator();
        int i = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (it.hasNext()) {
                AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                if ((abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (z && !m19489(c4848Mo14797, abstractC7783.mo18010(this).mo14797()))) {
                    return C18189.empty();
                }
                if (abstractC7783.f20406.m14777(EnumC11353.FORALL)) {
                    z2 = true;
                }
            } else {
                EnumC25138[] enumC25138ArrValues = EnumC25138.values();
                int length = enumC25138ArrValues.length;
                while (i < length) {
                    EnumC25138 enumC25138 = enumC25138ArrValues[i];
                    Iterator it2 = c4848.iterator();
                    while (it2.hasNext()) {
                        AbstractC7783 abstractC7784 = (AbstractC7783) it2.next();
                        AbstractC6462 abstractC6462M19483 = m19483(abstractC7784, abstractC6462);
                        C4848 c4848Mo14794 = abstractC6462M19483.mo14794();
                        Iterator it3 = c4848.iterator();
                        while (it3.hasNext()) {
                            AbstractC7783 abstractC7785 = (AbstractC7783) it3.next();
                            if (abstractC7784 != abstractC7785) {
                                AbstractC6462 abstractC6462M19484 = m19483(abstractC7785, abstractC6462);
                                if (m19472(abstractC6462M19483, abstractC6462M19484, z3) && enumC25138.mo37319(abstractC6462M19483, abstractC6462M19484, this)) {
                                    C4848 c4848Mo14795 = abstractC6462M19484.mo14794();
                                    EnumC11353 enumC11353 = EnumC11353.FORALL;
                                    if (!abstractC6462M19483.m14777(enumC11353) && z2) {
                                        c4848Mo14795 = m19460(c4848Mo14795);
                                    } else if (abstractC6462M19483.m14777(enumC11353)) {
                                        C1446.m31704(abstractC6462M19484.m14777(enumC11353));
                                        c4848Mo14795 = m19421(c4848Mo14795, abstractC6462M19484.mo14802(), abstractC6462M19483.mo14802());
                                    }
                                    c4848Mo14794 = this.f22475.m38348(c4848Mo14794, c4848Mo14795);
                                }
                            }
                            z3 = true;
                        }
                        if (c4848Mo14794 == abstractC6462M19483.mo14794()) {
                            return C18189.m41402of(abstractC7784);
                        }
                        return C18189.m41402of(new C14704(abstractC7784.mo18003(), abstractC7784.f20408, m19464(abstractC7784.f20406, c4848Mo14794), abstractC7784.f20407, abstractC7784));
                    }
                    i++;
                    z3 = true;
                }
                return C18189.empty();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m19425(C5771 c5771, AbstractC21195 abstractC21195, boolean z, Predicate predicate) {
        return this.f22477.m22233(c5771, abstractC21195, z, predicate);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19043 m19438(AbstractC6462 abstractC6462, boolean z) {
        C18432 c18432 = this.f22461;
        c18432.getClass();
        C19043 c19043 = (C19043) abstractC6462.mo5291(c18432, (Object) null);
        C1446.m31700(c19043, new C4647(abstractC6462, 0));
        if (!z) {
            return c19043;
        }
        C13069 c13069 = new C13069(c19043.f26587);
        c13069.f36745 = c19043;
        return c13069;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m19426(C15828 c15828) {
        try {
            return m19409(c15828, c15828);
        } catch (C21865 e) {
            AbstractC7257 abstractC7257 = this.f22440.m35240(c15828).f8850;
            abstractC7257.getClass();
            this.f22475.m38271(abstractC7257, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m19423(AbstractC6462 abstractC6462, C5771 c5771) {
        AbstractC7783 abstractC7783;
        AbstractC7783 abstractC7784;
        C6183 c6183 = this.f22479;
        C12826.requireNonNull(c6183);
        C4842 c4842 = new C4842(c6183, abstractC6462, c5771);
        WeakHashMap weakHashMap = c6183.f15559;
        C4848 c4848 = (C4848) weakHashMap.get(c4842);
        if (c4848 != null) {
            return c4848;
        }
        C19774 c19774 = new C19774(this, c5771, abstractC6462);
        C4848<C5771> c4848M10283 = C4848.m10283();
        for (AbstractC7783 abstractC7785 : m19438(abstractC6462, false).mo22455(c19774, EnumC3620.RECURSIVE)) {
            if (!abstractC6462.f16705.m17989() && !abstractC7785.f20407.m17989()) {
                return C4848.m10276of(abstractC7785);
            }
            if (!c4848M10283.contains(abstractC7785)) {
                c4848M10283 = c4848M10283.m10290((C5771) abstractC7785);
            }
        }
        C20271 c20271 = new C20271();
        for (C5771 c5772 : c4848M10283) {
            Iterator it = c4848M10283.iterator();
            while (true) {
                if (it.hasNext()) {
                    C5771 c5773 = (C5771) it.next();
                    if (c5772 != c5773 && (abstractC7783 = c5773.f20407) != (abstractC7784 = c5772.f20407) && m19467(abstractC7784, abstractC7783.f20406) != null) {
                        break;
                    }
                } else {
                    c20271.m45777(c5772);
                    break;
                }
            }
        }
        C4848 c4848M45783 = c20271.m45783();
        weakHashMap.put(c4842, c4848M45783);
        return c4848M45783;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m19456(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return m19446(abstractC6462, abstractC6463, true) || m19446(abstractC6462, m19459(abstractC6463), true) || m19446(m19459(abstractC6462), abstractC6463, true);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m19501(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        boolean zM19446 = m19446(abstractC6462, abstractC6463, true);
        C3686 c3686 = this.f22469;
        if (zM19446) {
            C4848 c4848Mo14802 = abstractC6462.mo14802();
            return m19445(abstractC6462.mo14787(), m19428(abstractC6463.mo14787(), abstractC6463.mo14802(), c4848Mo14802), c3686);
        }
        return m19445(abstractC6462.mo14787(), m19459(abstractC6463.mo14787()), c3686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19446(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, boolean z) {
        return ((Boolean) (z ? this.f22476 : this.f22464).m23807(abstractC6463, abstractC6462)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m19421(C4848 c4848, C4848 c4849, C4848 c48410) {
        return c4848.m10287((Function) new C3009(this, c4849, c48410));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m19428(AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        C3009 c3009 = new C3009(this, c4848, c4849);
        abstractC6462.getClass();
        return (AbstractC6462) c3009.m23807(null, abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m19461(C4848 c4848, C4848 c4849, C4848 c48410) {
        if (!c4848.isEmpty()) {
            C20271 c20271 = new C20271();
            Iterator it = c4848.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C10485 c10485 = (C10485) ((AbstractC6462) it.next());
                AbstractC6462 abstractC6462M19428 = m19428(c10485.mo14803(), c4849, c48410);
                if (abstractC6462M19428 != c10485.mo14803()) {
                    z = true;
                }
                c20271.m45777(abstractC6462M19428);
            }
            if (z) {
                C20271 c20272 = new C20271();
                Iterator it2 = c4848.iterator();
                while (it2.hasNext()) {
                    AbstractC6462 abstractC6462 = (AbstractC6462) it2.next();
                    c20272.m45777(new C10485(abstractC6462.f16705, null, this.f22480.f69204, abstractC6462.f16704));
                }
                C4848 c4848M45783 = c20272.m45783();
                for (C4848 c4848M45784 = c20271.m45783(); !c4848M45784.isEmpty(); c4848M45784 = c4848M45784.f11035) {
                    c4848M45784.f11034 = m19428((AbstractC6462) c4848M45784.f11034, c4848, c4848M45783);
                }
                C4848 c4848M45785 = c20271.m45783();
                Iterator it3 = c20272.m45783().iterator();
                while (it3.hasNext()) {
                    ((C10485) ((AbstractC6462) it3.next())).mo23233((AbstractC6462) c4848M45785.f11034);
                    c4848M45785 = c4848M45785.f11035;
                }
                return c20272.m45783();
            }
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19447(C11945 c11945, C11945 c11946) {
        C4848 c4848 = c11945.f33323;
        C4848 c4849 = c11946.f33323;
        C4848 c48410 = c4848;
        while (c48410.m10293() && c4849.m10293() && m19490(((AbstractC6462) c48410.f11034).mo14803(), m19428(((AbstractC6462) c4849.f11034).mo14803(), c11946.f33323, c4848))) {
            c48410 = c48410.f11035;
            c4849 = c4849.f11035;
        }
        return c48410.isEmpty() && c4849.isEmpty();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C4848 m19504(C4848 c4848) {
        C4848 c4848M10287 = c4848.m10287((Function) f22437);
        for (C4848 c4849 = c4848M10287; c4849.m10293(); c4849 = c4849.f11035) {
            C10485 c10485 = (C10485) c4849.f11034;
            c10485.mo23233(m19428(c10485.mo14803(), c4848, c4848M10287));
        }
        return c4848M10287;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m19427(AbstractC6462 abstractC6462, C4848 c4848) {
        return (AbstractC6462) abstractC6462.mo5291(this.f22442, c4848);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m19464(AbstractC6462 abstractC6462, C4848 c4848) {
        return (AbstractC6462) abstractC6462.mo5291(this.f22467, c4848);
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 m19482(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return (AbstractC6462) abstractC6462.mo5291(this.f22457, abstractC6463);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C13956 m19475(AbstractC6462 abstractC6462) {
        return new C13956(abstractC6462, this.f22480.f69144);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13956 m19397(AbstractC12224 abstractC12224, AbstractC21195 abstractC21195, AbstractC6462 abstractC6462) {
        return new C13956(new C15828(1073741833L, abstractC12224, null, abstractC21195), abstractC6462);
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m19457(AbstractC6462 abstractC6462) {
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i == 2) {
            C21333 c21333 = (C21333) abstractC6462;
            if (c21333.f67262 < 0) {
                if (c21333.f16705.mo17995() == this.f22471.f21745) {
                    c21333.f67262 = 0;
                } else {
                    int iM19457 = m19457(m19502(c21333));
                    for (C4848 c4848M19450 = m19450(c21333); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
                        if (m19457((AbstractC6462) c4848M19450.f11034) > iM19457) {
                            iM19457 = m19457((AbstractC6462) c4848M19450.f11034);
                        }
                    }
                    c21333.f67262 = iM19457 + 1;
                }
            }
            return c21333.f67262;
        }
        if (i != 12) {
            if (i == 15 || i == 16) {
                return 0;
            }
            throw new AssertionError();
        }
        C10485 c10485 = (C10485) abstractC6462;
        if (c10485.f29023 < 0) {
            int iM19458 = m19457(m19502(c10485));
            for (C4848 c4848M19451 = m19450(c10485); c4848M19451.m10293(); c4848M19451 = c4848M19451.f11035) {
                if (m19457((AbstractC6462) c4848M19451.f11034) > iM19458) {
                    iM19458 = m19457((AbstractC6462) c4848M19451.f11034);
                }
            }
            c10485.f29023 = iM19458 + 1;
        }
        return c10485.f29023;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m19487(AbstractC6462 abstractC6462) {
        HashMap map = this.f22453;
        C4848 c4848M19487 = (C4848) map.get(abstractC6462);
        if (c4848M19487 == null) {
            AbstractC6462 abstractC6462M19502 = m19502(abstractC6462);
            boolean zMo7388 = abstractC6462.mo7388();
            C10682 c10682 = this.f22468;
            if (!zMo7388) {
                if (!abstractC6462M19502.m14777(EnumC11353.CLASS)) {
                    if (abstractC6462M19502.m14777(EnumC11353.TYPEVAR)) {
                        c4848M19487 = m19487(abstractC6462M19502).m10290(abstractC6462);
                    } else {
                        c4848M19487 = C4848.m10276of((Object) abstractC6462);
                    }
                } else {
                    c4848M19487 = m19422(m19487(abstractC6462M19502), abstractC6462, c10682);
                }
            } else {
                c4848M19487 = m19487(m19502(abstractC6462));
            }
            for (C4848 c4848M19450 = m19450(abstractC6462); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
                c4848M19487 = m19420(c4848M19487, m19487((AbstractC6462) c4848M19450.f11034), c10682);
            }
            map.put(abstractC6462, c4848M19487);
        }
        return c4848M19487;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m19422(C4848 c4848, AbstractC6462 abstractC6462, BiPredicate biPredicate) {
        if (c4848.isEmpty()) {
            return c4848.m10290(abstractC6462);
        }
        if (biPredicate.test(abstractC6462, (AbstractC6462) c4848.f11034)) {
            return c4848;
        }
        if (abstractC6462.f16705.m47865(((AbstractC6462) c4848.f11034).f16705, this)) {
            return c4848.m10290(abstractC6462);
        }
        return m19422(c4848.f11035, abstractC6462, biPredicate).m10290((AbstractC6462) c4848.f11034);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m19420(C4848 c4848, C4848 c4849, BiPredicate biPredicate) {
        if (c4848.isEmpty()) {
            return c4849;
        }
        if (c4849.isEmpty()) {
            return c4848;
        }
        if (biPredicate.test((AbstractC6462) c4848.f11034, (AbstractC6462) c4849.f11034)) {
            return m19420(c4848.f11035, c4849.f11035, biPredicate).m10290((AbstractC6462) c4848.f11034);
        }
        if (((AbstractC6462) c4849.f11034).f16705.m47865(((AbstractC6462) c4848.f11034).f16705, this)) {
            return m19420(c4848, c4849.f11035, biPredicate).m10290((AbstractC6462) c4849.f11034);
        }
        return m19420(c4848.f11035, c4849, biPredicate).m10290((AbstractC6462) c4848.f11034);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C4848 m19473(C4848 c4848, C4848 c4849) {
        return m19420(c4848, c4849, this.f22468);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m19492(C4848 c4848, C4848 c4849) {
        C21215 c21215;
        if (c4848 == c4849) {
            return c4848;
        }
        if (c4848.isEmpty() || c4849.isEmpty()) {
            return C4848.m10283();
        }
        if (((AbstractC6462) c4848.f11034).f16705.m47865(((AbstractC6462) c4849.f11034).f16705, this)) {
            return m19492(c4848.f11035, c4849);
        }
        if (((AbstractC6462) c4849.f11034).f16705.m47865(((AbstractC6462) c4848.f11034).f16705, this)) {
            return m19492(c4848, c4849.f11035);
        }
        if (m19490((AbstractC6462) c4848.f11034, (AbstractC6462) c4849.f11034)) {
            return m19492(c4848.f11035, c4849.f11035).m10290((AbstractC6462) c4848.f11034);
        }
        AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
        if (abstractC6462.f16705 == ((AbstractC6462) c4849.f11034).f16705) {
            EnumC11353 enumC11353 = EnumC11353.CLASS;
            if (abstractC6462.m14777(enumC11353) && ((AbstractC6462) c4849.f11034).m14777(enumC11353)) {
                if (((AbstractC6462) c4848.f11034).mo14781() && ((AbstractC6462) c4849.f11034).mo14781()) {
                    AbstractC6462 abstractC6463 = (AbstractC6462) c4848.f11034;
                    AbstractC6462 abstractC6464 = (AbstractC6462) c4849.f11034;
                    C21333 c21333 = (C21333) abstractC6463;
                    C4848 c4848Mo14802 = c21333.mo14802();
                    C4848 c4848Mo14803 = ((C21333) abstractC6464).mo14802();
                    C20271 c20271 = new C20271();
                    C4848 c4848Mo14804 = c21333.f16705.f20406.mo14802();
                    while (c4848Mo14802.m10293() && c4848Mo14803.m10293() && c4848Mo14804.m10293()) {
                        if (m19470((AbstractC6462) c4848Mo14802.f11034, (AbstractC6462) c4848Mo14803.f11034)) {
                            c20271.m45777((AbstractC6462) c4848Mo14802.f11034);
                        } else {
                            if (m19470((AbstractC6462) c4848Mo14803.f11034, (AbstractC6462) c4848Mo14802.f11034)) {
                                c20271.m45777((AbstractC6462) c4848Mo14803.f11034);
                            } else {
                                C10386 c10386 = new C10386(abstractC6463, abstractC6464, this);
                                HashSet hashSet = this.f22451;
                                boolean zAdd = hashSet.add(c10386);
                                C22004 c22004 = this.f22480;
                                if (zAdd) {
                                    c21215 = new C21215(m19432(m19451((AbstractC6462) c4848Mo14802.f11034), m19451((AbstractC6462) c4848Mo14803.f11034)), EnumC17268.EXTENDS, c22004.f69162);
                                    hashSet.remove(c10386);
                                } else {
                                    c21215 = new C21215(c22004.f69208, EnumC17268.UNBOUND, c22004.f69162);
                                }
                                c21215.mo14801((AbstractC6462) c4848Mo14804.f11034);
                                c20271.m45777(c21215);
                            }
                            c4848Mo14802 = c4848Mo14802.f11035;
                            c4848Mo14803 = c4848Mo14803.f11035;
                            c4848Mo14804 = c4848Mo14804.f11035;
                            abstractC6463 = abstractC6463;
                        }
                        abstractC6463 = abstractC6463;
                        c4848Mo14802 = c4848Mo14802.f11035;
                        c4848Mo14803 = c4848Mo14803.f11035;
                        c4848Mo14804 = c4848Mo14804.f11035;
                        abstractC6463 = abstractC6463;
                    }
                    C1446.m31704(c4848Mo14802.isEmpty() && c4848Mo14803.isEmpty() && c4848Mo14804.isEmpty());
                    return m19492(c4848.f11035, c4849.f11035).m10290(new C21333(c21333.f16705, c21333.mo7201(), c20271.m45783()));
                }
                if (((AbstractC6462) c4848.f11034).mo14784() || ((AbstractC6462) c4849.f11034).mo14784()) {
                    return m19492(c4848.f11035, c4849.f11035).m10290(m19459((AbstractC6462) c4848.f11034));
                }
            }
        }
        return m19492(c4848.f11035, c4849.f11035);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public C4848 m19405(C4848 c4848) {
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        HashSet hashSet = new HashSet();
        while (!c4848.isEmpty()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
            boolean zContains = hashSet.contains(abstractC6462);
            boolean z = !zContains;
            if (!zContains && abstractC6462.m14777(EnumC11353.TYPEVAR)) {
                Iterator it = c4848.f11035.iterator();
                while (it.hasNext()) {
                    if (m19486((AbstractC6462) it.next(), abstractC6462, false)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                if (abstractC6462.mo14789()) {
                    c20272.m45777(abstractC6462);
                } else {
                    c20271.m45777(abstractC6462);
                }
                for (AbstractC6462 abstractC6463 : c4848.f11035) {
                    if (m19486(abstractC6462, abstractC6463, false)) {
                        hashSet.add(abstractC6463);
                    }
                }
            }
            c4848 = c4848.f11035;
        }
        c20271.m45779(c20272);
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC6462 m19488(C4848 c4848) {
        return m19432((AbstractC6462[]) c4848.toArray(new AbstractC6462[c4848.m10289()]));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m19432(AbstractC6462... abstractC6462Arr) {
        int[] iArr = new int[abstractC6462Arr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = abstractC6462Arr.length;
            C22004 c22004 = this.f22480;
            if (i >= length) {
                if (i2 == 0) {
                    return c22004.f69204;
                }
                if (i2 == 1) {
                    AbstractC6462[] abstractC6462Arr2 = new AbstractC6462[abstractC6462Arr.length];
                    for (int i3 = 0; i3 < abstractC6462Arr.length; i3++) {
                        AbstractC6462 abstractC6462M8982 = this.f22447.m8982(abstractC6462Arr[i3]);
                        abstractC6462Arr2[i3] = abstractC6462M8982;
                        if (abstractC6462M8982.mo14805()) {
                            AbstractC6462 abstractC6462 = abstractC6462Arr[0];
                            for (int i4 = 1; i4 < abstractC6462Arr.length; i4++) {
                                if (!m19490(abstractC6462, abstractC6462Arr[i4])) {
                                    return m19410();
                                }
                            }
                            return abstractC6462;
                        }
                    }
                    return new C7251(m19432(abstractC6462Arr2), c22004.f69187);
                }
                if (i2 == 2) {
                    int i5 = 0;
                    for (AbstractC6462 abstractC6463 : abstractC6462Arr) {
                        if (abstractC6463.m14777(EnumC11353.CLASS) || abstractC6463.m14777(EnumC11353.TYPEVAR)) {
                            break;
                        }
                        i5++;
                    }
                    C1446.m31704(i5 < abstractC6462Arr.length);
                    C4848 c4848M19500 = m19500(abstractC6462Arr[i5]);
                    int i6 = i5 + 1;
                    for (int i7 = i6; i7 < abstractC6462Arr.length; i7++) {
                        AbstractC6462 abstractC6464 = abstractC6462Arr[i7];
                        if (abstractC6464.m14777(EnumC11353.CLASS) || abstractC6464.m14777(EnumC11353.TYPEVAR)) {
                            c4848M19500 = m19492(c4848M19500, m19500(abstractC6464));
                        }
                    }
                    C4848<AbstractC6462> c4848M19405 = m19405(c4848M19500);
                    C4848 c4848M10283 = C4848.m10283();
                    for (AbstractC6462 abstractC6465 : c4848M19405) {
                        C4848 c4848M10276of = C4848.m10276of((Object) m19467(abstractC6465.f16705, abstractC6462Arr[i5]));
                        for (int i8 = i6; i8 < abstractC6462Arr.length; i8++) {
                            AbstractC6462 abstractC6462M19467 = m19467(abstractC6465.f16705, abstractC6462Arr[i8]);
                            c4848M10276of = m19492(c4848M10276of, abstractC6462M19467 != null ? C4848.m10276of((Object) abstractC6462M19467) : C4848.m10283());
                        }
                        c4848M10283.getClass();
                        c4848M10283 = c4848M10276of.m10292(c4848M10283);
                    }
                    if (c4848M10283.isEmpty()) {
                        return c22004.f69208;
                    }
                    C4848 c4848M19406 = m19405(c4848M10283);
                    if (c4848M19406.isEmpty()) {
                        return null;
                    }
                    if (c4848M19406.f11035.isEmpty()) {
                        return (AbstractC6462) c4848M19406.f11034;
                    }
                    return m19474(c4848M19406);
                }
                C4848 c4848M10276of2 = C4848.m10276of((Object) m19410());
                for (int i9 = 0; i9 < abstractC6462Arr.length; i9++) {
                    if (iArr[i9] != 1) {
                        c4848M10276of2 = c4848M10276of2.m10290(abstractC6462Arr[i9]);
                    }
                }
                return m19488(c4848M10276of2);
            }
            AbstractC6462 abstractC6462Mo14803 = abstractC6462Arr[i];
            int i10 = C12889.f36249[abstractC6462Mo14803.mo5577().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 12) {
                        do {
                            abstractC6462Mo14803 = abstractC6462Mo14803.mo14803();
                        } while (abstractC6462Mo14803.m14777(EnumC11353.TYPEVAR));
                        if (abstractC6462Mo14803.m14777(EnumC11353.ARRAY)) {
                            iArr[i] = 1;
                        } else {
                            iArr[i] = 2;
                        }
                    } else {
                        iArr[i] = 0;
                        if (abstractC6462Mo14803.mo14805()) {
                            return c22004.f69139;
                        }
                    }
                    i++;
                } else {
                    iArr[i] = 2;
                }
                i2 |= 2;
                i++;
            } else {
                iArr[i] = 1;
            }
            i2 |= 1;
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C4848 m19500(AbstractC6462 abstractC6462) {
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6463 : m19487(abstractC6462)) {
            if (abstractC6463.m14777(EnumC11353.TYPEVAR)) {
                c20271.m45777(abstractC6463);
            } else {
                c20271.m45777(m19459(abstractC6463));
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public AbstractC6462 m19410() {
        if (this.f22456 == null) {
            C22004 c22004 = this.f22480;
            this.f22456 = m19434(C4848.m10277of((Object) c22004.f69169, (Object) c22004.f69127), true);
        }
        return this.f22456;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 m19493(C4848 c4848) {
        AbstractC6462 abstractC6462M19495 = (AbstractC6462) c4848.f11034;
        for (AbstractC6462 abstractC6462 : c4848.f11035) {
            if (abstractC6462M19495.mo14812()) {
                return abstractC6462M19495;
            }
            abstractC6462M19495 = m19495(abstractC6462M19495, abstractC6462);
        }
        return abstractC6462M19495;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 m19495(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        if (abstractC6463 == null) {
            return abstractC6462;
        }
        boolean zMo14805 = abstractC6462.mo14805();
        C22004 c22004 = this.f22480;
        if (!zMo14805 && !abstractC6463.mo14805()) {
            int i = 0;
            if (m19486(abstractC6462, abstractC6463, false)) {
                return abstractC6462;
            }
            if (m19486(abstractC6463, abstractC6462, false)) {
                return abstractC6463;
            }
            C4848<AbstractC6462> c4848M19405 = m19405(m19420(m19487(abstractC6462), m19487(abstractC6463), this.f22468));
            if (c4848M19405.isEmpty()) {
                return c22004.f69208;
            }
            if (c4848M19405.f11035.isEmpty()) {
                return (AbstractC6462) c4848M19405.f11034;
            }
            C4848 c4848M10283 = C4848.m10283();
            C4848 c4848M10284 = C4848.m10283();
            for (AbstractC6462 abstractC6464 : c4848M19405) {
                if (!abstractC6464.mo14789()) {
                    i++;
                    AbstractC6462 abstractC6462M19414 = m19414(abstractC6464);
                    if (abstractC6464 != abstractC6462M19414 && !abstractC6462M19414.m14777(EnumC11353.BOT)) {
                        c4848M10283 = c4848M10283.m10286(abstractC6464);
                        c4848M10284 = c4848M10284.m10286(abstractC6462M19414);
                    }
                }
            }
            if (i > 1) {
                if (c4848M10284.isEmpty()) {
                    return m19475(abstractC6462);
                }
                C4848 c4848M10288 = c4848M19405.m10288(c4848M10283);
                c4848M10288.getClass();
                return m19493(c4848M10284.m10292(c4848M10288));
            }
            return m19474(c4848M19405);
        }
        return c22004.f69139;
    }

    /* JADX INFO: renamed from: ۤ */
    public static int m19408(AbstractC6462 abstractC6462) {
        C24287 c24287 = f22438;
        c24287.getClass();
        return ((Integer) abstractC6462.mo5291(c24287, (Object) null)).intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19445(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        if (m19490(abstractC6462, abstractC6463)) {
            return true;
        }
        return (abstractC6462.mo14805() || abstractC6463.mo14805() || !m19471(abstractC6462, abstractC6463, c3686)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m19436(AbstractC6462 abstractC6462) {
        C22004 c22004 = this.f22480;
        return c22004.m49587(c22004.f69191, c22004.f69159[abstractC6462.mo5577().ordinal()]);
    }

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC6462 m19503(AbstractC6462 abstractC6462) {
        if (abstractC6462.m14777(EnumC11353.ERROR)) {
            return AbstractC6462.f16700;
        }
        int i = 0;
        while (true) {
            C22004 c22004 = this.f22480;
            AbstractC12224[] abstractC12224Arr = c22004.f69159;
            if (i < abstractC12224Arr.length) {
                AbstractC12224 abstractC12224 = abstractC12224Arr[i];
                if (abstractC12224 != null && m19467(c22004.m49587(c22004.f69191, abstractC12224), abstractC6462) != null) {
                    return c22004.f69143[i];
                }
                i++;
            } else {
                return AbstractC6462.f16700;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC6462 m19499(AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462M19503 = m19503(abstractC6462);
        return abstractC6462M19503.m14777(EnumC11353.NONE) ? abstractC6462 : abstractC6462M19503;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m19463(AbstractC6462 abstractC6462) {
        C22004 c22004;
        AbstractC6462 abstractC6462M19463;
        if (!abstractC6462.m14777(EnumC11353.CLASS)) {
            return abstractC6462;
        }
        if (abstractC6462.mo7201() != AbstractC6462.f16700 && (abstractC6462M19463 = m19463(abstractC6462.mo7201())) != abstractC6462.mo7201()) {
            abstractC6462 = m19428(m19483(abstractC6462.f16705, abstractC6462M19463), abstractC6462.f16705.f20406.mo14802(), abstractC6462.mo14802());
        }
        C21333 c21333 = (C21333) abstractC6462;
        if (c21333.mo14784() || !c21333.mo14781()) {
            return c21333;
        }
        C4848 c4848Mo14802 = ((C21333) c21333.f16705.f20406).mo14802();
        C4848 c4848Mo14803 = c21333.mo14802();
        C20271 c20271 = new C20271();
        Iterator it = c4848Mo14803.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c22004 = this.f22480;
            if (!zHasNext) {
                break;
            }
            AbstractC6462 abstractC6463 = (AbstractC6462) it.next();
            if (abstractC6463.m14777(EnumC11353.WILDCARD)) {
                C21215 c21215 = (C21215) abstractC6463;
                AbstractC6462 abstractC6464 = c21215.f66702 == EnumC17268.EXTENDS ? c21215.f66703 : null;
                if (abstractC6464 == null) {
                    abstractC6464 = c22004.f69208;
                }
                c20271.m45777(new C16637(this.f22449, c22004.f69157, abstractC6464, c22004.f69204, c21215));
            } else {
                c20271.m45777(abstractC6463);
            }
        }
        C4848 c4848M45783 = c20271.m45783();
        boolean z = false;
        C4848 c4848 = c4848Mo14802;
        C4848 c4849 = c4848M45783;
        while (!c4848.isEmpty() && !c4848Mo14803.isEmpty() && !c4849.isEmpty()) {
            Object obj = c4849.f11034;
            Object obj2 = c4848Mo14803.f11034;
            if (obj != obj2) {
                C21215 c21216 = (C21215) obj2;
                AbstractC6462 abstractC6462Mo14803 = ((AbstractC6462) c4848.f11034).mo14803();
                C16637 c16637 = (C16637) c4849.f11034;
                if (abstractC6462Mo14803 == null) {
                    abstractC6462Mo14803 = c22004.f69208;
                }
                int[] iArr = C12889.f36248;
                EnumC17268 enumC17268 = c21216.f66702;
                EnumC17268 enumC17269 = c21216.f66702;
                int i = iArr[enumC17268.ordinal()];
                if (i == 1) {
                    c16637.mo23233(m19495(enumC17269 == EnumC17268.EXTENDS ? c21216.f66703 : null, m19428(abstractC6462Mo14803, c4848Mo14802, c4848M45783)));
                    c16637.f29021 = c22004.f69204;
                } else if (i == 2) {
                    c16637.mo23233(m19428(abstractC6462Mo14803, c4848Mo14802, c4848M45783));
                    c16637.f29021 = enumC17269 == EnumC17268.SUPER ? c21216.f66703 : null;
                } else if (i == 3) {
                    c16637.mo23233(m19428(abstractC6462Mo14803, c4848Mo14802, c4848M45783));
                    c16637.f29021 = c22004.f69204;
                }
                AbstractC6462 abstractC6462Mo14804 = c16637.mo14803();
                EnumC11353 enumC11353 = EnumC11353.UNDETVAR;
                AbstractC6462 abstractC6462Mo14805 = abstractC6462Mo14804.m14777(enumC11353) ? ((C3108) c16637.mo14803()).f16992 : c16637.mo14803();
                AbstractC6462 abstractC6465 = c16637.f29021.m14777(enumC11353) ? ((C3108) c16637.f29021).f16992 : c16637.f29021;
                AbstractC6462 abstractC6462Mo14806 = c16637.mo14803();
                EnumC11353 enumC11354 = EnumC11353.ERROR;
                if (!abstractC6462Mo14806.m14777(enumC11354) && !c16637.f29021.m14777(enumC11354) && m19490(abstractC6462Mo14805, abstractC6465)) {
                    c4849.f11034 = c16637.mo14803();
                }
                z = true;
            }
            c4848 = c4848.f11035;
            c4848Mo14803 = c4848Mo14803.f11035;
            c4849 = c4849.f11035;
        }
        if (c4848.isEmpty() && c4848Mo14803.isEmpty() && c4849.isEmpty()) {
            return z ? new C21333(c21333.mo7201(), c4848M45783, c21333.f16705, c21333.f16704) : abstractC6462;
        }
        return m19459(abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19402(C8374 c8374, C21333 c21333, AbstractC6462 abstractC6462, C3686 c3686) {
        boolean z;
        AbstractC6462 abstractC6463;
        AbstractC6462 abstractC6464;
        if ((abstractC6462.f16705.mo18003() & 512) == 0) {
            C1446.m31704((c21333.f16705.mo18003() & 512) != 0);
            z = true;
            abstractC6463 = c21333;
            abstractC6464 = abstractC6462;
        } else {
            z = false;
            abstractC6464 = c21333;
            abstractC6463 = abstractC6462;
        }
        C4848 c4848M19406 = c8374.m19406(abstractC6463, c8374.m19459(abstractC6464));
        boolean zIsEmpty = c4848M19406.isEmpty();
        while (c4848M19406.m10293()) {
            AbstractC6462 abstractC6462M19467 = c8374.m19467(((AbstractC6462) c4848M19406.f11034).f16705, abstractC6464);
            AbstractC6462 abstractC6465 = (AbstractC6462) c4848M19406.f11034;
            if (c8374.m19484(abstractC6462M19467.mo14802(), abstractC6465.mo14802())) {
                return false;
            }
            zIsEmpty = zIsEmpty || (!z ? !c8374.m19407(abstractC6462M19467, abstractC6465) : !c8374.m19407(abstractC6465, abstractC6462M19467));
            c4848M19406 = c4848M19406.f11035;
        }
        if (zIsEmpty) {
            if (!z) {
                abstractC6464 = abstractC6463;
            }
            if (!c8374.m19417(abstractC6464)) {
                c3686.mo7112(EnumC21706.UNCHECKED);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m19412(C8374 c8374, C21333 c21333, AbstractC6462 abstractC6462, C3686 c3686) {
        AbstractC6462 abstractC6463;
        boolean z;
        AbstractC6462 abstractC6464;
        if ((abstractC6462.f16705.mo18003() & 512) == 0) {
            C1446.m31704((c21333.f16705.mo18003() & 512) != 0);
            abstractC6463 = c21333;
            abstractC6464 = abstractC6462;
            z = true;
        } else {
            abstractC6463 = abstractC6462;
            z = false;
            abstractC6464 = c21333;
        }
        C1446.m31704((abstractC6464.f16705.mo18003() & 16) != 0);
        AbstractC6462 abstractC6462M19467 = c8374.m19467(abstractC6463.f16705, abstractC6464);
        if (abstractC6462M19467 == null || c8374.m19484(abstractC6462M19467.mo14802(), abstractC6463.mo14802())) {
            return false;
        }
        if (!c8374.m19417(abstractC6462) && (!z ? c8374.m19407(abstractC6462M19467, abstractC6463) : c8374.m19407(abstractC6463, abstractC6462M19467))) {
            c3686.mo7112(EnumC21706.UNCHECKED);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ */
    public boolean m19407(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        for (AbstractC6462 abstractC6464 : abstractC6463.mo7388() ? m19505(abstractC6463) : C4848.m10276of((Object) abstractC6463)) {
            AbstractC6462 abstractC6462M19465 = m19465(abstractC6462, abstractC6464.f16705);
            if (abstractC6464.mo14781() && !m19454(abstractC6464) && !m19486(abstractC6462, abstractC6464, true) && (abstractC6462M19465 == null || !m19442(abstractC6464.mo14798(), abstractC6462M19465.mo14798()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ */
    private C4848 m19406(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C4848 c4848M10283 = C4848.m10283();
        for (C4848 c4848M19450 = m19450(abstractC6462); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            boolean zM19486 = m19486(abstractC6463, m19459((AbstractC6462) c4848M19450.f11034), true);
            C10682 c10682 = this.f22468;
            if (zM19486) {
                c4848M10283 = m19422(c4848M10283, (AbstractC6462) c4848M19450.f11034, c10682);
            } else {
                c4848M10283 = m19420(c4848M10283, m19406((AbstractC6462) c4848M19450.f11034, abstractC6463), c10682);
            }
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19440(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C20271 c20271, C20271 c20272) {
        C17581 c17581 = new C17581(this, c20271, c20272);
        abstractC6462.mo5291(c17581, abstractC6463);
        C4848 c4848M45783 = c17581.f52548.m45783();
        C4848 c4848M45784 = c17581.f52544.m45783();
        while (!c4848M45783.isEmpty()) {
            AbstractC6462 abstractC6464 = (AbstractC6462) c17581.f52546.get(((AbstractC6462) c4848M45783.f11034).f16705);
            if (c4848M45784.f11034 != abstractC6464) {
                c4848M45784.f11034 = abstractC6464;
            }
            c4848M45783 = c4848M45783.f11035;
            c4848M45784 = c4848M45784.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21215 m19398(C8374 c8374, AbstractC6462 abstractC6462, C10485 c10485) {
        C22004 c22004 = c8374.f22480;
        AbstractC6462 abstractC6463 = c22004.f69208;
        C15828 c15828 = c22004.f69162;
        if (abstractC6462 == abstractC6463) {
            return new C21215(c22004.f69208, EnumC17268.UNBOUND, c15828, c10485);
        }
        return new C21215(abstractC6462, EnumC17268.EXTENDS, c15828, c10485);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21215 m19411(C8374 c8374, AbstractC6462 abstractC6462, C10485 c10485) {
        C22004 c22004 = c8374.f22480;
        if (abstractC6462.m14777(EnumC11353.BOT)) {
            return new C21215(c22004.f69208, EnumC17268.UNBOUND, c22004.f69162, c10485);
        }
        return new C21215(abstractC6462, EnumC17268.SUPER, c22004.f69162, c10485);
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC24645 m19468(AbstractC21195 abstractC21195) {
        EnumC24645 enumC24645 = EnumC24645.CLASS;
        C17939 c17939M17984 = abstractC21195.m17984(this.f22480.f69177.f16705);
        if (c17939M17984 != null) {
            C8200 c8200 = this.f22471;
            AbstractC10564 abstractC10564M40797 = c17939M17984.m40797(c8200.f21718);
            if (abstractC10564M40797 != null && (abstractC10564M40797 instanceof C18610)) {
                AbstractC12224 abstractC12224 = ((C18610) abstractC10564M40797).f55580.f20408;
                if (abstractC12224 == c8200.f21689) {
                    return EnumC24645.SOURCE;
                }
                if (abstractC12224 != c8200.f21673 && abstractC12224 == c8200.f21696) {
                    return EnumC24645.RUNTIME;
                }
            }
        }
        return enumC24645;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m19431(InterfaceC10057 interfaceC10057) {
        int iMo3348 = interfaceC10057.mo3348();
        C22004 c22004 = this.f22480;
        switch (iMo3348) {
            case 3:
                return c22004.f69134;
            case 4:
                return c22004.f69165;
            case 5:
                return c22004.f69152;
            case 6:
                return c22004.f69181;
            case 7:
                return c22004.f69196;
            case 8:
                return c22004.f69215;
            default:
                switch (iMo3348) {
                    case 15:
                        return c22004.f69185;
                    case 16:
                        return c22004.f69137;
                    case 17:
                        return ((C10465) interfaceC10057).f20406;
                    default:
                        throw new AssertionError("Not a loadable constant: " + interfaceC10057.mo3348());
                }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19439() {
        this.f22445.f40529.clear();
        this.f22444.clear();
        this.f22477.f26218.clear();
        this.f22461.f55131.clear();
        this.f22453.clear();
    }
}
