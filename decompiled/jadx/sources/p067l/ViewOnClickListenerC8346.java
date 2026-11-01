package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8346 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f22315;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f22316;

    public /* synthetic */ ViewOnClickListenerC8346(int i, Object obj) {
        this.f22315 = i;
        this.f22316 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22315) {
            case 0:
                AbstractC24439.m53926((AbstractC24439) this.f22316);
                break;
            case 1:
                DialogInterfaceOnDismissListenerC7422.m17154((DialogInterfaceOnDismissListenerC7422) this.f22316);
                break;
            case 2:
                C11245.m26047((C11245) this.f22316, view);
                break;
            default:
                C20671 c20671BuildDialog = ((AbstractActivityC5549) this.f22316).buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                C10884.m25069(c20671BuildDialog.m46732());
                break;
        }
    }
}
