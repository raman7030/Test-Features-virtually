package p067l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2877 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22325 f4969;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f4970;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f4971;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f4972;

    public C2877(C22325 c22325, C14121 c14121, String str, String str2) {
        this.f4969 = c22325;
        this.f4970 = c14121;
        this.f4971 = str;
        this.f4972 = str2;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        return this.f4969;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f4970.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263("", "Override: " + this.f4971 + "->" + this.f4972, arrayList);
    }
}
