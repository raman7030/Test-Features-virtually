package p067l;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: l.ۖۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4542 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: ᩸ */
    public final int f10176;

    /* JADX INFO: renamed from: ᩹ */
    public final int f10177;

    public C4542(int i, int i2) {
        this.f10177 = i;
        this.f10176 = i2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f10177);
        int i = this.f10176;
        if (((-16777216) & i) != 0) {
            textPaint.bgColor = i;
        }
    }
}
