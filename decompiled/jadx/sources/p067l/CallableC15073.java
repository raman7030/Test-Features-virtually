package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۬᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC15073 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13733 f43058;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f43059;

    public /* synthetic */ CallableC15073(C13733 c13733, int i) {
        this.f43058 = c13733;
        this.f43059 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C13733 c13733 = this.f43058;
        return C19117.m43431(new C6867(c13733.f38813.f8828.f43813), this.f43059, new C12392(c13733));
    }
}
