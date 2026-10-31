package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16938 implements Iterable, InterfaceC4323 {
    public final Iterable a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C16938(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1001(this.a.iterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19846.forEach(this.a, new C2122(consumer, 1));
    }

    @Override // java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C22291.b(iterator(), 0);
    }
}
