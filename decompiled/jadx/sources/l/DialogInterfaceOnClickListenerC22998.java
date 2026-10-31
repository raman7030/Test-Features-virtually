package l;

import android.content.DialogInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.᩺۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22998 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74045;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74046;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74047;

    public /* synthetic */ DialogInterfaceOnClickListenerC22998(int i, Object obj, Object obj2) {
        this.f74046 = i;
        this.f74047 = obj;
        this.f74045 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f74046;
        Object obj = this.f74045;
        Object obj2 = this.f74047;
        switch (i2) {
            case 0:
                int i3 = ActivityC17169.f52595;
                ((boolean[]) obj2)[0] = false;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ViewOnClickListenerC7528.m20201((ViewOnClickListenerC7528) obj2, (C16971) obj);
                break;
        }
    }
}
