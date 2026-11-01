package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ᩳۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19367 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f57818;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57819;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f57820;

    public /* synthetic */ DialogInterfaceOnClickListenerC19367(int i, Object obj, Object obj2) {
        this.f57819 = i;
        this.f57820 = obj;
        this.f57818 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f57819) {
            case 0:
                C16013.m36392((C16013) this.f57820, (AbstractActivityC5549) this.f57818);
                break;
            default:
                ((PluginDialog.OnClickListener) this.f57818).onClick(((C23124) this.f57820).f72673, i);
                break;
        }
    }
}
