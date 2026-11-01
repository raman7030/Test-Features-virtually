package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11089 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30729;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f30730;

    public /* synthetic */ DialogInterfaceOnClickListenerC11089(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f30729 = i;
        this.f30730 = abstractActivityC5549;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f30729;
        AbstractActivityC5549 abstractActivityC5549 = this.f30730;
        switch (i2) {
            case 0:
                boolean z = ActivityC22429.f70770;
                ((ActivityC22429) abstractActivityC5549).finish();
                break;
            default:
                ActivityC14326.m32915((ActivityC14326) abstractActivityC5549);
                break;
        }
    }
}
