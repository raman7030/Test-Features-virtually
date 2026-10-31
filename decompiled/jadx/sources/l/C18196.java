package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ᩳܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18196 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23840 f56577;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C18196(C23840 c23840) {
        this.f56577 = c23840;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C13132 c13132 = (C13132) this.f56577.f77138.findViewWithTag(C13132.TAG + tab.getPosition());
        if (c13132 != null) {
            c13132.scrollToPosition(0);
        }
    }
}
