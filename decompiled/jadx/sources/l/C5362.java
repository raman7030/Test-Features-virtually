package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 65YF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5362 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15317(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15318(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15320(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15323(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15321(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15324(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ColorFilter m15325(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15322(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15319(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }
}
