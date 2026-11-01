package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22250 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f70340;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f70341;

    public /* synthetic */ DialogInterfaceOnClickListenerC22250(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f70340 = i;
        this.f70341 = abstractActivityC5549;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f70340) {
            case 0:
                ((ViewOnClickListenerC7497) this.f70341).m17285(true);
                break;
            default:
                ActivityC18686.m42547((ActivityC18686) this.f70341);
                break;
        }
    }
}
