package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8190 implements InterfaceC16177, IntConsumer, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public boolean f21618a = false;

    /* JADX INFO: renamed from: b */
    public int f21619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC20202 f21620c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC22214
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // p067l.InterfaceC16177
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C18860.$default$forEachRemaining((InterfaceC16177) this, intConsumer);
    }

    @Override // p067l.InterfaceC16177, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return C18860.$default$next((InterfaceC16177) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        C12826.requireNonNull(consumer);
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(C8190.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        C12826.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C7955(consumer, 0));
    }

    public C8190(InterfaceC20202 interfaceC20202) {
        this.f21620c = interfaceC20202;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f21618a = true;
        this.f21619b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f21618a) {
            this.f21620c.tryAdvance((IntConsumer) this);
        }
        return this.f21618a;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!this.f21618a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f21618a = false;
        return this.f21619b;
    }
}
