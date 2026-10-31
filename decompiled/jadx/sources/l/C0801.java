package l;

import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0801 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field f2927;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f2928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f2929;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f2930;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3024(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C5035.m14547(popupWindow, z);
            return;
        }
        if (!f2928) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2927 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2928 = true;
        }
        Field field = f2927;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3023(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C5035.m14546(popupWindow, i);
            return;
        }
        if (!f2930) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2929 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2930 = true;
        }
        Method method = f2929;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }
}
