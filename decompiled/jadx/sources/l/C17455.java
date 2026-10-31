package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public class C17455 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f53319;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53321;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f53322;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f53323;

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11106.m27536(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    public C17455(int i, int i2, int i3, int[] iArr) {
        this.f53322 = iArr;
        this.f53319 = i;
        this.f53320 = i2;
        this.f53323 = i3 | 16720;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f53321 >= this.f53320) {
            return false;
        }
        C11003.requireNonNull(intConsumer);
        int i = this.f53321;
        this.f53321 = i + 1;
        intConsumer.accept(this.f53322[this.f53319 + i]);
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f53320 - this.f53321;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f53323;
    }

    /* JADX INFO: renamed from: ֫ */
    public C17455 mo34928(int i, int i2) {
        return new C17455(i, i2, this.f53323, this.f53322);
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        int i = this.f53321;
        int i2 = (this.f53320 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f53319 + i;
        this.f53321 = i + i2;
        return mo34928(i3, i2);
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        while (true) {
            int i = this.f53321;
            if (i >= this.f53320) {
                return;
            }
            intConsumer.accept(this.f53322[this.f53319 + i]);
            this.f53321++;
        }
    }
}
