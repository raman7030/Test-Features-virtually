package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4760 implements Iterator, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10781a = 1;

    /* JADX INFO: renamed from: b */
    public final Iterator f10782b;

    public C4760(C20183 c20183) {
        this.f10782b = c20183.f62465a.iterator();
    }

    public C4760(C6771 c6771) {
        this.f10782b = c6771.f62465a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10781a) {
            case 0:
                break;
        }
        return this.f10782b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10781a) {
            case 0:
                return this.f10782b.next();
            default:
                return new C16828((Map.Entry) this.f10782b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10781a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f10781a) {
            case 0:
                C14855.forEachRemaining(this.f10782b, consumer);
                break;
            default:
                C14855.forEachRemaining(this.f10782b, new C4386(consumer, 2));
                break;
        }
    }
}
