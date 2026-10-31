package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7933 extends AbstractC23099 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24556;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo21240();

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo13904(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC0877 mo13905(int i, int i2);

    public AbstractC7933(int i) {
        this.f24556 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return ((long) mo21240()) - ((long) this.f24556);
    }

    @Override // l.InterfaceC0418
    public boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f24556 >= mo21240()) {
            return false;
        }
        int i = this.f24556;
        this.f24556 = i + 1;
        longConsumer.accept(mo13904(i));
        return true;
    }

    @Override // l.AbstractC23099, l.InterfaceC0418
    public void forEachRemaining(LongConsumer longConsumer) {
        int iMo21240 = mo21240();
        while (true) {
            int i = this.f24556;
            if (i >= iMo21240) {
                return;
            }
            longConsumer.accept(mo13904(i));
            this.f24556++;
        }
    }

    @Override // l.AbstractC23099, l.InterfaceC15234
    public InterfaceC0877 trySplit() {
        int iMo21240 = mo21240();
        int i = this.f24556;
        int iMo21241 = mo21240();
        int i2 = this.f24556;
        int iM19938 = C7416.m19938(iMo21241, i2, 2, i);
        if (iM19938 == i2 || iM19938 == iMo21240) {
            return null;
        }
        if (iM19938 >= i2 && iM19938 <= iMo21240) {
            InterfaceC0877 interfaceC0877Mo13905 = mo13905(i2, iM19938);
            this.f24556 = iM19938;
            return interfaceC0877Mo13905;
        }
        StringBuilder sbM32308 = C13325.m32308(iM19938, "splitPoint ", " outside of range of current position ");
        sbM32308.append(this.f24556);
        sbM32308.append(" and range end ");
        sbM32308.append(iMo21240);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }
}
