package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5860 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f14411;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14412;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f14413;

    public /* synthetic */ ViewOnClickListenerC5860(int i, Object obj, Object obj2) {
        this.f14412 = i;
        this.f14413 = obj;
        this.f14411 = obj2;
    }

    public /* synthetic */ ViewOnClickListenerC5860(C12996 c12996, AbstractActivityC5549 abstractActivityC5549, List list) {
        this.f14412 = 2;
        this.f14413 = abstractActivityC5549;
        this.f14411 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f14412;
        Object obj = this.f14411;
        Object obj2 = this.f14413;
        switch (i) {
            case 0:
                InterfaceC8780 interfaceC8780 = (InterfaceC8780) obj2;
                DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) obj;
                if (!interfaceC8780.mo30401()) {
                    interfaceC8780.mo20310();
                    dialogInterfaceC2564.dismiss();
                    break;
                }
                break;
            case 1:
                ActivityC18686 activityC18686 = (ActivityC18686) obj2;
                int i2 = ActivityC18686.f55776;
                ActivityC16573.m37551(activityC18686, C19945.m45265((IOException) obj), activityC18686.getString(R.string.MT_Protector), null, null);
                break;
            default:
                C12996.m29793((AbstractActivityC5549) obj2, (List) obj);
                break;
        }
    }
}
