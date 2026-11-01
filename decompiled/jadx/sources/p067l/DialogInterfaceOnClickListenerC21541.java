package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21541 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67943;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f67944;

    public /* synthetic */ DialogInterfaceOnClickListenerC21541(int i, Object obj) {
        this.f67943 = i;
        this.f67944 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f67943;
        Object obj = this.f67944;
        switch (i2) {
            case 0:
                DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = (DialogInterfaceOnClickListenerC20813) obj;
                C21898.m49403(dialogInterfaceOnClickListenerC20813.f65402.m41282(), dialogInterfaceOnClickListenerC20813.f65398, dialogInterfaceOnClickListenerC20813.f65406.m14014());
                break;
            case 1:
                int i3 = AbstractActivityC14026.f39540;
                ((AbstractActivityC14026) obj).finish();
                break;
            default:
                ViewOnLayoutChangeListenerC9723.m22725((ViewOnLayoutChangeListenerC9723) obj);
                break;
        }
    }
}
