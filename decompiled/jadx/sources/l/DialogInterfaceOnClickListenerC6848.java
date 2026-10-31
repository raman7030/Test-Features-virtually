package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6848 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21190;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21191;

    public /* synthetic */ DialogInterfaceOnClickListenerC6848(int i, Object obj) {
        this.f21190 = i;
        this.f21191 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f21190;
        Object obj = this.f21191;
        switch (i2) {
            case 0:
                int i3 = ActivityC8259.f25414;
                ((ActivityC8259) obj).finish();
                break;
            default:
                C5189.m14946((C5189) obj, i);
                break;
        }
    }
}
