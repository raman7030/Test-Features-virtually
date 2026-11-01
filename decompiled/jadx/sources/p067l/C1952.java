package p067l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹ܺ */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes.dex */
public final class C1952 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f75247;

    /* JADX INFO: renamed from: ۧ */
    public static Method f75248;

    /* JADX INFO: renamed from: ܽ */
    public static Method f75249;

    /* JADX INFO: renamed from: ᩳ */
    public static Method f75250;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f75248 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f75250 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f75249 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f75247 = true;
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52581() {
        return f75247;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52580(C1462 c1462, int i, View view) {
        try {
            f75248.invoke(c1462, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
            f75250.invoke(c1462, Integer.valueOf(i));
            f75249.invoke(c1462, Integer.valueOf(i));
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
