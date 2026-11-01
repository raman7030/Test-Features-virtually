package p067l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۗܺ */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1007 {

    /* JADX INFO: renamed from: ֫ */
    public static final Field f13221;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f13221 = declaredField;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12214(AbsListView absListView) {
        Field field = f13221;
        if (field == null) {
            return false;
        }
        try {
            return field.getBoolean(absListView);
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12213(AbsListView absListView, boolean z) {
        Field field = f13221;
        if (field != null) {
            try {
                field.set(absListView, Boolean.valueOf(z));
            } catch (IllegalAccessException unused) {
            }
        }
    }
}
