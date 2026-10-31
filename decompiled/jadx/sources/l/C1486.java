package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.֫֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1486 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10659 f5326;

    public C1486(C10659 c10659) {
        this.f5326 = c10659;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f5326.f32063.execute(new Runnable() { // from class: l.۟ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                C10659.m26751(context, this.f22271.f5326);
            }
        });
    }
}
