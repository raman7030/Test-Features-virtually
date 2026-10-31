package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC16474 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50636;

    public /* synthetic */ DialogInterfaceOnClickListenerC16474(int i, Object obj, Object obj2) {
        this.f50635 = i;
        this.f50636 = obj;
        this.f50634 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f50635) {
            case 0:
                C14357.m34260((C14357) this.f50636, (AbstractActivityC3346) this.f50634);
                break;
            case 1:
                ApplicationC20075.f65008.edit().putString("stid", ((InterfaceC16831) ((List) this.f50636).get(((int[]) this.f50634)[0])).mo39604()).apply();
                dialogInterface.dismiss();
                break;
            default:
                ((PluginDialog.OnClickListener) this.f50634).onClick(((C21838) this.f50636).f69964, i);
                break;
        }
    }
}
