package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10143 implements Spliterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC16847 f28090a;

    public /* synthetic */ C10143(InterfaceC16847 interfaceC16847) {
        this.f28090a = interfaceC16847;
    }

    public static /* synthetic */ Spliterator convert(InterfaceC16847 interfaceC16847) {
        if (interfaceC16847 == null) {
            return null;
        }
        if (interfaceC16847 instanceof C5508) {
            return ((C5508) interfaceC16847).f13160a;
        }
        return interfaceC16847 instanceof InterfaceC3437 ? C21602.m48803a((InterfaceC3437) interfaceC16847) : new C10143(interfaceC16847);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f28090a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC16847 interfaceC16847 = this.f28090a;
        if (obj instanceof C10143) {
            obj = ((C10143) obj).f28090a;
        }
        return interfaceC16847.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f28090a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f28090a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f28090a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f28090a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f28090a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f28090a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f28090a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return convert(this.f28090a.trySplit());
    }
}
