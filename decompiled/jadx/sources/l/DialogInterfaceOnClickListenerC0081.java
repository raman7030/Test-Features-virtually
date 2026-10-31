package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0081 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1010;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1011;

    public /* synthetic */ DialogInterfaceOnClickListenerC0081(int i, Object obj) {
        this.f1010 = i;
        this.f1011 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f1010;
        Object obj = this.f1011;
        switch (i2) {
            case 0:
                C13136 c13136 = new C13136((Main) obj, R.string.MT_Protector);
                c13136.m31864();
                C1802.f6208.execute(new RunnableC23951(3, c13136));
                break;
            case 1:
                int i3 = ActivityC0814.f2971;
                ((ActivityC0814) obj).finish();
                break;
            default:
                int i4 = ActivityC0477.f2061;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
