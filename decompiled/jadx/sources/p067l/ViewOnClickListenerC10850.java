package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10850 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30067;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30068;

    public /* synthetic */ ViewOnClickListenerC10850(int i, Object obj) {
        this.f30067 = i;
        this.f30068 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f30067;
        Object obj = this.f30068;
        switch (i) {
            case 0:
                int i2 = ViewOnClickListenerC7497.f19594;
                ((ViewOnClickListenerC7497) obj).finish();
                break;
            case 1:
                C20671 c20671BuildDialog = ((AbstractActivityC5549) obj).buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                C10884.m25069(c20671BuildDialog.m46732());
                break;
            default:
                C18229.m41459((C18229) obj);
                break;
        }
    }
}
