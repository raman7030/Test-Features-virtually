package p067l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ܺ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnKeyListenerC17790 implements View.OnKeyListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20474 f53130;

    public ViewOnKeyListenerC17790(C20474 c20474) {
        this.f53130 = c20474;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        C20474 c20474 = this.f53130;
        if ((!c20474.f63235 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = c20474.f63234) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
