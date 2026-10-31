package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩸ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes4.dex */
public final class C21301 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f68669;

    public C21301(float f) {
        this.f68669 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f68669);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f68669);
    }
}
