package p067l;

import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15757 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnLayoutChangeListenerC9723 f45627;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ TextView f45628;

    public RunnableC15757(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, TextView textView) {
        this.f45627 = viewOnLayoutChangeListenerC9723;
        this.f45628 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = this.f45627;
        if (viewOnLayoutChangeListenerC9723.f26855.getVisibility() == 8) {
            return;
        }
        TextView textView = this.f45628;
        int iIntValue = ((Integer) textView.getTag()).intValue();
        if (iIntValue == 0) {
            viewOnLayoutChangeListenerC9723.f26855.setVisibility(8);
            return;
        }
        textView.setText(C7050.m16224(R.string.MT_Protector) + " (" + iIntValue + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(Integer.valueOf(iIntValue + (-1)));
        C7050.m16213(this, 1000L);
    }
}
