package l;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۡۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8866 implements PrimitiveIterator.OfLong {
    public final /* synthetic */ InterfaceC6769 a;

    public /* synthetic */ C8866(InterfaceC6769 interfaceC6769) {
        this.a = interfaceC6769;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC6769 interfaceC6769 = this.a;
        if (obj instanceof C8866) {
            obj = ((C8866) obj).a;
        }
        return interfaceC6769.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
