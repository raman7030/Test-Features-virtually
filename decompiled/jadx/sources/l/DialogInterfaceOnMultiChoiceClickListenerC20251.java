package l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC20251 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogFragmentC4728 f65482;

    public DialogInterfaceOnMultiChoiceClickListenerC20251(DialogFragmentC4728 dialogFragmentC4728) {
        this.f65482 = dialogFragmentC4728;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        DialogFragmentC4728 dialogFragmentC4728 = this.f65482;
        HashSet hashSet = dialogFragmentC4728.f15012;
        if (z) {
            dialogFragmentC4728.f15011 = hashSet.add(dialogFragmentC4728.f15010[i].toString()) | dialogFragmentC4728.f15011;
        } else {
            dialogFragmentC4728.f15011 = hashSet.remove(dialogFragmentC4728.f15010[i].toString()) | dialogFragmentC4728.f15011;
        }
    }
}
