package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8534 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26065;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26066;

    public /* synthetic */ DialogInterfaceOnClickListenerC8534(int i, Object obj) {
        this.f26065 = i;
        this.f26066 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f26065) {
            case 0:
                AbstractActivityC0772.m2935((AbstractActivityC0772) this.f26066);
                break;
            default:
                ((int[]) this.f26066)[0] = i;
                break;
        }
    }
}
