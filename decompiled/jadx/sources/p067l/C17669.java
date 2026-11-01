package p067l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17669 implements InterfaceC8054 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C22103 f52754;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f52755;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C20689 f52756;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AtomicReference f52757;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ArrayList f52758;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2917 f52759;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AtomicInteger f52760;

    public /* synthetic */ C17669(C2917 c2917, AtomicInteger atomicInteger, ArrayList arrayList, int i, C22103 c22103, AtomicReference atomicReference, C20689 c20689) {
        this.f52759 = c2917;
        this.f52760 = atomicInteger;
        this.f52758 = arrayList;
        this.f52755 = i;
        this.f52754 = c22103;
        this.f52757 = atomicReference;
        this.f52756 = c20689;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C2917.m4725(this.f52759, this.f52760, this.f52758, this.f52755, this.f52754, this.f52757, this.f52756, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo18722((Integer) obj);
    }

    @Override // p067l.InterfaceC8054
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo18722(Integer num) {
        C12078.m27664((InterfaceC8054) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C12078.m27663((InterfaceC8054) this, intConsumer);
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
