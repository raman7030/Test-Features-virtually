package l;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4696 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field f14918;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f14919;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f14920;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f14921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Field f14922;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Class f14923;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f14924;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Field f14925;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13770(Resources resources) {
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
            if (!f14924) {
                try {
                    Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                    f14922 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f14924 = true;
            }
            Field field = f14922;
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
            if (!f14920) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    f14918 = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f14920 = true;
            }
            Field field2 = f14918;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException unused4) {
                }
            }
            if (obj2 != null) {
                m13771(obj2);
                return;
            }
            return;
        }
        if (i < 23) {
            if (!f14920) {
                try {
                    Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                    f14918 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (NoSuchFieldException unused5) {
                }
                f14920 = true;
            }
            Field field3 = f14918;
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
        if (!f14920) {
            try {
                Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                f14918 = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused7) {
            }
            f14920 = true;
        }
        Field field4 = f14918;
        if (field4 != null) {
            try {
                obj3 = field4.get(resources);
            } catch (IllegalAccessException unused8) {
            }
        }
        if (obj3 == null) {
            return;
        }
        m13771(obj3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13771(Object obj) {
        LongSparseArray longSparseArray;
        if (!f14921) {
            try {
                f14923 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f14921 = true;
        }
        Class cls = f14923;
        if (cls == null) {
            return;
        }
        if (!f14919) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f14925 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f14919 = true;
        }
        Field field = f14925;
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
