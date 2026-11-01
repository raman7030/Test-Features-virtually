package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩷֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5I1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21906 {
    /* JADX INFO: renamed from: ֫ */
    public static ColorStateList m49447(ImageView imageView) {
        return C8494.m19752(imageView);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49448(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C8494.m19753(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C8494.m19752(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۧ */
    public static PorterDuff.Mode m49450(ImageView imageView) {
        return C8494.m19755(imageView);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49449(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C8494.m19754(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C8494.m19752(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
