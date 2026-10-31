package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ܳۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8Y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14250 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12881 f42938;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f42940 = AbstractC15661.m36874();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f42939 = AbstractC15661.m36873();

    public C14250(C12881 c12881) {
        this.f42938 = c12881;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f42938.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f42938.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f42938.m31323();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f42939;
        paint2.setStyle(style);
        this.f42938.getClass();
        paint2.setColor(AbstractC7070.m19071(paint.getColor(), 25));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        Rect rect = this.f42940;
        rect.set(i, i3, width, i5);
        canvas.drawRect(rect, paint2);
    }
}
