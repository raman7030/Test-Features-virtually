package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3180 implements InterfaceC8160 {
    public long a;
    public final long b;
    public final double c;
    public final double d;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC16169.b(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC16169.g(this, consumer);
    }

    public C3180(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    @Override // l.InterfaceC15234
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3180 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C3180(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        doubleConsumer.accept(C14468.current().a(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C14468 c14468Current = C14468.current();
            do {
                doubleConsumer.accept(c14468Current.a(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
