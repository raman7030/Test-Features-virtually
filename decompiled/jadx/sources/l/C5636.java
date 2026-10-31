package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۚ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5636 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f17407;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1402 f17408;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8458 f17409;

    public C5636(C8458 c8458, InterfaceC19251 interfaceC19251, InterfaceC1402 interfaceC1402) {
        this.f17409 = c8458;
        this.f17407 = interfaceC19251;
        this.f17408 = interfaceC1402;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f17407.mo17760(new Runnable() { // from class: l.֡᩹֫
                @Override // java.lang.Runnable
                public final void run() {
                    C5636.m15930(this.f2642);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15930(C5636 c5636) {
        if (c5636.f17409.f25875) {
            ((SurfaceHolderCallbackC20641) c5636.f17408).f66409.m36996(3, false);
        }
    }
}
