package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8877 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24068;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f24069;

    public /* synthetic */ DialogInterfaceOnClickListenerC8877(int i, Object obj) {
        this.f24068 = i;
        this.f24069 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f24068;
        Object obj = this.f24069;
        switch (i2) {
            case 0:
                int i3 = ActivityC10218.f28324;
                ((ActivityC10218) obj).finish();
                break;
            default:
                C7300.m16856((C7300) obj, i);
                break;
        }
    }
}
