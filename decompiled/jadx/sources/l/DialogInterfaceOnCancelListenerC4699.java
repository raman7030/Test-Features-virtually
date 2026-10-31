package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC4699 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f14930;

    public DialogInterfaceOnCancelListenerC4699(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f14930 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f14930;
        if (dialogInterfaceOnCancelListenerC10344.mDialog != null) {
            dialogInterfaceOnCancelListenerC10344.onCancel(dialogInterfaceOnCancelListenerC10344.mDialog);
        }
    }
}
