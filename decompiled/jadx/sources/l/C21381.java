package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public class C21381 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f68872;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f68873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68874;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f68875;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f68876;

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

    public C21381(int i, int i2, int i3, Object[] objArr) {
        this.f68875 = objArr;
        this.f68872 = i;
        this.f68873 = i2;
        this.f68876 = i3 | 16464;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f68874 >= this.f68873) {
            return false;
        }
        C11003.requireNonNull(consumer);
        int i = this.f68874;
        this.f68874 = i + 1;
        consumer.accept(this.f68875[this.f68872 + i]);
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f68873 - this.f68874;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f68876;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21381 mo48470(int i, int i2) {
        return new C21381(i, i2, this.f68876, this.f68875);
    }

    @Override // l.InterfaceC15234
    public final InterfaceC7975 trySplit() {
        int i = this.f68874;
        int i2 = (this.f68873 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f68872 + i;
        this.f68874 = i + i2;
        return mo48470(i3, i2);
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C11003.requireNonNull(consumer);
        while (true) {
            int i = this.f68874;
            if (i >= this.f68873) {
                return;
            }
            consumer.accept(this.f68875[this.f68872 + i]);
            this.f68874++;
        }
    }
}
