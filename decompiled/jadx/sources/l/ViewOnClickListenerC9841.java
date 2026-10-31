package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9841 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29728;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29729;

    public /* synthetic */ ViewOnClickListenerC9841(int i, Object obj) {
        this.f29728 = i;
        this.f29729 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f29728;
        Object obj = this.f29729;
        switch (i) {
            case 0:
                int i2 = ActivityC1748.f6044;
                ((ActivityC1748) obj).finish();
                break;
            case 1:
                C19258 c19258BuildDialog = ((AbstractActivityC3346) obj).buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, null);
                c19258BuildDialog.m44438();
                break;
            case 2:
                ViewOnClickListenerC19987.m46074((ViewOnClickListenerC19987) obj);
                break;
            case 3:
                ((AbstractViewOnClickListenerC5230) obj).m15021(view);
                break;
            case 4:
                ((AbstractDialogInterfaceOnClickListenerC12849) obj).m31250((CharSequence) C17283.m40576(System.currentTimeMillis()));
                break;
            case 5:
                ActivityC12581 activityC12581 = (ActivityC12581) obj;
                ActivityC17520.m40936(activityC12581, activityC12581.f37929.m44000());
                break;
            case 6:
                ActivityC17169 activityC17169 = (ActivityC17169) obj;
                activityC17169.f52617.smoothScrollToPosition(activityC17169.f52618);
                break;
            case 7:
                ViewOnClickListenerC16700.m39254((ViewOnClickListenerC16700) obj);
                break;
            default:
                C5062.m14588((C5062) obj);
                break;
        }
    }
}
