package p067l;

import android.view.View;
import android.widget.CheckBox;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes.dex */
public final class C24604 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f77898;

    /* JADX INFO: renamed from: ۧ */
    public final List f77899;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f77900;

    /* JADX INFO: renamed from: ᩳ */
    public final C18107 f77901;

    public C24604(C18107 c18107, List list) {
        this.f77901 = c18107;
        this.f77899 = list;
        boolean z = false;
        this.f77900 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory() && !interfaceC19370.mo39144()) {
                z = true;
                break;
            }
        }
        this.f77898 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54242(RunnableC3319 runnableC3319) {
        List list = this.f77899;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C18107 c18107 = this.f77901;
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        String strM42827 = C18794.m42827(this.f77900 ? System.currentTimeMillis() : ((InterfaceC19370) list.get(0)).getTime());
        C19240 c19240 = new C19240(this, c18107.m41282(), viewM12252, checkBox, checkBox2, runnableC3319);
        c19240.m33344(R.string.MT_Protector);
        c19240.m33336((CharSequence) strM42827);
        c19240.m33351(C18794.m42822());
        c19240.m33330();
        c19240.m33362(4);
        c19240.m33365(6);
        c19240.m33335(new C3817(true));
        c19240.m33352(true);
        c19240.m33368().setOnClickListener(new ViewOnClickListenerC18084(3, c19240));
    }
}
