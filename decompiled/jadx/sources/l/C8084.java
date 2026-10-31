package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8084 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f24900 = Arrays.asList("raw", "drawable", "mipmap");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5262 m21453(ImageView imageView, AttributeSet attributeSet, int i) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            C5262 c5262 = new C5262(imageView, attributeSet, i);
            int i2 = c5262.f3758;
            if (i2 >= 0) {
                m21454(imageView.getDrawable(), i2);
                m21454(imageView.getBackground(), i2);
            }
            return c5262;
        }
        return new C5262();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21454(Drawable drawable, int i) {
        if (drawable instanceof C1734) {
            ((C1734) drawable).f5989.m52905(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21455(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            if (!f24900.contains(resources.getResourceTypeName(i))) {
                return false;
            }
            C1734 c1734 = new C1734(resources, i);
            if (z) {
                imageView.setImageDrawable(c1734);
                return true;
            }
            imageView.setBackground(c1734);
            return true;
        } catch (Resources.NotFoundException | IOException unused) {
            return false;
        }
    }
}
