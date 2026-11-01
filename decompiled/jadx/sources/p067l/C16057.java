package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C16057 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f47256;

    /* JADX INFO: renamed from: ۧ */
    public static final C7933 f47257;

    /* JADX INFO: renamed from: ܽ */
    public static final C16649 f47258;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m36562(int i) {
        if (i >= 65536) {
            return true;
        }
        char c = (char) i;
        int i2 = C4426.f9939;
        return c >= 55296 && c < 57344;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C8485 m36563(C7933 c7933) {
        if (!(c7933 instanceof C2449)) {
            return null;
        }
        C8485 c8485 = new C8485();
        c8485.f22783 = ((C2449) c7933).f3793;
        if (c7933.getClass() == C21227.class) {
            C21227 c21227 = (C21227) c7933;
            c8485.f22782 = 1;
            c8485.f22781 = c21227.f66743;
            c8485.f22779 = c21227.f66743.f20809;
            c8485.f22784 = (int[]) c21227.f66742.clone();
            return c8485;
        }
        if (c7933.getClass() == C7144.class) {
            C7144 c7144 = (C7144) c7933;
            c8485.f22782 = 2;
            c8485.f22781 = c7144.f18652;
            c8485.f22779 = c7144.f18652.f20809;
            c8485.f22786 = c7144.f18653;
            return c8485;
        }
        if (c7933.getClass() == C9826.class) {
            C9826 c9826 = (C9826) c7933;
            c8485.f22782 = 3;
            c8485.f22781 = c9826.f27251;
            c8485.f22780 = Arrays.copyOf(c9826.f27250.f12017, c9826.f27250.f12018);
            return c8485;
        }
        if (c7933.getClass() == C3120.class) {
            C3120 c3120 = (C3120) c7933;
            c8485.f22782 = 4;
            c8485.f22781 = c3120.f5677;
            c8485.f22786 = c3120.f5678;
            return c8485;
        }
        if (c7933.getClass() == C22568.class) {
            C22568 c22568 = (C22568) c7933;
            c8485.f22782 = 5;
            c8485.f22781 = c22568.f71258;
            c8485.f22785 = new C24578(c22568.f71257);
            c8485.f22777 = c22568.f71256;
            return c8485;
        }
        if (c7933.getClass() != C16531.class) {
            return null;
        }
        C16531 c16531 = (C16531) c7933;
        c8485.f22782 = 6;
        c8485.f22781 = c16531.f48578;
        c8485.f22785 = new C24578(c16531.f48575);
        c8485.f22786 = c16531.f48576;
        c8485.f22778 = c16531.f48577;
        return c8485;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24578 m36558(C7933 c7933) {
        if (c7933 instanceof C5251) {
            InterfaceC6592 interfaceC6592 = ((C5251) c7933).f12366;
            if (C14110.m32033(interfaceC6592)) {
                return new C24578(((C15860) interfaceC6592).f45939);
            }
        }
        throw new IllegalArgumentException("Unknown looking-at check: ".concat(c7933.getClass().getName()));
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC12628 m36561(C7933 c7933) {
        if (c7933 instanceof C13968) {
            return ((C13968) c7933).f39434;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m36560(C13160 c13160) {
        return c13160.f36985;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12628 m36556(InterfaceC12628 interfaceC12628, InterfaceC12628 interfaceC12629, InterfaceC12628 interfaceC126210, boolean z) {
        return C9667.m22547(C9667.m22547(interfaceC12628, interfaceC12629, z), interfaceC126210, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC23218 m36557(int i) {
        return new C21897(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m36555(InterfaceC12628 interfaceC12628) {
        if (interfaceC12628 instanceof C16511) {
            return ((C16511) interfaceC12628).f48536.length << 6;
        }
        if (interfaceC12628 instanceof C19865) {
            return ((C19865) interfaceC12628).f60376.length << 6;
        }
        int iM42223 = C18543.m42223(interfaceC12628);
        if (iM42223 >= 0) {
            return iM42223 + 1;
        }
        return 65536;
    }

    static {
        int[] iArrCopyOf = new int[4096];
        int i = 0;
        for (int i2 = 0; i2 <= 65535; i2++) {
            int upperCase = Character.toUpperCase(i2);
            if (upperCase != i2 || Character.toLowerCase(upperCase) != i2) {
                if (i == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
                }
                iArrCopyOf[i] = i2;
                i++;
            }
        }
        f47256 = Arrays.copyOf(iArrCopyOf, i);
        f47257 = new C7933();
        f47258 = new C16649();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C9235 m36564(C7933 c7933) {
        return C19214.m43755(c7933);
    }
}
