package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.֡᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 194I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC0649 extends AbstractActivityC3346 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo2662();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean mo2663() {
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10239();
        mo2662();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!mo2663() || isFinishing()) {
            return;
        }
        finish();
    }
}
