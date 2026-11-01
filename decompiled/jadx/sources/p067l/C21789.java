package p067l;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import com.tencent.connect.common.AssistActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21789 {
    /* JADX INFO: renamed from: ֫ */
    public static void m49156(AssistActivity assistActivity) {
        if (Build.VERSION.SDK_INT == 26 && m49158(assistActivity)) {
            boolean z = false;
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                ((ActivityInfo) declaredField.get(assistActivity)).screenOrientation = -1;
                declaredField.setAccessible(false);
                z = true;
            } catch (Throwable th) {
                C11060.m25465("ActivityFixUtils", "fixOrientation exception", th);
            }
            C11060.m25469("ActivityFixUtils", "onCreate fixOrientation when Oreo, result = " + z);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m49157(AssistActivity assistActivity) {
        if (Build.VERSION.SDK_INT != 26 || !m49158(assistActivity)) {
            return false;
        }
        C11060.m25469("ActivityFixUtils", "avoid calling setRequestedOrientation when Oreo.");
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m49158(AssistActivity assistActivity) {
        Throwable th;
        boolean zBooleanValue;
        try {
            TypedArray typedArrayObtainStyledAttributes = assistActivity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return zBooleanValue;
            } catch (Throwable th2) {
                th = th2;
                C11060.m25465("ActivityFixUtils", "isTranslucentOrFloating exception", th);
                return zBooleanValue;
            }
        } catch (Throwable th3) {
            th = th3;
            zBooleanValue = false;
        }
    }
}
