package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.᩵ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnKeyListenerC20616 implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        dialogInterface.cancel();
        return true;
    }
}
