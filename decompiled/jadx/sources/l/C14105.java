package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܰ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14105 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f42583;

    public C14105(DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f42583 = dialogInterfaceC0206;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f42583;
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
    }
}
