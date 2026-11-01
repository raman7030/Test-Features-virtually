package p067l;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܳ */
/* JADX INFO: compiled from: P4V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1075 {

    /* JADX INFO: renamed from: ֫ */
    public static Field f17748;

    /* JADX INFO: renamed from: ۜ */
    public static boolean f17749;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f17750;

    /* JADX INFO: renamed from: ܳ */
    public static boolean f17751;

    /* JADX INFO: renamed from: ܽ */
    public static Field f17752;

    /* JADX INFO: renamed from: ܿ */
    public static Class f17753;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f17754;

    /* JADX INFO: renamed from: ᩻ */
    public static Field f17755;

    /* JADX INFO: renamed from: ֫ */
    public static void m15645(Resources resources) {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        Map map = null;
        obj = null;
        obj = null;
        Object obj2 = null;
        Object obj3 = null;
        if (i >= 24) {
            if (!f17754) {
                try {
                    Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                    f17752 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f17754 = true;
            }
            Field field = f17752;
            if (field == null) {
                return;
            }
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (!f17750) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    f17748 = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f17750 = true;
            }
            Field field2 = f17748;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException unused4) {
                }
            }
            if (obj2 != null) {
                m15646(obj2);
                return;
            }
            return;
        }
        if (i < 23) {
            if (!f17750) {
                try {
                    Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                    f17748 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (NoSuchFieldException unused5) {
                }
                f17750 = true;
            }
            Field field3 = f17748;
            if (field3 != null) {
                try {
                    map = (Map) field3.get(resources);
                } catch (IllegalAccessException unused6) {
                }
                if (map != null) {
                    map.clear();
                    return;
                }
                return;
            }
            return;
        }
        if (!f17750) {
            try {
                Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                f17748 = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused7) {
            }
            f17750 = true;
        }
        Field field4 = f17748;
        if (field4 != null) {
            try {
                obj3 = field4.get(resources);
            } catch (IllegalAccessException unused8) {
            }
        }
        if (obj3 == null) {
            return;
        }
        m15646(obj3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15646(Object obj) {
        LongSparseArray longSparseArray;
        if (!f17751) {
            try {
                f17753 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f17751 = true;
        }
        Class cls = f17753;
        if (cls == null) {
            return;
        }
        if (!f17749) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f17755 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f17749 = true;
        }
        Field field = f17755;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
