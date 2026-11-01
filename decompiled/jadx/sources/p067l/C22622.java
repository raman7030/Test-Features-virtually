package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩸ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22622 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m50682(int i) {
        return i >= 1024 && i <= 65535;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m50681(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (m50682(i)) {
                return Integer.valueOf(i);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Drawable m50680(Context context, int i) {
        return C0920.m7578().m7585(context, i);
    }
}
