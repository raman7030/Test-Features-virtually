package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC3259 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f10226;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f10227 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13136 f10228;

    public DialogInterfaceOnKeyListenerC3259(C13136 c13136, Runnable runnable) {
        this.f10228 = c13136;
        this.f10226 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C13136 c13136 = this.f10228;
        if (!c13136.f39293) {
            if (System.currentTimeMillis() - this.f10227 < 2000) {
                c13136.f39293 = true;
                Runnable runnable = this.f10226;
                if (runnable != null) {
                    runnable.run();
                    return true;
                }
            } else {
                C21374.m48457(R.string.MT_Protector);
                this.f10227 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
