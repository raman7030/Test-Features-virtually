package p067l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۜۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC1163 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1303 f22851;

    public ViewOnTouchListenerC1163(C1303 c1303) {
        this.f22851 = c1303;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C1303 c1303 = this.f22851;
        if (action == 0 && (popupWindow = c1303.f31105) != null && popupWindow.isShowing() && x >= 0 && x < c1303.f31105.getWidth() && y >= 0 && y < c1303.f31105.getHeight()) {
            c1303.f31090.postDelayed(c1303.f31092, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c1303.f31090.removeCallbacks(c1303.f31092);
        return false;
    }
}
