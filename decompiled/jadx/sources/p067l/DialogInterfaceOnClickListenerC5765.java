package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۗ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5765 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14132;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f14133;

    public /* synthetic */ DialogInterfaceOnClickListenerC5765(int i, Object obj) {
        this.f14132 = i;
        this.f14133 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f14132;
        Object obj = this.f14133;
        switch (i2) {
            case 0:
                int i3 = ActivityC8645.f23212;
                ((ActivityC8645) obj).finish();
                break;
            case 1:
                AbstractActivityC14026.m31837((AbstractActivityC14026) obj);
                break;
            default:
                ((DialogInterfaceOnClickListenerC20813) obj).m47000(false);
                break;
        }
    }
}
