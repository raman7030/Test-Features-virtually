package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩺ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24283 implements InterfaceC8802, LongConsumer, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public boolean f76918a = false;

    /* JADX INFO: renamed from: b */
    public long f76919b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2766 f76920c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC22214
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // p067l.InterfaceC8802
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C24895.$default$forEachRemaining((InterfaceC8802) this, longConsumer);
    }

    @Override // p067l.InterfaceC8802, java.util.Iterator
    public final /* synthetic */ Long next() {
        return C24895.$default$next((InterfaceC8802) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // p067l.InterfaceC8802, java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        C12826.requireNonNull(consumer);
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(C24283.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        C12826.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C18841(consumer, 0));
    }

    public C24283(InterfaceC2766 interfaceC2766) {
        this.f76920c = interfaceC2766;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f76918a = true;
        this.f76919b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f76918a) {
            this.f76920c.tryAdvance((LongConsumer) this);
        }
        return this.f76918a;
    }

    @Override // p067l.InterfaceC8802
    public final long nextLong() {
        if (!this.f76918a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f76918a = false;
        return this.f76919b;
    }
}
