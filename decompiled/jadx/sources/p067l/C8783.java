package p067l;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8783 implements InterfaceC8802, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f23834a;

    public /* synthetic */ C8783(PrimitiveIterator.OfLong ofLong) {
        this.f23834a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f23834a;
        if (obj instanceof C8783) {
            obj = ((C8783) obj).f23834a;
        }
        return ofLong.equals(obj);
    }

    @Override // p067l.InterfaceC22214
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f23834a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC8802, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f23834a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p067l.InterfaceC8802
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f23834a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f23834a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f23834a.hashCode();
    }

    @Override // p067l.InterfaceC8802, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f23834a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f23834a.next();
    }

    @Override // p067l.InterfaceC8802
    public final /* synthetic */ long nextLong() {
        return this.f23834a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f23834a.remove();
    }
}
