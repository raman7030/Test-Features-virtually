package p067l;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.֫᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4316 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C4491 f9627;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC10052 f9628;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ InterfaceC1489 f9629;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ BroadcastReceiver f9630;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22422 f9631;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f9632;

    public ViewOnAttachStateChangeListenerC4316(C22422 c22422, AbstractActivityC5549 abstractActivityC5549, C16445 c16445, C4491 c4491, BroadcastReceiver broadcastReceiver, InterfaceC10052 interfaceC10052) {
        this.f9631 = c22422;
        this.f9632 = abstractActivityC5549;
        this.f9629 = c16445;
        this.f9627 = c4491;
        this.f9630 = broadcastReceiver;
        this.f9628 = interfaceC10052;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractActivityC5549 abstractActivityC5549 = this.f9632;
        if (abstractActivityC5549 instanceof Main) {
            C22422.f70740 = true;
        }
        InterfaceC1489 interfaceC1489 = this.f9629;
        if (interfaceC1489 != null) {
            abstractActivityC5549.mo11195(interfaceC1489);
            abstractActivityC5549.mo11194(interfaceC1489);
        }
        this.f9627.m9496(this.f9630, new IntentFilter("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        abstractActivityC5549.getLifecycle().mo21806(this.f9628);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        C22422 c22422 = this.f9631;
        if (c22422.f70743 != null) {
            c22422.f70743.dismiss();
            c22422.f70743 = null;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f9632;
        if (abstractActivityC5549 instanceof Main) {
            C22422.f70740 = false;
        }
        InterfaceC1489 interfaceC1489 = this.f9629;
        if (interfaceC1489 != null) {
            abstractActivityC5549.mo11195(interfaceC1489);
        }
        this.f9627.m9495(this.f9630);
        abstractActivityC5549.getLifecycle().mo21807(this.f9628);
        if (c22422.f70744) {
            return;
        }
        if (abstractActivityC5549 instanceof ActivityC11693) {
            ActivityC11693 activityC11693 = (ActivityC11693) abstractActivityC5549;
            if (!abstractActivityC5549.isFinishing()) {
                abstractActivityC5549.finish();
            }
            if (C22422.f70726.m4060() != Boolean.FALSE || activityC11693.m26859()) {
                z = false;
            } else {
                z = true;
            }
        } else if (C22422.f70726.m4060() == Boolean.FALSE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !ApplicationC21448.f67649.getBoolean("mbp", false)) {
            z = true;
        }
        if (z) {
            C23092.m51503();
            if (C22422.f70732 != null) {
                boolean z2 = C22422.f70732.f24459;
                long j = C22422.f70732.f24449;
                C22422.f70732.m20866(true);
                C22422.f70732 = null;
                if (z2) {
                    AbstractActivityC5549 abstractActivityC55410 = c22422.f70741;
                    int i = ServiceC6328.f16400;
                    abstractActivityC55410.startService(new Intent(abstractActivityC55410, (Class<?>) ServiceC6328.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
                }
            }
        }
    }
}
