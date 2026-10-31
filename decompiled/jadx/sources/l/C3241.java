package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3241 implements InterfaceC1645, DoubleConsumer, InterfaceC12433 {
    public boolean a = false;
    public double b;
    public final /* synthetic */ InterfaceC8160 c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C11003.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (AbstractC15920.a) {
            AbstractC15920.a(C3241.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // l.InterfaceC1645, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        C11003.requireNonNull(consumer);
        if (AbstractC15920.a) {
            AbstractC15920.a(C3241.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        C11003.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C11708(consumer, 0));
    }

    public C3241(InterfaceC8160 interfaceC8160) {
        this.c = interfaceC8160;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // l.InterfaceC1645
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
