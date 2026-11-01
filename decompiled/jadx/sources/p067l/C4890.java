package p067l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4890 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C25006 f11140;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f11141;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f11142;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f11143;

    public C4890(C25006 c25006, C14121 c14121, String str, String str2) {
        this.f11140 = c25006;
        this.f11141 = c14121;
        this.f11142 = str;
        this.f11143 = str2;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        return this.f11140;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f11141.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263("", "Usage: " + this.f11142 + "->" + this.f11143, arrayList);
    }
}
