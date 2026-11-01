package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.ᩴ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: QAWL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20412 {
    /* JADX INFO: renamed from: ֫ */
    public static final int m46086(String str) {
        C13045.m29867(str, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
        if (!str.startsWith("#")) {
            throw new IllegalArgumentException("Invalid color value ".concat(str).toString());
        }
        int length = str.length();
        if (length == 4) {
            String strSubstring = str.substring(1);
            C13045.m29865(strSubstring, "substring(...)");
            int iM17774 = C7671.m17774(strSubstring);
            return ((iM17774 & 15) * 17) | (((iM17774 >> 8) & 15) * 1114112) | (((iM17774 >> 4) & 15) * C0719o.a.f2905k) | (-16777216);
        }
        if (length == 5) {
            String strSubstring2 = str.substring(1);
            C13045.m29865(strSubstring2, "substring(...)");
            int iM17775 = C7671.m17774(strSubstring2);
            return ((iM17775 & 15) * 17) | (((iM17775 >> 12) & 15) * 285212672) | (((iM17775 >> 8) & 15) * 1114112) | (((iM17775 >> 4) & 15) * C0719o.a.f2905k) | (-16777216);
        }
        if (length == 7) {
            String strSubstring3 = str.substring(1);
            C13045.m29865(strSubstring3, "substring(...)");
            return C7671.m17774(strSubstring3) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        String strSubstring4 = str.substring(1);
        C13045.m29865(strSubstring4, "substring(...)");
        return C7671.m17774(strSubstring4);
    }
}
