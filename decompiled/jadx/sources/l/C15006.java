package l;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.ܶۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15006 extends LinearLayout {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HandlerC7952 f45761;

    public C15006(Context context, HandlerC7952 handlerC7952) {
        super(context);
        this.f45761 = handlerC7952;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HandlerC7952 handlerC7952 = this.f45761;
        if (actionMasked == 7 || actionMasked == 9) {
            handlerC7952.m21260();
        } else if (actionMasked == 10) {
            handlerC7952.m21262();
        }
        return super.dispatchHoverEvent(motionEvent);
    }
}
