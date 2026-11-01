package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC14106 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩸ */
    public C10748 f40014 = C10748.m24757();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C24164 f40015;

    public DialogInterfaceOnKeyListenerC14106(C24164 c24164) {
        this.f40015 = c24164;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C24164 c24164 = this.f40015;
        if (c24164.f76633) {
            return true;
        }
        if (this.f40014.m24763()) {
            c24164.m53435();
            return true;
        }
        C22682.m50793(R.string.MT_Protector);
        return true;
    }
}
