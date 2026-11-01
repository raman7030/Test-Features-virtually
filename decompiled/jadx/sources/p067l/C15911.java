package p067l;

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
public final class C15911 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩶ */
    public final C14610 f46030;

    /* JADX INFO: renamed from: ᩹ */
    public final Rect f46032 = AbstractC17252.m39040();

    /* JADX INFO: renamed from: ᩸ */
    public final Paint f46031 = AbstractC17252.m39039();

    public C15911(C14610 c14610) {
        this.f46030 = c14610;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f46030.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f46030.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f46030.m33409();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f46031;
        paint2.setStyle(style);
        this.f46030.getClass();
        paint2.setColor(AbstractC9088.m21029(paint.getColor(), 25));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        Rect rect = this.f46032;
        rect.set(i, i3, width, i5);
        canvas.drawRect(rect, paint2);
    }
}
