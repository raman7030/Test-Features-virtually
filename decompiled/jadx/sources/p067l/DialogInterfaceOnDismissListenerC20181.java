package p067l;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩴۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC20181 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62450;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Context f62451;

    public /* synthetic */ DialogInterfaceOnDismissListenerC20181(Context context, int i) {
        this.f62450 = i;
        this.f62451 = context;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f62450;
        Context context = this.f62451;
        switch (i) {
            case 0:
                int i2 = ServiceC5428.f12927;
                ((AbstractActivityC5549) context).finish();
                break;
            default:
                C23058.m51452(context);
                break;
        }
    }
}
