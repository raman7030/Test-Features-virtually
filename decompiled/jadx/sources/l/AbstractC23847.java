package l;

/* JADX INFO: renamed from: l.᩻ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23847 extends AbstractC18203 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77169;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f77170;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo21906();

    @Override // l.AbstractC22415, l.InterfaceC15234
    public final InterfaceC16791 trySplit() {
        InterfaceC16791 interfaceC16791Mo21905;
        int iMo42418 = mo42418();
        int i = this.f56589;
        int iMo42419 = mo42418();
        int i2 = this.f56589;
        int iM19938 = C7416.m19938(iMo42419, i2, 2, i);
        if (iM19938 == i2 || iM19938 == iMo42418) {
            interfaceC16791Mo21905 = null;
        } else {
            if (iM19938 < i2 || iM19938 > iMo42418) {
                StringBuilder sbM32308 = C13325.m32308(iM19938, "splitPoint ", " outside of range of current position ");
                sbM32308.append(this.f56589);
                sbM32308.append(" and range end ");
                sbM32308.append(iMo42418);
                throw new IndexOutOfBoundsException(sbM32308.toString());
            }
            interfaceC16791Mo21905 = mo21905(i2, iM19938);
            this.f56589 = iM19938;
        }
        if (!this.f77169 && interfaceC16791Mo21905 != null) {
            this.f77170 = mo21906();
            this.f77169 = true;
        }
        return interfaceC16791Mo21905;
    }

    public AbstractC23847(int i) {
        super(i);
        this.f77170 = -1;
        this.f77169 = false;
    }

    public AbstractC23847(int i, int i2) {
        super(i);
        this.f77170 = i2;
        this.f77169 = true;
    }

    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ֫ */
    public final int mo42418() {
        return this.f77169 ? this.f77170 : mo21906();
    }
}
