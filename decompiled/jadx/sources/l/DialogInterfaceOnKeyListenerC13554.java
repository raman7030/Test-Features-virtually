package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC13554 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8817 f40455 = C8817.m22787();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1848 f40456;

    public DialogInterfaceOnKeyListenerC13554(C1848 c1848) {
        this.f40456 = c1848;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C1848 c1848 = this.f40456;
        if (c1848.f6316) {
            return true;
        }
        if (this.f40455.m22793()) {
            c1848.m6143();
            return true;
        }
        C21374.m48457(R.string.MT_Protector);
        return true;
    }
}
