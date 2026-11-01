package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩵ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20828 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65440;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f65441;

    public /* synthetic */ DialogInterfaceOnClickListenerC20828(int i, Object obj) {
        this.f65440 = i;
        this.f65441 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f65440) {
            case 0:
                C5946 c5946 = (C5946) this.f65441;
                c5946.m13349(3);
                c5946.m13348();
                break;
            case 1:
                AbstractViewOnClickListenerC7339.m16932((AbstractViewOnClickListenerC7339) this.f65441, i);
                break;
            default:
                ((Runnable) this.f65441).run();
                break;
        }
    }
}
