package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܰ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C15774 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogInterfaceC2564 f45669;

    public C15774(DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f45669 = dialogInterfaceC2564;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f45669;
        if (dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
    }
}
