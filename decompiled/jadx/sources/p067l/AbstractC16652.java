package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16652 extends AbstractC25073 {

    /* JADX INFO: renamed from: ᩸ */
    public int f48922;

    @Override // p067l.InterfaceC16847
    public int characteristics() {
        return 16464;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo11328();

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo7515(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC9948 mo7516(int i, int i2);

    public AbstractC16652(int i) {
        this.f48922 = i;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return ((long) mo11328()) - ((long) this.f48922);
    }

    @Override // p067l.InterfaceC16847
    public boolean tryAdvance(Consumer consumer) {
        if (this.f48922 >= mo11328()) {
            return false;
        }
        int i = this.f48922;
        this.f48922 = i + 1;
        consumer.accept(mo7515(i));
        return true;
    }

    @Override // p067l.AbstractC25073, p067l.InterfaceC16847
    public void forEachRemaining(Consumer consumer) {
        int iMo11328 = mo11328();
        while (true) {
            int i = this.f48922;
            if (i >= iMo11328) {
                return;
            }
            consumer.accept(mo7515(i));
            this.f48922++;
        }
    }

    @Override // p067l.InterfaceC16847
    public InterfaceC9948 trySplit() {
        int iMo11328 = mo11328();
        int i = this.f48922;
        int iMo11329 = mo11328();
        int i2 = this.f48922;
        int iM21912 = C9417.m21912(iMo11329, i2, 2, i);
        if (iM21912 == i2 || iM21912 == iMo11328) {
            return null;
        }
        if (iM21912 >= i2 && iM21912 <= iMo11328) {
            InterfaceC9948 interfaceC9948Mo7516 = mo7516(i2, iM21912);
            this.f48922 = iM21912;
            return interfaceC9948Mo7516;
        }
        StringBuilder sbM34408 = C15033.m34408(iM21912, "splitPoint ", " outside of range of current position ");
        sbM34408.append(this.f48922);
        sbM34408.append(" and range end ");
        sbM34408.append(iMo11328);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }
}
