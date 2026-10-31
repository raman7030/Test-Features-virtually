package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6914 implements InterfaceC16791 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f21347;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1290 f21349;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f21350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21348 = 1024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC16791 f21351 = null;

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
        InterfaceC16791 interfaceC16791 = this.f21351;
        if (interfaceC16791 != null) {
            ((C17497) interfaceC16791).forEachRemaining((Object) interfaceC4113);
            this.f21351 = null;
        }
        this.f21349.forEachRemaining(interfaceC4113);
        this.f21347 = 0L;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC4113 interfaceC4113 = (InterfaceC4113) obj;
        InterfaceC16791 interfaceC16791 = this.f21351;
        if (interfaceC16791 != null) {
            boolean zTryAdvance = interfaceC16791.tryAdvance((Object) interfaceC4113);
            if (!zTryAdvance) {
                this.f21351 = null;
            }
            return zTryAdvance;
        }
        InterfaceC1290 interfaceC1290 = this.f21349;
        if (!interfaceC1290.hasNext()) {
            return false;
        }
        this.f21347--;
        interfaceC4113.mo12346(interfaceC1290.nextFloat());
        return true;
    }

    public C6914(InterfaceC1290 interfaceC1290, long j, int i) {
        this.f21349 = interfaceC1290;
        this.f21347 = j;
        this.f21350 = i | 16704;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC16791 interfaceC16791 = this.f21351;
        if (interfaceC16791 != null) {
            return interfaceC16791.estimateSize();
        }
        if (!this.f21349.hasNext()) {
            return 0L;
        }
        long j = this.f21347;
        return j >= 0 ? j : C13132.FOREVER_NS;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f21350;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16791 trySplit() {
        InterfaceC1290 interfaceC1290 = this.f21349;
        if (!interfaceC1290.hasNext()) {
            return null;
        }
        long j = this.f21347;
        int iMin = j > 0 ? (int) Math.min(this.f21348, j) : this.f21348;
        float[] fArrCopyOf = new float[iMin];
        int i = 0;
        while (i < iMin && interfaceC1290.hasNext()) {
            fArrCopyOf[i] = interfaceC1290.nextFloat();
            this.f21347--;
            i++;
        }
        if (iMin < this.f21348 && interfaceC1290.hasNext()) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, this.f21348);
            while (interfaceC1290.hasNext() && i < this.f21348) {
                fArrCopyOf[i] = interfaceC1290.nextFloat();
                this.f21347--;
                i++;
            }
        }
        this.f21348 = Math.min(33554432, this.f21348 + 1024);
        C9876.m24968(fArrCopyOf.length, 0, i);
        C17497 c17497 = new C17497(0, i, this.f21350, fArrCopyOf);
        if (interfaceC1290.hasNext()) {
            return c17497;
        }
        this.f21351 = c17497;
        return c17497.trySplit();
    }
}
