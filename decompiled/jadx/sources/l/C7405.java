package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: l.۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q159 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7405 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f22785 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19928(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            if (i >= 29) {
                try {
                    Resources resources = context.getResources();
                    if (f22785 == -1) {
                        f22785 = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
                    }
                    int i2 = f22785;
                    if (i2 != 0) {
                        if (resources.getInteger(i2) == 2) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (C3424.m10402()) {
                return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
            }
            if (C3424.m10401() || C3424.m10403()) {
                return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
            }
            if (C3424.m10399()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0) ? false : true;
            }
            if (C3424.m10398()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0) ? false : true;
            }
            return (Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigation_gesture_on", 0) == 0) ? false : true;
        }
        return false;
    }
}
