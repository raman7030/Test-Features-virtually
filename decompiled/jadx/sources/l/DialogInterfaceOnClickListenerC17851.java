package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ᩳۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC17851 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54526;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54527;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54528;

    public /* synthetic */ DialogInterfaceOnClickListenerC17851(int i, Object obj, Object obj2) {
        this.f54527 = i;
        this.f54528 = obj;
        this.f54526 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f54527) {
            case 0:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f54528;
                try {
                    abstractActivityC3346.startActivity((Intent) this.f54526);
                } catch (Exception e) {
                    abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            default:
                ((PluginDialog.OnClickListener) this.f54526).onClick(((C21838) this.f54528).f69964, i);
                break;
        }
    }
}
