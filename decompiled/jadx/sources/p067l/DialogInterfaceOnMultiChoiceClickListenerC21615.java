package p067l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC21615 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogFragmentC6862 f68131;

    public DialogInterfaceOnMultiChoiceClickListenerC21615(DialogFragmentC6862 dialogFragmentC6862) {
        this.f68131 = dialogFragmentC6862;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        DialogFragmentC6862 dialogFragmentC6862 = this.f68131;
        HashSet hashSet = dialogFragmentC6862.f17843;
        if (z) {
            dialogFragmentC6862.f17842 = hashSet.add(dialogFragmentC6862.f17841[i].toString()) | dialogFragmentC6862.f17842;
        } else {
            dialogFragmentC6862.f17842 = hashSet.remove(dialogFragmentC6862.f17841[i].toString()) | dialogFragmentC6862.f17842;
        }
    }
}
