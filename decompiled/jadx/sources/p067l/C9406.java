package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: l.۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q159 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9406 {

    /* JADX INFO: renamed from: ֫ */
    public static int f25697 = -1;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21902(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            if (i >= 29) {
                try {
                    Resources resources = context.getResources();
                    if (f25697 == -1) {
                        f25697 = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
                    }
                    int i2 = f25697;
                    if (i2 != 0) {
                        if (resources.getInteger(i2) == 2) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (C5623.m12441()) {
                return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
            }
            if (C5623.m12440() || C5623.m12442()) {
                return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
            }
            if (C5623.m12438()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0) ? false : true;
            }
            if (C5623.m12437()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0) ? false : true;
            }
            return (Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigation_gesture_on", 0) == 0) ? false : true;
        }
        return false;
    }
}
