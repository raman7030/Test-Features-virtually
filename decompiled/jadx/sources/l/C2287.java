package l;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: l.ۖۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2287 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f7390;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f7391;

    public C2287(int i, int i2) {
        this.f7391 = i;
        this.f7390 = i2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f7391);
        int i = this.f7390;
        if (((-16777216) & i) != 0) {
            textPaint.bgColor = i;
        }
    }
}
