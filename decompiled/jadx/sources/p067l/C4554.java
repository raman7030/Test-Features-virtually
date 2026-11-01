package p067l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۖۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4554 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ RunnableC24670 f10212;

    public C4554(RunnableC24670 runnableC24670) {
        this.f10212 = runnableC24670;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f10212.run();
    }
}
