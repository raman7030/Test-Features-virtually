package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20237 implements Spliterator.OfPrimitive {
    public final /* synthetic */ InterfaceC1124 a;

    public /* synthetic */ C20237(InterfaceC1124 interfaceC1124) {
        this.a = interfaceC1124;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(InterfaceC1124 interfaceC1124) {
        if (interfaceC1124 == null) {
            return null;
        }
        if (interfaceC1124 instanceof C21648) {
            return ((C21648) interfaceC1124).a;
        }
        if (interfaceC1124 instanceof InterfaceC8160) {
            return C5338.a((InterfaceC8160) interfaceC1124);
        }
        if (interfaceC1124 instanceof InterfaceC18764) {
            return C20155.a((InterfaceC18764) interfaceC1124);
        }
        return interfaceC1124 instanceof InterfaceC0418 ? C8242.a((InterfaceC0418) interfaceC1124) : new C20237(interfaceC1124);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1124 interfaceC1124 = this.a;
        if (obj instanceof C20237) {
            obj = ((C20237) obj).a;
        }
        return interfaceC1124.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C8180.convert(this.a.trySplit());
    }
}
