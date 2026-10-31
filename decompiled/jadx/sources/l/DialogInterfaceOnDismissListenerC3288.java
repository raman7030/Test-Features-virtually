package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۗܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC3288 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f10329;

    public DialogInterfaceOnDismissListenerC3288(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f10329 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f10329;
        if (dialogInterfaceOnCancelListenerC10344.mDialog != null) {
            dialogInterfaceOnCancelListenerC10344.onDismiss(dialogInterfaceOnCancelListenerC10344.mDialog);
        }
    }
}
