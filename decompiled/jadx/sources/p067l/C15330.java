package p067l;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15330 implements InterfaceC16177, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f43739a;

    public /* synthetic */ C15330(PrimitiveIterator.OfInt ofInt) {
        this.f43739a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f43739a;
        if (obj instanceof C15330) {
            obj = ((C15330) obj).f43739a;
        }
        return ofInt.equals(obj);
    }

    @Override // p067l.InterfaceC22214
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f43739a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f43739a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p067l.InterfaceC16177
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f43739a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f43739a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f43739a.hashCode();
    }

    @Override // p067l.InterfaceC16177, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f43739a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f43739a.next();
    }

    @Override // p067l.InterfaceC16177
    public final /* synthetic */ int nextInt() {
        return this.f43739a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f43739a.remove();
    }
}
