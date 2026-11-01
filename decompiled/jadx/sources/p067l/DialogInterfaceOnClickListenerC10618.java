package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10618 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29385;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f29386;

    public /* synthetic */ DialogInterfaceOnClickListenerC10618(int i, Object obj) {
        this.f29385 = i;
        this.f29386 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29385) {
            case 0:
                ActivityC17874.m40642((ActivityC17874) this.f29386);
                break;
            default:
                ((C23631) this.f29386).m52558(-1, false, true);
                break;
        }
    }
}
