package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ᩴ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: QAWL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18985 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m43818(String str) {
        C11233.m27805(str, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
        if (!str.startsWith("#")) {
            throw new IllegalArgumentException("Invalid color value ".concat(str).toString());
        }
        int length = str.length();
        if (length == 4) {
            String strSubstring = str.substring(1);
            C11233.m27803(strSubstring, "substring(...)");
            int iM15859 = C5579.m15859(strSubstring);
            return ((iM15859 & 15) * 17) | (((iM15859 >> 8) & 15) * 1114112) | (((iM15859 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 5) {
            String strSubstring2 = str.substring(1);
            C11233.m27803(strSubstring2, "substring(...)");
            int iM158510 = C5579.m15859(strSubstring2);
            return ((iM158510 & 15) * 17) | (((iM158510 >> 12) & 15) * 285212672) | (((iM158510 >> 8) & 15) * 1114112) | (((iM158510 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 7) {
            String strSubstring3 = str.substring(1);
            C11233.m27803(strSubstring3, "substring(...)");
            return C5579.m15859(strSubstring3) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        String strSubstring4 = str.substring(1);
        C11233.m27803(strSubstring4, "substring(...)");
        return C5579.m15859(strSubstring4);
    }
}
