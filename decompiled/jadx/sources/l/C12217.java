package l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8XQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12217 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2545 f36449;

    public C12217(AbstractC2545 abstractC2545) {
        this.f36449 = abstractC2545;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22260 m29709(Map map) {
        C21555 c21555M29708;
        C21555 c21555M29709;
        String str = (String) map.get("style");
        if (!TextUtils.isEmpty(str)) {
            c21555M29708 = null;
            c21555M29709 = null;
            for (C3956 c3956 : this.f36449.mo8059(str)) {
                String strM11997 = c3956.m11997();
                if ("width".equals(strM11997)) {
                    c21555M29708 = m29708(c3956.m11999());
                } else if ("height".equals(strM11997)) {
                    c21555M29709 = m29708(c3956.m11999());
                }
                if (c21555M29708 != null && c21555M29709 != null) {
                    break;
                }
            }
        } else {
            c21555M29708 = null;
            c21555M29709 = null;
        }
        if (c21555M29708 != null && c21555M29709 != null) {
            return new C22260(c21555M29708, c21555M29709);
        }
        if (c21555M29708 == null) {
            c21555M29708 = m29708((String) map.get("width"));
        }
        if (c21555M29709 == null) {
            c21555M29709 = m29708((String) map.get("height"));
        }
        if (c21555M29708 == null && c21555M29709 == null) {
            return null;
        }
        return new C22260(c21555M29708, c21555M29709);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21555 m29708(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = length - 1;
            int i2 = i;
            while (i2 > -1) {
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i2 + 1;
                    try {
                        return new C21555(i2 == i ? null : str.substring(i3, length), Float.parseFloat(str.substring(0, i3)));
                    } catch (NumberFormatException unused) {
                        break;
                    }
                }
                i2--;
            }
        }
        return null;
    }
}
