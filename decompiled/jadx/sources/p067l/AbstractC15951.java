package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5Z7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15951 {
    /* JADX INFO: renamed from: ֫ */
    public static String m36202(String str) {
        return m36203(C13703.m31144(str)).m31152();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13703 m36203(C13703 c13703) {
        switch (c13703.m31155()) {
            case 9:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c13703.m31153(); i++) {
                    sb.append('[');
                }
                sb.append(m36203(c13703.m31154()).m31152());
                return C13703.m31144(sb.toString());
            case 10:
                String strM31156 = c13703.m31156();
                return strM31156 != null ? C13703.m31148(strM31156) : c13703;
            case 11:
                return C13703.m31149(m36205(c13703.m31152()));
            default:
                return c13703;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m36206(String str) {
        if (str == null) {
            return null;
        }
        return m36203(C13703.m31148(str)).m31156();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String[] m36204(String[] strArr) {
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String strM36206 = m36206(strArr[i]);
            if (strM36206 != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i] = strM36206;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m36205(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        for (C13703 c13703 : C13703.m31145(str)) {
            sb.append(m36203(c13703).m31152());
        }
        C13703 c13703M31146 = C13703.m31146(str);
        if (c13703M31146 == C13703.f38653) {
            sb.append(")V");
        } else {
            sb.append(')');
            sb.append(m36203(c13703M31146).m31152());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m36201(Object obj) {
        String strM4926;
        if (obj instanceof C13703) {
            return m36203((C13703) obj);
        }
        if (obj instanceof C2973) {
            C2973 c2973 = (C2973) obj;
            i = c2973.m4929() <= 4 ? 1 : 0;
            int iM4929 = c2973.m4929();
            String strM36206 = m36206(c2973.m4927());
            if (i != 0) {
                strM4926 = c2973.m4926();
            } else {
                strM4926 = c2973.m4926();
            }
            String str = strM4926;
            String strM4925 = c2973.m4925();
            return new C2973(iM4929, strM36206, str, i != 0 ? m36202(strM4925) : m36205(strM4925), c2973.m4928());
        }
        if (!(obj instanceof C22421)) {
            return obj;
        }
        C22421 c22421 = (C22421) obj;
        String strM50339 = c22421.m50339();
        String strM50340 = c22421.m50340();
        C2973 c2973M50336 = c22421.m50336();
        int iM50337 = c22421.m50337();
        Object[] objArr = new Object[iM50337];
        Object[] objArr2 = new Object[iM50337];
        for (int i = 0; i < iM50337; i++) {
            Object objM50335 = c22421.m50335(i);
            objArr[i] = objM50335;
            objArr2[i] = m36201(objM50335);
        }
        return new C22421(strM50339, m36202(strM50340), (C2973) m36201(c2973M50336), objArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m36207(String str, boolean z) {
        if (str == null) {
            return null;
        }
        C8576 c8576 = new C8576(str);
        C11259 c11259 = new C11259();
        C24669 c24669 = new C24669(c11259, this);
        if (z) {
            c8576.m19990(c24669);
        } else {
            c8576.m19989(c24669);
        }
        return c11259.toString();
    }
}
