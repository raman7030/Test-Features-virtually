package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۧۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnTouchListenerC10775 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f32426;

    public /* synthetic */ ViewOnTouchListenerC10775(C3013 c3013) {
        this.f32426 = c3013;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C3013.m9197(this.f32426, motionEvent);
        return false;
    }
}
