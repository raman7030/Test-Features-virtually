package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17184 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C20539 f51157;

    /* JADX INFO: renamed from: ᩶ */
    public int f51158;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f51159;

    /* JADX INFO: renamed from: ᩹ */
    public int f51160;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
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

    public C17184(C20539 c20539) {
        this(c20539, 0, c20539.f63464, false);
    }

    public C17184(C20539 c20539, int i, int i2, boolean z) {
        this.f51157 = c20539;
        this.f51158 = i;
        this.f51160 = i2;
        this.f51159 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f51159 ? this.f51160 : this.f51157.f63464) - this.f51158;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        boolean z = this.f51159;
        C20539 c20539 = this.f51157;
        int i = z ? this.f51160 : c20539.f63464;
        int i2 = this.f51158;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f51160 = i;
        int i4 = i3 + i2;
        this.f51158 = i4;
        this.f51159 = true;
        return new C17184(c20539, i2, i4, true);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f51158;
        boolean z = this.f51159;
        C20539 c20539 = this.f51157;
        if (i >= (z ? this.f51160 : c20539.f63464)) {
            return false;
        }
        Object[] objArr = c20539.f63463;
        this.f51158 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C20539 c20539 = this.f51157;
        Object[] objArr = c20539.f63463;
        int i = this.f51159 ? this.f51160 : c20539.f63464;
        while (true) {
            int i2 = this.f51158;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f51158++;
        }
    }
}
