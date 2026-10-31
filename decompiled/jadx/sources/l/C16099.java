package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16099 implements InterfaceC5982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20765 f49591;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49592;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f49593;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f49594;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f49595;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0577 f49596;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f49597;

    public /* synthetic */ C16099(C0577 c0577, AtomicInteger atomicInteger, ArrayList arrayList, int i, C20765 c20765, AtomicReference atomicReference, C19277 c19277) {
        this.f49596 = c0577;
        this.f49597 = atomicInteger;
        this.f49595 = arrayList;
        this.f49592 = i;
        this.f49591 = c20765;
        this.f49594 = atomicReference;
        this.f49593 = c19277;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C0577.m2354(this.f49596, this.f49597, this.f49595, this.f49592, this.f49591, this.f49594, this.f49593, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16796((Integer) obj);
    }

    @Override // l.InterfaceC5982
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo16796(Integer num) {
        C10216.m25642((InterfaceC5982) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C10216.m25641((InterfaceC5982) this, intConsumer);
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
