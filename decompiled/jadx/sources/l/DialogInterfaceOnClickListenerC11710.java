package l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۨ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11710 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34923;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34924;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34925;

    public /* synthetic */ DialogInterfaceOnClickListenerC11710(int i, Object obj, Object obj2) {
        this.f34924 = i;
        this.f34925 = obj;
        this.f34923 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f34924;
        Object obj = this.f34923;
        Object obj2 = this.f34925;
        switch (i2) {
            case 0:
                int i3 = ActivityC17169.f52595;
                ((boolean[]) obj2)[0] = true;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ViewOnClickListenerC19987.m46073((C10235) obj2, (CheckBox) obj);
                break;
        }
    }
}
