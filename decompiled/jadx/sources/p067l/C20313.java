package p067l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20313 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC9969 f62746;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f62747;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f62748;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f62749;

    public C20313(InterfaceC9969 interfaceC9969, C14121 c14121, String str, String str2) {
        this.f62746 = interfaceC9969;
        this.f62747 = c14121;
        this.f62748 = str;
        this.f62749 = str2;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        return this.f62746;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f62747.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263("", "Usage: " + this.f62748 + "->" + this.f62749, arrayList);
    }
}
