package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֨۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3428 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f6839;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f6840;

    public /* synthetic */ DialogInterfaceOnClickListenerC3428(int i, Object obj) {
        this.f6839 = i;
        this.f6840 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f6839) {
            case 0:
                ActivityC12088.m27848((ActivityC12088) this.f6840);
                break;
            default:
                ((boolean[]) this.f6840)[0] = true;
                break;
        }
    }
}
