package l;

import android.view.View;

/* JADX INFO: renamed from: l.۬ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13165 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f39373;

    public C13165(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f39373 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        if (((InterfaceC23586) obj) != null) {
            DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f39373;
            if (dialogInterfaceOnCancelListenerC10344.mShowsDialog) {
                View viewRequireView = dialogInterfaceOnCancelListenerC10344.requireView();
                if (viewRequireView.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC10344.mDialog != null) {
                        if (AbstractC5180.m14853(3)) {
                            C11003.toString(dialogInterfaceOnCancelListenerC10344.mDialog);
                        }
                        dialogInterfaceOnCancelListenerC10344.mDialog.setContentView(viewRequireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
