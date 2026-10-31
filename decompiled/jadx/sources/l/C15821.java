package l;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5W3 */
/* JADX INFO: loaded from: classes4.dex */
public class C15821 extends SeekBar {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2417 f48902;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f48902.m7843(canvas);
    }

    public C15821(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C15821(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12855.m31289(getContext(), this);
        C2417 c2417 = new C2417(this);
        this.f48902 = c2417;
        c2417.mo7844(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f48902.m7845();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f48902.m7846();
    }
}
