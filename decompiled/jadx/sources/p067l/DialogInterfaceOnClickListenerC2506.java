package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2506 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f4046;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f4047;

    public /* synthetic */ DialogInterfaceOnClickListenerC2506(int i, Object obj) {
        this.f4046 = i;
        this.f4047 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4046) {
            case 0:
                ((InterfaceC14577) this.f4047).onCanceled();
                break;
            case 1:
                ViewOnClickListenerC4308.m8805((ViewOnClickListenerC4308) this.f4047);
                break;
            default:
                ((C18026) this.f4047).f53836 = i;
                break;
        }
    }
}
