package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11722 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32681;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32682;

    public /* synthetic */ ViewOnClickListenerC11722(int i, Object obj) {
        this.f32681 = i;
        this.f32682 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f32681;
        Object obj = this.f32682;
        switch (i) {
            case 0:
                int i2 = ActivityC4030.f8821;
                ((ActivityC4030) obj).finish();
                break;
            case 1:
                C20671 c20671BuildDialog = ((AbstractActivityC5549) obj).buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46732();
                break;
            case 2:
                ViewOnClickListenerC21364.m48388((ViewOnClickListenerC21364) obj);
                break;
            case 3:
                ((AbstractViewOnClickListenerC7339) obj).m16931(view);
                break;
            case 4:
                ((AbstractDialogInterfaceOnClickListenerC14580) obj).m33336((CharSequence) C18794.m42827(System.currentTimeMillis()));
                break;
            case 5:
                ActivityC14326 activityC14326 = (ActivityC14326) obj;
                ActivityC19020.m43195(activityC14326, activityC14326.f40957.m46294());
                break;
            case 6:
                ActivityC18686 activityC18686 = (ActivityC18686) obj;
                activityC18686.f55798.smoothScrollToPosition(activityC18686.f55799);
                break;
            case 7:
                ViewOnClickListenerC18240.m41490((ViewOnClickListenerC18240) obj);
                break;
            default:
                C7179.m16495((C7179) obj);
                break;
        }
    }
}
