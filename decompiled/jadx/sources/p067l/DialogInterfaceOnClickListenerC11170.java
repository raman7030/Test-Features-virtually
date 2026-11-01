package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۢ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11170 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f31007;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f31008;

    public /* synthetic */ DialogInterfaceOnClickListenerC11170(int i, Object obj) {
        this.f31007 = i;
        this.f31008 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f31007) {
            case 0:
                C23631 c23631 = (C23631) this.f31008;
                c23631.m7645(false);
                c23631.f75242.m32520(true);
                c23631.m7638(true);
                break;
            default:
                ((ActivityC17874) this.f31008).m40669(false);
                break;
        }
    }
}
