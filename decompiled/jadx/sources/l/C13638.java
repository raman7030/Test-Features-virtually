package l;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13638 implements InterfaceC14529, InterfaceC12433 {
    public final /* synthetic */ PrimitiveIterator.OfInt a;

    public /* synthetic */ C13638(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.a;
        if (obj instanceof C13638) {
            obj = ((C13638) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // l.InterfaceC20881
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC14529
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC14529, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // l.InterfaceC14529
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
