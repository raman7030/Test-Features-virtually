package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20919 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67655;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f67656;

    public /* synthetic */ DialogInterfaceOnClickListenerC20919(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f67655 = i;
        this.f67656 = abstractActivityC3346;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f67655) {
            case 0:
                ((ViewOnClickListenerC5396) this.f67656).m15374(true);
                break;
            default:
                ActivityC17169.m40302((ActivityC17169) this.f67656);
                break;
        }
    }
}
