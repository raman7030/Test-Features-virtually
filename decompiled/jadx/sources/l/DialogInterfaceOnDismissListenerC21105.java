package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC21105 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68084;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68085;

    public /* synthetic */ DialogInterfaceOnDismissListenerC21105(int i, Object obj, Object obj2) {
        this.f68084 = i;
        this.f68085 = obj;
        this.f68083 = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f68084) {
            case 0:
                ((C16415) this.f68085).f50491 = ((C9503) this.f68083).getFirstVisiblePosition();
                break;
            default:
                C11083.m27500((C11083) this.f68085, (DialogInterfaceC0206) this.f68083);
                break;
        }
    }
}
