package p067l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8XQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13979 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4787 f39463;

    public C13979(AbstractC4787 abstractC4787) {
        this.f39463 = abstractC4787;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23524 m31771(Map map) {
        C22854 c22854M31770;
        C22854 c22854M31771;
        String str = (String) map.get("style");
        if (!TextUtils.isEmpty(str)) {
            c22854M31770 = null;
            c22854M31771 = null;
            for (C6128 c6128 : this.f39463.mo10090(str)) {
                String strM13918 = c6128.m13918();
                if ("width".equals(strM13918)) {
                    c22854M31770 = m31770(c6128.m13920());
                } else if ("height".equals(strM13918)) {
                    c22854M31771 = m31770(c6128.m13920());
                }
                if (c22854M31770 != null && c22854M31771 != null) {
                    break;
                }
            }
        } else {
            c22854M31770 = null;
            c22854M31771 = null;
        }
        if (c22854M31770 != null && c22854M31771 != null) {
            return new C23524(c22854M31770, c22854M31771);
        }
        if (c22854M31770 == null) {
            c22854M31770 = m31770((String) map.get("width"));
        }
        if (c22854M31771 == null) {
            c22854M31771 = m31770((String) map.get("height"));
        }
        if (c22854M31770 == null && c22854M31771 == null) {
            return null;
        }
        return new C23524(c22854M31770, c22854M31771);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22854 m31770(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = length - 1;
            int i2 = i;
            while (i2 > -1) {
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i2 + 1;
                    try {
                        return new C22854(i2 == i ? null : str.substring(i3, length), Float.parseFloat(str.substring(0, i3)));
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
