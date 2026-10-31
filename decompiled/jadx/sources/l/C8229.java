package l;

/* JADX INFO: renamed from: l.۠ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8229 implements InterfaceC1173 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f25345;

    public C8229(int[] iArr) {
        this.f25345 = iArr;
    }

    @Override // l.InterfaceC1173
    /* JADX INFO: renamed from: ۧ */
    public final int mo3972(int i) {
        m21779(i);
        if (i == 0) {
            return 0;
        }
        return this.f25345[i - 1] + 1;
    }

    @Override // l.InterfaceC1173
    /* JADX INFO: renamed from: ֫ */
    public final int mo3971(int i) {
        m21779(i);
        return this.f25345[i];
    }

    @Override // l.InterfaceC1173
    /* JADX INFO: renamed from: ܽ */
    public final int mo3973(int i) {
        m21779(i);
        int[] iArr = this.f25345;
        return iArr[i] + (i == iArr.length - 1 ? 0 : 1);
    }

    @Override // l.InterfaceC1173
    /* JADX INFO: renamed from: ֫ */
    public final int mo3970() {
        return this.f25345.length;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m21779(int i) {
        int[] iArr = this.f25345;
        if (i < 0 || i >= iArr.length) {
            StringBuilder sbM32308 = C13325.m32308(i, "Wrong line: ", ". Available lines count: ");
            sbM32308.append(iArr.length);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
