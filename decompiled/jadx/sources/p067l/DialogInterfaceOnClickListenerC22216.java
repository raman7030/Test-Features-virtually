package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22216 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f70258;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f70259;

    public /* synthetic */ DialogInterfaceOnClickListenerC22216(int i, Object obj) {
        this.f70258 = i;
        this.f70259 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f70258) {
            case 0:
                ActivityC18686.m42552((ActivityC18686) this.f70259);
                break;
            case 1:
                ((ActivityC17874) this.f70259).m40669(true);
                break;
            case 2:
                C6001.m13505((C6001) this.f70259);
                break;
            default:
                C7918.m18275((C7918) this.f70259, i);
                break;
        }
    }
}
