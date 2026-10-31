package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܶ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14904 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f45469;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45470;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f45471;

    public /* synthetic */ DialogInterfaceOnClickListenerC14904(C22372 c22372, ActivityC16315 activityC16315, int i) {
        this.f45470 = i;
        this.f45471 = c22372;
        this.f45469 = activityC16315;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f45470) {
            case 0:
                this.f45471.m50182(this.f45469);
                break;
            default:
                this.f45471.m50182(this.f45469);
                break;
        }
    }
}
