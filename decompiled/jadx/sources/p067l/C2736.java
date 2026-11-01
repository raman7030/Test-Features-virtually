package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.֡ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58YR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2736 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᩶ */
    public final C14610 f4607;

    /* JADX INFO: renamed from: ᩸ */
    public final C18830 f4608;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f4609;

    public C2736(C14610 c14610, C18830 c18830, boolean z) {
        this.f4607 = c14610;
        this.f4608 = c18830;
        this.f4609 = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C18830 c18830 = this.f4608;
        if (c18830.m42894()) {
            Rect bounds = c18830.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.f4609) {
            this.f4607.m33406(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM28422 = AbstractC12342.m28422(canvas, charSequence);
        float textSize = paint.getTextSize();
        C18830 c18830 = this.f4608;
        c18830.m42891(textSize, iM28422);
        if (c18830.m42894()) {
            int i6 = i5 - c18830.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f, i6);
                c18830.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float fM21912 = (int) (C9417.m21912(i5, i3, 2, i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.f4609) {
            this.f4607.m33406(paint);
        }
        canvas.drawText(charSequence, i, i2, f, fM21912, paint);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18830 m4273() {
        return this.f4608;
    }
}
