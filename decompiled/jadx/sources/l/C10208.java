package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۤۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10208 implements InterfaceC1629 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f30665;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19883 f30666;

    public C10208(C19883 c19883, Drawable drawable) {
        this.f30666 = c19883;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC5974.f18332, RunnableC5974.f18332, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(RunnableC5974.f18337, RunnableC5974.f18337, RunnableC5974.f18332, RunnableC5974.f18332);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        this.f30665 = bitmapCreateBitmap;
    }

    @Override // l.InterfaceC1629
    public final Object get() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC5974.f18332, RunnableC5974.f18332, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        synchronized (RunnableC5974.f18338) {
            canvas.drawBitmap(this.f30666.f64250.m28877(), 0.0f, 0.0f, RunnableC5974.f18338);
            if (C21943.m49431() && C18321.m42699(this.f30665)) {
                RunnableC5974.f18338.setColorFilter(RunnableC5974.f18340);
                canvas.drawBitmap(this.f30665, 0.0f, 0.0f, RunnableC5974.f18338);
                RunnableC5974.f18338.setColorFilter(null);
            } else {
                canvas.drawBitmap(this.f30665, 0.0f, 0.0f, RunnableC5974.f18338);
            }
        }
        return bitmapCreateBitmap;
    }
}
