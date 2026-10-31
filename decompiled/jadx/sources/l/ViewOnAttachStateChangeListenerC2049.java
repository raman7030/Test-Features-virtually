package l;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.֫᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC2049 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2234 f6844;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8085 f6845;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13041 f6846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f6847;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21100 f6848;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f6849;

    public ViewOnAttachStateChangeListenerC2049(C21100 c21100, AbstractActivityC3346 abstractActivityC3346, C14811 c14811, C2234 c2234, BroadcastReceiver broadcastReceiver, InterfaceC8085 interfaceC8085) {
        this.f6848 = c21100;
        this.f6849 = abstractActivityC3346;
        this.f6846 = c14811;
        this.f6844 = c2234;
        this.f6847 = broadcastReceiver;
        this.f6845 = interfaceC8085;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractActivityC3346 abstractActivityC3346 = this.f6849;
        if (abstractActivityC3346 instanceof Main) {
            C21100.f68058 = true;
        }
        InterfaceC13041 interfaceC13041 = this.f6846;
        if (interfaceC13041 != null) {
            abstractActivityC3346.mo9144(interfaceC13041);
            abstractActivityC3346.mo9143(interfaceC13041);
        }
        this.f6844.m7414(this.f6847, new IntentFilter("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        abstractActivityC3346.getLifecycle().mo19833(this.f6845);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        C21100 c21100 = this.f6848;
        if (c21100.f68061 != null) {
            c21100.f68061.dismiss();
            c21100.f68061 = null;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f6849;
        if (abstractActivityC3346 instanceof Main) {
            C21100.f68058 = false;
        }
        InterfaceC13041 interfaceC13041 = this.f6846;
        if (interfaceC13041 != null) {
            abstractActivityC3346.mo9144(interfaceC13041);
        }
        this.f6844.m7413(this.f6847);
        abstractActivityC3346.getLifecycle().mo19834(this.f6845);
        if (c21100.f68062) {
            return;
        }
        if (abstractActivityC3346 instanceof ActivityC9811) {
            ActivityC9811 activityC9811 = (ActivityC9811) abstractActivityC3346;
            if (!abstractActivityC3346.isFinishing()) {
                abstractActivityC3346.finish();
            }
            if (C21100.f68044.m1662() != Boolean.FALSE || activityC9811.m24844()) {
                z = false;
            } else {
                z = true;
            }
        } else if (C21100.f68044.m1662() == Boolean.FALSE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !ApplicationC20075.f65008.getBoolean("mbp", false)) {
            z = true;
        }
        if (z) {
            C21805.m49152();
            if (C21100.f68050 != null) {
                boolean z2 = C21100.f68050.f21579;
                long j = C21100.f68050.f21569;
                C21100.f68050.m18912(true);
                C21100.f68050 = null;
                if (z2) {
                    AbstractActivityC3346 abstractActivityC3347 = c21100.f68059;
                    int i = ServiceC4166.f13587;
                    abstractActivityC3347.startService(new Intent(abstractActivityC3347, (Class<?>) ServiceC4166.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
                }
            }
        }
    }
}
