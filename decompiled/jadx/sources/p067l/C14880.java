package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۬ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14880 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC12199 f42435;

    public C14880(DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199) {
        this.f42435 = dialogInterfaceOnCancelListenerC12199;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        if (((InterfaceC24784) obj) != null) {
            DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199 = this.f42435;
            if (dialogInterfaceOnCancelListenerC12199.mShowsDialog) {
                View viewRequireView = dialogInterfaceOnCancelListenerC12199.requireView();
                if (viewRequireView.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC12199.mDialog != null) {
                        if (AbstractC7291.m16763(3)) {
                            C12826.toString(dialogInterfaceOnCancelListenerC12199.mDialog);
                        }
                        dialogInterfaceOnCancelListenerC12199.mDialog.setContentView(viewRequireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
