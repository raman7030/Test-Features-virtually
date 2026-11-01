package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22884 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final int f72026a;

    /* JADX INFO: renamed from: b */
    public long f72027b;

    /* JADX INFO: renamed from: c */
    public int f72028c;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C4779.$default$forEachRemaining(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC22884(long j, int i) {
        this.f72027b = j;
        this.f72026a = (i & 64) != 0 ? i | 16384 : i;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        C12155 c12155 = new C12155();
        long j = this.f72027b;
        if (j <= 1 || !tryAdvance(c12155)) {
            return null;
        }
        int i = this.f72028c + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = c12155.f33983a;
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (tryAdvance(c12155));
        this.f72028c = i2;
        long j2 = this.f72027b;
        if (j2 != C14849.FOREVER_NS) {
            this.f72027b = j2 - ((long) i2);
        }
        return new C24224(objArr, 0, i2, this.f72026a);
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f72027b;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f72026a;
    }
}
