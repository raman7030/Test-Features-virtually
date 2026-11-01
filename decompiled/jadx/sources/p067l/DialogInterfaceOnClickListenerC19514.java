package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩳۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19514 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f59436;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f59437;

    public /* synthetic */ DialogInterfaceOnClickListenerC19514(int i, Object obj) {
        this.f59436 = i;
        this.f59437 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f59436) {
            case 0:
                ((ActivityC18686) this.f59437).m42596();
                break;
            case 1:
                ((RunnableC22860) this.f59437).run();
                break;
            default:
                ((Runnable) this.f59437).run();
                break;
        }
    }
}
