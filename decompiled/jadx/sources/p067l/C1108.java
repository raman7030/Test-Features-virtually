package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۚ۬ */
/* JADX INFO: compiled from: 65YF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1108 {
    /* JADX INFO: renamed from: ֫ */
    public static void m17225(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17226(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17228(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17231(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17229(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17232(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX INFO: renamed from: ۧ */
    public static ColorFilter m17233(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17230(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17227(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }
}
