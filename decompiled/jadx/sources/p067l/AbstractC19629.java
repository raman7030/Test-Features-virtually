package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19629 extends AbstractC24362 {

    /* JADX INFO: renamed from: ᩸ */
    public int f59683;

    @Override // p067l.InterfaceC16847
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo44527();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo5713(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC18287 mo5714(int i, int i2);

    public AbstractC19629(int i) {
        this.f59683 = i;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return ((long) mo44527()) - ((long) this.f59683);
    }

    @Override // p067l.InterfaceC20202
    public boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f59683 >= mo44527()) {
            return false;
        }
        int i = this.f59683;
        this.f59683 = i + 1;
        intConsumer.accept(mo5713(i));
        return true;
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC20202
    public void forEachRemaining(IntConsumer intConsumer) {
        int iMo44527 = mo44527();
        while (true) {
            int i = this.f59683;
            if (i >= iMo44527) {
                return;
            }
            intConsumer.accept(mo5713(i));
            this.f59683++;
        }
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437, p067l.InterfaceC16847
    public InterfaceC18287 trySplit() {
        int iMo44527 = mo44527();
        int i = this.f59683;
        int iMo44528 = mo44527();
        int i2 = this.f59683;
        int iM21912 = C9417.m21912(iMo44528, i2, 2, i);
        if (iM21912 == i2 || iM21912 == iMo44527) {
            return null;
        }
        if (iM21912 >= i2 && iM21912 <= iMo44527) {
            InterfaceC18287 interfaceC18287Mo5714 = mo5714(i2, iM21912);
            this.f59683 = iM21912;
            return interfaceC18287Mo5714;
        }
        StringBuilder sbM34408 = C15033.m34408(iM21912, "splitPoint ", " outside of range of current position ");
        sbM34408.append(this.f59683);
        sbM34408.append(" and range end ");
        sbM34408.append(iMo44527);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }
}
