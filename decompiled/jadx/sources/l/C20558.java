package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩷֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5I1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20558 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m47123(ImageView imageView) {
        return C6446.m17805(imageView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47124(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C6446.m17806(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C6446.m17805(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m47126(ImageView imageView) {
        return C6446.m17808(imageView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47125(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C6446.m17807(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C6446.m17805(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
