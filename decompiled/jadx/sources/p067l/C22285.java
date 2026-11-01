package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes4.dex */
public final class C22285 {

    /* JADX INFO: renamed from: ֫ */
    public final Main f70409;

    /* JADX INFO: renamed from: ۧ */
    public C21419 f70410;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f70411;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f70412 = new ArrayList();

    public C22285(Main main, C14849 c14849) {
        this.f70409 = main;
        TextView textView = (TextView) ((View) c14849.getParent()).findViewById(R.id.MT_Protector);
        C12826.requireNonNull(textView);
        this.f70411 = textView;
        textView.setText(R.string.MT_Protector);
        c14849.setLayoutManager(new C8541(main));
        AbstractC23964 itemAnimator = c14849.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m53108(200L);
            itemAnimator.m53118(200L);
            itemAnimator.m53115(200L);
            itemAnimator.m53112(200L);
        }
        new C3847(new C22760(this)).m7551(c14849);
        C21419 c21419 = new C21419(this);
        this.f70410 = c21419;
        c14849.setAdapter(c21419);
        C16723.m37946().m4066(main, new C11753(1, this));
        main.m122(new RunnableC3993(2, this, c14849));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50102(C22285 c22285, Iterable iterable) {
        TextView textView = c22285.f70411;
        ArrayList arrayList = new ArrayList(c22285.f70412.size() + 1);
        ArrayList arrayList2 = c22285.f70412;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC5996) it.next());
        }
        c22285.f70412 = arrayList;
        C21993.m49555(new C23430(arrayList2, arrayList)).m42393(c22285.f70410);
        if (c22285.f70410.getItemCount() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50103(C22285 c22285, C14849 c14849) {
        c22285.f70411.setTextColor(C23223.f72984);
        C21419 c21419 = new C21419(c22285);
        c22285.f70410 = c21419;
        c14849.setAdapter(c21419);
    }
}
