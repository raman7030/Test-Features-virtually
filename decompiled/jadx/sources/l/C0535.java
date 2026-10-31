package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0535 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20998 f2196;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f2197;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2198;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2199;

    public C0535(C20998 c20998, C12366 c12366, String str, String str2) {
        this.f2196 = c20998;
        this.f2197 = c12366;
        this.f2198 = str;
        this.f2199 = str2;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7997 mo2262() {
        return this.f2196;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f2197.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941("", "Override: " + this.f2198 + "->" + this.f2199, arrayList);
    }
}
