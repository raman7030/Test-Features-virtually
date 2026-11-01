package p067l;

import android.os.Bundle;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC3895 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ܳۧ */
    public static final HashSet f8440;

    /* JADX INFO: renamed from: ܿۧ */
    public static final /* synthetic */ int f8441 = 0;

    /* JADX INFO: renamed from: ᩳۧ */
    public final int f8442;

    /* JADX INFO: renamed from: ֫ */
    public void mo7695(C9692 c9692, C9074 c9074) {
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo7696(C9692 c9692, C4360 c4360, Object obj) {
        return false;
    }

    static {
        HashSet hashSetM37743 = C16667.m37743(2);
        Collections.addAll(hashSetM37743, "bottom_toolbar_padding_type", "keep_in_editor_options");
        f8440 = hashSetM37743;
    }

    public AbstractActivityC3895(int i) {
        this.f8442 = i;
        m12278();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.string.MT_Protector);
        m12277(R.layout.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC15726(0, this));
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("layoutID", this.f8442);
            String stringExtra = getIntent().getStringExtra("scrollTo");
            if (stringExtra != null) {
                bundle2.putString("scrollTo", stringExtra);
            }
            C9692 c9692 = new C9692();
            c9692.setArguments(bundle2);
            AbstractC18413 abstractC18413M16810 = m5172().m16810();
            abstractC18413M16810.m41920(R.id.MT_Protector, c9692, null);
            abstractC18413M16810.mo41926();
        }
    }
}
