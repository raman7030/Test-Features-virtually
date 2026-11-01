package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2838 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogFragmentC7533 f4895;

    public DialogInterfaceOnClickListenerC2838(DialogFragmentC7533 dialogFragmentC7533) {
        this.f4895 = dialogFragmentC7533;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogFragmentC7533 dialogFragmentC7533 = this.f4895;
        dialogFragmentC7533.f19773 = i;
        dialogFragmentC7533.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
