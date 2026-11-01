package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.֡᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 194I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC2986 extends AbstractActivityC5549 {
    /* JADX INFO: renamed from: ۨ */
    public abstract void mo5002();

    /* JADX INFO: renamed from: ᩺ */
    public boolean mo5003() {
        return true;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12275();
        mo5002();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!mo5003() || isFinishing()) {
            return;
        }
        finish();
    }
}
