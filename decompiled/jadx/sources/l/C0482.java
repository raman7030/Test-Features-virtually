package l;

import android.content.DialogInterface;
import android.text.Spanned;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0482 extends AbstractViewOnClickListenerC5230 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f2083;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1188 f2084;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f2085;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f2086;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482(C1188 c1188, Main main, ArrayList arrayList, C2450 c2450, ArrayList arrayList2, Main main2) {
        super(main, arrayList, false, false);
        this.f2084 = c1188;
        this.f2083 = c2450;
        this.f2086 = arrayList2;
        this.f2085 = main2;
    }

    @Override // l.AbstractViewOnClickListenerC5230
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo2119() {
        String strM15030 = m15030();
        String strM15032 = m15032();
        String strM15033 = m15033();
        final C2450 c2450 = this.f2083;
        boolean zMo13919 = c2450.m7922().mo6020().mo13919();
        ArrayList arrayList = this.f2086;
        C0352 c0352 = new C0352(arrayList.size(), zMo13919);
        Iterator it = c2450.m7915().iterator();
        while (it.hasNext()) {
            c0352.m1796(((InterfaceC17889) it.next()).getName());
        }
        ArrayList<C6703> arrayListM47633 = C20815.m47633(arrayList, strM15030, strM15032, strM15033, m15035(), Collections.EMPTY_MAP);
        final ArrayList arrayListM47632 = C20815.m47632(arrayListM47633);
        C20815.m47634(c0352, arrayListM47632);
        final ArrayList arrayList2 = new ArrayList(arrayListM47633.size());
        boolean z = false;
        for (C6703 c6703 : arrayListM47633) {
            if (!c6703.m18264()) {
                z = true;
            }
            arrayList2.add(c6703.m18259());
        }
        Main main = this.f2085;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) new C2072(R.layout.MT_Protector, main, arrayList2));
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        if (strM15030.equals("{P}{S}") && m15032().length() == 0) {
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
        } else if (z) {
            m15028();
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
        } else {
            m15028();
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴܳ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0482.m2118(this.f59400, c2450, arrayListM47632);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb.append(((Spanned) it2.next()).toString());
                    sb.append("\n");
                }
                C4925.m14314((CharSequence) sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2118(C0482 c0482, C2450 c2450, ArrayList arrayList) {
        c0482.m15026();
        c0482.m15034();
        C1188.m4008(c0482.f2084, c2450, arrayList);
    }
}
