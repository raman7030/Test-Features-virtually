package p067l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩸ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7TS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22779 extends C0878 {

    /* JADX INFO: renamed from: ᩶ */
    public Rect f71799;

    /* JADX INFO: renamed from: ᩸ */
    public int f71800;

    /* JADX INFO: renamed from: ᩹ */
    public float f71801;

    public C22779(Drawable drawable, int i) {
        super(drawable);
        this.f71801 = 1.0f;
        this.f71799 = new Rect();
        this.f71800 = i;
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int i7 = this.f71800;
        if (i7 == 0) {
            int i8 = (int) (iWidth * this.f71801);
            i = bounds.left;
            int i9 = bounds.top;
            i2 = bounds.bottom;
            i3 = i9;
            i4 = i8 + i;
        } else {
            if (i7 == 1) {
                int i10 = (int) (iHeight * this.f71801);
                i = bounds.left;
                int i11 = bounds.top;
                int i12 = i10 + i11;
                i3 = i11;
                i4 = bounds.right;
                i2 = i12;
            } else if (i7 == 2) {
                int i13 = (int) (iWidth * this.f71801);
                i4 = bounds.right;
                i5 = i4 - i13;
                i6 = bounds.top;
                i2 = bounds.bottom;
            } else if (i7 == 3) {
                int i14 = (int) (iHeight * this.f71801);
                int i15 = bounds.left;
                int i16 = bounds.bottom;
                int i17 = i16 - i14;
                i4 = bounds.right;
                i2 = i16;
                i6 = i17;
                i5 = i15;
            } else {
                i5 = bounds.left;
                i6 = bounds.top;
                i4 = bounds.right;
                i2 = bounds.bottom;
            }
            Rect rect = this.f71799;
            rect.set(i5, i6, i4, i2);
            Drawable drawable = getDrawable();
            C12826.requireNonNull(drawable);
            drawable.setBounds(rect);
            super.draw(canvas);
        }
        i5 = i;
        i6 = i3;
        Rect rect2 = this.f71799;
        rect2.set(i5, i6, i4, i2);
        Drawable drawable2 = getDrawable();
        C12826.requireNonNull(drawable2);
        drawable2.setBounds(rect2);
        super.draw(canvas);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50966(float f) {
        float fMax = Math.max(0.0f, f);
        if (this.f71801 != fMax) {
            this.f71801 = fMax;
            invalidateSelf();
        }
    }
}
