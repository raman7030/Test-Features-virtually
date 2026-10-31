package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֨ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC1205 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15315 f4352;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8967 f4353;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f4354;

    public /* synthetic */ CallableC1205(C15315 c15315, C8967 c8967, long j) {
        this.f4352 = c15315;
        this.f4353 = c8967;
        this.f4354 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C22372 c22372 = this.f4352.f46970;
        C8967 c8967 = this.f4353;
        if (!c8967.m23130()) {
            return null;
        }
        c8967.m23129();
        if (!c8967.m23130()) {
            return null;
        }
        c22372.m5407(this.f4354);
        c22372.m5416(true);
        return null;
    }
}
