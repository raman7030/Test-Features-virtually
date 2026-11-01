package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۤۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12070 implements InterfaceC0923 {

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f33626;

    /* JADX INFO: renamed from: ۧ */
    public final C21265 f33627;

    public C12070(C21265 c21265, Drawable drawable) {
        this.f33627 = c21265;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC8046.f21184, RunnableC8046.f21184, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(RunnableC8046.f21189, RunnableC8046.f21189, RunnableC8046.f21184, RunnableC8046.f21184);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        this.f33626 = bitmapCreateBitmap;
    }

    @Override // p067l.InterfaceC0923
    public final Object get() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC8046.f21184, RunnableC8046.f21184, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        synchronized (RunnableC8046.f21190) {
            canvas.drawBitmap(this.f33627.f66886.m30926(), 0.0f, 0.0f, RunnableC8046.f21190);
            if (C23223.m51768() && C19781.m44961(this.f33626)) {
                RunnableC8046.f21190.setColorFilter(RunnableC8046.f21192);
                canvas.drawBitmap(this.f33626, 0.0f, 0.0f, RunnableC8046.f21190);
                RunnableC8046.f21190.setColorFilter(null);
            } else {
                canvas.drawBitmap(this.f33626, 0.0f, 0.0f, RunnableC8046.f21190);
            }
        }
        return bitmapCreateBitmap;
    }
}
