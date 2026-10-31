package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۜ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6756 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20868 f20974;

    public C6756(C20868 c20868) {
        this.f20974 = c20868;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C20868 c20868 = this.f20974;
        c20868.m47686(C18045.m42100(context, intent, c20868.f67529, c20868.f67531));
    }
}
