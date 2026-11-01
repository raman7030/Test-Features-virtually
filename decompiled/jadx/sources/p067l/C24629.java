package p067l;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩻ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18XN */
/* JADX INFO: loaded from: classes.dex */
public final class C24629 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ᩸ */
    public final C14610 f77970;

    public C24629(C14610 c14610) {
        this.f77970 = c14610;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14610 c14610 = this.f77970;
        c14610.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c14610.getClass();
        textPaint.bgColor = AbstractC9088.m21029(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f77970.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
