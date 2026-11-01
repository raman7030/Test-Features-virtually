package p067l;

import android.os.Handler;
import android.text.Editable;

/* JADX INFO: renamed from: l.ۘۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5838 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ RunnableC4497 f14317;

    public C5838(RunnableC4497 runnableC4497) {
        this.f14317 = runnableC4497;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Handler handlerM16221 = C7050.m16221();
        RunnableC4497 runnableC4497 = this.f14317;
        handlerM16221.removeCallbacks(runnableC4497);
        handlerM16221.postDelayed(runnableC4497, 300L);
    }
}
