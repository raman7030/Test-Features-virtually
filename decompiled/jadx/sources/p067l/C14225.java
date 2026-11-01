package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14225 implements Iterator, Consumer {

    /* JADX INFO: renamed from: a */
    public boolean f40514a = false;

    /* JADX INFO: renamed from: b */
    public Object f40515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC16847 f40516c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public C14225(InterfaceC16847 interfaceC16847) {
        this.f40516c = interfaceC16847;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f40514a = true;
        this.f40515b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f40514a) {
            this.f40516c.tryAdvance(this);
        }
        return this.f40514a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f40514a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40514a = false;
        return this.f40515b;
    }
}
