package p067l;

import android.content.DialogInterface;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC15087 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f43074;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f43075;

    public /* synthetic */ ViewOnClickListenerC15087(int i, Object obj) {
        this.f43074 = i;
        this.f43075 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f43074;
        Object obj = this.f43075;
        switch (i) {
            case 0:
                ViewOnLayoutChangeListenerC9723.m22702((ViewOnLayoutChangeListenerC9723) obj);
                break;
            case 1:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) obj;
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732().m3861().setOnClickListener(new ViewOnClickListenerC18084(2, abstractActivityC5549));
                break;
            case 2:
                int i2 = ActivityC5542.f13364;
                ((ActivityC5542) obj).finish();
                break;
            case 3:
                ((C15957) obj).m36218(view);
                break;
            default:
                C8331 c8331 = (C8331) obj;
                c8331.getClass();
                C8331.m19221(c8331, R.string.MT_Protector, null, null, 14);
                break;
        }
    }
}
