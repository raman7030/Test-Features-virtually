package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܰܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC15582 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f44515;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f44516;

    public /* synthetic */ CallableC15582(int i, Object obj) {
        this.f44515 = i;
        this.f44516 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f44515) {
            case 0:
                return Boolean.valueOf(C24971.m54863(((C16433) this.f44516).f48297.m32725()));
            default:
                C15112 c15112 = (C15112) this.f44516;
                return Integer.valueOf(C21089.m47596(c15112.f43142, c15112.f43143, c15112.f43144, c15112.f43146, c15112.f43145));
        }
    }
}
