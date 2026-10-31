package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5I1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6446 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m17805(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17806(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m17808(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17807(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
