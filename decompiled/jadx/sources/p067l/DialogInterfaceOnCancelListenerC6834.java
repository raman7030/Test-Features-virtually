package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC6834 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC12199 f17760;

    public DialogInterfaceOnCancelListenerC6834(DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199) {
        this.f17760 = dialogInterfaceOnCancelListenerC12199;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199 = this.f17760;
        if (dialogInterfaceOnCancelListenerC12199.mDialog != null) {
            dialogInterfaceOnCancelListenerC12199.onCancel(dialogInterfaceOnCancelListenerC12199.mDialog);
        }
    }
}
