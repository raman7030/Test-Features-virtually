package p067l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.֫ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4188 implements InterfaceC12009 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC17598 f9219;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TabLayout.Tab f9220;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ TabLayout.Tab f9221;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ TabLayout f9222;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ TabLayout.Tab f9223;

    public C4188(ActivityC17598 activityC17598, TabLayout tabLayout, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f9219 = activityC17598;
        this.f9222 = tabLayout;
        this.f9220 = tab;
        this.f9221 = tab2;
        this.f9223 = tab3;
    }

    @Override // p067l.InterfaceC12009
    /* JADX INFO: renamed from: ۧ */
    public final void mo8483(C6644 c6644) {
        mo8480(c6644);
    }

    @Override // p067l.InterfaceC12009
    /* JADX INFO: renamed from: ֫ */
    public final void mo8480(C6644 c6644) {
        ActivityC17598 activityC17598 = this.f9219;
        activityC17598.f52601 = c6644;
        activityC17598.m40079();
    }

    @Override // p067l.InterfaceC12009
    /* JADX INFO: renamed from: ֫ */
    public final void mo8482(boolean z, boolean z2) {
        ActivityC17598 activityC17598 = this.f9219;
        if (activityC17598.f52592 != null) {
            activityC17598.f52592.setEnabled(z);
        }
        if (activityC17598.f52593 != null) {
            activityC17598.f52593.setEnabled(z2);
        }
    }

    @Override // p067l.InterfaceC12009
    /* JADX INFO: renamed from: ֫ */
    public final void mo8479(int i) {
        TabLayout tabLayout = this.f9222;
        if (i == 0) {
            tabLayout.selectTab(this.f9220);
        } else if (i == 1) {
            tabLayout.selectTab(this.f9221);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.selectTab(this.f9223);
        }
    }

    @Override // p067l.InterfaceC12009
    /* JADX INFO: renamed from: ֫ */
    public final void mo8481(boolean z) {
        ActivityC17598 activityC17598 = this.f9219;
        activityC17598.f13392.setSubtitle(z ? activityC17598.f52600 : activityC17598.f52596);
        if (activityC17598.f52594 != null) {
            activityC17598.f52594.setEnabled(z);
        }
    }
}
