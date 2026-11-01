package p067l;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.᩹ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: GB1W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23698 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᩸ */
    public final C4232 f75422;

    /* JADX INFO: renamed from: ᩶ */
    public final Paint.FontMetricsInt f75421 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: ۙ */
    public short f75420 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public float f75423 = 1.0f;

    public AbstractC23698(C4232 c4232) {
        C1524.m35169(c4232, "rasterizer cannot be null");
        this.f75422 = c4232;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f75421;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C4232 c4232 = this.f75422;
        this.f75423 = fAbs / c4232.m8603();
        c4232.m8603();
        short sM8602 = (short) (c4232.m8602() * this.f75423);
        this.f75420 = sM8602;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return sM8602;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4232 m52710() {
        return this.f75422;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52711() {
        return this.f75420;
    }
}
