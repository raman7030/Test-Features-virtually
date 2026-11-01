package p067l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;

/* JADX INFO: renamed from: l.۠ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC10122 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ BroadcastReceiver f28063;

    public ViewOnAttachStateChangeListenerC10122(BroadcastReceiver broadcastReceiver) {
        this.f28063 = broadcastReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPicker.ACTION_START");
        intentFilter.addAction("ScreenColorPicker.ACTION_STOP");
        C7050.m16208(this.f28063, intentFilter);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C7050.m16207(this.f28063);
    }
}
