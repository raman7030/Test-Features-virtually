package l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩴܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC18839 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59424;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59425;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59426;

    public /* synthetic */ DialogInterfaceOnCancelListenerC18839(int i, Object obj, Object obj2) {
        this.f59425 = i;
        this.f59426 = obj;
        this.f59424 = obj2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f59425) {
            case 0:
                AbstractC8255.m21847((AbstractC8255) this.f59426, (AtomicBoolean) this.f59424);
                break;
            default:
                C21769.m49096((Context) this.f59424, (InterfaceC15417) this.f59426);
                break;
        }
    }
}
