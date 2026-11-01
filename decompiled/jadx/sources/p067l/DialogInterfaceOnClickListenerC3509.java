package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֨ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3509 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10215 f7106;

    public DialogInterfaceOnClickListenerC3509(C10215 c10215) {
        this.f7106 = c10215;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C10215 c10215 = this.f7106;
        c10215.f28319 = i;
        c10215.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
