package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܰܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC13903 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41434;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41435;

    public /* synthetic */ CallableC13903(int i, Object obj) {
        this.f41434 = i;
        this.f41435 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f41434) {
            case 0:
                return Boolean.valueOf(C23782.m52454(((C14798) this.f41435).f45183.m30660()));
            default:
                C13408 c13408 = (C13408) this.f41435;
                return Integer.valueOf(C19697.m45299(c13408.f40072, c13408.f40073, c13408.f40074, c13408.f40076, c13408.f40075));
        }
    }
}
