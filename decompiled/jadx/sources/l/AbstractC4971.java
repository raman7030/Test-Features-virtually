package l;

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
public abstract class AbstractC4971 extends AbstractC15553 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f15662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC5180 f15663;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC0737 f15664;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ActivityC0737 f15665;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo14429(PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract LayoutInflater mo14430();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo14431(String str);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract ActivityC0737 mo14432();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo14436();

    public AbstractC4971(ActivityC0737 activityC0737) {
        Handler handler = new Handler();
        this.f15663 = new C0946();
        this.f15664 = activityC0737;
        this.f15665 = activityC0737;
        this.f15662 = handler;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14427(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f15665.startActivity(intent, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14428(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        this.f15664.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Activity m14433() {
        return this.f15664;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context m14435() {
        return this.f15665;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler m14434() {
        return this.f15662;
    }
}
