package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۚ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7725 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20664 f20253;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3701 f20254;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C10407 f20255;

    public C7725(C10407 c10407, InterfaceC20664 interfaceC20664, InterfaceC3701 interfaceC3701) {
        this.f20255 = c10407;
        this.f20253 = interfaceC20664;
        this.f20254 = interfaceC3701;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f20253.mo19707(new Runnable() { // from class: l.֡᩹֫
                @Override // java.lang.Runnable
                public final void run() {
                    C7725.m17851(this.f5415);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17851(C7725 c7725) {
        if (c7725.f20255.f28788) {
            ((SurfaceHolderCallbackC21985) c7725.f20254).f69089.m39163(3, false);
        }
    }
}
