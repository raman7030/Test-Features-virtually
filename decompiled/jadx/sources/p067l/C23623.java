package p067l;

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
public final class C23623 extends AbstractC4456 {

    /* JADX INFO: renamed from: ֡ */
    public int f75177;

    /* JADX INFO: renamed from: ֨ */
    public HashSet f75178;

    /* JADX INFO: renamed from: ۖ */
    public C16246 f75179;

    /* JADX INFO: renamed from: ۘ */
    public int f75180;

    /* JADX INFO: renamed from: ۚ */
    public boolean f75181;

    /* JADX INFO: renamed from: ۜ */
    public InterfaceC15775 f75182;

    /* JADX INFO: renamed from: ۠ */
    public HashSet f75183;

    /* JADX INFO: renamed from: ۡ */
    public boolean f75184;

    /* JADX INFO: renamed from: ۢ */
    public boolean f75185;

    /* JADX INFO: renamed from: ܳ */
    public boolean f75186;

    /* JADX INFO: renamed from: ܶ */
    public boolean f75187;

    /* JADX INFO: renamed from: ܺ */
    public HashSet f75188;

    /* JADX INFO: renamed from: ܿ */
    public int f75189;

    /* JADX INFO: renamed from: ᩳ */
    public int f75190;

    /* JADX INFO: renamed from: ᩴ */
    public int f75191;

    /* JADX INFO: renamed from: ᩵ */
    public int f75192;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC3506 f75193;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumMap f75194;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC14548 f75195;

    /* JADX INFO: renamed from: ᩶ */
    public static final C6468 f75175 = new C6468();

    /* JADX INFO: renamed from: ۙ */
    public static final C6468 f75174 = new C6468();

    /* JADX INFO: renamed from: ᩹ */
    public static final C6468 f75176 = new C6468();

