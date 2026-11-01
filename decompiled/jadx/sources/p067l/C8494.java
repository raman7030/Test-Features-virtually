package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5I1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8494 {
    /* JADX INFO: renamed from: ֫ */
    public static ColorStateList m19752(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19753(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ۧ */
    public static PorterDuff.Mode m19755(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19754(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
