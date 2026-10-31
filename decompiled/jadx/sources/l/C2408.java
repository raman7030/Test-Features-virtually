package l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۖ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C2408 extends ClickableSpan {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC6641 f7671;

    public C2408(RunnableC6641 runnableC6641) {
        this.f7671 = runnableC6641;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f7671.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
