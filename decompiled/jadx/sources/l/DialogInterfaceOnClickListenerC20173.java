package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20173 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65301;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65302;

    public /* synthetic */ DialogInterfaceOnClickListenerC20173(int i, Object obj) {
        this.f65301 = i;
        this.f65302 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f65301;
        Object obj = this.f65302;
        switch (i2) {
            case 0:
                DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = (DialogInterfaceOnClickListenerC19407) obj;
                C20549.m47080(dialogInterfaceOnClickListenerC19407.f62792.m39056(), dialogInterfaceOnClickListenerC19407.f62788, dialogInterfaceOnClickListenerC19407.f62796.m12094());
                break;
            case 1:
                int i3 = AbstractActivityC12266.f36524;
                ((AbstractActivityC12266) obj).finish();
                break;
            default:
                ViewOnLayoutChangeListenerC7738.m20745((ViewOnLayoutChangeListenerC7738) obj);
                break;
        }
    }
}
