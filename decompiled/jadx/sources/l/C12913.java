package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public class C12913 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f38745;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC12063 f38747;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f38748;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38746 = 1024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC7975 f38749 = null;

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

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC7975 mo29685(int i, Object[] objArr) {
        C9876.m24968(objArr.length, 0, i);
        return new C21381(0, i, this.f38748, objArr);
    }

    public C12913(InterfaceC12063 interfaceC12063, long j, int i) {
        this.f38747 = interfaceC12063;
        this.f38745 = j;
        if ((i & 4096) != 0) {
            this.f38748 = i;
        } else {
            this.f38748 = i | 16448;
        }
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC7975 interfaceC7975 = this.f38749;
        if (interfaceC7975 != null) {
            boolean zTryAdvance = interfaceC7975.tryAdvance(consumer);
            if (!zTryAdvance) {
                this.f38749 = null;
            }
            return zTryAdvance;
        }
        InterfaceC12063 interfaceC12063 = this.f38747;
        if (!interfaceC12063.hasNext()) {
            return false;
        }
        this.f38745--;
        consumer.accept(interfaceC12063.next());
        return true;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC7975 interfaceC7975 = this.f38749;
        if (interfaceC7975 != null) {
            interfaceC7975.forEachRemaining(consumer);
            this.f38749 = null;
        }
        C13138.forEachRemaining(this.f38747, consumer);
        this.f38745 = 0L;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC7975 interfaceC7975 = this.f38749;
        if (interfaceC7975 != null) {
            return interfaceC7975.estimateSize();
        }
        if (!this.f38747.hasNext()) {
            return 0L;
        }
        long j = this.f38745;
        return j >= 0 ? j : C13132.FOREVER_NS;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f38748;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        InterfaceC12063 interfaceC12063 = this.f38747;
        if (!interfaceC12063.hasNext()) {
            return null;
        }
        long j = this.f38745;
        int iMin = j > 0 ? (int) Math.min(this.f38746, j) : this.f38746;
        Object[] objArrCopyOf = new Object[iMin];
        int i = 0;
        while (i < iMin && interfaceC12063.hasNext()) {
            objArrCopyOf[i] = interfaceC12063.next();
            this.f38745--;
            i++;
        }
        if (iMin < this.f38746 && interfaceC12063.hasNext()) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.f38746);
            while (interfaceC12063.hasNext() && i < this.f38746) {
                objArrCopyOf[i] = interfaceC12063.next();
                this.f38745--;
                i++;
            }
        }
        this.f38746 = Math.min(33554432, this.f38746 + 1024);
        InterfaceC7975 interfaceC7975Mo29685 = mo29685(i, objArrCopyOf);
        if (interfaceC12063.hasNext()) {
            return interfaceC7975Mo29685;
        }
        this.f38749 = interfaceC7975Mo29685;
        return ((C21381) interfaceC7975Mo29685).trySplit();
    }
}
