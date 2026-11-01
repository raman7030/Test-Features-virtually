package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC5466 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Runnable f13034;

    /* JADX INFO: renamed from: ᩸ */
    public long f13035 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14853 f13036;

    public DialogInterfaceOnKeyListenerC5466(C14853 c14853, Runnable runnable) {
        this.f13036 = c14853;
        this.f13034 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C14853 c14853 = this.f13036;
        if (!c14853.f42348) {
            if (System.currentTimeMillis() - this.f13035 < 2000) {
                c14853.f42348 = true;
                Runnable runnable = this.f13034;
                if (runnable != null) {
                    runnable.run();
                    return true;
                }
            } else {
                C22682.m50793(R.string.MT_Protector);
                this.f13035 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
