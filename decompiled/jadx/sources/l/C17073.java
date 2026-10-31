package l;

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
public final class C17073 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final boolean f52343;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12881 f52344;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f52348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f52346 = AbstractC15661.m36873();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RectF f52347 = AbstractC15661.m36875();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f52345 = AbstractC15661.m36874();

    static {
        int i = Build.VERSION.SDK_INT;
        f52343 = 24 == i || 25 == i;
    }

    public C17073(C12881 c12881, int i) {
        this.f52344 = c12881;
        this.f52348 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f52344.m31314();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        RectF rectF = this.f52347;
        Rect rect = this.f52345;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f52346;
            paint2.set(paint);
            C12881 c12881 = this.f52344;
            c12881.m31322(paint2);
            int iSave = canvas.save();
            try {
                int iM31314 = c12881.m31314();
                int iM31315 = c12881.m31315((int) ((paint2.descent() - paint2.ascent()) + 0.5f));
                int iM31321 = (iM31314 - iM31315) / c12881.m31321();
                boolean z2 = f52343;
                int i8 = this.f52348;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (iM31314 * i8)) : (iM31314 * i8) - i;
                    int i9 = (iM31321 * i2) + i;
                    int i10 = (i2 * iM31315) + i9;
                    int i11 = i2 * width;
                    iMin = Math.min(i9, i10) + i11;
                    iMax = Math.max(i9, i10) + i11;
                } else {
                    if (i2 <= 0) {
                        i -= iM31314;
                    }
                    iMin = i + iM31321;
                    iMax = iMin + iM31315;
                }
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iM31315 / 2);
                int i12 = iM31315 + iDescent;
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
