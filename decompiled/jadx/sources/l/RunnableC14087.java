package l;

import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC14087 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC7738 f42541;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f42542;

    public RunnableC14087(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, TextView textView) {
        this.f42541 = viewOnLayoutChangeListenerC7738;
        this.f42542 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f42541;
        if (viewOnLayoutChangeListenerC7738.f23942.getVisibility() == 8) {
            return;
        }
        TextView textView = this.f42542;
        int iIntValue = ((Integer) textView.getTag()).intValue();
        if (iIntValue == 0) {
            viewOnLayoutChangeListenerC7738.f23942.setVisibility(8);
            return;
        }
        textView.setText(C4925.m14327(R.string.MT_Protector) + " (" + iIntValue + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(Integer.valueOf(iIntValue + (-1)));
        C4925.m14316(this, 1000L);
    }
}
