package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8824 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23952;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f23953;

    public /* synthetic */ DialogInterfaceOnClickListenerC8824(int i, Object obj) {
        this.f23952 = i;
        this.f23953 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f23952) {
            case 0:
                ((C5471) this.f23953).m12025((C20115) null, (DialogInterfaceC2564) null);
                break;
            case 1:
                C11981.m27414((C11981) this.f23953);
                break;
            default:
                ActivityC12426.m28629((ActivityC12426) this.f23953);
                break;
        }
    }
}
