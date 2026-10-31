package l;

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

/* JADX INFO: renamed from: l.ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4369 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f14049 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f14048 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f14047 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Drawable m13097(Resources resources, int i, Resources.Theme theme) {
        return C19186.m44268(resources, i, theme);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13089(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0134.m1211(resources, i, theme);
        }
        return resources.getColor(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m13095(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListM33890;
        ColorStateList colorStateList;
        C5074 c5074;
        C0840 c0840 = new C0840(resources, theme);
        synchronized (f14047) {
            SparseArray sparseArray = (SparseArray) f14048.get(c0840);
            colorStateListM33890 = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (c5074 = (C5074) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (c5074.f15948.equals(resources.getConfiguration()) && ((theme == null && c5074.f15949 == 0) || (theme != null && c5074.f15949 == theme.hashCode()))) {
                colorStateList = c5074.f15950;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f14049;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM33890 = C14245.m33890(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListM33890 != null) {
            m13094(c0840, i, colorStateListM33890, theme);
            return colorStateListM33890;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C0134.m1212(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13094(C0840 c0840, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f14047) {
            WeakHashMap weakHashMap = f14048;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c0840);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(c0840, sparseArray);
            }
            sparseArray.append(i, new C5074(colorStateList, c0840.f3036.getConfiguration(), theme));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Typeface m13096(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m13092(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m13090(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m13092(context, i, new TypedValue(), 0, null, false, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13093(Context context, int i, AbstractC14951 abstractC14951) {
        if (context.isRestricted()) {
            abstractC14951.callbackFailAsync(-4, null);
        } else {
            m13092(context, i, new TypedValue(), 0, abstractC14951, false, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m13091(Context context, int i, TypedValue typedValue, int i2, AbstractC14951 abstractC14951) {
        if (context.isRestricted()) {
            return null;
        }
        return m13092(context, i, typedValue, i2, abstractC14951, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m13092(Context context, int i, TypedValue typedValue, int i2, AbstractC14951 abstractC14951, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM18417 = null;
        if (string.startsWith("res/")) {
            Typeface typefaceM18420 = C6773.m18420(resources, i, string, typedValue.assetCookie, i2);
            if (typefaceM18420 != null) {
                if (abstractC14951 != null) {
                    abstractC14951.callbackSuccessAsync(typefaceM18420, null);
                }
                typefaceM18417 = typefaceM18420;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC20597 interfaceC20597M7457 = C2252.m7457(resources.getXml(i), resources);
                        if (interfaceC20597M7457 != null) {
                            typefaceM18417 = C6773.m18417(context, interfaceC20597M7457, resources, i, string, typedValue.assetCookie, i2, abstractC14951, z);
                        } else if (abstractC14951 != null) {
                            abstractC14951.callbackFailAsync(-3, null);
                        }
                    } else {
                        Typeface typefaceM18416 = C6773.m18416(context, resources, i, string, typedValue.assetCookie, i2);
                        if (abstractC14951 != null) {
                            if (typefaceM18416 != null) {
                                abstractC14951.callbackSuccessAsync(typefaceM18416, null);
                            } else {
                                abstractC14951.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceM18417 = typefaceM18416;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC14951 != null) {
                        abstractC14951.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (abstractC14951 != null) {
            abstractC14951.callbackFailAsync(-3, null);
        }
        if (typefaceM18417 != null || abstractC14951 != null || z2) {
            return typefaceM18417;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
