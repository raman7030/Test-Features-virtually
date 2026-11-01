package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7319 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f19157;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f19158;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f19159;

    public /* synthetic */ DialogInterfaceOnClickListenerC7319(int i, Object obj, Object obj2) {
        this.f19158 = i;
        this.f19159 = obj;
        this.f19157 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f19158) {
            case 0:
                List list = (List) this.f19159;
                C4697 c4697 = (C4697) this.f19157;
                dialogInterface.dismiss();
                ((AbstractC3947) list.get(i)).mo3868(c4697);
                break;
            default:
                C20048 c20048 = (C20048) this.f19159;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f19157;
                c20048.getClass();
                onClickListener.onClick(c20048, i);
                break;
        }
    }
}
