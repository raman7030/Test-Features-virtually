package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes2.dex */
public final class C3711 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11295(final AbstractActivityC3346 abstractActivityC3346, RunnableC19989 runnableC19989) {
        final C18528 c18528 = new C18528(ApplicationC20075.f65008);
        final C15704 c15704 = new C15704(abstractActivityC3346, c18528, abstractActivityC3346, runnableC19989);
        c15704.m6052(R.string.MT_Protector);
        final C5062 c5062M6055 = c15704.m6055();
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        final RunnableC23466 runnableC23466 = new RunnableC23466(c18528, c5062M6055, (TextView) viewM10216.findViewById(R.id.MT_Protector), abstractActivityC3346);
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۜۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5062 c5062 = c5062M6055;
                String strTrim = c5062.m14611().toString().trim();
                C18528 c18529 = c18528;
                new C4417(abstractActivityC3346, strTrim, c18529.m43049(strTrim), c18529.m43048(strTrim), new C8650(c5062, strTrim, c18529, runnableC23466)).m31266(true);
            }
        });
        c5062M6055.m14606();
        c5062M6055.m14616();
        c5062M6055.m14603(new RunnableC20645(c18528, runnableC23466));
        c5062M6055.m14600(new C2300(runnableC23466));
        c5062M6055.m14599(17);
        C10235 c10235M14607 = c5062M6055.m14607();
        c10235M14607.m25924(6);
        c10235M14607.m30477(abstractActivityC3346.getString(R.string.MT_Protector));
        c10235M14607.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۢۙۜ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66 && i != 160) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    c15704.onClick(view);
                }
                return true;
            }
        });
        c10235M14607.m30512(2);
        c15704.m6053(viewM10216);
        c15704.m6060();
    }
}
