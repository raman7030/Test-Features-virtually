package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩷ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08Y1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21948 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۙ */
    public final C14610 f68985;

    /* JADX INFO: renamed from: ᩸ */
    public final int f68987;

    /* JADX INFO: renamed from: ᩶ */
    public final Rect f68986 = AbstractC17252.m39040();

    /* JADX INFO: renamed from: ᩹ */
    public final Paint f68988 = AbstractC17252.m39039();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C21948(C14610 c14610, int i) {
        this.f68985 = c14610;
        this.f68987 = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f68985.m33404(textPaint, this.f68987);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f68985.m33404(textPaint, this.f68987);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f68987;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.f68988;
            paint2.set(paint);
            this.f68985.m33402(paint2);
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i9 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.f68986;
                rect.set(i, i9, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }
}
