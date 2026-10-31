package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3674 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11607;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11608;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11609;

    public /* synthetic */ ViewOnClickListenerC3674(int i, Object obj, Object obj2) {
        this.f11608 = i;
        this.f11609 = obj;
        this.f11607 = obj2;
    }

    public /* synthetic */ ViewOnClickListenerC3674(C11182 c11182, AbstractActivityC3346 abstractActivityC3346, List list) {
        this.f11608 = 2;
        this.f11609 = abstractActivityC3346;
        this.f11607 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f11608;
        Object obj = this.f11607;
        Object obj2 = this.f11609;
        switch (i) {
            case 0:
                InterfaceC6746 interfaceC6746 = (InterfaceC6746) obj2;
                DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) obj;
                if (!interfaceC6746.mo28355()) {
                    interfaceC6746.mo18362();
                    dialogInterfaceC0206.dismiss();
                    break;
                }
                break;
            case 1:
                ActivityC17169 activityC17169 = (ActivityC17169) obj2;
                int i2 = ActivityC17169.f52595;
                ActivityC14946.m35399(activityC17169, C18494.m42989((IOException) obj), activityC17169.getString(R.string.MT_Protector), null, null);
                break;
            default:
                C11182.m27731((AbstractActivityC3346) obj2, (List) obj);
                break;
        }
    }
}
