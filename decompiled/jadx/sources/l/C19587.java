package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19587 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11505 f63279;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f63280;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63281;

    public C19587(C11505 c11505, C12366 c12366, String str) {
        this.f63279 = c11505;
        this.f63280 = c12366;
        this.f63281 = str;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        return this.f63279;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f63280.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941("", "Subclasses: " + this.f63281, arrayList);
    }
}
