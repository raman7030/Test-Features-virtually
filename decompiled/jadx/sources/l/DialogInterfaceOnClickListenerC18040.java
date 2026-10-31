package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩳۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18040 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56233;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56234;

    public /* synthetic */ DialogInterfaceOnClickListenerC18040(int i, Object obj) {
        this.f56233 = i;
        this.f56234 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f56233) {
            case 0:
                ((ActivityC17169) this.f56234).m40351();
                break;
            case 1:
                ((RunnableC21561) this.f56234).run();
                break;
            default:
                ((Runnable) this.f56234).run();
                break;
        }
    }
}
