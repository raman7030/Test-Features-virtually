package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩵ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19209 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21529 f60470;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f60471;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f60472;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f60473;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60474;

    public RunnableC19209(C0157 c0157, C0863 c0863, String str, Bundle bundle, C21529 c21529) {
        this.f60473 = c0157;
        this.f60472 = c0863;
        this.f60474 = str;
        this.f60471 = bundle;
        this.f60470 = c21529;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9996 c9996 = (C9996) this.f60473.f1338.f45642.getOrDefault(this.f60472.f3353.getBinder(), null);
        Bundle bundle = this.f60471;
        if (c9996 == null) {
            C11003.toString(bundle);
            return;
        }
        String str = this.f60474;
        C2940 c2940 = new C2940(str, this.f60470);
        c2940.m33916();
        if (c2940.m33914()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
