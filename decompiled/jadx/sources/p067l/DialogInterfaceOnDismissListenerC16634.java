package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC16634 extends AbstractC5907 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۫֫ */
    public static int[] f48889 = m37701();

    /* JADX INFO: renamed from: ۡ֫ */
    public static int[] m37699() {
        return f48889;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public static void m37698() {
        f48889 = m37701();
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public static int[] m37701() {
        int[] iArrMo20202 = ApplicationC21448.f67649.mo20202("file_menu_sort");
        if (iArrMo20202 != null && iArrMo20202.length == 10) {
            boolean[] zArr = new boolean[10];
            for (int i : iArrMo20202) {
                if (i >= 0 && i < 10 && !zArr[i]) {
                    zArr[i] = true;
                }
            }
            return iArrMo20202;
        }
        return AbstractC18422.f55041;
    }

    public DialogInterfaceOnDismissListenerC16634(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC16634(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC16634(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC16634(Context context) {
        super(context);
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        C14849 c14849 = (C14849) viewM12252.findViewById(R.id.MT_Protector);
        c14849.setAdapter(new C3224());
        c14849.setLayoutManager(new C22663((Context) abstractActivityC5549, 2));
        new C3847(new C7248()).m7551(c14849);
        c14849.getItemAnimator().m53108(200L);
        c14849.getItemAnimator().m53118(200L);
        c14849.getItemAnimator().m53115(200L);
        c14849.getItemAnimator().m53112(200L);
        Context contextM9012 = m9012();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextM9012);
        c20671.m46715(viewM12252);
        c20671.m46714(this);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46732();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ApplicationC21448.f67649.edit().mo27878("file_menu_sort", f48889).apply();
    }
}
