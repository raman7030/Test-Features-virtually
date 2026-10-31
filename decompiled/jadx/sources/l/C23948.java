package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩻᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBGV */
/* JADX INFO: loaded from: classes.dex */
public final class C23948 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1662 f77663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18241 f77664;

    public C23948(C1662 c1662, C18241 c18241) {
        if (c1662 == null) {
            throw new NullPointerException("file == null");
        }
        this.f77663 = c1662;
        this.f77664 = c18241;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52780(AbstractC13717 abstractC13717) {
        int iM52777 = m52777(abstractC13717);
        C18241 c18241 = this.f77664;
        if (iM52777 != 0 && iM52777 != 6 && iM52777 != 2) {
            if (iM52777 == 3) {
                C19893.m45755(c18241, iM52777, ((AbstractC1223) abstractC13717).mo2227());
                return;
            }
            if (iM52777 != 4) {
                if (iM52777 == 16) {
                    C19893.m45752(c18241, iM52777, ((C16039) abstractC13717).mo2227() << 32);
                    return;
                }
                if (iM52777 == 17) {
                    C19893.m45752(c18241, iM52777, ((C20980) abstractC13717).mo2227());
                    return;
                }
                C1662 c1662 = this.f77663;
                switch (iM52777) {
                    case 21:
                        C19893.m45755(c18241, iM52777, c1662.m5618().m25410(((C4751) abstractC13717).m13898()));
                        return;
                    case 22:
                        C19893.m45755(c18241, iM52777, c1662.m5622().m21323((C21685) abstractC13717));
                        return;
                    case 23:
                        C19893.m45755(c18241, iM52777, c1662.m5631().m6830((C13217) abstractC13717));
                        return;
                    case 24:
                        C19893.m45755(c18241, iM52777, c1662.m5632().m39748((C12512) abstractC13717));
                        return;
                    case 25:
                        C19893.m45755(c18241, iM52777, c1662.m5626().m18102((C8985) abstractC13717));
                        return;
                    case 26:
                        C19893.m45755(c18241, iM52777, c1662.m5627().m48538((AbstractC16745) abstractC13717));
                        return;
                    case 27:
                        C19893.m45755(c18241, iM52777, c1662.m5626().m18102(((C9691) abstractC13717).m24635()));
                        return;
                    case 28:
                        c18241.m42517(iM52777);
                        m52779((C11102) abstractC13717, false);
                        return;
                    case 29:
                        c18241.m42517(iM52777);
                        m52778(((C7368) abstractC13717).m19811(), false);
                        return;
                    case 30:
                        c18241.m42517(iM52777);
                        return;
                    case 31:
                        c18241.m42517((((C18157) abstractC13717).mo2231() << 5) | iM52777);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo2227 = ((AbstractC1223) abstractC13717).mo2227();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo2227 >> 63) ^ jMo2227)) >> 3;
        c18241.m42517(iM52777 | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            c18241.m42517((byte) jMo2227);
            jMo2227 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m52777(AbstractC13717 abstractC13717) {
        if (abstractC13717 instanceof C17451) {
            return 0;
        }
        if (abstractC13717 instanceof C3340) {
            return 2;
        }
        if (abstractC13717 instanceof C6868) {
            return 3;
        }
        if (abstractC13717 instanceof C2635) {
            return 4;
        }
        if (abstractC13717 instanceof C8279) {
            return 6;
        }
        if (abstractC13717 instanceof C16039) {
            return 16;
        }
        if (abstractC13717 instanceof C20980) {
            return 17;
        }
        if (abstractC13717 instanceof C4751) {
            return 21;
        }
        if (abstractC13717 instanceof C21685) {
            return 22;
        }
        if (abstractC13717 instanceof C13217) {
            return 23;
        }
        if (abstractC13717 instanceof C12512) {
            return 24;
        }
        if (abstractC13717 instanceof C8985) {
            return 25;
        }
        if (abstractC13717 instanceof C22390) {
            return 26;
        }
        if (abstractC13717 instanceof C9691) {
            return 27;
        }
        if (abstractC13717 instanceof C11102) {
            return 28;
        }
        if (abstractC13717 instanceof C7368) {
            return 29;
        }
        if (abstractC13717 instanceof C19569) {
            return 30;
        }
        if (abstractC13717 instanceof C18157) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52779(C11102 c11102, boolean z) {
        C18241 c18241 = this.f77664;
        boolean z2 = z && c18241.m42506();
        C1929 c1929M27534 = c11102.m27534();
        int size = c1929M27534.size();
        if (z2) {
            c18241.m42503("  size: ".concat(C14712.m35008(size)));
        }
        c18241.m42507(size);
        for (int i = 0; i < size; i++) {
            AbstractC13717 abstractC13717M40999get = c1929M27534.m40999get(i);
            if (z2) {
                c18241.m42503("  [" + Integer.toHexString(i) + "] " + m52776(abstractC13717M40999get));
            }
            m52780(abstractC13717M40999get);
        }
        if (z2) {
            c18241.m42508();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52778(C5978 c5978, boolean z) {
        C18241 c18241 = this.f77664;
        boolean z2 = z && c18241.m42506();
        C1662 c1662 = this.f77663;
        C2076 c2076M5631 = c1662.m5631();
        C16892 c16892M5632 = c1662.m5632();
        C12512 type = c5978.getType();
        int iM39748 = c16892M5632.m39748(type);
        if (z2) {
            c18241.m42503("  type_idx: " + C14712.m35008(iM39748) + " // " + type.mo2463());
        }
        c18241.m42507(c16892M5632.m39748(c5978.getType()));
        Collection<C7389> collectionM16777 = c5978.m16777();
        int size = collectionM16777.size();
        if (z2) {
            c18241.m42503("  size: ".concat(C14712.m35008(size)));
        }
        c18241.m42507(size);
        int i = 0;
        for (C7389 c7389 : collectionM16777) {
            C13217 name = c7389.getName();
            int iM6830 = c2076M5631.m6830(name);
            AbstractC13717 value = c7389.getValue();
            if (z2) {
                c18241.m42501(0, "  elements[" + i + "]:");
                i++;
                c18241.m42503("    name_idx: " + C14712.m35008(iM6830) + " // " + name.mo2463());
            }
            c18241.m42507(iM6830);
            if (z2) {
                c18241.m42503("    value: " + m52776(value));
            }
            m52780(value);
        }
        if (z2) {
            c18241.m42508();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m52776(AbstractC13717 abstractC13717) {
        if (m52777(abstractC13717) == 30) {
            return "null";
        }
        return abstractC13717.mo8292() + ' ' + abstractC13717.mo2463();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52774(C1662 c1662, C5978 c5978) {
        C16892 c16892M5632 = c1662.m5632();
        C2076 c2076M5631 = c1662.m5631();
        c16892M5632.m39750(c5978.getType());
        for (C7389 c7389 : c5978.m16777()) {
            c2076M5631.m6832(c7389.getName());
            m52775(c1662, c7389.getValue());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52775(C1662 c1662, AbstractC13717 abstractC13717) {
        if (abstractC13717 instanceof C7368) {
            m52774(c1662, ((C7368) abstractC13717).m19811());
            return;
        }
        if (abstractC13717 instanceof C11102) {
            C1929 c1929M27534 = ((C11102) abstractC13717).m27534();
            int size = c1929M27534.size();
            for (int i = 0; i < size; i++) {
                m52775(c1662, c1929M27534.m40999get(i));
            }
            return;
        }
        c1662.m5625(abstractC13717);
    }
}
