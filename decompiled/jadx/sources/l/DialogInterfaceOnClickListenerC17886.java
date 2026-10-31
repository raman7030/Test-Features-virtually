package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ᩳۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC17886 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54621;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54622;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54623;

    public /* synthetic */ DialogInterfaceOnClickListenerC17886(int i, Object obj, Object obj2) {
        this.f54622 = i;
        this.f54623 = obj;
        this.f54621 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f54622) {
            case 0:
                C14357.m34259((C14357) this.f54623, (AbstractActivityC3346) this.f54621);
                break;
            default:
                ((PluginDialog.OnClickListener) this.f54621).onClick(((C21838) this.f54623).f69964, i);
                break;
        }
    }
}
