package p067l;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֡ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC2843 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16924 f4899;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C22961 f4900;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ Bundle f4901;

    public /* synthetic */ CallableC2843(C16924 c16924, C22961 c22961, Bundle bundle) {
        this.f4899 = c16924;
        this.f4900 = c22961;
        this.f4901 = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C23631 c23631 = this.f4899.f50095;
        C20279 c20279 = c23631.f75226;
        Bundle bundle = c23631.f8386;
        C22961 c22961 = this.f4900;
        if (c20279 == c22961.f72228) {
            bundle.clear();
            bundle.putAll(this.f4901);
            c23631.f75217 = null;
            c22961.f72228.f62670.m4836(bundle);
            c23631.m7654();
        }
        return null;
    }
}
