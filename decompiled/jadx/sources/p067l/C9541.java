package p067l;

/* JADX INFO: renamed from: l.۟ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public class C9541 implements InterfaceC15575 {

    /* JADX INFO: renamed from: ܽ */
    public int[] f26232;

    /* JADX INFO: renamed from: ۧ */
    public int f26231 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f26230 = 1;

    /* JADX INFO: renamed from: ܽ */
    public void mo8998(int i) {
    }

    @Override // p067l.InterfaceC15575
    /* JADX INFO: renamed from: ֫ */
    public int mo22240(int i) {
        if (i == this.f26231) {
            return this.f26230;
        }
        this.f26231 = i;
        int length = this.f26232.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >> 1;
            int i4 = this.f26232[i3];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    int i5 = i3 + 1;
                    this.f26230 = i5;
                    return i5;
                }
                length = i3 - 1;
            }
        }
        this.f26230 = i2;
        return i2;
    }

    @Override // p067l.InterfaceC15575
    /* JADX INFO: renamed from: ۧ */
    public int mo8997(int i) {
        return (i - this.f26232[mo22240(i) - 1]) + 1;
    }
}
