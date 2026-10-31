package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۫ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12352 implements InterfaceC0418 {
    public long a;
    public final long b;
    public final long c;
    public final long d;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
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

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    public C12352(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // l.InterfaceC15234
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C12352 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C12352(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        longConsumer.accept(C14468.current().c(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C14468 c14468Current = C14468.current();
            do {
                longConsumer.accept(c14468Current.c(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
