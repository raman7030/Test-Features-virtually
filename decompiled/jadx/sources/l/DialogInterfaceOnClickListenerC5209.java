package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5209 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16316;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16317;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16318;

    public /* synthetic */ DialogInterfaceOnClickListenerC5209(int i, Object obj, Object obj2) {
        this.f16317 = i;
        this.f16318 = obj;
        this.f16316 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f16317) {
            case 0:
                List list = (List) this.f16318;
                C2450 c2450 = (C2450) this.f16316;
                dialogInterface.dismiss();
                ((AbstractC1661) list.get(i)).mo1455(c2450);
                break;
            default:
                C18602 c18602 = (C18602) this.f16318;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f16316;
                c18602.getClass();
                onClickListener.onClick(c18602, i);
                break;
        }
    }
}
