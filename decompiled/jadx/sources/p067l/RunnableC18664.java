package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ܿۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18664 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean f55729;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f55730;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f55731 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f55732;

    public /* synthetic */ RunnableC18664(ActivityC17874 activityC17874, Intent intent, boolean z) {
        this.f55732 = activityC17874;
        this.f55730 = intent;
        this.f55729 = z;
    }

    public /* synthetic */ RunnableC18664(ActivityC18686 activityC18686, C8362 c8362, boolean z) {
        this.f55732 = c8362;
        this.f55729 = z;
        this.f55730 = activityC18686;
    }

    public /* synthetic */ RunnableC18664(boolean z, ViewOnClickListenerC20541 viewOnClickListenerC20541, AbstractC17043 abstractC17043) {
        this.f55729 = z;
        this.f55732 = viewOnClickListenerC20541;
        this.f55730 = abstractC17043;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55731) {
            case 0:
                ActivityC17874.m40631((ActivityC17874) this.f55732, (Intent) this.f55730, this.f55729);
                break;
            case 1:
                ViewOnClickListenerC20541.m46394(this.f55729, (ViewOnClickListenerC20541) this.f55732, (AbstractC17043) this.f55730);
                break;
            default:
                C8362.m19319((ActivityC18686) this.f55730, (C8362) this.f55732, this.f55729);
                break;
        }
    }
}
