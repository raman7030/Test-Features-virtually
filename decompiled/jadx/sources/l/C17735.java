package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.ᩳ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N52K */
/* JADX INFO: loaded from: classes4.dex */
public class C17735 extends ProgressBar {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54278 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC19781 f54279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RunnableC4196 f54280;

    public C17735(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f54279 = new RunnableC19781(3, this);
        this.f54280 = new RunnableC4196(1, this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f54279);
        removeCallbacks(this.f54280);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f54279);
        removeCallbacks(this.f54280);
    }
}
