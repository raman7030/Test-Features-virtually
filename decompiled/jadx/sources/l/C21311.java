package l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩸ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21311 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48347(int i) {
        return i >= 1024 && i <= 65535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m48346(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (m48347(i)) {
                return Integer.valueOf(i);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m48345(Context context, int i) {
        return C1566.m5349().m5356(context, i);
    }
}
