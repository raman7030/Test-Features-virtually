package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2445 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f3784;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f3785;

    public /* synthetic */ DialogInterfaceOnClickListenerC2445(int i, Object obj) {
        this.f3784 = i;
        this.f3785 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f3784;
        Object obj = this.f3785;
        switch (i2) {
            case 0:
                C14853 c14853 = new C14853((Main) obj, R.string.MT_Protector);
                c14853.m33956();
                C4081.f8987.execute(new RunnableC25132(3, c14853));
                break;
            case 1:
                int i3 = ActivityC3142.f5742;
                ((ActivityC3142) obj).finish();
                break;
            default:
                int i4 = ActivityC2822.f4836;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
