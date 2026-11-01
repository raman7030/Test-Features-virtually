package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18410 extends AbstractViewOnClickListenerC7339 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C4697 f54970;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ String f54971;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ AbstractC17043 f54972;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean f54973;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ Main f54974;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C12574 f54975;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ ArrayList f54976;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18410(C25116 c25116, Main main, ArrayList arrayList, C4697 c4697, ArrayList arrayList2, Main main2, C12574 c12574, boolean z, String str, AbstractC17043 abstractC17043) {
        super(main, arrayList, false, false);
        this.f54970 = c4697;
        this.f54976 = arrayList2;
        this.f54974 = main2;
        this.f54975 = c12574;
        this.f54973 = z;
        this.f54971 = str;
        this.f54972 = abstractC17043;
    }

    @Override // p067l.AbstractViewOnClickListenerC7339
    /* JADX INFO: renamed from: ۜ */
    public final void mo4502() {
        String strM16940 = m16940();
        String strM16942 = m16942();
        String strM16943 = m16943();
        final C4697 c4697 = this.f54970;
        List<InterfaceC19370> listM9963 = c4697.m9963();
        C2703 c2703 = new C2703(listM9963.size(), true);
        for (InterfaceC19370 interfaceC19370 : listM9963) {
            if (!interfaceC19370.mo39147()) {
                c2703.m4195(interfaceC19370.getName());
            }
        }
        boolean zM16945 = m16945();
        Map map = Collections.EMPTY_MAP;
        final ArrayList arrayList = this.f54976;
        ArrayList<C8739> arrayListM49961 = C22151.m49961(arrayList, strM16940, strM16942, strM16943, zM16945, map);
        final ArrayList arrayListM49960 = C22151.m49960(arrayListM49961);
        C22151.m49962(c2703, arrayListM49960);
        ArrayList arrayList2 = new ArrayList(arrayListM49961.size());
        boolean z = false;
        for (C8739 c8739 : arrayListM49961) {
            if (!c8739.m20212()) {
                z = true;
            }
            arrayList2.add(c8739.m20207());
        }
        Main main = this.f54974;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(listView);
        listView.setAdapter((ListAdapter) new C4338(R.layout.MT_Protector, main, arrayList2));
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        if (strM16940.equals("{P}{S}") && m16942().isEmpty()) {
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
        } else if (z) {
            m16938();
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
        } else {
            m16938();
            final C12574 c12574 = this.f54975;
            final boolean z2 = this.f54973;
            final String str = this.f54971;
            final AbstractC17043 abstractC17043 = this.f54972;
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫᩶᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f9663.m41913(arrayList, arrayListM49960, c12574, z2, c4697, str, abstractC17043);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732().m3861().setOnClickListener(new ViewOnClickListenerC12766(2, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void m41913(ArrayList arrayList, ArrayList arrayList2, C12574 c12574, boolean z, final C4697 c4697, String str, final AbstractC17043 abstractC17043) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            map.put(interfaceC19370.getName(), Boolean.valueOf(interfaceC19370.isDirectory()));
        }
        final ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C8739 c8739 = (C8739) it2.next();
            arrayList3.add(new C19752(c8739.m20211(), c8739.m20210(), map.get(c8739.m20211()) == Boolean.TRUE, true));
        }
        m16944();
        final String strSubstring = c12574.m41982().substring(1);
        if (z) {
            C11896.m27214(new InterfaceC14577() { // from class: l.ۧ᩶᩻
                @Override // p067l.InterfaceC14577
                public final /* synthetic */ void onCanceled() {
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo6050(Exception exc) {
                    return false;
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final void mo6049(C13457 c13457, boolean z2) {
                    this.f36687.m16936();
                    List list = Collections.EMPTY_LIST;
                    C25116.m55118(c4697, abstractC17043, strSubstring, arrayList3, Collections.EMPTY_LIST, c13457, z2);
                }
            }, c4697.m9965(), str);
            return;
        }
        m16936();
        List list = Collections.EMPTY_LIST;
        C25116.m55118(c4697, abstractC17043, strSubstring, arrayList3, Collections.EMPTY_LIST, null, false);
    }
}
