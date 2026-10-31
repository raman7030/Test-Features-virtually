package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
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
public final class C15240 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f46754 = new C4314();

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC4203 f46755 = new C9598();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4824 f46756;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22364 f46757;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f46758;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22406 f46760;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f46761;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4725 f46762;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public char f46764;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18230 f46765;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f46766;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C3581 f46767;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5931 f46768;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC10370[] f46769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20661 f46770;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f46771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17214 f46772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4725 f46773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC16280 f46774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4725 f46775;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f46776;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6136 f46777;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13809 f46778;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f46779;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6735 f46782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC5973 f46784;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4725 f46785;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23168 f46787;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6319 f46788;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12399 f46789;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f46780 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f46763 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC3953 f46781 = new C23708(this);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC12669 f46783 = new C8892();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1386 f46786 = new C1386();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4464 f46759 = new C4464(3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36050(long j) {
        short s = (short) (j & 7);
        if (s == 0) {
            return 2;
        }
        if (s != 2) {
            return s != 4 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m36077(C15240 c15240, AbstractC5698 abstractC5698) {
        c15240.getClass();
        return m36074(abstractC5698);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m36079(C15240 c15240, C16384 c16384) {
        c15240.getClass();
        return C22311.stream(c15240.m36185(c16384.f26338.f13890)).anyMatch(new C12132(0, c15240));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m36113(C0052 c0052, AbstractC10370 abstractC10370) {
        return (C14163) this.f46780.get(new C23069(c0052, abstractC10370));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0324  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36138(final AbstractC5144 abstractC5144, final C3581 c3581, C3581 c3582, C14163 c14163) {
        boolean zM17505;
        boolean z;
        C11076 c11076;
        C12281 c12281;
        long j = c3581.f17563;
        if ((2147487744L & j) == 0) {
            long j2 = c3582.f17563;
            if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j2) != 0) {
                return;
            }
            long j3 = j & 8;
            C22364 c22364 = this.f46757;
            if (j3 != 0 && (j2 & 8) == 0) {
                AbstractC5144 abstractC5144M19439 = C7260.m19439(c3581, abstractC5144, false);
                C11576 c11576M36052 = m36052(c3581, c3582);
                C12281 c12282 = C6241.f19132;
                c22364.m7273(abstractC5144M19439, new C12281("compiler", "override.static", c11576M36052));
                c3581.f17563 |= 35184372088832L;
                return;
            }
            if ((16 & j2) != 0 || (j3 == 0 && (j2 & 8) != 0)) {
                AbstractC5144 abstractC5144M194310 = C7260.m19439(c3581, abstractC5144, false);
                C11576 c11576M36053 = m36052(c3581, c3582);
                EnumSet enumSetM45150 = C19642.m45150(c3582.f17563 & 24);
                C12281 c12283 = C6241.f19132;
                c22364.m7273(abstractC5144M194310, new C12281("compiler", "override.meth", c11576M36053, enumSetM45150));
                c3581.f17563 |= 35184372088832L;
                return;
            }
            if ((c3581.f17561.mo16084() & 8192) != 0) {
                return;
            }
            if (m36050(c3581.f17563) > m36050(c3582.f17563)) {
                AbstractC5144 abstractC5144M194311 = C7260.m19439(c3581, abstractC5144, false);
                if ((c3582.f17563 & 7) == 0) {
                    C11576 c11576M36054 = m36052(c3581, c3582);
                    C12281 c12284 = C6241.f19132;
                    c12281 = new C12281("compiler", "override.weaker.access", c11576M36054, "package");
                } else {
                    C11576 c11576M36055 = m36052(c3581, c3582);
                    EnumSet enumSetM45151 = C19642.m45150(c3582.f17563 & 7);
                    C12281 c12285 = C6241.f19132;
                    c12281 = new C12281("compiler", "override.weaker.access", c11576M36055, enumSetM45151);
                }
                c22364.m7273(abstractC5144M194311, c12281);
                c3581.f17563 |= 35184372088832L;
                return;
            }
            AbstractC4308 abstractC4308 = c14163.f17560;
            C6319 c6319 = this.f46788;
            AbstractC4308 abstractC4308M17543 = c6319.m17543(c3581, abstractC4308);
            AbstractC4308 abstractC4308M17544 = c6319.m17543(c3582, c14163.f17560);
            C2609 c2609Mo12938 = abstractC4308M17543.mo12938();
            C2609 c2609Mo12939 = abstractC4308M17544.mo12938();
            AbstractC4308 abstractC4308Mo12923 = abstractC4308M17543.mo12923();
            AbstractC4308 abstractC4308M17488 = c6319.m17488(abstractC4308M17544.mo12923(), c2609Mo12939, c2609Mo12938);
            C1386 c1386 = this.f46786;
            c1386.m4869();
            if (c6319.m17550(abstractC4308M17543.mo12923(), abstractC4308M17488)) {
                zM17505 = true;
            } else if (abstractC4308M17543.mo12923().mo12941() || abstractC4308M17488.mo12941()) {
                zM17505 = false;
            } else if (c6319.m17506(abstractC4308M17543, abstractC4308M17544, true)) {
                zM17505 = c6319.m17505(abstractC4308M17543.mo12923(), abstractC4308M17488, c1386);
            } else {
                if (!c6319.m17551(abstractC4308M17543.mo12923(), abstractC4308M17488, c1386)) {
                    if (c6319.m17546(abstractC4308M17543.mo12923(), c6319.m17519(abstractC4308M17488), true)) {
                        c1386.mo4874(EnumC20347.UNCHECKED);
                    } else {
                        zM17505 = false;
                    }
                }
                zM17505 = true;
            }
            if (!zM17505) {
                if ((c3581.f17563 & 8) == 0 || (c3582.f17563 & 8) == 0) {
                    AbstractC5144 abstractC5144M194312 = C7260.m19439(c3581, abstractC5144, false);
                    C11576 c11576M36056 = m36052(c3581, c3582);
                    C12281 c12286 = C6241.f19132;
                    c22364.m7273(abstractC5144M194312, new C12281("compiler", "override.incompatible.ret", c11576M36056, abstractC4308Mo12923, abstractC4308M17488));
                    c3581.f17563 |= 35184372088832L;
                    return;
                }
                AbstractC5144 abstractC5144M194313 = C7260.m19439(c3581, abstractC5144, false);
                AbstractC5698 abstractC5698M16072 = c3581.m16072();
                AbstractC5698 abstractC5698M16073 = c3582.m16072();
                C11576 c11576 = C11886.f35440;
                C11576 c11577 = new C11576("compiler", "cant.hide", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
                C12281 c12287 = C6241.f19132;
                c22364.m7273(abstractC5144M194313, new C12281("compiler", "override.incompatible.ret", c11577, abstractC4308Mo12923, abstractC4308M17488));
                c3581.f17563 |= 35184372088832L;
                return;
            }
            if (c1386.m4872(EnumC20347.UNCHECKED)) {
                AbstractC5144 abstractC5144M194314 = C7260.m19439(c3581, abstractC5144, false);
                C11576 c11576M36085 = m36085(c3581, c3582);
                C11076 c11077 = C14001.f42334;
                m36178(abstractC5144M194314, new C11076("compiler", "override.unchecked.ret", c11576M36085, abstractC4308Mo12923, abstractC4308M17488));
            }
            C2609 c2609M17481 = c6319.m17481(abstractC4308M17544.mo12930(), c2609Mo12939, c2609Mo12938);
            C2609 c2609M36197 = m36197(abstractC4308M17543.mo12930(), c6319.m17520(c2609M17481));
            C2609 c2609M36198 = m36197(abstractC4308M17543.mo12930(), c2609M17481);
            if (c2609M36197.m8249()) {
                AbstractC5144 abstractC5144M194315 = C7260.m19439(c3581, abstractC5144, false);
                C11576 c11576M36057 = m36052(c3581, c3582);
                AbstractC4308 abstractC4309 = (AbstractC4308) c2609M36198.f8240;
                C12281 c12288 = C6241.f19132;
                c22364.m7273(abstractC5144M194315, new C12281("compiler", "override.meth.doesnt.throw", c11576M36057, abstractC4309));
                c3581.f17563 |= 35184372088832L;
                return;
            }
            if (c2609M36198.m8249()) {
                AbstractC5144 abstractC5144M194316 = C7260.m19439(c3581, abstractC5144, false);
                C11576 c11576M36058 = m36052(c3581, c3582);
                AbstractC4308 abstractC43010 = (AbstractC4308) c2609M36198.f8240;
                C11076 c11078 = C14001.f42334;
                m36178(abstractC5144M194316, new C11076("compiler", "override.unchecked.thrown", c11576M36058, abstractC43010));
                return;
            }
            if (((c3581.f17563 ^ c3582.f17563) & 17179869184L) != 0 && this.f46756.m14055(EnumC20347.OVERRIDES)) {
                AbstractC5144 abstractC5144M194317 = C7260.m19439(c3581, abstractC5144, false);
                if ((17179869184L & c3581.f17563) != 0) {
                    C11576 c11576M36089 = m36089(c3581, c3582);
                    C11076 c11079 = C14001.f42334;
                    c11076 = new C11076("compiler", "override.varargs.missing", c11576M36089);
                } else {
                    C11576 c11576M360810 = m36089(c3581, c3582);
                    C11076 c110710 = C14001.f42334;
                    c11076 = new C11076("compiler", "override.varargs.extra", c11576M360810);
                }
                c22364.m7285(abstractC5144M194317, c11076);
            }
            if ((c3582.f17563 & 2147483648L) != 0) {
                AbstractC5144 abstractC5144M194318 = C7260.m19439(c3581, abstractC5144, false);
                C11576 c11576M36086 = m36085(c3581, c3582);
                C11076 c110711 = C14001.f42334;
                c22364.m7285(abstractC5144M194318, new C11076("compiler", "override.bridge", c11576M36086));
            }
            C14163 c14163M16071 = c3582.m16071();
            AbstractC4308 abstractC4308M17562 = c6319.m17562(c14163.f17560);
            if (abstractC4308M17562.m12913(EnumC9454.CLASS)) {
                C3581 c3581M10959 = c3582.m10959((C14163) abstractC4308M17562.f13890, c6319, false);
                if (c14163M16071 != null) {
                    c14163M16071.mo16101();
                    if ((c14163M16071.f17563 & 512) != 0) {
                        if (c6319.m17510(c14163.f17560).contains(c14163M16071.f17560) || c3581M10959 == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (c3581M10959 != c3582) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (c3581M10959 != c3582) {
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
            C4824 c4824M14053 = this.f46756.m14053(c3581);
            C4824 c4824 = this.f46756;
            this.f46756 = c4824M14053;
            try {
                m36116(new Supplier() { // from class: l.۬ۗ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C7260.m19439(c3581, abstractC5144, false);
                    }
                }, c3581, c3582);
            } finally {
                this.f46756 = c4824;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15240 m36054(C2903 c2903) {
        C15240 c15240 = (C15240) c2903.m8838(f46754);
        return c15240 == null ? new C15240(c2903) : c15240;
    }

    public C15240(C2903 c2903) {
        c2903.m8841(f46754, this);
        this.f46777 = C6136.m17057(c2903);
        C22364 c22364M50099 = C22364.m50099(c2903);
        this.f46757 = c22364M50099;
        this.f46760 = C22406.m50289(c2903);
        this.f46770 = C20661.m47250(c2903);
        this.f46778 = C13809.m33121(c2903);
        this.f46789 = C12399.m30567(c2903);
        this.f46782 = C6735.m18336(c2903);
        this.f46788 = C6319.m17456(c2903);
        this.f46772 = C17214.m40507(c2903);
        this.f46768 = C5931.m16615(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f46756 = C4824.m14050(c2903);
        this.f46761 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f46774 = enumC16280M38301;
        EnumC10892.m27201(c2903);
        this.f46766 = c11781M28823.m28831("warnOnAccessToMembers");
        this.f46764 = EnumC10892.m27201(c2903).m27204();
        this.f46784 = EnumC5973.m16741(c2903);
        this.f46787 = C23168.m51341(c2903);
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.DEPRECATION;
        boolean zM14055 = c4824.m14055(enumC20347);
        C4824 c4825 = this.f46756;
        EnumC20347 enumC20348 = EnumC20347.REMOVAL;
        boolean zM14056 = c4825.m14055(enumC20348);
        C4824 c4826 = this.f46756;
        EnumC20347 enumC20349 = EnumC20347.UNCHECKED;
        boolean zM14057 = c4826.m14055(enumC20349);
        this.f46785 = new C4725(c22364M50099, null, zM14055, "deprecated", enumC20347);
        this.f46762 = new C4725(c22364M50099, null, zM14056, "removal", enumC20348);
        this.f46775 = new C4725(c22364M50099, null, zM14057, "unchecked", enumC20349);
        this.f46773 = new C4725(c22364M50099, null, false, "sunapi", null);
        this.f46765 = C18230.m42469(c2903);
        this.f46758 = EnumC10637.f32009.m26686(enumC16280M38301);
        this.f46771 = EnumC10637.f32007.m26686(enumC16280M38301);
        this.f46779 = EnumC10637.f31988.m26686(enumC16280M38301);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36133(final AbstractC4308 abstractC4308, final AbstractC5698 abstractC5698, final C1755 c1755, final C2609 c2609, final C2609 c26010, final boolean z, C0384 c0384) {
        char c;
        C1755 c1756;
        if (abstractC4308.m12928(c0384.f1817)) {
            c0384.m1864(C2609.of((Object) abstractC4308), new InterfaceC3748() { // from class: l.ܽ۬֨
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0385) {
                    boolean z2 = z;
                    this.f51136.m36133(c0385.m1859(abstractC4308), abstractC5698, c1755, c2609, c26010, z2, c0385);
                }
            });
            return;
        }
        C2609 c2609Mo12933 = abstractC4308.mo12933();
        C2609 c2609Mo12934 = abstractC5698.f17560.mo12933();
        if (c2609Mo12934.m8245() != c2609Mo12933.m8245()) {
            c2609Mo12934 = c2609Mo12933;
        }
        AbstractC4308 abstractC4309 = z ? (AbstractC4308) c2609Mo12933.last() : null;
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        AbstractC10370 abstractC10371 = this.f46777.f18879;
        C20661 c20661 = this.f46770;
        if (abstractC10370 == abstractC10371 && abstractC5698.f17561 == c20661.f66527) {
            c2609Mo12933 = c2609Mo12933.f8241.f8241;
            c2609Mo12934 = c2609Mo12934.f8241.f8241;
        }
        if ((abstractC5698.mo16084() & 144115188075855872L) != 0) {
            c2609Mo12933 = c2609Mo12933.f8241;
            c2609Mo12934 = c2609Mo12934.f8241;
        }
        C6319 c6319 = this.f46788;
        if (c2609 != null) {
            C2609 c26011 = c2609;
            C2609 c26012 = c2609Mo12933;
            C2609 c26013 = c2609Mo12934;
            while (c26012.f8240 != abstractC4309) {
                AbstractC5144 abstractC5144 = (AbstractC5144) c26011.f8240;
                abstractC5144.getClass();
                m36058(abstractC5144.f16086, (AbstractC4308) c26012.f8240, new C19476(this, abstractC5144, "unchecked.assign", abstractC5144.f16086, (AbstractC4308) c26013.f8240));
                c26011 = c26011.f8241;
                c26012 = c26012.f8241;
                c26013 = c26013.f8241;
            }
            c = 0;
            if (z) {
                AbstractC4308 abstractC4308M17515 = c6319.m17515(abstractC4309);
                for (C2609 c26014 = c26011; c26014.f8241 != null; c26014 = c26014.f8241) {
                    AbstractC5144 abstractC5145 = (AbstractC5144) c26014.f8240;
                    abstractC5145.getClass();
                    m36058(abstractC5145.f16086, abstractC4308M17515, new C19476(this, abstractC5145, "unchecked.assign", abstractC5145.f16086, abstractC4308M17515));
                }
            } else if ((abstractC5698.mo16084() & 70385924046848L) == 17179869184L) {
                AbstractC4308 abstractC43010 = (AbstractC4308) abstractC4308.mo12933().last();
                AbstractC4308 abstractC43011 = (AbstractC4308) c26010.last();
                if (c6319.m17551(abstractC43011, c6319.m17515(abstractC43010), c6319.f19598) && !c6319.m17550(c6319.m17519(abstractC43010), c6319.m17519(abstractC43011))) {
                    AbstractC12612 abstractC12612 = (AbstractC12612) c2609.last();
                    abstractC12612.getClass();
                    AbstractC4308 abstractC4308M17516 = c6319.m17515(abstractC43010);
                    C11076 c11076 = C14001.f42334;
                    this.f46757.m7285(abstractC12612, new C11076("compiler", "inexact.non-varargs.call", abstractC4308M17516, abstractC43010));
                }
            }
        } else {
            c = 0;
        }
        if (z) {
            AbstractC4308 abstractC43012 = (AbstractC4308) abstractC4308.mo12933().last();
            if (c6319.m17477(abstractC43012) || (abstractC5698.mo7048().m16065(c20661.f66504.f13890) != null && m36086(abstractC5698))) {
                c1756 = c1755;
            } else {
                c1756 = c1755;
                AbstractC5144 abstractC5146 = c1756.f6074;
                abstractC5146.getClass();
                C11076 c11077 = C14001.f42334;
                Object[] objArr = new Object[1];
                objArr[c] = abstractC43012;
                m36178(abstractC5146, new C11076("compiler", "unchecked.generic.array.creation", objArr));
            }
            C7260.m19444(c6319.m17515(abstractC43012), c1756.f6074);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m36112(C4824 c4824) {
        C4824 c4825 = this.f46756;
        this.f46756 = c4824;
        return c4825;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m36103(C3581 c3581) {
        C3581 c3582 = this.f46767;
        this.f46767 = c3581;
        return c3582;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36130(InterfaceC3109 interfaceC3109, C11076 c11076) {
        if (this.f46756.m14056(EnumC20347.PREVIEW)) {
            return;
        }
        this.f46787.m51345(interfaceC3109, c11076);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36178(InterfaceC3109 interfaceC3109, C11076 c11076) {
        if (this.f46756.m14056(EnumC20347.UNCHECKED)) {
            return;
        }
        this.f46775.m13840(interfaceC3109, c11076);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36191(InterfaceC3109 interfaceC3109, C11076 c11076) {
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.VARARGS;
        if (c4824.m14055(enumC20347)) {
            this.f46757.m7286(enumC20347, interfaceC3109, c11076);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36146(C6262 c6262, C11076 c11076) {
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.STATIC;
        if (c4824.m14055(enumC20347)) {
            this.f46757.m7286(enumC20347, c6262, c11076);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36063(C15240 c15240, InterfaceC3109 interfaceC3109) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.DIVZERO;
        if (c4824.m14055(enumC20347)) {
            c15240.f46757.m7286(enumC20347, interfaceC3109, C14001.f42348);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36175() {
        this.f46785.m13839();
        this.f46762.m13839();
        this.f46775.m13839();
        this.f46773.m13839();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36110(InterfaceC3109 interfaceC3109, C20515 c20515) {
        EnumC20043 enumC20043 = EnumC20043.NON_DEFERRABLE;
        AbstractC5698 abstractC5698 = c20515.f66102;
        C16719 c16719M46989 = c20515.m46989();
        C12281 c12281 = C6241.f19132;
        this.f46757.m7280(enumC20043, interfaceC3109, new C12281("compiler", "cant.access", abstractC5698, c16719M46989));
        return this.f46770.f66457;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36109(InterfaceC3109 interfaceC3109, C16719 c16719, Object obj) {
        boolean z = obj instanceof AbstractC4308;
        C20661 c20661 = this.f46770;
        C22364 c22364 = this.f46757;
        if (z && ((AbstractC4308) obj).m12913(EnumC9454.VOID)) {
            c22364.m7273(interfaceC3109, C6241.f19205);
            return c20661.f66457;
        }
        C12281 c12281 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "type.found.req", obj, c16719));
        return this.f46788.m17535(z ? (AbstractC4308) obj : c20661.f66457);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36177(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(interfaceC3109, new C12281("compiler", "cant.ref.before.ctor.called", abstractC5698));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36126(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        if (abstractC5698.f17560.mo12948()) {
            return;
        }
        AbstractC5698 abstractC5698M16072 = abstractC5698.m16072();
        EnumC1296 enumC1296 = abstractC5698M16072.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4571;
        C22364 c22364 = this.f46757;
        if (enumC1296 == enumC1297 && ((C3581) abstractC5698M16072).m10966()) {
            EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698);
            EnumC8352 enumC8352M49077 = C21758.m49076(abstractC5698.m16072());
            EnumC8352 enumC8352M49078 = C21758.m49076(abstractC5698.m16072().m16071());
            C14163 c14163M16071 = abstractC5698.m16072().m16071();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(interfaceC3109, new C12281("compiler", "already.defined.in.clinit", enumC8352M49076, abstractC5698, enumC8352M49077, enumC8352M49078, c14163M16071));
            return;
        }
        if (abstractC5698M16072.f17559 == enumC1297) {
            long j = abstractC5698.f17561.f17563;
            if ((68719476736L & j) != 0 && (j & 2305843009213693952L) != 0) {
                return;
            }
        }
        EnumC8352 enumC8352M49079 = C21758.m49076(abstractC5698);
        EnumC8352 enumC8352M490710 = C21758.m49076(abstractC5698.m16072());
        AbstractC5698 abstractC5698M16073 = abstractC5698.m16072();
        C12281 c12282 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "already.defined", enumC8352M49079, abstractC5698, enumC8352M490710, abstractC5698M16073));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36116(final Supplier supplier, AbstractC5698 abstractC5698, final AbstractC5698 abstractC5699) {
        if ((abstractC5699.f17563 & 36028797018963968L) == 0 && (!abstractC5699.mo956() || abstractC5698.mo956())) {
            return;
        }
        if ((abstractC5699.mo955() != abstractC5698.mo955() || abstractC5699.mo955() == null) && abstractC5699.f17559 != EnumC1296.f4579) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ۙۗ֨
                @Override // l.InterfaceC16818
                /* JADX INFO: renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36062(this.f14051, supplier, abstractC5699);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36131(InterfaceC3109 interfaceC3109, C12048 c12048, AbstractC14016 abstractC14016) {
        AbstractC5698 abstractC5698;
        AbstractC5698 abstractC5699;
        Iterator it = abstractC14016.m20476(c12048.f17562).iterator();
        while (it.hasNext() && (abstractC5699 = (abstractC5698 = (AbstractC5698) it.next()).f17561) == c12048.f17561) {
            if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5699.f17559.m4391(C15406.f47185) && c12048.f17562 != this.f46777.f18855) {
                m36126(interfaceC3109, abstractC5698);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36143(C5557 c5557, C14163 c14163, AbstractC14016 abstractC14016) {
        for (AbstractC5698 abstractC5698 : abstractC14016.m20476(c14163.f17562)) {
            if (abstractC5698.f17561 != c14163.f17561) {
                return;
            }
            if (abstractC5698.f17559 == EnumC1296.f4582 && !abstractC5698.f17560.m12913(EnumC9454.TYPEVAR) && abstractC5698.f17561.f17559.m4391(C15406.f47185) && c14163.f17562 != this.f46777.f18855) {
                m36126(c5557, abstractC5698);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36165(C5557 c5557, AbstractC10370 abstractC10370, AbstractC14016 abstractC14016) {
        AbstractC10370 abstractC10371;
        Iterator it = abstractC14016.mo20477(abstractC10370, null, EnumC1317.NON_RECURSIVE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C6136 c6136 = this.f46777;
            if (zHasNext) {
                AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17562 != c6136.f18855) {
                    m36126(c5557, abstractC5698);
                    return false;
                }
            } else {
                for (AbstractC5698 abstractC5699 = abstractC14016.f23673; abstractC5699 != null; abstractC5699 = abstractC5699.f17561) {
                    if (abstractC5699.f17559 == EnumC1296.f4582 && (abstractC10371 = abstractC5699.f17562) == abstractC10370 && abstractC10371 != c6136.f18855) {
                        m36126(c5557, abstractC5699);
                        return true;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m36188(C14163 c14163) {
        AbstractC10370 abstractC10370 = c14163.f17561.m16071().f42771;
        String string = abstractC10370.toString();
        C23069 c23069 = new C23069(abstractC10370, c14163.f17562);
        HashMap map = this.f46763;
        Integer num = (Integer) map.get(c23069);
        int iIntValue = num == null ? 1 : num.intValue();
        while (true) {
            StringBuilder sbM15339 = C5368.m15339(string);
            sbM15339.append(this.f46764);
            sbM15339.append(iIntValue);
            sbM15339.append((Object) c14163.f17562);
            AbstractC10370 abstractC10370M30652 = this.f46777.f18880.m30652(sbM15339.toString());
            if (m36113(c14163.m16089().f24147, abstractC10370M30652) == null) {
                map.put(c23069, Integer.valueOf(iIntValue + 1));
                return abstractC10370M30652;
            }
            iIntValue++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36156(C14163 c14163) {
        AbstractC5698 abstractC5698 = c14163.f17561;
        if (abstractC5698 == null || abstractC5698.f17559 == EnumC1296.f4577) {
            return;
        }
        this.f46763.remove(new C23069(abstractC5698.m16071().f42771, c14163.f17562));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36115() {
        this.f46780.clear();
        this.f46763.clear();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36199(C14163 c14163) {
        this.f46780.put(new C23069(c14163.m16089().f24147, c14163.f42771), c14163);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14163 m36174(C14163 c14163) {
        return (C14163) this.f46780.get(new C23069(c14163.m16089().f24147, c14163.f42771));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36196(C14163 c14163) {
        this.f46780.remove(new C23069(c14163.m16089().f24147, c14163.f42771));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36106(final InterfaceC3109 interfaceC3109, final AbstractC4308 abstractC4308, final AbstractC4308 abstractC4309, final InterfaceC3953 interfaceC3953) {
        C0384 c0384Mo3857 = interfaceC3953.mo3857();
        if (abstractC4309.m12928(c0384Mo3857.f1817) || abstractC4308.m12928(c0384Mo3857.f1817)) {
            c0384Mo3857.m1864(C2609.of((Object) abstractC4309, (Object) abstractC4308), new InterfaceC3748() { // from class: l.ܳ۬֨
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0384) {
                    this.f44528.m36106(interfaceC3109, c0384.m1859(abstractC4308), c0384.m1859(abstractC4309), interfaceC3953);
                }
            });
        }
        if (abstractC4309.m12913(EnumC9454.ERROR)) {
            return abstractC4309;
        }
        if (abstractC4309.m12913(EnumC9454.NONE) || interfaceC3953.mo3859(abstractC4308, abstractC4309, interfaceC3953.mo3858(interfaceC3109, abstractC4308, abstractC4309))) {
            return abstractC4308;
        }
        boolean zMo12914 = abstractC4308.mo12914();
        C6319 c6319 = this.f46788;
        C5931 c5931 = this.f46768;
        if (zMo12914 && abstractC4309.mo12914()) {
            C11576 c11576 = C11886.f35440;
            interfaceC3953.mo1084(interfaceC3109, c5931.m16617(new C11576("compiler", "possible.loss.of.precision", abstractC4308, abstractC4309)));
            return c6319.m17535(abstractC4308);
        }
        interfaceC3953.mo1084(interfaceC3109, c5931.m16617(C11886.m29011(abstractC4308, abstractC4309)));
        return c6319.m17535(abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36160(final C17844 c17844) {
        AbstractC5698 abstractC5698M19472;
        if (c17844.f16086.mo12948()) {
            return;
        }
        if (!this.f46788.m17550(c17844.f54512.f16086, c17844.f54511.f16086) || C7260.m19460(c17844.f54511)) {
            return;
        }
        AbstractC12612 abstractC12612M19458 = C7260.m19458(c17844.f54512);
        if (!abstractC12612M19458.m14709(EnumC18550.f57534) || (abstractC5698M19472 = C7260.m19472(((C15580) abstractC12612M19458).f48011)) == null || abstractC5698M19472.f17559 != EnumC1296.f4571 || (abstractC5698M19472.mo16084() & 137438953472L) == 0) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ܶۗ֨
                @Override // l.InterfaceC16818
                /* JADX INFO: renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36073(this.f45599, c17844);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36073(C15240 c15240, C17844 c17844) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.CAST;
        if (c4824.m14055(enumC20347)) {
            C22364 c22364 = c15240.f46757;
            AbstractC4308 abstractC4308 = c17844.f54511.f16086;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, c17844, new C11076("compiler", "redundant.cast", abstractC4308));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36202(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        if (!abstractC4308.m12913(EnumC9454.VOID)) {
            return abstractC4308;
        }
        this.f46757.m7273(interfaceC3109, C6241.f19153);
        return this.f46788.m17535(abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36104(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        Object objM16617;
        if (abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.ARRAY) || abstractC4308.m12913(EnumC9454.ERROR)) {
            return abstractC4308;
        }
        C11576 c11576 = C11886.f35496;
        C5931 c5931 = this.f46768;
        C16719 c16719M16617 = c5931.m16617(c11576);
        if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            objM16617 = abstractC4308;
            objM16617 = c5931.m16617(new C11576("compiler", "type.parameter", abstractC4308));
        }
        objM16617 = abstractC4308;
        return m36109(interfaceC3109, c16719M16617, objM16617);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36173(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        Object objM16617;
        if (abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.ERROR)) {
            return abstractC4308;
        }
        C11576 c11576 = C11886.f35490;
        C5931 c5931 = this.f46768;
        C16719 c16719M16617 = c5931.m16617(c11576);
        if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            objM16617 = abstractC4308;
            objM16617 = c5931.m16617(new C11576("compiler", "type.parameter", abstractC4308));
        }
        objM16617 = abstractC4308;
        return m36109(interfaceC3109, c16719M16617, objM16617);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36198(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4308M36104 = m36104(interfaceC3109, abstractC4308);
        boolean zM12913 = abstractC4308M36104.m12913(EnumC9454.CLASS);
        C22364 c22364 = this.f46757;
        C6319 c6319 = this.f46788;
        if (!zM12913) {
            if (!abstractC4308M36104.m12913(EnumC9454.ARRAY) || c6319.m17477(((C5138) abstractC4308M36104).f16077)) {
                return abstractC4308M36104;
            }
            c22364.m7273(interfaceC3109, C6241.f19293);
            return c6319.m17535(abstractC4308M36104);
        }
        if ((abstractC4308M36104.f13890.mo16084() & 1536) != 0) {
            AbstractC19810 abstractC19810 = abstractC4308M36104.f13890;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(interfaceC3109, new C12281("compiler", "abstract.cant.be.instantiated", abstractC19810));
            return c6319.m17535(abstractC4308M36104);
        }
        if ((abstractC4308M36104.f13890.mo16084() & 16384) != 0) {
            c22364.m7273(interfaceC3109, C6241.f19230);
            return c6319.m17535(abstractC4308M36104);
        }
        return m36108(interfaceC3109, abstractC4308M36104, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36108(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, boolean z) {
        AbstractC4308 abstractC4308M36173 = m36173(interfaceC3109, abstractC4308);
        if (z && abstractC4308M36173.mo12917()) {
            for (C2609 c2609Mo12938 = abstractC4308M36173.mo12938(); c2609Mo12938.m8249(); c2609Mo12938 = c2609Mo12938.f8241) {
                if (((AbstractC4308) c2609Mo12938.f8240).m12913(EnumC9454.WILDCARD)) {
                    return m36109(interfaceC3109, this.f46768.m16617(C11886.f35493), c2609Mo12938.f8240);
                }
            }
        }
        return abstractC4308M36173;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36201(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        return abstractC4308.mo12908() ? abstractC4308 : m36109(interfaceC3109, this.f46768.m16617(C11886.f35483), abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36123(C2609 c2609, C2609 c26010) {
        while (c26010.m8249()) {
            AbstractC12612 abstractC12612 = (AbstractC12612) c2609.f8240;
            abstractC12612.getClass();
            c26010.f8240 = m36201(abstractC12612, (AbstractC4308) c26010.f8240);
            c2609 = c2609.f8241;
            c26010 = c26010.f8241;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36169(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        return (abstractC4308.mo12908() || abstractC4308.m12913(EnumC9454.BOT)) ? abstractC4308 : m36109(interfaceC3109, this.f46768.m16617(C11886.f35483), abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36164(AbstractC5144 abstractC5144, long j, long j2, long j3) {
        long j4 = j2 & j;
        if (j4 != 0) {
            long j5 = j & j3;
            if (j5 != 0) {
                long j6 = 1;
                long j7 = 1;
                while ((j7 & j4) == 0) {
                    j7 <<= 1;
                }
                EnumSet enumSetM45150 = C19642.m45150(j7);
                while ((j6 & j5) == 0) {
                    j6 <<= 1;
                }
                EnumSet enumSetM45151 = C19642.m45150(j6);
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(abstractC5144, new C12281("compiler", "illegal.combination.of.modifiers", enumSetM45150, enumSetM45151));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36111(C19110 c19110, AbstractC4308 abstractC4308) {
        if (!C7260.m19449(c19110) || abstractC4308.mo12948()) {
            AbstractC12612 abstractC12612 = c19110.f60196;
            abstractC12612.getClass();
            return m36108((InterfaceC3109) abstractC12612, abstractC4308, true);
        }
        C5557 c5557 = c19110.f60195;
        C22364 c22364 = this.f46757;
        if (c5557 != null) {
            EnumC10637 enumC10637 = EnumC10637.f32012;
            EnumC16280 enumC16280 = this.f46774;
            if (!enumC10637.m26686(enumC16280)) {
                EnumC20043 enumC20043 = EnumC20043.SOURCE_LEVEL;
                AbstractC12612 abstractC12613 = c19110.f60196;
                abstractC12613.getClass();
                C11576 c11576M26688 = enumC10637.m26688(enumC16280.f50071);
                C12281 c12281 = C6241.f19132;
                c22364.m7280(enumC20043, abstractC12613, new C12281("compiler", "cant.apply.diamond.1", abstractC4308, c11576M26688));
            }
        }
        boolean zIsEmpty = abstractC4308.f13890.f17560.mo12938().isEmpty();
        C6319 c6319 = this.f46788;
        if (zIsEmpty) {
            AbstractC12612 abstractC12614 = c19110.f60196;
            abstractC12614.getClass();
            C11576 c11576 = C11886.f35440;
            C11576 c11577 = new C11576("compiler", "diamond.non.generic", abstractC4308);
            C12281 c12282 = C6241.f19132;
            c22364.m7273(abstractC12614, new C12281("compiler", "cant.apply.diamond.1", abstractC4308, c11577));
            return c6319.m17535(abstractC4308);
        }
        C2609 c2609 = c19110.f60198;
        if (c2609 == null || !c2609.m8249()) {
            return abstractC4308;
        }
        AbstractC12612 abstractC12615 = c19110.f60196;
        abstractC12615.getClass();
        C11576 c11578 = C11886.f35440;
        C11576 c11579 = new C11576("compiler", "diamond.and.explicit.params", abstractC4308);
        C12281 c12283 = C6241.f19132;
        c22364.m7273(abstractC12615, new C12281("compiler", "cant.apply.diamond.1", abstractC4308, c11579));
        return c6319.m17535(abstractC4308);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m36092(AbstractC4308 abstractC4308) {
        AbstractC4203 abstractC4203 = f46755;
        abstractC4203.getClass();
        return ((Boolean) abstractC4308.mo2962(abstractC4203, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36147(C8526 c8526) {
        C16719 c16719M16617;
        C3581 c3581 = c8526.f26045;
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC4308 = c20661.f66504;
        AbstractC4308 abstractC4309 = c20661.f66504;
        boolean z = c3581.m16065((AbstractC5698) abstractC4308.f13890) != null;
        boolean zMo10957 = c3581.mo10957();
        C6319 c6319 = this.f46788;
        AbstractC4308 abstractC4308M17515 = zMo10957 ? c6319.m17515(((C9378) c8526.f26048.last()).f16086) : null;
        C5931 c5931 = this.f46768;
        if (z && !m36086(c3581)) {
            C22364 c22364 = this.f46757;
            if (abstractC4308M17515 != null) {
                if (EnumC10637.f32006.m26686(this.f46774)) {
                    c16719M16617 = c5931.m16617(new C11576("compiler", "varargs.trustme.on.virtual.varargs", c3581));
                } else {
                    c16719M16617 = c5931.m16617(new C11576("compiler", "varargs.trustme.on.virtual.varargs.final.only", c3581));
                }
                AbstractC19810 abstractC19810 = abstractC4309.f13890;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c8526, new C12281("compiler", "varargs.invalid.trustme.anno", abstractC19810, c16719M16617));
                return;
            }
            AbstractC19810 abstractC19811 = abstractC4309.f13890;
            C11576 c11576 = C11886.f35440;
            C11576 c11577 = new C11576("compiler", "varargs.trustme.on.non.varargs.meth", c3581);
            C12281 c12282 = C6241.f19132;
            c22364.m7273(c8526, new C12281("compiler", "varargs.invalid.trustme.anno", abstractC19811, c11577));
            return;
        }
        if (z && abstractC4308M17515 != null && c6319.m17477(abstractC4308M17515)) {
            AbstractC19810 abstractC19812 = abstractC4309.f13890;
            C11576 c11578 = C11886.f35440;
            C16719 c16719M16618 = c5931.m16617(new C11576("compiler", "varargs.trustme.on.reifiable.varargs", abstractC4308M17515));
            C11076 c11076 = C14001.f42334;
            m36191(c8526, new C11076("compiler", "varargs.redundant.trustme.anno", abstractC19812, c16719M16618));
            return;
        }
        if (z || abstractC4308M17515 == null || c6319.m17477(abstractC4308M17515)) {
            return;
        }
        InterfaceC3109 interfaceC3109 = (C9378) c8526.f26048.f8240;
        interfaceC3109.getClass();
        C11076 c11077 = C14001.f42334;
        m36178(interfaceC3109, new C11076("compiler", "unchecked.varargs.non.reifiable.type", abstractC4308M17515));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m36086(AbstractC5698 abstractC5698) {
        if ((abstractC5698.mo16084() & 17179869184L) != 0) {
            if (abstractC5698.m16075()) {
                return true;
            }
            if ((abstractC5698.mo16084() & ((long) ((EnumC10637.f32006.m26686(this.f46774) ? 2 : 0) | 24))) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36107(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370) {
        boolean zM12913 = abstractC4308.m12913(EnumC9454.BOT);
        C22364 c22364 = this.f46757;
        C6319 c6319 = this.f46788;
        if (zM12913) {
            c22364.m7273(interfaceC3109, C6241.m17185(abstractC10370, C11886.f35437));
            return c6319.m17535(abstractC4308);
        }
        if (abstractC4308.m12913(EnumC9454.VOID)) {
            c22364.m7273(interfaceC3109, C6241.m17185(abstractC10370, C11886.f35452));
            return c6319.m17535(abstractC4308);
        }
        return c6319.m17541(abstractC4308, c6319.m17540(abstractC4308)).mo2973();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36058(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        C6319 c6319 = this.f46788;
        if (!c6319.m17556(abstractC4308, abstractC4309, c1386) && abstractC4309.mo5146() && c6319.m17546(abstractC4308, c6319.m17562(abstractC4309), true)) {
            for (C2609 c2609M17510 = c6319.m17510(abstractC4309); c2609M17510.m8249() && c6319.m17551(abstractC4308, (AbstractC4308) c2609M17510.f8240, c1386); c2609M17510 = c2609M17510.f8241) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36163(AbstractC4308 abstractC4308) {
        return m36096(abstractC4308) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 m36096(AbstractC4308 abstractC4308) {
        C6319 c6319;
        C2609 c2609Mo12934 = abstractC4308.f13890.f17560.mo12934();
        C2609 c2609Mo12935 = abstractC4308.mo12934();
        C2609 c2609Mo12938 = abstractC4308.mo12938();
        C2609 c2609Mo12939 = abstractC4308.f13890.f17560.mo12938();
        C18837 c18837 = new C18837();
        while (true) {
            boolean zM8249 = c2609Mo12938.m8249();
            c6319 = this.f46788;
            if (!zM8249 || !c2609Mo12939.m8249()) {
                break;
            }
            c18837.m43511(c6319.m17488(((AbstractC4308) c2609Mo12939.f8240).mo12939(), c2609Mo12934, c2609Mo12935));
            c2609Mo12938 = c2609Mo12938.f8241;
            c2609Mo12939 = c2609Mo12939.f8241;
        }
        C2609 c2609Mo129310 = abstractC4308.mo12938();
        for (C2609 c2609M17521 = c6319.m17521(c2609Mo12934, c2609Mo12934, c6319.m17523(abstractC4308).mo12934()); c2609Mo129310.m8249() && c2609M17521.m8249(); c2609M17521 = c2609M17521.f8241) {
            ((AbstractC4308) c2609Mo129310.f8240).mo12937((C8541) c2609M17521.f8240);
            c2609Mo129310 = c2609Mo129310.f8241;
        }
        C2609 c2609Mo129311 = abstractC4308.mo12938();
        C2609 c2609M43517 = c18837.m43517();
        while (true) {
            boolean zM82410 = c2609Mo129311.m8249();
            AbstractC12669 abstractC12669 = this.f46783;
            if (zM82410 && c2609M43517.m8249()) {
                AbstractC4308 abstractC4309 = (AbstractC4308) c2609Mo129311.f8240;
                if (!((Boolean) abstractC12669.m30946(abstractC4309)).booleanValue() && !((AbstractC4308) c2609M43517.f8240).mo12948()) {
                    AbstractC4308 abstractC43010 = (AbstractC4308) c2609M43517.f8240;
                    boolean zM17566 = true;
                    if (!abstractC4309.mo12944()) {
                        if (abstractC4309.m12913(EnumC9454.WILDCARD)) {
                            if (abstractC4309.mo12922()) {
                                zM17566 = c6319.m17545(abstractC43010, c6319.m17511(abstractC4309), c6319.f19598);
                            } else if (abstractC4309.mo12924()) {
                                zM17566 = true ^ c6319.m17566(c6319.m17513(abstractC4309), abstractC43010);
                            }
                        } else {
                            zM17566 = c6319.m17546(C6319.m17473(abstractC4309), abstractC43010, true);
                        }
                    }
                    if (!zM17566) {
                        return (AbstractC4308) c2609Mo129311.f8240;
                    }
                }
                c2609Mo129311 = c2609Mo129311.f8241;
                c2609M43517 = c2609M43517.f8241;
            } else {
                C2609 c2609Mo129312 = abstractC4308.mo12938();
                C2609 c2609M43518 = c18837.m43517();
                for (AbstractC4308 abstractC43011 : c6319.m17523(abstractC4308).mo12938()) {
                    if (abstractC43011.m12913(EnumC9454.TYPEVAR) && abstractC43011.mo12939().mo12948() && !((AbstractC4308) c2609M43518.f8240).mo12948() && !((Boolean) abstractC12669.m30946((AbstractC4308) c2609Mo129312.f8240)).booleanValue()) {
                        return (AbstractC4308) c2609Mo129312.f8240;
                    }
                    c2609M43518 = c2609M43518.f8241;
                    c2609Mo129312 = c2609Mo129312.f8241;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36128(final InterfaceC3109 interfaceC3109, final C7814 c7814) {
        c7814.mo16101();
        if (c7814.f24145.m20480()) {
            c7814.mo16101();
            if ((c7814.f17563 & 4503599627370496L) == 0) {
                this.f46765.m42473(new InterfaceC16818() { // from class: l.᩺ۗ֨
                    @Override // l.InterfaceC16818
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6082() {
                        C15240.m36065(this.f73398, interfaceC3109, c7814);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x012b A[EDGE_INSN: B:78:0x012b->B:80:0x012e BREAK  A[LOOP:0: B:71:0x0111->B:194:?]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m36100(final AbstractC5144 abstractC5144, long j, AbstractC5698 abstractC5698, AbstractC5144 abstractC5145) {
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
        int i = C2542.f8062[abstractC5698.f17559.ordinal()];
        C22364 c22364 = this.f46757;
        if (i != 1) {
            C18230 c18230 = this.f46765;
            if (i == 2) {
                j2 = 512;
                j6 = 2;
                if (abstractC5698.f17562 != this.f46777.f18879) {
                    long j12 = abstractC5698.f17561.f17563;
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
                } else if ((abstractC5698.f17561.f17563 & 16384) != 0) {
                    j8 = j6;
                } else {
                    j7 = 7;
                    j8 = j7;
                    j6 = 0;
                }
                if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != 0) {
                    InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) abstractC5144);
                    try {
                        c18230.m42473(new InterfaceC16818() { // from class: l.ۛۗ֨
                            @Override // l.InterfaceC16818
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6082() {
                                C15240.m36067(this.f17802, abstractC5144);
                            }
                        });
                        c18230.m42471(interfaceC3109M42471);
                    } catch (Throwable th) {
                        c18230.m42471(interfaceC3109M42471);
                        throw th;
                    }
                }
                if (((j | j6) & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (j & 8796093022208L) != 0) {
                    j9 = abstractC5698.f17561.f17563;
                } else {
                    j10 = j6;
                }
                j5 = j8;
                j4 = j10;
            } else if (i == 3) {
                boolean zM4391 = abstractC5698.f17561.f17559.m4391(C15406.f47185);
                boolean z = this.f46771;
                j6 = 8;
                if (zM4391 || (abstractC5698.m16077() && (j & 8192) != 0)) {
                    j2 = 512;
                    boolean z2 = (abstractC5698.f17562.isEmpty() || ((j & 2305843009213693952L) == 0 && (j & 16384) == 0 && (j & 512) == 0)) ? false : true;
                    j8 = (((j & 8) != 0 || z2) && z && (j & 8192) == 0) ? 24088L : 23568L;
                    if (!z2) {
                        j6 = 0;
                    }
                } else {
                    AbstractC5698 abstractC5699 = abstractC5698.f17561;
                    if (abstractC5699.f17559 == EnumC1296.f4582) {
                        j8 = ((j & 8) != 0 && z && (j & 8192) == 0) ? -4611686018427363809L : -4611686018427363817L;
                        j2 = 512;
                        if (abstractC5699.f17561.f17559 == EnumC1296.f4579 || (abstractC5699.f17563 & 8) != 0) {
                            j8 |= 8;
                        } else if (!z && ((j & 16384) != 0 || (j & 2305843009213693952L) != 0)) {
                            c22364.m7273(abstractC5144, C6241.f19275);
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
                    if (!abstractC5145.m14709(EnumC18550.f57582)) {
                        j11 = 0;
                        break;
                    }
                    C20887 c20887 = new C20887();
                    c20887.f67584 = false;
                    Iterator it = ((C5557) abstractC5145).f17179.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j11 = 16;
                            break;
                        }
                        ((AbstractC5144) it.next()).mo988(c20887);
                        if (c20887.f67584) {
                            if (!this.f46779) {
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
                    InterfaceC3109 interfaceC3109M42472 = c18230.m42471((InterfaceC3109) abstractC5144);
                    try {
                        c18230.m42473(new InterfaceC16818() { // from class: l.ۛۗ֨
                            @Override // l.InterfaceC16818
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6082() {
                                C15240.m36067(this.f17802, abstractC5144);
                            }
                        });
                        c18230.m42471(interfaceC3109M42472);
                    } catch (Throwable th2) {
                        c18230.m42471(interfaceC3109M42472);
                        throw th2;
                    }
                }
                j9 = abstractC5698.f17561.f17563;
            } else {
                throw new AssertionError();
            }
            j10 = j6 | (j9 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
            j5 = j8;
            j4 = j10;
        } else {
            j2 = 512;
            if (!abstractC5145.m14709(EnumC18550.f57578) || ((C9378) abstractC5145).f28483 == null) {
                AbstractC5698 abstractC56910 = abstractC5698.f17561;
                if (abstractC56910.f17559 != EnumC1296.f4582) {
                    j3 = 8589934608L;
                } else if ((abstractC56910.f17563 & 512) != 0) {
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
            EnumC1296 enumC1296 = abstractC5698.f17559;
            EnumC1296 enumC1297 = EnumC1296.f4582;
            if ((enumC1296 == enumC1297 || m36164(abstractC5144, j, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 8796093022218L)) && m36164(abstractC5144, j, 10L, 8796093022208L) && m36164(abstractC5144, j, 1536L, 304L) && m36164(abstractC5144, j, 1L, 6L) && m36164(abstractC5144, j, 2L, 5L) && m36164(abstractC5144, j, 16L, 64L) && ((abstractC5698.f17559 == enumC1297 || m36164(abstractC5144, j, 1280L, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) && m36164(abstractC5144, j, 16L, -4611686018427387904L) && m36164(abstractC5144, j, SkeinEngine.UbiTweak.T1_FIRST, -9223372036854775792L))) {
                m36164(abstractC5144, j, SkeinEngine.UbiTweak.T1_FIRST, 8192L);
            }
        } else if ((j13 & j2) != 0) {
            c22364.m7273(abstractC5144, (j & 8192) != 0 ? C6241.f19246 : C6241.f19266);
            j5 |= j2;
        } else {
            EnumSet enumSetM45150 = C19642.m45150(j13);
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC5144, new C12281("compiler", "mod.not.allowed.here", enumSetM45150));
        }
        return (j & (4611677222334361600L | j5)) | j4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36067(C15240 c15240, AbstractC5144 abstractC5144) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.STRICTFP;
        if (c4824.m14055(enumC20347)) {
            c15240.f46757.m7286(enumC20347, abstractC5144, C14001.f42344);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36137(AbstractC5144 abstractC5144, C1755 c1755, boolean z) {
        new C8186(this, c1755).m21688(abstractC5144, z, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36122(C2609 c2609, C1755 c1755) {
        while (c2609.m8249()) {
            m36137((AbstractC5144) c2609.f8240, c1755, true);
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36135(AbstractC5144 abstractC5144, C1755 c1755) {
        C8526 c8526;
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.RAW;
        if (c4824.m14055(enumC20347) && abstractC5144.f16086.m12913(EnumC9454.CLASS) && !C7260.m19449(abstractC5144)) {
            if (!(c1755.f6079.f17180.isEmpty() && (c8526 = c1755.f6077) != null && c8526.f26044 == this.f46777.f18879) && abstractC5144.f16086.mo12920()) {
                AbstractC4308 abstractC4308 = abstractC5144.f16086;
                AbstractC4308 abstractC4309 = abstractC4308.f13890.f17560;
                C11076 c11076 = C14001.f42334;
                this.f46757.m7286(enumC20347, abstractC5144, new C11076("compiler", "raw.class.use", abstractC4308, abstractC4309));
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m36200(AbstractC4308 abstractC4308, C2609 c2609) {
        while (c2609.m8249()) {
            if (this.f46788.m17546(abstractC4308, (AbstractC4308) c2609.f8240, true)) {
                return true;
            }
            c2609 = c2609.f8241;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36193(AbstractC4308 abstractC4308, C2609 c2609) {
        while (c2609.m8249()) {
            AbstractC4308 abstractC4309 = (AbstractC4308) c2609.f8240;
            C6319 c6319 = this.f46788;
            if (c6319.m17546(abstractC4308, abstractC4309, true) || c6319.m17546((AbstractC4308) c2609.f8240, abstractC4308, true)) {
                return true;
            }
            c2609 = c2609.f8241;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m36172(AbstractC4308 abstractC4308, C2609 c2609) {
        return m36200(abstractC4308, c2609) ? c2609 : m36102(abstractC4308, c2609).m8246(abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m36102(AbstractC4308 abstractC4308, C2609 c2609) {
        if (!c2609.isEmpty()) {
            C2609 c2609M36102 = m36102(abstractC4308, c2609.f8241);
            if (this.f46788.m17546((AbstractC4308) c2609.f8240, abstractC4308, true)) {
                return c2609M36102;
            }
            if (c2609M36102 != c2609.f8241) {
                return c2609M36102.m8246((AbstractC4308) c2609.f8240);
            }
        }
        return c2609;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m36194(C2609 c2609, C2609 c26010) {
        while (c26010.m8249()) {
            c2609 = m36172((AbstractC4308) c26010.f8240, c2609);
            c26010 = c26010.f8241;
        }
        return c2609;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m36171(C2609 c2609, C2609 c26010) {
        while (c26010.m8249()) {
            c2609 = m36102((AbstractC4308) c26010.f8240, c2609);
            c26010 = c26010.f8241;
        }
        return c2609;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m36187(C2609 c2609, C2609 c26010) {
        C2609 c2609M8239 = C2609.m8239();
        for (C2609 c26011 = c2609; c26011.m8249(); c26011 = c26011.f8241) {
            if (m36200((AbstractC4308) c26011.f8240, c26010)) {
                c2609M8239 = m36172((AbstractC4308) c26011.f8240, c2609M8239);
            }
        }
        while (c26010.m8249()) {
            if (m36200((AbstractC4308) c26010.f8240, c2609)) {
                c2609M8239 = m36172((AbstractC4308) c26010.f8240, c2609M8239);
            }
            c26010 = c26010.f8241;
        }
        return c2609M8239;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36184(AbstractC4308 abstractC4308) {
        boolean zM12913 = abstractC4308.m12913(EnumC9454.TYPEVAR);
        C6319 c6319 = this.f46788;
        if (zM12913) {
            return m36184(c6319.m17562(abstractC4308));
        }
        if (abstractC4308.m12913(EnumC9454.CLASS)) {
            C14163 c14163 = (C14163) abstractC4308.f13890;
            if (c14163.f17559 == EnumC1296.f4581) {
                return true;
            }
            C20661 c20661 = this.f46770;
            return c14163.mo16080((AbstractC5698) c20661.f66492.f13890, c6319) || c14163.mo16080((AbstractC5698) c20661.f66453.f13890, c6319);
        }
        return abstractC4308.m12913(EnumC9454.BOT);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m36197(C2609 c2609, C2609 c26010) {
        C2609 c2609M8239 = C2609.m8239();
        while (c2609.m8249()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) c2609.f8240;
            if (!m36184(abstractC4308) && !m36200(abstractC4308, c26010)) {
                c2609M8239 = c2609M8239.m8246((AbstractC4308) c2609.f8240);
            }
            c2609 = c2609.f8241;
        }
        return c2609M8239;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11576 m36052(C3581 c3581, C3581 c3582) {
        AbstractC5698 abstractC5698M16072 = c3581.m16072();
        AbstractC5698 abstractC5698M16073 = c3582.m16072();
        if ((c3582.f17561.mo16084() & 512) == 0) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "cant.override", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
        }
        if ((c3581.f17561.mo16084() & 512) == 0) {
            C11576 c11577 = C11886.f35440;
            return new C11576("compiler", "cant.implement", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
        }
        C11576 c11578 = C11886.f35440;
        return new C11576("compiler", "clashes.with", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11576 m36085(C3581 c3581, C3581 c3582) {
        AbstractC5698 abstractC5698M16072 = c3581.m16072();
        AbstractC5698 abstractC5698M16073 = c3582.m16072();
        if ((c3582.f17561.mo16084() & 512) == 0) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "unchecked.override", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
        }
        if ((c3581.f17561.mo16084() & 512) == 0) {
            C11576 c11577 = C11886.f35440;
            return new C11576("compiler", "unchecked.implement", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
        }
        C11576 c11578 = C11886.f35440;
        return new C11576("compiler", "unchecked.clash.with", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C11576 m36089(C3581 c3581, C3581 c3582) {
        AbstractC5698 abstractC5698M16072 = c3581.m16072();
        AbstractC5698 abstractC5698M16073 = c3582.m16072();
        if ((c3582.f17561.mo16084() & 512) == 0) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "varargs.override", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
        }
        if ((c3581.f17561.mo16084() & 512) == 0) {
            C11576 c11577 = C11886.f35440;
            return new C11576("compiler", "varargs.implement", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
        }
        C11576 c11578 = C11886.f35440;
        return new C11576("compiler", "varargs.clash.with", c3581, abstractC5698M16072, c3582, abstractC5698M16073);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36161(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, AbstractC4308 abstractC43010) {
        AbstractC4308 abstractC4308M17523;
        AbstractC4308 abstractC4308M17524;
        HashMap map;
        boolean z;
        AbstractC5698 abstractC5698;
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
        long jMo16084 = abstractC43010.f13890.mo16084() & 16777216;
        C6319 c6319 = this.f46788;
        long j3 = 0;
        if (jMo16084 != 0) {
            abstractC4308M17523 = c6319.m17523(abstractC4308);
            abstractC4308M17524 = c6319.m17523(abstractC4309);
        } else {
            abstractC4308M17523 = abstractC4308;
            abstractC4308M17524 = abstractC4309;
        }
        HashMap map4 = new HashMap();
        m36056(abstractC4308M17523, map4);
        if (abstractC4308M17523 == abstractC4308M17524) {
            map = map4;
        } else {
            map = new HashMap();
            m36057(abstractC4308M17524, map4, map);
        }
        Iterator it8 = map4.values().iterator();
        loop0: while (true) {
            boolean z2 = false;
            Predicate predicate = null;
            if (!it8.hasNext()) {
                z = false;
                abstractC5698 = null;
                break;
            }
            AbstractC4308 abstractC43011 = (AbstractC4308) it8.next();
            Iterator it9 = map.values().iterator();
            while (it9.hasNext()) {
                AbstractC4308 abstractC43012 = (AbstractC4308) it9.next();
                Iterator it10 = abstractC43011.f13890.mo16064().mo20475(predicate, EnumC1317.NON_RECURSIVE).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        map2 = map;
                        it = it8;
                        j = j3;
                        it2 = it9;
                        z = false;
                        abstractC5698 = null;
                        break;
                    }
                    AbstractC5698 abstractC5699 = (AbstractC5698) it10.next();
                    if (abstractC5699.f17559 == EnumC1296.f4571 && abstractC5699.mo10961((AbstractC5698) abstractC43010.f13890, c6319) && (abstractC5699.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == j3) {
                        C3581 c3581M10959 = ((C3581) abstractC5699).m10959(abstractC43010.f13890, c6319, z2);
                        C1386 c1386 = c6319.f19598;
                        if (c3581M10959 == null || (c3581M10959.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            Iterator it11 = abstractC43012.f13890.mo16064().m20476(abstractC5699.f17562).iterator();
                            AbstractC4308 abstractC4308M17543 = null;
                            while (true) {
                                if (it11.hasNext()) {
                                    abstractC5698 = (AbstractC5698) it11.next();
                                    if (abstractC5699 == abstractC5698) {
                                        map2 = map;
                                    } else {
                                        map2 = map;
                                        if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC5698.mo10961((AbstractC5698) abstractC43010.f13890, c6319)) {
                                            j = 0;
                                            if ((abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                                if (abstractC4308M17543 == null) {
                                                    abstractC4308M17543 = c6319.m17543(abstractC5699, abstractC43011);
                                                }
                                                AbstractC4308 abstractC4308M17544 = c6319.m17543(abstractC5698, abstractC43012);
                                                boolean zM17516 = c6319.m17516(abstractC4308M17543, abstractC4308M17544);
                                                it = it8;
                                                it6 = it11;
                                                C22364 c22364 = this.f46757;
                                                if (zM17516) {
                                                    C2609 c2609Mo12938 = abstractC4308M17543.mo12938();
                                                    it7 = it10;
                                                    C2609 c2609Mo12939 = abstractC4308M17544.mo12938();
                                                    it2 = it9;
                                                    AbstractC4308 abstractC4308Mo12923 = abstractC4308M17543.mo12923();
                                                    AbstractC4308 abstractC4308M17488 = c6319.m17488(abstractC4308M17544.mo12923(), c2609Mo12939, c2609Mo12938);
                                                    if (!c6319.m17550(abstractC4308Mo12923, abstractC4308M17488) && ((abstractC4308Mo12923.mo12907() || abstractC4308M17488.mo12907() || (!c6319.m17505(abstractC4308Mo12923, abstractC4308M17488, c1386) && !c6319.m17505(abstractC4308M17488, abstractC4308Mo12923, c1386))) && !m36166(abstractC5699, abstractC5698, abstractC43010))) {
                                                        AbstractC10370 abstractC10370 = abstractC5698.f17562;
                                                        C2609 c2609Mo12933 = c6319.m17543(abstractC5698, abstractC43012).mo12933();
                                                        C11576 c11576 = C11886.f35440;
                                                        C11576 c11577 = new C11576("compiler", "incompatible.diff.ret", abstractC10370, c2609Mo12933);
                                                        C12281 c12281 = C6241.f19132;
                                                        c22364.m7273(interfaceC3109, new C12281("compiler", "types.incompatible", abstractC43011, abstractC43012, c11577));
                                                        z = false;
                                                        break;
                                                    }
                                                } else {
                                                    it7 = it10;
                                                    it2 = it9;
                                                    C18770 c18770 = new C18770(this, ((C14163) abstractC43010.f13890).f17560);
                                                    if (c18770.m43432(abstractC5699) && c18770.m43432(abstractC5698) && c6319.m17506(abstractC5699.mo16091(c6319), abstractC5698.mo16091(c6319), true) && !m36166(abstractC5699, abstractC5698, abstractC43010)) {
                                                        AbstractC10370 abstractC10371 = abstractC5699.f17562;
                                                        C2609 c2609 = c6319.m17543(abstractC5699, abstractC43010).mo12945().f32059;
                                                        AbstractC5698 abstractC5698M16072 = abstractC5699.m16072();
                                                        AbstractC10370 abstractC10372 = abstractC5698.f17562;
                                                        C2609 c26010 = c6319.m17543(abstractC5698, abstractC43010).mo12945().f32059;
                                                        AbstractC5698 abstractC5698M16073 = abstractC5698.m16072();
                                                        C12281 c12282 = C6241.f19132;
                                                        c22364.m7273(interfaceC3109, new C12281("compiler", "name.clash.same.erasure.no.override", abstractC10371, c2609, abstractC5698M16072, abstractC10372, c26010, abstractC5698M16073));
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
                if (abstractC5698 != null) {
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
        if (abstractC5698 == null) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36056(AbstractC4308 abstractC4308, HashMap map) {
        if (abstractC4308.m12913(EnumC9454.CLASS) && map.put(abstractC4308.f13890, abstractC4308) == null) {
            C6319 c6319 = this.f46788;
            m36056(c6319.m17562(abstractC4308), map);
            Iterator it = c6319.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                m36056((AbstractC4308) it.next(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36057(AbstractC4308 abstractC4308, HashMap map, HashMap map2) {
        if (abstractC4308.m12913(EnumC9454.CLASS) && map.get(abstractC4308.f13890) == null && map2.put(abstractC4308.f13890, abstractC4308) == null) {
            C6319 c6319 = this.f46788;
            m36057(c6319.m17562(abstractC4308), map, map2);
            Iterator it = c6319.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                m36057((AbstractC4308) it.next(), map, map2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36166(AbstractC5698 abstractC5698, AbstractC5698 abstractC5699, AbstractC4308 abstractC4308) {
        HashMap map = new HashMap();
        C6319 c6319 = this.f46788;
        AbstractC4308 abstractC4308M17543 = c6319.m17543(abstractC5698, abstractC4308);
        AbstractC4308 abstractC4308M17544 = c6319.m17543(abstractC5699, abstractC4308);
        m36056(abstractC4308, map);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (AbstractC5698 abstractC56910 : ((AbstractC4308) it.next()).f13890.mo16064().m20476(abstractC5698.f17562)) {
                if (abstractC56910 != abstractC5698 && abstractC56910 != abstractC5699 && abstractC56910.f17559 == EnumC1296.f4571 && (abstractC56910.mo16084() & 2147487744L) == 0) {
                    AbstractC4308 abstractC4308M17545 = c6319.m17543(abstractC56910, abstractC4308);
                    if (c6319.m17516(abstractC4308M17545, abstractC4308M17543) && c6319.m17516(abstractC4308M17545, abstractC4308M17544) && c6319.m17561(abstractC4308M17545, abstractC4308M17543) && c6319.m17561(abstractC4308M17545, abstractC4308M17544)) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36120(C1755 c1755, final C8526 c8526, C3581 c3581) {
        C12281 c12281;
        C14163 c14163 = (C14163) c3581.f17561;
        c14163.mo16101();
        long j = c14163.f17563 & 16384;
        ?? r5 = this.f46757;
        C20661 c20661 = this.f46770;
        C6319 c6319 = this.f46788;
        if (j != 0 && this.f46777.f18891.equals(c3581.f17562) && c3581.mo10962(c20661.f66525, c14163, c6319, false)) {
            r5.m7273(c8526, C6241.f19193);
            return;
        }
        if (this.f46771 && c14163.m33810() && C5378.stream(c14163.m33811()).filter(new Predicate() { // from class: l.᩶ۗ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C3581 c3582 = ((C21221) obj).f68391;
                return c3582 == c8526.f26045 && (c3582.f17563 & 16777216) == 0;
            }
        }).findFirst().isPresent()) {
            return;
        }
        for (AbstractC4308 abstractC4308M17562 = c14163.f17560; abstractC4308M17562.m12913(EnumC9454.CLASS); abstractC4308M17562 = c6319.m17562(abstractC4308M17562)) {
            if (abstractC4308M17562 != c14163.f17560) {
                m36152((C8526) c8526, abstractC4308M17562, c14163, c3581);
            }
            Iterator it = c6319.m17510(abstractC4308M17562).iterator();
            while (it.hasNext()) {
                m36152((C8526) c8526, (AbstractC4308) it.next(), c14163, c3581);
            }
        }
        boolean z = c3581.m16065((AbstractC5698) c20661.f66521.f13890) != null;
        if (z || !(!((C8604) c1755.f6073).f26295 || c3581.m16075() || (c3581.f17563 & 7) == 2)) {
            if (c3581.f17559 == EnumC1296.f4571 && !c3581.mo15572()) {
                AbstractC19810 abstractC19810 = (AbstractC19810) c3581.f17561;
                for (AbstractC4308 abstractC4308 : c6319.m17547(abstractC19810.f17560)) {
                    if (abstractC4308 != abstractC19810.f17560) {
                        for (AbstractC5698 abstractC5698 : abstractC4308.f13890.mo16064().m20476(c3581.f17562)) {
                            if (!abstractC5698.mo15572() && c3581.mo10962(abstractC5698, abstractC19810, c6319, true)) {
                                return;
                            }
                        }
                    }
                }
            }
            for (C17551 c17551 : c8526.f26046.f7168) {
                if (c17551.f53650.f16086.f13890 == c20661.f66521.f13890) {
                    c8526 = c17551;
                    break;
                }
            }
            if (z) {
                c12281 = c3581.mo15572() ? C6241.f19164 : C6241.f19178;
            } else {
                C12281 c12282 = C6241.f19132;
                c12281 = new C12281("compiler", "anonymous.diamond.method.does.not.override.superclass", C11886.f35447);
            }
            r5.m7273(c8526, c12281);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36152(C8526 c8526, AbstractC4308 abstractC4308, C14163 c14163, C3581 c3581) {
        for (AbstractC5698 abstractC5698 : abstractC4308.f13890.mo16064().m20476(c3581.f17562)) {
            if (c3581.mo10962(abstractC5698, c14163, this.f46788, false) && (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                m36138(c8526, c3581, (C3581) abstractC5698, c14163);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36139(AbstractC5144 abstractC5144, C14163 c14163) {
        C2609 c2609M17510;
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC4308 = c20661.f66526;
        AbstractC4308 abstractC4309 = c20661.f66526;
        if (c14163 == ((C14163) abstractC4308.f13890) || c14163.m16070() || c14163.m16090()) {
            return;
        }
        c14163.mo16101();
        if ((c14163.f17563 & 8192) == 0) {
            c14163.mo16101();
            if ((c14163.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                return;
            }
            boolean zIsEmpty = c14163.f17562.isEmpty();
            C6319 c6319 = this.f46788;
            if (!zIsEmpty || (c2609M17510 = c6319.m17510(c14163.f17560)) == null || c2609M17510.isEmpty() || ((AbstractC4308) c2609M17510.f8240).f13890 != c20661.f66464.f13890) {
                C4824 c4824 = this.f46756;
                EnumC20347 enumC20347 = EnumC20347.OVERRIDES;
                if (c4824.m14055(enumC20347)) {
                    AbstractC14016 abstractC14016Mo16064 = abstractC4309.f13890.mo16064();
                    C6136 c6136 = this.f46777;
                    C3581 c3581 = (C3581) abstractC14016Mo16064.mo20478(c6136.f18871, (Predicate) null);
                    C3581 c3582 = (C3581) abstractC4309.f13890.mo16064().mo20478(c6136.f18794, (Predicate) null);
                    C4464 c4464 = this.f46759;
                    C3581 c3581M17485 = c6319.m17485(c3581, (AbstractC19810) c14163, false, (Predicate) c4464);
                    boolean z = c3581M17485 != null && c3581M17485.f17561 == c14163;
                    boolean z2 = c6319.m17485(c3582, (AbstractC19810) c14163, false, (Predicate) c4464) != c3582;
                    if (!z || z2) {
                        return;
                    }
                    C11076 c11076 = C14001.f42334;
                    this.f46757.m7286(enumC20347, abstractC5144, new C11076("compiler", "override.equals.but.not.hashcode", c14163));
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36132(C3587 c3587) {
        AbstractC12612 abstractC12612;
        C6262 c6262;
        AbstractC10370 abstractC10370;
        AbstractC12612 abstractC12613;
        InterfaceC3109 interfaceC3109;
        C12171.m29637(c3587.f11377.f17562);
        if (this.f46756.m14055(EnumC20347.MODULE)) {
            AbstractC12612 abstractC12614 = c3587.f11378;
            while (abstractC12612 != null) {
                int i = C2542.f8065[abstractC12612.mo989().ordinal()];
                if (i == 1) {
                    c6262 = (C6262) abstractC12612;
                    abstractC10370 = c6262.f19395;
                    abstractC12613 = c6262.f19397;
                } else if (i == 2) {
                    abstractC10370 = ((C7673) abstractC12612).f23696;
                    abstractC12613 = null;
                } else {
                    abstractC12612 = abstractC12614;
                    throw new AssertionError("Unexpected qualified identifier: " + abstractC12612.toString());
                }
                if (abstractC10370 != null) {
                    abstractC12612 = abstractC12614;
                    interfaceC3109 = c6262;
                    String string = abstractC10370.toString();
                    int length = string.length();
                    if (length <= 0 || !Character.isDigit(string.charAt(length - 1))) {
                        abstractC12612 = abstractC12614;
                        interfaceC3109 = abstractC12612;
                    } else {
                        abstractC12612 = abstractC12614;
                        interfaceC3109 = abstractC12612;
                        EnumC20347 enumC20347 = EnumC20347.MODULE;
                        C11076 c11076 = C14001.f42334;
                        this.f46757.m7286(enumC20347, interfaceC3109, new C11076("compiler", "poor.choice.for.module.name", abstractC10370));
                    }
                } else {
                    abstractC12612 = abstractC12614;
                    interfaceC3109 = c6262;
                    abstractC12612 = abstractC12614;
                    interfaceC3109 = abstractC12612;
                }
                abstractC12612 = abstractC12613;
            }
            abstractC12612 = abstractC12614;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36157(C14163 c14163, InterfaceC3109 interfaceC3109) {
        C6319 c6319 = this.f46788;
        C3581 c3581M17486 = c6319.m17486(c14163);
        if (c3581M17486 != null) {
            C3581 c3581 = new C3581(c3581M17486.f17563, c3581M17486.f17562, c6319.m17543(c3581M17486, c14163.f17560), c3581M17486.f17561);
            AbstractC5698 abstractC5698M16072 = c3581.m16072();
            C12281 c12281 = C6241.f19132;
            this.f46757.m7273(interfaceC3109, new C12281("compiler", "does.not.override.abstract", c14163, c3581, abstractC5698M16072));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36186(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        m36083(interfaceC3109, abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36159(C14315 c14315, C8541 c8541) {
        m36061(c14315, c8541, C2609.m8239());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36061(C14315 c14315, AbstractC4308 abstractC4308, C2609 c2609) {
        EnumC9454 enumC9454 = EnumC9454.TYPEVAR;
        if (!abstractC4308.m12913(enumC9454) || (abstractC4308.f13890.mo16084() & 268435456) == 0) {
            boolean zContains = c2609.contains(abstractC4308);
            C6319 c6319 = this.f46788;
            if (zContains) {
                ((C8541) abstractC4308).mo21267(c6319.m17535(abstractC4308));
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(c14315, new C12281("compiler", "cyclic.inheritance", abstractC4308));
            } else if (abstractC4308.m12913(enumC9454)) {
                C8541 c8541 = (C8541) abstractC4308;
                C2609 c2609M8246 = c2609.m8246(c8541);
                Iterator it = c6319.m17484(c8541).iterator();
                while (it.hasNext()) {
                    m36061(c14315, (AbstractC4308) it.next(), c2609M8246);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m36083(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        boolean zM36083;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        long j = abstractC19810.f17563;
        if ((j & 1073741824) != 0) {
            return true;
        }
        if ((j & 134217728) != 0) {
            m36091((C14163) abstractC19810, interfaceC3109);
        } else {
            if (!abstractC19810.f17560.mo12948()) {
                try {
                    abstractC19810.f17563 = 134217728 | abstractC19810.f17563;
                    if (abstractC19810.f17560.m12913(EnumC9454.CLASS)) {
                        C19955 c19955 = (C19955) abstractC19810.f17560;
                        C2609 c2609 = c19955.f64620;
                        zM36083 = true;
                        if (c2609 != null) {
                            while (c2609.m8249()) {
                                zM36083 &= m36083(interfaceC3109, (AbstractC4308) c2609.f8240);
                                c2609 = c2609.f8241;
                            }
                        }
                        AbstractC4308 abstractC4309 = c19955.f64618;
                        if (abstractC4309 != null && abstractC4309 != null && abstractC4309.m12913(EnumC9454.CLASS)) {
                            zM36083 &= m36083(interfaceC3109, abstractC4309);
                        }
                        AbstractC5698 abstractC5698 = abstractC19810.f17561;
                        if (abstractC5698.f17559 == EnumC1296.f4582) {
                            zM36083 &= m36083(interfaceC3109, abstractC5698.f17560);
                        }
                    } else {
                        zM36083 = true;
                    }
                    abstractC19810.f17563 = (-134217729) & abstractC19810.f17563;
                } catch (Throwable th) {
                    abstractC19810.f17563 = (-134217729) & abstractC19810.f17563;
                    throw th;
                }
            }
            if (zM36083) {
                zM36083 = (abstractC19810.f17563 & 268435456) != 0 && abstractC19810.f17564.mo7078();
            }
            if (zM36083) {
                abstractC19810.f17563 |= 1073741824;
            }
            return zM36083;
        }
        zM36083 = true;
        if (zM36083) {
            zM36083 = (abstractC19810.f17563 & 268435456) != 0 && abstractC19810.f17564.mo7078();
        }
        if (zM36083) {
            abstractC19810.f17563 |= 1073741824;
        }
        return zM36083;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m36091(C14163 c14163, InterfaceC3109 interfaceC3109) {
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(interfaceC3109, new C12281("compiler", "cyclic.inheritance", c14163));
        AbstractC4308 abstractC4308 = c14163.f17560;
        C6319 c6319 = this.f46788;
        for (C2609 c2609M17510 = c6319.m17510(abstractC4308); c2609M17510.m8249(); c2609M17510 = c2609M17510.f8241) {
            c2609M17510.f8240 = new C12193((C14163) ((AbstractC4308) c2609M17510.f8240).f13890, AbstractC4308.f13885);
        }
        AbstractC4308 abstractC4308M17562 = c6319.m17562(c14163.f17560);
        if (abstractC4308M17562.m12913(EnumC9454.CLASS)) {
            ((C19955) c14163.f17560).f64618 = new C12193((C14163) abstractC4308M17562.f13890, AbstractC4308.f13885);
        }
        c14163.f17560 = new C12193(c14163, c14163.f17560);
        c14163.f17563 |= 1073741824;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36140(AbstractC5144 abstractC5144, C14163 c14163, C14163 c14164) {
        C3581 c3581;
        C3581 c3581M10959;
        AbstractC4308 abstractC4308 = c14164.f17560;
        C6319 c6319 = this.f46788;
        for (C2609 c2609M17547 = c6319.m17547(abstractC4308); c2609M17547.m8249(); c2609M17547 = c2609M17547.f8241) {
            C14163 c14165 = (C14163) ((AbstractC4308) c2609M17547.f8240).f13890;
            c14165.mo16101();
            if ((c14165.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                c14165.mo16101();
                for (AbstractC5698 abstractC5698 : c14165.f42762.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 1032) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && (c3581M10959 = (c3581 = (C3581) abstractC5698).m10959(c14163, c6319, false)) != null && c3581M10959 != c3581) {
                        long jMo16084 = c3581M10959.f17561.mo16084() & 512;
                        c14163.mo16101();
                        if (jMo16084 == (512 & c14163.f17563)) {
                            m36138(abstractC5144, c3581M10959, c3581, c14163);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36190(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        long j;
        C6319 c6319 = this.f46788;
        C2609 c2609M17510 = c6319.m17510(abstractC4308);
        AbstractC4308 abstractC4308M17562 = c6319.m17562(abstractC4308);
        long j2 = 0;
        if (abstractC4308M17562.m12913(EnumC9454.CLASS) && (abstractC4308M17562.f13890.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            c2609M17510 = c2609M17510.m8246(abstractC4308M17562);
        }
        for (C2609 c2609 = c2609M17510; c2609.m8249(); c2609 = c2609.f8241) {
            if (!((AbstractC4308) c2609.f8240).mo12938().isEmpty()) {
                AbstractC4308 abstractC4309 = (AbstractC4308) c2609.f8240;
                if (!m36161(interfaceC3109, abstractC4309, abstractC4309, abstractC4308)) {
                    return;
                }
            }
            for (C2609 c26010 = c2609M17510; c26010 != c2609; c26010 = c26010.f8241) {
                if (!m36161(interfaceC3109, (AbstractC4308) c2609.f8240, (AbstractC4308) c26010.f8240, abstractC4308)) {
                    return;
                }
            }
        }
        AbstractC4308 abstractC4308M17563 = c6319.m17562(abstractC4308);
        if (abstractC4308M17563.m12913(EnumC9454.CLASS)) {
            for (AbstractC4308 abstractC4308M17564 = abstractC4308M17563; abstractC4308M17564.m12913(EnumC9454.CLASS) && abstractC4308M17564.f13890.f17560.mo12917(); abstractC4308M17564 = c6319.m17562(abstractC4308M17564)) {
                for (AbstractC5698 abstractC5698 : abstractC4308M17564.f13890.mo16064().mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571) {
                        long j3 = 2147487752L;
                        if ((abstractC5698.mo16084() & 2147487752L) == j2 && abstractC5698.mo10961((AbstractC5698) abstractC4308.f13890, c6319)) {
                            boolean z = true;
                            if (((C3581) abstractC5698).m10959(abstractC4308.f13890, c6319, true) == abstractC5698) {
                                AbstractC4308 abstractC4308M17543 = c6319.m17543(abstractC5698, abstractC4308M17564);
                                int iM8245 = abstractC4308M17543.mo12933().m8245();
                                if (abstractC4308M17543 != abstractC5698.f17560) {
                                    AbstractC4308 abstractC4308M17565 = abstractC4308M17563;
                                    while (abstractC4308M17565.m12913(EnumC9454.CLASS)) {
                                        for (AbstractC5698 abstractC5699 : abstractC4308M17565.f13890.mo16064().m20476(abstractC5698.f17562)) {
                                            if (abstractC5699 == abstractC5698) {
                                                j = j3;
                                            } else if (abstractC5699.f17559 == EnumC1296.f4571) {
                                                j = 2147487752L;
                                                if ((abstractC5699.mo16084() & 2147487752L) == 0 && abstractC5699.f17560.mo12933().m8245() == iM8245 && abstractC5699.mo10961((AbstractC5698) abstractC4308.f13890, c6319) && ((C3581) abstractC5699).m10959(abstractC4308.f13890, c6319, z) == abstractC5699) {
                                                    if (c6319.m17516(abstractC4308M17543, c6319.m17543(abstractC5699, abstractC4308M17565))) {
                                                        C12281 c12281 = C6241.f19132;
                                                        Object[] objArr = new Object[5];
                                                        objArr[0] = abstractC5698;
                                                        objArr[z ? 1 : 0] = abstractC4308M17564;
                                                        objArr[2] = abstractC5699;
                                                        objArr[3] = abstractC4308M17565;
                                                        objArr[4] = abstractC4308M17563;
                                                        this.f46757.m7273(interfaceC3109, new C12281("compiler", "concrete.inheritance.conflict", objArr));
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                j = 2147487752L;
                                            }
                                            j3 = j;
                                        }
                                        abstractC4308M17565 = c6319.m17562(abstractC4308M17565);
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36181(C8526 c8526, AbstractC4308 abstractC4308, C3581 c3581) {
        C18770 c18770 = new C18770(this, abstractC4308);
        C2609 c2609M8239 = C2609.m8239();
        final ArrayList<AbstractC5698> arrayList = new ArrayList();
        C6319 c6319 = this.f46788;
        boolean z = false;
        C19846.forEach(c6319.m17498(abstractC4308, false).mo20477(c3581.f17562, c18770, EnumC1317.RECURSIVE), new Consumer() { // from class: l.ۗۗ֨
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                arrayList.add((AbstractC5698) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
        boolean z2 = false;
        for (AbstractC5698 abstractC5698 : arrayList) {
            if (c3581.mo10962(abstractC5698, abstractC4308.f13890, c6319, z)) {
                if (abstractC5698 != c3581) {
                    c2609M8239 = C2609.m8239();
                    z2 = true;
                }
                for (AbstractC5698 abstractC5699 : arrayList) {
                    if (abstractC5699 != abstractC5698) {
                        if (!c6319.m17532(c3581.f17560, c6319.m17543(abstractC5699, abstractC4308), EnumC10637.f32011.m26686(this.f46774)) && c6319.m17506(abstractC5699.mo16091(c6319), abstractC5698.mo16091(c6319), true)) {
                            c3581.f17563 |= 4398046511104L;
                            C22364 c22364 = this.f46757;
                            if (abstractC5698 == c3581) {
                                AbstractC10370 abstractC10370 = abstractC5698.f17562;
                                C2609 c2609 = c6319.m17543(abstractC5698, abstractC4308).mo12945().f32059;
                                AbstractC5698 abstractC5698M16072 = abstractC5698.m16072();
                                AbstractC10370 abstractC10371 = abstractC5699.f17562;
                                C2609 c26010 = c6319.m17543(abstractC5699, abstractC4308).mo12945().f32059;
                                AbstractC5698 abstractC5698M16073 = abstractC5699.m16072();
                                C12281 c12281 = C6241.f19132;
                                c22364.m7273(c8526, new C12281("compiler", "name.clash.same.erasure.no.override", abstractC10370, c2609, abstractC5698M16072, abstractC10371, c26010, abstractC5698M16073));
                                return;
                            }
                            C19955 c19955 = (C19955) abstractC4308;
                            String str = c19955.mo12925() ? "interface" : Name.LABEL;
                            AbstractC10370 abstractC10372 = c19955.f13890.f17562;
                            AbstractC10370 abstractC10373 = abstractC5698.f17562;
                            C2609 c26011 = c6319.m17543(abstractC5698, abstractC4308).mo12945().f32059;
                            AbstractC5698 abstractC5698M16074 = abstractC5698.m16072();
                            AbstractC10370 abstractC10374 = abstractC5699.f17562;
                            C2609 c26012 = c6319.m17543(abstractC5699, abstractC4308).mo12945().f32059;
                            AbstractC5698 abstractC5698M16075 = abstractC5699.m16072();
                            C12281 c12282 = C6241.f19132;
                            c22364.m7273(c8526, new C12281("compiler", "name.clash.same.erasure.no.override.1", str, abstractC10372, abstractC10373, c26011, abstractC5698M16074, abstractC10374, c26012, abstractC5698M16075));
                            return;
                        }
                        z = false;
                    }
                }
            } else if (abstractC5698 != c3581 && !z2) {
                c2609M8239 = c2609M8239.m8246((C3581) abstractC5698);
            }
        }
        if (z2) {
            return;
        }
        Iterator it = c2609M8239.iterator();
        while (it.hasNext()) {
            m36151(c8526, abstractC4308, c3581, (C3581) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36150(C8526 c8526, AbstractC4308 abstractC4308, C3581 c3581) {
        C18770 c18770 = new C18770(this, abstractC4308);
        C6319 c6319 = this.f46788;
        for (AbstractC5698 abstractC5698 : c6319.m17498(abstractC4308, true).mo20477(c3581.f17562, c18770, EnumC1317.RECURSIVE)) {
            if (!c6319.m17532(c3581.f17560, c6319.m17543(abstractC5698, abstractC4308), EnumC10637.f32011.m26686(this.f46774))) {
                if (c6319.m17506(abstractC5698.mo16091(c6319), c3581.mo16091(c6319), true)) {
                    AbstractC5698 abstractC5698M16072 = c3581.m16072();
                    AbstractC5698 abstractC5698M16073 = abstractC5698.m16072();
                    C12281 c12281 = C6241.f19132;
                    this.f46757.m7273(c8526, new C12281("compiler", "name.clash.same.erasure.no.hide", c3581, abstractC5698M16072, abstractC5698, abstractC5698M16073));
                    return;
                }
                m36151(c8526, abstractC4308, c3581, (C3581) abstractC5698);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36195(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        char c;
        AbstractC5698 abstractC5698;
        C11576 c11576;
        C5364 c5364 = new C5364(this, abstractC4308);
        C6319 c6319 = this.f46788;
        for (AbstractC5698 abstractC5699 : c6319.m17498(abstractC4308, false).mo20475(c5364, EnumC1317.RECURSIVE)) {
            int i = 1;
            C12171.m29642(abstractC5699.f17559 == EnumC1296.f4571);
            C2609 c2609M17483 = c6319.m17483(abstractC4308, (C3581) abstractC5699);
            if (c2609M17483.m8245() > 1) {
                C18837 c18837 = new C18837();
                C18837 c18838 = new C18837();
                Iterator it = c2609M17483.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3581 c3581 = (C3581) it.next();
                        long j = c3581.f17563;
                        if ((8796093022208L & j) != 0) {
                            c18838.m43511(c3581);
                        } else if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            c18837.m43511(c3581);
                        }
                        if (c18838.m43518() && c18837.size() + c18838.size() >= 2) {
                            AbstractC5698 abstractC56910 = (AbstractC5698) c18838.first();
                            if (c18838.size() > i) {
                                abstractC5698 = (AbstractC5698) c18838.m43517().f8241.f8240;
                                EnumC8352 enumC8352M49076 = C21758.m49076(abstractC4308.f13890);
                                AbstractC10370 abstractC10370 = abstractC5699.f17562;
                                C2609 c2609Mo12933 = c6319.m17543(abstractC5699, abstractC4308).mo12933();
                                AbstractC5698 abstractC5698M16072 = abstractC56910.m16072();
                                AbstractC5698 abstractC5698M16073 = abstractC5698.m16072();
                                C11576 c11577 = C11886.f35440;
                                c = 1;
                                c11576 = new C11576("compiler", "incompatible.unrelated.defaults", enumC8352M49076, abstractC4308, abstractC10370, c2609Mo12933, abstractC5698M16072, abstractC5698M16073);
                            } else {
                                c = 1;
                                abstractC5698 = (AbstractC5698) c18837.first();
                                EnumC8352 enumC8352M49077 = C21758.m49076(abstractC4308.f13890);
                                AbstractC10370 abstractC10371 = abstractC5699.f17562;
                                C2609 c2609Mo12934 = c6319.m17543(abstractC5699, abstractC4308).mo12933();
                                AbstractC5698 abstractC5698M16074 = abstractC56910.m16072();
                                AbstractC5698 abstractC5698M16075 = abstractC5698.m16072();
                                C11576 c11578 = C11886.f35440;
                                c11576 = new C11576("compiler", "incompatible.abstract.default", enumC8352M49077, abstractC4308, abstractC10371, c2609Mo12934, abstractC5698M16074, abstractC5698M16075);
                            }
                            AbstractC4308 abstractC4309 = abstractC56910.m16072().f17560;
                            AbstractC4308 abstractC43010 = abstractC5698.m16072().f17560;
                            C12281 c12281 = C6241.f19132;
                            Object[] objArr = new Object[3];
                            objArr[0] = abstractC4309;
                            objArr[c] = abstractC43010;
                            objArr[2] = c11576;
                            this.f46757.m7273(interfaceC3109, new C12281("compiler", "types.incompatible", objArr));
                            break;
                        }
                        i = 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36151(C8526 c8526, AbstractC4308 abstractC4308, C3581 c3581, C3581 c3582) {
        if (c3581 != c3582 && EnumC10637.f31991.m26686(this.f46774) && this.f46756.m14055(EnumC20347.OVERLOADS) && (c3581.f17563 & 281474976710656L) == 0 && (c3582.f17563 & 281474976710656L) == 0) {
            C6319 c6319 = this.f46788;
            AbstractC4308 abstractC4308M17543 = c6319.m17543(c3581, abstractC4308);
            AbstractC4308 abstractC4308M17544 = c6319.m17543(c3582, abstractC4308);
            EnumC9454 enumC9454 = EnumC9454.FORALL;
            if (abstractC4308M17543.m12913(enumC9454) && abstractC4308M17544.m12913(enumC9454)) {
                C10077 c10077 = (C10077) abstractC4308M17543;
                C10077 c10078 = (C10077) abstractC4308M17544;
                if (c6319.m17507(c10077, c10078)) {
                    abstractC4308M17544 = c6319.m17488(abstractC4308M17544, c10078.f30362, c10077.f30362);
                }
            }
            int iMax = Math.max(abstractC4308M17543.mo12933().m8245(), abstractC4308M17544.mo12933().m8245());
            C2609 c2609Mo12933 = abstractC4308M17543.mo12933();
            C22406 c22406 = this.f46760;
            C2609 c2609M50299 = c22406.m50299(c2609Mo12933, (AbstractC5698) c3581, iMax, true);
            C2609 c2609M502910 = c22406.m50299(abstractC4308M17544.mo12933(), (AbstractC5698) c3582, iMax, true);
            if (c2609M50299.m8245() != c2609M502910.m8245()) {
                return;
            }
            boolean z = false;
            while (c2609M50299.m8249() && c2609M502910.m8249()) {
                AbstractC4308 abstractC4309 = (AbstractC4308) c2609M50299.f8240;
                AbstractC4308 abstractC43010 = (AbstractC4308) c2609M502910.f8240;
                if (!c6319.m17546(abstractC43010, abstractC4309, true) && !c6319.m17546(abstractC4309, abstractC43010, true)) {
                    if (!c6319.m17558(abstractC4309) || !c6319.m17558(abstractC43010) || c6319.m17538(abstractC4309).mo12933().m8245() <= 0 || c6319.m17538(abstractC4309).mo12933().m8245() != c6319.m17538(abstractC43010).mo12933().m8245()) {
                        return;
                    } else {
                        z = true;
                    }
                }
                c2609M50299 = c2609M50299.f8241;
                c2609M502910 = c2609M502910.f8241;
            }
            if (z) {
                c3581.f17563 |= 281474976710656L;
                c3582.f17563 |= 281474976710656L;
                EnumC20347 enumC20347 = EnumC20347.OVERLOADS;
                AbstractC5698 abstractC5698M16072 = c3581.m16072();
                AbstractC5698 abstractC5698M16073 = c3582.m16072();
                C11076 c11076 = C14001.f42334;
                this.f46757.m7286(enumC20347, c8526, new C11076("compiler", "potentially.ambiguous.overload", c3581, abstractC5698M16072, c3582, abstractC5698M16073));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36155(AbstractC12612 abstractC12612, boolean z) {
        if (!this.f46766) {
            C4824 c4824 = this.f46756;
            EnumC20347 enumC20347 = EnumC20347.SERIAL;
            if (!c4824.m14055(enumC20347) || this.f46756.m14056(enumC20347) || !z) {
                return;
            }
        }
        AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC12612);
        if (abstractC5698M19472.f17559.m4391(C15406.f47185)) {
            if (abstractC5698M19472.f17559 == EnumC1296.f4567) {
                if ((abstractC5698M19472.mo16084() & 8589934592L) != 0 || abstractC5698M19472.m16077()) {
                    return;
                }
                AbstractC10370 abstractC10370 = abstractC5698M19472.f17562;
                C6136 c6136 = this.f46777;
                if (abstractC10370 == c6136.f18886 || abstractC10370 == c6136.f18898) {
                    return;
                }
            }
            AbstractC4308 abstractC4308 = abstractC5698M19472.f17561.f17560;
            C20661 c20661 = this.f46770;
            if (this.f46788.m17546(abstractC4308, c20661.f66487, true) || abstractC5698M19472.m16089() == c20661.f66473) {
                return;
            }
            for (AbstractC5698 abstractC5698 = abstractC5698M19472; abstractC5698.f17559 != EnumC1296.f4579; abstractC5698 = abstractC5698.f17561) {
                if ((abstractC5698.mo16084() & 1) == 0) {
                    C22364 c22364 = this.f46757;
                    if (!z) {
                        C11076 c11076 = C14001.f42334;
                        c22364.m7285(abstractC12612, new C11076("compiler", "access.to.member.from.serializable.element", abstractC5698M19472));
                        return;
                    }
                    String string = abstractC5698M19472.m16089().f24143.toString();
                    if (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.contains(".internal.")) {
                        EnumC20347 enumC20348 = EnumC20347.SERIAL;
                        C11076 c11077 = C14001.f42334;
                        c22364.m7286(enumC20348, abstractC12612, new C11076("compiler", "access.to.member.from.serializable.lambda", abstractC5698M19472));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36124(InterfaceC3109 interfaceC3109, HashMap map, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12948()) {
            return;
        }
        C6319 c6319 = this.f46788;
        for (C2609 c2609M17510 = c6319.m17510(abstractC4308); c2609M17510.m8249(); c2609M17510 = c2609M17510.f8241) {
            AbstractC4308 abstractC4309 = (AbstractC4308) c2609M17510.f8240;
            EnumC9454 enumC9454 = EnumC9454.CLASS;
            if (!abstractC4308.m12913(enumC9454) || abstractC4309.m12913(enumC9454)) {
                AbstractC4308 abstractC43010 = (AbstractC4308) map.put(abstractC4309.f13890, abstractC4309);
                if (abstractC43010 != null) {
                    C2609 c2609Mo12934 = abstractC43010.mo12934();
                    C2609 c2609Mo12935 = abstractC4309.mo12934();
                    if (!c6319.m17529(c2609Mo12934, c2609Mo12935)) {
                        AbstractC19810 abstractC19810 = abstractC4309.f13890;
                        String strM12906 = AbstractC4308.m12906(c2609Mo12934);
                        String strM12907 = AbstractC4308.m12906(c2609Mo12935);
                        C12281 c12281 = C6241.f19132;
                        this.f46757.m7273(interfaceC3109, new C12281("compiler", "cant.inherit.diff.arg", abstractC19810, strM12906, strM12907));
                    }
                }
                m36124(interfaceC3109, map, abstractC4309);
            }
        }
        AbstractC4308 abstractC4308M17562 = c6319.m17562(abstractC4308);
        EnumC9454 enumC9455 = EnumC9454.CLASS;
        if ((!abstractC4308.m12913(enumC9455) || abstractC4308M17562.m12913(enumC9455)) && abstractC4308M17562 != AbstractC4308.f13885) {
            m36124(interfaceC3109, map, abstractC4308M17562);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36154(AbstractC12612 abstractC12612, AbstractC4308 abstractC4308, HashSet hashSet) {
        if (hashSet.contains(abstractC4308)) {
            this.f46757.m7273(abstractC12612, C6241.f19234);
        } else {
            hashSet.add(abstractC4308);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36179(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            m36170(abstractC5144, abstractC5144.f16086);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m36170(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12941()) {
            return;
        }
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC4309 = c20661.f66533;
        C6319 c6319 = this.f46788;
        if (!c6319.m17550(abstractC4308, abstractC4309) && (abstractC4308.f13890.mo16084() & 16384) == 0 && (abstractC4308.f13890.mo16084() & 8192) == 0 && C6319.m17474(abstractC4308).f13890 != c20661.f66514.f13890) {
            if (c6319.m17512(abstractC4308) && !c6319.m17512(c6319.m17515(abstractC4308))) {
                m36170(interfaceC3109, c6319.m17515(abstractC4308));
            } else {
                this.f46757.m7273(interfaceC3109, C6241.f19272);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36148(C8526 c8526, C3581 c3581) {
        C6319 c6319;
        AbstractC4308 abstractC4308M17562 = this.f46770.f66485;
        while (abstractC4308M17562.m12913(EnumC9454.CLASS)) {
            Iterator it = abstractC4308M17562.f13890.mo16064().m20476(c3581.f17562).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c6319 = this.f46788;
                if (zHasNext) {
                    AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                    if (abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 5) != 0 && c6319.m17516(c3581.f17560, abstractC5698.f17560)) {
                        C12281 c12281 = C6241.f19132;
                        this.f46757.m7273(c8526, new C12281("compiler", "intf.annotation.member.clash", abstractC5698, abstractC4308M17562));
                    }
                }
            }
            abstractC4308M17562 = c6319.m17562(abstractC4308M17562);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36145(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144, C2609 c2609) {
        Set set;
        boolean z;
        boolean z2;
        C2176 c2176M19470;
        C18837 c18837;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C17551 c17551 = (C17551) it.next();
            c17551.mo988(new C6775(this));
            boolean z3 = (abstractC5698.f17563 & 2305843009213693952L) != 0 || (abstractC5698.m16071() != null && abstractC5698.m16071().m33810());
            boolean z4 = (2305843009213693952L & abstractC5698.f17563) != 0 && abstractC5144.m14709(EnumC18550.f57578) && abstractC5698.f17561.f17559 == EnumC1296.f4582;
            int i = 2;
            C6136 c6136 = this.f46777;
            C22364 c22364 = this.f46757;
            if (z4) {
                AbstractC10370[] abstractC10370ArrM36185 = m36185(c17551.f53650.f16086.f13890);
                int length = abstractC10370ArrM36185.length;
                boolean z5 = false;
                for (int i2 = 0; i2 < length; i2++) {
                    AbstractC10370 abstractC10370 = abstractC10370ArrM36185[i2];
                    z5 = abstractC10370 == c6136.f18808 || abstractC10370 == c6136.f18850 || abstractC10370 == c6136.f18885 || abstractC10370 == c6136.f18785 || abstractC10370 == c6136.f18789;
                    if (z5) {
                        break;
                    }
                }
                if (!z5) {
                    c22364.m7273(c17551, C6241.f19258);
                } else {
                    C21221 c21221M33803 = ((C14163) abstractC5698.f17561).m33803((C12048) abstractC5698);
                    C11343 c11343M16085 = c21221M33803.m16085();
                    if (c11343M16085 == null || c11343M16085.m28046()) {
                        c21221M33803.m16066((C2609) C5378.stream(abstractC5698.mo16068()).filter(new C3379(i, this)).collect(C2609.m8240()));
                    }
                }
            }
            boolean zMo33814 = c17551.f16086.f13890.mo33814();
            C20661 c20661 = this.f46770;
            if (zMo33814) {
                C16646 c16646M36114 = m36114(c17551, abstractC5698);
                if (!c16646M36114.isEmpty()) {
                    Set set2 = (Set) c16646M36114.get();
                    boolean z6 = set2.isEmpty() || (set2.size() == 1 && set2.contains(c6136.f18785));
                    if (z3) {
                        set = set2;
                        z = (abstractC5698.f17563 & 16777216) != 0;
                        if (z || !z6) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (set.isEmpty() || z2) {
                            if (z2) {
                                c2176M19470 = C7260.m19470(abstractC5144);
                                if (c2176M19470 != null && set.isEmpty()) {
                                    c18837 = new C18837();
                                    for (C17551 c17552 : c2176M19470.f7168) {
                                        if (c17552 != c17551) {
                                            c18837.m43511(c17552);
                                        }
                                    }
                                    c2176M19470.f7168 = c18837.m43517();
                                }
                                abstractC5698.m16085().m28036(c17551.f53652);
                            } else {
                                c22364.m7273(c17551, C6241.f19258);
                            }
                        }
                        if (z && !z4 && c17551.f16086.f13890 == c20661.f66504.f13890 && abstractC5144.m14709(EnumC18550.f57511)) {
                            AbstractC19810 abstractC19810 = c20661.f66504.f13890;
                            C11576 c11576 = C11886.f35440;
                            C11576 c11577 = new C11576("compiler", "varargs.trustme.on.non.varargs.accessor", abstractC5698);
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(c17551, new C12281("compiler", "varargs.invalid.trustme.anno", abstractC19810, c11577));
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
                            c2176M19470 = C7260.m19470(abstractC5144);
                            if (c2176M19470 != null) {
                                c18837 = new C18837();
                                while (r10.hasNext()) {
                                    if (c17552 != c17551) {
                                        c18837.m43511(c17552);
                                    }
                                }
                                c2176M19470.f7168 = c18837.m43517();
                            }
                            abstractC5698.m16085().m28036(c17551.f53652);
                        } else {
                            c22364.m7273(c17551, C6241.f19258);
                        }
                    } else if (z2) {
                        c2176M19470 = C7260.m19470(abstractC5144);
                        if (c2176M19470 != null) {
                            c18837 = new C18837();
                            while (r10.hasNext()) {
                                if (c17552 != c17551) {
                                    c18837.m43511(c17552);
                                }
                            }
                            c2176M19470.f7168 = c18837.m43517();
                        }
                        abstractC5698.m16085().m28036(c17551.f53652);
                    } else {
                        c22364.m7273(c17551, C6241.f19258);
                    }
                    if (z) {
                        AbstractC19810 abstractC19811 = c20661.f66504.f13890;
                        C11576 c11578 = C11886.f35440;
                        C11576 c11579 = new C11576("compiler", "varargs.trustme.on.non.varargs.accessor", abstractC5698);
                        C12281 c12282 = C6241.f19132;
                        c22364.m7273(c17551, new C12281("compiler", "varargs.invalid.trustme.anno", abstractC19811, c11579));
                    }
                }
            }
            if (c17551.f53650.f16086.f13890 == c20661.f66467.f13890) {
                if (abstractC5698.f17559 != EnumC1296.f4582) {
                    c22364.m7273(c17551, C6241.f19270);
                } else if (!abstractC5698.m16070() || (abstractC5698.mo16084() & 8192) != 0) {
                    C11576 c115710 = C11886.f35440;
                    C11576 c115711 = new C11576("compiler", "not.a.functional.intf", abstractC5698);
                    C12281 c12283 = C6241.f19132;
                    c22364.m7273(c17551, new C12281("compiler", "bad.functional.intf.anno.1", c115711));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m36078(C15240 c15240, AbstractC10370 abstractC10370) {
        return abstractC10370 == c15240.f46777.f18789;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36183(C17551 c17551, boolean z) {
        C12171.m29637(c17551.f16086);
        c17551.mo988(new C6775(this));
        if (!c17551.m14709(EnumC18550.f57483) || c17551.f53650.f16086.mo12948() || m36168(c17551, z)) {
            return;
        }
        AbstractC4308 abstractC4308 = c17551.f16086;
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(c17551, new C12281("compiler", "annotation.type.not.applicable.to.type", abstractC4308));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36158(C14163 c14163, C16384 c16384, C17551 c17551) {
        AbstractC4308 abstractC4308;
        Set setM36095;
        Set setM36096;
        C6136 c6136;
        AbstractC4308 abstractC4309 = c16384.f26338;
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC43010 = c20661.f66530;
        AbstractC4308 abstractC43011 = c20661.f66494;
        AbstractC4308 abstractC43012 = c20661.f66474;
        C6319 c6319 = this.f46788;
        C12171.m29642(c6319.m17550(abstractC4309, abstractC43010));
        C2609 c2609 = c16384.f50417;
        boolean zIsEmpty = c2609.isEmpty();
        C6136 c6137 = this.f46777;
        if (zIsEmpty) {
            abstractC4308 = null;
        } else {
            C12171.m29642(((C3581) ((C23069) c2609.f8240).f74207).f17562 == c6137.f18860);
            abstractC4308 = ((C10741) ((C23069) c2609.f8240).f74208).f32362;
        }
        if (abstractC4308 == null) {
            return;
        }
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        AbstractC5698 abstractC5698Mo20478 = abstractC19810.mo16064().mo20478(c6137.f18860, (Predicate) null);
        C22364 c22364 = this.f46757;
        if (abstractC5698Mo20478 != null && abstractC5698Mo20478.f17559 == EnumC1296.f4571) {
            AbstractC4308 abstractC4308Mo12923 = ((C3581) abstractC5698Mo20478).f17560.mo12923();
            if (!abstractC4308Mo12923.m12913(EnumC9454.ARRAY) || !c6319.m17550(((C5138) abstractC4308Mo12923).f16077, c14163.f17560)) {
                C5138 c5138M17478 = c6319.m17478(c14163.f17560);
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC19810, abstractC4308Mo12923, c5138M17478));
            }
        } else {
            C12281 c12282 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC19810));
        }
        AbstractC19810 abstractC19811 = abstractC4308.f13890;
        EnumC23440 enumC23440M17528 = c6319.m17528(abstractC19811);
        EnumC23440 enumC23440M17529 = c6319.m17528((AbstractC19810) c14163);
        int i = C2542.f8061[enumC23440M17529.ordinal()];
        if (i == 1 ? enumC23440M17528 != EnumC23440.RUNTIME : !(i != 2 || enumC23440M17528 != EnumC23440.SOURCE)) {
            String strName = enumC23440M17528.name();
            String strName2 = enumC23440M17529.name();
            C12281 c12283 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.retention", abstractC19811, strName, c14163, strName2));
        }
        AbstractC19810 abstractC19812 = abstractC4308.f13890;
        if (c14163.m16065(abstractC43012.f13890) != null && abstractC19812.m16065(abstractC43012.f13890) == null) {
            C12281 c12284 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.not.documented", abstractC19812, c14163));
        }
        AbstractC19810 abstractC19813 = abstractC4308.f13890;
        if (c14163.m16065(abstractC43011.f13890) != null && abstractC19813.m16065(abstractC43011.f13890) == null) {
            C12281 c12285 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.not.inherited", abstractC19813, c14163));
        }
        AbstractC19810 abstractC19814 = abstractC4308.f13890;
        C1568 c1568M36101 = m36101(abstractC19814);
        if (c1568M36101 == null) {
            setM36095 = m36095();
        } else {
            HashSet hashSet = new HashSet();
            for (AbstractC8624 abstractC8624 : c1568M36101.f5564) {
                if (abstractC8624 instanceof C17090) {
                    hashSet.add(((C17090) abstractC8624).f52397.f17562);
                }
            }
            setM36095 = hashSet;
        }
        C1568 c1568M36102 = m36101((AbstractC19810) c14163);
        if (c1568M36102 == null) {
            setM36096 = m36095();
        } else {
            HashSet hashSet2 = new HashSet();
            for (AbstractC8624 abstractC8625 : c1568M36102.f5564) {
                if (abstractC8625 instanceof C17090) {
                    hashSet2.add(((C17090) abstractC8625).f52397.f17562);
                }
            }
            setM36096 = hashSet2;
        }
        Iterator it = setM36095.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                c6136 = c6137;
                break;
            }
            AbstractC10370 abstractC10370 = (AbstractC10370) it.next();
            Iterator it2 = setM36096.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c6136 = c6137;
                    C12281 c12286 = C6241.f19132;
                    c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.incompatible.target", abstractC19814, c14163));
                    break loop0;
                }
                AbstractC10370 abstractC10371 = (AbstractC10370) it2.next();
                if (abstractC10371 == abstractC10370) {
                    break;
                }
                C6136 c6138 = c6137;
                AbstractC10370 abstractC10372 = c6138.f18781;
                AbstractC10370 abstractC10373 = c6138.f18788;
                if (abstractC10371 == abstractC10372 && abstractC10370 == abstractC10373) {
                    c6137 = c6138;
                    break;
                }
                if (abstractC10371 == c6138.f18785 && (abstractC10370 == abstractC10372 || abstractC10370 == abstractC10373 || abstractC10370 == c6138.f18809)) {
                    c6137 = c6138;
                    break;
                }
                c6137 = c6138;
            }
        }
        AbstractC19810 abstractC19815 = abstractC4308.f13890;
        AbstractC14016 abstractC14016Mo16064 = abstractC19815.mo16064();
        abstractC14016Mo16064.getClass();
        for (AbstractC5698 abstractC5698 : abstractC14016Mo16064.mo20475((Predicate) null, EnumC1317.RECURSIVE)) {
            if (abstractC5698.f17562 != c6136.f18860 && abstractC5698.f17559 == EnumC1296.f4571 && ((C3581) abstractC5698).f11370 == null) {
                C12281 c12287 = C6241.f19132;
                c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.elem.nondefault", abstractC19815, abstractC5698));
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private Set m36095() {
        if (this.f46776 == null) {
            AbstractC10370[] abstractC10370ArrM36093 = m36093();
            HashSet hashSet = new HashSet(abstractC10370ArrM36093.length);
            for (AbstractC10370 abstractC10370 : abstractC10370ArrM36093) {
                C11003.requireNonNull(abstractC10370);
                if (!hashSet.add(abstractC10370)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) abstractC10370));
                }
            }
            this.f46776 = C20195.unmodifiableSet(hashSet);
        }
        return this.f46776;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36168(C17551 c17551, final boolean z) {
        C2609 c2609M40509 = this.f46772.m40509(c17551.f53650.f16086.f13890);
        if (c2609M40509 == null) {
            return false;
        }
        return C5378.stream(c2609M40509).anyMatch(new Predicate() { // from class: l.᩸ۗ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C15240.m36080(this.f68675, z, (AbstractC8624) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36080(C15240 c15240, boolean z, AbstractC8624 abstractC8624) {
        AbstractC10370 abstractC10370 = ((C17090) abstractC8624).f52397.f17562;
        C6136 c6136 = c15240.f46777;
        if (abstractC10370 != c6136.f18785) {
            return z && abstractC10370 == c6136.f18809;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370[] m36185(AbstractC19810 abstractC19810) {
        C1568 c1568M36101 = m36101(abstractC19810);
        if (c1568M36101 != null) {
            AbstractC8624[] abstractC8624Arr = c1568M36101.f5564;
            AbstractC10370[] abstractC10370Arr = new AbstractC10370[abstractC8624Arr.length];
            for (int i = 0; i < abstractC8624Arr.length; i++) {
                AbstractC8624 abstractC8624 = abstractC8624Arr[i];
                if (!(abstractC8624 instanceof C17090)) {
                    return new AbstractC10370[0];
                }
                abstractC10370Arr[i] = ((C17090) abstractC8624).f52397.f17562;
            }
            return abstractC10370Arr;
        }
        return m36093();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16646 m36114(C17551 c17551, AbstractC5698 abstractC5698) {
        AbstractC10370[] abstractC10370ArrM36093;
        EnumC1296 enumC1296;
        EnumC1296 enumC1297;
        C15240 c15240 = this;
        C1568 c1568M36101 = c15240.m36101(c17551.f53650.f16086.f13890);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (c1568M36101 != null) {
            AbstractC8624[] abstractC8624Arr = c1568M36101.f5564;
            AbstractC10370[] abstractC10370Arr = new AbstractC10370[abstractC8624Arr.length];
            for (int i2 = 0; i2 < abstractC8624Arr.length; i2++) {
                AbstractC8624 abstractC8624 = abstractC8624Arr[i2];
                if (!(abstractC8624 instanceof C17090)) {
                    return C16646.empty();
                }
                abstractC10370Arr[i2] = ((C17090) abstractC8624).f52397.f17562;
            }
            abstractC10370ArrM36093 = abstractC10370Arr;
        } else {
            abstractC10370ArrM36093 = m36093();
        }
        int length = abstractC10370ArrM36093.length;
        while (i < length) {
            AbstractC10370 abstractC10370 = abstractC10370ArrM36093[i];
            C6136 c6136 = c15240.f46777;
            AbstractC10370 abstractC10371 = c6136.f18781;
            AbstractC10370 abstractC10372 = c6136.f18809;
            AbstractC10370 abstractC10373 = c6136.f18785;
            AbstractC10370 abstractC10374 = c6136.f18788;
            AbstractC10370 abstractC10375 = c6136.f18822;
            AbstractC10370 abstractC10376 = c6136.f18889;
            AbstractC10370 abstractC10377 = c6136.f18850;
            AbstractC10370 abstractC10378 = c6136.f18885;
            AbstractC10370 abstractC10379 = c6136.f18789;
            if (abstractC10370 == abstractC10371) {
                if (abstractC5698.f17559 == EnumC1296.f4582) {
                    hashSet.add(abstractC10371);
                }
            } else {
                AbstractC10370 abstractC103710 = c6136.f18808;
                if (abstractC10370 == abstractC103710) {
                    if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 != EnumC1296.f4571) {
                        hashSet.add(abstractC103710);
                    }
                } else if (abstractC10370 == abstractC10379) {
                    if (abstractC5698.mo952() == EnumC23258.RECORD_COMPONENT) {
                        hashSet.add(abstractC10379);
                    }
                } else if (abstractC10370 == abstractC10378) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && !abstractC5698.m16075()) {
                        hashSet.add(abstractC10378);
                    }
                } else if (abstractC10370 == abstractC10377) {
                    if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 8589934592L) != 0) {
                        hashSet.add(abstractC10377);
                    }
                } else if (abstractC10370 == abstractC10376) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC5698.m16075()) {
                        hashSet.add(abstractC10376);
                    }
                } else if (abstractC10370 == abstractC10375) {
                    if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 8589934592L) == 0) {
                        hashSet.add(abstractC10375);
                    }
                } else if (abstractC10370 == abstractC10374) {
                    if (abstractC5698.f17559 == EnumC1296.f4582 && (abstractC5698.mo16084() & 8192) != 0) {
                        hashSet.add(abstractC10374);
                    }
                } else {
                    AbstractC10370 abstractC103711 = c6136.f18901;
                    if (abstractC10370 == abstractC103711) {
                        if (abstractC5698.f17559 == EnumC1296.f4579) {
                            hashSet.add(abstractC103711);
                        }
                    } else if (abstractC10370 == abstractC10373) {
                        EnumC1296 enumC1298 = abstractC5698.f17559;
                        EnumC1296 enumC1299 = EnumC1296.f4567;
                        if ((enumC1298 != enumC1299 || abstractC5698.f17561.f17559 != EnumC1296.f4571 || !abstractC5698.f17560.m12913(EnumC9454.NONE)) && ((enumC1296 = abstractC5698.f17559) == EnumC1296.f4582 || enumC1296 == enumC1299 || ((enumC1296 == (enumC1297 = EnumC1296.f4571) && !abstractC5698.m16075() && !abstractC5698.f17560.mo12923().m12913(EnumC9454.VOID)) || (abstractC5698.f17559 == enumC1297 && abstractC5698.m16075())))) {
                            hashSet.add(abstractC10373);
                        }
                    } else if (abstractC10370 == abstractC10372) {
                        if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
                            hashSet.add(abstractC10372);
                        }
                    } else {
                        AbstractC10370 abstractC103712 = c6136.f18804;
                        if (abstractC10370 == abstractC103712) {
                            if (abstractC5698.f17559 == EnumC1296.f4568) {
                                hashSet.add(abstractC103712);
                            }
                        } else {
                            return C16646.empty();
                        }
                    }
                }
            }
            i++;
            c15240 = this;
        }
        return C16646.of(hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1568 m36101(AbstractC19810 abstractC19810) {
        C16384 c16384Mo36583 = abstractC19810.mo33816().mo36583();
        if (c16384Mo36583 == null) {
            return null;
        }
        AbstractC8624 abstractC8624M38580 = c16384Mo36583.m38580(this.f46777.f18860);
        if (abstractC8624M38580 instanceof C1568) {
            return (C1568) abstractC8624M38580;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC10370[] m36093() {
        if (this.f46769 == null) {
            ArrayList arrayList = new ArrayList();
            C6136 c6136 = this.f46777;
            arrayList.add(c6136.f18901);
            arrayList.add(c6136.f18781);
            arrayList.add(c6136.f18808);
            arrayList.add(c6136.f18885);
            arrayList.add(c6136.f18889);
            arrayList.add(c6136.f18788);
            arrayList.add(c6136.f18822);
            arrayList.add(c6136.f18850);
            if (this.f46771) {
                arrayList.add(c6136.f18789);
            }
            if (this.f46758) {
                arrayList.add(c6136.f18804);
            }
            this.f46769 = (AbstractC10370[]) arrayList.toArray(new AbstractC10370[0]);
        }
        return this.f46769;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36167(C17551 c17551) {
        C22364 c22364 = this.f46757;
        C8253 c8253 = new C8253(c22364);
        try {
            return m36087(c17551);
        } finally {
            c22364.m50112(c8253);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m36087(C17551 c17551) {
        C22364 c22364;
        boolean z;
        C12281 c12281;
        C21863 c21863Mo33816 = c17551.f53650.f16086.f13890.mo33816();
        LinkedHashSet<C3581> linkedHashSetMo36580 = c21863Mo33816.mo36580();
        Iterator it = c17551.f53653.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c22364 = this.f46757;
            if (!zHasNext) {
                break;
            }
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            if (abstractC5144.m14709(EnumC18550.f57522)) {
                C21080 c21080 = (C21080) abstractC5144;
                AbstractC5698 abstractC5698M19472 = C7260.m19472(c21080.f67987);
                if (abstractC5698M19472 != null && !abstractC5698M19472.f17560.mo12948() && !linkedHashSetMo36580.remove(abstractC5698M19472)) {
                    AbstractC12612 abstractC12612 = c21080.f67987;
                    abstractC12612.getClass();
                    AbstractC10370 abstractC10370 = abstractC5698M19472.f17562;
                    AbstractC4308 abstractC4308 = c17551.f16086;
                    C12281 c12282 = C6241.f19132;
                    c22364.m7273(abstractC12612, new C12281("compiler", "duplicate.annotation.member.value", abstractC10370, abstractC4308));
                    z2 = false;
                }
            }
        }
        C2609 c2609M8239 = C2609.m8239();
        LinkedHashSet linkedHashSetMo36581 = c21863Mo33816.mo36581();
        for (C3581 c3581 : linkedHashSetMo36580) {
            if (!c3581.f17560.mo12948() && !linkedHashSetMo36581.contains(c3581)) {
                c2609M8239 = c2609M8239.m8242(c3581.f17562);
            }
        }
        C2609 c2609M8250 = c2609M8239.m8250();
        if (c2609M8250.m8249()) {
            if (c2609M8250.m8245() > 1) {
                AbstractC4308 abstractC4309 = c17551.f16086;
                C12281 c12283 = C6241.f19132;
                c12281 = new C12281("compiler", "annotation.missing.default.value.1", abstractC4309, c2609M8250);
            } else {
                AbstractC4308 abstractC43010 = c17551.f16086;
                C12281 c12284 = C6241.f19132;
                c12281 = new C12281("compiler", "annotation.missing.default.value", abstractC43010, c2609M8250);
            }
            c22364.m7273(c17551, c12281);
            z2 = false;
        }
        if (z2) {
            if (c17551.f53650.f16086.f13890 == this.f46770.f66451.f13890) {
                C2609 c2609 = c17551.f53653;
                if (c2609.f8241 == null) {
                    z = true;
                } else if (((AbstractC12612) c2609.f8240).m14709(EnumC18550.f57522)) {
                    C21080 c21081 = (C21080) c17551.f53653.f8240;
                    if (C7260.m19472(c21081.f67987).f17562 != this.f46777.f18860) {
                        z = false;
                    } else {
                        AbstractC12612 abstractC12613 = c21081.f67988;
                        if (abstractC12613.m14709(EnumC18550.f57517)) {
                            HashSet hashSet = new HashSet();
                            boolean z3 = true;
                            for (AbstractC5144 abstractC5145 : ((C18404) abstractC12613).f57139) {
                                if (!hashSet.add(C7260.m19472(abstractC5145))) {
                                    abstractC5145.getClass();
                                    c22364.m7273(abstractC5145, C6241.f19257);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36144(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.DEP_ANN;
        boolean zM14055 = c4824.m14055(enumC20347);
        C22364 c22364 = this.f46757;
        C20661 c20661 = this.f46770;
        if (zM14055 && abstractC5698.m16102() && (abstractC5698.mo16084() & 131072) != 0 && !c20661.f66448.mo12948() && abstractC5698.m16065(c20661.f66448.f13890) == null) {
            c22364.m7286(enumC20347, abstractC5144, C14001.f42345);
        }
        C4824 c4825 = this.f46756;
        EnumC20347 enumC20348 = EnumC20347.DEPRECATION;
        if (!c4825.m14055(enumC20348) || abstractC5698.m16102() || c20661.f66448.mo12948() || abstractC5698.m16065(c20661.f66448.f13890) == null) {
            return;
        }
        EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698);
        C11076 c11076 = C14001.f42334;
        c22364.m7286(enumC20348, abstractC5144, new C11076("compiler", "deprecated.annotation.has.no.effect", enumC8352M49076));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36062(C15240 c15240, Supplier supplier, AbstractC5698 abstractC5698) {
        InterfaceC3109 interfaceC3109 = (InterfaceC3109) supplier.get();
        C4725 c4725 = c15240.f46785;
        C4725 c4726 = c15240.f46762;
        if ((abstractC5698.f17563 & 36028797018963968L) != 0) {
            if (c15240.f46756.m14056(EnumC20347.REMOVAL)) {
                return;
            }
            if (abstractC5698.f17559 == EnumC1296.f4568) {
                C11076 c11076 = C14001.f42334;
                c4726.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated.for.removal.module", abstractC5698));
                return;
            } else {
                AbstractC5698 abstractC5698M16072 = abstractC5698.m16072();
                C11076 c11077 = C14001.f42334;
                c4726.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated.for.removal", abstractC5698, abstractC5698M16072));
                return;
            }
        }
        if (c15240.f46756.m14056(EnumC20347.DEPRECATION)) {
            return;
        }
        if (abstractC5698.f17559 == EnumC1296.f4568) {
            C11076 c11078 = C14001.f42334;
            c4725.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated.module", abstractC5698));
        } else {
            AbstractC5698 abstractC5698M16073 = abstractC5698.m16072();
            C11076 c11079 = C14001.f42334;
            c4725.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated", abstractC5698, abstractC5698M16073));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36192(final AbstractC5698 abstractC5698, final AbstractC5144 abstractC5144) {
        if ((abstractC5698.mo16084() & 274877906944L) != 0) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ܿ۬֨
                @Override // l.InterfaceC16818
                /* JADX INFO: renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36064(this.f53163, abstractC5144, abstractC5698);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36064(C15240 c15240, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        C22364 c22364 = c15240.f46757;
        C11076 c11076 = C14001.f42334;
        c22364.m7272(interfaceC3109, new C11076("compiler", "sun.proprietary", abstractC5698));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36180(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        EnumC5973 enumC5973 = EnumC5973.f18321;
        EnumC5973 enumC5974 = this.f46784;
        if (enumC5974 == enumC5973 || (abstractC5698.mo16084() & 35184372088832L) == 0) {
            return;
        }
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(abstractC5144, new C12281("compiler", "not.in.profile", abstractC5698, enumC5974));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36127(final InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, final AbstractC5698 abstractC5699) {
        long jMo16084 = abstractC5699.mo16084() & 72057594037927936L;
        C23168 c23168 = this.f46787;
        if (jMo16084 != 0 && abstractC5699.m16089().f24147 != abstractC5698.m16089().f24147) {
            long jMo16085 = abstractC5699.mo16084() & 288230376151711744L;
            C18230 c18230 = this.f46765;
            if (jMo16085 == 0) {
                if (!c23168.m51347()) {
                    C12281 c12281 = C6241.f19132;
                    this.f46757.m7273(interfaceC3109, new C12281("compiler", "is.preview", abstractC5699));
                } else {
                    c23168.m51349();
                    c18230.m42473(new InterfaceC16818() { // from class: l.֫۬֨
                        @Override // l.InterfaceC16818
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final void mo6082() {
                            C11076 c11076 = C14001.f42334;
                            this.f6281.m36130(interfaceC3109, new C11076("compiler", "is.preview", abstractC5699));
                        }
                    });
                }
            } else {
                c18230.m42473(new InterfaceC16818() { // from class: l.ۧ۬֨
                    @Override // l.InterfaceC16818
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6082() {
                        C11076 c11076 = C14001.f42334;
                        this.f33116.m36130(interfaceC3109, new C11076("compiler", "is.preview.reflective", abstractC5699));
                    }
                });
            }
        }
        c23168.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36149(C8526 c8526, AbstractC4308 abstractC4308) {
        int i = C2542.f8066[abstractC4308.mo3258().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m36149(c8526, this.f46788.m17515(abstractC4308));
            return;
        }
        if ((abstractC4308.f13890.mo16084() & 8192) != 0) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            long j = abstractC19810.f17563;
            if ((j & 34359738368L) != 0) {
                return;
            }
            if ((j & 134217728) != 0) {
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(c8526, new C12281("compiler", "cyclic.annotation.element", abstractC19810));
                return;
            }
            try {
                abstractC19810.f17563 = j | 134217728;
                for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571) {
                        m36149(c8526, ((C3581) abstractC5698).f17560.mo12923());
                    }
                }
                abstractC19810.f17563 = (abstractC19810.f17563 & (-134217729)) | 34359738368L;
            } catch (Throwable th) {
                abstractC19810.f17563 = (abstractC19810.f17563 & (-134217729)) | 34359738368L;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36141(C5557 c5557) {
        HashMap map = new HashMap();
        for (C2609 c2609 = c5557.f17179; c2609.m8249(); c2609 = c2609.f8241) {
            C15580 c15580M19466 = C7260.m19466((AbstractC5144) c2609.f8240);
            if (c15580M19466 != null) {
                C8526 c8526 = (C8526) c2609.f8240;
                if (C7260.m19462(c15580M19466.f48011) == this.f46777.f18886) {
                    map.put(c8526.f26045, C7260.m19472(c15580M19466.f48011));
                } else {
                    c8526.f26045.f17563 |= 1073741824;
                }
            }
        }
        for (AbstractC5698 abstractC5698 : (AbstractC5698[]) map.keySet().toArray(new AbstractC5698[0])) {
            m36059(c5557, abstractC5698, map);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36059(C5557 c5557, AbstractC5698 abstractC5698, HashMap map) {
        if (abstractC5698 != null) {
            long j = abstractC5698.f17563;
            if ((j & 1073741824) == 0) {
                if ((j & 134217728) != 0) {
                    this.f46757.m7273(C7260.m19439(abstractC5698, c5557, false), C6241.f19263);
                } else {
                    abstractC5698.f17563 = j | 134217728;
                    m36059(c5557, (AbstractC5698) map.remove(abstractC5698), map);
                    abstractC5698.f17563 &= -134217729;
                }
                abstractC5698.f17563 |= 1073741824;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36125(final InterfaceC3109 interfaceC3109, C0758 c0758, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12915() != null && abstractC4308.mo3258().m24299(EnumC9454.LONG) && ((Number) abstractC4308.mo12915()).longValue() == 0) {
            int i = c0758.f2814;
            if (i == 108 || i == 112 || i == 109 || i == 113) {
                this.f46765.m42473(new InterfaceC16818() { // from class: l.۟ۗ֨
                    @Override // l.InterfaceC16818
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6082() {
                        C15240.m36063(this.f22033, interfaceC3109);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36118(C1470 c1470) {
        if (c1470.f5226.m14709(EnumC18550.f57540) && c1470.f5227 == null) {
            C4824 c4824 = this.f46756;
            EnumC20347 enumC20347 = EnumC20347.EMPTY;
            if (c4824.m14055(enumC20347)) {
                AbstractC11349 abstractC11349 = c1470.f5226;
                abstractC11349.getClass();
                this.f46757.m7286(enumC20347, abstractC11349, C14001.f42343);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36162(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC14016 abstractC14016) {
        EnumC1296 enumC1296;
        if (!abstractC5698.f17560.mo12948()) {
            AbstractC10370 abstractC10370 = abstractC5698.f17561.f17562;
            C6136 c6136 = this.f46777;
            if (abstractC10370 != c6136.f18848) {
                for (AbstractC5698 abstractC5699 : abstractC14016.mo20477(abstractC5698.f17562, null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698 != abstractC5699 && (abstractC5699.mo16084() & 4398046511104L) == 0 && (enumC1296 = abstractC5698.f17559) == abstractC5699.f17559 && abstractC5698.f17562 != c6136.f18855) {
                        EnumC1296 enumC1297 = EnumC1296.f4571;
                        C6319 c6319 = this.f46788;
                        if (enumC1296 != enumC1297 || c6319.m17506(abstractC5698.f17560, abstractC5699.f17560, true) || c6319.m17506(c6319.m17519(abstractC5698.f17560), c6319.m17519(abstractC5699.f17560), true)) {
                            long jMo16084 = abstractC5698.mo16084() & 17179869184L;
                            long jMo16085 = abstractC5699.mo16084() & 17179869184L;
                            C22364 c22364 = this.f46757;
                            if (jMo16084 != jMo16085) {
                                abstractC5698.f17563 = 4398046511104L | abstractC5698.f17563;
                                if (abstractC5698.f17560.mo12948() || abstractC5699.f17560.mo12948()) {
                                    break;
                                    break;
                                }
                                AbstractC5698 abstractC5698M16072 = abstractC5699.m16072();
                                C12281 c12281 = C6241.f19132;
                                c22364.m7273(interfaceC3109, new C12281("compiler", "array.and.varargs", abstractC5698, abstractC5699, abstractC5698M16072));
                                return true;
                            }
                            if (abstractC5698.f17559 == enumC1297 && !c6319.m17506(abstractC5698.f17560, abstractC5699.f17560, false)) {
                                if (!abstractC5698.f17560.mo12948() && !abstractC5699.f17560.mo12948()) {
                                    C12281 c12282 = C6241.f19132;
                                    c22364.m7273(interfaceC3109, new C12281("compiler", "name.clash.same.erasure", abstractC5698, abstractC5699));
                                }
                                abstractC5698.f17563 |= 4398046511104L;
                                return true;
                            }
                            if ((abstractC5698.mo16084() & 576460752303423488L) != 0 && (abstractC5699.mo16084() & 576460752303423488L) != 0 && (abstractC5699.mo16084() & 1152921504606846976L) == 0) {
                                if (!abstractC5698.f17560.mo12948()) {
                                    c22364.m7273(interfaceC3109, C6241.f19226);
                                    abstractC5698.f17563 |= 4398046511104L;
                                }
                            } else {
                                m36126(interfaceC3109, abstractC5699);
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36189(C1323 c1323) {
        C10643 c10643;
        AbstractC7667 abstractC7667;
        AbstractC14016 abstractC14016M33607 = AbstractC14016.m33607(c1323.f4746);
        AbstractC14016 abstractC14016M33608 = AbstractC14016.m33607(c1323.f4746);
        AbstractC7667 abstractC7668 = c1323.f4737;
        for (AbstractC5144 abstractC5144 : c1323.f4738) {
            if (abstractC5144.m14709(EnumC18550.f57491) && (abstractC7667 = (c10643 = (C10643) abstractC5144).f32019) != null) {
                for (AbstractC5698 abstractC5698 : abstractC7667.mo20475(new C22010(), EnumC1317.RECURSIVE)) {
                    if (c10643.f32020) {
                        m36060(c10643, abstractC14016M33607, abstractC14016M33608, abstractC7668, abstractC5698, true);
                        abstractC14016M33608.mo26382(abstractC5698);
                    } else {
                        m36060(c10643, abstractC14016M33607, abstractC14016M33608, abstractC7668, abstractC5698, false);
                        abstractC14016M33607.mo26382(abstractC5698);
                    }
                }
                c10643.f32019 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36060(C10643 c10643, AbstractC7667 abstractC7667, AbstractC7667 abstractC7668, AbstractC7667 abstractC7669, AbstractC5698 abstractC5698, boolean z) {
        C13961 c13961 = new C13961(1, abstractC5698);
        AbstractC5698 abstractC5698Mo20478 = abstractC7667.mo20478(abstractC5698.f17562, c13961);
        AbstractC5698 abstractC5698Mo20479 = (abstractC5698Mo20478 != null || z) ? null : abstractC7668.mo20478(abstractC5698.f17562, c13961);
        C22364 c22364 = this.f46757;
        if (abstractC5698Mo20478 == null && abstractC5698Mo20479 == null) {
            AbstractC5698 abstractC5698Mo204710 = abstractC7669.mo20478(abstractC5698.f17562, c13961);
            if (abstractC5698Mo204710 != null) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c10643, new C12281("compiler", "already.defined.this.unit", abstractC5698Mo204710));
                return;
            }
            return;
        }
        if (abstractC5698Mo20478 != null) {
            C12281 c12282 = C6241.f19132;
            c22364.m7273(c10643, new C12281("compiler", "already.defined.single.import", abstractC5698Mo20478));
        } else {
            C12281 c12283 = C6241.f19132;
            c22364.m7273(c10643, new C12281("compiler", "already.defined.static.single.import", abstractC5698Mo20479));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36134(AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC5145 = abstractC5144;
        while (abstractC5145.m14709(EnumC18550.f57581)) {
            C6262 c6262 = (C6262) abstractC5145;
            if (c6262.f19396.f17561.mo16076() != C7260.m19472(c6262.f19397).mo16076()) {
                abstractC5144.getClass();
                AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC5144);
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(abstractC5144, new C12281("compiler", "import.requires.canonical", abstractC5698M19472));
                return;
            }
            abstractC5145 = c6262.f19397;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36136(AbstractC5144 abstractC5144, C1755 c1755, C14163 c14163) {
        if (this.f46756.m14055(EnumC20347.AUXILIARYCLASS)) {
            c14163.mo16101();
            if ((c14163.f17563 & 17592186044416L) == 0 || !this.f46760.m50330(c1755, (AbstractC19810) c14163, false) || this.f46761.mo1712(c14163.f42770, c1755.f6075.f4745)) {
                return;
            }
            InterfaceC18278 interfaceC18278 = c14163.f42770;
            C11076 c11076 = C14001.f42334;
            this.f46757.m7285(abstractC5144, new C11076("compiler", "auxiliary.class.accessed.from.outside.of.its.source.file", c14163, interfaceC18278));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36182(final C14163 c14163, final InterfaceC3109 interfaceC3109) {
        if (this.f46756.m14055(EnumC20347.MISSING_EXPLICIT_CTOR)) {
            c14163.mo16101();
            if ((c14163.f17563 & 2305843009213710336L) != 0 || c14163.f17562.isEmpty()) {
                return;
            }
            c14163.mo16101();
            if ((c14163.f17563 & 5) == 0 || !EnumC10637.f32009.m26686(this.f46774)) {
                return;
            }
            int i = C2542.f8063[c14163.m33812().ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i == 4) {
                for (AbstractC5698 abstractC5698 = c14163.f17561; abstractC5698 != null && abstractC5698.f17559 == EnumC1296.f4582; abstractC5698 = abstractC5698.f17561) {
                    if ((abstractC5698.mo16084() & 5) == 0) {
                        return;
                    }
                }
            }
            final C7814 c7814M16089 = c14163.m16089();
            if (c7814M16089.m20880()) {
                return;
            }
            final C0052 c0052 = c7814M16089.f24147;
            for (C17524 c17524 : c0052.f921) {
                if (c17524.f53523.equals(c7814M16089)) {
                    C2609 c2609 = c17524.f53522;
                    if (c2609 != null && !c2609.isEmpty()) {
                        return;
                    }
                    this.f46765.m42473(new InterfaceC16818() { // from class: l.ܰۗ֨
                        @Override // l.InterfaceC16818
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6082() {
                            C15240.m36066(this.f40418, interfaceC3109, c14163, c7814M16089, c0052);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36066(C15240 c15240, InterfaceC3109 interfaceC3109, C14163 c14163, C7814 c7814, C0052 c0052) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.MISSING_EXPLICIT_CTOR;
        if (c4824.m14055(enumC20347)) {
            C22364 c22364 = c15240.f46757;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, interfaceC3109, new C11076("compiler", "missing-explicit-ctor", c14163, c7814, c0052));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36105(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C19476 c19476 = new C19476(this, interfaceC3109, "unchecked.cast.to.type", abstractC4308, abstractC4309);
        C6319 c6319 = this.f46788;
        if (c6319.m17545(abstractC4308, abstractC4309, c19476)) {
            return abstractC4309;
        }
        ((C23708) this.f46781).mo1084(interfaceC3109, this.f46768.m16617(C11886.m29011(abstractC4308, abstractC4309)));
        return c6319.m17535(abstractC4308);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36142(C5557 c5557, C14163 c14163) {
        C20661 c20661 = this.f46770;
        if (c14163.m16065(c20661.f66467.f13890) != null) {
            try {
                this.f46788.m17493((AbstractC19810) c14163);
            } catch (C6130 e) {
                c5557.getClass();
                for (C17551 c17551 : c5557.f17181.f7168) {
                    if (c17551.f53650.f16086.f13890 == c20661.f66467.f13890) {
                        c5557 = c17551;
                        break;
                    }
                }
                C16719 c16719M17050 = e.m17050();
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(c5557, new C12281("compiler", "bad.functional.intf.anno.1", c16719M17050));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36176(C1323 c1323) {
        AbstractC5698 abstractC5698M19472;
        for (C10643 c10643 : c1323.m4617()) {
            if (c10643.f32020 && c10643.f32021.m14709(EnumC18550.f57581)) {
                C6262 c6262 = (C6262) c10643.f32021;
                if (c6262.f19395 != this.f46777.f18835 && (abstractC5698M19472 = C7260.m19472(c6262.f19397)) != null && abstractC5698M19472.f17559 == EnumC1296.f4582) {
                    AbstractC19810 abstractC19810 = (AbstractC19810) C7260.m19472(c6262.f19397);
                    if (!m36081(abstractC19810, abstractC19810, c1323.f4746, c6262.f19395, new HashSet())) {
                        AbstractC10370 abstractC10370 = c6262.f19395;
                        EnumC8352 enumC8352M49076 = C21758.m49076(abstractC19810);
                        C11576 c11576 = C11886.f35440;
                        C11576 c11577 = new C11576("compiler", "location", enumC8352M49076, abstractC19810, null);
                        C12281 c12281 = C6241.f19132;
                        this.f46757.m7273(c10643, new C12281("compiler", "cant.resolve.location", EnumC8352.STATIC, abstractC10370, null, null, c11577));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36117(C1323 c1323) {
        for (C10643 c10643 : c1323.m4617()) {
            if (!c10643.f32020 && C7260.m19462(c10643.f32021) == this.f46777.f18835) {
                AbstractC19810 abstractC19810 = ((C6262) c10643.f32021).f19397.f16086.f13890;
                if (abstractC19810.f17559 == EnumC1296.f4579 && abstractC19810.mo16064().m20480() && (!EnumC10637.f32003.m26686(this.f46774) || !abstractC19810.mo15574())) {
                    EnumC20043 enumC20043 = EnumC20043.RESOLVE_ERROR;
                    int i = c10643.f16085;
                    C12281 c12281 = C6241.f19132;
                    this.f46757.m7279(enumC20043, i, new C12281("compiler", "doesnt.exist", abstractC19810));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36081(AbstractC19810 abstractC19810, AbstractC19810 abstractC19811, C7814 c7814, AbstractC10370 abstractC10370, HashSet hashSet) {
        if (abstractC19810 == null || !hashSet.add(abstractC19810)) {
            return false;
        }
        AbstractC4308 abstractC4308 = abstractC19810.f17560;
        C6319 c6319 = this.f46788;
        if (m36081(c6319.m17562(abstractC4308).f13890, abstractC19811, c7814, abstractC10370, hashSet)) {
            return true;
        }
        Iterator it = c6319.m17510(abstractC19810.f17560).iterator();
        while (it.hasNext()) {
            if (m36081(((AbstractC4308) it.next()).f13890, abstractC19811, c7814, abstractC10370, hashSet)) {
                return true;
            }
        }
        for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(abstractC10370)) {
            if (abstractC5698.mo15572() && m36075(abstractC5698, c7814) && abstractC5698.m16067(abstractC19811, c6319)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36075(AbstractC5698 abstractC5698, C7814 c7814) {
        try {
            int iMo16084 = (int) (abstractC5698.mo16084() & 7);
            if (iMo16084 != 0) {
                if (iMo16084 == 2) {
                    return false;
                }
                if (iMo16084 != 4) {
                    return true;
                }
            }
            return abstractC5698.m16089() == c7814;
        } catch (C21325 e) {
            throw e;
        } catch (C20515 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36119(C1755 c1755, C5557 c5557) {
        C17524 c17524M36055;
        C1323 c1323 = c1755.f6075;
        C0052 c0052 = c1323.f4739;
        C20661 c20661 = this.f46770;
        if (c0052 == c20661.f66447 || c0052 == c20661.f66465) {
            return;
        }
        C14163 c14163 = c5557.f17186;
        c14163.mo16101();
        if ((c14163.f17563 & 16777216) == 0 && (c17524M36055 = m36055(c1323.f4746)) != null && c17524M36055.f53522 == null) {
            new C15946(this, c1755, c5557, c1323).mo1215(c5557);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17524 m36055(C7814 c7814) {
        for (C17524 c17524 : c7814.f24147.f921) {
            if (c17524.f53523 == c7814) {
                return c17524;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36074(AbstractC5698 abstractC5698) {
        while (abstractC5698.f17559 != EnumC1296.f4579) {
            if ((abstractC5698.mo16084() & 1) == 0 && (abstractC5698.mo16084() & 4) == 0) {
                return false;
            }
            abstractC5698 = abstractC5698.f17561;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36071(C15240 c15240, AbstractC12612 abstractC12612, AbstractC5698 abstractC5698, C7814 c7814, boolean z) {
        C2609 c2609;
        C22364 c22364 = c15240.f46757;
        if (!m36074(abstractC5698) && !z) {
            EnumC20347 enumC20347 = EnumC20347.EXPORTS;
            EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698);
            C0052 c0052 = abstractC5698.m16089().f24147;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, abstractC12612, new C11076("compiler", "leaks.not.accessible", enumC8352M49076, abstractC5698, c0052));
            return;
        }
        C7814 c7814M16089 = abstractC5698.m16089();
        C17524 c17524M36055 = m36055(c7814M16089);
        C17524 c17524M36056 = m36055(c7814);
        if (c17524M36055 == null) {
            EnumC20347 enumC20348 = EnumC20347.EXPORTS;
            EnumC8352 enumC8352M49077 = C21758.m49076(abstractC5698);
            C0052 c0053 = abstractC5698.m16089().f24147;
            C11076 c11077 = C14001.f42334;
            c22364.m7286(enumC20348, abstractC12612, new C11076("compiler", "leaks.not.accessible.unexported", enumC8352M49077, abstractC5698, c0053));
            return;
        }
        C2609 c26010 = c17524M36055.f53522;
        if (c26010 != null && ((c2609 = c17524M36056.f53522) == null || !c26010.containsAll(c2609))) {
            EnumC20347 enumC20349 = EnumC20347.EXPORTS;
            EnumC8352 enumC8352M49078 = C21758.m49076(abstractC5698);
            C0052 c0054 = abstractC5698.m16089().f24147;
            C11076 c11078 = C14001.f42334;
            c22364.m7286(enumC20349, abstractC12612, new C11076("compiler", "leaks.not.accessible.unexported.qualified", enumC8352M49078, abstractC5698, c0054));
        }
        C0052 c0055 = c7814M16089.f24147;
        C0052 c0056 = c7814.f24147;
        if (c0055 == c0056 || c0055 == c15240.f46770.f66509) {
            return;
        }
        C2609 c2609Of = C2609.of((Object) c0056);
        while (c2609Of.m8249()) {
            C0052 c0057 = (C0052) c2609Of.f8240;
            c2609Of = c2609Of.f8241;
            if (c0057 == c7814M16089.f24147) {
                return;
            }
            if ((c0057.f17563 & 4503599627370496L) == 0) {
                for (C9764 c9764 : c0057.f929) {
                    if (c9764.f29540.contains(EnumC9058.TRANSITIVE)) {
                        c2609Of = c2609Of.m8246(c9764.f29541);
                    }
                }
            }
        }
        EnumC20347 enumC203410 = EnumC20347.EXPORTS;
        EnumC8352 enumC8352M49079 = C21758.m49076(abstractC5698);
        C0052 c0058 = abstractC5698.m16089().f24147;
        C11076 c11079 = C14001.f42334;
        c22364.m7286(enumC203410, abstractC12612, new C11076("compiler", "leaks.not.accessible.not.required.transitive", enumC8352M49079, abstractC5698, c0058));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36153(final AbstractC12612 abstractC12612, final C0052 c0052) {
        if (c0052.f17559 != EnumC1296.f4568) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ۨۗ֨
                @Override // l.InterfaceC16818
                /* JADX INFO: renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36070(this.f34174, abstractC12612, c0052);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36070(C15240 c15240, AbstractC12612 abstractC12612, C0052 c0052) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.MODULE;
        if (c4824.m14055(enumC20347)) {
            C22364 c22364 = c15240.f46757;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, abstractC12612, new C11076("compiler", "module.not.found", c0052));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36065(C15240 c15240, InterfaceC3109 interfaceC3109, C7814 c7814) {
        if (c15240.f46756.m14055(EnumC20347.OPENS)) {
            C22364 c22364 = c15240.f46757;
            C11076 c11076 = C14001.f42334;
            c22364.m7285(interfaceC3109, new C11076("compiler", "package.empty.or.not.found", c7814));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36129(final InterfaceC3109 interfaceC3109, final C9764 c9764) {
        if ((c9764.f29541.f17563 & 4503599627370496L) != 0) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ۤۗ֨
                @Override // l.InterfaceC16818
                /* JADX INFO: renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36069(this.f30166, c9764, interfaceC3109);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36069(C15240 c15240, C9764 c9764, InterfaceC3109 interfaceC3109) {
        C22364 c22364 = c15240.f46757;
        if (c9764.f29540.contains(EnumC9058.TRANSITIVE) && c15240.f46756.m14055(EnumC20347.REQUIRES_TRANSITIVE_AUTOMATIC)) {
            c22364.m7285(interfaceC3109, C14001.f42339);
        } else if (c15240.f46756.m14055(EnumC20347.REQUIRES_AUTOMATIC)) {
            c22364.m7285(interfaceC3109, C14001.f42333);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36121(C2609 c2609) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean zM14709 = false;
        boolean z5 = false;
        while (c2609.m8249()) {
            C18963 c18963 = (C18963) c2609.f8240;
            for (AbstractC19669 abstractC19669 : c18963.f59815) {
                boolean zMo30871 = abstractC19669.mo30871();
                C22364 c22364 = this.f46757;
                if (zMo30871) {
                    if (C7260.m19429((AbstractC12612) abstractC19669)) {
                        if (z4 && !zM14709 && !z5) {
                            c22364.m7273(abstractC19669, C6241.f19128);
                        }
                        z3 = true;
                    } else {
                        if (z4 && !z5) {
                            c22364.m7273(abstractC19669, C6241.f19128);
                        }
                        z = true;
                    }
                } else if (abstractC19669.m14709(EnumC18550.f57516)) {
                    if (z4 && !z5) {
                        c22364.m7273(abstractC19669, C6241.f19128);
                    }
                    z2 = true;
                } else {
                    zM14709 = abstractC19669.m14709(EnumC18550.f57504);
                    if (z4 || z || z2 || (z3 && (!zM14709 || z5))) {
                        c22364.m7273(abstractC19669, C6241.f19182);
                    }
                    z4 = true;
                }
            }
            boolean z6 = c18963.f59817 == EnumC6652.STATEMENT ? c18963.f59816 : false;
            if (c18963.f59814.m8249()) {
                z4 &= z6;
                zM14709 &= z6;
                z2 = false;
                z3 &= z6;
                z = false;
            }
            z5 = c18963.f59814.m8249() && z6;
            c2609 = c2609.f8241;
        }
    }
}
