package p067l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܳ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Y6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16463 extends AbstractC14806 {

    /* JADX INFO: renamed from: ֫ */
    public final Resources f48355;

    /* JADX INFO: renamed from: ֫ */
    public static C16463 m37391() {
        return new C16463(Resources.getSystem());
    }

    public C16463(Resources resources) {
        this.f48355 = resources;
    }

    @Override // p067l.AbstractC14806
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo17170(InputStream inputStream) {
        try {
            C17871 c17871M40606 = C17871.m40606(inputStream);
            float fM40625 = c17871M40606.m40625();
            float fM40620 = c17871M40606.m40620();
            Resources resources = this.f48355;
            float f = resources.getDisplayMetrics().density;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((fM40625 * f) + 0.5f), (int) ((fM40620 * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f, f);
            c17871M40606.m40616(canvas);
            return new BitmapDrawable(resources, bitmapCreateBitmap);
        } catch (C20555 e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }
}
