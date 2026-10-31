package l;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6749 implements InterfaceC6769, InterfaceC12433 {
    public final /* synthetic */ PrimitiveIterator.OfLong a;

    public /* synthetic */ C6749(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.a;
        if (obj instanceof C6749) {
            obj = ((C6749) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // l.InterfaceC20881
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC6769, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // l.InterfaceC6769
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC6769, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // l.InterfaceC6769
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
