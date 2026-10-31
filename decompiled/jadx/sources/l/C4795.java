package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۙܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4795 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f15196;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C4795(ActivityC0477 activityC0477) {
        this.f15196 = activityC0477;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        this.f15196.f2065.mo1669(Integer.valueOf(tab.getPosition()));
    }
}
