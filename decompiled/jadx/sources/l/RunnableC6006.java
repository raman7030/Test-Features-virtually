package l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6006 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18445;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11651 f18446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntentSender.SendIntentException f18447;

    public RunnableC6006(C11651 c11651, int i, IntentSender.SendIntentException sendIntentException) {
        this.f18446 = c11651;
        this.f18445 = i;
        this.f18447 = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18446.m45061(this.f18445, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f18447));
    }
}
