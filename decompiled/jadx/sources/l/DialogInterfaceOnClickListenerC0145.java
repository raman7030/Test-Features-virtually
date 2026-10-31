package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0145 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1271;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1272;

    public /* synthetic */ DialogInterfaceOnClickListenerC0145(int i, Object obj) {
        this.f1271 = i;
        this.f1272 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f1271) {
            case 0:
                ((InterfaceC12846) this.f1272).onCanceled();
                break;
            case 1:
                ViewOnClickListenerC2040.m6679((ViewOnClickListenerC2040) this.f1272);
                break;
            default:
                ((C16475) this.f1272).f50659 = i;
                break;
        }
    }
}
