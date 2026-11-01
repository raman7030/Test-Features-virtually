package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֨ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC3514 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16924 f7121;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C10891 f7122;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ long f7123;

    public /* synthetic */ CallableC3514(C16924 c16924, C10891 c10891, long j) {
        this.f7121 = c16924;
        this.f7122 = c10891;
        this.f7123 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C23631 c23631 = this.f7121.f50095;
        C10891 c10891 = this.f7122;
        if (!c10891.m25104()) {
            return null;
        }
        c10891.m25103();
        if (!c10891.m25104()) {
            return null;
        }
        c23631.m7636(this.f7123);
        c23631.m7645(true);
        return null;
    }
}
