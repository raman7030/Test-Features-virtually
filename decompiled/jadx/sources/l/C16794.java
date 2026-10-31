package l;

/* JADX INFO: renamed from: l.ܽܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C16794 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f51555;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51557;

    public C16794(int i) {
        this.f51555 = new int[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39529() {
        return this.f51557;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39526(int i) {
        int i2 = this.f51557;
        int[] iArr = this.f51555;
        if (i2 == iArr.length) {
            throw new IllegalStateException("Code point window is full");
        }
        int length = this.f51556 + i2;
        if (length >= iArr.length) {
            length -= iArr.length;
        }
        iArr[length] = i;
        this.f51557 = i2 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39528(InterfaceC1978 interfaceC1978) {
        if (this.f51557 == 0) {
            throw new IllegalStateException("Code point window is empty");
        }
        int i = this.f51556;
        int[] iArr = this.f51555;
        interfaceC1978.mo6488(iArr[i]);
        int i2 = this.f51556 + 1;
        if (i2 == iArr.length) {
            i2 = 0;
        }
        this.f51556 = i2;
        this.f51557--;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39527(int i, InterfaceC1978 interfaceC1978) {
        if (i < 0 || i > this.f51557) {
            throw new IllegalArgumentException("Code point count is out of range");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m39528(interfaceC1978);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39530(InterfaceC1978 interfaceC1978) {
        m39527(this.f51557, interfaceC1978);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39525() {
        int length;
        int[] iArr;
        int i = this.f51557;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
            length = this.f51556 + i;
            iArr = this.f51555;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
        } while (iArr[length] != 10);
        return i;
    }
}
