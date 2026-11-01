package p067l;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NK */
/* JADX INFO: loaded from: classes4.dex */
public class C21518 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f67891 = false;

    /* JADX INFO: renamed from: ۧ */
    public static Method f67892 = null;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f67893 = true;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f67894;

    /* JADX INFO: renamed from: ᩳ */
    public static Field f67895;

    /* JADX INFO: renamed from: ֫ */
    public void mo30613(View view, float f) {
        if (f67893) {
            try {
                C23529.m52315(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f67893 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public float mo30612(View view) {
        if (f67893) {
            try {
                return C23529.m52314(view);
            } catch (NoSuchMethodError unused) {
                f67893 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo18801(View view, int i) {
        if (!f67894) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f67895 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f67894 = true;
        }
        Field field = f67895;
        if (field != null) {
            try {
                f67895.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30614(View view, int i, int i2, int i3, int i4) {
        if (!f67891) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f67892 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f67891 = true;
        }
        Method method = f67892;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
