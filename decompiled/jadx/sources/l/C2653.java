package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2653 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23819 f8346;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f8347;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8348;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8349;

    public C2653(C23819 c23819, C12366 c12366, String str, String str2) {
        this.f8346 = c23819;
        this.f8347 = c12366;
        this.f8348 = str;
        this.f8349 = str2;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        return this.f8346;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f8347.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941("", "Usage: " + this.f8348 + "->" + this.f8349, arrayList);
    }
}
