package l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB2G */
/* JADX INFO: loaded from: classes3.dex */
public final class C13754 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f41045;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InputMethodManager f41046;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputMethodManager m33058() {
        if (f41046 == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C4925.m14335().getSystemService("input_method");
            f41046 = inputMethodManager;
            if (inputMethodManager != null) {
                ArrayList arrayList = new ArrayList(3);
                String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
                Class<?> cls = f41046.getClass();
                for (int i = 0; i < 3; i++) {
                    try {
                        arrayList.add(cls.getDeclaredField(strArr[i]));
                    } catch (Exception unused) {
                    }
                }
                f41045 = arrayList;
            }
        }
        return f41046;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33059(AbstractActivityC3346 abstractActivityC3346) {
        Activity activityM15313;
        InputMethodManager inputMethodManagerM33058;
        if (Build.VERSION.SDK_INT >= 30 || (activityM15313 = C5350.m15313(abstractActivityC3346)) == null || (inputMethodManagerM33058 = m33058()) == null) {
            return;
        }
        for (Field field : f41045) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM33058);
                if ((obj instanceof View) && C5350.m15313(((View) obj).getContext()) == activityM15313) {
                    field.set(inputMethodManagerM33058, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33060(C12392 c12392) {
        InputMethodManager inputMethodManagerM33058 = m33058();
        if (inputMethodManagerM33058 == null) {
            return;
        }
        for (Field field : f41045) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM33058);
                if ((obj instanceof View) && ((View) obj) == c12392) {
                    field.set(inputMethodManagerM33058, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
