package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5Z7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14292 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34069(String str) {
        return m34070(C11926.m29091(str)).m29099();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11926 m34070(C11926 c11926) {
        switch (c11926.m29102()) {
            case 9:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c11926.m29100(); i++) {
                    sb.append('[');
                }
                sb.append(m34070(c11926.m29101()).m29099());
                return C11926.m29091(sb.toString());
            case 10:
                String strM29103 = c11926.m29103();
                return strM29103 != null ? C11926.m29095(strM29103) : c11926;
            case 11:
                return C11926.m29096(m34072(c11926.m29099()));
            default:
                return c11926;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34073(String str) {
        if (str == null) {
            return null;
        }
        return m34070(C11926.m29095(str)).m29103();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m34071(String[] strArr) {
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String strM34073 = m34073(strArr[i]);
            if (strM34073 != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i] = strM34073;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34072(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        for (C11926 c11926 : C11926.m29092(str)) {
            sb.append(m34070(c11926).m29099());
        }
        C11926 c11926M29093 = C11926.m29093(str);
        if (c11926M29093 == C11926.f35644) {
            sb.append(")V");
        } else {
            sb.append(')');
            sb.append(m34070(c11926M29093).m29099());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m34068(Object obj) {
        String strM2586;
        if (obj instanceof C11926) {
            return m34070((C11926) obj);
        }
        if (obj instanceof C0636) {
            C0636 c0636 = (C0636) obj;
            i = c0636.m2589() <= 4 ? 1 : 0;
            int iM2589 = c0636.m2589();
            String strM34073 = m34073(c0636.m2587());
            if (i != 0) {
                strM2586 = c0636.m2586();
            } else {
                strM2586 = c0636.m2586();
            }
            String str = strM2586;
            String strM2585 = c0636.m2585();
            return new C0636(iM2589, strM34073, str, i != 0 ? m34069(strM2585) : m34072(strM2585), c0636.m2588());
        }
        if (!(obj instanceof C21099)) {
            return obj;
        }
        C21099 c21099 = (C21099) obj;
        String strM48009 = c21099.m48009();
        String strM48010 = c21099.m48010();
        C0636 c0636M48006 = c21099.m48006();
        int iM48007 = c21099.m48007();
        Object[] objArr = new Object[iM48007];
        Object[] objArr2 = new Object[iM48007];
        for (int i = 0; i < iM48007; i++) {
            Object objM48005 = c21099.m48005(i);
            objArr[i] = objM48005;
            objArr2[i] = m34068(objM48005);
        }
        return new C21099(strM48009, m34069(strM48010), (C0636) m34068(c0636M48006), objArr2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34074(String str, boolean z) {
        if (str == null) {
            return null;
        }
        C6532 c6532 = new C6532(str);
        C9355 c9355 = new C9355();
        C23465 c23465 = new C23465(c9355, this);
        if (z) {
            c6532.m18040(c23465);
        } else {
            c6532.m18039(c23465);
        }
        return c9355.toString();
    }
}
