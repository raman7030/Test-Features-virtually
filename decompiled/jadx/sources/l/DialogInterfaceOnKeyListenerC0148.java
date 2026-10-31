package l;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.֡ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GG */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC0148 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1278;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8817 f1279 = C8817.m22787();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f1280;

    public DialogInterfaceOnKeyListenerC0148(int i, Runnable runnable) {
        this.f1278 = i;
        this.f1280 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (this.f1279.m22791()) {
            C21374.m48457(this.f1278);
            return true;
        }
        C21374.m48465();
        this.f1280.run();
        return true;
    }
}
