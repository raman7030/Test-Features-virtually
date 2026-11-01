package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܶ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC16533 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC17874 f48584;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f48585;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23631 f48586;

    public /* synthetic */ DialogInterfaceOnClickListenerC16533(C23631 c23631, ActivityC17874 activityC17874, int i) {
        this.f48585 = i;
        this.f48586 = c23631;
        this.f48584 = activityC17874;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f48585) {
            case 0:
                this.f48586.m52522(this.f48584);
                break;
            default:
                this.f48586.m52522(this.f48584);
                break;
        }
    }
}
