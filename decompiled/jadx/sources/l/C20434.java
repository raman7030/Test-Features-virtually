package l;

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
public final class C20434 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46833(AssistActivity assistActivity) {
        if (Build.VERSION.SDK_INT == 26 && m46835(assistActivity)) {
            boolean z = false;
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                ((ActivityInfo) declaredField.get(assistActivity)).screenOrientation = -1;
                declaredField.setAccessible(false);
                z = true;
            } catch (Throwable th) {
                C9145.m23514("ActivityFixUtils", "fixOrientation exception", th);
            }
            C9145.m23518("ActivityFixUtils", "onCreate fixOrientation when Oreo, result = " + z);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46834(AssistActivity assistActivity) {
        if (Build.VERSION.SDK_INT != 26 || !m46835(assistActivity)) {
            return false;
        }
        C9145.m23518("ActivityFixUtils", "avoid calling setRequestedOrientation when Oreo.");
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m46835(AssistActivity assistActivity) {
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
                C9145.m23514("ActivityFixUtils", "isTranslucentOrFloating exception", th);
                return zBooleanValue;
            }
        } catch (Throwable th3) {
            th = th3;
            zBooleanValue = false;
        }
    }
}
