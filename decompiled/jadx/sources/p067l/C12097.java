package p067l;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۤۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12097 implements InterfaceC3932, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f33818a;

    public /* synthetic */ C12097(PrimitiveIterator.OfDouble ofDouble) {
        this.f33818a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f33818a;
        if (obj instanceof C12097) {
            obj = ((C12097) obj).f33818a;
        }
        return ofDouble.equals(obj);
    }

    @Override // p067l.InterfaceC22214
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33818a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC3932, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33818a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p067l.InterfaceC3932
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f33818a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f33818a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33818a.hashCode();
    }

    @Override // p067l.InterfaceC3932, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f33818a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f33818a.next();
    }

    @Override // p067l.InterfaceC3932
    public final /* synthetic */ double nextDouble() {
        return this.f33818a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f33818a.remove();
    }
}
