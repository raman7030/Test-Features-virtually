package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12475 implements Iterator, Consumer {
    public boolean a = false;
    public Object b;
    public final /* synthetic */ InterfaceC15234 c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public C12475(InterfaceC15234 interfaceC15234) {
        this.c = interfaceC15234;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = true;
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
