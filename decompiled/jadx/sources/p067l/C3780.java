package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.֫֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3780 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12498 f8099;

    public C3780(C12498 c12498) {
        this.f8099 = c12498;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f8099.f35034.execute(new Runnable() { // from class: l.۟ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                C12498.m28790(context, this.f25161.f8099);
            }
        });
    }
}
