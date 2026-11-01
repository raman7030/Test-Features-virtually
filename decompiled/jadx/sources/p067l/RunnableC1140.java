package p067l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.ۛۧ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1140 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f21300;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1420 f21301;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ IntentSender.SendIntentException f21302;

    public RunnableC1140(C1420 c1420, int i, IntentSender.SendIntentException sendIntentException) {
        this.f21301 = c1420;
        this.f21300 = i;
        this.f21302 = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21301.m47357(this.f21300, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f21302));
    }
}
