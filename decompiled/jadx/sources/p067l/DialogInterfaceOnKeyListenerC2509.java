package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.֡ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GG */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC2509 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f4053;

    /* JADX INFO: renamed from: ᩸ */
    public C10748 f4054 = C10748.m24757();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Runnable f4055;

    public DialogInterfaceOnKeyListenerC2509(int i, Runnable runnable) {
        this.f4053 = i;
        this.f4055 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (this.f4054.m24761()) {
            C22682.m50793(this.f4053);
            return true;
        }
        C22682.m50801();
        this.f4055.run();
        return true;
    }
}
