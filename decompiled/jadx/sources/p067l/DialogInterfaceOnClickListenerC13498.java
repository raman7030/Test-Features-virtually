package p067l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۨ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13498 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f37923;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37924;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f37925;

    public /* synthetic */ DialogInterfaceOnClickListenerC13498(int i, Object obj, Object obj2) {
        this.f37924 = i;
        this.f37925 = obj;
        this.f37923 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f37924;
        Object obj = this.f37923;
        Object obj2 = this.f37925;
        switch (i2) {
            case 0:
                int i3 = ActivityC18686.f55776;
                ((boolean[]) obj2)[0] = true;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ViewOnClickListenerC21364.m48387((C12096) obj2, (CheckBox) obj);
                break;
        }
    }
}
