package l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2516 implements Iterator, InterfaceC12433 {
    public final /* synthetic */ int a = 1;
    public final Iterator b;

    public C2516(C18744 c18744) {
        this.b = c18744.a.iterator();
    }

    public C2516(C4632 c4632) {
        this.b = c4632.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C15214((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                C13138.forEachRemaining(this.b, consumer);
                break;
            default:
                C13138.forEachRemaining(this.b, new C2122(consumer, 2));
                break;
        }
    }
}
