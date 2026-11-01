package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18467 implements Iterable, InterfaceC6477 {

    /* JADX INFO: renamed from: a */
    public final Iterable f55190a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C18467(Iterable iterable) {
        this.f55190a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3320(this.f55190a.iterator());
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C21230.forEach(this.f55190a, new C4386(consumer, 1));
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return C23554.m52342b(iterator(), 0);
    }
}
