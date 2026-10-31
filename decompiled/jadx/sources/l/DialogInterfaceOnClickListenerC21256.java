package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩸֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21256 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f68578;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68579;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f68580;

    public /* synthetic */ DialogInterfaceOnClickListenerC21256(C22372 c22372, ActivityC16315 activityC16315, int i) {
        this.f68579 = i;
        this.f68580 = c22372;
        this.f68578 = activityC16315;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C22372 c22372;
        switch (this.f68579) {
            case 0:
                c22372 = this.f68580;
                c22372.getClass();
                break;
            default:
                c22372 = this.f68580;
                c22372.getClass();
                break;
        }
        this.f68578.m38448(c22372);
    }
}
