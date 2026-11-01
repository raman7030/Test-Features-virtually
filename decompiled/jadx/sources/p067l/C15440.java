package p067l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB2G */
/* JADX INFO: loaded from: classes3.dex */
public final class C15440 {

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList f44123;

    /* JADX INFO: renamed from: ۧ */
    public static InputMethodManager f44124;

    /* JADX INFO: renamed from: ֫ */
    public static InputMethodManager m35173() {
        if (f44124 == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C7050.m16232().getSystemService("input_method");
            f44124 = inputMethodManager;
            if (inputMethodManager != null) {
                ArrayList arrayList = new ArrayList(3);
                String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
                Class<?> cls = f44124.getClass();
                for (int i = 0; i < 3; i++) {
                    try {
                        arrayList.add(cls.getDeclaredField(strArr[i]));
                    } catch (Exception unused) {
                    }
                }
                f44123 = arrayList;
            }
        }
        return f44124;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35174(AbstractActivityC5549 abstractActivityC5549) {
        Activity activityM17221;
        InputMethodManager inputMethodManagerM35173;
        if (Build.VERSION.SDK_INT >= 30 || (activityM17221 = C7453.m17221(abstractActivityC5549)) == null || (inputMethodManagerM35173 = m35173()) == null) {
            return;
        }
        for (Field field : f44123) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM35173);
                if ((obj instanceof View) && C7453.m17221(((View) obj).getContext()) == activityM17221) {
                    field.set(inputMethodManagerM35173, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35175(C14146 c14146) {
        InputMethodManager inputMethodManagerM35173 = m35173();
        if (inputMethodManagerM35173 == null) {
            return;
        }
        for (Field field : f44123) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM35173);
                if ((obj instanceof View) && ((View) obj) == c14146) {
                    field.set(inputMethodManagerM35173, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
