package p067l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨ܺ */
/* JADX INFO: compiled from: J62F */
/* JADX INFO: loaded from: classes2.dex */
public final class C0902 {

    /* JADX INFO: renamed from: ֫ */
    public static final Field f7127;

    /* JADX INFO: renamed from: ۧ */
    public static final Method f7128;

    /* JADX INFO: renamed from: ܳ */
    public static final Field f7129;

    /* JADX INFO: renamed from: ܽ */
    public static final Field f7130;

    /* JADX INFO: renamed from: ܿ */
    public static final Field f7131;

    /* JADX INFO: renamed from: ᩳ */
    public static final boolean f7132;

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        boolean z;
        Field field4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            z = false;
                            field4 = null;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                    field2 = null;
                    field3 = null;
                    z = false;
                    field4 = null;
                    if (z) {
                        f7128 = method;
                        f7130 = field;
                        f7129 = field2;
                        f7131 = field3;
                        f7127 = field4;
                        f7132 = true;
                        return;
                    }
                    f7128 = null;
                    f7130 = null;
                    f7129 = null;
                    f7131 = null;
                    f7127 = null;
                    f7132 = false;
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                field = null;
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (z) {
                    f7128 = method;
                    f7130 = field;
                    f7129 = field2;
                    f7131 = field3;
                    f7127 = field4;
                    f7132 = true;
                    return;
                }
                f7128 = null;
                f7130 = null;
                f7129 = null;
                f7131 = null;
                f7127 = null;
                f7132 = false;
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
            method = null;
        }
        if (z) {
            f7128 = method;
            f7130 = field;
            f7129 = field2;
            f7131 = field3;
            f7127 = field4;
            f7132 = true;
            return;
        }
        f7128 = null;
        f7130 = null;
        f7129 = null;
        f7131 = null;
        f7127 = null;
        f7132 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rect m6294(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f7132) {
            try {
                Object objInvoke = f7128.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(f7130.getInt(objInvoke), f7129.getInt(objInvoke), f7131.getInt(objInvoke), f7127.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return C1602.f50099;
    }
}
