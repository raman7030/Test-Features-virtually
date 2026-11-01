package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܿ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC19116 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f57030;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f57031;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ Object f57032;

    public /* synthetic */ CallableC19116(int i, Object obj, Object obj2) {
        this.f57030 = i;
        this.f57031 = obj;
        this.f57032 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f57030) {
            case 0:
                return C16433.m37334((C16433) this.f57031, (String) this.f57032);
            default:
                return ((C4744) this.f57031).mo9708(((AbstractC17043) this.f57032).m38669(), true);
        }
    }
}
