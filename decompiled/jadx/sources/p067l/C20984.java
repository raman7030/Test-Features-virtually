package p067l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20984 implements InterfaceC21369 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13303 f65896;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f65897;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f65898;

    public C20984(C13303 c13303, C14121 c14121, String str) {
        this.f65896 = c13303;
        this.f65897 = c14121;
        this.f65898 = str;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9969 mo4629() {
        return this.f65896;
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final void mo4630(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f65897.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // p067l.InterfaceC21369
    /* JADX INFO: renamed from: ֫ */
    public final C3263 mo4628(ArrayList arrayList) {
        return new C3263("", "Subclasses: " + this.f65898, arrayList);
    }
}
