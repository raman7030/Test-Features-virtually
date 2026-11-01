package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37HW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5519 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۗ */
    public Drawable f13192;

    /* JADX INFO: renamed from: ᩹ */
    public int f13196 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f13194 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public int f13195 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ */
    public int f13193 = -1;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m12164(paint);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return (this.f13193 * 2) + this.f13192.getBounds().width();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m12164(paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.ascent;
        int iRound = Math.round(paint.getTextSize() * 0.06f) + (((fontMetricsInt.descent - i6) - this.f13192.getBounds().height()) / 2) + i4 + i6;
        canvas.save();
        canvas.translate(f + this.f13193, iRound);
        this.f13192.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12164(Paint paint) {
        int color = paint.getColor();
        int iMax = Math.max(1, Math.round(paint.getTextSize() * 0.95f));
        int iMax2 = Math.max(1, Math.round(iMax * 1.4f));
        int iMax3 = Math.max(1, Math.round(paint.getTextSize() * 0.1f));
        if (this.f13192 != null && this.f13196 == iMax2 && this.f13194 == iMax && this.f13195 == color && this.f13193 == iMax3) {
            return;
        }
        Drawable drawableMutate = C7050.m16202(R.drawable.MT_Protector).mutate();
        this.f13192 = drawableMutate;
        drawableMutate.setTint(color);
        this.f13192.setBounds(0, 0, iMax2, iMax);
        this.f13196 = iMax2;
        this.f13194 = iMax;
        this.f13195 = color;
        this.f13193 = iMax3;
    }
}
