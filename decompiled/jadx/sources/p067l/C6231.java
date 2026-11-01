package p067l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6231 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15461 f15697;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f15698;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f15699;

    public C6231(C15461 c15461, C14121 c14121, String str) {
        this.f15697 = c15461;
        this.f15698 = c14121;
        this.f15699 = str;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        return this.f15697;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f15698.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263("", "Usage: " + this.f15699, arrayList);
    }
}
