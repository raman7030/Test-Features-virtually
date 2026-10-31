package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ܿۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17146 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52546;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52547;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52548 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52549;

    public /* synthetic */ RunnableC17146(ActivityC16315 activityC16315, Intent intent, boolean z) {
        this.f52549 = activityC16315;
        this.f52547 = intent;
        this.f52546 = z;
    }

    public /* synthetic */ RunnableC17146(ActivityC17169 activityC17169, C6306 c6306, boolean z) {
        this.f52549 = c6306;
        this.f52546 = z;
        this.f52547 = activityC17169;
    }

    public /* synthetic */ RunnableC17146(boolean z, ViewOnClickListenerC19121 viewOnClickListenerC19121, AbstractC15440 abstractC15440) {
        this.f52546 = z;
        this.f52549 = viewOnClickListenerC19121;
        this.f52547 = abstractC15440;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52548) {
            case 0:
                ActivityC16315.m38416((ActivityC16315) this.f52549, (Intent) this.f52547, this.f52546);
                break;
            case 1:
                ViewOnClickListenerC19121.m44100(this.f52546, (ViewOnClickListenerC19121) this.f52549, (AbstractC15440) this.f52547);
                break;
            default:
                C6306.m17379((ActivityC17169) this.f52547, (C6306) this.f52549, this.f52546);
                break;
        }
    }
}
