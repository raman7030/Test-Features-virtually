package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4064 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13776 f12883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f12884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12885;

    public C4064(C13776 c13776, C12366 c12366, String str) {
        this.f12883 = c13776;
        this.f12884 = c12366;
        this.f12885 = str;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        return this.f12883;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f12884.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941("", "Usage: " + this.f12885, arrayList);
    }
}
