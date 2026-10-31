package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37HW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3315 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Drawable f10383;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f10387 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10385 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10386 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10384 = -1;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m10128(paint);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return (this.f10384 * 2) + this.f10383.getBounds().width();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m10128(paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.ascent;
        int iRound = Math.round(paint.getTextSize() * 0.06f) + (((fontMetricsInt.descent - i6) - this.f10383.getBounds().height()) / 2) + i4 + i6;
        canvas.save();
        canvas.translate(f + this.f10384, iRound);
        this.f10383.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10128(Paint paint) {
        int color = paint.getColor();
        int iMax = Math.max(1, Math.round(paint.getTextSize() * 0.95f));
        int iMax2 = Math.max(1, Math.round(iMax * 1.4f));
        int iMax3 = Math.max(1, Math.round(paint.getTextSize() * 0.1f));
        if (this.f10383 != null && this.f10387 == iMax2 && this.f10385 == iMax && this.f10386 == color && this.f10384 == iMax3) {
            return;
        }
        Drawable drawableMutate = C4925.m14305(R.drawable.MT_Protector).mutate();
        this.f10383 = drawableMutate;
        drawableMutate.setTint(color);
        this.f10383.setBounds(0, 0, iMax2, iMax);
        this.f10387 = iMax2;
        this.f10385 = iMax;
        this.f10386 = color;
        this.f10384 = iMax3;
    }
}
