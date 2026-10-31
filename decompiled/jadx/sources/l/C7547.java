package l;

/* JADX INFO: renamed from: l.۟ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public class C7547 implements InterfaceC13896 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f23319;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23318 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23317 = 1;

    /* JADX INFO: renamed from: ܽ */
    public void mo6872(int i) {
    }

    @Override // l.InterfaceC13896
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo20264(int i) {
        if (i == this.f23318) {
            return this.f23317;
        }
        this.f23318 = i;
        int length = this.f23319.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >> 1;
            int i4 = this.f23319[i3];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    int i5 = i3 + 1;
                    this.f23317 = i5;
                    return i5;
                }
                length = i3 - 1;
            }
        }
        this.f23317 = i2;
        return i2;
    }

    @Override // l.InterfaceC13896
    /* JADX INFO: renamed from: ۧ */
    public int mo6871(int i) {
        return (i - this.f23319[mo20264(i) - 1]) + 1;
    }
}
