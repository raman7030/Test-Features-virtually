package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.ᩳ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N52K */
/* JADX INFO: loaded from: classes4.dex */
public class C19223 extends ProgressBar {

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f57470 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final RunnableC21169 f57471;

    /* JADX INFO: renamed from: ᩹ */
    public final RunnableC6357 f57472;

    public C19223(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f57471 = new RunnableC21169(3, this);
        this.f57472 = new RunnableC6357(1, this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f57471);
        removeCallbacks(this.f57472);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f57471);
        removeCallbacks(this.f57472);
    }
}
