package p067l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩴܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC20273 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f62652;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62653;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f62654;

    public /* synthetic */ DialogInterfaceOnCancelListenerC20273(int i, Object obj, Object obj2) {
        this.f62653 = i;
        this.f62654 = obj;
        this.f62652 = obj2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f62653) {
            case 0:
                AbstractC10214.m23817((AbstractC10214) this.f62654, (AtomicBoolean) this.f62652);
                break;
            default:
                C23058.m51446((Context) this.f62652, (InterfaceC17021) this.f62654);
                break;
        }
    }
}
