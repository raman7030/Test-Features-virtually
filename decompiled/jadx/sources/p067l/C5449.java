package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5449 implements InterfaceC3932, DoubleConsumer, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public boolean f13007a = false;

    /* JADX INFO: renamed from: b */
    public double f13008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC10124 f13009c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C12826.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(C5449.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // p067l.InterfaceC3932, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        C12826.requireNonNull(consumer);
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(C5449.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        C12826.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C13496(consumer, 0));
    }

    public C5449(InterfaceC10124 interfaceC10124) {
        this.f13009c = interfaceC10124;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f13007a = true;
        this.f13008b = d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f13007a) {
            this.f13009c.tryAdvance((DoubleConsumer) this);
        }
        return this.f13007a;
    }

    @Override // p067l.InterfaceC3932
    public final double nextDouble() {
        if (!this.f13007a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13007a = false;
        return this.f13008b;
    }
}
