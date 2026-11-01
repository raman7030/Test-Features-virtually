package p067l;

/* JADX INFO: renamed from: l.ܽܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C18330 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f54737;

    /* JADX INFO: renamed from: ۧ */
    public int f54738;

    /* JADX INFO: renamed from: ܽ */
    public int f54739;

    public C18330(int i) {
        this.f54737 = new int[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m41765() {
        return this.f54739;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41762(int i) {
        int i2 = this.f54739;
        int[] iArr = this.f54737;
        if (i2 == iArr.length) {
            throw new IllegalStateException("Code point window is full");
        }
        int length = this.f54738 + i2;
        if (length >= iArr.length) {
            length -= iArr.length;
        }
        iArr[length] = i;
        this.f54739 = i2 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41764(InterfaceC4249 interfaceC4249) {
        if (this.f54739 == 0) {
            throw new IllegalStateException("Code point window is empty");
        }
        int i = this.f54738;
        int[] iArr = this.f54737;
        interfaceC4249.mo8630(iArr[i]);
        int i2 = this.f54738 + 1;
        if (i2 == iArr.length) {
            i2 = 0;
        }
        this.f54738 = i2;
        this.f54739--;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41763(int i, InterfaceC4249 interfaceC4249) {
        if (i < 0 || i > this.f54739) {
            throw new IllegalArgumentException("Code point count is out of range");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m41764(interfaceC4249);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41766(InterfaceC4249 interfaceC4249) {
        m41763(this.f54739, interfaceC4249);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41761() {
        int length;
        int[] iArr;
        int i = this.f54739;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
            length = this.f54738 + i;
            iArr = this.f54737;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
        } while (iArr[length] != 10);
        return i;
    }
}
