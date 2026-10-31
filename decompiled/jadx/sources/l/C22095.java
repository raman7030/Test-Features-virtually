package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩹ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W906 */
/* JADX INFO: loaded from: classes.dex */
public final class C22095 extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }
}
