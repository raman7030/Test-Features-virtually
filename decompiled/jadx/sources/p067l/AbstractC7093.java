package p067l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ۙ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7093 extends AbstractC17150 {

    /* JADX INFO: renamed from: ۙ */
    public final Handler f18496;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC7291 f18497;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC3069 f18498;

    /* JADX INFO: renamed from: ᩹ */
    public final ActivityC3069 f18499;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo16333(PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: ۜ */
    public abstract LayoutInflater mo16334();

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo16335(String str);

    /* JADX INFO: renamed from: ܳ */
    public abstract ActivityC3069 mo16336();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo16340();

    public AbstractC7093(ActivityC3069 activityC3069) {
        Handler handler = new Handler();
        this.f18497 = new C3267();
        this.f18498 = activityC3069;
        this.f18499 = activityC3069;
        this.f18496 = handler;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16331(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f18499.startActivity(intent, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m16332(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        this.f18498.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Activity m16337() {
        return this.f18498;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Context m16339() {
        return this.f18499;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Handler m16338() {
        return this.f18496;
    }
}
