package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11833 implements InterfaceC15234, Consumer {
    public static final Object d = new Object();
    public final InterfaceC15234 a;
    public final ConcurrentMapC10942 b;
    public Object c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public C11833(InterfaceC15234 interfaceC15234, ConcurrentMapC10942 concurrentMapC10942) {
        this.a = interfaceC15234;
        this.b = concurrentMapC10942;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c = obj;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        while (this.a.tryAdvance(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = d;
            }
            if (this.b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new C10379(8, this, consumer));
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        InterfaceC15234 interfaceC15234TrySplit = this.a.trySplit();
        if (interfaceC15234TrySplit != null) {
            return new C11833(interfaceC15234TrySplit, this.b);
        }
        return null;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return (this.a.characteristics() & (-16469)) | 1;
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
