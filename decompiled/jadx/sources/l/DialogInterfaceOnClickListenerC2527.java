package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۖ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2527 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8013;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f8014;

    public /* synthetic */ DialogInterfaceOnClickListenerC2527(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f8013 = i;
        this.f8014 = abstractActivityC3346;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f8013) {
            case 0:
                ActivityC10227.m25795((ActivityC10227) this.f8014);
                break;
            default:
                AbstractActivityC12266.m29762((AbstractActivityC12266) this.f8014);
                break;
        }
    }
}
