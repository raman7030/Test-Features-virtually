package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܿ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC17621 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53836;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53837;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53838;

    public /* synthetic */ CallableC17621(int i, Object obj, Object obj2) {
        this.f53836 = i;
        this.f53837 = obj;
        this.f53838 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f53836) {
            case 0:
                return C14798.m35187((C14798) this.f53837, (String) this.f53838);
            default:
                return ((C2499) this.f53837).mo7637(((AbstractC15440) this.f53838).m36511(), true);
        }
    }
}
