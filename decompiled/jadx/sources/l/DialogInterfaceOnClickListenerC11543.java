package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۨۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11543 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34467;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34468;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34469;

    public /* synthetic */ DialogInterfaceOnClickListenerC11543(int i, Object obj, Object obj2) {
        this.f34468 = i;
        this.f34469 = obj;
        this.f34467 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f34468) {
            case 0:
                C2079.m6837((C7309) this.f34469, (AbstractActivityC3346) this.f34467);
                break;
            case 1:
                C22372 c22372 = (C22372) this.f34469;
                ActivityC16315 activityC16315 = (ActivityC16315) this.f34467;
                c22372.m50222(activityC16315, new RunnableC23951(1, activityC16315));
                break;
            case 2:
                ((PluginDialog.OnClickListener) this.f34467).onClick(((C21838) this.f34469).f69964, i);
                break;
            case 3:
                ViewOnClickListenerC19121.m44127((AbstractC15440) this.f34469, (ViewOnClickListenerC19121) this.f34467);
                break;
            case 4:
                ((C7864) this.f34469).m34228((ActivityC17169) this.f34467);
                break;
            default:
                C14357.m34261((C14357) this.f34469, (AbstractActivityC3346) this.f34467);
                break;
        }
    }
}
