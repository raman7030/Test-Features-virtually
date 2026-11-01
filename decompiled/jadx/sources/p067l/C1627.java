package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺۡ */
/* JADX INFO: compiled from: I5W3 */
/* JADX INFO: loaded from: classes4.dex */
public class C1627 extends SeekBar {

    /* JADX INFO: renamed from: ᩸ */
    public final C0962 f52040;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f52040.m9891(canvas);
    }

    public C1627(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1627(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1480.m33375(getContext(), this);
        C0962 c0962 = new C0962(this);
        this.f52040 = c0962;
        c0962.mo9892(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f52040.m9893();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f52040.m9894();
    }
}
