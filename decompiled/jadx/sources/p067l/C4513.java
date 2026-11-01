package p067l;

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
public final class C4513 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۗ */
    public final C14610 f10123;

    /* JADX INFO: renamed from: ۙ */
    public final Paint f10124 = AbstractC17252.m39039();

    /* JADX INFO: renamed from: ᩶ */
    public final String f10125;

    /* JADX INFO: renamed from: ᩸ */
    public int f10126;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC21317 f10127;

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f10124;
            paint2.set(paint);
            C14610 c14610 = this.f10123;
            c14610.m33408(paint2);
            float fMeasureText = paint2.measureText("8");
            float fMeasureText2 = paint2.measureText(".");
            float fMeasureText3 = paint2.measureText(" ");
            int length = (int) ((this.f10125.length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int length2 = (int) ((String.valueOf(this.f10127.mo5550()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int iM33400 = c14610.m33400();
            if (length2 > iM33400) {
                this.f10126 = length2;
            } else {
                this.f10126 = 0;
                length2 = iM33400;
            }
            int i8 = i2 > 0 ? ((length2 * i2) + i) - length : (length2 - length) + (length2 * i2) + i;
            Paint.Align textAlign = paint2.getTextAlign();
            paint2.setTextAlign(Paint.Align.CENTER);
            float f = fMeasureText / 2.0f;
            float f2 = i8 + f;
            int i9 = 0;
            for (int length3 = r5.length(); i9 < length3; length3 = length3) {
                int i10 = i9 + 1;
                canvas.drawText(this.f10125, i9, i10, f2, i4, paint2);
                f2 += fMeasureText;
                i9 = i10;
            }
            canvas.drawText(".", (fMeasureText2 / 2.0f) + (f2 - f), i4, paint2);
            paint2.setTextAlign(textAlign);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9543(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C4513[] c4513Arr = (C4513[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C4513.class);
        if (c4513Arr != null) {
            TextPaint paint = textView.getPaint();
            float fMeasureText = paint.measureText("8");
            float fMeasureText2 = paint.measureText(".");
            float fMeasureText3 = paint.measureText(" ");
            for (C4513 c4513 : c4513Arr) {
                c4513.f10126 = (int) ((String.valueOf(c4513.f10127.mo5550()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            }
        }
    }

    public C4513(C14610 c14610, String str, InterfaceC21317 interfaceC21317) {
        this.f10123 = c14610;
        this.f10125 = str;
        this.f10127 = interfaceC21317;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f10126, this.f10123.m33400());
    }
}
