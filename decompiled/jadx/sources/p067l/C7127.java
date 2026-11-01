package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7127 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C3103 f18608;

    /* JADX INFO: renamed from: ᩶ */
    public int f18609;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f18610;

    /* JADX INFO: renamed from: ᩹ */
    public int f18611;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16465;
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

    public C7127(C3103 c3103) {
        this(c3103, 0, c3103.f5644, false);
    }

    public C7127(C3103 c3103, int i, int i2, boolean z) {
        this.f18608 = c3103;
        this.f18609 = i;
        this.f18611 = i2;
        this.f18610 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f18610 ? this.f18611 : this.f18608.f5644) - this.f18609;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        boolean z = this.f18610;
        C3103 c3103 = this.f18608;
        int i = z ? this.f18611 : c3103.f5644;
        int i2 = this.f18609;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f18611 = i;
        int i4 = i3 + i2;
        this.f18609 = i4;
        this.f18610 = true;
        return new C7127(c3103, i2, i4, true);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f18609;
        boolean z = this.f18610;
        C3103 c3103 = this.f18608;
        if (i >= (z ? this.f18611 : c3103.f5644)) {
            return false;
        }
        Object[] objArr = c3103.f5643;
        this.f18609 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C3103 c3103 = this.f18608;
        Object[] objArr = c3103.f5643;
        int i = this.f18610 ? this.f18611 : c3103.f5644;
        while (true) {
            int i2 = this.f18609;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f18609++;
        }
    }
}
