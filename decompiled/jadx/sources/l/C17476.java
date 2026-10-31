package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public class C17476 implements InterfaceC16770 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f53410;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f53413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f53414;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11127.m27611(this, consumer);
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
        return C11127.m27612(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        C11003.requireNonNull(interfaceC23662);
        while (true) {
            int i = this.f53412;
            if (i >= this.f53411) {
                return;
            }
            interfaceC23662.mo18328(this.f53413[this.f53410 + i]);
            this.f53412++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        if (this.f53412 >= this.f53411) {
            return false;
        }
        C11003.requireNonNull(interfaceC23662);
        int i = this.f53412;
        this.f53412 = i + 1;
        interfaceC23662.mo18328(this.f53413[this.f53410 + i]);
        return true;
    }

    public C17476(int i, int i2, char[] cArr, int i3) {
        this.f53413 = cArr;
        this.f53410 = i;
        this.f53411 = i2;
        this.f53414 = i3 | 16720;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f53411 - this.f53412;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f53414;
    }

    /* JADX INFO: renamed from: ֫ */
    public C17476 mo34942(int i, int i2) {
        return new C17476(i, i2, this.f53413, this.f53414);
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16770 trySplit() {
        int i = this.f53412;
        int i2 = (this.f53411 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f53410 + i;
        this.f53412 = i + i2;
        return mo34942(i3, i2);
    }
}