    public C23623() {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23623 m52439(C5127 c5127) {
        C23623 c23623 = (C23623) c5127.m10905(f75175);
        return c23623 == null ? new C23623(c5127) : c23623;
    }

    public C23623(C5127 c5127) {
        EnumMap enumMapM52437;
        PrintWriter printWriter = (PrintWriter) c5127.m10905(f75174);
        PrintWriter printWriter2 = (PrintWriter) c5127.m10905(f75176);
        if (printWriter == null && printWriter2 == null) {
            enumMapM52437 = m52437(new PrintWriter((OutputStream) System.out, true), new PrintWriter((OutputStream) System.err, true));
        } else if (printWriter == null || printWriter2 == null) {
            printWriter = printWriter == null ? printWriter2 : printWriter;
            enumMapM52437 = m52437(printWriter, printWriter);
        } else {
            enumMapM52437 = m52437(printWriter, printWriter2);
        }
        this.f10006 = C8005.m18541(c5127);
        this.f10008 = new HashMap();
        this.f75180 = 0;
        this.f75177 = 0;
        this.f75191 = 0;
        this.f75192 = 0;
        this.f75178 = new HashSet();
        this.f75183 = new HashSet();
        c5127.m10908(f75175, this);
        this.f75194 = enumMapM52437;
        this.f75182 = (InterfaceC15775) c5127.m10904(InterfaceC15775.class);
        this.f75193 = new C2835(this);
        C16246 c16246M37002 = C16246.m37002(c5127);
        this.f75179 = c16246M37002;
        c16246M37002.m37009("com.sun.tools.javac.resources.javac");
        C13565 c13565M30871 = C13565.m30871(c5127);
        m52441(c13565M30871);
        c13565M30871.m30875(new RunnableC20876(5, this, c13565M30871));
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumMap m52437(PrintWriter printWriter, PrintWriter printWriter2) {
        EnumMap enumMap = new EnumMap(EnumC22953.class);
        enumMap.put(EnumC22953.ERROR, printWriter2);
        enumMap.put(EnumC22953.WARNING, printWriter2);
        enumMap.put(EnumC22953.NOTICE, printWriter2);
        enumMap.put(EnumC22953.STDOUT, printWriter);
        enumMap.put(EnumC22953.STDERR, printWriter2);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m52441(C13565 c13565) {
        int i;
        InterfaceC14548 c7138;
        this.f75185 = c13565.m30880(EnumC2483.f3971);
        this.f75181 = c13565.m30880(EnumC2483.f3914);
        this.f75184 = c13565.m30881(EnumC2483.f3953, "none");
        this.f75187 = c13565.m30879("suppressNotes");
        String strM30873 = c13565.m30873(EnumC2483.f3987);
        int i2 = Integer.MAX_VALUE;
        if (strM30873 != null) {
            try {
                i = Integer.parseInt(strM30873);
                if (i <= 0) {
                    i = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException unused) {
                i = 100;
            }
        } else {
            i = 100;
        }
        this.f75190 = i;
        String strM30874 = c13565.m30873(EnumC2483.f3924);
        if (strM30874 != null) {
            try {
                int i3 = Integer.parseInt(strM30874);
                if (i3 > 0) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused2) {
                i2 = 100;
            }
        } else {
            i2 = 100;
        }
        this.f75189 = i2;
        if (c13565.m30879("rawDiagnostics")) {
            c7138 = new C19109(c13565);
        } else {
            c7138 = new C7138(c13565, this.f75179);
        }
        this.f75195 = c7138;
        String strM30872 = c13565.m30872("expectKeys");
        if (strM30872 != null) {
            this.f75188 = new HashSet(Arrays.asList(strM30872.split(", *")));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m52464() {
        return this.f75182 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52454(InterfaceC19740 interfaceC19740, InterfaceC4297 interfaceC4297) {
        C1446.m31699(interfaceC19740);
        C16051 c16051M9346 = m9346(interfaceC19740);
        InterfaceC4297 interfaceC4298 = c16051M9346.f46462;
        if (interfaceC4298 != null && interfaceC4298 != interfaceC4297) {
            throw new IllegalStateException("endPosTable already set");
        }
        c16051M9346.f46462 = interfaceC4297;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19740 m52457() {
        C16051 c16051 = this.f10007;
        if (c16051 == null) {
            return null;
        }
        return c16051.f46464;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC14548 m52465() {
        return this.f75195;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52453(C5028 c5028) {
        this.f75195 = c5028;
    }

    /* JADX INFO: renamed from: ֫ */
    public final PrintWriter m52447(EnumC22953 enumC22953) {
        return (PrintWriter) this.f75194.get(enumC22953);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52450(PrintWriter printWriter) {
        for (EnumC22953 enumC22953 : EnumC22953.values()) {
            this.f75194.put(enumC22953, printWriter);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52452(AbstractC3506 abstractC3506) {
        C1446.m31704(this.f75193 == abstractC3506);
        this.f75193 = abstractC3506.f7101;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52462() {
        Iterator it = this.f75194.values().iterator();
        while (it.hasNext()) {
            ((PrintWriter) it.next()).flush();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52445(C23623 c23623, C18258 c18258) {
        HashSet hashSet = c23623.f75183;
        InterfaceC19740 interfaceC19740M41586 = c18258.m41586();
        if (interfaceC19740M41586 == null) {
            return true;
        }
        int iM41594 = c18258.m41594();
        HashSet hashSet2 = c23623.f75178;
        C24293 c24293 = new C24293(interfaceC19740M41586, Integer.valueOf(iM41594));
        boolean zContains = hashSet2.contains(c24293);
        if (!zContains) {
            hashSet2.add(c24293);
        }
        if (zContains) {
            return false;
        }
        if (!c18258.m41582(EnumC21417.SOURCE_LEVEL)) {
            return true;
        }
        C20271 c20271 = new C20271();
        m52442(c20271, c18258);
        C24293 c24294 = new C24293(interfaceC19740M41586, c20271.m45783());
        boolean zContains2 = hashSet.contains(c24294);
        boolean z = !zContains2;
        if (!zContains2) {
            hashSet.add(c24294);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52442(C20271 c20271, C18258 c18258) {
        c20271.m45777(c18258.mo31353());
        for (Object obj : c18258.m41590()) {
            if (obj instanceof C18258) {
                m52442(c20271, (C18258) obj);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52456(AbstractC7257 abstractC7257) {
        C16051 c16051 = this.f10007;
        InterfaceC19740 interfaceC19740 = c16051 != null ? c16051.f46464 : null;
        if (interfaceC19740 != null) {
            return this.f75178.contains(new C24293(interfaceC19740, Integer.valueOf(abstractC7257.f18924)));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52458(String str, Object... objArr) {
        m52440((PrintWriter) this.f75194.get(EnumC22953.NOTICE), m52449(EnumC16916.COMPILER_MISC, str, objArr));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52459(AbstractC6664 abstractC6664) {
        m52440((PrintWriter) this.f75194.get(EnumC22953.NOTICE), this.f75179.m37006(abstractC6664));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52460(EnumC16916 enumC16916, String str, Object... objArr) {
        m52440((PrintWriter) this.f75194.get(EnumC22953.NOTICE), m52449(enumC16916, str, objArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52451(String str) {
        m52440((PrintWriter) this.f75194.get(EnumC22953.NOTICE), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52455(EnumC22953 enumC22953, String str) {
        m52440(m52447(enumC22953), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52440(PrintWriter printWriter, String str) {
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

    /* JADX INFO: renamed from: ܽ */
    public final void m52463(String str, Object... objArr) {
        m52440((PrintWriter) this.f75194.get(EnumC22953.NOTICE), m52449(EnumC16916.COMPILER_MISC, "verbose.".concat(str), objArr));
    }

    @Override // p067l.AbstractC4456
    /* JADX INFO: renamed from: ֫ */
    public final void mo9362(Object... objArr) {
        PrintWriter printWriter = (PrintWriter) this.f75194.get(EnumC22953.ERROR);
        m52440(printWriter, m52449(EnumC16916.COMPILER_MISC, "source.unavailable", objArr));
        printWriter.flush();
    }

    @Override // p067l.AbstractC4456
    /* JADX INFO: renamed from: ֫ */
    public final void mo9356(C18258 c18258) {
        this.f75193.mo4532(c18258);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52461(C18258 c18258) {
        PrintWriter printWriter;
        int i;
        InterfaceC15775 interfaceC15775 = this.f75182;
        if (interfaceC15775 != null) {
            interfaceC15775.mo35845(c18258);
            return;
        }
        EnumC14710 enumC14710M41589 = c18258.m41589();
        int[] iArr = C20942.f65816;
        int i2 = iArr[enumC14710M41589.ordinal()];
        if (i2 != 1) {
            EnumMap enumMap = this.f75194;
            if (i2 == 2) {
                printWriter = (PrintWriter) enumMap.get(EnumC22953.NOTICE);
            } else if (i2 == 3) {
                printWriter = (PrintWriter) enumMap.get(EnumC22953.WARNING);
            } else if (i2 == 4) {
                printWriter = (PrintWriter) enumMap.get(EnumC22953.ERROR);
            } else {
                throw new Error();
            }
            m52440(printWriter, this.f75195.mo10703(c18258, this.f75179.m37007()));
            if (this.f75181 && (((i = iArr[c18258.m41589().ordinal()]) == 3 || i == 4) && this.f75181)) {
                System.err.println(m52449(EnumC16916.COMPILER_MISC, "resume.abort", new Object[0]));
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
            if (this.f75185) {
                new RuntimeException().printStackTrace(printWriter);
            }
            printWriter.flush();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m52446(String str, Object... objArr) {
        return C16246.m37003(EnumC16916.COMPILER_MISC.m38488(str), objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52448(AbstractC6664 abstractC6664) {
        return this.f75179.m37006(abstractC6664);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52449(EnumC16916 enumC16916, String str, Object... objArr) {
        return this.f75179.m37004(enumC16916.m38488(str), objArr);
    }
}
