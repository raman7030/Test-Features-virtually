package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public final class C15730 extends AbstractC1661 {
    public C15730() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        if (c2450.m7918() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c2450.m7909().iterator();
            while (it.hasNext()) {
                arrayList.add(new C10211((InterfaceC17889) it.next()));
            }
            c2450.m7922().mo6005(c2450.m7921(), arrayList, new RunnableC3609(this, arrayList, c2450, 1));
            return;
        }
        c2450.m7922().m39738(c2450.m7921(), c2450.m7913(), new C17848(this, c2450.m7919(), c2450));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37133(C15730 c15730, ArrayList arrayList, C2450 c2450) {
        ((C10211) arrayList.get(0)).m25619();
        ((C10211) arrayList.get(1)).m25619();
        AbstractC15440 abstractC15440M25622 = ((C10211) arrayList.get(0)).m25622();
        AbstractC15440 abstractC15440M25623 = ((C10211) arrayList.get(1)).m25622();
        C7309 c7309 = new C7309(abstractC15440M25622, abstractC15440M25623, abstractC15440M25622.mo23554(), abstractC15440M25623.mo23554(), c2450.m7922(), c2450.m7922());
        C16560 c16560M7921 = c2450.m7921();
        c7309.m19593();
        c15730.m37135(c16560M7921, c7309);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37134(C15730 c15730, C10211 c10211, C2450 c2450, C16560 c16560, C10211 c10212) {
        String name;
        String name2;
        c10212.m25619();
        AbstractC15440 abstractC15440M25622 = c10211.m25622();
        AbstractC15440 abstractC15440M25623 = c10212.m25622();
        boolean zM39064 = c2450.m7921().m39064();
        if (abstractC15440M25622.getName().equals(abstractC15440M25623.getName())) {
            int i = R.string.MT_Protector;
            name = C4925.m14306(zM39064 ? R.string.MT_Protector : R.string.MT_Protector, abstractC15440M25622.getName());
            if (!zM39064) {
                i = R.string.MT_Protector;
            }
            name2 = C4925.m14306(i, abstractC15440M25623.getName());
        } else {
            name = abstractC15440M25622.getName();
            name2 = abstractC15440M25623.getName();
        }
        C7309 c7309 = new C7309(c10211.m25622(), c10212.m25622(), name, name2, c2450.m7922(), c16560.m39044());
        if (!zM39064) {
            c7309.m19594();
        }
        c15730.m37135(c2450.m7921(), c7309);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37135(final C16560 c16560, final C7309 c7309) {
        View viewM10216 = c16560.m39056().m10216(R.layout.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(m5610());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        Main mainM39056 = c16560.m39056();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(mainM39056);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۚܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C7309 c73010 = c7309;
                c73010.m19592();
                AbstractC15440 abstractC15440 = c73010.f22436;
                AbstractC15440 abstractC15441 = c73010.f22437;
                C15730 c15730 = this.f52539;
                AbstractC15440 abstractC15440M51761 = C23346.m51761(c16560, c15730.m5610(), "txt");
                int i3 = C15104.f46193;
                C0994 c0994 = new C0994(C8676.class);
                c0994.m3474("saveAsPath", abstractC15440M51761.mo23554());
                c0994.m3474("inputPath1", abstractC15440.mo23554());
                c0994.m3474("inputPath2", abstractC15441.mo23554());
                c0994.m3474("title", C4925.m14327(c15730.m5610()));
                c0994.m3469();
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC19680(c7309, editText, editText2, 1));
    }
}
