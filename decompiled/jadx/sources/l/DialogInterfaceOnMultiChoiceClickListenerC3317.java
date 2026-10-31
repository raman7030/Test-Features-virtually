package l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC3317 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13194 f10388;

    public DialogInterfaceOnMultiChoiceClickListenerC3317(C13194 c13194) {
        this.f10388 = c13194;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C13194 c13194 = this.f10388;
        HashSet hashSet = c13194.f39456;
        if (z) {
            c13194.f39455 = hashSet.add(c13194.f39454[i].toString()) | c13194.f39455;
        } else {
            c13194.f39455 = hashSet.remove(c13194.f39454[i].toString()) | c13194.f39455;
        }
    }
}
