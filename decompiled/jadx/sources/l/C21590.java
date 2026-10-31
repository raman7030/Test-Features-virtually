package l;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: l.᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21590 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m48769(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Icon m48770(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
