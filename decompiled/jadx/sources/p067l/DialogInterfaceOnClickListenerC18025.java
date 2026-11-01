package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18025 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f53812;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53813;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f53814;

    public /* synthetic */ DialogInterfaceOnClickListenerC18025(int i, Object obj, Object obj2) {
        this.f53813 = i;
        this.f53814 = obj;
        this.f53812 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f53813) {
            case 0:
                C16013.m36393((C16013) this.f53814, (AbstractActivityC5549) this.f53812);
                break;
            case 1:
                ApplicationC21448.f67649.edit().putString("stid", ((InterfaceC18365) ((List) this.f53814).get(((int[]) this.f53812)[0])).mo41840()).apply();
                dialogInterface.dismiss();
                break;
            default:
                ((PluginDialog.OnClickListener) this.f53812).onClick(((C23124) this.f53814).f72673, i);
                break;
        }
    }
}
