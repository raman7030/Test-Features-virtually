package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final class C6060 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f15216;

    public C6060(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813) {
        this.f15216 = new WeakReference(dialogInterfaceOnClickListenerC20813);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = (DialogInterfaceOnClickListenerC20813) this.f15216.get();
        if (dialogInterfaceOnClickListenerC20813 == null || !dialogInterfaceOnClickListenerC20813.f65399.m3855()) {
            C4491.m9493(C7050.m16232()).m9495(this);
            return;
        }
        final String stringExtra = intent.getStringExtra("pkgName");
        if (C12826.equals(stringExtra, dialogInterfaceOnClickListenerC20813.f65406.m14014())) {
            DialogInterfaceOnClickListenerC20813.f65395 = false;
            C20671 c20671BuildDialog = dialogInterfaceOnClickListenerC20813.f65402.m41282().buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20814 = dialogInterfaceOnClickListenerC20813;
                    dialogInterfaceOnClickListenerC20814.f65404 = true;
                    dialogInterfaceOnClickListenerC20814.f65402.m41282().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", stringExtra, null)));
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterfaceOnClickListenerC20813.m47000(false);
                }
            });
            C10884.m25069(c20671BuildDialog.m46732());
        }
    }
}
