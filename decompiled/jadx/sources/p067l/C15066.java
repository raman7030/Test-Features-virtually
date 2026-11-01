package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.۬᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15066 {

    /* JADX INFO: renamed from: ֫ */
    public Bitmap f43043;

    /* JADX INFO: renamed from: ۧ */
    public Rect f43044;

    /* JADX INFO: renamed from: ֫ */
    public final void m34471(Rect rect) {
        if (rect.equals(this.f43044)) {
            return;
        }
        this.f43044 = rect;
        Bitmap bitmap = this.f43043;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f43043 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        int iWidth = (int) (rect.width() + 0.5f);
        int[] iArr = new int[iWidth];
        for (int i = 0; i < iWidth; i++) {
            iArr[i] = Color.HSVToColor(new float[]{(i * 360.0f) / iWidth, 1.0f, 1.0f});
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(0.0f);
        int iHeight = rect.height();
        Canvas canvas = new Canvas(this.f43043);
        for (int i2 = 0; i2 < iWidth; i2++) {
            paint.setColor(iArr[i2]);
            float f = i2;
            canvas.drawLine(f, 0.0f, f, iHeight, paint);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34470(Canvas canvas) {
        canvas.drawBitmap(this.f43043, (Rect) null, this.f43044, (Paint) null);
    }
}
