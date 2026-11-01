package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۗܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC5493 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC12199 f13137;

    public DialogInterfaceOnDismissListenerC5493(DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199) {
        this.f13137 = dialogInterfaceOnCancelListenerC12199;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199 = this.f13137;
        if (dialogInterfaceOnCancelListenerC12199.mDialog != null) {
            dialogInterfaceOnCancelListenerC12199.onDismiss(dialogInterfaceOnCancelListenerC12199.mDialog);
        }
    }
}
