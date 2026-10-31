package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۖۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q917 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2257 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12881 f7335;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f7336 = AbstractC15661.m36873();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7337;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7338;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC19938 f7339;

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f7336;
            paint2.set(paint);
            C12881 c12881 = this.f7335;
            c12881.m31322(paint2);
            float fMeasureText = paint2.measureText("8");
            float fMeasureText2 = paint2.measureText(".");
            float fMeasureText3 = paint2.measureText(" ");
            int length = (int) ((this.f7337.length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int length2 = (int) ((String.valueOf(this.f7339.mo3236()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int iM31314 = c12881.m31314();
            if (length2 > iM31314) {
                this.f7338 = length2;
            } else {
                this.f7338 = 0;
                length2 = iM31314;
            }
            int i8 = i2 > 0 ? ((length2 * i2) + i) - length : (length2 - length) + (length2 * i2) + i;
            Paint.Align textAlign = paint2.getTextAlign();
            paint2.setTextAlign(Paint.Align.CENTER);
            float f = fMeasureText / 2.0f;
            float f2 = i8 + f;
            int i9 = 0;
            for (int length3 = r5.length(); i9 < length3; length3 = length3) {
                int i10 = i9 + 1;
                canvas.drawText(this.f7337, i9, i10, f2, i4, paint2);
                f2 += fMeasureText;
                i9 = i10;
            }
            canvas.drawText(".", (fMeasureText2 / 2.0f) + (f2 - f), i4, paint2);
            paint2.setTextAlign(textAlign);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7461(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C2257[] c2257Arr = (C2257[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2257.class);
        if (c2257Arr != null) {
            TextPaint paint = textView.getPaint();
            float fMeasureText = paint.measureText("8");
            float fMeasureText2 = paint.measureText(".");
            float fMeasureText3 = paint.measureText(" ");
            for (C2257 c2257 : c2257Arr) {
                c2257.f7338 = (int) ((String.valueOf(c2257.f7339.mo3236()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            }
        }
    }

    public C2257(C12881 c12881, String str, InterfaceC19938 interfaceC19938) {
        this.f7335 = c12881;
        this.f7337 = str;
        this.f7339 = interfaceC19938;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f7338, this.f7335.m31314());
    }
}
