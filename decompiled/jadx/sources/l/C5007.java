package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5007 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0773 f15775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15776;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15777;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15778;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16465;
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

    public C5007(C0773 c0773) {
        this(c0773, 0, c0773.f2872, false);
    }

    public C5007(C0773 c0773, int i, int i2, boolean z) {
        this.f15775 = c0773;
        this.f15776 = i;
        this.f15778 = i2;
        this.f15777 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f15777 ? this.f15778 : this.f15775.f2872) - this.f15776;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        boolean z = this.f15777;
        C0773 c0773 = this.f15775;
        int i = z ? this.f15778 : c0773.f2872;
        int i2 = this.f15776;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f15778 = i;
        int i4 = i3 + i2;
        this.f15776 = i4;
        this.f15777 = true;
        return new C5007(c0773, i2, i4, true);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f15776;
        boolean z = this.f15777;
        C0773 c0773 = this.f15775;
        if (i >= (z ? this.f15778 : c0773.f2872)) {
            return false;
        }
        Object[] objArr = c0773.f2871;
        this.f15776 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C0773 c0773 = this.f15775;
        Object[] objArr = c0773.f2871;
        int i = this.f15777 ? this.f15778 : c0773.f2872;
        while (true) {
            int i2 = this.f15776;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f15776++;
        }
    }
}
