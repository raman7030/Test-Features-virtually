package l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21299 extends AbstractC20634 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19888 f68664;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21299(C19888 c19888, int i) {
        super(i);
        this.f68664 = c19888;
    }

    @Override // l.AbstractC6522
    /* JADX INFO: renamed from: ۧ */
    public final long mo18035(int i) {
        C19888 c19888 = this.f68664;
        return c19888.f64274.f14034[c19888.f31293 + i];
    }

    @Override // l.AbstractC20634
    /* JADX INFO: renamed from: ֫ */
    public final void mo30699(int i, long j) {
        this.f68664.mo7539(i, j);
    }

    @Override // l.AbstractC20634
    /* JADX INFO: renamed from: ۧ */
    public final void mo30700(int i, long j) {
        this.f68664.set(i, j);
    }

    @Override // l.AbstractC6522
    /* JADX INFO: renamed from: ܽ */
    public final void mo18036(int i) {
        this.f68664.mo7545(i);
    }

    @Override // l.AbstractC6522
    /* JADX INFO: renamed from: ֫ */
    public final int mo18034() {
        C19888 c19888 = this.f68664;
        return c19888.f31292 - c19888.f31293;
    }

    @Override // l.AbstractC6522, l.InterfaceC6769
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C19888 c19888 = this.f68664;
        long[] jArr = c19888.f64274.f14034;
        int i = c19888.f31293;
        int i2 = this.f20157;
        this.f20157 = i2 + 1;
        this.f20156 = i2;
        return jArr[i + i2];
    }

    @Override // l.AbstractC20634, l.InterfaceC3700
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo11286() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C19888 c19888 = this.f68664;
        long[] jArr = c19888.f64274.f14034;
        int i = c19888.f31293;
        int i2 = this.f20157 - 1;
        this.f20157 = i2;
        this.f20156 = i2;
        return jArr[i + i2];
    }

    @Override // l.AbstractC20278, l.InterfaceC20881
    public final void forEachRemaining(LongConsumer longConsumer) {
        C19888 c19888 = this.f68664;
        long[] jArr = c19888.f64274.f14034;
        int i = c19888.f31292 - c19888.f31293;
        while (true) {
            int i2 = this.f20157;
            if (i2 >= i) {
                return;
            }
            int i3 = c19888.f31293;
            this.f20157 = i2 + 1;
            this.f20156 = i2;
            longConsumer.accept(jArr[i3 + i2]);
        }
    }
}
