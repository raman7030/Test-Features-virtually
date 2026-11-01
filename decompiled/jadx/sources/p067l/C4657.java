package p067l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۖ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4657 extends ClickableSpan {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ RunnableC8680 f10462;

    public C4657(RunnableC8680 runnableC8680) {
        this.f10462 = runnableC8680;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f10462.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
