package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC15250 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩸ */
    public C10748 f43524 = C10748.m24757();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C4125 f43525;

    public DialogInterfaceOnKeyListenerC15250(C4125 c4125) {
        this.f43525 = c4125;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C4125 c4125 = this.f43525;
        if (c4125.f9095) {
            return true;
        }
        if (this.f43524.m24763()) {
            c4125.m8341();
            return true;
        }
        C22682.m50793(R.string.MT_Protector);
        return true;
    }
}
