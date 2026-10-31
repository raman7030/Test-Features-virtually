package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۢܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5P8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9684 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13273 m24628(String str) throws C14658 {
        int iIndexOf = str.indexOf("->");
        int i = iIndexOf + 2;
        int iIndexOf2 = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_START, i);
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (!strSubstring.startsWith("L") || !strSubstring.endsWith(l.b)) {
            return null;
        }
        String strSubstring2 = str.substring(i, iIndexOf2);
        C2628 c2628 = new C2628(new StringReader(str.substring(iIndexOf2)), 15);
        c2628.m8273("Input");
        C13268 c13268 = new C13268(c2628);
        C8978 c8978 = new C8978(c13268);
        C17528 c17528M33592 = c8978.m33592();
        if (c8978.m50363() > 0 || c2628.m8274() > 0) {
            C14658 c14658M23200 = c8978.m23200();
            if (c14658M23200 == null) {
                c14658M23200 = c2628.m8271();
            }
            if (c14658M23200 == null) {
                return null;
            }
            throw c14658M23200;
        }
        C19599 c19599 = new C19599(c17528M33592.f53535);
        c19599.m45039(c13268);
        C16032 c16032 = new C16032(c19599);
        C3396 c3396M12457 = c16032.m12457();
        if (c16032.m50363() > 0) {
            C14658 c14658M37900 = c16032.m37900();
            if (c14658M37900 == null) {
                return null;
            }
            throw c14658M37900;
        }
        return new C13273(strSubstring, strSubstring2, c3396M12457.mo2258(), c3396M12457.mo2257());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0657 m24627(String str, C19357 c19357, C19562 c19562) {
        C2628 c2628 = new C2628(new StringReader(str), c19562.f63232);
        c2628.m8273((String) null);
        C13268 c13268 = new C13268(c2628);
        C8978 c8978 = new C8978(c13268);
        c8978.m33535(c19562.f63231);
        c8978.m33491(c19562.f63232);
        C21762 c21762M33569 = c8978.m33569();
        if (c8978.m50363() > 0 || c2628.m8274() > 0) {
            C14658 c14658M23200 = c8978.m23200();
            if (c14658M23200 == null) {
                c14658M23200 = c2628.m8271();
            }
            if (c14658M23200 != null) {
                throw c14658M23200;
            }
        } else {
            C19599 c19599 = new C19599(c21762M33569.f69731);
            c19599.m45039(c13268);
            C16032 c16032 = new C16032(c19599);
            c16032.m12438(c19562.f63232);
            c16032.m12440(c19357);
            C0657 c0657M12505 = c16032.m12505();
            if (c16032.m50363() <= 0) {
                return c0657M12505;
            }
            C14658 c14658M37900 = c16032.m37900();
            if (c14658M37900 != null) {
                throw c14658M37900;
            }
        }
        return null;
    }
}
