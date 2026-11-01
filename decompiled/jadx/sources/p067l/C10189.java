package p067l;

/* JADX INFO: renamed from: l.۠ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10189 implements InterfaceC3483 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f28255;

    public C10189(int[] iArr) {
        this.f28255 = iArr;
    }

    @Override // p067l.InterfaceC3483
    /* JADX INFO: renamed from: ۧ */
    public final int mo6214(int i) {
        m23748(i);
        if (i == 0) {
            return 0;
        }
        return this.f28255[i - 1] + 1;
    }

    @Override // p067l.InterfaceC3483
    /* JADX INFO: renamed from: ֫ */
    public final int mo6213(int i) {
        m23748(i);
        return this.f28255[i];
    }

    @Override // p067l.InterfaceC3483
    /* JADX INFO: renamed from: ܽ */
    public final int mo6215(int i) {
        m23748(i);
        int[] iArr = this.f28255;
        return iArr[i] + (i == iArr.length - 1 ? 0 : 1);
    }

    @Override // p067l.InterfaceC3483
    /* JADX INFO: renamed from: ֫ */
    public final int mo6212() {
        return this.f28255.length;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m23748(int i) {
        int[] iArr = this.f28255;
        if (i < 0 || i >= iArr.length) {
            StringBuilder sbM34408 = C15033.m34408(i, "Wrong line: ", ". Available lines count: ");
            sbM34408.append(iArr.length);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
