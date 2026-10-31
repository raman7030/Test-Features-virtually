package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC6464 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9287 f19976;

    public ViewOnTouchListenerC6464(C9287 c9287) {
        this.f19976 = c9287;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C9287 c9287 = this.f19976;
        if (action == 0 && (popupWindow = c9287.f28156) != null && popupWindow.isShowing() && x >= 0 && x < c9287.f28156.getWidth() && y >= 0 && y < c9287.f28156.getHeight()) {
            c9287.f28141.postDelayed(c9287.f28143, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c9287.f28141.removeCallbacks(c9287.f28143);
        return false;
    }
}
