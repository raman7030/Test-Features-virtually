package p067l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C16158 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final Collection f47594a;

    /* JADX INFO: renamed from: b */
    public Iterator f47595b;

    /* JADX INFO: renamed from: c */
    public final int f47596c;

    /* JADX INFO: renamed from: d */
    public long f47597d;

    /* JADX INFO: renamed from: e */
    public int f47598e;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public C16158(Collection collection, int i) {
        this.f47594a = collection;
        this.f47595b = null;
        this.f47596c = (i & 4096) == 0 ? i | 16448 : i;
    }

    public C16158(Iterator it, int i) {
        this.f47594a = null;
        this.f47595b = it;
        this.f47597d = C14849.FOREVER_NS;
        this.f47596c = i & (-16449);
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        long size;
        Iterator it = this.f47595b;
        if (it == null) {
            it = this.f47594a.iterator();
            this.f47595b = it;
            size = this.f47594a.size();
            this.f47597d = size;
        } else {
            size = this.f47597d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f47598e + 1024;
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
        this.f47598e = i2;
        long j = this.f47597d;
        if (j != C14849.FOREVER_NS) {
            this.f47597d = j - ((long) i2);
        }
        return new C24224(objArr, 0, i2, this.f47596c);
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f47595b;
        if (it == null) {
            it = this.f47594a.iterator();
            this.f47595b = it;
            this.f47597d = this.f47594a.size();
        }
        C14855.forEachRemaining(it, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f47595b == null) {
            this.f47595b = this.f47594a.iterator();
            this.f47597d = this.f47594a.size();
        }
        if (!this.f47595b.hasNext()) {
            return false;
        }
        consumer.accept(this.f47595b.next());
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        if (this.f47595b == null) {
            this.f47595b = this.f47594a.iterator();
            long size = this.f47594a.size();
            this.f47597d = size;
            return size;
        }
        return this.f47597d;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f47596c;
    }

    @Override // p067l.InterfaceC16847
    public Comparator getComparator() {
        if (C4779.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
