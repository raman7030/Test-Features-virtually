package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C22365 extends AbstractC5149 {

    /* JADX INFO: renamed from: ֫֫ */
    public List f70570;

    /* JADX INFO: renamed from: ۟ */
    public Object f70571;

    /* JADX INFO: renamed from: ۧ֫ */
    public AbstractC16003 f70572;

    /* JADX INFO: renamed from: ܳ֫ */
    public List f70573;

    /* JADX INFO: renamed from: ܽ֫ */
    public List f70574;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f70575;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f70576;

    /* JADX INFO: renamed from: ᩻֫ */
    public List f70577;

    public C22365() {
        List list = Collections.EMPTY_LIST;
        this.f70577 = list;
        this.f70574 = list;
        this.f70570 = list;
        this.f70573 = list;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10031(C14121 c14121, CharSequence charSequence) {
        m10997(charSequence, new C6018(this, c14121));
    }

    /* JADX INFO: renamed from: ֫ */
    public static RunnableC9475 m50196(C22365 c22365, C14121 c14121, CharSequence charSequence, InterfaceC18588 interfaceC18588) {
        Iterator it;
        HashMap map;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C3626 c3626M31997 = C14091.m31997(charSequence);
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
        for (AbstractC7257 abstractC7257 : c3626M31997.f7509) {
            if (abstractC7257 instanceof C12483) {
                C8320 c8320 = (C8320) ((C12483) abstractC7257).f34992;
                map2.put(c8320.f22259.toString(), c8320.toString());
            } else if (abstractC7257 instanceof C7650) {
                arrayList5.add(((C7650) abstractC7257).f20021.toString());
            }
        }
        final String str = c3626M31997.m6847() == null ? "" : c3626M31997.m6847().toString() + ".";
        char c = '/';
        RunnableC9475 runnableC9475 = null;
        c14121.m32095(new InterfaceC9172() { // from class: l.ۧᩳۢ
            @Override // p067l.InterfaceC9172
            /* JADX INFO: renamed from: ֫ */
            public final void mo21127(InterfaceC15206 interfaceC15206) {
                String strMo33760 = ((C14791) interfaceC15206).mo33760();
                String str2 = str;
                String strSubstring = strMo33760.substring(str2.length());
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
        Iterator it2 = c3626M31997.f7509.iterator();
        while (it2.hasNext()) {
            AbstractC7257 abstractC7258 = (AbstractC7257) it2.next();
            if (interfaceC18588.mo3924()) {
                return runnableC9475;
            }
            if (abstractC7258 instanceof C7650) {
                C7650 c7650 = (C7650) abstractC7258;
                C10769 c10769 = new C10769();
                c10769.f29841 = c7650.f20021.toString();
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', c));
                c10769.f29843 = C10965.m25286(sb, c10769.f29841, C0249l.f1196b);
                int iM21421 = C9268.m21421(c7650);
                c10769.f29842 = iM21421;
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', iM21421 + 1);
                c10769.f29840 = iIndexOf;
                if (iIndexOf == -1) {
                    c10769.f29840 = charSequence.length();
                }
                arrayList.add(c10769);
                for (AbstractC7257 abstractC7259 : c7650.f20020) {
                    if (abstractC7259 instanceof C11281) {
                        C11281 c11281 = (C11281) abstractC7259;
                        C16132 c16132 = new C16132();
                        c16132.f47474 = c11281.f31433.toString();
                        c16132.f47471 = m50195(map2, c11281.f31437);
                        c16132.f47470 = c10769.f29843;
                        AbstractC14355 abstractC14355 = c11281.f31436;
                        if (abstractC14355 instanceof C24552) {
                            c16132.f47475 = abstractC14355.toString();
                        }
                        c16132.f47472 = (c11281.f31435.f9954 & 8) != 0;
                        c16132.f47473 = C9268.m21421(c11281);
                        c16132.f47469 = C9268.m21397(c11281, c3626M31997.f7514);
                        arrayList3.add(c16132);
                        it = it2;
                        map = map2;
                    } else if (abstractC7259 instanceof C10471) {
                        C10471 c10471 = (C10471) abstractC7259;
                        C24850 c24850 = new C24850();
                        c24850.f79380 = c10471.f28959.toString();
                        c24850.f79379 = m50195(map2, c10471.f28966);
                        c24850.f79378 = c10769.f29843;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it3 = c10471.f28963.iterator();
                        while (it3.hasNext()) {
                            sb2.append(m50195(map2, ((C11281) it3.next()).f31437));
                            it2 = it2;
                        }
                        it = it2;
                        map = map2;
                        Set setM47447 = C21036.m47447(c10471.f28961.f9954);
                        c24850.f79381 = (setM47447.contains(EnumC4377.f9840) || setM47447.contains(EnumC4377.f9846) || c24850.f79380.equals("<init>")) ? false : true;
                        c24850.f79375 = sb2.toString();
                        c24850.f79377 = C9268.m21421(c10471);
                        c24850.f79376 = C9268.m21397(c10471, c3626M31997.f7514);
                        arrayList2.add(c24850);
                    } else {
                        it = it2;
                        map = map2;
                        if (abstractC7259 instanceof C4968) {
                            C4968 c4968 = (C4968) abstractC7259;
                            C24850 c24851 = new C24850();
                            c24851.f79380 = "<clinit>";
                            c24851.f79379 = "V";
                            c24851.f79375 = "";
                            c24851.f79378 = c10769.f29843;
                            c24851.f79381 = false;
                            c24851.f79377 = C9268.m21421(c4968);
                            c24851.f79376 = C9268.m21397(c4968, c3626M31997.f7514);
                            arrayList2.add(c24851);
                        }
                    }
                    c = '/';
                    it2 = it;
                    map2 = map;
                }
                runnableC9475 = null;
            }
        }
        new C19682(c3626M31997, charSequence, arrayList4).mo3780(c3626M31997);
        return new RunnableC9475(c22365, arrayList, arrayList2, arrayList3, arrayList4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50197(C22365 c22365, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c22365.f70577 = C21562.unmodifiableList(arrayList);
        c22365.f70574 = C21562.unmodifiableList(arrayList2);
        c22365.f70570 = C21562.unmodifiableList(arrayList3);
        c22365.f70573 = C21562.unmodifiableList(arrayList4);
        ?? r1 = c22365.f70572;
        if (r1 != 0) {
            c22365.m50199(c22365.f70576, c22365.f70575, r1);
        }
        InterfaceC8757 interfaceC8757 = c22365.f10724;
        if (interfaceC8757 != null) {
            interfaceC8757.mo20240(c22365.f70577, c22365.f70574, c22365.f70570, c22365.f70573);
        }
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10027() {
        if (m10999()) {
            return this.f70571;
        }
        return null;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10028(final int i, final int i2, final InterfaceC22169 interfaceC22169) {
        m10998(new Runnable(interfaceC22169, i, i2) { // from class: l.֫ᩳۢ

            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ int f9442;

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ int f9443;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ AbstractC16003 f9445;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f9445 = (AbstractC16003) interfaceC22169;
                this.f9443 = i;
                this.f9442 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C22365.m50198(this.f9444, (InterfaceC22169) this.f9445, this.f9443, this.f9442);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50198(C22365 c22365, InterfaceC22169 interfaceC22169, int i, int i2) {
        c22365.f70572 = (AbstractC16003) interfaceC22169;
        c22365.f70576 = i;
        c22365.f70575 = i2;
        if (c22365.m10999()) {
            c22365.m50199(i, i2, interfaceC22169);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m50199(int i, int i2, InterfaceC22169 interfaceC22169) {
        int i3;
        int i4;
        int i5;
        this.f70571 = null;
        for (C10769 c10769 : this.f70577) {
            int i6 = c10769.f29842;
            if (i >= i6 && i <= (i5 = c10769.f29840)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f70571 = c10769;
                    interfaceC22169.mo19362(-1, -1, c10769.f29841);
                    return;
                }
            }
        }
        for (C16132 c16132 : this.f70570) {
            int i7 = c16132.f47473;
            if (i >= i7 && i <= (i4 = c16132.f47469)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f70571 = c16132;
                    interfaceC22169.mo19362(-1, -1, c16132.f47474);
                    return;
                }
            }
        }
        for (C24850 c24850 : this.f70574) {
            int i8 = c24850.f79377;
            if (i >= i8 && i <= (i3 = c24850.f79376)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f70571 = c24850;
                    interfaceC22169.mo19362(c24850.f79377, c24850.f79376, C10965.m25286(new StringBuilder(), c24850.f79380, "()"));
                    return;
                }
            }
        }
        interfaceC22169.mo19362(0, 0, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50195(HashMap map, AbstractC14355 abstractC14355) {
        if (abstractC14355 == null) {
            return "V";
        }
        if (abstractC14355 instanceof C5107) {
            C5107 c5107 = (C5107) abstractC14355;
            switch (C18340.f54774[c5107.f11988.ordinal()]) {
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
                    throw new RuntimeException("unknown primitive type " + c5107);
            }
        }
        if (!(abstractC14355 instanceof C9661) && !(abstractC14355 instanceof C8320)) {
            if (abstractC14355 instanceof C25084) {
                return "[" + m50195(map, ((C25084) abstractC14355).f80025);
            }
            if (abstractC14355 instanceof C17985) {
                return m50195(map, ((C17985) abstractC14355).f53722);
            }
            if (abstractC14355 instanceof C5638) {
                return "<error>";
            }
            throw new RuntimeException("unknown type " + abstractC14355.getClass().getSimpleName() + " " + abstractC14355);
        }
        String string = abstractC14355.toString();
        int iIndexOf = string.indexOf(46);
        if (iIndexOf == -1) {
            String str = (String) C15525.getOrDefault(map, string, string);
            C12826.requireNonNull(str);
            return "L" + str.replace('.', '/') + C0249l.f1196b;
        }
        String strSubstring = string.substring(0, iIndexOf);
        if (((String) map.get(strSubstring)) == null) {
            return "L" + string.replace('.', '/') + C0249l.f1196b;
        }
        StringBuilder sbM17248 = C7470.m17248(strSubstring);
        sbM17248.append(string.substring(iIndexOf).replace('.', '$'));
        return "L" + sbM17248.toString().replace('.', '/') + C0249l.f1196b;
    }
}
