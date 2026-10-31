package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۘۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3785 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11958;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11959;

    public /* synthetic */ DialogInterfaceOnClickListenerC3785(int i, Object obj, Object obj2) {
        this.f11958 = i;
        this.f11959 = obj;
        this.f11957 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f11958) {
            case 0:
                C18602 c18602 = (C18602) this.f11959;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f11957;
                c18602.getClass();
                onClickListener.onClick(c18602, i);
                break;
            default:
                ViewOnClickListenerC21628.m48875((ViewOnClickListenerC21628) this.f11959, (C16971) this.f11957);
                break;
        }
    }
}
