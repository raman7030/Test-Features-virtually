package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۜ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8789 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22201 f23849;

    public C8789(C22201 c22201) {
        this.f23849 = c22201;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C22201 c22201 = this.f23849;
        c22201.m50016(C19518.m44351(context, intent, c22201.f70215, c22201.f70217));
    }
}
