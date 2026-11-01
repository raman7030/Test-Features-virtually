package p067l;

import android.os.Bundle;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11800 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f32954 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public ArrayList f32955 = new ArrayList();

    /* JADX INFO: renamed from: ᩳۧ */
    public C3847 f32956;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "FloatingMenuEditActivity";
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
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC12721(1, this));
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        final C12211 c12211 = new C12211(this);
        c14849.setAdapter(c12211);
        C14976.m34321().m4066(this, new InterfaceC3326() { // from class: l.ۗܳܿ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ActivityC11800.m27049(this.f13154, c12211);
            }
        });
        C3847 c3847 = new C3847(new C14222(this));
        this.f32956 = c3847;
        c3847.m7551(c14849);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27049(ActivityC11800 activityC11800, C12211 c12211) {
        C16353.m37160();
        boolean zM37158 = C16353.m37158();
        ArrayList arrayList = activityC11800.f32955;
        arrayList.clear();
        arrayList.add(new C19175(0));
        arrayList.add(new C8187(0, R.string.MT_Protector));
        for (AbstractC5094 abstractC5094 : C6846.m15684()) {
            if (abstractC5094 == C20517.f63369) {
                arrayList.add(new C8187(1, R.string.MT_Protector));
            } else if (abstractC5094 == C11129.f30852) {
                arrayList.add(new C8187(2, R.string.MT_Protector));
            } else if (zM37158 || !abstractC5094.mo10845().equals("builtin:systemTranslate")) {
                if (!(abstractC5094 instanceof C6435) || ((C6435) abstractC5094).m14728()) {
                    arrayList.add(new C9528(activityC11800, abstractC5094));
                }
            }
        }
        c12211.notifyDataSetChanged();
    }
}
