package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6394 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19791 = 0;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f19792 = new ArrayList();

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C1556 f19793;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "ToolMenuEditActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC19142(1, this));
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector);
        final C15565 c15565 = new C15565(this);
        c13132.setAdapter(c15565);
        C13265.m32222().m1668(this, new InterfaceC1008() { // from class: l.ۚ᩻ܿ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                ActivityC6394.m17722(this.f17545, c15565);
            }
        });
        C1556 c1556 = new C1556(new C8511(this));
        this.f19793 = c1556;
        c1556.m5322(c13132);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17722(ActivityC6394 activityC6394, C15565 c15565) {
        ArrayList arrayList = activityC6394.f19792;
        arrayList.clear();
        arrayList.add(new C21917(0, R.string.MT_Protector));
        for (AbstractC2867 abstractC2867 : C0749.m2883()) {
            if (abstractC2867 == C19095.f60135) {
                arrayList.add(new C21917(1, R.string.MT_Protector));
            } else if (abstractC2867 == C9217.f27906) {
                arrayList.add(new C21917(2, R.string.MT_Protector));
            } else if (!(abstractC2867 instanceof C4278) || ((C4278) abstractC2867).m12864()) {
                arrayList.add(new C4983(activityC6394, abstractC2867));
            }
        }
        c15565.notifyDataSetChanged();
    }
}
