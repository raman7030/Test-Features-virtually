package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15029 extends AbstractC23889 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45806;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16464;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9286();

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo5286(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC7975 mo5287(int i, int i2);

    public AbstractC15029(int i) {
        this.f45806 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return ((long) mo9286()) - ((long) this.f45806);
    }

    @Override // l.InterfaceC15234
    public boolean tryAdvance(Consumer consumer) {
        if (this.f45806 >= mo9286()) {
            return false;
        }
        int i = this.f45806;
        this.f45806 = i + 1;
        consumer.accept(mo5286(i));
        return true;
    }

    @Override // l.AbstractC23889, l.InterfaceC15234
    public void forEachRemaining(Consumer consumer) {
        int iMo9286 = mo9286();
        while (true) {
            int i = this.f45806;
            if (i >= iMo9286) {
                return;
            }
            consumer.accept(mo5286(i));
            this.f45806++;
        }
    }

    @Override // l.InterfaceC15234
    public InterfaceC7975 trySplit() {
        int iMo9286 = mo9286();
        int i = this.f45806;
        int iMo9287 = mo9286();
        int i2 = this.f45806;
        int iM19938 = C7416.m19938(iMo9287, i2, 2, i);
        if (iM19938 == i2 || iM19938 == iMo9286) {
            return null;
        }
        if (iM19938 >= i2 && iM19938 <= iMo9286) {
            InterfaceC7975 interfaceC7975Mo5287 = mo5287(i2, iM19938);
            this.f45806 = iM19938;
            return interfaceC7975Mo5287;
        }
        StringBuilder sbM32308 = C13325.m32308(iM19938, "splitPoint ", " outside of range of current position ");
        sbM32308.append(this.f45806);
        sbM32308.append(" and range end ");
        sbM32308.append(iMo9286);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }
}
