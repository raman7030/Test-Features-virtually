package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ᩳۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19334 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f57724;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57725;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f57726;

    public /* synthetic */ DialogInterfaceOnClickListenerC19334(int i, Object obj, Object obj2) {
        this.f57725 = i;
        this.f57726 = obj;
        this.f57724 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f57725) {
            case 0:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f57726;
                try {
                    abstractActivityC5549.startActivity((Intent) this.f57724);
                } catch (Exception e) {
                    abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            default:
                ((PluginDialog.OnClickListener) this.f57724).onClick(((C23124) this.f57726).f72673, i);
                break;
        }
    }
}
