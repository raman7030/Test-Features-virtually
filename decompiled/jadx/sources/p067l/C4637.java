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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes2.dex */
public final class C4637 extends AbstractViewOnClickListenerC7339 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ ArrayList f10404;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C20060 f10405;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ Main f10406;

    /* JADX INFO: renamed from: ۨ */
    public boolean f10407;

    /* JADX INFO: renamed from: ܰ */
    public Map f10408;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C4697 f10409;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f10410;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4637(C20060 c20060, Main main, ArrayList arrayList, boolean z, boolean z2, C4697 c4697, ArrayList arrayList2, Main main2) {
        super(main, arrayList, z, z2);
        this.f10405 = c20060;
        this.f10409 = c4697;
        this.f10404 = arrayList2;
        this.f10406 = main2;
        this.f10407 = false;
        this.f10410 = false;
        this.f10408 = Collections.EMPTY_MAP;
    }

    @Override // p067l.AbstractViewOnClickListenerC7339
    /* JADX INFO: renamed from: ۜ */
    public final void mo4502() {
        String strM16940 = m16940();
        boolean z = !this.f10407 && (strM16940.contains("{AN}") || strM16940.contains("{AP}") || strM16940.contains("{AV}") || strM16940.contains("{AC}"));
        boolean z2 = !this.f10410 && strM16940.contains("{E}");
        if (!z && !z2) {
            m9787(strM16940);
        } else {
            new C17376(this, z, z2, strM16940).m22250();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m9787(String str) {
        String strM16942 = m16942();
        String strM16943 = m16943();
        final C4697 c4697 = this.f10409;
        boolean z = false;
        AbstractC17043 abstractC17043M42109 = C18524.m42109(c4697.m9974(), new String[0]);
        List listMo25500 = abstractC17043M42109.mo25500(true);
        boolean zM42117 = C18524.m42117(abstractC17043M42109, listMo25500);
        ArrayList arrayList = this.f10404;
        C2703 c2703 = new C2703(arrayList.size(), zM42117);
        Iterator it = listMo25500.iterator();
        while (it.hasNext()) {
            c2703.m4195(((AbstractC17043) it.next()).getName());
        }
        ArrayList<C8739> arrayListM49961 = C22151.m49961(arrayList, str, strM16942, strM16943, m16945(), this.f10408);
        final ArrayList arrayListM49960 = C22151.m49960(arrayListM49961);
        C22151.m49962(c2703, arrayListM49960);
        ArrayList arrayList2 = new ArrayList(arrayListM49961.size());
        for (C8739 c8739 : arrayListM49961) {
            if (!c8739.m20212()) {
                z = true;
            }
            arrayList2.add(c8739.m20207());
        }
        Main main = this.f10406;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(listView);
        listView.setAdapter((ListAdapter) new C4338(R.layout.MT_Protector, main, arrayList2));
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        if (str.equals("{P}{S}") && m16942().isEmpty()) {
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
        } else if (z) {
            m16938();
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
        } else {
            m16938();
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ۟ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C4637.m9789(this.f29525, c4697, arrayListM49960);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732().m3861().setOnClickListener(new ViewOnClickListenerC15934(4, arrayList2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9789(C4637 c4637, C4697 c4697, ArrayList arrayList) {
        c4637.m16936();
        c4637.m16944();
        C20060.m45421(c4637.f10405, c4697, arrayList);
    }
}
