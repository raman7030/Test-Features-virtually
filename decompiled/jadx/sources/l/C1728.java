package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1728 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10901 f5968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5969;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5970;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17744;
    }

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
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    public C1728(C10901 c10901) {
        this(c10901, 0, c10901.f32775.length);
    }

    public C1728(C10901 c10901, int i, int i2) {
        this.f5968 = c10901;
        this.f5970 = i;
        this.f5969 = i2;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f5969 - this.f5970;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f5970 >= this.f5969) {
            return false;
        }
        int[] iArr = this.f5968.f32775;
        int i = this.f5970;
        this.f5970 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f5968.f32775;
        while (true) {
            int i = this.f5970;
            if (i >= this.f5969) {
                return;
            }
            intConsumer.accept(iArr[i]);
            this.f5970++;
        }
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        int i = this.f5970;
        int i2 = (this.f5969 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = i2 + i;
        this.f5970 = i3;
        return new C1728(this.f5968, i, i3);
    }
}
