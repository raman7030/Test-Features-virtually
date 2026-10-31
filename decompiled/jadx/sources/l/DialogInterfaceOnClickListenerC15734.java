package l;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ܺۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15734 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f48533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48534;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48535;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f48536;

    public /* synthetic */ DialogInterfaceOnClickListenerC15734(AbstractActivityC3346 abstractActivityC3346, int i, CheckBox checkBox, int i2) {
        this.f48535 = i2;
        this.f48536 = abstractActivityC3346;
        this.f48534 = i;
        this.f48533 = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f48535) {
            case 0:
                ActivityC16315.m38429((ActivityC16315) this.f48536, this.f48534, this.f48533);
                break;
            default:
                ActivityC17169.m40321((ActivityC17169) this.f48536, this.f48534, this.f48533);
                break;
        }
    }
}
