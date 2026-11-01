package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۗ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5679 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public final Paint f13837 = new Paint();

    /* JADX INFO: renamed from: ۧ */
    public final int f13838;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public C5679(int i) {
        this.f13838 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        int iWidth = bounds.width();
        int i5 = this.f13838;
        int i6 = iWidth / i5;
        int iHeight = bounds.height() / i5;
        boolean z = false;
        for (int i7 = 0; i7 <= iHeight; i7++) {
            int i8 = 0;
            boolean z2 = z;
            while (i8 <= i6) {
                int i9 = (i8 * i5) + i;
                int i10 = (i7 * i5) + i2;
                int iMin = Math.min(i3, i9 + i5);
                int iMin2 = Math.min(i4, i10 + i5);
                int i11 = z2 ? -1 : -3421237;
                int i12 = i;
                Paint paint = this.f13837;
                paint.setColor(i11);
                canvas.drawRect(i9, i10, iMin, iMin2, paint);
                z2 = !z2;
                i8++;
                i = i12;
                iHeight = iHeight;
            }
            z = !z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
