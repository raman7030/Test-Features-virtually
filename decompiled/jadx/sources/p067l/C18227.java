package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18227 extends AbstractC6158 implements InterfaceC16847 {
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

    public C18227(InterfaceC16847 interfaceC16847, long j, long j2) {
        super(interfaceC16847, j, j2, 0L, Math.min(interfaceC16847.estimateSize(), j2));
    }

    @Override // p067l.AbstractC6158
    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 mo4499a(InterfaceC16847 interfaceC16847, long j, long j2, long j3, long j4) {
        return new C18227(interfaceC16847, j, j2, j3, j4);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        C12826.requireNonNull(consumer);
        long j2 = this.f15453e;
        long j3 = this.f15449a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f15452d;
            if (j3 <= j) {
                break;
            }
            this.f15451c.tryAdvance(new C24933(23));
            this.f15452d++;
        }
        if (j >= this.f15453e) {
            return false;
        }
        this.f15452d = j + 1;
        return this.f15451c.tryAdvance(consumer);
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C12826.requireNonNull(consumer);
        long j = this.f15453e;
        long j2 = this.f15449a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f15452d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.f15451c.estimateSize() + j3 <= this.f15450b) {
            this.f15451c.forEachRemaining(consumer);
            this.f15452d = this.f15453e;
            return;
        }
        while (j2 > this.f15452d) {
            this.f15451c.tryAdvance(new C24933(24));
            this.f15452d++;
        }
        while (this.f15452d < this.f15453e) {
            this.f15451c.tryAdvance(consumer);
            this.f15452d++;
        }
    }
}
