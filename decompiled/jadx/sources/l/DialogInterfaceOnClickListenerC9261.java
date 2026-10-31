package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۢ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9261 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28062;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28063;

    public /* synthetic */ DialogInterfaceOnClickListenerC9261(int i, Object obj) {
        this.f28062 = i;
        this.f28063 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28062) {
            case 0:
                C22372 c22372 = (C22372) this.f28063;
                c22372.m5416(false);
                c22372.f72517.m30456(true);
                c22372.m5409(true);
                break;
            default:
                ((ActivityC16315) this.f28063).m38454(false);
                break;
        }
    }
}
