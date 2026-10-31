package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1102 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206[] f4008;

    public C1102(DialogInterfaceC0206[] dialogInterfaceC0206Arr) {
        this.f4008 = dialogInterfaceC0206Arr;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f4008[0];
        if (ServiceC3219.f10120) {
            dialogInterfaceC0206.dismiss();
        } else {
            dialogInterfaceC0206.m1447().setText(R.string.MT_Protector);
        }
    }
}
