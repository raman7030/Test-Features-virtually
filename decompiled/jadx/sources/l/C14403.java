package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C14403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f44163;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5855 f44164;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C15026 f44165;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m34428(int i) {
        if (i >= 65536) {
            return true;
        }
        char c = (char) i;
        int i2 = C2164.f7153;
        return c >= 55296 && c < 57344;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C6436 m34429(C5855 c5855) {
        if (!(c5855 instanceof C0085)) {
            return null;
        }
        C6436 c6436 = new C6436();
        c6436.f19911 = ((C0085) c5855).f1019;
        if (c5855.getClass() == C19843.class) {
            C19843 c19843 = (C19843) c5855;
            c6436.f19910 = 1;
            c6436.f19909 = c19843.f64106;
            c6436.f19907 = c19843.f64106.f17958;
            c6436.f19912 = (int[]) c19843.f64105.clone();
            return c6436;
        }
        if (c5855.getClass() == C5025.class) {
            C5025 c5025 = (C5025) c5855;
            c6436.f19910 = 2;
            c6436.f19909 = c5025.f15820;
            c6436.f19907 = c5025.f15820.f17958;
            c6436.f19914 = c5025.f15821;
            return c6436;
        }
        if (c5855.getClass() == C7847.class) {
            C7847 c7847 = (C7847) c5855;
            c6436.f19910 = 3;
            c6436.f19909 = c7847.f24335;
            c6436.f19908 = Arrays.copyOf(c7847.f24334.f9219, c7847.f24334.f9220);
            return c6436;
        }
        if (c5855.getClass() == C0791.class) {
            C0791 c0791 = (C0791) c5855;
            c6436.f19910 = 4;
            c6436.f19909 = c0791.f2905;
            c6436.f19914 = c0791.f2906;
            return c6436;
        }
        if (c5855.getClass() == C21254.class) {
            C21254 c21254 = (C21254) c5855;
            c6436.f19910 = 5;
            c6436.f19909 = c21254.f68576;
            c6436.f19913 = new C23369(c21254.f68575);
            c6436.f19905 = c21254.f68574;
            return c6436;
        }
        if (c5855.getClass() != C14902.class) {
            return null;
        }
        C14902 c14902 = (C14902) c5855;
        c6436.f19910 = 6;
        c6436.f19909 = c14902.f45463;
        c6436.f19913 = new C23369(c14902.f45460);
        c6436.f19914 = c14902.f45461;
        c6436.f19906 = c14902.f45462;
        return c6436;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23369 m34424(C5855 c5855) {
        if (c5855 instanceof C3033) {
            InterfaceC4444 interfaceC4444 = ((C3033) c5855).f9564;
            if (C12354.m29972(interfaceC4444)) {
                return new C23369(((C14196) interfaceC4444).f42852);
            }
        }
        throw new IllegalArgumentException("Unknown looking-at check: ".concat(c5855.getClass().getName()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m34427(C5855 c5855) {
        if (c5855 instanceof C12205) {
            return ((C12205) c5855).f36419;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m34426(C11355 c11355) {
        return c11355.f33988;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m34422(InterfaceC10795 interfaceC10795, InterfaceC10795 interfaceC10796, InterfaceC10795 interfaceC10797, boolean z) {
        return C7679.m20567(C7679.m20567(interfaceC10795, interfaceC10796, z), interfaceC10797, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m34423(int i) {
        return new C20548(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34421(InterfaceC10795 interfaceC10795) {
        if (interfaceC10795 instanceof C14881) {
            return ((C14881) interfaceC10795).f45421.length << 6;
        }
        if (interfaceC10795 instanceof C18410) {
            return ((C18410) interfaceC10795).f57157.length << 6;
        }
        int iM39980 = C17019.m39980(interfaceC10795);
        if (iM39980 >= 0) {
            return iM39980 + 1;
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
        f44163 = Arrays.copyOf(iArrCopyOf, i);
        f44164 = new C5855();
        f44165 = new C15026();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7225 m34430(C5855 c5855) {
        return C17725.m41509(c5855);
    }
}
