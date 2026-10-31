package l;

import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.۟۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7353 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f22569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f22570;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f22571;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f22572;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C7353(ActivityC16024 activityC16024, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f22569 = activityC16024;
        this.f22570 = tab;
        this.f22571 = tab2;
        this.f22572 = tab3;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        TabLayout.Tab tab2 = this.f22570;
        ActivityC16024 activityC16024 = this.f22569;
        if (tab == tab2) {
            activityC16024.f49434.m32865(0);
            if (activityC16024.f49434.m32885()) {
                return;
            }
            C21374.m48465();
            return;
        }
        if (tab == this.f22571) {
            activityC16024.f49434.m32865(1);
            if (activityC16024.f49434.m32885()) {
                return;
            }
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (tab == this.f22572) {
            activityC16024.f49434.m32865(2);
            if (activityC16024.f49434.m32885()) {
                return;
            }
            C21374.m48465();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        ActivityC16024 activityC16024 = this.f22569;
        activityC16024.f49434.m32880(!activityC16024.f49434.m32884());
    }
}
