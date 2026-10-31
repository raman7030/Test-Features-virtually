package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.᩶᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20489 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4966 f66054;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C20489(C4966 c4966) {
        this.f66054 = c4966;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C13132 c13132 = (C13132) this.f66054.f15650.findViewWithTag(C13132.TAG + tab.getPosition());
        if (c13132 != null) {
            c13132.scrollToPosition(0);
        }
    }
}
