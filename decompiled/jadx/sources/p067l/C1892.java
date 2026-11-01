package p067l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩷᩺ */
/* JADX INFO: compiled from: W5B8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1892 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f70931 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static Method f70932;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f70932 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static float m50454(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1577.m37387(viewConfiguration);
        }
        return m50452(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: ܽ */
    public static float m50455(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1577.m37388(viewConfiguration);
        }
        return m50452(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m50452(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f70932) != null) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m50453(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2032.m55239(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m50456(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2032.m55240(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
