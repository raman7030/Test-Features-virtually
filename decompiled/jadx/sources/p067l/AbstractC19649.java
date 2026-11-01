package p067l;

/* JADX INFO: renamed from: l.ᩳܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19649 extends AbstractC3464 {

    /* JADX INFO: renamed from: ᩸ */
    public int f59774;

    @Override // p067l.InterfaceC16847
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract char mo15611(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo44674();

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC18307 mo15612(int i, int i2);

    public AbstractC19649(int i) {
        this.f59774 = i;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return ((long) mo44674()) - ((long) this.f59774);
    }

    @Override // p067l.InterfaceC3437
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC24857 interfaceC24857) {
        if (this.f59774 >= mo44674()) {
            return false;
        }
        int i = this.f59774;
        this.f59774 = i + 1;
        interfaceC24857.mo20276(mo15611(i));
        return true;
    }

    @Override // p067l.AbstractC3464, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC24857 interfaceC24857) {
        int iMo44674 = mo44674();
        while (true) {
            int i = this.f59774;
            if (i >= iMo44674) {
                return;
            }
            interfaceC24857.mo20276(mo15611(i));
            this.f59774++;
        }
    }

    @Override // p067l.AbstractC3464, p067l.InterfaceC16847
    public InterfaceC18307 trySplit() {
        int iMo44674 = mo44674();
        int i = this.f59774;
        int iMo44675 = mo44674();
        int i2 = this.f59774;
        int iM21912 = C9417.m21912(iMo44675, i2, 2, i);
        if (iM21912 == i2 || iM21912 == iMo44674) {
            return null;
        }
        if (iM21912 >= i2 && iM21912 <= iMo44674) {
            InterfaceC18307 interfaceC18307Mo15612 = mo15612(i2, iM21912);
            this.f59774 = iM21912;
            return interfaceC18307Mo15612;
        }
        StringBuilder sbM34408 = C15033.m34408(iM21912, "splitPoint ", " outside of range of current position ");
        sbM34408.append(this.f59774);
        sbM34408.append(" and range end ");
        sbM34408.append(iMo44674);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }
}
