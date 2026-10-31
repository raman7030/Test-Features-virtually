package l;

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

/* JADX INFO: renamed from: l.ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15238 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m36048(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C22295.m50016(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            C11003.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            C11003.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            C11003.toString(obj);
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m36047(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C22295.m50015(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36044(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C22295.m50014(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Uri m36049(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C22295.m50017(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Icon m36046(C4656 c4656, Context context) {
        Icon iconCreateWithBitmap;
        switch (c4656.f14771) {
            case -1:
                return (Icon) c4656.f14776;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) c4656.f14776);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(c4656.m13634(), c4656.f14772);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) c4656.f14776, c4656.f14772, c4656.f14774);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) c4656.f14776);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    iconCreateWithBitmap = C21590.m48770((Bitmap) c4656.f14776);
                } else {
                    iconCreateWithBitmap = Icon.createWithBitmap(C4656.m13624((Bitmap) c4656.f14776, false));
                }
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithBitmap = C20179.m46411(c4656.m13635());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + c4656.m13635());
                    }
                    InputStream inputStreamM13630 = c4656.m13630(context);
                    if (inputStreamM13630 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + c4656.m13635());
                    }
                    if (i >= 26) {
                        iconCreateWithBitmap = C21590.m48770(BitmapFactory.decodeStream(inputStreamM13630));
                    } else {
                        iconCreateWithBitmap = Icon.createWithBitmap(C4656.m13624(BitmapFactory.decodeStream(inputStreamM13630), false));
                    }
                }
                break;
        }
        ColorStateList colorStateList = c4656.f14778;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = c4656.f14770;
        if (mode != C4656.f14768) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m36045(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }
}
