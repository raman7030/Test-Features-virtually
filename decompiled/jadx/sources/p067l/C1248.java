package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۠۬ */
/* JADX INFO: compiled from: 65YF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1248 {

    /* JADX INFO: renamed from: ֫ */
    public static Method f28093;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f28094;

    /* JADX INFO: renamed from: ܽ */
    public static Method f28095;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f28096;

    /* JADX INFO: renamed from: ֫ */
    public static void m23643(Drawable drawable, float f, float f2) {
        C1108.m17225(drawable, f, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23644(Drawable drawable, int i, int i2, int i3, int i4) {
        C1108.m17227(drawable, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23652(Drawable drawable, int i) {
        C1108.m17226(drawable, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23645(Drawable drawable, ColorStateList colorStateList) {
        C1108.m17228(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23648(Drawable drawable, PorterDuff.Mode mode) {
        C1108.m17231(drawable, mode);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23646(Drawable drawable, Resources.Theme theme) {
        C1108.m17229(drawable, theme);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23649(Drawable drawable) {
        return C1108.m17232(drawable);
    }

    /* JADX INFO: renamed from: ܽ */
    public static ColorFilter m23654(Drawable drawable) {
        return C1108.m17233(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public static void m23651(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m23651(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof InterfaceC1458) {
            m23651(((InterfaceC1458) drawable).mo28082());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable child = drawableContainerState.getChild(i);
            if (child != null) {
                m23651(child);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23647(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1108.m17230(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: ܳ */
    public static Drawable m23653(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC1493)) ? new C1143(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܿ */
    public static Drawable m23655(Drawable drawable) {
        return drawable instanceof InterfaceC1458 ? ((InterfaceC1458) drawable).mo28082() : drawable;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23650(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0898.m6097(drawable, i);
        }
        if (!f28096) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f28095 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f28096 = true;
        }
        Method method = f28095;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f28095 = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m23656(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0898.m6096(drawable);
        }
        if (!f28094) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f28093 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f28094 = true;
        }
        Method method = f28093;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception unused2) {
            f28093 = null;
            return 0;
        }
    }
}
