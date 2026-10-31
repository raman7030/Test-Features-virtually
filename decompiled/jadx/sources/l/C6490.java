package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ۜۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28XZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6490 extends MetricAffectingSpan {
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }
}
