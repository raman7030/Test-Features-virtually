package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC18647 extends AbstractC5907 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۫֫ */
    public static int[] f55660 = m42399();

    /* JADX INFO: renamed from: ۡ֫ */
    public static int[] m42397() {
        return f55660;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public static void m42396() {
        f55660 = m42399();
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public static int[] m42399() {
        List list = C11169.f31004;
        int[] iArrMo20202 = ApplicationC21448.f67649.mo20202("built_in_method_sort");
        int i = 0;
        if (iArrMo20202 == null || iArrMo20202.length > list.size()) {
            int[] iArr = new int[list.size()];
            while (i < list.size()) {
                iArr[i] = ((C11169) list.get(i)).f31006;
                i++;
            }
            return iArr;
        }
        if (iArrMo20202.length < list.size()) {
            C17441 c17441 = new C17441(list.size());
            C17441 c17442 = new C17441(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c17442.add(((C11169) it.next()).f31006);
            }
            int length = iArrMo20202.length;
            while (i < length) {
                int i2 = iArrMo20202[i];
                if (c17442.mo5872(i2)) {
                    c17441.add(i2);
                }
                i++;
            }
            c17441.mo28312((InterfaceC3340) c17442);
            return c17441.mo5873();
        }
        C20125 c20125 = new C20125(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c20125.add(((C11169) it2.next()).f31006);
        }
        boolean zIsEmpty = true;
        for (int i3 : iArrMo20202) {
            if (!c20125.remove(i3)) {
                zIsEmpty = false;
            }
        }
        if (zIsEmpty) {
            zIsEmpty = c20125.isEmpty();
        }
        if (!zIsEmpty) {
            while (i < list.size()) {
                iArrMo20202[i] = ((C11169) list.get(i)).f31006;
                i++;
            }
        }
        return iArrMo20202;
    }

    public DialogInterfaceOnDismissListenerC18647(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC18647(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC18647(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC18647(Context context) {
        super(context);
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        C14849 c14849 = (C14849) viewM12252.findViewById(R.id.MT_Protector);
        c14849.setAdapter(new C17976());
        c14849.setLayoutManager(new C22663((Context) abstractActivityC5549, 3));
        new C3847(new C12613()).m7551(c14849);
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
        ApplicationC21448.f67649.edit().mo27878("built_in_method_sort", f55660).apply();
    }
}
