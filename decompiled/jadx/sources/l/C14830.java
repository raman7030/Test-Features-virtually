package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܳ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Y6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14830 extends AbstractC13087 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Resources f45239;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14830 m35236() {
        return new C14830(Resources.getSystem());
    }

    public C14830(Resources resources) {
        this.f45239 = resources;
    }

    @Override // l.AbstractC13087
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo15264(InputStream inputStream) {
        try {
            C16312 c16312M38391 = C16312.m38391(inputStream);
            float fM38410 = c16312M38391.m38410();
            float fM38405 = c16312M38391.m38405();
            Resources resources = this.f45239;
            float f = resources.getDisplayMetrics().density;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((fM38410 * f) + 0.5f), (int) ((fM38405 * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f, f);
            c16312M38391.m38401(canvas);
            return new BitmapDrawable(resources, bitmapCreateBitmap);
        } catch (C19136 e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }
}
