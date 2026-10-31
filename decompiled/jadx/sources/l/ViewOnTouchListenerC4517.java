package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۙ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC4517 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action != 0 && action != 1) || view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
