package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;

/* JADX INFO: renamed from: l.۠ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC8158 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f25152;

    public ViewOnAttachStateChangeListenerC8158(BroadcastReceiver broadcastReceiver) {
        this.f25152 = broadcastReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPicker.ACTION_START");
        intentFilter.addAction("ScreenColorPicker.ACTION_STOP");
        C4925.m14311(this.f25152, intentFilter);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C4925.m14310(this.f25152);
    }
}
