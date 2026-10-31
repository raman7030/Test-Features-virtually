package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ᩴۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18503 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21529 f57344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f57345;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f57346;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f57347;

    public RunnableC18503(C0157 c0157, C0863 c0863, String str, Bundle bundle, C21529 c21529) {
        this.f57346 = c0157;
        this.f57347 = c0863;
        this.f57345 = str;
        this.f57344 = c21529;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C9996) this.f57346.f1338.f45642.getOrDefault(this.f57347.f3353.getBinder(), null)) == null) {
            return;
        }
        String str = this.f57345;
        C4351 c4351 = new C4351(str, this.f57344);
        c4351.m33913(4);
        c4351.m33915();
        if (!c4351.m33914()) {
            throw new IllegalStateException(C20094.m46315("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
