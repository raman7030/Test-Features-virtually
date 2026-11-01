package p067l;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.ܶۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16630 extends LinearLayout {

    /* JADX INFO: renamed from: ᩸ */
    public final HandlerC9926 f48874;

    public C16630(Context context, HandlerC9926 handlerC9926) {
        super(context);
        this.f48874 = handlerC9926;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HandlerC9926 handlerC9926 = this.f48874;
        if (actionMasked == 7 || actionMasked == 9) {
            handlerC9926.m23226();
        } else if (actionMasked == 10) {
            handlerC9926.m23228();
        }
        return super.dispatchHoverEvent(motionEvent);
    }
}
