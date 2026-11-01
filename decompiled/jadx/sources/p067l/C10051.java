package p067l;

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
public final class C10051 {

    /* JADX INFO: renamed from: ֫ */
    public static final List f27811 = Arrays.asList("raw", "drawable", "mipmap");

    /* JADX INFO: renamed from: ֫ */
    public static C7369 m23421(ImageView imageView, AttributeSet attributeSet, int i) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            C7369 c7369 = new C7369(imageView, attributeSet, i);
            int i2 = c7369.f6530;
            if (i2 >= 0) {
                m23422(imageView.getDrawable(), i2);
                m23422(imageView.getBackground(), i2);
            }
            return c7369;
        }
        return new C7369();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23422(Drawable drawable, int i) {
        if (drawable instanceof C4016) {
            ((C4016) drawable).f8766.m55469(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23423(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            if (!f27811.contains(resources.getResourceTypeName(i))) {
                return false;
            }
            C4016 c4016 = new C4016(resources, i);
            if (z) {
                imageView.setImageDrawable(c4016);
                return true;
            }
            imageView.setBackground(c4016);
            return true;
        } catch (Resources.NotFoundException | IOException unused) {
            return false;
        }
    }
}
