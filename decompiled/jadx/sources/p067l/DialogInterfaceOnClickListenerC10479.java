package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10479 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28980;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f28981;

    public /* synthetic */ DialogInterfaceOnClickListenerC10479(int i, Object obj) {
        this.f28980 = i;
        this.f28981 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28980) {
            case 0:
                AbstractActivityC3102.m5264((AbstractActivityC3102) this.f28981);
                break;
            default:
                ((int[]) this.f28981)[0] = i;
                break;
        }
    }
}
