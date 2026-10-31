package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.֡ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58YR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0387 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12881 f1830;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17321 f1831;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f1832;

    public C0387(C12881 c12881, C17321 c17321, boolean z) {
        this.f1830 = c12881;
        this.f1831 = c17321;
        this.f1832 = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C17321 c17321 = this.f1831;
        if (c17321.m40643()) {
            Rect bounds = c17321.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.f1832) {
            this.f1830.m31320(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM26389 = AbstractC10494.m26389(canvas, charSequence);
        float textSize = paint.getTextSize();
        C17321 c17321 = this.f1831;
        c17321.m40640(textSize, iM26389);
        if (c17321.m40643()) {
            int i6 = i5 - c17321.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f, i6);
                c17321.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float fM19938 = (int) (C7416.m19938(i5, i3, 2, i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.f1832) {
            this.f1830.m31320(paint);
        }
        canvas.drawText(charSequence, i, i2, f, fM19938, paint);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17321 m1882() {
        return this.f1831;
    }
}
