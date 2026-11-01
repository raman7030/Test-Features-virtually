package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3416 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogInterfaceC2564[] f6779;

    public C3416(DialogInterfaceC2564[] dialogInterfaceC2564Arr) {
        this.f6779 = dialogInterfaceC2564Arr;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f6779[0];
        if (ServiceC5428.f12926) {
            dialogInterfaceC2564.dismiss();
        } else {
            dialogInterfaceC2564.m3860().setText(R.string.MT_Protector);
        }
    }
}
