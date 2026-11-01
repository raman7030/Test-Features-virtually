package p067l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ᩳܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19662 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C25026 f59790;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C19662(C25026 c25026) {
        this.f59790 = c25026;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C14849 c14849 = (C14849) this.f59790.f79888.findViewWithTag(C14849.TAG + tab.getPosition());
        if (c14849 != null) {
            c14849.scrollToPosition(0);
        }
    }
}
