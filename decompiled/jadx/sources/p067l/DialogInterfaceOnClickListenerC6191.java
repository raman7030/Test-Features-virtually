package p067l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۘܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6191 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f15581;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15582;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15583;

    public /* synthetic */ DialogInterfaceOnClickListenerC6191(int i, Object obj, Object obj2) {
        this.f15582 = i;
        this.f15583 = obj;
        this.f15581 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f15582) {
            case 0:
                AbstractC10214.m23813((AbstractC10214) this.f15583, (AtomicBoolean) this.f15581);
                break;
            default:
                C23058.m51444((Context) this.f15581, (InterfaceC17021) this.f15583);
                break;
        }
    }
}
