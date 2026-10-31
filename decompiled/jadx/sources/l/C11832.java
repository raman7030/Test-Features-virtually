package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes4.dex */
public final class C11832 implements InterfaceC16791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23120 f35298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35299;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35300;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35301;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16721;
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
        C23120 c23120 = this.f35298;
        float[] fArr = c23120.f74362;
        int i = this.f35300 ? this.f35301 : c23120.f74363;
        while (true) {
            int i2 = this.f35299;
            if (i2 >= i) {
                return;
            }
            interfaceC4113.mo12346(fArr[i2]);
            this.f35299++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC4113 interfaceC4113 = (InterfaceC4113) obj;
        int i = this.f35299;
        boolean z = this.f35300;
        C23120 c23120 = this.f35298;
        if (i >= (z ? this.f35301 : c23120.f74363)) {
            return false;
        }
        float[] fArr = c23120.f74362;
        this.f35299 = i + 1;
        interfaceC4113.mo12346(fArr[i]);
        return true;
    }

    public C11832(C23120 c23120) {
        this(c23120, 0, c23120.f74363, false);
    }

    public C11832(C23120 c23120, int i, int i2, boolean z) {
        this.f35298 = c23120;
        this.f35299 = i;
        this.f35301 = i2;
        this.f35300 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f35300 ? this.f35301 : this.f35298.f74363) - this.f35299;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16791 trySplit() {
        boolean z = this.f35300;
        C23120 c23120 = this.f35298;
        int i = z ? this.f35301 : c23120.f74363;
        int i2 = this.f35299;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f35301 = i;
        int i4 = i3 + i2;
        this.f35299 = i4;
        this.f35300 = true;
        return new C11832(c23120, i2, i4, true);
    }
}
