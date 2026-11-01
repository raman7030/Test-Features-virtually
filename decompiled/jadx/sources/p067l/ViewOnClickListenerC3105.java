package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3105 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f5646;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f5647;

    public /* synthetic */ ViewOnClickListenerC3105(int i, Object obj) {
        this.f5646 = i;
        this.f5647 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5646;
        Object obj = this.f5647;
        switch (i) {
            case 0:
                int i2 = ActivityC16516.f48548;
                ((ActivityC16516) obj).finish();
                break;
            case 1:
                ActivityC23283 activityC23283 = ((C20601) obj).f63668;
                C20671 c20671BuildDialog = activityC23283.buildDialog();
                c20671BuildDialog.m46730(activityC23283.f13392.getTitle());
                c20671BuildDialog.m46718(activityC23283.f13392.getSubtitle());
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46732();
                break;
            case 2:
                int i3 = ActivityC17598.f52591;
                ((ActivityC17598) obj).getOnBackPressedDispatcher().m30941();
                break;
            default:
                C22494.m50446((C22494) obj);
                break;
        }
    }
}
