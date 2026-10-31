package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5B8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21177 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68249 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f68250;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f68250 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m48124(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C14825.m35232(viewConfiguration);
        }
        return m48122(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m48125(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C14825.m35233(viewConfiguration);
        }
        return m48122(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m48122(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f68250) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48123(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C23998.m52833(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48126(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C23998.m52834(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
