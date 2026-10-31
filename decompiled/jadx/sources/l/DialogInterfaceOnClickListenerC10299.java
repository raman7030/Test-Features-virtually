package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10299 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31025;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13223 f31026;

    public /* synthetic */ DialogInterfaceOnClickListenerC10299(InterfaceC13223 interfaceC13223, int i) {
        this.f31025 = i;
        this.f31026 = interfaceC13223;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f31025) {
            case 0:
                ActivityC17169.m40324((ActivityC17169) this.f31026);
                break;
            default:
                C20961.m47782(this.f31026, C20961.f67732.f13688);
                break;
        }
    }
}
