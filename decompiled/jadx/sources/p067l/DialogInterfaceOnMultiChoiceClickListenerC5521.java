package p067l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC5521 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14908 f13197;

    public DialogInterfaceOnMultiChoiceClickListenerC5521(C14908 c14908) {
        this.f13197 = c14908;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C14908 c14908 = this.f13197;
        HashSet hashSet = c14908.f42520;
        if (z) {
            c14908.f42519 = hashSet.add(c14908.f42518[i].toString()) | c14908.f42519;
        } else {
            c14908.f42519 = hashSet.remove(c14908.f42518[i].toString()) | c14908.f42519;
        }
    }
}
