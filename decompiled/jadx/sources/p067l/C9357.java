package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.۟۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9357 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC17598 f25483;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TabLayout.Tab f25484;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ TabLayout.Tab f25485;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ TabLayout.Tab f25486;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C9357(ActivityC17598 activityC17598, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f25483 = activityC17598;
        this.f25484 = tab;
        this.f25485 = tab2;
        this.f25486 = tab3;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        TabLayout.Tab tab2 = this.f25484;
        ActivityC17598 activityC17598 = this.f25483;
        if (tab == tab2) {
            activityC17598.f52598.m34980(0);
            if (activityC17598.f52598.m35000()) {
                return;
            }
            C22682.m50801();
            return;
        }
        if (tab == this.f25485) {
            activityC17598.f52598.m34980(1);
            if (activityC17598.f52598.m35000()) {
                return;
            }
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (tab == this.f25486) {
            activityC17598.f52598.m34980(2);
            if (activityC17598.f52598.m35000()) {
                return;
            }
            C22682.m50801();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        ActivityC17598 activityC17598 = this.f25483;
        activityC17598.f52598.m34995(!activityC17598.f52598.m34999());
    }
}
