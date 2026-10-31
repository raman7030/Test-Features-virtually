package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1606 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final HashSet f5660;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5661 = 0;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final int f5662;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo5465(C7705 c7705, C7055 c7055) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo5466(C7705 c7705, C2095 c2095, Object obj) {
        return false;
    }

    static {
        HashSet hashSetM35585 = C15045.m35585(2);
        Collections.addAll(hashSetM35585, "bottom_toolbar_padding_type", "keep_in_editor_options");
        f5660 = hashSetM35585;
    }

    public AbstractActivityC1606(int i) {
        this.f5662 = i;
        m10242();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.string.MT_Protector);
        m10241(R.layout.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC14054(0, this));
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("layoutID", this.f5662);
            String stringExtra = getIntent().getStringExtra("scrollTo");
            if (stringExtra != null) {
                bundle2.putString("scrollTo", stringExtra);
            }
            C7705 c7705 = new C7705();
            c7705.setArguments(bundle2);
            AbstractC16882 abstractC16882M14900 = m2843().m14900();
            abstractC16882M14900.m39679(R.id.MT_Protector, c7705, null);
            abstractC16882M14900.mo39685();
        }
    }
}
