package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9175 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27789;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f27790;

    public /* synthetic */ DialogInterfaceOnClickListenerC9175(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f27789 = i;
        this.f27790 = abstractActivityC3346;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f27789;
        AbstractActivityC3346 abstractActivityC3346 = this.f27790;
        switch (i2) {
            case 0:
                boolean z = ActivityC21107.f68088;
                ((ActivityC21107) abstractActivityC3346).finish();
                break;
            default:
                ActivityC12581.m30838((ActivityC12581) abstractActivityC3346);
                break;
        }
    }
}
