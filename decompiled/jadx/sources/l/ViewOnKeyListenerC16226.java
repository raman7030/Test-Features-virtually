package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ܺ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnKeyListenerC16226 implements View.OnKeyListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19050 f49960;

    public ViewOnKeyListenerC16226(C19050 c19050) {
        this.f49960 = c19050;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        C19050 c19050 = this.f49960;
        if ((!c19050.f60006 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = c19050.f60005) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
