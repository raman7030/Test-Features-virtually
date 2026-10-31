package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13057 implements InterfaceC18764 {
    public long a;
    public final long b;
    public final int c;
    public final int d;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
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

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    public C13057(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C13057 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C13057(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        intConsumer.accept(C14468.current().b(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C14468 c14468Current = C14468.current();
            do {
                intConsumer.accept(c14468Current.b(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
