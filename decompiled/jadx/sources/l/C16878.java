package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16878 extends AbstractViewOnClickListenerC5230 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f51789;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f51790;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f51791;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f51793;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f51794;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f51795;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16878(C23934 c23934, Main main, ArrayList arrayList, C2450 c2450, ArrayList arrayList2, Main main2, C10738 c10738, boolean z, String str, AbstractC15440 abstractC15440) {
        super(main, arrayList, false, false);
        this.f51789 = c2450;
        this.f51795 = arrayList2;
        this.f51793 = main2;
        this.f51794 = c10738;
        this.f51792 = z;
        this.f51790 = str;
        this.f51791 = abstractC15440;
    }

    @Override // l.AbstractViewOnClickListenerC5230
    /* JADX INFO: renamed from: ۜ */
    public final void mo2119() {
        String strM15030 = m15030();
        String strM15032 = m15032();
        String strM15033 = m15033();
        final C2450 c2450 = this.f51789;
        List<InterfaceC17889> listM7915 = c2450.m7915();
        C0352 c0352 = new C0352(listM7915.size(), true);
        for (InterfaceC17889 interfaceC17889 : listM7915) {
            if (!interfaceC17889.mo36981()) {
                c0352.m1796(interfaceC17889.getName());
            }
        }
        boolean zM15035 = m15035();
        Map map = Collections.EMPTY_MAP;
        final ArrayList arrayList = this.f51795;
        ArrayList<C6703> arrayListM47633 = C20815.m47633(arrayList, strM15030, strM15032, strM15033, zM15035, map);
        final ArrayList arrayListM47632 = C20815.m47632(arrayListM47633);
        C20815.m47634(c0352, arrayListM47632);
        ArrayList arrayList2 = new ArrayList(arrayListM47633.size());
        boolean z = false;
        for (C6703 c6703 : arrayListM47633) {
            if (!c6703.m18264()) {
                z = true;
            }
            arrayList2.add(c6703.m18259());
        }
        Main main = this.f51793;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) new C2072(R.layout.MT_Protector, main, arrayList2));
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        if (strM15030.equals("{P}{S}") && m15032().isEmpty()) {
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
        } else if (z) {
            m15028();
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
        } else {
            m15028();
            final C10738 c10738 = this.f51794;
            final boolean z2 = this.f51792;
            final String str = this.f51790;
            final AbstractC15440 abstractC15440 = this.f51791;
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫᩶᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f6879.m39672(arrayList, arrayListM47632, c10738, z2, c2450, str, abstractC15440);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC10940(2, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void m39672(ArrayList arrayList, ArrayList arrayList2, C10738 c10738, boolean z, final C2450 c2450, String str, final AbstractC15440 abstractC15440) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            map.put(interfaceC17889.getName(), Boolean.valueOf(interfaceC17889.isDirectory()));
        }
        final ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C6703 c6703 = (C6703) it2.next();
            arrayList3.add(new C18290(c6703.m18263(), c6703.m18262(), map.get(c6703.m18263()) == Boolean.TRUE, true));
        }
        m15034();
        final String strSubstring = c10738.m39741().substring(1);
        if (z) {
            C10025.m25197(new InterfaceC12846() { // from class: l.ۧ᩶᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z2) {
                    this.f33687.m15026();
                    List list = Collections.EMPTY_LIST;
                    C23934.m52712(c2450, abstractC15440, strSubstring, arrayList3, Collections.EMPTY_LIST, c11667, z2);
                }
            }, c2450.m7917(), str);
            return;
        }
        m15026();
        List list = Collections.EMPTY_LIST;
        C23934.m52712(c2450, abstractC15440, strSubstring, arrayList3, Collections.EMPTY_LIST, null, false);
    }
}
