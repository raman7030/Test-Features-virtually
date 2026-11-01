package p067l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5895 {
    /* JADX INFO: renamed from: ֫ */
    public static void m13242(final AbstractActivityC5549 abstractActivityC5549, RunnableC21366 runnableC21366) {
        final C19977 c19977 = new C19977(ApplicationC21448.f67649);
        final C17293 c17293 = new C17293(abstractActivityC5549, c19977, abstractActivityC5549, runnableC21366);
        c17293.m8250(R.string.MT_Protector);
        final C7179 c7179M8253 = c17293.m8253();
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        final RunnableC24670 runnableC24670 = new RunnableC24670(c19977, c7179M8253, (TextView) viewM12252.findViewById(R.id.MT_Protector), abstractActivityC5549);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۜۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7179 c7179 = c7179M8253;
                String strTrim = c7179.m16518().toString().trim();
                C19977 c19978 = c19977;
                new C6566(abstractActivityC5549, strTrim, c19978.m45327(strTrim), c19978.m45326(strTrim), new C10589(c7179, strTrim, c19978, runnableC24670)).m33352(true);
            }
        });
        c7179M8253.m16513();
        c7179M8253.m16523();
        c7179M8253.m16510(new RunnableC21989(c19977, runnableC24670));
        c7179M8253.m16507(new C4554(runnableC24670));
        c7179M8253.m16506(17);
        C12096 c12096M16514 = c7179M8253.m16514();
        c12096M16514.m27946(6);
        c12096M16514.m32541(abstractActivityC5549.getString(R.string.MT_Protector));
        c12096M16514.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۢۙۜ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66 && i != 160) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    c17293.onClick(view);
                }
                return true;
            }
        });
        c12096M16514.m32576(2);
        c17293.m8251(viewM12252);
        c17293.m8258();
    }
}
