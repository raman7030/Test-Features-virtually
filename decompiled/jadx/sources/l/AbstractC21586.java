package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21586 implements InterfaceC15234 {
    public final int a;
    public long b;
    public int c;

    @Override // l.InterfaceC15234
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C2536.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC21586(long j, int i) {
        this.b = j;
        this.a = (i & 64) != 0 ? i | 16384 : i;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        C10297 c10297 = new C10297();
        long j = this.b;
        if (j <= 1 || !tryAdvance(c10297)) {
            return null;
        }
        int i = this.c + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = c10297.a;
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (tryAdvance(c10297));
        this.c = i2;
        long j2 = this.b;
        if (j2 != C13132.FOREVER_NS) {
            this.b = j2 - ((long) i2);
        }
        return new C22996(objArr, 0, i2, this.a);
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.b;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.a;
    }
}
