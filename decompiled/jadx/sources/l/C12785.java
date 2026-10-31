package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8GS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12785 extends C16312 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31098(String str) {
        return EnumC21958.m49445(str) != EnumC21958.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31096(String str, List list) {
        if (str != null) {
            list.add(C16312.m38393(str));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m31099(String str) {
        return C16312.m38393(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m31100(String str) {
        return new C7678().m20562(0, str.length(), 0, str) < 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31095(String str, String str2, ArrayList arrayList) {
        C20672 c20672;
        if ("style".equals(str)) {
            C19115 c19115 = new C19115();
            C2908.m8866((AbstractC19261) c19115, str2, true);
            c20672 = c19115.f60635;
        } else {
            if (!str2.startsWith("url(") || !C2908.m8881(str)) {
                return;
            }
            C20672 c20673 = new C20672();
            C2908.m8868(c20673, str, str2);
            c20672 = c20673;
        }
        if (c20672 == null) {
            return;
        }
        AbstractC0915 abstractC0915 = c20672.f66595;
        if (abstractC0915 instanceof C19821) {
            m31096(((C19821) abstractC0915).f64053, arrayList);
        }
        AbstractC0915 abstractC0916 = c20672.f66579;
        if (abstractC0916 instanceof C19821) {
            m31096(((C19821) abstractC0916).f64053, arrayList);
        }
        m31096(c20672.f66611, arrayList);
        m31096(c20672.f66602, arrayList);
        m31096(c20672.f66603, arrayList);
        m31096(c20672.f66601, arrayList);
        m31096(c20672.f66593, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31097(C16312 c16312) {
        C9383 c9383M38409 = c16312.m38409();
        if (c9383M38409.f48531.size() >= 50) {
            return true;
        }
        int iM8822 = 0;
        for (C5149 c5149 : c9383M38409.f48531) {
            if (c5149 instanceof C4298) {
                C2887 c2887 = ((C4298) c5149).f13865;
                if (c2887 != null) {
                    iM8822 += c2887.m8822();
                }
            } else {
                iM8822++;
            }
            if (iM8822 >= 500) {
                return true;
            }
        }
        return false;
    }
}
