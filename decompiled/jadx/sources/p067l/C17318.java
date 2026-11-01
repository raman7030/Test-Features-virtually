package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17318 extends AbstractC3947 {
    public C17318() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        if (c4697.m9966() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c4697.m9957().iterator();
            while (it.hasNext()) {
                arrayList.add(new C12073((InterfaceC19370) it.next()));
            }
            c4697.m9970().mo8202(c4697.m9969(), arrayList, new RunnableC5798(this, arrayList, c4697, 1));
            return;
        }
        c4697.m9970().m41979(c4697.m9969(), c4697.m9961(), new C19331(this, c4697.m9967(), c4697));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39302(C17318 c17318, ArrayList arrayList, C4697 c4697) {
        ((C12073) arrayList.get(0)).m27641();
        ((C12073) arrayList.get(1)).m27641();
        AbstractC17043 abstractC17043M27644 = ((C12073) arrayList.get(0)).m27644();
        AbstractC17043 abstractC17043M27645 = ((C12073) arrayList.get(1)).m27644();
        C9315 c9315 = new C9315(abstractC17043M27644, abstractC17043M27645, abstractC17043M27644.mo25505(), abstractC17043M27645.mo25505(), c4697.m9970(), c4697.m9970());
        C18107 c18107M9969 = c4697.m9969();
        c9315.m21561();
        c17318.m39304(c18107M9969, c9315);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39303(C17318 c17318, C12073 c12073, C4697 c4697, C18107 c18107, C12073 c12074) {
        String name;
        String name2;
        c12074.m27641();
        AbstractC17043 abstractC17043M27644 = c12073.m27644();
        AbstractC17043 abstractC17043M27645 = c12074.m27644();
        boolean zM41290 = c4697.m9969().m41290();
        if (abstractC17043M27644.getName().equals(abstractC17043M27645.getName())) {
            int i = R.string.MT_Protector;
            name = C7050.m16203(zM41290 ? R.string.MT_Protector : R.string.MT_Protector, abstractC17043M27644.getName());
            if (!zM41290) {
                i = R.string.MT_Protector;
            }
            name2 = C7050.m16203(i, abstractC17043M27645.getName());
        } else {
            name = abstractC17043M27644.getName();
            name2 = abstractC17043M27645.getName();
        }
        C9315 c9315 = new C9315(c12073.m27644(), c12074.m27644(), name, name2, c4697.m9970(), c18107.m41270());
        if (!zM41290) {
            c9315.m21562();
        }
        c17318.m39304(c4697.m9969(), c9315);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39304(final C18107 c18107, final C9315 c9315) {
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(m7840());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4345.m8962(c9315.f25331, c9315.f25329, editText, editText2);
        Main mainM41282 = c18107.m41282();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(mainM41282);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۚܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C9315 c9316 = c9315;
                c9316.m21560();
                AbstractC17043 abstractC17043 = c9316.f25327;
                AbstractC17043 abstractC17044 = c9316.f25328;
                C17318 c17318 = this.f55722;
                AbstractC17043 abstractC17043M54158 = C24556.m54158(c18107, c17318.m7840(), "txt");
                int i3 = C16723.f49313;
                C3313 c3313 = new C3313(C10614.class);
                c3313.m5777("saveAsPath", abstractC17043M54158.mo25505());
                c3313.m5777("inputPath1", abstractC17043.mo25505());
                c3313.m5777("inputPath2", abstractC17044.mo25505());
                c3313.m5777("title", C7050.m16224(c17318.m7840()));
                c3313.m5772();
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new ViewOnClickListenerC21073(c9315, editText, editText2, 1));
    }
}
