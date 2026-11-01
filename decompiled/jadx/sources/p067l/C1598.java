package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ܶ۬ */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1598 {
    /* JADX INFO: renamed from: ܽ */
    public static int m38209(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1948.m52346(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            C12826.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            C12826.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            C12826.toString(obj);
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m38208(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1948.m52345(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m38205(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1948.m52344(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Uri m38210(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1948.m52347(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Icon m38207(C1073 c1073, Context context) {
        Icon iconCreateWithBitmap;
        switch (c1073.f17601) {
            case -1:
                return (Icon) c1073.f17606;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) c1073.f17606);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(c1073.m15509(), c1073.f17602);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) c1073.f17606, c1073.f17602, c1073.f17604);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) c1073.f17606);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    iconCreateWithBitmap = C1913.m51117((Bitmap) c1073.f17606);
                } else {
                    iconCreateWithBitmap = Icon.createWithBitmap(C1073.m15499((Bitmap) c1073.f17606, false));
                }
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithBitmap = C1843.m48730(c1073.m15510());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + c1073.m15510());
                    }
                    InputStream inputStreamM15505 = c1073.m15505(context);
                    if (inputStreamM15505 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + c1073.m15510());
                    }
                    if (i >= 26) {
                        iconCreateWithBitmap = C1913.m51117(BitmapFactory.decodeStream(inputStreamM15505));
                    } else {
                        iconCreateWithBitmap = Icon.createWithBitmap(C1073.m15499(BitmapFactory.decodeStream(inputStreamM15505), false));
                    }
                }
                break;
        }
        ColorStateList colorStateList = c1073.f17608;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = c1073.f17600;
        if (mode != C1073.f17598) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Drawable m38206(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }
}
