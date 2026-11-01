package p067l;

import android.content.DialogInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.᩺۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC24226 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f76784;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f76785;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f76786;

    public /* synthetic */ DialogInterfaceOnClickListenerC24226(int i, Object obj, Object obj2) {
        this.f76785 = i;
        this.f76786 = obj;
        this.f76784 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f76785;
        Object obj = this.f76784;
        Object obj2 = this.f76786;
        switch (i2) {
            case 0:
                int i3 = ActivityC18686.f55776;
                ((boolean[]) obj2)[0] = false;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ViewOnClickListenerC9523.m22177((ViewOnClickListenerC9523) obj2, (C18498) obj);
                break;
        }
    }
}
