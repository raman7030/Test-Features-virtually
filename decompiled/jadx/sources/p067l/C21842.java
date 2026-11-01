package p067l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.᩶᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21842 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C7089 f68733;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C21842(C7089 c7089) {
        this.f68733 = c7089;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C14849 c14849 = (C14849) this.f68733.f18484.findViewWithTag(C14849.TAG + tab.getPosition());
        if (c14849 != null) {
            c14849.scrollToPosition(0);
        }
    }
}
