package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC0494 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogFragmentC5434 f2123;

    public DialogInterfaceOnClickListenerC0494(DialogFragmentC5434 dialogFragmentC5434) {
        this.f2123 = dialogFragmentC5434;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogFragmentC5434 dialogFragmentC5434 = this.f2123;
        dialogFragmentC5434.f16933 = i;
        dialogFragmentC5434.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
