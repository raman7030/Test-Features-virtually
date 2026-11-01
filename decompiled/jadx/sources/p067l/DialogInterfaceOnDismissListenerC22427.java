package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC22427 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f70765;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f70766;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f70767;

    public /* synthetic */ DialogInterfaceOnDismissListenerC22427(int i, Object obj, Object obj2) {
        this.f70766 = i;
        this.f70767 = obj;
        this.f70765 = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f70766) {
            case 0:
                ((C17969) this.f70767).f53663 = ((C11400) this.f70765).getFirstVisiblePosition();
                break;
            default:
                C12902.m29562((C12902) this.f70767, (DialogInterfaceC2564) this.f70765);
                break;
        }
    }
}
