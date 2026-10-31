package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩺ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23058 implements InterfaceC6769, LongConsumer, InterfaceC12433 {
    public boolean a = false;
    public long b;
    public final /* synthetic */ InterfaceC0418 c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC20881
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // l.InterfaceC6769
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C23702.$default$forEachRemaining((InterfaceC6769) this, longConsumer);
    }

    @Override // l.InterfaceC6769, java.util.Iterator
    public final /* synthetic */ Long next() {
        return C23702.$default$next((InterfaceC6769) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // l.InterfaceC6769, java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        C11003.requireNonNull(consumer);
        if (AbstractC15920.a) {
            AbstractC15920.a(C23058.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        C11003.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C17332(consumer, 0));
    }

    public C23058(InterfaceC0418 interfaceC0418) {
        this.c = interfaceC0418;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // l.InterfaceC6769
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
