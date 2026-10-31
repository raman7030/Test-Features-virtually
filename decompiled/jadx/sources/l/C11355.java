package l;

/* JADX INFO: renamed from: l.ۨ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11355 extends C5855 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f33988;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5855[] f33989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f33990 = 2;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5855 f33991;

    public C11355(C5855 c5855, C5855 c5856, C5855 c5857) {
        this.f33989 = new C5855[]{c5855, c5856};
        this.f33991 = c5857;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28103() {
        this.f33988 = null;
        int i = -1;
        for (int i2 = 0; i2 < this.f33990; i2++) {
            int iM28101 = m28101(this.f33989[i2]);
            if (iM28101 >= 0) {
                if (i >= 0 && i != iM28101) {
                    int[] iArr = new int[this.f33990];
                    for (int i3 = 0; i3 < this.f33990; i3++) {
                        iArr[i3] = m28101(this.f33989[i3]);
                    }
                    this.f33988 = iArr;
                    return;
                }
                i = iM28101;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28101(C5855 c5855) {
        int i;
        for (int i2 = 0; i2 < 64 && ((c5855 instanceof C5150) || (c5855 instanceof C22643)); i2++) {
            c5855 = c5855.f17958;
        }
        if (!(c5855 instanceof C9259)) {
            return -1;
        }
        int[] iArr = ((C9259) c5855).f7231;
        if (iArr.length <= 0 || (i = iArr[0]) < 0 || i >= 128) {
            return -1;
        }
        return i;
    }
}
