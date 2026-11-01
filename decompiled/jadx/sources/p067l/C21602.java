package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21602 implements Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3437 f68091a;

    public /* synthetic */ C21602(InterfaceC3437 interfaceC3437) {
        this.f68091a = interfaceC3437;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m48803a(InterfaceC3437 interfaceC3437) {
        if (interfaceC3437 == null) {
            return null;
        }
        if (interfaceC3437 instanceof C22943) {
            return ((C22943) interfaceC3437).f72187a;
        }
        if (interfaceC3437 instanceof InterfaceC10124) {
            return C7442.m17190a((InterfaceC10124) interfaceC3437);
        }
        if (interfaceC3437 instanceof InterfaceC20202) {
            return C21524.m48720a((InterfaceC20202) interfaceC3437);
        }
        return interfaceC3437 instanceof InterfaceC2766 ? C10202.m23795a((InterfaceC2766) interfaceC3437) : new C21602(interfaceC3437);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f68091a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC3437 interfaceC3437 = this.f68091a;
        if (obj instanceof C21602) {
            obj = ((C21602) obj).f68091a;
        }
        return interfaceC3437.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f68091a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f68091a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f68091a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f68091a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f68091a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f68091a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f68091a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f68091a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f68091a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return m48803a(this.f68091a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C10143.convert(this.f68091a.trySplit());
    }
}
