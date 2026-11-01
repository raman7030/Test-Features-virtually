package p067l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۙܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6926 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC2822 f18028;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C6926(ActivityC2822 activityC2822) {
        this.f18028 = activityC2822;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        this.f18028.f4839.mo4067(Integer.valueOf(tab.getPosition()));
    }
}
