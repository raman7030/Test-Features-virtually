package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܺ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17726 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ServiceC6328 f52946;

    public C17726(ServiceC6328 serviceC6328) {
        this.f52946 = serviceC6328;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            C9010 c9010M50371 = C22422.m50371();
            if (this.f52946.m14479(c9010M50371)) {
                c9010M50371.m20864();
            }
        }
    }
}
