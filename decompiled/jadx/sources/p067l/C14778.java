package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14778 implements InterfaceC20202 {

    /* JADX INFO: renamed from: a */
    public long f42120a;

    /* JADX INFO: renamed from: b */
    public final long f42121b;

    /* JADX INFO: renamed from: c */
    public final int f42122c;

    /* JADX INFO: renamed from: d */
    public final int f42123d;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17728;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
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

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    public C14778(long j, long j2, int i, int i2) {
        this.f42120a = j;
        this.f42121b = j2;
        this.f42122c = i;
        this.f42123d = i2;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C14778 trySplit() {
        long j = this.f42120a;
        long j2 = (this.f42121b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f42120a = j2;
        return new C14778(j, j2, this.f42122c, this.f42123d);
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f42121b - this.f42120a;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f42120a;
        if (j >= this.f42121b) {
            return false;
        }
        intConsumer.accept(C16119.current().m36700b(this.f42122c, this.f42123d));
        this.f42120a = j + 1;
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f42120a;
        long j2 = this.f42121b;
        if (j < j2) {
            this.f42120a = j2;
            C16119 c16119Current = C16119.current();
            do {
                intConsumer.accept(c16119Current.m36700b(this.f42122c, this.f42123d));
                j++;
            } while (j < j2);
        }
    }
}
