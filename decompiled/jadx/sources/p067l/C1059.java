package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۙۗ */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1059 {

    /* JADX INFO: renamed from: ܽ */
    public static final ThreadLocal f16864 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧ */
    public static final WeakHashMap f16863 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ֫ */
    public static final Object f16862 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public static Drawable m14961(Resources resources, int i, Resources.Theme theme) {
        return C1794.m46563(resources, i, theme);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m14953(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0849.m3613(resources, i, theme);
        }
        return resources.getColor(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static ColorStateList m14959(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListM36022;
        ColorStateList colorStateList;
        C1094 c1094;
        C0884 c0884 = new C0884(resources, theme);
        synchronized (f16862) {
            SparseArray sparseArray = (SparseArray) f16863.get(c0884);
            colorStateListM36022 = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (c1094 = (C1094) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (c1094.f18784.equals(resources.getConfiguration()) && ((theme == null && c1094.f18785 == 0) || (theme != null && c1094.f18785 == theme.hashCode()))) {
                colorStateList = c1094.f18786;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f16864;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM36022 = C1549.m36022(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListM36022 != null) {
            m14958(c0884, i, colorStateListM36022, theme);
            return colorStateListM36022;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C0849.m3614(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14958(C0884 c0884, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f16862) {
            WeakHashMap weakHashMap = f16863;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c0884);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(c0884, sparseArray);
            }
            sparseArray.append(i, new C1094(colorStateList, c0884.f5810.getConfiguration(), theme));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Typeface m14960(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m14956(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m14954(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m14956(context, i, new TypedValue(), 0, null, false, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14957(Context context, int i, AbstractC1584 abstractC1584) {
        if (context.isRestricted()) {
            abstractC1584.callbackFailAsync(-4, null);
        } else {
            m14956(context, i, new TypedValue(), 0, abstractC1584, false, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m14955(Context context, int i, TypedValue typedValue, int i2, AbstractC1584 abstractC1584) {
        if (context.isRestricted()) {
            return null;
        }
        return m14956(context, i, typedValue, i2, abstractC1584, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m14956(Context context, int i, TypedValue typedValue, int i2, AbstractC1584 abstractC1584, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM20365 = null;
        if (string.startsWith("res/")) {
            Typeface typefaceM20368 = C1178.m20368(resources, i, string, typedValue.assetCookie, i2);
            if (typefaceM20368 != null) {
                if (abstractC1584 != null) {
                    abstractC1584.callbackSuccessAsync(typefaceM20368, null);
                }
                typefaceM20365 = typefaceM20368;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC1864 interfaceC1864M9539 = C0954.m9539(resources.getXml(i), resources);
                        if (interfaceC1864M9539 != null) {
                            typefaceM20365 = C1178.m20365(context, interfaceC1864M9539, resources, i, string, typedValue.assetCookie, i2, abstractC1584, z);
                        } else if (abstractC1584 != null) {
                            abstractC1584.callbackFailAsync(-3, null);
                        }
                    } else {
                        Typeface typefaceM20364 = C1178.m20364(context, resources, i, string, typedValue.assetCookie, i2);
                        if (abstractC1584 != null) {
                            if (typefaceM20364 != null) {
                                abstractC1584.callbackSuccessAsync(typefaceM20364, null);
                            } else {
                                abstractC1584.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceM20365 = typefaceM20364;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC1584 != null) {
                        abstractC1584.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (abstractC1584 != null) {
            abstractC1584.callbackFailAsync(-3, null);
        }
        if (typefaceM20365 != null || abstractC1584 != null || z2) {
            return typefaceM20365;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
