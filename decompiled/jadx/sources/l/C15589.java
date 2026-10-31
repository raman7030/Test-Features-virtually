package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15589 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19119 f48025;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f48027;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48028;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16464;
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

    public C15589(C19119 c19119) {
        this(c19119, 0, c19119.f60232, false);
    }

    public C15589(C19119 c19119, int i, int i2, boolean z) {
        this.f48025 = c19119;
        this.f48026 = i;
        this.f48028 = i2;
        this.f48027 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f48027 ? this.f48028 : this.f48025.f60232) - this.f48026;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        boolean z = this.f48027;
        C19119 c19119 = this.f48025;
        int i = z ? this.f48028 : c19119.f60232;
        int i2 = this.f48026;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f48028 = i;
        int i4 = i3 + i2;
        this.f48026 = i4;
        this.f48027 = true;
        return new C15589(c19119, i2, i4, true);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f48026;
        boolean z = this.f48027;
        C19119 c19119 = this.f48025;
        if (i >= (z ? this.f48028 : c19119.f60232)) {
            return false;
        }
        Object[] objArr = c19119.f60231;
        this.f48026 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C19119 c19119 = this.f48025;
        Object[] objArr = c19119.f60231;
        int i = this.f48027 ? this.f48028 : c19119.f60232;
        while (true) {
            int i2 = this.f48026;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f48026++;
        }
    }
}
