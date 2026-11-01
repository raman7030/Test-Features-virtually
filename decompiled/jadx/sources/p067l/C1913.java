package p067l;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: l.᩸۬ */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1913 {
    /* JADX INFO: renamed from: ֫ */
    public static Drawable m51116(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Icon m51117(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
