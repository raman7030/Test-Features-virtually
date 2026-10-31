package l;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13118 implements InterfaceC15234 {
    public final List a;
    public int b;
    public int c;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16464;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public C13118(List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    public C13118(C13118 c13118, int i, int i2) {
        this.a = c13118.a;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        List list = this.a;
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int size = list.size();
        this.c = size;
        return size;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        int iA = a();
        int i = this.b;
        int i2 = (iA + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C13118(this, i, i2);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i = this.b;
        if (i >= iA) {
            return false;
        }
        this.b = i + 1;
        try {
            consumer.accept(this.a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C11003.requireNonNull(consumer);
        List list = this.a;
        int iA = a();
        this.b = iA;
        for (int i = this.b; i < iA; i++) {
            try {
                consumer.accept(list.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return a() - this.b;
    }
}
