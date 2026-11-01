package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۫ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14108 implements InterfaceC2766 {

    /* JADX INFO: renamed from: a */
    public long f40029a;

    /* JADX INFO: renamed from: b */
    public final long f40030b;

    /* JADX INFO: renamed from: c */
    public final long f40031c;

    /* JADX INFO: renamed from: d */
    public final long f40032d;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17728;
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
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

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    public C14108(long j, long j2, long j3, long j4) {
        this.f40029a = j;
        this.f40030b = j2;
        this.f40031c = j3;
        this.f40032d = j4;
    }

    @Override // p067l.InterfaceC16847
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C14108 trySplit() {
        long j = this.f40029a;
        long j2 = (this.f40030b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f40029a = j2;
        return new C14108(j, j2, this.f40031c, this.f40032d);
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f40030b - this.f40029a;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f40029a;
        if (j >= this.f40030b) {
            return false;
        }
        longConsumer.accept(C16119.current().m36701c(this.f40031c, this.f40032d));
        this.f40029a = j + 1;
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f40029a;
        long j2 = this.f40030b;
        if (j < j2) {
            this.f40029a = j2;
            C16119 c16119Current = C16119.current();
            do {
                longConsumer.accept(c16119Current.m36701c(this.f40031c, this.f40032d));
                j++;
            } while (j < j2);
        }
    }
}
