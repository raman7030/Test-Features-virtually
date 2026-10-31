package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18161 extends AbstractC23141 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56469;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo42266();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo3394(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC16749 mo3395(int i, int i2);

    public AbstractC18161(int i) {
        this.f56469 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return ((long) mo42266()) - ((long) this.f56469);
    }

    @Override // l.InterfaceC18764
    public boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f56469 >= mo42266()) {
            return false;
        }
        int i = this.f56469;
        this.f56469 = i + 1;
        intConsumer.accept(mo3394(i));
        return true;
    }

    @Override // l.AbstractC23141, l.InterfaceC18764
    public void forEachRemaining(IntConsumer intConsumer) {
        int iMo42266 = mo42266();
        while (true) {
            int i = this.f56469;
            if (i >= iMo42266) {
                return;
            }
            intConsumer.accept(mo3394(i));
            this.f56469++;
        }
    }

    @Override // l.AbstractC23141, l.InterfaceC1124, l.InterfaceC15234
    public InterfaceC16749 trySplit() {
        int iMo42266 = mo42266();
        int i = this.f56469;
        int iMo42267 = mo42266();
        int i2 = this.f56469;
        int iM19938 = C7416.m19938(iMo42267, i2, 2, i);
        if (iM19938 == i2 || iM19938 == iMo42266) {
            return null;
        }
        if (iM19938 >= i2 && iM19938 <= iMo42266) {
            InterfaceC16749 interfaceC16749Mo3395 = mo3395(i2, iM19938);
            this.f56469 = iM19938;
            return interfaceC16749Mo3395;
        }
        StringBuilder sbM32308 = C13325.m32308(iM19938, "splitPoint ", " outside of range of current position ");
        sbM32308.append(this.f56469);
        sbM32308.append(" and range end ");
        sbM32308.append(iMo42266);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }
}
