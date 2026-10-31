package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6125 implements InterfaceC14529, IntConsumer, InterfaceC12433 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ InterfaceC18764 c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC20881
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC14529
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17352.$default$forEachRemaining((InterfaceC14529) this, intConsumer);
    }

    @Override // l.InterfaceC14529, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return C17352.$default$next((InterfaceC14529) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        C11003.requireNonNull(consumer);
        if (AbstractC15920.a) {
            AbstractC15920.a(C6125.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        C11003.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C5878(consumer, 0));
    }

    public C6125(InterfaceC18764 interfaceC18764) {
        this.c = interfaceC18764;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
