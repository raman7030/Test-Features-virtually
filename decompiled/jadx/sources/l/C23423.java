package l;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩻ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18XN */
/* JADX INFO: loaded from: classes.dex */
public final class C23423 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12881 f75224;

    public C23423(C12881 c12881) {
        this.f75224 = c12881;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C12881 c12881 = this.f75224;
        c12881.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c12881.getClass();
        textPaint.bgColor = AbstractC7070.m19071(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f75224.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
