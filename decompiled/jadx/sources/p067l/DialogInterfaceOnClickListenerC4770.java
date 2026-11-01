package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۖ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4770 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10804;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f10805;

    public /* synthetic */ DialogInterfaceOnClickListenerC4770(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f10804 = i;
        this.f10805 = abstractActivityC5549;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10804) {
            case 0:
                ActivityC12088.m27817((ActivityC12088) this.f10805);
                break;
            default:
                AbstractActivityC14026.m31824((AbstractActivityC14026) this.f10805);
                break;
        }
    }
}
