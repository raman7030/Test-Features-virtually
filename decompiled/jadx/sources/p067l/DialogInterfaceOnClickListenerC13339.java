package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۨۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13339 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f37464;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37465;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f37466;

    public /* synthetic */ DialogInterfaceOnClickListenerC13339(int i, Object obj, Object obj2) {
        this.f37465 = i;
        this.f37466 = obj;
        this.f37464 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f37465) {
            case 0:
                C4345.m8963((C9315) this.f37466, (AbstractActivityC5549) this.f37464);
                break;
            case 1:
                C23631 c23631 = (C23631) this.f37466;
                ActivityC17874 activityC17874 = (ActivityC17874) this.f37464;
                c23631.m52562(activityC17874, new RunnableC25132(1, activityC17874));
                break;
            case 2:
                ((PluginDialog.OnClickListener) this.f37464).onClick(((C23124) this.f37466).f72673, i);
                break;
            case 3:
                ViewOnClickListenerC20541.m46421((AbstractC17043) this.f37466, (ViewOnClickListenerC20541) this.f37464);
                break;
            case 4:
                ((C9842) this.f37466).m36361((ActivityC18686) this.f37464);
                break;
            default:
                C16013.m36394((C16013) this.f37466, (AbstractActivityC5549) this.f37464);
                break;
        }
    }
}
