package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩻۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC23697 extends AbstractC3255 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17183 f76742;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1556 f76743;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f76743.m5326(this);
        return false;
    }
}
