package l;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.᩹ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: GB1W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22443 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1961 f72696;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint.FontMetricsInt f72695 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short f72694 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f72697 = 1.0f;

    public AbstractC22443(C1961 c1961) {
        C13746.m33055(c1961, "rasterizer cannot be null");
        this.f72696 = c1961;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f72695;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C1961 c1961 = this.f72696;
        this.f72697 = fAbs / c1961.m6462();
        c1961.m6462();
        short sM6461 = (short) (c1961.m6461() * this.f72697);
        this.f72694 = sM6461;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return sM6461;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1961 m50369() {
        return this.f72696;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50370() {
        return this.f72694;
    }
}
