package p067l;

import android.view.View;
import android.widget.CheckBox;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9990 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f27670;

    /* JADX INFO: renamed from: ۧ */
    public final List f27671;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f27672;

    /* JADX INFO: renamed from: ᩳ */
    public final C18107 f27673;

    public C9990(C18107 c18107, List list) {
        this.f27673 = c18107;
        this.f27671 = list;
        boolean z = false;
        this.f27672 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory() && !interfaceC19370.mo39144()) {
                z = true;
                break;
            }
        }
        this.f27670 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23306(RunnableC22455 runnableC22455) {
        List list = this.f27671;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C18107 c18107 = this.f27673;
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        String strM42827 = C18794.m42827(this.f27672 ? System.currentTimeMillis() : ((InterfaceC19370) list.get(0)).getTime());
        final C20720 c20720 = new C20720(this, c18107.m41282(), viewM12252, checkBox, checkBox2, runnableC22455);
        c20720.m33344(R.string.MT_Protector);
        c20720.m33336((CharSequence) strM42827);
        c20720.m33351(C18794.m42822());
        c20720.m33330();
        c20720.m33362(4);
        c20720.m33365(6);
        c20720.m33335(new C3817(true));
        c20720.m33352(true);
        c20720.m33368().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۜ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c20720.m33336((CharSequence) C18794.m42827(System.currentTimeMillis()));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23301(C9990 c9990, RunnableC22455 runnableC22455, long j, boolean z, boolean z2) {
        new C3284(c9990, (AbstractC5375) c9990.f27673.m41270().mo8217(), z, z2, j, runnableC22455).m22250();
    }
}
