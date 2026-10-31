package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3884 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f12409;

    public C3884(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407) {
        this.f12409 = new WeakReference(dialogInterfaceOnClickListenerC19407);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = (DialogInterfaceOnClickListenerC19407) this.f12409.get();
        if (dialogInterfaceOnClickListenerC19407 == null || !dialogInterfaceOnClickListenerC19407.f62789.m1442()) {
            C2234.m7411(C4925.m14335()).m7413(this);
            return;
        }
        final String stringExtra = intent.getStringExtra("pkgName");
        if (C11003.equals(stringExtra, dialogInterfaceOnClickListenerC19407.f62796.m12094())) {
            DialogInterfaceOnClickListenerC19407.f62785 = false;
            C19258 c19258BuildDialog = dialogInterfaceOnClickListenerC19407.f62792.m39056().buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19408 = dialogInterfaceOnClickListenerC19407;
                    dialogInterfaceOnClickListenerC19408.f62794 = true;
                    dialogInterfaceOnClickListenerC19408.f62792.m39056().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", stringExtra, null)));
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterfaceOnClickListenerC19407.m44706(false);
                }
            });
            C8960.m23095(c19258BuildDialog.m44438());
        }
    }
}
