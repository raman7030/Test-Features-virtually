package l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۘܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4022 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12766;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12767;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12768;

    public /* synthetic */ DialogInterfaceOnClickListenerC4022(int i, Object obj, Object obj2) {
        this.f12767 = i;
        this.f12768 = obj;
        this.f12766 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f12767) {
            case 0:
                AbstractC8255.m21843((AbstractC8255) this.f12768, (AtomicBoolean) this.f12766);
                break;
            default:
                C21769.m49094((Context) this.f12766, (InterfaceC15417) this.f12768);
                break;
        }
    }
}
