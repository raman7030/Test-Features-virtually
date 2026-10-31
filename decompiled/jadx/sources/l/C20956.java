package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes4.dex */
public final class C20956 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Main f67724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20045 f67725;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f67726;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f67727 = new ArrayList();

    public C20956(Main main, C13132 c13132) {
        this.f67724 = main;
        TextView textView = (TextView) ((View) c13132.getParent()).findViewById(R.id.MT_Protector);
        C11003.requireNonNull(textView);
        this.f67726 = textView;
        textView.setText(R.string.MT_Protector);
        c13132.setLayoutManager(new C6495(main));
        AbstractC22723 itemAnimator = c13132.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m50782(200L);
            itemAnimator.m50792(200L);
            itemAnimator.m50789(200L);
            itemAnimator.m50786(200L);
        }
        new C1556(new C21456(this)).m5322(c13132);
        C20045 c20045 = new C20045(this);
        this.f67725 = c20045;
        c13132.setAdapter(c20045);
        C15104.m35788().m1668(main, new C9874(1, this));
        main.m124(new RunnableC1709(2, this, c13132));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47772(C20956 c20956, Iterable iterable) {
        TextView textView = c20956.f67726;
        ArrayList arrayList = new ArrayList(c20956.f67727.size() + 1);
        ArrayList arrayList2 = c20956.f67727;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC3817) it.next());
        }
        c20956.f67727 = arrayList;
        C20649.m47228(new C22161(arrayList2, arrayList)).m40148(c20956.f67725);
        if (c20956.f67725.getItemCount() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47773(C20956 c20956, C13132 c13132) {
        c20956.f67726.setTextColor(C21943.f70273);
        C20045 c20045 = new C20045(c20956);
        c20956.f67725 = c20045;
        c13132.setAdapter(c20045);
    }
}
