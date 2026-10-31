package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes.dex */
public final class C22377 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f72521;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f72522;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f72523;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Method f72524;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f72522 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f72524 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f72523 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f72521 = true;
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50241() {
        return f72521;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50240(C12499 c12499, int i, View view) {
        try {
            f72522.invoke(c12499, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
            f72524.invoke(c12499, Integer.valueOf(i));
            f72523.invoke(c12499, Integer.valueOf(i));
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
