package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20883 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67572;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67573;

    public /* synthetic */ DialogInterfaceOnClickListenerC20883(int i, Object obj) {
        this.f67572 = i;
        this.f67573 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f67572) {
            case 0:
                ActivityC17169.m40307((ActivityC17169) this.f67573);
                break;
            case 1:
                ((ActivityC16315) this.f67573).m38454(true);
                break;
            case 2:
                C3822.m11569((C3822) this.f67573);
                break;
            default:
                C5839.m16350((C5839) this.f67573, i);
                break;
        }
    }
}
