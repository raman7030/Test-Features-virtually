package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5686 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13733 f13863;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f13864;

    public /* synthetic */ CallableC5686(C13733 c13733, int i) {
        this.f13863 = c13733;
        this.f13864 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C13733 c13733 = this.f13863;
        return C19117.m43431(new C6867(c13733.f38813.f8843.f43813), this.f13864, new C12392(c13733));
    }
}
