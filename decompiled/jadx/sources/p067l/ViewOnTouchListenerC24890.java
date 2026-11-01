package p067l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩻۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC24890 extends AbstractC5462 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸ */
    public C18699 f79492;

    /* JADX INFO: renamed from: ᩹ */
    public C3847 f79493;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f79493.m7555(this);
        return false;
    }
}
