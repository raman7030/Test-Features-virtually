package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12157 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f33988;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC14936 f33989;

    public /* synthetic */ DialogInterfaceOnClickListenerC12157(InterfaceC14936 interfaceC14936, int i) {
        this.f33988 = i;
        this.f33989 = interfaceC14936;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33988) {
            case 0:
                ActivityC18686.m42569((ActivityC18686) this.f33989);
                break;
            default:
                C22290.m50112(this.f33989, C22290.f70417.f16501);
                break;
        }
    }
}
