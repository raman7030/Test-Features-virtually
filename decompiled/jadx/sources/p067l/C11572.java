package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۢܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5P8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11572 {
    /* JADX INFO: renamed from: ֫ */
    public static C14983 m26642(String str) throws C16299 {
        int iIndexOf = str.indexOf("->");
        int i = iIndexOf + 2;
        int iIndexOf2 = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_START, i);
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (!strSubstring.startsWith("L") || !strSubstring.endsWith(C0249l.f1196b)) {
            return null;
        }
        String strSubstring2 = str.substring(i, iIndexOf2);
        C4866 c4866 = new C4866(new StringReader(str.substring(iIndexOf2)), 15);
        c4866.m10317("Input");
        C14978 c14978 = new C14978(c4866);
        C10901 c10901 = new C10901(c14978);
        C19027 c19027M35712 = c10901.m35712();
        if (c10901.m52704() > 0 || c4866.m10318() > 0) {
            C16299 c16299M25144 = c10901.m25144();
            if (c16299M25144 == null) {
                c16299M25144 = c4866.m10315();
            }
            if (c16299M25144 == null) {
                return null;
            }
            throw c16299M25144;
        }
        C20995 c20995 = new C20995(c19027M35712.f56726);
        c20995.m47334(c14978);
        C17605 c17605 = new C17605(c20995);
        C5596 c5596M14347 = c17605.m14347();
        if (c17605.m52704() > 0) {
            C16299 c16299M40087 = c17605.m40087();
            if (c16299M40087 == null) {
                return null;
            }
            throw c16299M40087;
        }
        return new C14983(strSubstring, strSubstring2, c5596M14347.mo4625(), c5596M14347.mo4624());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2993 m26641(String str, C20765 c20765, C20960 c20960) {
        C4866 c4866 = new C4866(new StringReader(str), c20960.f65851);
        c4866.m10317((String) null);
        C14978 c14978 = new C14978(c4866);
        C10901 c10901 = new C10901(c14978);
        c10901.m35655(c20960.f65850);
        c10901.m35611(c20960.f65851);
        C23051 c23051M35689 = c10901.m35689();
        if (c10901.m52704() > 0 || c4866.m10318() > 0) {
            C16299 c16299M25144 = c10901.m25144();
            if (c16299M25144 == null) {
                c16299M25144 = c4866.m10315();
            }
            if (c16299M25144 != null) {
                throw c16299M25144;
            }
        } else {
            C20995 c20995 = new C20995(c23051M35689.f72440);
            c20995.m47334(c14978);
            C17605 c17605 = new C17605(c20995);
            c17605.m14328(c20960.f65851);
            c17605.m14330(c20765);
            C2993 c2993M14395 = c17605.m14395();
            if (c17605.m52704() <= 0) {
                return c2993M14395;
            }
            C16299 c16299M40087 = c17605.m40087();
            if (c16299M40087 != null) {
                throw c16299M40087;
            }
        }
        return null;
    }
}
