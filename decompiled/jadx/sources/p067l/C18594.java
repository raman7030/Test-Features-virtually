package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ܿۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90A */
/* JADX INFO: loaded from: classes4.dex */
public final class C18594 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۬ */
    public static final boolean f55525;

    /* JADX INFO: renamed from: ۗ */
    public C14610 f55526;

    /* JADX INFO: renamed from: ᩹ */
    public final int f55530;

    /* JADX INFO: renamed from: ᩶ */
    public final Paint f55528 = AbstractC17252.m39039();

    /* JADX INFO: renamed from: ᩸ */
    public final RectF f55529 = AbstractC17252.m39041();

    /* JADX INFO: renamed from: ۙ */
    public final Rect f55527 = AbstractC17252.m39040();

    static {
        int i = Build.VERSION.SDK_INT;
        f55525 = 24 == i || 25 == i;
    }

    public C18594(C14610 c14610, int i) {
        this.f55526 = c14610;
        this.f55530 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f55526.m33400();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        RectF rectF = this.f55529;
        Rect rect = this.f55527;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f55528;
            paint2.set(paint);
            C14610 c14610 = this.f55526;
            c14610.m33408(paint2);
            int iSave = canvas.save();
            try {
                int iM33400 = c14610.m33400();
                int iM33401 = c14610.m33401((int) ((paint2.descent() - paint2.ascent()) + 0.5f));
                int iM33407 = (iM33400 - iM33401) / c14610.m33407();
                boolean z2 = f55525;
                int i8 = this.f55530;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (iM33400 * i8)) : (iM33400 * i8) - i;
                    int i9 = (iM33407 * i2) + i;
                    int i10 = (i2 * iM33401) + i9;
                    int i11 = i2 * width;
                    iMin = Math.min(i9, i10) + i11;
                    iMax = Math.max(i9, i10) + i11;
                } else {
                    if (i2 <= 0) {
                        i -= iM33400;
                    }
                    iMin = i + iM33407;
                    iMax = iMin + iM33401;
                }
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iM33401 / 2);
                int i12 = iM33401 + iDescent;
                if (i8 == 0 || i8 == 1) {
                    rectF.set(iMin, iDescent, iMax, i12);
                    if (i8 == 0) {
                        style = Paint.Style.FILL;
                    } else {
                        style = Paint.Style.STROKE;
                    }
                    paint2.setStyle(style);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(iMin, iDescent, iMax, i12);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
