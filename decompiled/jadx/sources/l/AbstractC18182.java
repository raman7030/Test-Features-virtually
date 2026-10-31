package l;

/* JADX INFO: renamed from: l.ᩳܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18182 extends AbstractC1153 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56561;

    @Override // l.InterfaceC15234
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract char mo13736(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo42413();

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC16770 mo13737(int i, int i2);

    public AbstractC18182(int i) {
        this.f56561 = i;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return ((long) mo42413()) - ((long) this.f56561);
    }

    @Override // l.InterfaceC1124
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC23662 interfaceC23662) {
        if (this.f56561 >= mo42413()) {
            return false;
        }
        int i = this.f56561;
        this.f56561 = i + 1;
        interfaceC23662.mo18328(mo13736(i));
        return true;
    }

    @Override // l.AbstractC1153, l.InterfaceC1124
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC23662 interfaceC23662) {
        int iMo42413 = mo42413();
        while (true) {
            int i = this.f56561;
            if (i >= iMo42413) {
                return;
            }
            interfaceC23662.mo18328(mo13736(i));
            this.f56561++;
        }
    }

    @Override // l.AbstractC1153, l.InterfaceC15234
    public InterfaceC16770 trySplit() {
        int iMo42413 = mo42413();
        int i = this.f56561;
        int iMo42414 = mo42413();
        int i2 = this.f56561;
        int iM19938 = C7416.m19938(iMo42414, i2, 2, i);
        if (iM19938 == i2 || iM19938 == iMo42413) {
            return null;
        }
        if (iM19938 >= i2 && iM19938 <= iMo42413) {
            InterfaceC16770 interfaceC16770Mo13737 = mo13737(i2, iM19938);
            this.f56561 = iM19938;
            return interfaceC16770Mo13737;
        }
        StringBuilder sbM32308 = C13325.m32308(iM19938, "splitPoint ", " outside of range of current position ");
        sbM32308.append(this.f56561);
        sbM32308.append(" and range end ");
        sbM32308.append(iMo42413);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }
}
