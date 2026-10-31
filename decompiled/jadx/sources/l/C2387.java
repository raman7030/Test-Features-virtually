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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2387 extends AbstractViewOnClickListenerC5230 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f7613;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18615 f7614;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f7615;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f7616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map f7617;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f7618;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f7619;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387(C18615 c18615, Main main, ArrayList arrayList, boolean z, boolean z2, C2450 c2450, ArrayList arrayList2, Main main2) {
        super(main, arrayList, z, z2);
        this.f7614 = c18615;
        this.f7618 = c2450;
        this.f7613 = arrayList2;
        this.f7615 = main2;
        this.f7616 = false;
        this.f7619 = false;
        this.f7617 = Collections.EMPTY_MAP;
    }

    @Override // l.AbstractViewOnClickListenerC5230
    /* JADX INFO: renamed from: ۜ */
    public final void mo2119() {
        String strM15030 = m15030();
        boolean z = !this.f7616 && (strM15030.contains("{AN}") || strM15030.contains("{AP}") || strM15030.contains("{AV}") || strM15030.contains("{AC}"));
        boolean z2 = !this.f7619 && strM15030.contains("{E}");
        if (!z && !z2) {
            m7726(strM15030);
        } else {
            new C15791(this, z, z2, strM15030).m20274();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m7726(String str) {
        String strM15032 = m15032();
        String strM15033 = m15033();
        final C2450 c2450 = this.f7618;
        boolean z = false;
        AbstractC15440 abstractC15440M39866 = C16999.m39866(c2450.m7926(), new String[0]);
        List listMo23549 = abstractC15440M39866.mo23549(true);
        boolean zM39874 = C16999.m39874(abstractC15440M39866, listMo23549);
        ArrayList arrayList = this.f7613;
        C0352 c0352 = new C0352(arrayList.size(), zM39874);
        Iterator it = listMo23549.iterator();
        while (it.hasNext()) {
            c0352.m1796(((AbstractC15440) it.next()).getName());
        }
        ArrayList<C6703> arrayListM47633 = C20815.m47633(arrayList, str, strM15032, strM15033, m15035(), this.f7617);
        final ArrayList arrayListM47632 = C20815.m47632(arrayListM47633);
        C20815.m47634(c0352, arrayListM47632);
        ArrayList arrayList2 = new ArrayList(arrayListM47633.size());
        for (C6703 c6703 : arrayListM47633) {
            if (!c6703.m18264()) {
                z = true;
            }
            arrayList2.add(c6703.m18259());
        }
        Main main = this.f7615;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) new C2072(R.layout.MT_Protector, main, arrayList2));
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        if (str.equals("{P}{S}") && m15032().isEmpty()) {
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
        } else if (z) {
            m15028();
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
        } else {
            m15028();
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ۟ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2387.m7728(this.f26600, c2450, arrayListM47632);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC14274(4, arrayList2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7728(C2387 c2387, C2450 c2450, ArrayList arrayList) {
        c2387.m15026();
        c2387.m15034();
        C18615.m43156(c2387.f7614, c2450, arrayList);
    }
}
