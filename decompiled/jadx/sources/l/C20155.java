package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩶ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20155 implements Spliterator.OfInt {
    public final /* synthetic */ InterfaceC18764 a;

    public /* synthetic */ C20155(InterfaceC18764 interfaceC18764) {
        this.a = interfaceC18764;
    }

    public static /* synthetic */ Spliterator.OfInt a(InterfaceC18764 interfaceC18764) {
        if (interfaceC18764 == null) {
            return null;
        }
        return interfaceC18764 instanceof C21566 ? ((C21566) interfaceC18764).a : new C20155(interfaceC18764);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC18764 interfaceC18764 = this.a;
        if (obj instanceof C20155) {
            obj = ((C20155) obj).a;
        }
        return interfaceC18764.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
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
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C20237.a(this.a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C8180.convert(this.a.trySplit());
    }
}
