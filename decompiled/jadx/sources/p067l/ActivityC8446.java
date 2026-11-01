package p067l;

import android.os.Bundle;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC8446 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f22664 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public ArrayList f22665 = new ArrayList();

    /* JADX INFO: renamed from: ᩳۧ */
    public C3847 f22666;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ToolMenuEditActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC20561(1, this));
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        final C17162 c17162 = new C17162(this);
        c14849.setAdapter(c17162);
        C14976.m34321().m4066(this, new InterfaceC3326() { // from class: l.ۚ᩻ܿ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ActivityC8446.m19669(this.f20392, c17162);
            }
        });
        C3847 c3847 = new C3847(new C10458(this));
        this.f22666 = c3847;
        c3847.m7551(c14849);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19669(ActivityC8446 activityC8446, C17162 c17162) {
        ArrayList arrayList = activityC8446.f22665;
        arrayList.clear();
        arrayList.add(new C23199(0, R.string.MT_Protector));
        for (AbstractC5094 abstractC5094 : C3081.m5212()) {
            if (abstractC5094 == C20517.f63369) {
                arrayList.add(new C23199(1, R.string.MT_Protector));
            } else if (abstractC5094 == C11129.f30852) {
                arrayList.add(new C23199(2, R.string.MT_Protector));
            } else if (!(abstractC5094 instanceof C6435) || ((C6435) abstractC5094).m14728()) {
                arrayList.add(new C7105(activityC8446, abstractC5094));
            }
        }
        c17162.notifyDataSetChanged();
    }
}
