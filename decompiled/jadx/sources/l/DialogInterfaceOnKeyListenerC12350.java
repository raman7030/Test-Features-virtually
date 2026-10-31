package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC12350 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8817 f37002 = C8817.m22787();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f37003;

    public DialogInterfaceOnKeyListenerC12350(C22933 c22933) {
        this.f37003 = c22933;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C22933 c22933 = this.f37003;
        if (c22933.f73904) {
            return true;
        }
        if (this.f37002.m22793()) {
            c22933.m51044();
            return true;
        }
        C21374.m48457(R.string.MT_Protector);
        return true;
    }
}
