package p067l;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14836 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final List f42310a;

    /* JADX INFO: renamed from: b */
    public int f42311b;

    /* JADX INFO: renamed from: c */
    public int f42312c;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public C14836(List list) {
        this.f42310a = list;
        this.f42311b = 0;
        this.f42312c = -1;
    }

    public C14836(C14836 c14836, int i, int i2) {
        this.f42310a = c14836.f42310a;
        this.f42311b = i;
        this.f42312c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m33874a() {
        List list = this.f42310a;
        int i = this.f42312c;
        if (i >= 0) {
            return i;
        }
        int size = list.size();
        this.f42312c = size;
        return size;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        int iM33874a = m33874a();
        int i = this.f42311b;
        int i2 = (iM33874a + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f42311b = i2;
        return new C14836(this, i, i2);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iM33874a = m33874a();
        int i = this.f42311b;
        if (i >= iM33874a) {
            return false;
        }
        this.f42311b = i + 1;
        try {
            consumer.accept(this.f42310a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C12826.requireNonNull(consumer);
        List list = this.f42310a;
        int iM33874a = m33874a();
        this.f42311b = iM33874a;
        for (int i = this.f42311b; i < iM33874a; i++) {
            try {
                consumer.accept(list.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return m33874a() - this.f42311b;
    }
}
