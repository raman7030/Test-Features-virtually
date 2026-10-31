package l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3327 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Field f10411;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f10411 = declaredField;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10178(AbsListView absListView) {
        Field field = f10411;
        if (field == null) {
            return false;
        }
        try {
            return field.getBoolean(absListView);
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10177(AbsListView absListView, boolean z) {
        Field field = f10411;
        if (field != null) {
            try {
                field.set(absListView, Boolean.valueOf(z));
            } catch (IllegalAccessException unused) {
            }
        }
    }
}
