package p067l;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11487 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32062;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32063;

    public /* synthetic */ DialogInterfaceOnClickListenerC11487(int i, Object obj) {
        this.f32062 = i;
        this.f32063 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f32062;
        Object obj = this.f32063;
        switch (i2) {
            case 0:
                int i3 = ActivityC18686.f55776;
                ((ActivityC18686) obj).finish();
                break;
            case 1:
                ((AtomicInteger) obj).set(i);
                break;
            case 2:
                C7918.m18278((C7918) obj);
                break;
            default:
                ViewOnClickListenerC22924.m51217((ViewOnClickListenerC22924) obj);
                break;
        }
    }
}
