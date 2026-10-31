package l;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22364 extends AbstractC2197 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f72451;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HashSet f72452;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14602 f72453;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f72454;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f72455;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC14106 f72456;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HashSet f72457;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f72458;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f72459;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f72460;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f72461;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f72462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f72463;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f72464;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f72465;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f72466;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC1197 f72467;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumMap f72468;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC12816 f72469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4314 f72449 = new C4314();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4314 f72448 = new C4314();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4314 f72450 = new C4314();

    public C22364() {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22364 m50099(C2903 c2903) {
        C22364 c22364 = (C22364) c2903.m8838(f72449);
        return c22364 == null ? new C22364(c2903) : c22364;
    }

    public C22364(C2903 c2903) {
        EnumMap enumMapM50097;
        PrintWriter printWriter = (PrintWriter) c2903.m8838(f72448);
        PrintWriter printWriter2 = (PrintWriter) c2903.m8838(f72450);
        if (printWriter == null && printWriter2 == null) {
            enumMapM50097 = m50097(new PrintWriter((OutputStream) System.out, true), new PrintWriter((OutputStream) System.err, true));
        } else if (printWriter == null || printWriter2 == null) {
            printWriter = printWriter == null ? printWriter2 : printWriter;
            enumMapM50097 = m50097(printWriter, printWriter);
        } else {
            enumMapM50097 = m50097(printWriter, printWriter2);
        }
        this.f7221 = C5931.m16615(c2903);
        this.f7223 = new HashMap();
        this.f72454 = 0;
        this.f72451 = 0;
        this.f72465 = 0;
        this.f72466 = 0;
        this.f72452 = new HashSet();
        this.f72457 = new HashSet();
        c2903.m8841(f72449, this);
        this.f72468 = enumMapM50097;
        this.f72456 = (InterfaceC14106) c2903.m8837(InterfaceC14106.class);
        this.f72467 = new C0491(this);
        C14602 c14602M34851 = C14602.m34851(c2903);
        this.f72453 = c14602M34851;
        c14602M34851.m34858("com.sun.tools.javac.resources.javac");
        C11781 c11781M28823 = C11781.m28823(c2903);
        m50101(c11781M28823);
        c11781M28823.m28827(new RunnableC19473(5, this, c11781M28823));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumMap m50097(PrintWriter printWriter, PrintWriter printWriter2) {
        EnumMap enumMap = new EnumMap(EnumC21659.class);
        enumMap.put(EnumC21659.ERROR, printWriter2);
        enumMap.put(EnumC21659.WARNING, printWriter2);
        enumMap.put(EnumC21659.NOTICE, printWriter2);
        enumMap.put(EnumC21659.STDOUT, printWriter);
        enumMap.put(EnumC21659.STDERR, printWriter2);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50101(C11781 c11781) {
        int i;
        InterfaceC12816 c5019;
        this.f72459 = c11781.m28832(EnumC0121.f1195);
        this.f72455 = c11781.m28832(EnumC0121.f1138);
        this.f72458 = c11781.m28833(EnumC0121.f1177, "none");
        this.f72461 = c11781.m28831("suppressNotes");
        String strM28825 = c11781.m28825(EnumC0121.f1211);
        int i2 = Integer.MAX_VALUE;
        if (strM28825 != null) {
            try {
                i = Integer.parseInt(strM28825);
                if (i <= 0) {
                    i = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException unused) {
                i = 100;
            }
        } else {
            i = 100;
        }
        this.f72464 = i;
        String strM28826 = c11781.m28825(EnumC0121.f1148);
        if (strM28826 != null) {
            try {
                int i3 = Integer.parseInt(strM28826);
                if (i3 > 0) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused2) {
                i2 = 100;
            }
        } else {
            i2 = 100;
        }
        this.f72463 = i2;
        if (c11781.m28831("rawDiagnostics")) {
            c5019 = new C17614(c11781);
        } else {
            c5019 = new C5019(c11781, this.f72453);
        }
        this.f72469 = c5019;
        String strM28824 = c11781.m28824("expectKeys");
        if (strM28824 != null) {
            this.f72462 = new HashSet(Arrays.asList(strM28824.split(", *")));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m50124() {
        return this.f72456 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50114(InterfaceC18278 interfaceC18278, InterfaceC2029 interfaceC2029) {
        C12171.m29637(interfaceC18278);
        C14397 c14397M7267 = m7267(interfaceC18278);
        InterfaceC2029 interfaceC20210 = c14397M7267.f43369;
        if (interfaceC20210 != null && interfaceC20210 != interfaceC2029) {
            throw new IllegalStateException("endPosTable already set");
        }
        c14397M7267.f43369 = interfaceC2029;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m50117() {
        C14397 c14397 = this.f7222;
        if (c14397 == null) {
            return null;
        }
        return c14397.f43371;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12816 m50125() {
        return this.f72469;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50113(C2798 c2798) {
        this.f72469 = c2798;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PrintWriter m50107(EnumC21659 enumC21659) {
        return (PrintWriter) this.f72468.get(enumC21659);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50110(PrintWriter printWriter) {
        for (EnumC21659 enumC21659 : EnumC21659.values()) {
            this.f72468.put(enumC21659, printWriter);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50112(AbstractC1197 abstractC1197) {
        C12171.m29642(this.f72467 == abstractC1197);
        this.f72467 = abstractC1197.f4332;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50122() {
        Iterator it = this.f72468.values().iterator();
        while (it.hasNext()) {
            ((PrintWriter) it.next()).flush();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50105(C22364 c22364, C16719 c16719) {
        HashSet hashSet = c22364.f72457;
        InterfaceC18278 interfaceC18278M39350 = c16719.m39350();
        if (interfaceC18278M39350 == null) {
            return true;
        }
        int iM39358 = c16719.m39358();
        HashSet hashSet2 = c22364.f72452;
        C23069 c23069 = new C23069(interfaceC18278M39350, Integer.valueOf(iM39358));
        boolean zContains = hashSet2.contains(c23069);
        if (!zContains) {
            hashSet2.add(c23069);
        }
        if (zContains) {
            return false;
        }
        if (!c16719.m39346(EnumC20043.SOURCE_LEVEL)) {
            return true;
        }
        C18837 c18837 = new C18837();
        m50102(c18837, c16719);
        C23069 c230610 = new C23069(interfaceC18278M39350, c18837.m43517());
        boolean zContains2 = hashSet.contains(c230610);
        boolean z = !zContains2;
        if (!zContains2) {
            hashSet.add(c230610);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50102(C18837 c18837, C16719 c16719) {
        c18837.m43511(c16719.mo29298());
        for (Object obj : c16719.m39354()) {
            if (obj instanceof C16719) {
                m50102(c18837, (C16719) obj);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50116(AbstractC5144 abstractC5144) {
        C14397 c14397 = this.f7222;
        InterfaceC18278 interfaceC18278 = c14397 != null ? c14397.f43371 : null;
        if (interfaceC18278 != null) {
            return this.f72452.contains(new C23069(interfaceC18278, Integer.valueOf(abstractC5144.f16085)));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50118(String str, Object... objArr) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), m50109(EnumC15307.COMPILER_MISC, str, objArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50119(AbstractC4520 abstractC4520) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), this.f72453.m34855(abstractC4520));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50120(EnumC15307 enumC15307, String str, Object... objArr) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), m50109(enumC15307, str, objArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50111(String str) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50115(EnumC21659 enumC21659, String str) {
        m50100(m50107(enumC21659), str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50100(PrintWriter printWriter, String str) {
        while (true) {
            int iIndexOf = str.indexOf(10);
            if (iIndexOf == -1) {
                break;
            }
            printWriter.println(str.substring(0, iIndexOf));
            str = str.substring(iIndexOf + 1);
        }
        if (str.length() != 0) {
            printWriter.println(str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50123(String str, Object... objArr) {
        m50100((PrintWriter) this.f72468.get(EnumC21659.NOTICE), m50109(EnumC15307.COMPILER_MISC, "verbose.".concat(str), objArr));
    }

    @Override // l.AbstractC2197
    /* JADX INFO: renamed from: ֫ */
    public final void mo7283(Object... objArr) {
        PrintWriter printWriter = (PrintWriter) this.f72468.get(EnumC21659.ERROR);
        m50100(printWriter, m50109(EnumC15307.COMPILER_MISC, "source.unavailable", objArr));
        printWriter.flush();
    }

    @Override // l.AbstractC2197
    /* JADX INFO: renamed from: ֫ */
    public final void mo7277(C16719 c16719) {
        this.f72467.mo2165(c16719);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50121(C16719 c16719) {
        PrintWriter printWriter;
        int i;
        InterfaceC14106 interfaceC14106 = this.f72456;
        if (interfaceC14106 != null) {
            interfaceC14106.mo33719(c16719);
            return;
        }
        EnumC12986 enumC12986M39353 = c16719.m39353();
        int[] iArr = C19543.f63196;
        int i2 = iArr[enumC12986M39353.ordinal()];
        if (i2 != 1) {
            EnumMap enumMap = this.f72468;
            if (i2 == 2) {
                printWriter = (PrintWriter) enumMap.get(EnumC21659.NOTICE);
            } else if (i2 == 3) {
                printWriter = (PrintWriter) enumMap.get(EnumC21659.WARNING);
            } else if (i2 == 4) {
                printWriter = (PrintWriter) enumMap.get(EnumC21659.ERROR);
            } else {
                throw new Error();
            }
            m50100(printWriter, this.f72469.mo8643(c16719, this.f72453.m34856()));
            if (this.f72455 && (((i = iArr[c16719.m39353().ordinal()]) == 3 || i == 4) && this.f72455)) {
                System.err.println(m50109(EnumC15307.COMPILER_MISC, "resume.abort", new Object[0]));
                while (true) {
                    try {
                        int i3 = System.in.read();
                        if (i3 != 65) {
                            if (i3 == 82) {
                                break;
                            }
                            if (i3 != 88) {
                                if (i3 != 97) {
                                    if (i3 == 114) {
                                        break;
                                    } else if (i3 != 120) {
                                    }
                                }
                            }
                            throw new AssertionError("user abort");
                        }
                        System.exit(-1);
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            if (this.f72459) {
                new RuntimeException().printStackTrace(printWriter);
            }
            printWriter.flush();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m50106(String str, Object... objArr) {
        return C14602.m34852(EnumC15307.COMPILER_MISC.m36326(str), objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50108(AbstractC4520 abstractC4520) {
        return this.f72453.m34855(abstractC4520);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50109(EnumC15307 enumC15307, String str, Object... objArr) {
        return this.f72453.m34853(enumC15307.m36326(str), objArr);
    }
}
