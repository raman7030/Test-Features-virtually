package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BN4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21040 extends AbstractC2926 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public List f67884;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f67885;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f67886;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public List f67887;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public List f67888;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f67889;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f67890;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public List f67891;

    public C21040() {
        List list = Collections.EMPTY_LIST;
        this.f67891 = list;
        this.f67888 = list;
        this.f67884 = list;
        this.f67887 = list;
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7983(C12366 c12366, CharSequence charSequence) {
        m8929(charSequence, new C3840(this, c12366));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static RunnableC7477 m47866(C21040 c21040, C12366 c12366, CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        Iterator it;
        HashMap map;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C1323 c1323M29937 = C12334.m29937(charSequence);
        final ArrayList<String> arrayList5 = new ArrayList(1);
        final HashMap map2 = new HashMap();
        map2.put("AbstractMethodError", "java.lang.AbstractMethodError");
        map2.put("Appendable", "java.lang.Appendable");
        map2.put("ArithmeticException", "java.lang.ArithmeticException");
        map2.put("ArrayIndexOutOfBoundsException", "java.lang.ArrayIndexOutOfBoundsException");
        map2.put("ArrayStoreException", "java.lang.ArrayStoreException");
        map2.put("AssertionError", "java.lang.AssertionError");
        map2.put("AutoCloseable", "java.lang.AutoCloseable");
        map2.put("Boolean", "java.lang.Boolean");
        map2.put("BootstrapMethodError", "java.lang.BootstrapMethodError");
        map2.put("Byte", "java.lang.Byte");
        map2.put("Character", "java.lang.Character");
        map2.put("CharSequence", "java.lang.CharSequence");
        map2.put("Class", "java.lang.Class");
        map2.put("ClassCastException", "java.lang.ClassCastException");
        map2.put("ClassCircularityError", "java.lang.ClassCircularityError");
        map2.put("ClassFormatError", "java.lang.ClassFormatError");
        map2.put("ClassLoader", "java.lang.ClassLoader");
        map2.put("ClassNotFoundException", "java.lang.ClassNotFoundException");
        map2.put("Cloneable", "java.lang.Cloneable");
        map2.put("CloneNotSupportedException", "java.lang.CloneNotSupportedException");
        map2.put("Comparable", "java.lang.Comparable");
        map2.put("Compiler", "java.lang.Compiler");
        map2.put("Deprecated", "java.lang.Deprecated");
        map2.put("Double", "java.lang.Double");
        map2.put("Enum", "java.lang.Enum");
        map2.put("EnumConstantNotPresentException", "java.lang.EnumConstantNotPresentException");
        map2.put("Error", "java.lang.Error");
        map2.put("Exception", "java.lang.Exception");
        map2.put("ExceptionInInitializerError", "java.lang.ExceptionInInitializerError");
        map2.put("Float", "java.lang.Float");
        map2.put("FunctionalInterface", "java.lang.FunctionalInterface");
        map2.put("IllegalAccessError", "java.lang.IllegalAccessError");
        map2.put("IllegalAccessException", "java.lang.IllegalAccessException");
        map2.put("IllegalArgumentException", "java.lang.IllegalArgumentException");
        map2.put("IllegalMonitorStateException", "java.lang.IllegalMonitorStateException");
        map2.put("IllegalStateException", "java.lang.IllegalStateException");
        map2.put("IllegalThreadStateException", "java.lang.IllegalThreadStateException");
        map2.put("IncompatibleClassChangeError", "java.lang.IncompatibleClassChangeError");
        map2.put("IndexOutOfBoundsException", "java.lang.IndexOutOfBoundsException");
        map2.put("InheritableThreadLocal", "java.lang.InheritableThreadLocal");
        map2.put("InstantiationError", "java.lang.InstantiationError");
        map2.put("InstantiationException", "java.lang.InstantiationException");
        map2.put("Integer", "java.lang.Integer");
        map2.put("InternalError", "java.lang.InternalError");
        map2.put("InterruptedException", "java.lang.InterruptedException");
        map2.put("Iterable", "java.lang.Iterable");
        map2.put("LinkageError", "java.lang.LinkageError");
        map2.put("Long", "java.lang.Long");
        map2.put("Math", "java.lang.Math");
        map2.put("NegativeArraySizeException", "java.lang.NegativeArraySizeException");
        map2.put("NoClassDefFoundError", "java.lang.NoClassDefFoundError");
        map2.put("NoSuchFieldError", "java.lang.NoSuchFieldError");
        map2.put("NoSuchFieldException", "java.lang.NoSuchFieldException");
        map2.put("NoSuchMethodError", "java.lang.NoSuchMethodError");
        map2.put("NoSuchMethodException", "java.lang.NoSuchMethodException");
        map2.put("NullPointerException", "java.lang.NullPointerException");
        map2.put("Number", "java.lang.Number");
        map2.put("NumberFormatException", "java.lang.NumberFormatException");
        map2.put("Object", "java.lang.Object");
        map2.put("OutOfMemoryError", "java.lang.OutOfMemoryError");
        map2.put("Override", "java.lang.Override");
        map2.put("Package", "java.lang.Package");
        map2.put("Process", "java.lang.Process");
        map2.put("ProcessBuilder", "java.lang.ProcessBuilder");
        map2.put("Readable", "java.lang.Readable");
        map2.put("ReflectiveOperationException", "java.lang.ReflectiveOperationException");
        map2.put("Runnable", "java.lang.Runnable");
        map2.put("Runtime", "java.lang.Runtime");
        map2.put("RuntimeException", "java.lang.RuntimeException");
        map2.put("RuntimePermission", "java.lang.RuntimePermission");
        map2.put("SafeVarargs", "java.lang.SafeVarargs");
        map2.put("SecurityException", "java.lang.SecurityException");
        map2.put("SecurityManager", "java.lang.SecurityManager");
        map2.put("Short", "java.lang.Short");
        map2.put("StackOverflowError", "java.lang.StackOverflowError");
        map2.put("StackTraceElement", "java.lang.StackTraceElement");
        map2.put("StrictMath", "java.lang.StrictMath");
        map2.put("String", "java.lang.String");
        map2.put("StringBuffer", "java.lang.StringBuffer");
        map2.put("StringBuilder", "java.lang.StringBuilder");
        map2.put("StringIndexOutOfBoundsException", "java.lang.StringIndexOutOfBoundsException");
        map2.put("SuppressWarnings", "java.lang.SuppressWarnings");
        map2.put("System", "java.lang.System");
        map2.put("Thread", "java.lang.Thread");
        map2.put("ThreadDeath", "java.lang.ThreadDeath");
        map2.put("ThreadGroup", "java.lang.ThreadGroup");
        map2.put("ThreadLocal", "java.lang.ThreadLocal");
        map2.put("Throwable", "java.lang.Throwable");
        map2.put("TypeNotPresentException", "java.lang.TypeNotPresentException");
        map2.put("UnknownError", "java.lang.UnknownError");
        map2.put("UnsatisfiedLinkError", "java.lang.UnsatisfiedLinkError");
        map2.put("UnsupportedClassVersionError", "java.lang.UnsupportedClassVersionError");
        map2.put("UnsupportedOperationException", "java.lang.UnsupportedOperationException");
        map2.put("VerifyError", "java.lang.VerifyError");
        map2.put("VirtualMachineError", "java.lang.VirtualMachineError");
        map2.put("Void", "java.lang.Void");
        for (AbstractC5144 abstractC5144 : c1323M29937.f4738) {
            if (abstractC5144 instanceof C10643) {
                C6262 c6262 = (C6262) ((C10643) abstractC5144).f32021;
                map2.put(c6262.f19395.toString(), c6262.toString());
            } else if (abstractC5144 instanceof C5557) {
                arrayList5.add(((C5557) abstractC5144).f17180.toString());
            }
        }
        final String str = c1323M29937.m4615() == null ? "" : c1323M29937.m4615().toString() + ".";
        char c = '/';
        RunnableC7477 runnableC7477 = null;
        c12366.m30034(new InterfaceC7159() { // from class: l.ۧᩳۢ
            @Override // l.InterfaceC7159
            /* JADX INFO: renamed from: ֫ */
            public final void mo19184(InterfaceC13508 interfaceC13508) {
                String strMo31672 = ((C13071) interfaceC13508).mo31672();
                String str2 = str;
                String strSubstring = strMo31672.substring(str2.length());
                int iIndexOf = strSubstring.indexOf(36);
                HashMap map3 = map2;
                if (iIndexOf == -1) {
                    map3.put(strSubstring, str2.concat(strSubstring));
                    return;
                }
                String strSubstring2 = strSubstring.substring(0, iIndexOf);
                String strSubstring3 = strSubstring.substring(iIndexOf + 1);
                if (arrayList5.contains(strSubstring2) && strSubstring3.indexOf(36) == -1) {
                    map3.put(strSubstring3, str2 + strSubstring2 + '$' + strSubstring3);
                }
            }
        }, str.replace('.', '/'), false, (Predicate) null);
        for (String str2 : arrayList5) {
            map2.put(str2, str + str2);
        }
        Iterator it2 = c1323M29937.f4738.iterator();
        while (it2.hasNext()) {
            AbstractC5144 abstractC5145 = (AbstractC5144) it2.next();
            if (interfaceC17066.mo1526()) {
                return runnableC7477;
            }
            if (abstractC5145 instanceof C5557) {
                C5557 c5557 = (C5557) abstractC5145;
                C8839 c8839 = new C8839();
                c8839.f26917 = c5557.f17180.toString();
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', c));
                c8839.f26919 = C9045.m23341(sb, c8839.f26917, l.b);
                int iM19455 = C7260.m19455(c5557);
                c8839.f26918 = iM19455;
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', iM19455 + 1);
                c8839.f26916 = iIndexOf;
                if (iIndexOf == -1) {
                    c8839.f26916 = charSequence.length();
                }
                arrayList.add(c8839);
                for (AbstractC5144 abstractC5146 : c5557.f17179) {
                    if (abstractC5146 instanceof C9378) {
                        C9378 c9378 = (C9378) abstractC5146;
                        C14482 c14482 = new C14482();
                        c14482.f44373 = c9378.f28484.toString();
                        c14482.f44370 = m47865(map2, c9378.f28488);
                        c14482.f44369 = c8839.f26919;
                        AbstractC12612 abstractC12612 = c9378.f28487;
                        if (abstractC12612 instanceof C23342) {
                            c14482.f44374 = abstractC12612.toString();
                        }
                        c14482.f44371 = (c9378.f28486.f7169 & 8) != 0;
                        c14482.f44372 = C7260.m19455(c9378);
                        c14482.f44368 = C7260.m19431(c9378, c1323M29937.f4743);
                        arrayList3.add(c14482);
                        it = it2;
                        map = map2;
                    } else if (abstractC5146 instanceof C8526) {
                        C8526 c8526 = (C8526) abstractC5146;
                        C23655 c23655 = new C23655();
                        c23655.f76634 = c8526.f26044.toString();
                        c23655.f76633 = m47865(map2, c8526.f26051);
                        c23655.f76632 = c8839.f26919;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it3 = c8526.f26048.iterator();
                        while (it3.hasNext()) {
                            sb2.append(m47865(map2, ((C9378) it3.next()).f28488));
                            it2 = it2;
                        }
                        it = it2;
                        map = map2;
                        Set setM45151 = C19642.m45151(c8526.f26046.f7169);
                        c23655.f76635 = (setM45151.contains(EnumC2113.f7055) || setM45151.contains(EnumC2113.f7061) || c23655.f76634.equals("<init>")) ? false : true;
                        c23655.f76629 = sb2.toString();
                        c23655.f76631 = C7260.m19455(c8526);
                        c23655.f76630 = C7260.m19431(c8526, c1323M29937.f4743);
                        arrayList2.add(c23655);
                    } else {
                        it = it2;
                        map = map2;
                        if (abstractC5146 instanceof C2735) {
                            C2735 c2735 = (C2735) abstractC5146;
                            C23655 c23656 = new C23655();
                            c23656.f76634 = "<clinit>";
                            c23656.f76633 = "V";
                            c23656.f76629 = "";
                            c23656.f76632 = c8839.f26919;
                            c23656.f76635 = false;
                            c23656.f76631 = C7260.m19455(c2735);
                            c23656.f76630 = C7260.m19431(c2735, c1323M29937.f4743);
                            arrayList2.add(c23656);
                        }
                    }
                    c = '/';
                    it2 = it;
                    map2 = map;
                }
                runnableC7477 = null;
            }
        }
        new C18217(c1323M29937, charSequence, arrayList4).mo1367(c1323M29937);
        return new RunnableC7477(c21040, arrayList, arrayList2, arrayList3, arrayList4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47867(C21040 c21040, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c21040.f67891 = C20195.unmodifiableList(arrayList);
        c21040.f67888 = C20195.unmodifiableList(arrayList2);
        c21040.f67884 = C20195.unmodifiableList(arrayList3);
        c21040.f67887 = C20195.unmodifiableList(arrayList4);
        ?? r1 = c21040.f67886;
        if (r1 != 0) {
            c21040.m47869(c21040.f67890, c21040.f67889, r1);
        }
        InterfaceC6722 interfaceC6722 = c21040.f7936;
        if (interfaceC6722 != null) {
            interfaceC6722.mo18292(c21040.f67891, c21040.f67888, c21040.f67884, c21040.f67887);
        }
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7979() {
        if (m8931()) {
            return this.f67885;
        }
        return null;
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7980(final int i, final int i2, final InterfaceC20834 interfaceC20834) {
        m8930(new Runnable(interfaceC20834, i, i2) { // from class: l.֫ᩳۢ

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f6662;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f6663;

            /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC14346 f6665;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f6665 = (AbstractC14346) interfaceC20834;
                this.f6663 = i;
                this.f6662 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C21040.m47868(this.f6664, (InterfaceC20834) this.f6665, this.f6663, this.f6662);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47868(C21040 c21040, InterfaceC20834 interfaceC20834, int i, int i2) {
        c21040.f67886 = (AbstractC14346) interfaceC20834;
        c21040.f67890 = i;
        c21040.f67889 = i2;
        if (c21040.m8931()) {
            c21040.m47869(i, i2, interfaceC20834);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47869(int i, int i2, InterfaceC20834 interfaceC20834) {
        int i3;
        int i4;
        int i5;
        this.f67885 = null;
        for (C8839 c8839 : this.f67891) {
            int i6 = c8839.f26918;
            if (i >= i6 && i <= (i5 = c8839.f26916)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f67885 = c8839;
                    interfaceC20834.mo17422(-1, -1, c8839.f26917);
                    return;
                }
            }
        }
        for (C14482 c14482 : this.f67884) {
            int i7 = c14482.f44372;
            if (i >= i7 && i <= (i4 = c14482.f44368)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f67885 = c14482;
                    interfaceC20834.mo17422(-1, -1, c14482.f44373);
                    return;
                }
            }
        }
        for (C23655 c23655 : this.f67888) {
            int i8 = c23655.f76631;
            if (i >= i8 && i <= (i3 = c23655.f76630)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f67885 = c23655;
                    interfaceC20834.mo17422(c23655.f76631, c23655.f76630, C9045.m23341(new StringBuilder(), c23655.f76634, "()"));
                    return;
                }
            }
        }
        interfaceC20834.mo17422(0, 0, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47865(HashMap map, AbstractC12612 abstractC12612) {
        if (abstractC12612 == null) {
            return "V";
        }
        if (abstractC12612 instanceof C2882) {
            C2882 c2882 = (C2882) abstractC12612;
            switch (C16805.f51592[c2882.f9190.ordinal()]) {
                case 1:
                    return "Z";
                case 2:
                    return "B";
                case 3:
                    return "S";
                case 4:
                    return "I";
                case 5:
                    return "J";
                case 6:
                    return "C";
                case 7:
                    return "F";
                case 8:
                    return "D";
                case 9:
                    return "V";
                default:
                    throw new RuntimeException("unknown primitive type " + c2882);
            }
        }
        if (!(abstractC12612 instanceof C7673) && !(abstractC12612 instanceof C6262)) {
            if (abstractC12612 instanceof C23901) {
                return "[" + m47865(map, ((C23901) abstractC12612).f77274);
            }
            if (abstractC12612 instanceof C16432) {
                return m47865(map, ((C16432) abstractC12612).f50542);
            }
            if (abstractC12612 instanceof C3440) {
                return "<error>";
            }
            throw new RuntimeException("unknown type " + abstractC12612.getClass().getSimpleName() + " " + abstractC12612);
        }
        String string = abstractC12612.toString();
        int iIndexOf = string.indexOf(46);
        if (iIndexOf == -1) {
            String str = (String) C13843.getOrDefault(map, string, string);
            C11003.requireNonNull(str);
            return "L" + str.replace('.', '/') + l.b;
        }
        String strSubstring = string.substring(0, iIndexOf);
        if (((String) map.get(strSubstring)) == null) {
            return "L" + string.replace('.', '/') + l.b;
        }
        StringBuilder sbM15339 = C5368.m15339(strSubstring);
        sbM15339.append(string.substring(iIndexOf).replace('.', '$'));
        return "L" + sbM15339.toString().replace('.', '/') + l.b;
    }
}
