package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62F */
/* JADX INFO: loaded from: classes2.dex */
public final class C1210 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Field f4357;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Method f4358;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Field f4359;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Field f4360;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Field f4361;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final boolean f4362;

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
                        f4358 = method;
                        f4360 = field;
                        f4359 = field2;
                        f4361 = field3;
                        f4357 = field4;
                        f4362 = true;
                        return;
                    }
                    f4358 = null;
                    f4360 = null;
                    f4359 = null;
                    f4361 = null;
                    f4357 = null;
                    f4362 = false;
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                field = null;
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (z) {
                    f4358 = method;
                    f4360 = field;
                    f4359 = field2;
                    f4361 = field3;
                    f4357 = field4;
                    f4362 = true;
                    return;
                }
                f4358 = null;
                f4360 = null;
                f4359 = null;
                f4361 = null;
                f4357 = null;
                f4362 = false;
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
            method = null;
        }
        if (z) {
            f4358 = method;
            f4360 = field;
            f4359 = field2;
            f4361 = field3;
            f4357 = field4;
            f4362 = true;
            return;
        }
        f4358 = null;
        f4360 = null;
        f4359 = null;
        f4361 = null;
        f4357 = null;
        f4362 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m4050(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f4362) {
            try {
                Object objInvoke = f4358.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(f4360.getInt(objInvoke), f4359.getInt(objInvoke), f4361.getInt(objInvoke), f4357.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return C15320.f46973;
    }
}
