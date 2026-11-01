package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܶ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16852 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C6468 f49878 = new C6468();

    /* JADX INFO: renamed from: ۧ֫ */
    public static final AbstractC6363 f49879 = new C11490();

    /* JADX INFO: renamed from: ֡ */
    public C6953 f49880;

    /* JADX INFO: renamed from: ֨ */
    public final C23623 f49881;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f49882;

    /* JADX INFO: renamed from: ۗ */
    public final C23663 f49884;

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC13035 f49885;

    /* JADX INFO: renamed from: ۙ */
    public C6859 f49886;

    /* JADX INFO: renamed from: ۛ */
    public char f49888;

    /* JADX INFO: renamed from: ۜ */
    public C19694 f49889;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f49890;

    /* JADX INFO: renamed from: ۠ */
    public C5771 f49891;

    /* JADX INFO: renamed from: ۡ */
    public final C8005 f49892;

    /* JADX INFO: renamed from: ۢ */
    public AbstractC12224[] f49893;

    /* JADX INFO: renamed from: ۤ */
    public final C22004 f49894;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f49895;

    /* JADX INFO: renamed from: ۨ */
    public final C18728 f49896;

    /* JADX INFO: renamed from: ۫ */
    public C6859 f49897;

    /* JADX INFO: renamed from: ۬ */
    public final EnumC17840 f49898;

    /* JADX INFO: renamed from: ܰ */
    public C6859 f49899;

    /* JADX INFO: renamed from: ܳ */
    public Set f49900;

    /* JADX INFO: renamed from: ܶ */
    public final C8200 f49901;

    /* JADX INFO: renamed from: ܺ */
    public final C15492 f49902;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f49903;

    /* JADX INFO: renamed from: ᩴ */
    public final C8769 f49906;

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC8045 f49908;

    /* JADX INFO: renamed from: ᩷ */
    public C6859 f49909;

    /* JADX INFO: renamed from: ᩹ */
    public final C24387 f49911;

    /* JADX INFO: renamed from: ᩺ */
    public final C8374 f49912;

    /* JADX INFO: renamed from: ᩻ */
    public final C14152 f49913;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f49904 = new HashMap();

    /* JADX INFO: renamed from: ۚ */
    public HashMap f49887 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC6125 f49905 = new C24900(this);

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC14409 f49907 = new C10819();

    /* JADX INFO: renamed from: ᩸ */
    public C3686 f49910 = new C3686();

    /* JADX INFO: renamed from: ۖ */
    public C6611 f49883 = new C6611(3);

    /* JADX INFO: renamed from: ֫ */
    public static int m38211(long j) {
        short s = (short) (j & 7);
        if (s == 0) {
            return 2;
        }
        if (s != 2) {
            return s != 4 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ boolean m38238(C16852 c16852, AbstractC7783 abstractC7783) {
        c16852.getClass();
        return m38235(abstractC7783);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m38240(C16852 c16852, C17939 c17939) {
        c16852.getClass();
        return C23573.stream(c16852.m38346(c17939.f29256.f16705)).anyMatch(new C13898(0, c16852));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m38274(C2417 c2417, AbstractC12224 abstractC12224) {
        return (C15828) this.f49904.get(new C24293(c2417, abstractC12224));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    /* JADX INFO: renamed from: ֫ */
    public final void m38299(final AbstractC7257 abstractC7257, final C5771 c5771, C5771 c5772, C15828 c15828) {
        boolean zM19445;
        boolean z;
        C12895 c12895;
        C14040 c14040;
        long j = c5771.f20409;
        if ((2147487744L & j) == 0) {
            long j2 = c5772.f20409;
            if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j2) != 0) {
                return;
            }
            long j3 = j & 8;
            C23623 c23623 = this.f49881;
            if (j3 != 0 && (j2 & 8) == 0) {
                AbstractC7257 abstractC7257M21405 = C9268.m21405(c5771, abstractC7257, false);
                C13370 c13370M38213 = m38213(c5771, c5772);
                C14040 c14041 = C8300.f21997;
                c23623.m9352(abstractC7257M21405, new C14040("compiler", "override.static", c13370M38213));
                c5771.f20409 |= 35184372088832L;
                return;
            }
            if ((16 & j2) != 0 || (j3 == 0 && (j2 & 8) != 0)) {
                AbstractC7257 abstractC7257M21406 = C9268.m21405(c5771, abstractC7257, false);
                C13370 c13370M38214 = m38213(c5771, c5772);
                EnumSet enumSetM47446 = C21036.m47446(c5772.f20409 & 24);
                C14040 c14042 = C8300.f21997;
                c23623.m9352(abstractC7257M21406, new C14040("compiler", "override.meth", c13370M38214, enumSetM47446));
                c5771.f20409 |= 35184372088832L;
                return;
            }
            if ((c5771.f20407.mo18003() & 8192) != 0) {
                return;
            }
            if (m38211(c5771.f20409) > m38211(c5772.f20409)) {
                AbstractC7257 abstractC7257M21407 = C9268.m21405(c5771, abstractC7257, false);
                if ((c5772.f20409 & 7) == 0) {
                    C13370 c13370M38215 = m38213(c5771, c5772);
                    C14040 c14043 = C8300.f21997;
                    c14040 = new C14040("compiler", "override.weaker.access", c13370M38215, "package");
                } else {
                    C13370 c13370M38216 = m38213(c5771, c5772);
                    EnumSet enumSetM47447 = C21036.m47446(c5772.f20409 & 7);
                    C14040 c14044 = C8300.f21997;
                    c14040 = new C14040("compiler", "override.weaker.access", c13370M38216, enumSetM47447);
                }
                c23623.m9352(abstractC7257M21407, c14040);
                c5771.f20409 |= 35184372088832L;
                return;
            }
            AbstractC6462 abstractC6462 = c15828.f20406;
            C8374 c8374 = this.f49912;
            AbstractC6462 abstractC6462M19483 = c8374.m19483(c5771, abstractC6462);
            AbstractC6462 abstractC6462M19484 = c8374.m19483(c5772, c15828.f20406);
            C4848 c4848Mo14802 = abstractC6462M19483.mo14802();
            C4848 c4848Mo14803 = abstractC6462M19484.mo14802();
            AbstractC6462 abstractC6462Mo14787 = abstractC6462M19483.mo14787();
            AbstractC6462 abstractC6462M19428 = c8374.m19428(abstractC6462M19484.mo14787(), c4848Mo14803, c4848Mo14802);
            C3686 c3686 = this.f49910;
            c3686.m7107();
            if (c8374.m19490(abstractC6462M19483.mo14787(), abstractC6462M19428)) {
                zM19445 = true;
            } else if (abstractC6462M19483.mo14787().mo14805() || abstractC6462M19428.mo14805()) {
                zM19445 = false;
            } else if (c8374.m19446(abstractC6462M19483, abstractC6462M19484, true)) {
                zM19445 = c8374.m19445(abstractC6462M19483.mo14787(), abstractC6462M19428, c3686);
            } else {
                if (!c8374.m19491(abstractC6462M19483.mo14787(), abstractC6462M19428, c3686)) {
                    if (c8374.m19486(abstractC6462M19483.mo14787(), c8374.m19459(abstractC6462M19428), true)) {
                        c3686.mo7112(EnumC21706.UNCHECKED);
                    } else {
                        zM19445 = false;
                    }
                }
                zM19445 = true;
            }
            if (!zM19445) {
                if ((c5771.f20409 & 8) == 0 || (c5772.f20409 & 8) == 0) {
                    AbstractC7257 abstractC7257M21408 = C9268.m21405(c5771, abstractC7257, false);
                    C13370 c13370M38217 = m38213(c5771, c5772);
                    C14040 c14045 = C8300.f21997;
                    c23623.m9352(abstractC7257M21408, new C14040("compiler", "override.incompatible.ret", c13370M38217, abstractC6462Mo14787, abstractC6462M19428));
                    c5771.f20409 |= 35184372088832L;
                    return;
                }
                AbstractC7257 abstractC7257M21409 = C9268.m21405(c5771, abstractC7257, false);
                AbstractC7783 abstractC7783M17991 = c5771.m17991();
                AbstractC7783 abstractC7783M17992 = c5772.m17991();
                C13370 c13370 = C13665.f38450;
                C13370 c13371 = new C13370("compiler", "cant.hide", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
                C14040 c14046 = C8300.f21997;
                c23623.m9352(abstractC7257M21409, new C14040("compiler", "override.incompatible.ret", c13371, abstractC6462Mo14787, abstractC6462M19428));
                c5771.f20409 |= 35184372088832L;
                return;
            }
            if (c3686.m7110(EnumC21706.UNCHECKED)) {
                AbstractC7257 abstractC7257M214010 = C9268.m21405(c5771, abstractC7257, false);
                C13370 c13370M38246 = m38246(c5771, c5772);
                C12895 c12896 = C15675.f45417;
                m38339(abstractC7257M214010, new C12895("compiler", "override.unchecked.ret", c13370M38246, abstractC6462Mo14787, abstractC6462M19428));
            }
            C4848 c4848M19421 = c8374.m19421(abstractC6462M19484.mo14794(), c4848Mo14803, c4848Mo14802);
            C4848 c4848M38358 = m38358(abstractC6462M19483.mo14794(), c8374.m19460(c4848M19421));
            C4848 c4848M38359 = m38358(abstractC6462M19483.mo14794(), c4848M19421);
            if (c4848M38358.m10293()) {
                AbstractC7257 abstractC7257M214011 = C9268.m21405(c5771, abstractC7257, false);
                C13370 c13370M38218 = m38213(c5771, c5772);
                AbstractC6462 abstractC6463 = (AbstractC6462) c4848M38359.f11034;
                C14040 c14047 = C8300.f21997;
                c23623.m9352(abstractC7257M214011, new C14040("compiler", "override.meth.doesnt.throw", c13370M38218, abstractC6463));
                c5771.f20409 |= 35184372088832L;
                return;
            }
            if (c4848M38359.m10293()) {
                AbstractC7257 abstractC7257M214012 = C9268.m21405(c5771, abstractC7257, false);
                C13370 c13370M38219 = m38213(c5771, c5772);
                AbstractC6462 abstractC6464 = (AbstractC6462) c4848M38359.f11034;
                C12895 c12897 = C15675.f45417;
                m38339(abstractC7257M214012, new C12895("compiler", "override.unchecked.thrown", c13370M38219, abstractC6464));
                return;
            }
            if (((c5771.f20409 ^ c5772.f20409) & 17179869184L) != 0 && this.f49880.m15935(EnumC21706.OVERRIDES)) {
                AbstractC7257 abstractC7257M214013 = C9268.m21405(c5771, abstractC7257, false);
                if ((17179869184L & c5771.f20409) != 0) {
                    C13370 c13370M38250 = m38250(c5771, c5772);
                    C12895 c12898 = C15675.f45417;
                    c12895 = new C12895("compiler", "override.varargs.missing", c13370M38250);
                } else {
                    C13370 c13370M38251 = m38250(c5771, c5772);
                    C12895 c12899 = C15675.f45417;
                    c12895 = new C12895("compiler", "override.varargs.extra", c13370M38251);
                }
                c23623.m9364(abstractC7257M214013, c12895);
            }
            if ((c5772.f20409 & 2147483648L) != 0) {
                AbstractC7257 abstractC7257M214014 = C9268.m21405(c5771, abstractC7257, false);
                C13370 c13370M38247 = m38246(c5771, c5772);
                C12895 c128910 = C15675.f45417;
                c23623.m9364(abstractC7257M214014, new C12895("compiler", "override.bridge", c13370M38247));
            }
            C15828 c15828M17990 = c5772.m17990();
            AbstractC6462 abstractC6462M19502 = c8374.m19502(c15828.f20406);
            if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
                C5771 c5771M12935 = c5772.m12935((C15828) abstractC6462M19502.f16705, c8374, false);
                if (c15828M17990 != null) {
                    c15828M17990.mo18020();
                    if ((c15828M17990.f20409 & 512) != 0) {
                        if (c8374.m19450(c15828.f20406).contains(c15828M17990.f20406) || c5771M12935 == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (c5771M12935 != c5772) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (c5771M12935 != c5772) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                return;
            }
            C6953 c6953M15933 = this.f49880.m15933(c5771);
            C6953 c6953 = this.f49880;
            this.f49880 = c6953M15933;
            try {
                m38277(new Supplier() { // from class: l.۬ۗ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C9268.m21405(c5771, abstractC7257, false);
                    }
                }, c5771, c5772);
            } finally {
                this.f49880 = c6953;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16852 m38215(C5127 c5127) {
        C16852 c16852 = (C16852) c5127.m10905(f49878);
        return c16852 == null ? new C16852(c5127) : c16852;
    }

    public C16852(C5127 c5127) {
        c5127.m10908(f49878, this);
        this.f49901 = C8200.m18988(c5127);
        C23623 c23623M52439 = C23623.m52439(c5127);
        this.f49881 = c23623M52439;
        this.f49884 = C23663.m52629(c5127);
        this.f49894 = C22004.m49577(c5127);
        this.f49902 = C15492.m35238(c5127);
        this.f49913 = C14152.m32631(c5127);
        this.f49906 = C8769.m20284(c5127);
        this.f49912 = C8374.m19396(c5127);
        this.f49896 = C18728.m42754(c5127);
        this.f49892 = C8005.m18541(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f49880 = C6953.m15930(c5127);
        this.f49885 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f49898 = enumC17840M40515;
        EnumC12720.m29246(c5127);
        this.f49890 = c13565M30871.m30879("warnOnAccessToMembers");
        this.f49888 = EnumC12720.m29246(c5127).m29249();
        this.f49908 = EnumC8045.m18667(c5127);
        this.f49911 = C24387.m53737(c5127);
        C6953 c6953 = this.f49880;
        EnumC21706 enumC21706 = EnumC21706.DEPRECATION;
        boolean zM15935 = c6953.m15935(enumC21706);
        C6953 c6954 = this.f49880;
        EnumC21706 enumC21707 = EnumC21706.REMOVAL;
        boolean zM15936 = c6954.m15935(enumC21707);
        C6953 c6955 = this.f49880;
        EnumC21706 enumC21708 = EnumC21706.UNCHECKED;
        boolean zM15937 = c6955.m15935(enumC21708);
        this.f49909 = new C6859(c23623M52439, null, zM15935, "deprecated", enumC21706);
        this.f49886 = new C6859(c23623M52439, null, zM15936, "removal", enumC21707);
        this.f49899 = new C6859(c23623M52439, null, zM15937, "unchecked", enumC21708);
        this.f49897 = new C6859(c23623M52439, null, false, "sunapi", null);
        this.f49889 = C19694.m44728(c5127);
        this.f49882 = EnumC12477.f34980.m28726(enumC17840M40515);
        this.f49895 = EnumC12477.f34978.m28726(enumC17840M40515);
        this.f49903 = EnumC12477.f34959.m28726(enumC17840M40515);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38294(final AbstractC6462 abstractC6462, final AbstractC7783 abstractC7783, final C4036 c4036, final C4848 c4848, final C4848 c4849, final boolean z, C2733 c2733) {
        char c;
        C4036 c4037;
        if (abstractC6462.m14792(c2733.f4594)) {
            c2733.m4255(C4848.m10276of((Object) abstractC6462), new InterfaceC5930() { // from class: l.ܽ۬֨
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2734) {
                    boolean z2 = z;
                    this.f54318.m38294(c2734.m4250(abstractC6462), abstractC7783, c4036, c4848, c4849, z2, c2734);
                }
            });
            return;
        }
        C4848 c4848Mo14797 = abstractC6462.mo14797();
        C4848 c4848Mo14798 = abstractC7783.f20406.mo14797();
        if (c4848Mo14798.m10289() != c4848Mo14797.m10289()) {
            c4848Mo14798 = c4848Mo14797;
        }
        AbstractC6462 abstractC6463 = z ? (AbstractC6462) c4848Mo14797.last() : null;
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        AbstractC12224 abstractC12225 = this.f49901.f21737;
        C22004 c22004 = this.f49894;
        if (abstractC12224 == abstractC12225 && abstractC7783.f20407 == c22004.f69209) {
            c4848Mo14797 = c4848Mo14797.f11035.f11035;
            c4848Mo14798 = c4848Mo14798.f11035.f11035;
        }
        if ((abstractC7783.mo18003() & 144115188075855872L) != 0) {
            c4848Mo14797 = c4848Mo14797.f11035;
            c4848Mo14798 = c4848Mo14798.f11035;
        }
        C8374 c8374 = this.f49912;
        if (c4848 != null) {
            C4848 c48410 = c4848;
            C4848 c48411 = c4848Mo14797;
            C4848 c48412 = c4848Mo14798;
            while (c48411.f11034 != abstractC6463) {
                AbstractC7257 abstractC7257 = (AbstractC7257) c48410.f11034;
                abstractC7257.getClass();
                m38219(abstractC7257.f18925, (AbstractC6462) c48411.f11034, new C20878(this, abstractC7257, "unchecked.assign", abstractC7257.f18925, (AbstractC6462) c48412.f11034));
                c48410 = c48410.f11035;
                c48411 = c48411.f11035;
                c48412 = c48412.f11035;
            }
            c = 0;
            if (z) {
                AbstractC6462 abstractC6462M19455 = c8374.m19455(abstractC6463);
                for (C4848 c48413 = c48410; c48413.f11035 != null; c48413 = c48413.f11035) {
                    AbstractC7257 abstractC7258 = (AbstractC7257) c48413.f11034;
                    abstractC7258.getClass();
                    m38219(abstractC7258.f18925, abstractC6462M19455, new C20878(this, abstractC7258, "unchecked.assign", abstractC7258.f18925, abstractC6462M19455));
                }
            } else if ((abstractC7783.mo18003() & 70385924046848L) == 17179869184L) {
                AbstractC6462 abstractC6464 = (AbstractC6462) abstractC6462.mo14797().last();
                AbstractC6462 abstractC6465 = (AbstractC6462) c4849.last();
                if (c8374.m19491(abstractC6465, c8374.m19455(abstractC6464), c8374.f22469) && !c8374.m19490(c8374.m19459(abstractC6464), c8374.m19459(abstractC6465))) {
                    AbstractC14355 abstractC14355 = (AbstractC14355) c4848.last();
                    abstractC14355.getClass();
                    AbstractC6462 abstractC6462M19456 = c8374.m19455(abstractC6464);
                    C12895 c12895 = C15675.f45417;
                    this.f49881.m9364(abstractC14355, new C12895("compiler", "inexact.non-varargs.call", abstractC6462M19456, abstractC6464));
                }
            }
        } else {
            c = 0;
        }
        if (z) {
            AbstractC6462 abstractC6466 = (AbstractC6462) abstractC6462.mo14797().last();
            if (c8374.m19417(abstractC6466) || (abstractC7783.mo9143().m17984(c22004.f69186.f16705) != null && m38247(abstractC7783))) {
                c4037 = c4036;
            } else {
                c4037 = c4036;
                AbstractC7257 abstractC7259 = c4037.f8850;
                abstractC7259.getClass();
                C12895 c12896 = C15675.f45417;
                Object[] objArr = new Object[1];
                objArr[c] = abstractC6466;
                m38339(abstractC7259, new C12895("compiler", "unchecked.generic.array.creation", objArr));
            }
            C9268.m21410(c8374.m19455(abstractC6466), c4037.f8850);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6953 m38273(C6953 c6953) {
        C6953 c6954 = this.f49880;
        this.f49880 = c6953;
        return c6954;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m38264(C5771 c5771) {
        C5771 c5772 = this.f49891;
        this.f49891 = c5771;
        return c5772;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38291(InterfaceC5323 interfaceC5323, C12895 c12895) {
        if (this.f49880.m15936(EnumC21706.PREVIEW)) {
            return;
        }
        this.f49911.m53741(interfaceC5323, c12895);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38339(InterfaceC5323 interfaceC5323, C12895 c12895) {
        if (this.f49880.m15936(EnumC21706.UNCHECKED)) {
            return;
        }
        this.f49899.m15720(interfaceC5323, c12895);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38352(InterfaceC5323 interfaceC5323, C12895 c12895) {
        C6953 c6953 = this.f49880;
        EnumC21706 enumC21706 = EnumC21706.VARARGS;
        if (c6953.m15935(enumC21706)) {
            this.f49881.m9365(enumC21706, interfaceC5323, c12895);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38307(C8320 c8320, C12895 c12895) {
        C6953 c6953 = this.f49880;
        EnumC21706 enumC21706 = EnumC21706.STATIC;
        if (c6953.m15935(enumC21706)) {
            this.f49881.m9365(enumC21706, c8320, c12895);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38224(C16852 c16852, InterfaceC5323 interfaceC5323) {
        C6953 c6953 = c16852.f49880;
        EnumC21706 enumC21706 = EnumC21706.DIVZERO;
        if (c6953.m15935(enumC21706)) {
            c16852.f49881.m9365(enumC21706, interfaceC5323, C15675.f45431);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38336() {
        this.f49909.m15719();
        this.f49886.m15719();
        this.f49899.m15719();
        this.f49897.m15719();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38271(InterfaceC5323 interfaceC5323, C21865 c21865) {
        EnumC21417 enumC21417 = EnumC21417.NON_DEFERRABLE;
        AbstractC7783 abstractC7783 = c21865.f68780;
        C18258 c18258M49312 = c21865.m49312();
        C14040 c14040 = C8300.f21997;
        this.f49881.m9359(enumC21417, interfaceC5323, new C14040("compiler", "cant.access", abstractC7783, c18258M49312));
        return this.f49894.f69139;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38270(InterfaceC5323 interfaceC5323, C18258 c18258, Object obj) {
        boolean z = obj instanceof AbstractC6462;
        C22004 c22004 = this.f49894;
        C23623 c23623 = this.f49881;
        if (z && ((AbstractC6462) obj).m14777(EnumC11353.VOID)) {
            c23623.m9352(interfaceC5323, C8300.f22070);
            return c22004.f69139;
        }
        C14040 c14040 = C8300.f21997;
        c23623.m9352(interfaceC5323, new C14040("compiler", "type.found.req", obj, c18258));
        return this.f49912.m19475(z ? (AbstractC6462) obj : c22004.f69139);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38338(InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783) {
        C14040 c14040 = C8300.f21997;
        this.f49881.m9352(interfaceC5323, new C14040("compiler", "cant.ref.before.ctor.called", abstractC7783));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38287(InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783) {
        if (abstractC7783.f20406.mo14812()) {
            return;
        }
        AbstractC7783 abstractC7783M17991 = abstractC7783.m17991();
        EnumC3600 enumC3600 = abstractC7783M17991.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7343;
        C23623 c23623 = this.f49881;
        if (enumC3600 == enumC3601 && ((C5771) abstractC7783M17991).m12942()) {
            EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783);
            EnumC10306 enumC10306M51426 = C23047.m51425(abstractC7783.m17991());
            EnumC10306 enumC10306M51427 = C23047.m51425(abstractC7783.m17991().m17990());
            C15828 c15828M17990 = abstractC7783.m17991().m17990();
            C14040 c14040 = C8300.f21997;
            c23623.m9352(interfaceC5323, new C14040("compiler", "already.defined.in.clinit", enumC10306M51425, abstractC7783, enumC10306M51426, enumC10306M51427, c15828M17990));
            return;
        }
        if (abstractC7783M17991.f20405 == enumC3601) {
            long j = abstractC7783.f20407.f20409;
            if ((68719476736L & j) != 0 && (j & 2305843009213693952L) != 0) {
                return;
            }
        }
        EnumC10306 enumC10306M51428 = C23047.m51425(abstractC7783);
        EnumC10306 enumC10306M51429 = C23047.m51425(abstractC7783.m17991());
        AbstractC7783 abstractC7783M17992 = abstractC7783.m17991();
        C14040 c14041 = C8300.f21997;
        c23623.m9352(interfaceC5323, new C14040("compiler", "already.defined", enumC10306M51428, abstractC7783, enumC10306M51429, abstractC7783M17992));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38277(final Supplier supplier, AbstractC7783 abstractC7783, final AbstractC7783 abstractC7784) {
        if ((abstractC7784.f20409 & 36028797018963968L) == 0 && (!abstractC7784.mo3351() || abstractC7783.mo3351())) {
            return;
        }
        if ((abstractC7784.mo3350() != abstractC7783.mo3350() || abstractC7784.mo3350() == null) && abstractC7784.f20405 != EnumC3600.f7351) {
            this.f49889.m44732(new InterfaceC18352() { // from class: l.ۙۗ֨
                @Override // p067l.InterfaceC18352
                /* JADX INFO: renamed from: ֫ */
                public final void mo8280() {
                    C16852.m38223(this.f16866, supplier, abstractC7784);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38292(InterfaceC5323 interfaceC5323, C13818 c13818, AbstractC15689 abstractC15689) {
        AbstractC7783 abstractC7783;
        AbstractC7783 abstractC7784;
        Iterator it = abstractC15689.m22456(c13818.f20408).iterator();
        while (it.hasNext() && (abstractC7784 = (abstractC7783 = (AbstractC7783) it.next()).f20407) == c13818.f20407) {
            if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7784.f20405.m6623(C17010.f50315) && c13818.f20408 != this.f49901.f21713) {
                m38287(interfaceC5323, abstractC7783);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38304(C7650 c7650, C15828 c15828, AbstractC15689 abstractC15689) {
        for (AbstractC7783 abstractC7783 : abstractC15689.m22456(c15828.f20408)) {
            if (abstractC7783.f20407 != c15828.f20407) {
                return;
            }
            if (abstractC7783.f20405 == EnumC3600.f7354 && !abstractC7783.f20406.m14777(EnumC11353.TYPEVAR) && abstractC7783.f20407.f20405.m6623(C17010.f50315) && c15828.f20408 != this.f49901.f21713) {
                m38287(c7650, abstractC7783);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38326(C7650 c7650, AbstractC12224 abstractC12224, AbstractC15689 abstractC15689) {
        AbstractC12224 abstractC12225;
        Iterator it = abstractC15689.mo22457(abstractC12224, null, EnumC3620.NON_RECURSIVE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C8200 c8200 = this.f49901;
            if (zHasNext) {
                AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                if (abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.f20408 != c8200.f21713) {
                    m38287(c7650, abstractC7783);
                    return false;
                }
            } else {
                for (AbstractC7783 abstractC7784 = abstractC15689.f26587; abstractC7784 != null; abstractC7784 = abstractC7784.f20407) {
                    if (abstractC7784.f20405 == EnumC3600.f7354 && (abstractC12225 = abstractC7784.f20408) == abstractC12224 && abstractC12225 != c8200.f21713) {
                        m38287(c7650, abstractC7784);
                        return true;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12224 m38349(C15828 c15828) {
        AbstractC12224 abstractC12224 = c15828.f20407.m17990().f45859;
        String string = abstractC12224.toString();
        C24293 c24293 = new C24293(abstractC12224, c15828.f20408);
        HashMap map = this.f49887;
        Integer num = (Integer) map.get(c24293);
        int iIntValue = num == null ? 1 : num.intValue();
        while (true) {
            StringBuilder sbM17248 = C7470.m17248(string);
            sbM17248.append(this.f49888);
            sbM17248.append(iIntValue);
            sbM17248.append((Object) c15828.f20408);
            AbstractC12224 abstractC12224M32717 = this.f49901.f21738.m32717(sbM17248.toString());
            if (m38274(c15828.m18008().f27063, abstractC12224M32717) == null) {
                map.put(c24293, Integer.valueOf(iIntValue + 1));
                return abstractC12224M32717;
            }
            iIntValue++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38317(C15828 c15828) {
        AbstractC7783 abstractC7783 = c15828.f20407;
        if (abstractC7783 == null || abstractC7783.f20405 == EnumC3600.f7349) {
            return;
        }
        this.f49887.remove(new C24293(abstractC7783.m17990().f45859, c15828.f20408));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38276() {
        this.f49904.clear();
        this.f49887.clear();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38360(C15828 c15828) {
        this.f49904.put(new C24293(c15828.m18008().f27063, c15828.f45859), c15828);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15828 m38335(C15828 c15828) {
        return (C15828) this.f49904.get(new C24293(c15828.m18008().f27063, c15828.f45859));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m38357(C15828 c15828) {
        this.f49904.remove(new C24293(c15828.m18008().f27063, c15828.f45859));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38267(final InterfaceC5323 interfaceC5323, final AbstractC6462 abstractC6462, final AbstractC6462 abstractC6463, final InterfaceC6125 interfaceC6125) {
        C2733 c2733Mo6098 = interfaceC6125.mo6098();
        if (abstractC6463.m14792(c2733Mo6098.f4594) || abstractC6462.m14792(c2733Mo6098.f4594)) {
            c2733Mo6098.m4255(C4848.m10277of((Object) abstractC6463, (Object) abstractC6462), new InterfaceC5930() { // from class: l.ܳ۬֨
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2733) {
                    this.f47634.m38267(interfaceC5323, c2733.m4250(abstractC6462), c2733.m4250(abstractC6463), interfaceC6125);
                }
            });
        }
        if (abstractC6463.m14777(EnumC11353.ERROR)) {
            return abstractC6463;
        }
        if (abstractC6463.m14777(EnumC11353.NONE) || interfaceC6125.mo6100(abstractC6462, abstractC6463, interfaceC6125.mo6099(interfaceC5323, abstractC6462, abstractC6463))) {
            return abstractC6462;
        }
        boolean zMo14778 = abstractC6462.mo14778();
        C8374 c8374 = this.f49912;
        C8005 c8005 = this.f49892;
        if (zMo14778 && abstractC6463.mo14778()) {
            C13370 c13370 = C13665.f38450;
            interfaceC6125.mo3480(interfaceC5323, c8005.m18543(new C13370("compiler", "possible.loss.of.precision", abstractC6462, abstractC6463)));
            return c8374.m19475(abstractC6462);
        }
        interfaceC6125.mo3480(interfaceC5323, c8005.m18543(C13665.m31063(abstractC6462, abstractC6463)));
        return c8374.m19475(abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38321(final C19327 c19327) {
        AbstractC7783 abstractC7783M21438;
        if (c19327.f18925.mo14812()) {
            return;
        }
        if (!this.f49912.m19490(c19327.f57710.f18925, c19327.f57709.f18925) || C9268.m21426(c19327.f57709)) {
            return;
        }
        AbstractC14355 abstractC14355M21424 = C9268.m21424(c19327.f57710);
        if (!abstractC14355M21424.m16617(EnumC19998.f60758) || (abstractC7783M21438 = C9268.m21438(((C17175) abstractC14355M21424).f51143)) == null || abstractC7783M21438.f20405 != EnumC3600.f7343 || (abstractC7783M21438.mo18003() & 137438953472L) == 0) {
            this.f49889.m44732(new InterfaceC18352() { // from class: l.ܶۗ֨
                @Override // p067l.InterfaceC18352
                /* JADX INFO: renamed from: ֫ */
                public final void mo8280() {
                    C16852.m38234(this.f48711, c19327);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38234(C16852 c16852, C19327 c19327) {
        C6953 c6953 = c16852.f49880;
        EnumC21706 enumC21706 = EnumC21706.CAST;
        if (c6953.m15935(enumC21706)) {
            C23623 c23623 = c16852.f49881;
            AbstractC6462 abstractC6462 = c19327.f57709.f18925;
            C12895 c12895 = C15675.f45417;
            c23623.m9365(enumC21706, c19327, new C12895("compiler", "redundant.cast", abstractC6462));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC6462 m38363(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        if (!abstractC6462.m14777(EnumC11353.VOID)) {
            return abstractC6462;
        }
        this.f49881.m9352(interfaceC5323, C8300.f22018);
        return this.f49912.m19475(abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38265(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        Object objM18543;
        if (abstractC6462.m14777(EnumC11353.CLASS) || abstractC6462.m14777(EnumC11353.ARRAY) || abstractC6462.m14777(EnumC11353.ERROR)) {
            return abstractC6462;
        }
        C13370 c13370 = C13665.f38506;
        C8005 c8005 = this.f49892;
        C18258 c18258M18543 = c8005.m18543(c13370);
        if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            objM18543 = abstractC6462;
            objM18543 = c8005.m18543(new C13370("compiler", "type.parameter", abstractC6462));
        }
        objM18543 = abstractC6462;
        return m38270(interfaceC5323, c18258M18543, objM18543);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m38334(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        Object objM18543;
        if (abstractC6462.m14777(EnumC11353.CLASS) || abstractC6462.m14777(EnumC11353.ERROR)) {
            return abstractC6462;
        }
        C13370 c13370 = C13665.f38500;
        C8005 c8005 = this.f49892;
        C18258 c18258M18543 = c8005.m18543(c13370);
        if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            objM18543 = abstractC6462;
            objM18543 = c8005.m18543(new C13370("compiler", "type.parameter", abstractC6462));
        }
        objM18543 = abstractC6462;
        return m38270(interfaceC5323, c18258M18543, objM18543);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 m38359(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462M38265 = m38265(interfaceC5323, abstractC6462);
        boolean zM14777 = abstractC6462M38265.m14777(EnumC11353.CLASS);
        C23623 c23623 = this.f49881;
        C8374 c8374 = this.f49912;
        if (!zM14777) {
            if (!abstractC6462M38265.m14777(EnumC11353.ARRAY) || c8374.m19417(((C7251) abstractC6462M38265).f18916)) {
                return abstractC6462M38265;
            }
            c23623.m9352(interfaceC5323, C8300.f22158);
            return c8374.m19475(abstractC6462M38265);
        }
        if ((abstractC6462M38265.f16705.mo18003() & 1536) != 0) {
            AbstractC21195 abstractC21195 = abstractC6462M38265.f16705;
            C14040 c14040 = C8300.f21997;
            c23623.m9352(interfaceC5323, new C14040("compiler", "abstract.cant.be.instantiated", abstractC21195));
            return c8374.m19475(abstractC6462M38265);
        }
        if ((abstractC6462M38265.f16705.mo18003() & 16384) != 0) {
            c23623.m9352(interfaceC5323, C8300.f22095);
            return c8374.m19475(abstractC6462M38265);
        }
        return m38269(interfaceC5323, abstractC6462M38265, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38269(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, boolean z) {
        AbstractC6462 abstractC6462M38334 = m38334(interfaceC5323, abstractC6462);
        if (z && abstractC6462M38334.mo14781()) {
            for (C4848 c4848Mo14802 = abstractC6462M38334.mo14802(); c4848Mo14802.m10293(); c4848Mo14802 = c4848Mo14802.f11035) {
                if (((AbstractC6462) c4848Mo14802.f11034).m14777(EnumC11353.WILDCARD)) {
                    return m38270(interfaceC5323, this.f49892.m18543(C13665.f38503), c4848Mo14802.f11034);
                }
            }
        }
        return abstractC6462M38334;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC6462 m38362(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        return abstractC6462.mo14772() ? abstractC6462 : m38270(interfaceC5323, this.f49892.m18543(C13665.f38493), abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38284(C4848 c4848, C4848 c4849) {
        while (c4849.m10293()) {
            AbstractC14355 abstractC14355 = (AbstractC14355) c4848.f11034;
            abstractC14355.getClass();
            c4849.f11034 = m38362(abstractC14355, (AbstractC6462) c4849.f11034);
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC6462 m38330(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        return (abstractC6462.mo14772() || abstractC6462.m14777(EnumC11353.BOT)) ? abstractC6462 : m38270(interfaceC5323, this.f49892.m18543(C13665.f38493), abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38325(AbstractC7257 abstractC7257, long j, long j2, long j3) {
        long j4 = j2 & j;
        if (j4 != 0) {
            long j5 = j & j3;
            if (j5 != 0) {
                long j6 = 1;
                long j7 = 1;
                while ((j7 & j4) == 0) {
                    j7 <<= 1;
                }
                EnumSet enumSetM47446 = C21036.m47446(j7);
                while ((j6 & j5) == 0) {
                    j6 <<= 1;
                }
                EnumSet enumSetM47447 = C21036.m47446(j6);
                C14040 c14040 = C8300.f21997;
                this.f49881.m9352(abstractC7257, new C14040("compiler", "illegal.combination.of.modifiers", enumSetM47446, enumSetM47447));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38272(C20530 c20530, AbstractC6462 abstractC6462) {
        if (!C9268.m21415(c20530) || abstractC6462.mo14812()) {
            AbstractC14355 abstractC14355 = c20530.f63429;
            abstractC14355.getClass();
            return m38269((InterfaceC5323) abstractC14355, abstractC6462, true);
        }
        C7650 c7650 = c20530.f63428;
        C23623 c23623 = this.f49881;
        if (c7650 != null) {
            EnumC12477 enumC12477 = EnumC12477.f34983;
            EnumC17840 enumC17840 = this.f49898;
            if (!enumC12477.m28726(enumC17840)) {
                EnumC21417 enumC21417 = EnumC21417.SOURCE_LEVEL;
                AbstractC14355 abstractC14356 = c20530.f63429;
                abstractC14356.getClass();
                C13370 c13370M28728 = enumC12477.m28728(enumC17840.f53238);
                C14040 c14040 = C8300.f21997;
                c23623.m9359(enumC21417, abstractC14356, new C14040("compiler", "cant.apply.diamond.1", abstractC6462, c13370M28728));
            }
        }
        boolean zIsEmpty = abstractC6462.f16705.f20406.mo14802().isEmpty();
        C8374 c8374 = this.f49912;
        if (zIsEmpty) {
            AbstractC14355 abstractC14357 = c20530.f63429;
            abstractC14357.getClass();
            C13370 c13370 = C13665.f38450;
            C13370 c13371 = new C13370("compiler", "diamond.non.generic", abstractC6462);
            C14040 c14041 = C8300.f21997;
            c23623.m9352(abstractC14357, new C14040("compiler", "cant.apply.diamond.1", abstractC6462, c13371));
            return c8374.m19475(abstractC6462);
        }
        C4848 c4848 = c20530.f63431;
        if (c4848 == null || !c4848.m10293()) {
            return abstractC6462;
        }
        AbstractC14355 abstractC14358 = c20530.f63429;
        abstractC14358.getClass();
        C13370 c13372 = C13665.f38450;
        C13370 c13373 = new C13370("compiler", "diamond.and.explicit.params", abstractC6462);
        C14040 c14042 = C8300.f21997;
        c23623.m9352(abstractC14358, new C14040("compiler", "cant.apply.diamond.1", abstractC6462, c13373));
        return c8374.m19475(abstractC6462);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m38253(AbstractC6462 abstractC6462) {
        AbstractC6363 abstractC6363 = f49879;
        abstractC6363.getClass();
        return ((Boolean) abstractC6462.mo5291(abstractC6363, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38308(C10471 c10471) {
        C18258 c18258M18543;
        C5771 c5771 = c10471.f28960;
        C22004 c22004 = this.f49894;
        AbstractC6462 abstractC6462 = c22004.f69186;
        AbstractC6462 abstractC6463 = c22004.f69186;
        boolean z = c5771.m17984((AbstractC7783) abstractC6462.f16705) != null;
        boolean zMo12933 = c5771.mo12933();
        C8374 c8374 = this.f49912;
        AbstractC6462 abstractC6462M19455 = zMo12933 ? c8374.m19455(((C11281) c10471.f28963.last()).f18925) : null;
        C8005 c8005 = this.f49892;
        if (z && !m38247(c5771)) {
            C23623 c23623 = this.f49881;
            if (abstractC6462M19455 != null) {
                if (EnumC12477.f34977.m28726(this.f49898)) {
                    c18258M18543 = c8005.m18543(new C13370("compiler", "varargs.trustme.on.virtual.varargs", c5771));
                } else {
                    c18258M18543 = c8005.m18543(new C13370("compiler", "varargs.trustme.on.virtual.varargs.final.only", c5771));
                }
                AbstractC21195 abstractC21195 = abstractC6463.f16705;
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c10471, new C14040("compiler", "varargs.invalid.trustme.anno", abstractC21195, c18258M18543));
                return;
            }
            AbstractC21195 abstractC21196 = abstractC6463.f16705;
            C13370 c13370 = C13665.f38450;
            C13370 c13371 = new C13370("compiler", "varargs.trustme.on.non.varargs.meth", c5771);
            C14040 c14041 = C8300.f21997;
            c23623.m9352(c10471, new C14040("compiler", "varargs.invalid.trustme.anno", abstractC21196, c13371));
            return;
        }
        if (z && abstractC6462M19455 != null && c8374.m19417(abstractC6462M19455)) {
            AbstractC21195 abstractC21197 = abstractC6463.f16705;
            C13370 c13372 = C13665.f38450;
            C18258 c18258M18544 = c8005.m18543(new C13370("compiler", "varargs.trustme.on.reifiable.varargs", abstractC6462M19455));
            C12895 c12895 = C15675.f45417;
            m38352(c10471, new C12895("compiler", "varargs.redundant.trustme.anno", abstractC21197, c18258M18544));
            return;
        }
        if (z || abstractC6462M19455 == null || c8374.m19417(abstractC6462M19455)) {
            return;
        }
        InterfaceC5323 interfaceC5323 = (C11281) c10471.f28963.f11034;
        interfaceC5323.getClass();
        C12895 c12896 = C15675.f45417;
        m38339(interfaceC5323, new C12895("compiler", "unchecked.varargs.non.reifiable.type", abstractC6462M19455));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m38247(AbstractC7783 abstractC7783) {
        if ((abstractC7783.mo18003() & 17179869184L) != 0) {
            if (abstractC7783.m17994()) {
                return true;
            }
            if ((abstractC7783.mo18003() & ((long) ((EnumC12477.f34977.m28726(this.f49898) ? 2 : 0) | 24))) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38268(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224) {
        boolean zM14777 = abstractC6462.m14777(EnumC11353.BOT);
        C23623 c23623 = this.f49881;
        C8374 c8374 = this.f49912;
        if (zM14777) {
            c23623.m9352(interfaceC5323, C8300.m19123(abstractC12224, C13665.f38447));
            return c8374.m19475(abstractC6462);
        }
        if (abstractC6462.m14777(EnumC11353.VOID)) {
            c23623.m9352(interfaceC5323, C8300.m19123(abstractC12224, C13665.f38462));
            return c8374.m19475(abstractC6462);
        }
        return c8374.m19481(abstractC6462, c8374.m19480(abstractC6462)).mo5302();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38219(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        C8374 c8374 = this.f49912;
        if (!c8374.m19496(abstractC6462, abstractC6463, c3686) && abstractC6463.mo7388() && c8374.m19486(abstractC6462, c8374.m19502(abstractC6463), true)) {
            for (C4848 c4848M19450 = c8374.m19450(abstractC6463); c4848M19450.m10293() && c8374.m19491(abstractC6462, (AbstractC6462) c4848M19450.f11034, c3686); c4848M19450 = c4848M19450.f11035) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38324(AbstractC6462 abstractC6462) {
        return m38257(abstractC6462) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public AbstractC6462 m38257(AbstractC6462 abstractC6462) {
        C8374 c8374;
        C4848 c4848Mo14798 = abstractC6462.f16705.f20406.mo14798();
        C4848 c4848Mo14799 = abstractC6462.mo14798();
        C4848 c4848Mo14802 = abstractC6462.mo14802();
        C4848 c4848Mo14803 = abstractC6462.f16705.f20406.mo14802();
        C20271 c20271 = new C20271();
        while (true) {
            boolean zM10293 = c4848Mo14802.m10293();
            c8374 = this.f49912;
            if (!zM10293 || !c4848Mo14803.m10293()) {
                break;
            }
            c20271.m45777(c8374.m19428(((AbstractC6462) c4848Mo14803.f11034).mo14803(), c4848Mo14798, c4848Mo14799));
            c4848Mo14802 = c4848Mo14802.f11035;
            c4848Mo14803 = c4848Mo14803.f11035;
        }
        C4848 c4848Mo14804 = abstractC6462.mo14802();
        for (C4848 c4848M19461 = c8374.m19461(c4848Mo14798, c4848Mo14798, c8374.m19463(abstractC6462).mo14798()); c4848Mo14804.m10293() && c4848M19461.m10293(); c4848M19461 = c4848M19461.f11035) {
            ((AbstractC6462) c4848Mo14804.f11034).mo14801((C10485) c4848M19461.f11034);
            c4848Mo14804 = c4848Mo14804.f11035;
        }
        C4848 c4848Mo14805 = abstractC6462.mo14802();
        C4848 c4848M45783 = c20271.m45783();
        while (true) {
            boolean zM10294 = c4848Mo14805.m10293();
            AbstractC14409 abstractC14409 = this.f49907;
            if (zM10294 && c4848M45783.m10293()) {
                AbstractC6462 abstractC6463 = (AbstractC6462) c4848Mo14805.f11034;
                if (!((Boolean) abstractC14409.m33024(abstractC6463)).booleanValue() && !((AbstractC6462) c4848M45783.f11034).mo14812()) {
                    AbstractC6462 abstractC6464 = (AbstractC6462) c4848M45783.f11034;
                    boolean zM19506 = true;
                    if (!abstractC6463.mo14808()) {
                        if (abstractC6463.m14777(EnumC11353.WILDCARD)) {
                            if (abstractC6463.mo14786()) {
                                zM19506 = c8374.m19485(abstractC6464, c8374.m19451(abstractC6463), c8374.f22469);
                            } else if (abstractC6463.mo14788()) {
                                zM19506 = true ^ c8374.m19506(c8374.m19453(abstractC6463), abstractC6464);
                            }
                        } else {
                            zM19506 = c8374.m19486(C8374.m19413(abstractC6463), abstractC6464, true);
                        }
                    }
                    if (!zM19506) {
                        return (AbstractC6462) c4848Mo14805.f11034;
                    }
                }
                c4848Mo14805 = c4848Mo14805.f11035;
                c4848M45783 = c4848M45783.f11035;
            } else {
                C4848 c4848Mo14806 = abstractC6462.mo14802();
                C4848 c4848M45784 = c20271.m45783();
                for (AbstractC6462 abstractC6465 : c8374.m19463(abstractC6462).mo14802()) {
                    if (abstractC6465.m14777(EnumC11353.TYPEVAR) && abstractC6465.mo14803().mo14812() && !((AbstractC6462) c4848M45784.f11034).mo14812() && !((Boolean) abstractC14409.m33024((AbstractC6462) c4848Mo14806.f11034)).booleanValue()) {
                        return (AbstractC6462) c4848Mo14806.f11034;
                    }
                    c4848M45784 = c4848M45784.f11035;
                    c4848Mo14806 = c4848Mo14806.f11035;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38289(final InterfaceC5323 interfaceC5323, final C9794 c9794) {
        c9794.mo18020();
        if (c9794.f27061.m22460()) {
            c9794.mo18020();
            if ((c9794.f20409 & 4503599627370496L) == 0) {
                this.f49889.m44732(new InterfaceC18352() { // from class: l.᩺ۗ֨
                    @Override // p067l.InterfaceC18352
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo8280() {
                        C16852.m38226(this.f76121, interfaceC5323, c9794);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x012b A[EDGE_INSN: B:78:0x012b->B:80:0x012e BREAK  A[LOOP:0: B:71:0x0111->B:194:?]] */
    /* JADX INFO: renamed from: ֫ */
    public final long m38261(final AbstractC7257 abstractC7257, long j, AbstractC7783 abstractC7783, AbstractC7257 abstractC7258) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        int i = C4784.f10852[abstractC7783.f20405.ordinal()];
        C23623 c23623 = this.f49881;
        if (i != 1) {
            C19694 c19694 = this.f49889;
            if (i == 2) {
                j2 = 512;
                j6 = 2;
                if (abstractC7783.f20408 != this.f49901.f21737) {
                    long j12 = abstractC7783.f20407.f20409;
                    if ((j12 & 512) == 0) {
                        j7 = (j12 & 2305843009213693952L) != 0 ? 3135L : 3391L;
                        j8 = j7;
                        j6 = 0;
                    } else if ((j12 & 8192) == 0 && (j & 8796093022218L) != 0) {
                        j6 = (j & 2) != 0 ? 0L : 1L;
                        if ((j & 8796093022208L) != 0) {
                            j6 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                        }
                        j8 = 8796093025291L;
                    } else {
                        j6 = 1025;
                        j8 = j6;
                    }
                } else if ((abstractC7783.f20407.f20409 & 16384) != 0) {
                    j8 = j6;
                } else {
                    j7 = 7;
                    j8 = j7;
                    j6 = 0;
                }
                if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != 0) {
                    InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) abstractC7257);
                    try {
                        c19694.m44732(new InterfaceC18352() { // from class: l.ۛۗ֨
                            @Override // p067l.InterfaceC18352
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8280() {
                                C16852.m38228(this.f20648, abstractC7257);
                            }
                        });
                        c19694.m44730(interfaceC5323M44730);
                    } catch (Throwable th) {
                        c19694.m44730(interfaceC5323M44730);
                        throw th;
                    }
                }
                if (((j | j6) & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (j & 8796093022208L) != 0) {
                    j9 = abstractC7783.f20407.f20409;
                } else {
                    j10 = j6;
                }
                j5 = j8;
                j4 = j10;
            } else if (i == 3) {
                boolean zM6623 = abstractC7783.f20407.f20405.m6623(C17010.f50315);
                boolean z = this.f49895;
                j6 = 8;
                if (zM6623 || (abstractC7783.m17996() && (j & 8192) != 0)) {
                    j2 = 512;
                    boolean z2 = (abstractC7783.f20408.isEmpty() || ((j & 2305843009213693952L) == 0 && (j & 16384) == 0 && (j & 512) == 0)) ? false : true;
                    j8 = (((j & 8) != 0 || z2) && z && (j & 8192) == 0) ? 24088L : 23568L;
                    if (!z2) {
                        j6 = 0;
                    }
                } else {
                    AbstractC7783 abstractC7784 = abstractC7783.f20407;
                    if (abstractC7784.f20405 == EnumC3600.f7354) {
                        j8 = ((j & 8) != 0 && z && (j & 8192) == 0) ? -4611686018427363809L : -4611686018427363817L;
                        j2 = 512;
                        if (abstractC7784.f20407.f20405 == EnumC3600.f7351 || (abstractC7784.f20409 & 8) != 0) {
                            j8 |= 8;
                        } else if (!z && ((j & 16384) != 0 || (j & 2305843009213693952L) != 0)) {
                            c23623.m9352(abstractC7257, C8300.f22140);
                        }
                        if ((j & 2305843009213710848L) == 0) {
                        }
                    } else {
                        j2 = 512;
                        j8 = -4611686018427355631L;
                    }
                    j6 = 0;
                }
                if ((j & j2) != 0) {
                    j6 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                }
                if ((j & 16384) != 0) {
                    j8 &= 4611686018427386863L;
                    if (!abstractC7258.m16617(EnumC19998.f60806)) {
                        j11 = 0;
                        break;
                    }
                    C22219 c22219 = new C22219();
                    c22219.f70270 = false;
                    Iterator it = ((C7650) abstractC7258).f20020.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j11 = 16;
                            break;
                        }
                        ((AbstractC7257) it.next()).mo3382(c22219);
                        if (c22219.f70270) {
                            if (!this.f49903) {
                                j11 = 0;
                                break;
                            }
                            j11 = SkeinEngine.UbiTweak.T1_FIRST;
                            break;
                        }
                    }
                    j6 |= j11;
                }
                if ((j & 2305843009213693952L) != 0) {
                    j8 &= -1025;
                    j6 |= 16;
                }
                if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != 0) {
                    InterfaceC5323 interfaceC5323M44731 = c19694.m44730((InterfaceC5323) abstractC7257);
                    try {
                        c19694.m44732(new InterfaceC18352() { // from class: l.ۛۗ֨
                            @Override // p067l.InterfaceC18352
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8280() {
                                C16852.m38228(this.f20648, abstractC7257);
                            }
                        });
                        c19694.m44730(interfaceC5323M44731);
                    } catch (Throwable th2) {
                        c19694.m44730(interfaceC5323M44731);
                        throw th2;
                    }
                }
                j9 = abstractC7783.f20407.f20409;
            } else {
                throw new AssertionError();
            }
            j10 = j6 | (j9 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
            j5 = j8;
            j4 = j10;
        } else {
            j2 = 512;
            if (!abstractC7258.m16617(EnumC19998.f60802) || ((C11281) abstractC7258).f31432 == null) {
                AbstractC7783 abstractC7785 = abstractC7783.f20407;
                if (abstractC7785.f20405 != EnumC3600.f7354) {
                    j3 = 8589934608L;
                } else if ((abstractC7785.f20409 & 512) != 0) {
                    j4 = 25;
                    j5 = 25;
                } else {
                    j3 = 16607;
                }
            } else {
                j3 = 8589934592L;
            }
            j5 = j3;
            j4 = 0;
        }
        long j13 = j & (-4611677222334361601L) & (~j5);
        if (j13 == 0) {
            EnumC3600 enumC3600 = abstractC7783.f20405;
            EnumC3600 enumC3601 = EnumC3600.f7354;
            if ((enumC3600 == enumC3601 || m38325(abstractC7257, j, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 8796093022218L)) && m38325(abstractC7257, j, 10L, 8796093022208L) && m38325(abstractC7257, j, 1536L, 304L) && m38325(abstractC7257, j, 1L, 6L) && m38325(abstractC7257, j, 2L, 5L) && m38325(abstractC7257, j, 16L, 64L) && ((abstractC7783.f20405 == enumC3601 || m38325(abstractC7257, j, 1280L, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) && m38325(abstractC7257, j, 16L, -4611686018427387904L) && m38325(abstractC7257, j, SkeinEngine.UbiTweak.T1_FIRST, -9223372036854775792L))) {
                m38325(abstractC7257, j, SkeinEngine.UbiTweak.T1_FIRST, 8192L);
            }
        } else if ((j13 & j2) != 0) {
            c23623.m9352(abstractC7257, (j & 8192) != 0 ? C8300.f22111 : C8300.f22131);
            j5 |= j2;
        } else {
            EnumSet enumSetM47446 = C21036.m47446(j13);
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC7257, new C14040("compiler", "mod.not.allowed.here", enumSetM47446));
        }
        return (j & (4611677222334361600L | j5)) | j4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38228(C16852 c16852, AbstractC7257 abstractC7257) {
        C6953 c6953 = c16852.f49880;
        EnumC21706 enumC21706 = EnumC21706.STRICTFP;
        if (c6953.m15935(enumC21706)) {
            c16852.f49881.m9365(enumC21706, abstractC7257, C15675.f45427);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38298(AbstractC7257 abstractC7257, C4036 c4036, boolean z) {
        new C10148(this, c4036).m23657(abstractC7257, z, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38283(C4848 c4848, C4036 c4036) {
        while (c4848.m10293()) {
            m38298((AbstractC7257) c4848.f11034, c4036, true);
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38296(AbstractC7257 abstractC7257, C4036 c4036) {
        C10471 c10471;
        C6953 c6953 = this.f49880;
        EnumC21706 enumC21706 = EnumC21706.RAW;
        if (c6953.m15935(enumC21706) && abstractC7257.f18925.m14777(EnumC11353.CLASS) && !C9268.m21415(abstractC7257)) {
            if (!(c4036.f8855.f20021.isEmpty() && (c10471 = c4036.f8853) != null && c10471.f28959 == this.f49901.f21737) && abstractC7257.f18925.mo14784()) {
                AbstractC6462 abstractC6462 = abstractC7257.f18925;
                AbstractC6462 abstractC6463 = abstractC6462.f16705.f20406;
                C12895 c12895 = C15675.f45417;
                this.f49881.m9365(enumC21706, abstractC7257, new C12895("compiler", "raw.class.use", abstractC6462, abstractC6463));
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m38361(AbstractC6462 abstractC6462, C4848 c4848) {
        while (c4848.m10293()) {
            if (this.f49912.m19486(abstractC6462, (AbstractC6462) c4848.f11034, true)) {
                return true;
            }
            c4848 = c4848.f11035;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m38354(AbstractC6462 abstractC6462, C4848 c4848) {
        while (c4848.m10293()) {
            AbstractC6462 abstractC6463 = (AbstractC6462) c4848.f11034;
            C8374 c8374 = this.f49912;
            if (c8374.m19486(abstractC6462, abstractC6463, true) || c8374.m19486((AbstractC6462) c4848.f11034, abstractC6462, true)) {
                return true;
            }
            c4848 = c4848.f11035;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m38333(AbstractC6462 abstractC6462, C4848 c4848) {
        return m38361(abstractC6462, c4848) ? c4848 : m38263(abstractC6462, c4848).m10290(abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m38263(AbstractC6462 abstractC6462, C4848 c4848) {
        if (!c4848.isEmpty()) {
            C4848 c4848M38263 = m38263(abstractC6462, c4848.f11035);
            if (this.f49912.m19486((AbstractC6462) c4848.f11034, abstractC6462, true)) {
                return c4848M38263;
            }
            if (c4848M38263 != c4848.f11035) {
                return c4848M38263.m10290((AbstractC6462) c4848.f11034);
            }
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m38355(C4848 c4848, C4848 c4849) {
        while (c4849.m10293()) {
            c4848 = m38333((AbstractC6462) c4849.f11034, c4848);
            c4849 = c4849.f11035;
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m38332(C4848 c4848, C4848 c4849) {
        while (c4849.m10293()) {
            c4848 = m38263((AbstractC6462) c4849.f11034, c4848);
            c4849 = c4849.f11035;
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m38348(C4848 c4848, C4848 c4849) {
        C4848 c4848M10283 = C4848.m10283();
        for (C4848 c48410 = c4848; c48410.m10293(); c48410 = c48410.f11035) {
            if (m38361((AbstractC6462) c48410.f11034, c4849)) {
                c4848M10283 = m38333((AbstractC6462) c48410.f11034, c4848M10283);
            }
        }
        while (c4849.m10293()) {
            if (m38361((AbstractC6462) c4849.f11034, c4848)) {
                c4848M10283 = m38333((AbstractC6462) c4849.f11034, c4848M10283);
            }
            c4849 = c4849.f11035;
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m38345(AbstractC6462 abstractC6462) {
        boolean zM14777 = abstractC6462.m14777(EnumC11353.TYPEVAR);
        C8374 c8374 = this.f49912;
        if (zM14777) {
            return m38345(c8374.m19502(abstractC6462));
        }
        if (abstractC6462.m14777(EnumC11353.CLASS)) {
            C15828 c15828 = (C15828) abstractC6462.f16705;
            if (c15828.f20405 == EnumC3600.f7353) {
                return true;
            }
            C22004 c22004 = this.f49894;
            return c15828.mo17999((AbstractC7783) c22004.f69174.f16705, c8374) || c15828.mo17999((AbstractC7783) c22004.f69135.f16705, c8374);
        }
        return abstractC6462.m14777(EnumC11353.BOT);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m38358(C4848 c4848, C4848 c4849) {
        C4848 c4848M10283 = C4848.m10283();
        while (c4848.m10293()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
            if (!m38345(abstractC6462) && !m38361(abstractC6462, c4849)) {
                c4848M10283 = c4848M10283.m10290((AbstractC6462) c4848.f11034);
            }
            c4848 = c4848.f11035;
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13370 m38213(C5771 c5771, C5771 c5772) {
        AbstractC7783 abstractC7783M17991 = c5771.m17991();
        AbstractC7783 abstractC7783M17992 = c5772.m17991();
        if ((c5772.f20407.mo18003() & 512) == 0) {
            C13370 c13370 = C13665.f38450;
            return new C13370("compiler", "cant.override", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
        }
        if ((c5771.f20407.mo18003() & 512) == 0) {
            C13370 c13371 = C13665.f38450;
            return new C13370("compiler", "cant.implement", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
        }
        C13370 c13372 = C13665.f38450;
        return new C13370("compiler", "clashes.with", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13370 m38246(C5771 c5771, C5771 c5772) {
        AbstractC7783 abstractC7783M17991 = c5771.m17991();
        AbstractC7783 abstractC7783M17992 = c5772.m17991();
        if ((c5772.f20407.mo18003() & 512) == 0) {
            C13370 c13370 = C13665.f38450;
            return new C13370("compiler", "unchecked.override", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
        }
        if ((c5771.f20407.mo18003() & 512) == 0) {
            C13370 c13371 = C13665.f38450;
            return new C13370("compiler", "unchecked.implement", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
        }
        C13370 c13372 = C13665.f38450;
        return new C13370("compiler", "unchecked.clash.with", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C13370 m38250(C5771 c5771, C5771 c5772) {
        AbstractC7783 abstractC7783M17991 = c5771.m17991();
        AbstractC7783 abstractC7783M17992 = c5772.m17991();
        if ((c5772.f20407.mo18003() & 512) == 0) {
            C13370 c13370 = C13665.f38450;
            return new C13370("compiler", "varargs.override", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
        }
        if ((c5771.f20407.mo18003() & 512) == 0) {
            C13370 c13371 = C13665.f38450;
            return new C13370("compiler", "varargs.implement", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
        }
        C13370 c13372 = C13665.f38450;
        return new C13370("compiler", "varargs.clash.with", c5771, abstractC7783M17991, c5772, abstractC7783M17992);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38322(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, AbstractC6462 abstractC6464) {
        AbstractC6462 abstractC6462M19463;
        AbstractC6462 abstractC6462M19464;
        HashMap map;
        boolean z;
        AbstractC7783 abstractC7783;
        HashMap map2;
        Iterator it;
        long j;
        Iterator it2;
        HashMap map3;
        Iterator it3;
        long j2;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        long jMo18003 = abstractC6464.f16705.mo18003() & 16777216;
        C8374 c8374 = this.f49912;
        long j3 = 0;
        if (jMo18003 != 0) {
            abstractC6462M19463 = c8374.m19463(abstractC6462);
            abstractC6462M19464 = c8374.m19463(abstractC6463);
        } else {
            abstractC6462M19463 = abstractC6462;
            abstractC6462M19464 = abstractC6463;
        }
        HashMap map4 = new HashMap();
        m38217(abstractC6462M19463, map4);
        if (abstractC6462M19463 == abstractC6462M19464) {
            map = map4;
        } else {
            map = new HashMap();
            m38218(abstractC6462M19464, map4, map);
        }
        Iterator it8 = map4.values().iterator();
        loop0: while (true) {
            boolean z2 = false;
            Predicate predicate = null;
            if (!it8.hasNext()) {
                z = false;
                abstractC7783 = null;
                break;
            }
            AbstractC6462 abstractC6465 = (AbstractC6462) it8.next();
            Iterator it9 = map.values().iterator();
            while (it9.hasNext()) {
                AbstractC6462 abstractC6466 = (AbstractC6462) it9.next();
                Iterator it10 = abstractC6465.f16705.mo17983().mo22455(predicate, EnumC3620.NON_RECURSIVE).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        map2 = map;
                        it = it8;
                        j = j3;
                        it2 = it9;
                        z = false;
                        abstractC7783 = null;
                        break;
                    }
                    AbstractC7783 abstractC7784 = (AbstractC7783) it10.next();
                    if (abstractC7784.f20405 == EnumC3600.f7343 && abstractC7784.mo12937((AbstractC7783) abstractC6464.f16705, c8374) && (abstractC7784.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == j3) {
                        C5771 c5771M12935 = ((C5771) abstractC7784).m12935(abstractC6464.f16705, c8374, z2);
                        C3686 c3686 = c8374.f22469;
                        if (c5771M12935 == null || (c5771M12935.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            Iterator it11 = abstractC6466.f16705.mo17983().m22456(abstractC7784.f20408).iterator();
                            AbstractC6462 abstractC6462M19483 = null;
                            while (true) {
                                if (it11.hasNext()) {
                                    abstractC7783 = (AbstractC7783) it11.next();
                                    if (abstractC7784 == abstractC7783) {
                                        map2 = map;
                                    } else {
                                        map2 = map;
                                        if (abstractC7783.f20405 == EnumC3600.f7343 && abstractC7783.mo12937((AbstractC7783) abstractC6464.f16705, c8374)) {
                                            j = 0;
                                            if ((abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                                if (abstractC6462M19483 == null) {
                                                    abstractC6462M19483 = c8374.m19483(abstractC7784, abstractC6465);
                                                }
                                                AbstractC6462 abstractC6462M19484 = c8374.m19483(abstractC7783, abstractC6466);
                                                boolean zM19456 = c8374.m19456(abstractC6462M19483, abstractC6462M19484);
                                                it = it8;
                                                it6 = it11;
                                                C23623 c23623 = this.f49881;
                                                if (zM19456) {
                                                    C4848 c4848Mo14802 = abstractC6462M19483.mo14802();
                                                    it7 = it10;
                                                    C4848 c4848Mo14803 = abstractC6462M19484.mo14802();
                                                    it2 = it9;
                                                    AbstractC6462 abstractC6462Mo14787 = abstractC6462M19483.mo14787();
                                                    AbstractC6462 abstractC6462M19428 = c8374.m19428(abstractC6462M19484.mo14787(), c4848Mo14803, c4848Mo14802);
                                                    if (!c8374.m19490(abstractC6462Mo14787, abstractC6462M19428) && ((abstractC6462Mo14787.mo14771() || abstractC6462M19428.mo14771() || (!c8374.m19445(abstractC6462Mo14787, abstractC6462M19428, c3686) && !c8374.m19445(abstractC6462M19428, abstractC6462Mo14787, c3686))) && !m38327(abstractC7784, abstractC7783, abstractC6464))) {
                                                        AbstractC12224 abstractC12224 = abstractC7783.f20408;
                                                        C4848 c4848Mo14797 = c8374.m19483(abstractC7783, abstractC6466).mo14797();
                                                        C13370 c13370 = C13665.f38450;
                                                        C13370 c13371 = new C13370("compiler", "incompatible.diff.ret", abstractC12224, c4848Mo14797);
                                                        C14040 c14040 = C8300.f21997;
                                                        c23623.m9352(interfaceC5323, new C14040("compiler", "types.incompatible", abstractC6465, abstractC6466, c13371));
                                                        z = false;
                                                        break;
                                                    }
                                                } else {
                                                    it7 = it10;
                                                    it2 = it9;
                                                    C20207 c20207 = new C20207(this, ((C15828) abstractC6464.f16705).f20406);
                                                    if (c20207.m45700(abstractC7784) && c20207.m45700(abstractC7783) && c8374.m19446(abstractC7784.mo18010(c8374), abstractC7783.mo18010(c8374), true) && !m38327(abstractC7784, abstractC7783, abstractC6464)) {
                                                        AbstractC12224 abstractC12225 = abstractC7784.f20408;
                                                        C4848 c4848 = c8374.m19483(abstractC7784, abstractC6464).mo14809().f35030;
                                                        AbstractC7783 abstractC7783M17991 = abstractC7784.m17991();
                                                        AbstractC12224 abstractC12226 = abstractC7783.f20408;
                                                        C4848 c4849 = c8374.m19483(abstractC7783, abstractC6464).mo14809().f35030;
                                                        AbstractC7783 abstractC7783M17992 = abstractC7783.m17991();
                                                        C14040 c14041 = C8300.f21997;
                                                        c23623.m9352(interfaceC5323, new C14040("compiler", "name.clash.same.erasure.no.override", abstractC12225, c4848, abstractC7783M17991, abstractC12226, c4849, abstractC7783M17992));
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                it = it8;
                                                it6 = it11;
                                                it7 = it10;
                                                it2 = it9;
                                            }
                                        }
                                        map = map2;
                                        it8 = it;
                                        it11 = it6;
                                        it10 = it7;
                                        it9 = it2;
                                    }
                                    it = it8;
                                    it6 = it11;
                                    it7 = it10;
                                    it2 = it9;
                                    map = map2;
                                    it8 = it;
                                    it11 = it6;
                                    it10 = it7;
                                    it9 = it2;
                                }
                            }
                        }
                        map3 = map;
                        it3 = it8;
                        it4 = it10;
                        it5 = it9;
                        j2 = 0;
                        z2 = false;
                    } else {
                        map3 = map;
                        it3 = it8;
                        j2 = j3;
                        it4 = it10;
                        it5 = it9;
                    }
                    map = map3;
                    j3 = j2;
                    it8 = it3;
                    it10 = it4;
                    it9 = it5;
                }
                if (abstractC7783 != null) {
                    break loop0;
                }
                z2 = false;
                predicate = null;
                map = map2;
                j3 = j;
                it8 = it;
                it9 = it2;
            }
        }
        if (abstractC7783 == null) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38217(AbstractC6462 abstractC6462, HashMap map) {
        if (abstractC6462.m14777(EnumC11353.CLASS) && map.put(abstractC6462.f16705, abstractC6462) == null) {
            C8374 c8374 = this.f49912;
            m38217(c8374.m19502(abstractC6462), map);
            Iterator it = c8374.m19450(abstractC6462).iterator();
            while (it.hasNext()) {
                m38217((AbstractC6462) it.next(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38218(AbstractC6462 abstractC6462, HashMap map, HashMap map2) {
        if (abstractC6462.m14777(EnumC11353.CLASS) && map.get(abstractC6462.f16705) == null && map2.put(abstractC6462.f16705, abstractC6462) == null) {
            C8374 c8374 = this.f49912;
            m38218(c8374.m19502(abstractC6462), map, map2);
            Iterator it = c8374.m19450(abstractC6462).iterator();
            while (it.hasNext()) {
                m38218((AbstractC6462) it.next(), map, map2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38327(AbstractC7783 abstractC7783, AbstractC7783 abstractC7784, AbstractC6462 abstractC6462) {
        HashMap map = new HashMap();
        C8374 c8374 = this.f49912;
        AbstractC6462 abstractC6462M19483 = c8374.m19483(abstractC7783, abstractC6462);
        AbstractC6462 abstractC6462M19484 = c8374.m19483(abstractC7784, abstractC6462);
        m38217(abstractC6462, map);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (AbstractC7783 abstractC7785 : ((AbstractC6462) it.next()).f16705.mo17983().m22456(abstractC7783.f20408)) {
                if (abstractC7785 != abstractC7783 && abstractC7785 != abstractC7784 && abstractC7785.f20405 == EnumC3600.f7343 && (abstractC7785.mo18003() & 2147487744L) == 0) {
                    AbstractC6462 abstractC6462M19485 = c8374.m19483(abstractC7785, abstractC6462);
                    if (c8374.m19456(abstractC6462M19485, abstractC6462M19483) && c8374.m19456(abstractC6462M19485, abstractC6462M19484) && c8374.m19501(abstractC6462M19485, abstractC6462M19483) && c8374.m19501(abstractC6462M19485, abstractC6462M19484)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ۗ۠۠, l.ۡ֡۠] */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.ۗ۠۠] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۖ֨۠, l.᩹ܶ۠] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final void m38281(C4036 c4036, final C10471 c10471, C5771 c5771) {
        C14040 c14040;
        C15828 c15828 = (C15828) c5771.f20407;
        c15828.mo18020();
        long j = c15828.f20409 & 16384;
        ?? r5 = this.f49881;
        C22004 c22004 = this.f49894;
        C8374 c8374 = this.f49912;
        if (j != 0 && this.f49901.f21749.equals(c5771.f20408) && c5771.mo12938(c22004.f69207, c15828, c8374, false)) {
            r5.m9352(c10471, C8300.f22058);
            return;
        }
        if (this.f49895 && c15828.m35942() && C7480.stream(c15828.m35943()).filter(new Predicate() { // from class: l.᩶ۗ֨
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
            public /* synthetic */ Predicate m48071or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C5771 c5772 = ((C22536) obj).f71074;
                return c5772 == c10471.f28960 && (c5772.f20409 & 16777216) == 0;
            }
        }).findFirst().isPresent()) {
            return;
        }
        for (AbstractC6462 abstractC6462M19502 = c15828.f20406; abstractC6462M19502.m14777(EnumC11353.CLASS); abstractC6462M19502 = c8374.m19502(abstractC6462M19502)) {
            if (abstractC6462M19502 != c15828.f20406) {
                m38313((C10471) c10471, abstractC6462M19502, c15828, c5771);
            }
            Iterator it = c8374.m19450(abstractC6462M19502).iterator();
            while (it.hasNext()) {
                m38313((C10471) c10471, (AbstractC6462) it.next(), c15828, c5771);
            }
        }
        boolean z = c5771.m17984((AbstractC7783) c22004.f69203.f16705) != null;
        if (z || !(!((C10545) c4036.f8849).f29211 || c5771.m17994() || (c5771.f20409 & 7) == 2)) {
            if (c5771.f20405 == EnumC3600.f7343 && !c5771.mo17483()) {
                AbstractC21195 abstractC21195 = (AbstractC21195) c5771.f20407;
                for (AbstractC6462 abstractC6462 : c8374.m19487(abstractC21195.f20406)) {
                    if (abstractC6462 != abstractC21195.f20406) {
                        for (AbstractC7783 abstractC7783 : abstractC6462.f16705.mo17983().m22456(c5771.f20408)) {
                            if (!abstractC7783.mo17483() && c5771.mo12938(abstractC7783, abstractC21195, c8374, true)) {
                                return;
                            }
                        }
                    }
                }
            }
            for (C19049 c19049 : c10471.f28961.f9953) {
                if (c19049.f56840.f18925.f16705 == c22004.f69203.f16705) {
                    c10471 = c19049;
                    break;
                }
            }
            if (z) {
                c14040 = c5771.mo17483() ? C8300.f22029 : C8300.f22043;
            } else {
                C14040 c14041 = C8300.f21997;
                c14040 = new C14040("compiler", "anonymous.diamond.method.does.not.override.superclass", C13665.f38457);
            }
            r5.m9352(c10471, c14040);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38313(C10471 c10471, AbstractC6462 abstractC6462, C15828 c15828, C5771 c5771) {
        for (AbstractC7783 abstractC7783 : abstractC6462.f16705.mo17983().m22456(c5771.f20408)) {
            if (c5771.mo12938(abstractC7783, c15828, this.f49912, false) && (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                m38299(c10471, c5771, (C5771) abstractC7783, c15828);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38300(AbstractC7257 abstractC7257, C15828 c15828) {
        C4848 c4848M19450;
        C22004 c22004 = this.f49894;
        AbstractC6462 abstractC6462 = c22004.f69208;
        AbstractC6462 abstractC6463 = c22004.f69208;
        if (c15828 == ((C15828) abstractC6462.f16705) || c15828.m17989() || c15828.m18009()) {
            return;
        }
        c15828.mo18020();
        if ((c15828.f20409 & 8192) == 0) {
            c15828.mo18020();
            if ((c15828.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                return;
            }
            boolean zIsEmpty = c15828.f20408.isEmpty();
            C8374 c8374 = this.f49912;
            if (!zIsEmpty || (c4848M19450 = c8374.m19450(c15828.f20406)) == null || c4848M19450.isEmpty() || ((AbstractC6462) c4848M19450.f11034).f16705 != c22004.f69146.f16705) {
                C6953 c6953 = this.f49880;
                EnumC21706 enumC21706 = EnumC21706.OVERRIDES;
                if (c6953.m15935(enumC21706)) {
                    AbstractC15689 abstractC15689Mo17983 = abstractC6463.f16705.mo17983();
                    C8200 c8200 = this.f49901;
                    C5771 c5771 = (C5771) abstractC15689Mo17983.mo22458(c8200.f21729, (Predicate) null);
                    C5771 c5772 = (C5771) abstractC6463.f16705.mo17983().mo22458(c8200.f21652, (Predicate) null);
                    C6611 c6611 = this.f49883;
                    C5771 c5771M19425 = c8374.m19425(c5771, (AbstractC21195) c15828, false, (Predicate) c6611);
                    boolean z = c5771M19425 != null && c5771M19425.f20407 == c15828;
                    boolean z2 = c8374.m19425(c5772, (AbstractC21195) c15828, false, (Predicate) c6611) != c5772;
                    if (!z || z2) {
                        return;
                    }
                    C12895 c12895 = C15675.f45417;
                    this.f49881.m9365(enumC21706, abstractC7257, new C12895("compiler", "override.equals.but.not.hashcode", c15828));
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final void m38293(C5777 c5777) {
        AbstractC14355 abstractC14355;
        C8320 c8320;
        AbstractC12224 abstractC12224;
        AbstractC14355 abstractC14356;
        InterfaceC5323 interfaceC5323;
        C1446.m31699(c5777.f14182.f20408);
        if (this.f49880.m15935(EnumC21706.MODULE)) {
            AbstractC14355 abstractC14357 = c5777.f14183;
            while (abstractC14355 != null) {
                int i = C4784.f10855[abstractC14355.mo3383().ordinal()];
                if (i == 1) {
                    c8320 = (C8320) abstractC14355;
                    abstractC12224 = c8320.f22259;
                    abstractC14356 = c8320.f22261;
                } else if (i == 2) {
                    abstractC12224 = ((C9661) abstractC14355).f26610;
                    abstractC14356 = null;
                } else {
                    abstractC14355 = abstractC14357;
                    throw new AssertionError("Unexpected qualified identifier: " + abstractC14355.toString());
                }
                if (abstractC12224 != null) {
                    abstractC14355 = abstractC14357;
                    interfaceC5323 = c8320;
                    String string = abstractC12224.toString();
                    int length = string.length();
                    if (length <= 0 || !Character.isDigit(string.charAt(length - 1))) {
                        abstractC14355 = abstractC14357;
                        interfaceC5323 = abstractC14355;
                    } else {
                        abstractC14355 = abstractC14357;
                        interfaceC5323 = abstractC14355;
                        EnumC21706 enumC21706 = EnumC21706.MODULE;
                        C12895 c12895 = C15675.f45417;
                        this.f49881.m9365(enumC21706, interfaceC5323, new C12895("compiler", "poor.choice.for.module.name", abstractC12224));
                    }
                } else {
                    abstractC14355 = abstractC14357;
                    interfaceC5323 = c8320;
                    abstractC14355 = abstractC14357;
                    interfaceC5323 = abstractC14355;
                }
                abstractC14355 = abstractC14356;
            }
            abstractC14355 = abstractC14357;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38318(C15828 c15828, InterfaceC5323 interfaceC5323) {
        C8374 c8374 = this.f49912;
        C5771 c5771M19426 = c8374.m19426(c15828);
        if (c5771M19426 != null) {
            C5771 c5771 = new C5771(c5771M19426.f20409, c5771M19426.f20408, c8374.m19483(c5771M19426, c15828.f20406), c5771M19426.f20407);
            AbstractC7783 abstractC7783M17991 = c5771.m17991();
            C14040 c14040 = C8300.f21997;
            this.f49881.m9352(interfaceC5323, new C14040("compiler", "does.not.override.abstract", c15828, c5771, abstractC7783M17991));
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m38347(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        m38244(interfaceC5323, abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38320(C15973 c15973, C10485 c10485) {
        m38222(c15973, c10485, C4848.m10283());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38222(C15973 c15973, AbstractC6462 abstractC6462, C4848 c4848) {
        EnumC11353 enumC11353 = EnumC11353.TYPEVAR;
        if (!abstractC6462.m14777(enumC11353) || (abstractC6462.f16705.mo18003() & 268435456) == 0) {
            boolean zContains = c4848.contains(abstractC6462);
            C8374 c8374 = this.f49912;
            if (zContains) {
                ((C10485) abstractC6462).mo23233(c8374.m19475(abstractC6462));
                C14040 c14040 = C8300.f21997;
                this.f49881.m9352(c15973, new C14040("compiler", "cyclic.inheritance", abstractC6462));
            } else if (abstractC6462.m14777(enumC11353)) {
                C10485 c10485 = (C10485) abstractC6462;
                C4848 c4848M10290 = c4848.m10290(c10485);
                Iterator it = c8374.m19424(c10485).iterator();
                while (it.hasNext()) {
                    m38222(c15973, (AbstractC6462) it.next(), c4848M10290);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX INFO: renamed from: ۡ */
    private boolean m38244(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        boolean zM38244;
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        long j = abstractC21195.f20409;
        if ((j & 1073741824) != 0) {
            return true;
        }
        if ((j & 134217728) != 0) {
            m38252((C15828) abstractC21195, interfaceC5323);
        } else {
            if (!abstractC21195.f20406.mo14812()) {
                try {
                    abstractC21195.f20409 = 134217728 | abstractC21195.f20409;
                    if (abstractC21195.f20406.m14777(EnumC11353.CLASS)) {
                        C21333 c21333 = (C21333) abstractC21195.f20406;
                        C4848 c4848 = c21333.f67261;
                        zM38244 = true;
                        if (c4848 != null) {
                            while (c4848.m10293()) {
                                zM38244 &= m38244(interfaceC5323, (AbstractC6462) c4848.f11034);
                                c4848 = c4848.f11035;
                            }
                        }
                        AbstractC6462 abstractC6463 = c21333.f67259;
                        if (abstractC6463 != null && abstractC6463 != null && abstractC6463.m14777(EnumC11353.CLASS)) {
                            zM38244 &= m38244(interfaceC5323, abstractC6463);
                        }
                        AbstractC7783 abstractC7783 = abstractC21195.f20407;
                        if (abstractC7783.f20405 == EnumC3600.f7354) {
                            zM38244 &= m38244(interfaceC5323, abstractC7783.f20406);
                        }
                    } else {
                        zM38244 = true;
                    }
                    abstractC21195.f20409 = (-134217729) & abstractC21195.f20409;
                } catch (Throwable th) {
                    abstractC21195.f20409 = (-134217729) & abstractC21195.f20409;
                    throw th;
                }
            }
            if (zM38244) {
                zM38244 = (abstractC21195.f20409 & 268435456) != 0 && abstractC21195.f20410.mo9173();
            }
            if (zM38244) {
                abstractC21195.f20409 |= 1073741824;
            }
            return zM38244;
        }
        zM38244 = true;
        if (zM38244) {
            zM38244 = (abstractC21195.f20409 & 268435456) != 0 && abstractC21195.f20410.mo9173();
        }
        if (zM38244) {
            abstractC21195.f20409 |= 1073741824;
        }
        return zM38244;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m38252(C15828 c15828, InterfaceC5323 interfaceC5323) {
        C14040 c14040 = C8300.f21997;
        this.f49881.m9352(interfaceC5323, new C14040("compiler", "cyclic.inheritance", c15828));
        AbstractC6462 abstractC6462 = c15828.f20406;
        C8374 c8374 = this.f49912;
        for (C4848 c4848M19450 = c8374.m19450(abstractC6462); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            c4848M19450.f11034 = new C13956((C15828) ((AbstractC6462) c4848M19450.f11034).f16705, AbstractC6462.f16700);
        }
        AbstractC6462 abstractC6462M19502 = c8374.m19502(c15828.f20406);
        if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
            ((C21333) c15828.f20406).f67259 = new C13956((C15828) abstractC6462M19502.f16705, AbstractC6462.f16700);
        }
        c15828.f20406 = new C13956(c15828, c15828.f20406);
        c15828.f20409 |= 1073741824;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38301(AbstractC7257 abstractC7257, C15828 c15828, C15828 c15829) {
        C5771 c5771;
        C5771 c5771M12935;
        AbstractC6462 abstractC6462 = c15829.f20406;
        C8374 c8374 = this.f49912;
        for (C4848 c4848M19487 = c8374.m19487(abstractC6462); c4848M19487.m10293(); c4848M19487 = c4848M19487.f11035) {
            C15828 c158210 = (C15828) ((AbstractC6462) c4848M19487.f11034).f16705;
            c158210.mo18020();
            if ((c158210.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                c158210.mo18020();
                for (AbstractC7783 abstractC7783 : c158210.f45850.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
                    if (abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & 1032) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && (c5771M12935 = (c5771 = (C5771) abstractC7783).m12935(c15828, c8374, false)) != null && c5771M12935 != c5771) {
                        long jMo18003 = c5771M12935.f20407.mo18003() & 512;
                        c15828.mo18020();
                        if (jMo18003 == (512 & c15828.f20409)) {
                            m38299(abstractC7257, c5771M12935, c5771, c15828);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38351(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        long j;
        C8374 c8374 = this.f49912;
        C4848 c4848M19450 = c8374.m19450(abstractC6462);
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462);
        long j2 = 0;
        if (abstractC6462M19502.m14777(EnumC11353.CLASS) && (abstractC6462M19502.f16705.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            c4848M19450 = c4848M19450.m10290(abstractC6462M19502);
        }
        for (C4848 c4848 = c4848M19450; c4848.m10293(); c4848 = c4848.f11035) {
            if (!((AbstractC6462) c4848.f11034).mo14802().isEmpty()) {
                AbstractC6462 abstractC6463 = (AbstractC6462) c4848.f11034;
                if (!m38322(interfaceC5323, abstractC6463, abstractC6463, abstractC6462)) {
                    return;
                }
            }
            for (C4848 c4849 = c4848M19450; c4849 != c4848; c4849 = c4849.f11035) {
                if (!m38322(interfaceC5323, (AbstractC6462) c4848.f11034, (AbstractC6462) c4849.f11034, abstractC6462)) {
                    return;
                }
            }
        }
        AbstractC6462 abstractC6462M19503 = c8374.m19502(abstractC6462);
        if (abstractC6462M19503.m14777(EnumC11353.CLASS)) {
            for (AbstractC6462 abstractC6462M19504 = abstractC6462M19503; abstractC6462M19504.m14777(EnumC11353.CLASS) && abstractC6462M19504.f16705.f20406.mo14781(); abstractC6462M19504 = c8374.m19502(abstractC6462M19504)) {
                for (AbstractC7783 abstractC7783 : abstractC6462M19504.f16705.mo17983().mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
                    if (abstractC7783.f20405 == EnumC3600.f7343) {
                        long j3 = 2147487752L;
                        if ((abstractC7783.mo18003() & 2147487752L) == j2 && abstractC7783.mo12937((AbstractC7783) abstractC6462.f16705, c8374)) {
                            boolean z = true;
                            if (((C5771) abstractC7783).m12935(abstractC6462.f16705, c8374, true) == abstractC7783) {
                                AbstractC6462 abstractC6462M19483 = c8374.m19483(abstractC7783, abstractC6462M19504);
                                int iM10289 = abstractC6462M19483.mo14797().m10289();
                                if (abstractC6462M19483 != abstractC7783.f20406) {
                                    AbstractC6462 abstractC6462M19505 = abstractC6462M19503;
                                    while (abstractC6462M19505.m14777(EnumC11353.CLASS)) {
                                        for (AbstractC7783 abstractC7784 : abstractC6462M19505.f16705.mo17983().m22456(abstractC7783.f20408)) {
                                            if (abstractC7784 == abstractC7783) {
                                                j = j3;
                                            } else if (abstractC7784.f20405 == EnumC3600.f7343) {
                                                j = 2147487752L;
                                                if ((abstractC7784.mo18003() & 2147487752L) == 0 && abstractC7784.f20406.mo14797().m10289() == iM10289 && abstractC7784.mo12937((AbstractC7783) abstractC6462.f16705, c8374) && ((C5771) abstractC7784).m12935(abstractC6462.f16705, c8374, z) == abstractC7784) {
                                                    if (c8374.m19456(abstractC6462M19483, c8374.m19483(abstractC7784, abstractC6462M19505))) {
                                                        C14040 c14040 = C8300.f21997;
                                                        Object[] objArr = new Object[5];
                                                        objArr[0] = abstractC7783;
                                                        objArr[z ? 1 : 0] = abstractC6462M19504;
                                                        objArr[2] = abstractC7784;
                                                        objArr[3] = abstractC6462M19505;
                                                        objArr[4] = abstractC6462M19503;
                                                        this.f49881.m9352(interfaceC5323, new C14040("compiler", "concrete.inheritance.conflict", objArr));
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                j = 2147487752L;
                                            }
                                            j3 = j;
                                        }
                                        abstractC6462M19505 = c8374.m19502(abstractC6462M19505);
                                        z = true;
                                    }
                                    j2 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38342(C10471 c10471, AbstractC6462 abstractC6462, C5771 c5771) {
        C20207 c20207 = new C20207(this, abstractC6462);
        C4848 c4848M10283 = C4848.m10283();
        final ArrayList<AbstractC7783> arrayList = new ArrayList();
        C8374 c8374 = this.f49912;
        boolean z = false;
        C21230.forEach(c8374.m19438(abstractC6462, false).mo22457(c5771.f20408, c20207, EnumC3620.RECURSIVE), new Consumer() { // from class: l.ۗۗ֨
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                arrayList.add((AbstractC7783) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
        boolean z2 = false;
        for (AbstractC7783 abstractC7783 : arrayList) {
            if (c5771.mo12938(abstractC7783, abstractC6462.f16705, c8374, z)) {
                if (abstractC7783 != c5771) {
                    c4848M10283 = C4848.m10283();
                    z2 = true;
                }
                for (AbstractC7783 abstractC7784 : arrayList) {
                    if (abstractC7784 != abstractC7783) {
                        if (!c8374.m19472(c5771.f20406, c8374.m19483(abstractC7784, abstractC6462), EnumC12477.f34982.m28726(this.f49898)) && c8374.m19446(abstractC7784.mo18010(c8374), abstractC7783.mo18010(c8374), true)) {
                            c5771.f20409 |= 4398046511104L;
                            C23623 c23623 = this.f49881;
                            if (abstractC7783 == c5771) {
                                AbstractC12224 abstractC12224 = abstractC7783.f20408;
                                C4848 c4848 = c8374.m19483(abstractC7783, abstractC6462).mo14809().f35030;
                                AbstractC7783 abstractC7783M17991 = abstractC7783.m17991();
                                AbstractC12224 abstractC12225 = abstractC7784.f20408;
                                C4848 c4849 = c8374.m19483(abstractC7784, abstractC6462).mo14809().f35030;
                                AbstractC7783 abstractC7783M17992 = abstractC7784.m17991();
                                C14040 c14040 = C8300.f21997;
                                c23623.m9352(c10471, new C14040("compiler", "name.clash.same.erasure.no.override", abstractC12224, c4848, abstractC7783M17991, abstractC12225, c4849, abstractC7783M17992));
                                return;
                            }
                            C21333 c21333 = (C21333) abstractC6462;
                            String str = c21333.mo14789() ? "interface" : Name.LABEL;
                            AbstractC12224 abstractC12226 = c21333.f16705.f20408;
                            AbstractC12224 abstractC12227 = abstractC7783.f20408;
                            C4848 c48410 = c8374.m19483(abstractC7783, abstractC6462).mo14809().f35030;
                            AbstractC7783 abstractC7783M17993 = abstractC7783.m17991();
                            AbstractC12224 abstractC12228 = abstractC7784.f20408;
                            C4848 c48411 = c8374.m19483(abstractC7784, abstractC6462).mo14809().f35030;
                            AbstractC7783 abstractC7783M17994 = abstractC7784.m17991();
                            C14040 c14041 = C8300.f21997;
                            c23623.m9352(c10471, new C14040("compiler", "name.clash.same.erasure.no.override.1", str, abstractC12226, abstractC12227, c48410, abstractC7783M17993, abstractC12228, c48411, abstractC7783M17994));
                            return;
                        }
                        z = false;
                    }
                }
            } else if (abstractC7783 != c5771 && !z2) {
                c4848M10283 = c4848M10283.m10290((C5771) abstractC7783);
            }
        }
        if (z2) {
            return;
        }
        Iterator it = c4848M10283.iterator();
        while (it.hasNext()) {
            m38312(c10471, abstractC6462, c5771, (C5771) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38311(C10471 c10471, AbstractC6462 abstractC6462, C5771 c5771) {
        C20207 c20207 = new C20207(this, abstractC6462);
        C8374 c8374 = this.f49912;
        for (AbstractC7783 abstractC7783 : c8374.m19438(abstractC6462, true).mo22457(c5771.f20408, c20207, EnumC3620.RECURSIVE)) {
            if (!c8374.m19472(c5771.f20406, c8374.m19483(abstractC7783, abstractC6462), EnumC12477.f34982.m28726(this.f49898))) {
                if (c8374.m19446(abstractC7783.mo18010(c8374), c5771.mo18010(c8374), true)) {
                    AbstractC7783 abstractC7783M17991 = c5771.m17991();
                    AbstractC7783 abstractC7783M17992 = abstractC7783.m17991();
                    C14040 c14040 = C8300.f21997;
                    this.f49881.m9352(c10471, new C14040("compiler", "name.clash.same.erasure.no.hide", c5771, abstractC7783M17991, abstractC7783, abstractC7783M17992));
                    return;
                }
                m38312(c10471, abstractC6462, c5771, (C5771) abstractC7783);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m38356(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        char c;
        AbstractC7783 abstractC7783;
        C13370 c13370;
        C7466 c7466 = new C7466(this, abstractC6462);
        C8374 c8374 = this.f49912;
        for (AbstractC7783 abstractC7784 : c8374.m19438(abstractC6462, false).mo22455(c7466, EnumC3620.RECURSIVE)) {
            int i = 1;
            C1446.m31704(abstractC7784.f20405 == EnumC3600.f7343);
            C4848 c4848M19423 = c8374.m19423(abstractC6462, (C5771) abstractC7784);
            if (c4848M19423.m10289() > 1) {
                C20271 c20271 = new C20271();
                C20271 c20272 = new C20271();
                Iterator it = c4848M19423.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C5771 c5771 = (C5771) it.next();
                        long j = c5771.f20409;
                        if ((8796093022208L & j) != 0) {
                            c20272.m45777(c5771);
                        } else if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            c20271.m45777(c5771);
                        }
                        if (c20272.m45784() && c20271.size() + c20272.size() >= 2) {
                            AbstractC7783 abstractC7785 = (AbstractC7783) c20272.first();
                            if (c20272.size() > i) {
                                abstractC7783 = (AbstractC7783) c20272.m45783().f11035.f11034;
                                EnumC10306 enumC10306M51425 = C23047.m51425(abstractC6462.f16705);
                                AbstractC12224 abstractC12224 = abstractC7784.f20408;
                                C4848 c4848Mo14797 = c8374.m19483(abstractC7784, abstractC6462).mo14797();
                                AbstractC7783 abstractC7783M17991 = abstractC7785.m17991();
                                AbstractC7783 abstractC7783M17992 = abstractC7783.m17991();
                                C13370 c13371 = C13665.f38450;
                                c = 1;
                                c13370 = new C13370("compiler", "incompatible.unrelated.defaults", enumC10306M51425, abstractC6462, abstractC12224, c4848Mo14797, abstractC7783M17991, abstractC7783M17992);
                            } else {
                                c = 1;
                                abstractC7783 = (AbstractC7783) c20271.first();
                                EnumC10306 enumC10306M51426 = C23047.m51425(abstractC6462.f16705);
                                AbstractC12224 abstractC12225 = abstractC7784.f20408;
                                C4848 c4848Mo14798 = c8374.m19483(abstractC7784, abstractC6462).mo14797();
                                AbstractC7783 abstractC7783M17993 = abstractC7785.m17991();
                                AbstractC7783 abstractC7783M17994 = abstractC7783.m17991();
                                C13370 c13372 = C13665.f38450;
                                c13370 = new C13370("compiler", "incompatible.abstract.default", enumC10306M51426, abstractC6462, abstractC12225, c4848Mo14798, abstractC7783M17993, abstractC7783M17994);
                            }
                            AbstractC6462 abstractC6463 = abstractC7785.m17991().f20406;
                            AbstractC6462 abstractC6464 = abstractC7783.m17991().f20406;
                            C14040 c14040 = C8300.f21997;
                            Object[] objArr = new Object[3];
                            objArr[0] = abstractC6463;
                            objArr[c] = abstractC6464;
                            objArr[2] = c13370;
                            this.f49881.m9352(interfaceC5323, new C14040("compiler", "types.incompatible", objArr));
                            break;
                        }
                        i = 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38312(C10471 c10471, AbstractC6462 abstractC6462, C5771 c5771, C5771 c5772) {
        if (c5771 != c5772 && EnumC12477.f34962.m28726(this.f49898) && this.f49880.m15935(EnumC21706.OVERLOADS) && (c5771.f20409 & 281474976710656L) == 0 && (c5772.f20409 & 281474976710656L) == 0) {
            C8374 c8374 = this.f49912;
            AbstractC6462 abstractC6462M19483 = c8374.m19483(c5771, abstractC6462);
            AbstractC6462 abstractC6462M19484 = c8374.m19483(c5772, abstractC6462);
            EnumC11353 enumC11353 = EnumC11353.FORALL;
            if (abstractC6462M19483.m14777(enumC11353) && abstractC6462M19484.m14777(enumC11353)) {
                C11945 c11945 = (C11945) abstractC6462M19483;
                C11945 c11946 = (C11945) abstractC6462M19484;
                if (c8374.m19447(c11945, c11946)) {
                    abstractC6462M19484 = c8374.m19428(abstractC6462M19484, c11946.f33323, c11945.f33323);
                }
            }
            int iMax = Math.max(abstractC6462M19483.mo14797().m10289(), abstractC6462M19484.mo14797().m10289());
            C4848 c4848Mo14797 = abstractC6462M19483.mo14797();
            C23663 c23663 = this.f49884;
            C4848 c4848M52639 = c23663.m52639(c4848Mo14797, (AbstractC7783) c5771, iMax, true);
            C4848 c4848M526310 = c23663.m52639(abstractC6462M19484.mo14797(), (AbstractC7783) c5772, iMax, true);
            if (c4848M52639.m10289() != c4848M526310.m10289()) {
                return;
            }
            boolean z = false;
            while (c4848M52639.m10293() && c4848M526310.m10293()) {
                AbstractC6462 abstractC6463 = (AbstractC6462) c4848M52639.f11034;
                AbstractC6462 abstractC6464 = (AbstractC6462) c4848M526310.f11034;
                if (!c8374.m19486(abstractC6464, abstractC6463, true) && !c8374.m19486(abstractC6463, abstractC6464, true)) {
                    if (!c8374.m19498(abstractC6463) || !c8374.m19498(abstractC6464) || c8374.m19478(abstractC6463).mo14797().m10289() <= 0 || c8374.m19478(abstractC6463).mo14797().m10289() != c8374.m19478(abstractC6464).mo14797().m10289()) {
                        return;
                    } else {
                        z = true;
                    }
                }
                c4848M52639 = c4848M52639.f11035;
                c4848M526310 = c4848M526310.f11035;
            }
            if (z) {
                c5771.f20409 |= 281474976710656L;
                c5772.f20409 |= 281474976710656L;
                EnumC21706 enumC21706 = EnumC21706.OVERLOADS;
                AbstractC7783 abstractC7783M17991 = c5771.m17991();
                AbstractC7783 abstractC7783M17992 = c5772.m17991();
                C12895 c12895 = C15675.f45417;
                this.f49881.m9365(enumC21706, c10471, new C12895("compiler", "potentially.ambiguous.overload", c5771, abstractC7783M17991, c5772, abstractC7783M17992));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38316(AbstractC14355 abstractC14355, boolean z) {
        if (!this.f49890) {
            C6953 c6953 = this.f49880;
            EnumC21706 enumC21706 = EnumC21706.SERIAL;
            if (!c6953.m15935(enumC21706) || this.f49880.m15936(enumC21706) || !z) {
                return;
            }
        }
        AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC14355);
        if (abstractC7783M21438.f20405.m6623(C17010.f50315)) {
            if (abstractC7783M21438.f20405 == EnumC3600.f7339) {
                if ((abstractC7783M21438.mo18003() & 8589934592L) != 0 || abstractC7783M21438.m17996()) {
                    return;
                }
                AbstractC12224 abstractC12224 = abstractC7783M21438.f20408;
                C8200 c8200 = this.f49901;
                if (abstractC12224 == c8200.f21744 || abstractC12224 == c8200.f21756) {
                    return;
                }
            }
            AbstractC6462 abstractC6462 = abstractC7783M21438.f20407.f20406;
            C22004 c22004 = this.f49894;
            if (this.f49912.m19486(abstractC6462, c22004.f69169, true) || abstractC7783M21438.m18008() == c22004.f69155) {
                return;
            }
            for (AbstractC7783 abstractC7783 = abstractC7783M21438; abstractC7783.f20405 != EnumC3600.f7351; abstractC7783 = abstractC7783.f20407) {
                if ((abstractC7783.mo18003() & 1) == 0) {
                    C23623 c23623 = this.f49881;
                    if (!z) {
                        C12895 c12895 = C15675.f45417;
                        c23623.m9364(abstractC14355, new C12895("compiler", "access.to.member.from.serializable.element", abstractC7783M21438));
                        return;
                    }
                    String string = abstractC7783M21438.m18008().f27059.toString();
                    if (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.contains(".internal.")) {
                        EnumC21706 enumC21707 = EnumC21706.SERIAL;
                        C12895 c12896 = C15675.f45417;
                        c23623.m9365(enumC21707, abstractC14355, new C12895("compiler", "access.to.member.from.serializable.lambda", abstractC7783M21438));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38285(InterfaceC5323 interfaceC5323, HashMap map, AbstractC6462 abstractC6462) {
        if (abstractC6462.mo14812()) {
            return;
        }
        C8374 c8374 = this.f49912;
        for (C4848 c4848M19450 = c8374.m19450(abstractC6462); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
            AbstractC6462 abstractC6463 = (AbstractC6462) c4848M19450.f11034;
            EnumC11353 enumC11353 = EnumC11353.CLASS;
            if (!abstractC6462.m14777(enumC11353) || abstractC6463.m14777(enumC11353)) {
                AbstractC6462 abstractC6464 = (AbstractC6462) map.put(abstractC6463.f16705, abstractC6463);
                if (abstractC6464 != null) {
                    C4848 c4848Mo14798 = abstractC6464.mo14798();
                    C4848 c4848Mo14799 = abstractC6463.mo14798();
                    if (!c8374.m19469(c4848Mo14798, c4848Mo14799)) {
                        AbstractC21195 abstractC21195 = abstractC6463.f16705;
                        String strM14770 = AbstractC6462.m14770(c4848Mo14798);
                        String strM14771 = AbstractC6462.m14770(c4848Mo14799);
                        C14040 c14040 = C8300.f21997;
                        this.f49881.m9352(interfaceC5323, new C14040("compiler", "cant.inherit.diff.arg", abstractC21195, strM14770, strM14771));
                    }
                }
                m38285(interfaceC5323, map, abstractC6463);
            }
        }
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462);
        EnumC11353 enumC11354 = EnumC11353.CLASS;
        if ((!abstractC6462.m14777(enumC11354) || abstractC6462M19502.m14777(enumC11354)) && abstractC6462M19502 != AbstractC6462.f16700) {
            m38285(interfaceC5323, map, abstractC6462M19502);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38315(AbstractC14355 abstractC14355, AbstractC6462 abstractC6462, HashSet hashSet) {
        if (hashSet.contains(abstractC6462)) {
            this.f49881.m9352(abstractC14355, C8300.f22099);
        } else {
            hashSet.add(abstractC6462);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38340(AbstractC7257 abstractC7257) {
        if (abstractC7257 != null) {
            m38331(abstractC7257, abstractC7257.f18925);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m38331(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        if (abstractC6462.mo14805()) {
            return;
        }
        C22004 c22004 = this.f49894;
        AbstractC6462 abstractC6463 = c22004.f69215;
        C8374 c8374 = this.f49912;
        if (!c8374.m19490(abstractC6462, abstractC6463) && (abstractC6462.f16705.mo18003() & 16384) == 0 && (abstractC6462.f16705.mo18003() & 8192) == 0 && C8374.m19414(abstractC6462).f16705 != c22004.f69196.f16705) {
            if (c8374.m19452(abstractC6462) && !c8374.m19452(c8374.m19455(abstractC6462))) {
                m38331(interfaceC5323, c8374.m19455(abstractC6462));
            } else {
                this.f49881.m9352(interfaceC5323, C8300.f22137);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38309(C10471 c10471, C5771 c5771) {
        C8374 c8374;
        AbstractC6462 abstractC6462M19502 = this.f49894.f69167;
        while (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
            Iterator it = abstractC6462M19502.f16705.mo17983().m22456(c5771.f20408).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c8374 = this.f49912;
                if (zHasNext) {
                    AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                    if (abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & 5) != 0 && c8374.m19456(c5771.f20406, abstractC7783.f20406)) {
                        C14040 c14040 = C8300.f21997;
                        this.f49881.m9352(c10471, new C14040("compiler", "intf.annotation.member.clash", abstractC7783, abstractC6462M19502));
                    }
                }
            }
            abstractC6462M19502 = c8374.m19502(abstractC6462M19502);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX INFO: renamed from: ֫ */
    public final void m38306(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257, C4848 c4848) {
        Set set;
        boolean z;
        boolean z2;
        C4436 c4436M21436;
        C20271 c20271;
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C19049 c19049 = (C19049) it.next();
            c19049.mo3382(new C8807(this));
            boolean z3 = (abstractC7783.f20409 & 2305843009213693952L) != 0 || (abstractC7783.m17990() != null && abstractC7783.m17990().m35942());
            boolean z4 = (2305843009213693952L & abstractC7783.f20409) != 0 && abstractC7257.m16617(EnumC19998.f60802) && abstractC7783.f20407.f20405 == EnumC3600.f7354;
            int i = 2;
            C8200 c8200 = this.f49901;
            C23623 c23623 = this.f49881;
            if (z4) {
                AbstractC12224[] abstractC12224ArrM38346 = m38346(c19049.f56840.f18925.f16705);
                int length = abstractC12224ArrM38346.length;
                boolean z5 = false;
                for (int i2 = 0; i2 < length; i2++) {
                    AbstractC12224 abstractC12224 = abstractC12224ArrM38346[i2];
                    z5 = abstractC12224 == c8200.f21666 || abstractC12224 == c8200.f21708 || abstractC12224 == c8200.f21743 || abstractC12224 == c8200.f21643 || abstractC12224 == c8200.f21647;
                    if (z5) {
                        break;
                    }
                }
                if (!z5) {
                    c23623.m9352(c19049, C8300.f22123);
                } else {
                    C22536 c22536M35935 = ((C15828) abstractC7783.f20407).m35935((C13818) abstractC7783);
                    C13148 c13148M18004 = c22536M35935.m18004();
                    if (c13148M18004 == null || c13148M18004.m30091()) {
                        c22536M35935.m17985((C4848) C7480.stream(abstractC7783.mo17987()).filter(new C5580(i, this)).collect(C4848.m10284()));
                    }
                }
            }
            boolean zMo35946 = c19049.f18925.f16705.mo35946();
            C22004 c22004 = this.f49894;
            if (zMo35946) {
                C18189 c18189M38275 = m38275(c19049, abstractC7783);
                if (!c18189M38275.isEmpty()) {
                    Set set2 = (Set) c18189M38275.get();
                    boolean z6 = set2.isEmpty() || (set2.size() == 1 && set2.contains(c8200.f21643));
                    if (z3) {
                        set = set2;
                        z = (abstractC7783.f20409 & 16777216) != 0;
                        if (z || !z6) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (set.isEmpty() || z2) {
                            if (z2) {
                                c4436M21436 = C9268.m21436(abstractC7257);
                                if (c4436M21436 != null && set.isEmpty()) {
                                    c20271 = new C20271();
                                    for (C19049 c190410 : c4436M21436.f9953) {
                                        if (c190410 != c19049) {
                                            c20271.m45777(c190410);
                                        }
                                    }
                                    c4436M21436.f9953 = c20271.m45783();
                                }
                                abstractC7783.m18004().m30081(c19049.f56842);
                            } else {
                                c23623.m9352(c19049, C8300.f22123);
                            }
                        }
                        if (z && !z4 && c19049.f18925.f16705 == c22004.f69186.f16705 && abstractC7257.m16617(EnumC19998.f60735)) {
                            AbstractC21195 abstractC21195 = c22004.f69186.f16705;
                            C13370 c13370 = C13665.f38450;
                            C13370 c13371 = new C13370("compiler", "varargs.trustme.on.non.varargs.accessor", abstractC7783);
                            C14040 c14040 = C8300.f21997;
                            c23623.m9352(c19049, new C14040("compiler", "varargs.invalid.trustme.anno", abstractC21195, c13371));
                        }
                    } else {
                        set = set2;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (set.isEmpty()) {
                        if (z2) {
                            c4436M21436 = C9268.m21436(abstractC7257);
                            if (c4436M21436 != null) {
                                c20271 = new C20271();
                                while (r10.hasNext()) {
                                    if (c190410 != c19049) {
                                        c20271.m45777(c190410);
                                    }
                                }
                                c4436M21436.f9953 = c20271.m45783();
                            }
                            abstractC7783.m18004().m30081(c19049.f56842);
                        } else {
                            c23623.m9352(c19049, C8300.f22123);
                        }
                    } else if (z2) {
                        c4436M21436 = C9268.m21436(abstractC7257);
                        if (c4436M21436 != null) {
                            c20271 = new C20271();
                            while (r10.hasNext()) {
                                if (c190410 != c19049) {
                                    c20271.m45777(c190410);
                                }
                            }
                            c4436M21436.f9953 = c20271.m45783();
                        }
                        abstractC7783.m18004().m30081(c19049.f56842);
                    } else {
                        c23623.m9352(c19049, C8300.f22123);
                    }
                    if (z) {
                        AbstractC21195 abstractC21196 = c22004.f69186.f16705;
                        C13370 c13372 = C13665.f38450;
                        C13370 c13373 = new C13370("compiler", "varargs.trustme.on.non.varargs.accessor", abstractC7783);
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(c19049, new C14040("compiler", "varargs.invalid.trustme.anno", abstractC21196, c13373));
                    }
                }
            }
            if (c19049.f56840.f18925.f16705 == c22004.f69149.f16705) {
                if (abstractC7783.f20405 != EnumC3600.f7354) {
                    c23623.m9352(c19049, C8300.f22135);
                } else if (!abstractC7783.m17989() || (abstractC7783.mo18003() & 8192) != 0) {
                    C13370 c13374 = C13665.f38450;
                    C13370 c13375 = new C13370("compiler", "not.a.functional.intf", abstractC7783);
                    C14040 c14042 = C8300.f21997;
                    c23623.m9352(c19049, new C14040("compiler", "bad.functional.intf.anno.1", c13375));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m38239(C16852 c16852, AbstractC12224 abstractC12224) {
        return abstractC12224 == c16852.f49901.f21647;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38344(C19049 c19049, boolean z) {
        C1446.m31699(c19049.f18925);
        c19049.mo3382(new C8807(this));
        if (!c19049.m16617(EnumC19998.f60707) || c19049.f56840.f18925.mo14812() || m38329(c19049, z)) {
            return;
        }
        AbstractC6462 abstractC6462 = c19049.f18925;
        C14040 c14040 = C8300.f21997;
        this.f49881.m9352(c19049, new C14040("compiler", "annotation.type.not.applicable.to.type", abstractC6462));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38319(C15828 c15828, C17939 c17939, C19049 c19049) {
        AbstractC6462 abstractC6462;
        Set setM38256;
        Set setM38257;
        C8200 c8200;
        AbstractC6462 abstractC6463 = c17939.f29256;
        C22004 c22004 = this.f49894;
        AbstractC6462 abstractC6464 = c22004.f69212;
        AbstractC6462 abstractC6465 = c22004.f69176;
        AbstractC6462 abstractC6466 = c22004.f69156;
        C8374 c8374 = this.f49912;
        C1446.m31704(c8374.m19490(abstractC6463, abstractC6464));
        C4848 c4848 = c17939.f53589;
        boolean zIsEmpty = c4848.isEmpty();
        C8200 c8201 = this.f49901;
        if (zIsEmpty) {
            abstractC6462 = null;
        } else {
            C1446.m31704(((C5771) ((C24293) c4848.f11034).f76952).f20408 == c8201.f21718);
            abstractC6462 = ((C12576) ((C24293) c4848.f11034).f76953).f35337;
        }
        if (abstractC6462 == null) {
            return;
        }
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        AbstractC7783 abstractC7783Mo22458 = abstractC21195.mo17983().mo22458(c8201.f21718, (Predicate) null);
        C23623 c23623 = this.f49881;
        if (abstractC7783Mo22458 != null && abstractC7783Mo22458.f20405 == EnumC3600.f7343) {
            AbstractC6462 abstractC6462Mo14787 = ((C5771) abstractC7783Mo22458).f20406.mo14787();
            if (!abstractC6462Mo14787.m14777(EnumC11353.ARRAY) || !c8374.m19490(((C7251) abstractC6462Mo14787).f18916, c15828.f20406)) {
                C7251 c7251M19418 = c8374.m19418(c15828.f20406);
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC21195, abstractC6462Mo14787, c7251M19418));
            }
        } else {
            C14040 c14041 = C8300.f21997;
            c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC21195));
        }
        AbstractC21195 abstractC21196 = abstractC6462.f16705;
        EnumC24645 enumC24645M19468 = c8374.m19468(abstractC21196);
        EnumC24645 enumC24645M19469 = c8374.m19468((AbstractC21195) c15828);
        int i = C4784.f10851[enumC24645M19469.ordinal()];
        if (i == 1 ? enumC24645M19468 != EnumC24645.RUNTIME : !(i != 2 || enumC24645M19468 != EnumC24645.SOURCE)) {
            String strName = enumC24645M19468.name();
            String strName2 = enumC24645M19469.name();
            C14040 c14042 = C8300.f21997;
            c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.retention", abstractC21196, strName, c15828, strName2));
        }
        AbstractC21195 abstractC21197 = abstractC6462.f16705;
        if (c15828.m17984(abstractC6466.f16705) != null && abstractC21197.m17984(abstractC6466.f16705) == null) {
            C14040 c14043 = C8300.f21997;
            c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.not.documented", abstractC21197, c15828));
        }
        AbstractC21195 abstractC21198 = abstractC6462.f16705;
        if (c15828.m17984(abstractC6465.f16705) != null && abstractC21198.m17984(abstractC6465.f16705) == null) {
            C14040 c14044 = C8300.f21997;
            c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.not.inherited", abstractC21198, c15828));
        }
        AbstractC21195 abstractC21199 = abstractC6462.f16705;
        C3858 c3858M38262 = m38262(abstractC21199);
        if (c3858M38262 == null) {
            setM38256 = m38256();
        } else {
            HashSet hashSet = new HashSet();
            for (AbstractC10564 abstractC10564 : c3858M38262.f8345) {
                if (abstractC10564 instanceof C18610) {
                    hashSet.add(((C18610) abstractC10564).f55580.f20408);
                }
            }
            setM38256 = hashSet;
        }
        C3858 c3858M38263 = m38262((AbstractC21195) c15828);
        if (c3858M38263 == null) {
            setM38257 = m38256();
        } else {
            HashSet hashSet2 = new HashSet();
            for (AbstractC10564 abstractC10565 : c3858M38263.f8345) {
                if (abstractC10565 instanceof C18610) {
                    hashSet2.add(((C18610) abstractC10565).f55580.f20408);
                }
            }
            setM38257 = hashSet2;
        }
        Iterator it = setM38256.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                c8200 = c8201;
                break;
            }
            AbstractC12224 abstractC12224 = (AbstractC12224) it.next();
            Iterator it2 = setM38257.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c8200 = c8201;
                    C14040 c14045 = C8300.f21997;
                    c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.incompatible.target", abstractC21199, c15828));
                    break loop0;
                }
                AbstractC12224 abstractC12225 = (AbstractC12224) it2.next();
                if (abstractC12225 == abstractC12224) {
                    break;
                }
                C8200 c8202 = c8201;
                AbstractC12224 abstractC12226 = c8202.f21639;
                AbstractC12224 abstractC12227 = c8202.f21646;
                if (abstractC12225 == abstractC12226 && abstractC12224 == abstractC12227) {
                    c8201 = c8202;
                    break;
                }
                if (abstractC12225 == c8202.f21643 && (abstractC12224 == abstractC12226 || abstractC12224 == abstractC12227 || abstractC12224 == c8202.f21667)) {
                    c8201 = c8202;
                    break;
                }
                c8201 = c8202;
            }
        }
        AbstractC21195 abstractC211910 = abstractC6462.f16705;
        AbstractC15689 abstractC15689Mo17983 = abstractC211910.mo17983();
        abstractC15689Mo17983.getClass();
        for (AbstractC7783 abstractC7783 : abstractC15689Mo17983.mo22455((Predicate) null, EnumC3620.RECURSIVE)) {
            if (abstractC7783.f20408 != c8200.f21718 && abstractC7783.f20405 == EnumC3600.f7343 && ((C5771) abstractC7783).f14175 == null) {
                C14040 c14046 = C8300.f21997;
                c23623.m9352(c19049, new C14040("compiler", "invalid.repeatable.annotation.elem.nondefault", abstractC211910, abstractC7783));
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private Set m38256() {
        if (this.f49900 == null) {
            AbstractC12224[] abstractC12224ArrM38254 = m38254();
            HashSet hashSet = new HashSet(abstractC12224ArrM38254.length);
            for (AbstractC12224 abstractC12224 : abstractC12224ArrM38254) {
                C12826.requireNonNull(abstractC12224);
                if (!hashSet.add(abstractC12224)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) abstractC12224));
                }
            }
            this.f49900 = C21562.unmodifiableSet(hashSet);
        }
        return this.f49900;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38329(C19049 c19049, final boolean z) {
        C4848 c4848M42756 = this.f49896.m42756(c19049.f56840.f18925.f16705);
        if (c4848M42756 == null) {
            return false;
        }
        return C7480.stream(c4848M42756).anyMatch(new Predicate() { // from class: l.᩸ۗ֨
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
            public /* synthetic */ Predicate m50668or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C16852.m38241(this.f71366, z, (AbstractC10564) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38241(C16852 c16852, boolean z, AbstractC10564 abstractC10564) {
        AbstractC12224 abstractC12224 = ((C18610) abstractC10564).f55580.f20408;
        C8200 c8200 = c16852.f49901;
        if (abstractC12224 != c8200.f21643) {
            return z && abstractC12224 == c8200.f21667;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12224[] m38346(AbstractC21195 abstractC21195) {
        C3858 c3858M38262 = m38262(abstractC21195);
        if (c3858M38262 != null) {
            AbstractC10564[] abstractC10564Arr = c3858M38262.f8345;
            AbstractC12224[] abstractC12224Arr = new AbstractC12224[abstractC10564Arr.length];
            for (int i = 0; i < abstractC10564Arr.length; i++) {
                AbstractC10564 abstractC10564 = abstractC10564Arr[i];
                if (!(abstractC10564 instanceof C18610)) {
                    return new AbstractC12224[0];
                }
                abstractC12224Arr[i] = ((C18610) abstractC10564).f55580.f20408;
            }
            return abstractC12224Arr;
        }
        return m38254();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18189 m38275(C19049 c19049, AbstractC7783 abstractC7783) {
        AbstractC12224[] abstractC12224ArrM38254;
        EnumC3600 enumC3600;
        EnumC3600 enumC3601;
        C16852 c16852 = this;
        C3858 c3858M38262 = c16852.m38262(c19049.f56840.f18925.f16705);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (c3858M38262 != null) {
            AbstractC10564[] abstractC10564Arr = c3858M38262.f8345;
            AbstractC12224[] abstractC12224Arr = new AbstractC12224[abstractC10564Arr.length];
            for (int i2 = 0; i2 < abstractC10564Arr.length; i2++) {
                AbstractC10564 abstractC10564 = abstractC10564Arr[i2];
                if (!(abstractC10564 instanceof C18610)) {
                    return C18189.empty();
                }
                abstractC12224Arr[i2] = ((C18610) abstractC10564).f55580.f20408;
            }
            abstractC12224ArrM38254 = abstractC12224Arr;
        } else {
            abstractC12224ArrM38254 = m38254();
        }
        int length = abstractC12224ArrM38254.length;
        while (i < length) {
            AbstractC12224 abstractC12224 = abstractC12224ArrM38254[i];
            C8200 c8200 = c16852.f49901;
            AbstractC12224 abstractC12225 = c8200.f21639;
            AbstractC12224 abstractC12226 = c8200.f21667;
            AbstractC12224 abstractC12227 = c8200.f21643;
            AbstractC12224 abstractC12228 = c8200.f21646;
            AbstractC12224 abstractC12229 = c8200.f21680;
            AbstractC12224 abstractC122210 = c8200.f21747;
            AbstractC12224 abstractC122211 = c8200.f21708;
            AbstractC12224 abstractC122212 = c8200.f21743;
            AbstractC12224 abstractC122213 = c8200.f21647;
            if (abstractC12224 == abstractC12225) {
                if (abstractC7783.f20405 == EnumC3600.f7354) {
                    hashSet.add(abstractC12225);
                }
            } else {
                AbstractC12224 abstractC122214 = c8200.f21666;
                if (abstractC12224 == abstractC122214) {
                    if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7783.f20407.f20405 != EnumC3600.f7343) {
                        hashSet.add(abstractC122214);
                    }
                } else if (abstractC12224 == abstractC122213) {
                    if (abstractC7783.mo3347() == EnumC24473.RECORD_COMPONENT) {
                        hashSet.add(abstractC122213);
                    }
                } else if (abstractC12224 == abstractC122212) {
                    if (abstractC7783.f20405 == EnumC3600.f7343 && !abstractC7783.m17994()) {
                        hashSet.add(abstractC122212);
                    }
                } else if (abstractC12224 == abstractC122211) {
                    if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7783.f20407.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & 8589934592L) != 0) {
                        hashSet.add(abstractC122211);
                    }
                } else if (abstractC12224 == abstractC122210) {
                    if (abstractC7783.f20405 == EnumC3600.f7343 && abstractC7783.m17994()) {
                        hashSet.add(abstractC122210);
                    }
                } else if (abstractC12224 == abstractC12229) {
                    if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7783.f20407.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & 8589934592L) == 0) {
                        hashSet.add(abstractC12229);
                    }
                } else if (abstractC12224 == abstractC12228) {
                    if (abstractC7783.f20405 == EnumC3600.f7354 && (abstractC7783.mo18003() & 8192) != 0) {
                        hashSet.add(abstractC12228);
                    }
                } else {
                    AbstractC12224 abstractC122215 = c8200.f21759;
                    if (abstractC12224 == abstractC122215) {
                        if (abstractC7783.f20405 == EnumC3600.f7351) {
                            hashSet.add(abstractC122215);
                        }
                    } else if (abstractC12224 == abstractC12227) {
                        EnumC3600 enumC3602 = abstractC7783.f20405;
                        EnumC3600 enumC3603 = EnumC3600.f7339;
                        if ((enumC3602 != enumC3603 || abstractC7783.f20407.f20405 != EnumC3600.f7343 || !abstractC7783.f20406.m14777(EnumC11353.NONE)) && ((enumC3600 = abstractC7783.f20405) == EnumC3600.f7354 || enumC3600 == enumC3603 || ((enumC3600 == (enumC3601 = EnumC3600.f7343) && !abstractC7783.m17994() && !abstractC7783.f20406.mo14787().m14777(EnumC11353.VOID)) || (abstractC7783.f20405 == enumC3601 && abstractC7783.m17994())))) {
                            hashSet.add(abstractC12227);
                        }
                    } else if (abstractC12224 == abstractC12226) {
                        if (abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.f20406.m14777(EnumC11353.TYPEVAR)) {
                            hashSet.add(abstractC12226);
                        }
                    } else {
                        AbstractC12224 abstractC122216 = c8200.f21662;
                        if (abstractC12224 == abstractC122216) {
                            if (abstractC7783.f20405 == EnumC3600.f7340) {
                                hashSet.add(abstractC122216);
                            }
                        } else {
                            return C18189.empty();
                        }
                    }
                }
            }
            i++;
            c16852 = this;
        }
        return C18189.m41402of(hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3858 m38262(AbstractC21195 abstractC21195) {
        C17939 c17939Mo38742 = abstractC21195.mo35948().mo38742();
        if (c17939Mo38742 == null) {
            return null;
        }
        AbstractC10564 abstractC10564M40797 = c17939Mo38742.m40797(this.f49901.f21718);
        if (abstractC10564M40797 instanceof C3858) {
            return (C3858) abstractC10564M40797;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    private AbstractC12224[] m38254() {
        if (this.f49893 == null) {
            ArrayList arrayList = new ArrayList();
            C8200 c8200 = this.f49901;
            arrayList.add(c8200.f21759);
            arrayList.add(c8200.f21639);
            arrayList.add(c8200.f21666);
            arrayList.add(c8200.f21743);
            arrayList.add(c8200.f21747);
            arrayList.add(c8200.f21646);
            arrayList.add(c8200.f21680);
            arrayList.add(c8200.f21708);
            if (this.f49895) {
                arrayList.add(c8200.f21647);
            }
            if (this.f49882) {
                arrayList.add(c8200.f21662);
            }
            this.f49893 = (AbstractC12224[]) arrayList.toArray(new AbstractC12224[0]);
        }
        return this.f49893;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38328(C19049 c19049) {
        C23623 c23623 = this.f49881;
        C10212 c10212 = new C10212(c23623);
        try {
            return m38248(c19049);
        } finally {
            c23623.m52452(c10212);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX INFO: renamed from: ۧ */
    public boolean m38248(C19049 c19049) {
        C23623 c23623;
        boolean z;
        C14040 c14040;
        C23147 c23147Mo35948 = c19049.f56840.f18925.f16705.mo35948();
        LinkedHashSet<C5771> linkedHashSetMo38739 = c23147Mo35948.mo38739();
        Iterator it = c19049.f56843.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c23623 = this.f49881;
            if (!zHasNext) {
                break;
            }
            AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
            if (abstractC7257.m16617(EnumC19998.f60746)) {
                C22403 c22403 = (C22403) abstractC7257;
                AbstractC7783 abstractC7783M21438 = C9268.m21438(c22403.f70670);
                if (abstractC7783M21438 != null && !abstractC7783M21438.f20406.mo14812() && !linkedHashSetMo38739.remove(abstractC7783M21438)) {
                    AbstractC14355 abstractC14355 = c22403.f70670;
                    abstractC14355.getClass();
                    AbstractC12224 abstractC12224 = abstractC7783M21438.f20408;
                    AbstractC6462 abstractC6462 = c19049.f18925;
                    C14040 c14041 = C8300.f21997;
                    c23623.m9352(abstractC14355, new C14040("compiler", "duplicate.annotation.member.value", abstractC12224, abstractC6462));
                    z2 = false;
                }
            }
        }
        C4848 c4848M10283 = C4848.m10283();
        LinkedHashSet linkedHashSetMo38740 = c23147Mo35948.mo38740();
        for (C5771 c5771 : linkedHashSetMo38739) {
            if (!c5771.f20406.mo14812() && !linkedHashSetMo38740.contains(c5771)) {
                c4848M10283 = c4848M10283.m10286(c5771.f20408);
            }
        }
        C4848 c4848M10294 = c4848M10283.m10294();
        if (c4848M10294.m10293()) {
            if (c4848M10294.m10289() > 1) {
                AbstractC6462 abstractC6463 = c19049.f18925;
                C14040 c14042 = C8300.f21997;
                c14040 = new C14040("compiler", "annotation.missing.default.value.1", abstractC6463, c4848M10294);
            } else {
                AbstractC6462 abstractC6464 = c19049.f18925;
                C14040 c14043 = C8300.f21997;
                c14040 = new C14040("compiler", "annotation.missing.default.value", abstractC6464, c4848M10294);
            }
            c23623.m9352(c19049, c14040);
            z2 = false;
        }
        if (z2) {
            if (c19049.f56840.f18925.f16705 == this.f49894.f69133.f16705) {
                C4848 c4848 = c19049.f56843;
                if (c4848.f11035 == null) {
                    z = true;
                } else if (((AbstractC14355) c4848.f11034).m16617(EnumC19998.f60746)) {
                    C22403 c22404 = (C22403) c19049.f56843.f11034;
                    if (C9268.m21438(c22404.f70670).f20408 != this.f49901.f21718) {
                        z = false;
                    } else {
                        AbstractC14355 abstractC14356 = c22404.f70671;
                        if (abstractC14356.m16617(EnumC19998.f60741)) {
                            HashSet hashSet = new HashSet();
                            boolean z3 = true;
                            for (AbstractC7257 abstractC7258 : ((C19859) abstractC14356).f60359) {
                                if (!hashSet.add(C9268.m21438(abstractC7258))) {
                                    abstractC7258.getClass();
                                    c23623.m9352(abstractC7258, C8300.f22122);
                                    z3 = false;
                                }
                            }
                            z = z3;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38305(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257) {
        C6953 c6953 = this.f49880;
        EnumC21706 enumC21706 = EnumC21706.DEP_ANN;
        boolean zM15935 = c6953.m15935(enumC21706);
        C23623 c23623 = this.f49881;
        C22004 c22004 = this.f49894;
        if (zM15935 && abstractC7783.m18021() && (abstractC7783.mo18003() & 131072) != 0 && !c22004.f69130.mo14812() && abstractC7783.m17984(c22004.f69130.f16705) == null) {
            c23623.m9365(enumC21706, abstractC7257, C15675.f45428);
        }
        C6953 c6954 = this.f49880;
        EnumC21706 enumC21707 = EnumC21706.DEPRECATION;
        if (!c6954.m15935(enumC21707) || abstractC7783.m18021() || c22004.f69130.mo14812() || abstractC7783.m17984(c22004.f69130.f16705) == null) {
            return;
        }
        EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783);
        C12895 c12895 = C15675.f45417;
        c23623.m9365(enumC21707, abstractC7257, new C12895("compiler", "deprecated.annotation.has.no.effect", enumC10306M51425));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38223(C16852 c16852, Supplier supplier, AbstractC7783 abstractC7783) {
        InterfaceC5323 interfaceC5323 = (InterfaceC5323) supplier.get();
        C6859 c6859 = c16852.f49909;
        C6859 c68510 = c16852.f49886;
        if ((abstractC7783.f20409 & 36028797018963968L) != 0) {
            if (c16852.f49880.m15936(EnumC21706.REMOVAL)) {
                return;
            }
            if (abstractC7783.f20405 == EnumC3600.f7340) {
                C12895 c12895 = C15675.f45417;
                c68510.m15720(interfaceC5323, new C12895("compiler", "has.been.deprecated.for.removal.module", abstractC7783));
                return;
            } else {
                AbstractC7783 abstractC7783M17991 = abstractC7783.m17991();
                C12895 c12896 = C15675.f45417;
                c68510.m15720(interfaceC5323, new C12895("compiler", "has.been.deprecated.for.removal", abstractC7783, abstractC7783M17991));
                return;
            }
        }
        if (c16852.f49880.m15936(EnumC21706.DEPRECATION)) {
            return;
        }
        if (abstractC7783.f20405 == EnumC3600.f7340) {
            C12895 c12897 = C15675.f45417;
            c6859.m15720(interfaceC5323, new C12895("compiler", "has.been.deprecated.module", abstractC7783));
        } else {
            AbstractC7783 abstractC7783M17992 = abstractC7783.m17991();
            C12895 c12898 = C15675.f45417;
            c6859.m15720(interfaceC5323, new C12895("compiler", "has.been.deprecated", abstractC7783, abstractC7783M17992));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38353(final AbstractC7783 abstractC7783, final AbstractC7257 abstractC7257) {
        if ((abstractC7783.mo18003() & 274877906944L) != 0) {
            this.f49889.m44732(new InterfaceC18352() { // from class: l.ܿ۬֨
                @Override // p067l.InterfaceC18352
                /* JADX INFO: renamed from: ֫ */
                public final void mo8280() {
                    C16852.m38225(this.f56347, abstractC7257, abstractC7783);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38225(C16852 c16852, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783) {
        C23623 c23623 = c16852.f49881;
        C12895 c12895 = C15675.f45417;
        c23623.m9351(interfaceC5323, new C12895("compiler", "sun.proprietary", abstractC7783));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38341(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257) {
        EnumC8045 enumC8045 = EnumC8045.f21174;
        EnumC8045 enumC8046 = this.f49908;
        if (enumC8046 == enumC8045 || (abstractC7783.mo18003() & 35184372088832L) == 0) {
            return;
        }
        C14040 c14040 = C8300.f21997;
        this.f49881.m9352(abstractC7257, new C14040("compiler", "not.in.profile", abstractC7783, enumC8046));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38288(final InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, final AbstractC7783 abstractC7784) {
        long jMo18003 = abstractC7784.mo18003() & 72057594037927936L;
        C24387 c24387 = this.f49911;
        if (jMo18003 != 0 && abstractC7784.m18008().f27063 != abstractC7783.m18008().f27063) {
            long jMo18004 = abstractC7784.mo18003() & 288230376151711744L;
            C19694 c19694 = this.f49889;
            if (jMo18004 == 0) {
                if (!c24387.m53743()) {
                    C14040 c14040 = C8300.f21997;
                    this.f49881.m9352(interfaceC5323, new C14040("compiler", "is.preview", abstractC7784));
                } else {
                    c24387.m53745();
                    c19694.m44732(new InterfaceC18352() { // from class: l.֫۬֨
                        @Override // p067l.InterfaceC18352
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo8280() {
                            C12895 c12895 = C15675.f45417;
                            this.f9060.m38291(interfaceC5323, new C12895("compiler", "is.preview", abstractC7784));
                        }
                    });
                }
            } else {
                c19694.m44732(new InterfaceC18352() { // from class: l.ۧ۬֨
                    @Override // p067l.InterfaceC18352
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo8280() {
                        C12895 c12895 = C15675.f45417;
                        this.f36110.m38291(interfaceC5323, new C12895("compiler", "is.preview.reflective", abstractC7784));
                    }
                });
            }
        }
        c24387.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38310(C10471 c10471, AbstractC6462 abstractC6462) {
        int i = C4784.f10856[abstractC6462.mo5577().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m38310(c10471, this.f49912.m19455(abstractC6462));
            return;
        }
        if ((abstractC6462.f16705.mo18003() & 8192) != 0) {
            AbstractC21195 abstractC21195 = abstractC6462.f16705;
            long j = abstractC21195.f20409;
            if ((j & 34359738368L) != 0) {
                return;
            }
            if ((j & 134217728) != 0) {
                C14040 c14040 = C8300.f21997;
                this.f49881.m9352(c10471, new C14040("compiler", "cyclic.annotation.element", abstractC21195));
                return;
            }
            try {
                abstractC21195.f20409 = j | 134217728;
                for (AbstractC7783 abstractC7783 : abstractC21195.mo17983().mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
                    if (abstractC7783.f20405 == EnumC3600.f7343) {
                        m38310(c10471, ((C5771) abstractC7783).f20406.mo14787());
                    }
                }
                abstractC21195.f20409 = (abstractC21195.f20409 & (-134217729)) | 34359738368L;
            } catch (Throwable th) {
                abstractC21195.f20409 = (abstractC21195.f20409 & (-134217729)) | 34359738368L;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38302(C7650 c7650) {
        HashMap map = new HashMap();
        for (C4848 c4848 = c7650.f20020; c4848.m10293(); c4848 = c4848.f11035) {
            C17175 c17175M21432 = C9268.m21432((AbstractC7257) c4848.f11034);
            if (c17175M21432 != null) {
                C10471 c10471 = (C10471) c4848.f11034;
                if (C9268.m21428(c17175M21432.f51143) == this.f49901.f21744) {
                    map.put(c10471.f28960, C9268.m21438(c17175M21432.f51143));
                } else {
                    c10471.f28960.f20409 |= 1073741824;
                }
            }
        }
        for (AbstractC7783 abstractC7783 : (AbstractC7783[]) map.keySet().toArray(new AbstractC7783[0])) {
            m38220(c7650, abstractC7783, map);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38220(C7650 c7650, AbstractC7783 abstractC7783, HashMap map) {
        if (abstractC7783 != null) {
            long j = abstractC7783.f20409;
            if ((j & 1073741824) == 0) {
                if ((j & 134217728) != 0) {
                    this.f49881.m9352(C9268.m21405(abstractC7783, c7650, false), C8300.f22128);
                } else {
                    abstractC7783.f20409 = j | 134217728;
                    m38220(c7650, (AbstractC7783) map.remove(abstractC7783), map);
                    abstractC7783.f20409 &= -134217729;
                }
                abstractC7783.f20409 |= 1073741824;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38286(final InterfaceC5323 interfaceC5323, C3088 c3088, AbstractC6462 abstractC6462) {
        if (abstractC6462.mo14779() != null && abstractC6462.mo5577().m26309(EnumC11353.LONG) && ((Number) abstractC6462.mo14779()).longValue() == 0) {
            int i = c3088.f5586;
            if (i == 108 || i == 112 || i == 109 || i == 113) {
                this.f49889.m44732(new InterfaceC18352() { // from class: l.۟ۗ֨
                    @Override // p067l.InterfaceC18352
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo8280() {
                        C16852.m38224(this.f24911, interfaceC5323);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38279(C3765 c3765) {
        if (c3765.f7999.m16617(EnumC19998.f60764) && c3765.f8000 == null) {
            C6953 c6953 = this.f49880;
            EnumC21706 enumC21706 = EnumC21706.EMPTY;
            if (c6953.m15935(enumC21706)) {
                AbstractC13154 abstractC13154 = c3765.f7999;
                abstractC13154.getClass();
                this.f49881.m9365(enumC21706, abstractC13154, C15675.f45426);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38323(InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC15689 abstractC15689) {
        EnumC3600 enumC3600;
        if (!abstractC7783.f20406.mo14812()) {
            AbstractC12224 abstractC12224 = abstractC7783.f20407.f20408;
            C8200 c8200 = this.f49901;
            if (abstractC12224 != c8200.f21706) {
                for (AbstractC7783 abstractC7784 : abstractC15689.mo22457(abstractC7783.f20408, null, EnumC3620.NON_RECURSIVE)) {
                    if (abstractC7783 != abstractC7784 && (abstractC7784.mo18003() & 4398046511104L) == 0 && (enumC3600 = abstractC7783.f20405) == abstractC7784.f20405 && abstractC7783.f20408 != c8200.f21713) {
                        EnumC3600 enumC3601 = EnumC3600.f7343;
                        C8374 c8374 = this.f49912;
                        if (enumC3600 != enumC3601 || c8374.m19446(abstractC7783.f20406, abstractC7784.f20406, true) || c8374.m19446(c8374.m19459(abstractC7783.f20406), c8374.m19459(abstractC7784.f20406), true)) {
                            long jMo18003 = abstractC7783.mo18003() & 17179869184L;
                            long jMo18004 = abstractC7784.mo18003() & 17179869184L;
                            C23623 c23623 = this.f49881;
                            if (jMo18003 != jMo18004) {
                                abstractC7783.f20409 = 4398046511104L | abstractC7783.f20409;
                                if (abstractC7783.f20406.mo14812() || abstractC7784.f20406.mo14812()) {
                                    break;
                                    break;
                                }
                                AbstractC7783 abstractC7783M17991 = abstractC7784.m17991();
                                C14040 c14040 = C8300.f21997;
                                c23623.m9352(interfaceC5323, new C14040("compiler", "array.and.varargs", abstractC7783, abstractC7784, abstractC7783M17991));
                                return true;
                            }
                            if (abstractC7783.f20405 == enumC3601 && !c8374.m19446(abstractC7783.f20406, abstractC7784.f20406, false)) {
                                if (!abstractC7783.f20406.mo14812() && !abstractC7784.f20406.mo14812()) {
                                    C14040 c14041 = C8300.f21997;
                                    c23623.m9352(interfaceC5323, new C14040("compiler", "name.clash.same.erasure", abstractC7783, abstractC7784));
                                }
                                abstractC7783.f20409 |= 4398046511104L;
                                return true;
                            }
                            if ((abstractC7783.mo18003() & 576460752303423488L) != 0 && (abstractC7784.mo18003() & 576460752303423488L) != 0 && (abstractC7784.mo18003() & 1152921504606846976L) == 0) {
                                if (!abstractC7783.f20406.mo14812()) {
                                    c23623.m9352(interfaceC5323, C8300.f22091);
                                    abstractC7783.f20409 |= 4398046511104L;
                                }
                            } else {
                                m38287(interfaceC5323, abstractC7784);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38350(C3626 c3626) {
        C12483 c12483;
        AbstractC9655 abstractC9655;
        AbstractC15689 abstractC15689M35727 = AbstractC15689.m35727(c3626.f7517);
        AbstractC15689 abstractC15689M35728 = AbstractC15689.m35727(c3626.f7517);
        AbstractC9655 abstractC9656 = c3626.f7508;
        for (AbstractC7257 abstractC7257 : c3626.f7509) {
            if (abstractC7257.m16617(EnumC19998.f60715) && (abstractC9655 = (c12483 = (C12483) abstractC7257).f34990) != null) {
                for (AbstractC7783 abstractC7783 : abstractC9655.mo22455(new C23286(), EnumC3620.RECURSIVE)) {
                    if (c12483.f34991) {
                        m38221(c12483, abstractC15689M35727, abstractC15689M35728, abstractC9656, abstractC7783, true);
                        abstractC15689M35728.mo28415(abstractC7783);
                    } else {
                        m38221(c12483, abstractC15689M35727, abstractC15689M35728, abstractC9656, abstractC7783, false);
                        abstractC15689M35727.mo28415(abstractC7783);
                    }
                }
                c12483.f34990 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38221(C12483 c12483, AbstractC9655 abstractC9655, AbstractC9655 abstractC9656, AbstractC9655 abstractC9657, AbstractC7783 abstractC7783, boolean z) {
        C15637 c15637 = new C15637(1, abstractC7783);
        AbstractC7783 abstractC7783Mo22458 = abstractC9655.mo22458(abstractC7783.f20408, c15637);
        AbstractC7783 abstractC7783Mo22459 = (abstractC7783Mo22458 != null || z) ? null : abstractC9656.mo22458(abstractC7783.f20408, c15637);
        C23623 c23623 = this.f49881;
        if (abstractC7783Mo22458 == null && abstractC7783Mo22459 == null) {
            AbstractC7783 abstractC7783Mo224510 = abstractC9657.mo22458(abstractC7783.f20408, c15637);
            if (abstractC7783Mo224510 != null) {
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c12483, new C14040("compiler", "already.defined.this.unit", abstractC7783Mo224510));
                return;
            }
            return;
        }
        if (abstractC7783Mo22458 != null) {
            C14040 c14041 = C8300.f21997;
            c23623.m9352(c12483, new C14040("compiler", "already.defined.single.import", abstractC7783Mo22458));
        } else {
            C14040 c14042 = C8300.f21997;
            c23623.m9352(c12483, new C14040("compiler", "already.defined.static.single.import", abstractC7783Mo22459));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38295(AbstractC7257 abstractC7257) {
        AbstractC7257 abstractC7258 = abstractC7257;
        while (abstractC7258.m16617(EnumC19998.f60805)) {
            C8320 c8320 = (C8320) abstractC7258;
            if (c8320.f22260.f20407.mo17995() != C9268.m21438(c8320.f22261).mo17995()) {
                abstractC7257.getClass();
                AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC7257);
                C14040 c14040 = C8300.f21997;
                this.f49881.m9352(abstractC7257, new C14040("compiler", "import.requires.canonical", abstractC7783M21438));
                return;
            }
            abstractC7258 = c8320.f22261;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38297(AbstractC7257 abstractC7257, C4036 c4036, C15828 c15828) {
        if (this.f49880.m15935(EnumC21706.AUXILIARYCLASS)) {
            c15828.mo18020();
            if ((c15828.f20409 & 17592186044416L) == 0 || !this.f49884.m52670(c4036, (AbstractC21195) c15828, false) || this.f49885.mo4110(c15828.f45858, c4036.f8851.f7516)) {
                return;
            }
            InterfaceC19740 interfaceC19740 = c15828.f45858;
            C12895 c12895 = C15675.f45417;
            this.f49881.m9364(abstractC7257, new C12895("compiler", "auxiliary.class.accessed.from.outside.of.its.source.file", c15828, interfaceC19740));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38343(final C15828 c15828, final InterfaceC5323 interfaceC5323) {
        if (this.f49880.m15935(EnumC21706.MISSING_EXPLICIT_CTOR)) {
            c15828.mo18020();
            if ((c15828.f20409 & 2305843009213710336L) != 0 || c15828.f20408.isEmpty()) {
                return;
            }
            c15828.mo18020();
            if ((c15828.f20409 & 5) == 0 || !EnumC12477.f34980.m28726(this.f49898)) {
                return;
            }
            int i = C4784.f10853[c15828.m35944().ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i == 4) {
                for (AbstractC7783 abstractC7783 = c15828.f20407; abstractC7783 != null && abstractC7783.f20405 == EnumC3600.f7354; abstractC7783 = abstractC7783.f20407) {
                    if ((abstractC7783.mo18003() & 5) == 0) {
                        return;
                    }
                }
            }
            final C9794 c9794M18008 = c15828.m18008();
            if (c9794M18008.m22845()) {
                return;
            }
            final C2417 c2417 = c9794M18008.f27063;
            for (C19023 c19023 : c2417.f3697) {
                if (c19023.f56714.equals(c9794M18008)) {
                    C4848 c4848 = c19023.f56713;
                    if (c4848 != null && !c4848.isEmpty()) {
                        return;
                    }
                    this.f49889.m44732(new InterfaceC18352() { // from class: l.ܰۗ֨
                        @Override // p067l.InterfaceC18352
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo8280() {
                            C16852.m38227(this.f43488, interfaceC5323, c15828, c9794M18008, c2417);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38227(C16852 c16852, InterfaceC5323 interfaceC5323, C15828 c15828, C9794 c9794, C2417 c2417) {
        C6953 c6953 = c16852.f49880;
        EnumC21706 enumC21706 = EnumC21706.MISSING_EXPLICIT_CTOR;
        if (c6953.m15935(enumC21706)) {
            C23623 c23623 = c16852.f49881;
            C12895 c12895 = C15675.f45417;
            c23623.m9365(enumC21706, interfaceC5323, new C12895("compiler", "missing-explicit-ctor", c15828, c9794, c2417));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m38266(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C20878 c20878 = new C20878(this, interfaceC5323, "unchecked.cast.to.type", abstractC6462, abstractC6463);
        C8374 c8374 = this.f49912;
        if (c8374.m19485(abstractC6462, abstractC6463, c20878)) {
            return abstractC6463;
        }
        ((C24900) this.f49905).mo3480(interfaceC5323, this.f49892.m18543(C13665.m31063(abstractC6462, abstractC6463)));
        return c8374.m19475(abstractC6462);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, l.ۚ᩵۠] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۗ۠۠] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [l.ۖ֨۠, l.᩹ܶ۠] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final void m38303(C7650 c7650, C15828 c15828) {
        C22004 c22004 = this.f49894;
        if (c15828.m17984(c22004.f69149.f16705) != null) {
            try {
                this.f49912.m19433((AbstractC21195) c15828);
            } catch (C8194 e) {
                c7650.getClass();
                for (C19049 c19049 : c7650.f20022.f9953) {
                    if (c19049.f56840.f18925.f16705 == c22004.f69149.f16705) {
                        c7650 = c19049;
                        break;
                    }
                }
                C18258 c18258M18981 = e.m18981();
                C14040 c14040 = C8300.f21997;
                this.f49881.m9352(c7650, new C14040("compiler", "bad.functional.intf.anno.1", c18258M18981));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38337(C3626 c3626) {
        AbstractC7783 abstractC7783M21438;
        for (C12483 c12483 : c3626.m6849()) {
            if (c12483.f34991 && c12483.f34992.m16617(EnumC19998.f60805)) {
                C8320 c8320 = (C8320) c12483.f34992;
                if (c8320.f22259 != this.f49901.f21693 && (abstractC7783M21438 = C9268.m21438(c8320.f22261)) != null && abstractC7783M21438.f20405 == EnumC3600.f7354) {
                    AbstractC21195 abstractC21195 = (AbstractC21195) C9268.m21438(c8320.f22261);
                    if (!m38242(abstractC21195, abstractC21195, c3626.f7517, c8320.f22259, new HashSet())) {
                        AbstractC12224 abstractC12224 = c8320.f22259;
                        EnumC10306 enumC10306M51425 = C23047.m51425(abstractC21195);
                        C13370 c13370 = C13665.f38450;
                        C13370 c13371 = new C13370("compiler", "location", enumC10306M51425, abstractC21195, null);
                        C14040 c14040 = C8300.f21997;
                        this.f49881.m9352(c12483, new C14040("compiler", "cant.resolve.location", EnumC10306.STATIC, abstractC12224, null, null, c13371));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38278(C3626 c3626) {
        for (C12483 c12483 : c3626.m6849()) {
            if (!c12483.f34991 && C9268.m21428(c12483.f34992) == this.f49901.f21693) {
                AbstractC21195 abstractC21195 = ((C8320) c12483.f34992).f22261.f18925.f16705;
                if (abstractC21195.f20405 == EnumC3600.f7351 && abstractC21195.mo17983().m22460() && (!EnumC12477.f34974.m28726(this.f49898) || !abstractC21195.mo17485())) {
                    EnumC21417 enumC21417 = EnumC21417.RESOLVE_ERROR;
                    int i = c12483.f18924;
                    C14040 c14040 = C8300.f21997;
                    this.f49881.m9358(enumC21417, i, new C14040("compiler", "doesnt.exist", abstractC21195));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m38242(AbstractC21195 abstractC21195, AbstractC21195 abstractC21196, C9794 c9794, AbstractC12224 abstractC12224, HashSet hashSet) {
        if (abstractC21195 == null || !hashSet.add(abstractC21195)) {
            return false;
        }
        AbstractC6462 abstractC6462 = abstractC21195.f20406;
        C8374 c8374 = this.f49912;
        if (m38242(c8374.m19502(abstractC6462).f16705, abstractC21196, c9794, abstractC12224, hashSet)) {
            return true;
        }
        Iterator it = c8374.m19450(abstractC21195.f20406).iterator();
        while (it.hasNext()) {
            if (m38242(((AbstractC6462) it.next()).f16705, abstractC21196, c9794, abstractC12224, hashSet)) {
                return true;
            }
        }
        for (AbstractC7783 abstractC7783 : abstractC21195.mo17983().m22456(abstractC12224)) {
            if (abstractC7783.mo17483() && m38236(abstractC7783, c9794) && abstractC7783.m17986(abstractC21196, c8374)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38236(AbstractC7783 abstractC7783, C9794 c9794) {
        try {
            int iMo18003 = (int) (abstractC7783.mo18003() & 7);
            if (iMo18003 != 0) {
                if (iMo18003 == 2) {
                    return false;
                }
                if (iMo18003 != 4) {
                    return true;
                }
            }
            return abstractC7783.m18008() == c9794;
        } catch (C22635 e) {
            throw e;
        } catch (C21865 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38280(C4036 c4036, C7650 c7650) {
        C19023 c19023M38216;
        C3626 c3626 = c4036.f8851;
        C2417 c2417 = c3626.f7510;
        C22004 c22004 = this.f49894;
        if (c2417 == c22004.f69129 || c2417 == c22004.f69147) {
            return;
        }
        C15828 c15828 = c7650.f20027;
        c15828.mo18020();
        if ((c15828.f20409 & 16777216) == 0 && (c19023M38216 = m38216(c3626.f7517)) != null && c19023M38216.f56713 == null) {
            new C17523(this, c4036, c7650, c3626).mo3617(c7650);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19023 m38216(C9794 c9794) {
        for (C19023 c19023 : c9794.f27063.f3697) {
            if (c19023.f56714 == c9794) {
                return c19023;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38235(AbstractC7783 abstractC7783) {
        while (abstractC7783.f20405 != EnumC3600.f7351) {
            if ((abstractC7783.mo18003() & 1) == 0 && (abstractC7783.mo18003() & 4) == 0) {
                return false;
            }
            abstractC7783 = abstractC7783.f20407;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38232(C16852 c16852, AbstractC14355 abstractC14355, AbstractC7783 abstractC7783, C9794 c9794, boolean z) {
        C4848 c4848;
        C23623 c23623 = c16852.f49881;
        if (!m38235(abstractC7783) && !z) {
            EnumC21706 enumC21706 = EnumC21706.EXPORTS;
            EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783);
            C2417 c2417 = abstractC7783.m18008().f27063;
            C12895 c12895 = C15675.f45417;
            c23623.m9365(enumC21706, abstractC14355, new C12895("compiler", "leaks.not.accessible", enumC10306M51425, abstractC7783, c2417));
            return;
        }
        C9794 c9794M18008 = abstractC7783.m18008();
        C19023 c19023M38216 = m38216(c9794M18008);
        C19023 c19023M38217 = m38216(c9794);
        if (c19023M38216 == null) {
            EnumC21706 enumC21707 = EnumC21706.EXPORTS;
            EnumC10306 enumC10306M51426 = C23047.m51425(abstractC7783);
            C2417 c2418 = abstractC7783.m18008().f27063;
            C12895 c12896 = C15675.f45417;
            c23623.m9365(enumC21707, abstractC14355, new C12895("compiler", "leaks.not.accessible.unexported", enumC10306M51426, abstractC7783, c2418));
            return;
        }
        C4848 c4849 = c19023M38216.f56713;
        if (c4849 != null && ((c4848 = c19023M38217.f56713) == null || !c4849.containsAll(c4848))) {
            EnumC21706 enumC21708 = EnumC21706.EXPORTS;
            EnumC10306 enumC10306M51427 = C23047.m51425(abstractC7783);
            C2417 c2419 = abstractC7783.m18008().f27063;
            C12895 c12897 = C15675.f45417;
            c23623.m9365(enumC21708, abstractC14355, new C12895("compiler", "leaks.not.accessible.unexported.qualified", enumC10306M51427, abstractC7783, c2419));
        }
        C2417 c24110 = c9794M18008.f27063;
        C2417 c24111 = c9794.f27063;
        if (c24110 == c24111 || c24110 == c16852.f49894.f69191) {
            return;
        }
        C4848 c4848M10276of = C4848.m10276of((Object) c24111);
        while (c4848M10276of.m10293()) {
            C2417 c24112 = (C2417) c4848M10276of.f11034;
            c4848M10276of = c4848M10276of.f11035;
            if (c24112 == c9794M18008.f27063) {
                return;
            }
            if ((c24112.f20409 & 4503599627370496L) == 0) {
                for (C11648 c11648 : c24112.f3705) {
                    if (c11648.f32493.contains(EnumC10977.TRANSITIVE)) {
                        c4848M10276of = c4848M10276of.m10290(c11648.f32494);
                    }
                }
            }
        }
        EnumC21706 enumC21709 = EnumC21706.EXPORTS;
        EnumC10306 enumC10306M51428 = C23047.m51425(abstractC7783);
        C2417 c24113 = abstractC7783.m18008().f27063;
        C12895 c12898 = C15675.f45417;
        c23623.m9365(enumC21709, abstractC14355, new C12895("compiler", "leaks.not.accessible.not.required.transitive", enumC10306M51428, abstractC7783, c24113));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38314(final AbstractC14355 abstractC14355, final C2417 c2417) {
        if (c2417.f20405 != EnumC3600.f7340) {
            this.f49889.m44732(new InterfaceC18352() { // from class: l.ۨۗ֨
                @Override // p067l.InterfaceC18352
                /* JADX INFO: renamed from: ֫ */
                public final void mo8280() {
                    C16852.m38231(this.f37170, abstractC14355, c2417);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38231(C16852 c16852, AbstractC14355 abstractC14355, C2417 c2417) {
        C6953 c6953 = c16852.f49880;
        EnumC21706 enumC21706 = EnumC21706.MODULE;
        if (c6953.m15935(enumC21706)) {
            C23623 c23623 = c16852.f49881;
            C12895 c12895 = C15675.f45417;
            c23623.m9365(enumC21706, abstractC14355, new C12895("compiler", "module.not.found", c2417));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38226(C16852 c16852, InterfaceC5323 interfaceC5323, C9794 c9794) {
        if (c16852.f49880.m15935(EnumC21706.OPENS)) {
            C23623 c23623 = c16852.f49881;
            C12895 c12895 = C15675.f45417;
            c23623.m9364(interfaceC5323, new C12895("compiler", "package.empty.or.not.found", c9794));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38290(final InterfaceC5323 interfaceC5323, final C11648 c11648) {
        if ((c11648.f32494.f20409 & 4503599627370496L) != 0) {
            this.f49889.m44732(new InterfaceC18352() { // from class: l.ۤۗ֨
                @Override // p067l.InterfaceC18352
                /* JADX INFO: renamed from: ֫ */
                public final void mo8280() {
                    C16852.m38230(this.f33125, c11648, interfaceC5323);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38230(C16852 c16852, C11648 c11648, InterfaceC5323 interfaceC5323) {
        C23623 c23623 = c16852.f49881;
        if (c11648.f32493.contains(EnumC10977.TRANSITIVE) && c16852.f49880.m15935(EnumC21706.REQUIRES_TRANSITIVE_AUTOMATIC)) {
            c23623.m9364(interfaceC5323, C15675.f45422);
        } else if (c16852.f49880.m15935(EnumC21706.REQUIRES_AUTOMATIC)) {
            c23623.m9364(interfaceC5323, C15675.f45416);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38282(C4848 c4848) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean zM16617 = false;
        boolean z5 = false;
        while (c4848.m10293()) {
            C20391 c20391 = (C20391) c4848.f11034;
            for (AbstractC21062 abstractC21062 : c20391.f63044) {
                boolean zMo32948 = abstractC21062.mo32948();
                C23623 c23623 = this.f49881;
                if (zMo32948) {
                    if (C9268.m21395((AbstractC14355) abstractC21062)) {
                        if (z4 && !zM16617 && !z5) {
                            c23623.m9352(abstractC21062, C8300.f21993);
                        }
                        z3 = true;
                    } else {
                        if (z4 && !z5) {
                            c23623.m9352(abstractC21062, C8300.f21993);
                        }
                        z = true;
                    }
                } else if (abstractC21062.m16617(EnumC19998.f60740)) {
                    if (z4 && !z5) {
                        c23623.m9352(abstractC21062, C8300.f21993);
                    }
                    z2 = true;
                } else {
                    zM16617 = abstractC21062.m16617(EnumC19998.f60728);
                    if (z4 || z || z2 || (z3 && (!zM16617 || z5))) {
                        c23623.m9352(abstractC21062, C8300.f22047);
                    }
                    z4 = true;
                }
            }
            boolean z6 = c20391.f63046 == EnumC8690.STATEMENT ? c20391.f63045 : false;
            if (c20391.f63043.m10293()) {
                z4 &= z6;
                zM16617 &= z6;
                z2 = false;
                z3 &= z6;
                z = false;
            }
            z5 = c20391.f63043.m10293() && z6;
            c4848 = c4848.f11035;
        }
    }
}
