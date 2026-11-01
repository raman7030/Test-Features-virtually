package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9908 extends AbstractC24322 {

    /* JADX INFO: renamed from: ᩸ */
    public int f27470;

    @Override // p067l.InterfaceC16847
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo23206();

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo15784(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC3202 mo15785(int i, int i2);

    public AbstractC9908(int i) {
        this.f27470 = i;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return ((long) mo23206()) - ((long) this.f27470);
    }

    @Override // p067l.InterfaceC2766
    public boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f27470 >= mo23206()) {
            return false;
        }
        int i = this.f27470;
        this.f27470 = i + 1;
        longConsumer.accept(mo15784(i));
        return true;
    }

    @Override // p067l.AbstractC24322, p067l.InterfaceC2766
    public void forEachRemaining(LongConsumer longConsumer) {
        int iMo23206 = mo23206();
        while (true) {
            int i = this.f27470;
            if (i >= iMo23206) {
                return;
            }
            longConsumer.accept(mo15784(i));
            this.f27470++;
        }
    }

    @Override // p067l.AbstractC24322, p067l.InterfaceC16847
    public InterfaceC3202 trySplit() {
        int iMo23206 = mo23206();
        int i = this.f27470;
        int iMo23207 = mo23206();
        int i2 = this.f27470;
        int iM21912 = C9417.m21912(iMo23207, i2, 2, i);
        if (iM21912 == i2 || iM21912 == iMo23206) {
            return null;
        }
        if (iM21912 >= i2 && iM21912 <= iMo23206) {
            InterfaceC3202 interfaceC3202Mo15785 = mo15785(i2, iM21912);
            this.f27470 = iM21912;
            return interfaceC3202Mo15785;
        }
        StringBuilder sbM34408 = C15033.m34408(iM21912, "splitPoint ", " outside of range of current position ");
        sbM34408.append(this.f27470);
        sbM34408.append(" and range end ");
        sbM34408.append(iMo23206);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }
}
