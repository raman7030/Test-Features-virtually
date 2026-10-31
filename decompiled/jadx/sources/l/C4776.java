package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4776 implements InterfaceC16791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10421 f15152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15153;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15154;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15155;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16720;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11148.m27665(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11148.m27666(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        InterfaceC4113 interfaceC4113 = (InterfaceC4113) obj;
        C10421 c10421 = this.f15152;
        float[] fArr = c10421.f31324;
        int i = this.f15154 ? this.f15155 : c10421.f31325;
        while (true) {
            int i2 = this.f15153;
            if (i2 >= i) {
                return;
            }
            interfaceC4113.mo12346(fArr[i2]);
            this.f15153++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC4113 interfaceC4113 = (InterfaceC4113) obj;
        int i = this.f15153;
        boolean z = this.f15154;
        C10421 c10421 = this.f15152;
        if (i >= (z ? this.f15155 : c10421.f31325)) {
            return false;
        }
        float[] fArr = c10421.f31324;
        this.f15153 = i + 1;
        interfaceC4113.mo12346(fArr[i]);
        return true;
    }

    public C4776(C10421 c10421) {
        this(c10421, 0, c10421.f31325, false);
    }

    public C4776(C10421 c10421, int i, int i2, boolean z) {
        this.f15152 = c10421;
        this.f15153 = i;
        this.f15155 = i2;
        this.f15154 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f15154 ? this.f15155 : this.f15152.f31325) - this.f15153;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16791 trySplit() {
        boolean z = this.f15154;
        C10421 c10421 = this.f15152;
        int i = z ? this.f15155 : c10421.f31325;
        int i2 = this.f15153;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f15155 = i;
        int i4 = i3 + i2;
        this.f15153 = i4;
        this.f15154 = true;
        return new C4776(c10421, i2, i4, true);
    }
}
