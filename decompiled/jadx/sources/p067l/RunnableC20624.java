package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩵ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20624 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C1910 f63701;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Bundle f63702;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C3188 f63703;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f63704;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f63705;

    public RunnableC20624(C2517 c2517, C3188 c3188, String str, Bundle bundle, C1910 c1910) {
        this.f63704 = c2517;
        this.f63703 = c3188;
        this.f63705 = str;
        this.f63702 = bundle;
        this.f63701 = c1910;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11868 c11868 = (C11868) this.f63704.f4113.f48755.getOrDefault(this.f63703.f6126.getBinder(), null);
        Bundle bundle = this.f63702;
        if (c11868 == null) {
            C12826.toString(bundle);
            return;
        }
        String str = this.f63705;
        C5162 c5162 = new C5162(str, this.f63701);
        c5162.m36049();
        if (c5162.m36047()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
