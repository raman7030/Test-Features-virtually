package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܺ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC17183 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f51155;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f51156;

    public /* synthetic */ DialogInterfaceOnClickListenerC17183(int i, Object obj) {
        this.f51155 = i;
        this.f51156 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f51155;
        Object obj = this.f51156;
        switch (i2) {
            case 0:
                int i3 = AbstractActivityC3102.f5632;
                ((AbstractActivityC3102) obj).finish();
                break;
            case 1:
                ((C23950) obj).f76087 = i;
                break;
            default:
                ((ActivityC17874) obj).m40664(false);
                break;
        }
    }
}
