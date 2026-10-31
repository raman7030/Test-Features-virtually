package l;

import android.os.Handler;
import android.text.Editable;

/* JADX INFO: renamed from: l.ۘۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3651 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC2240 f11511;

    public C3651(RunnableC2240 runnableC2240) {
        this.f11511 = runnableC2240;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Handler handlerM14324 = C4925.m14324();
        RunnableC2240 runnableC2240 = this.f11511;
        handlerM14324.removeCallbacks(runnableC2240);
        handlerM14324.postDelayed(runnableC2240, 300L);
    }
}
