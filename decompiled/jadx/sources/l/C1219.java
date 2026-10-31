package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.֨ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1219 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4372;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f4373;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f4374;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f4375;

    public C1219(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.f4374 = paint;
        this.f4375 = i;
        this.f4372 = i2;
        this.f4373 = i3;
        paint.setColor(C21943.f70257);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return this.f4372 + this.f4375 + this.f4373;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = f + this.f4372;
        int i6 = this.f4375;
        canvas.drawCircle((i6 / 2.0f) + f2, ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i4, i6 / 2.0f, this.f4374);
    }
}
