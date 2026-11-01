package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19291 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57634;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f57635;

    public /* synthetic */ ViewOnClickListenerC19291(int i, Object obj) {
        this.f57634 = i;
        this.f57635 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f57634;
        Object obj = this.f57635;
        switch (i) {
            case 0:
                C11245.m26053((C11245) obj, view);
                break;
            case 1:
                int i2 = ActivityC23336.f73409;
                ((ActivityC23336) obj).finish();
                break;
            case 2:
                DialogInterfaceOnDismissListenerC7422.m17147((DialogInterfaceOnDismissListenerC7422) obj);
                break;
            case 3:
                C20671 c20671BuildDialog = ((AbstractActivityC5549) obj).buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                C10884.m25069(c20671BuildDialog.m46732());
                break;
            default:
                C7050.m16211((CharSequence) ((C5738) obj).m12760().getName());
                break;
        }
    }
}
