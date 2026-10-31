package l;

/* JADX INFO: renamed from: l.᩶ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20222 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f65418;

    public RunnableC20222(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f65418 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f65418;
        dialogInterfaceOnCancelListenerC10344.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC10344.mDialog);
    }
}
