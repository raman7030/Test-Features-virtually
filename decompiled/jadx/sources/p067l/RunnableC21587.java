package p067l;

/* JADX INFO: renamed from: l.᩶ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21587 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC12199 f68066;

    public RunnableC21587(DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199) {
        this.f68066 = dialogInterfaceOnCancelListenerC12199;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199 = this.f68066;
        dialogInterfaceOnCancelListenerC12199.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC12199.mDialog);
    }
}
