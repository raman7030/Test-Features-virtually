package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۘۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5966 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f14763;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14764;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f14765;

    public /* synthetic */ DialogInterfaceOnClickListenerC5966(int i, Object obj, Object obj2) {
        this.f14764 = i;
        this.f14765 = obj;
        this.f14763 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f14764) {
            case 0:
                C20048 c20048 = (C20048) this.f14765;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f14763;
                c20048.getClass();
                onClickListener.onClick(c20048, i);
                break;
            default:
                ViewOnClickListenerC22924.m51223((ViewOnClickListenerC22924) this.f14765, (C18498) this.f14763);
                break;
        }
    }
}
