package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC3490 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11957 f11058;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11059;

    public /* synthetic */ CallableC3490(C11957 c11957, int i) {
        this.f11058 = c11957;
        this.f11059 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C11957 c11957 = this.f11058;
        return C17622.m41185(new C4733(c11957.f35803.f6067.f40732), this.f11059, new C10546(c11957));
    }
}
