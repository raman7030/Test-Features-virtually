package p067l;

import android.content.DialogInterface;
import android.text.Spanned;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2827 extends AbstractViewOnClickListenerC7339 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C4697 f4856;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C3498 f4857;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ Main f4858;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ ArrayList f4859;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2827(C3498 c3498, Main main, ArrayList arrayList, C4697 c4697, ArrayList arrayList2, Main main2) {
        super(main, arrayList, false, false);
        this.f4857 = c3498;
        this.f4856 = c4697;
        this.f4859 = arrayList2;
        this.f4858 = main2;
    }

    @Override // p067l.AbstractViewOnClickListenerC7339
    /* JADX INFO: renamed from: ۜ */
    public final void mo4502() {
        String strM16940 = m16940();
        String strM16942 = m16942();
        String strM16943 = m16943();
        final C4697 c4697 = this.f4856;
        boolean zMo15799 = c4697.m9970().mo8217().mo15799();
        ArrayList arrayList = this.f4859;
        C2703 c2703 = new C2703(arrayList.size(), zMo15799);
        Iterator it = c4697.m9963().iterator();
        while (it.hasNext()) {
            c2703.m4195(((InterfaceC19370) it.next()).getName());
        }
        ArrayList<C8739> arrayListM49961 = C22151.m49961(arrayList, strM16940, strM16942, strM16943, m16945(), Collections.EMPTY_MAP);
        final ArrayList arrayListM49960 = C22151.m49960(arrayListM49961);
        C22151.m49962(c2703, arrayListM49960);
        final ArrayList arrayList2 = new ArrayList(arrayListM49961.size());
        boolean z = false;
        for (C8739 c8739 : arrayListM49961) {
            if (!c8739.m20212()) {
                z = true;
            }
            arrayList2.add(c8739.m20207());
        }
        Main main = this.f4858;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(listView);
        listView.setAdapter((ListAdapter) new C4338(R.layout.MT_Protector, main, arrayList2));
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        if (strM16940.equals("{P}{S}") && m16942().length() == 0) {
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
        } else if (z) {
            m16938();
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
        } else {
            m16938();
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴܳ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2827.m4501(this.f62628, c4697, arrayListM49960);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732().m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb.append(((Spanned) it2.next()).toString());
                    sb.append("\n");
                }
                C7050.m16211((CharSequence) sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4501(C2827 c2827, C4697 c4697, ArrayList arrayList) {
        c2827.m16936();
        c2827.m16944();
        C3498.m6250(c2827.f4857, c4697, arrayList);
    }
}
