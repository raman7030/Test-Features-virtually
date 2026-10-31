package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.᩶۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20190 extends ReplacementSpan {
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return Math.max(1, Math.round(paint.getTextSize() * 0.8f));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fMax = Math.max(1.0f, paint.getTextSize() * 0.8f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.drawCircle((fMax / 2.0f) + f, ((fontMetrics.ascent + fontMetrics.descent) / 2.0f) + i4, Math.max(1.0f, paint.getTextSize() * 0.06f), paint);
    }
}
