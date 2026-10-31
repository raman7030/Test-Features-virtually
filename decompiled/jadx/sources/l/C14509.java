package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C14509 implements InterfaceC15234 {
    public final Collection a;
    public Iterator b;
    public final int c;
    public long d;
    public int e;

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public C14509(Collection collection, int i) {
        this.a = collection;
        this.b = null;
        this.c = (i & 4096) == 0 ? i | 16448 : i;
    }

    public C14509(Iterator it, int i) {
        this.a = null;
        this.b = it;
        this.d = C13132.FOREVER_NS;
        this.c = i & (-16449);
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        long size;
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            size = this.a.size();
            this.d = size;
        } else {
            size = this.d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.e = i2;
        long j = this.d;
        if (j != C13132.FOREVER_NS) {
            this.d = j - ((long) i2);
        }
        return new C22996(objArr, 0, i2, this.c);
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            this.d = this.a.size();
        }
        C13138.forEachRemaining(it, consumer);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            this.b = this.a.iterator();
            this.d = this.a.size();
        }
        if (!this.b.hasNext()) {
            return false;
        }
        consumer.accept(this.b.next());
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        if (this.b == null) {
            this.b = this.a.iterator();
            long size = this.a.size();
            this.d = size;
            return size;
        }
        return this.d;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.c;
    }

    @Override // l.InterfaceC15234
    public Comparator getComparator() {
        if (C2536.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
