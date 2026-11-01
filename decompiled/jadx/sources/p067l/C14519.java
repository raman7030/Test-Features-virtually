package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8GS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14519 extends C17871 {
    /* JADX INFO: renamed from: ܽ */
    public static boolean m33182(String str) {
        return EnumC23237.m51782(str) != EnumC23237.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33180(String str, List list) {
        if (str != null) {
            list.add(C17871.m40608(str));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m33183(String str) {
        return C17871.m40608(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m33184(String str) {
        return new C9666().m22542(0, str.length(), 0, str) < 1.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33179(String str, String str2, ArrayList arrayList) {
        C22015 c22015;
        if ("style".equals(str)) {
            C20535 c20535 = new C20535();
            C5132.m10933((AbstractC20674) c20535, str2, true);
            c22015 = c20535.f63865;
        } else {
            if (!str2.startsWith("url(") || !C5132.m10948(str)) {
                return;
            }
            C22015 c22016 = new C22015();
            C5132.m10935(c22016, str, str2);
            c22015 = c22016;
        }
        if (c22015 == null) {
            return;
        }
        AbstractC3238 abstractC3238 = c22015.f69277;
        if (abstractC3238 instanceof C21206) {
            m33180(((C21206) abstractC3238).f66690, arrayList);
        }
        AbstractC3238 abstractC3239 = c22015.f69261;
        if (abstractC3239 instanceof C21206) {
            m33180(((C21206) abstractC3239).f66690, arrayList);
        }
        m33180(c22015.f69293, arrayList);
        m33180(c22015.f69284, arrayList);
        m33180(c22015.f69285, arrayList);
        m33180(c22015.f69283, arrayList);
        m33180(c22015.f69275, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33181(C17871 c17871) {
        C11286 c11286M40624 = c17871.m40624();
        if (c11286M40624.f51671.size() >= 50) {
            return true;
        }
        int iM10889 = 0;
        for (C7262 c7262 : c11286M40624.f51671) {
            if (c7262 instanceof C6453) {
                C5112 c5112 = ((C6453) c7262).f16680;
                if (c5112 != null) {
                    iM10889 += c5112.m10889();
                }
            } else {
                iM10889++;
            }
            if (iM10889 >= 500) {
                return true;
            }
        }
        return false;
    }
}
