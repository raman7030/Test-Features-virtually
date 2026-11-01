package p067l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22611 extends AbstractC21979 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21270 f71355;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22611(C21270 c21270, int i) {
        super(i);
        this.f71355 = c21270;
    }

    @Override // p067l.AbstractC8567
    /* JADX INFO: renamed from: ۧ */
    public final long mo19984(int i) {
        C21270 c21270 = this.f71355;
        return c21270.f66910.f16849[c21270.f34258 + i];
    }

    @Override // p067l.AbstractC21979
    /* JADX INFO: renamed from: ֫ */
    public final void mo32774(int i, long j) {
        this.f71355.mo9607(i, j);
    }

    @Override // p067l.AbstractC21979
    /* JADX INFO: renamed from: ۧ */
    public final void mo32775(int i, long j) {
        this.f71355.set(i, j);
    }

    @Override // p067l.AbstractC8567
    /* JADX INFO: renamed from: ܽ */
    public final void mo19985(int i) {
        this.f71355.mo9613(i);
    }

    @Override // p067l.AbstractC8567
    /* JADX INFO: renamed from: ֫ */
    public final int mo19983() {
        C21270 c21270 = this.f71355;
        return c21270.f34257 - c21270.f34258;
    }

    @Override // p067l.AbstractC8567, p067l.InterfaceC8802
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C21270 c21270 = this.f71355;
        long[] jArr = c21270.f66910.f16849;
        int i = c21270.f34258;
        int i2 = this.f23035;
        this.f23035 = i2 + 1;
        this.f23034 = i2;
        return jArr[i + i2];
    }

    @Override // p067l.AbstractC21979, p067l.InterfaceC5885
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo13233() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C21270 c21270 = this.f71355;
        long[] jArr = c21270.f66910.f16849;
        int i = c21270.f34258;
        int i2 = this.f23035 - 1;
        this.f23035 = i2;
        this.f23034 = i2;
        return jArr[i + i2];
    }

    @Override // p067l.AbstractC21641, p067l.InterfaceC22214
    public final void forEachRemaining(LongConsumer longConsumer) {
        C21270 c21270 = this.f71355;
        long[] jArr = c21270.f66910.f16849;
        int i = c21270.f34257 - c21270.f34258;
        while (true) {
            int i2 = this.f23035;
            if (i2 >= i) {
                return;
            }
            int i3 = c21270.f34258;
            this.f23035 = i2 + 1;
            this.f23034 = i2;
            longConsumer.accept(jArr[i3 + i2]);
        }
    }
}
