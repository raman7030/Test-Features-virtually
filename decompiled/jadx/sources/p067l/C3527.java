package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.֨ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3527 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۙ */
    public final int f7142;

    /* JADX INFO: renamed from: ᩶ */
    public final int f7143;

    /* JADX INFO: renamed from: ᩸ */
    public final Paint f7144;

    /* JADX INFO: renamed from: ᩹ */
    public final int f7145;

    public C3527(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.f7144 = paint;
        this.f7145 = i;
        this.f7142 = i2;
        this.f7143 = i3;
        paint.setColor(C23223.f72969);
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
        return this.f7142 + this.f7145 + this.f7143;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = f + this.f7142;
        int i6 = this.f7145;
        canvas.drawCircle((i6 / 2.0f) + f2, ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i4, i6 / 2.0f, this.f7144);
    }
}
