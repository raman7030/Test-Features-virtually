package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5391 implements InterfaceC10124 {

    /* JADX INFO: renamed from: a */
    public long f12838a;

    /* JADX INFO: renamed from: b */
    public final long f12839b;

    /* JADX INFO: renamed from: c */
    public final double f12840c;

    /* JADX INFO: renamed from: d */
    public final double f12841d;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17728;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    public C5391(long j, long j2, double d, double d2) {
        this.f12838a = j;
        this.f12839b = j2;
        this.f12840c = d;
        this.f12841d = d2;
    }

    @Override // p067l.InterfaceC16847
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5391 trySplit() {
        long j = this.f12838a;
        long j2 = (this.f12839b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f12838a = j2;
        return new C5391(j, j2, this.f12840c, this.f12841d);
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f12839b - this.f12838a;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f12838a;
        if (j >= this.f12839b) {
            return false;
        }
        doubleConsumer.accept(C16119.current().m36699a(this.f12840c, this.f12841d));
        this.f12838a = j + 1;
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f12838a;
        long j2 = this.f12839b;
        if (j < j2) {
            this.f12838a = j2;
            C16119 c16119Current = C16119.current();
            do {
                doubleConsumer.accept(c16119Current.m36699a(this.f12840c, this.f12841d));
                j++;
            } while (j < j2);
        }
    }
}
