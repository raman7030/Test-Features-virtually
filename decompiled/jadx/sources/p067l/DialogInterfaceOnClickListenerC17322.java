package p067l;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ܺۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC17322 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ CheckBox f51673;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f51674;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f51675;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f51676;

    public /* synthetic */ DialogInterfaceOnClickListenerC17322(AbstractActivityC5549 abstractActivityC5549, int i, CheckBox checkBox, int i2) {
        this.f51675 = i2;
        this.f51676 = abstractActivityC5549;
        this.f51674 = i;
        this.f51673 = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f51675) {
            case 0:
                ActivityC17874.m40644((ActivityC17874) this.f51676, this.f51674, this.f51673);
                break;
            default:
                ActivityC18686.m42566((ActivityC18686) this.f51676, this.f51674, this.f51673);
                break;
        }
    }
}
