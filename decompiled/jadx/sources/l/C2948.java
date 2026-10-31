package l;

/* JADX INFO: renamed from: l.ۗۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2948 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 f9349;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20628 f9352;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9354;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f9356;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9357;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9358;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9359;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f9360;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19882 f9361;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C6516 f9353 = new C6516();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f9350 = new C17714();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f9351 = new C17714(1);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17714 f9355 = new C17714();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m8982() {
        C6516 c6516 = this.f9353;
        c6516.f20124 = 0;
        c6516.f20122 = 0L;
        c6516.f20119 = false;
        c6516.f20121 = false;
        c6516.f20126 = false;
        c6516.f20114 = null;
        this.f9357 = 0;
        this.f9359 = 0;
        this.f9354 = 0;
        this.f9360 = 0;
        this.f9358 = false;
    }

    public C2948(InterfaceC19383 interfaceC19383, C20628 c20628, C19882 c19882, C8353 c8353) {
        this.f9356 = interfaceC19383;
        this.f9352 = c20628;
        this.f9361 = c19882;
        this.f9349 = c8353;
        m8976(c20628, c19882);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8976(C20628 c20628, C19882 c19882) {
        this.f9352 = c20628;
        this.f9361 = c19882;
        this.f9356.mo8456(this.f9349);
        m8982();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8975(C19643 c19643) {
        C14276 c14276 = this.f9352.f66352;
        C19882 c19882 = this.f9353.f20123;
        String str = C3603.f11424;
        C23449 c23449M34036 = c14276.m34036(c19882.f64177);
        C19643 c19643M45154 = c19643.m45154(c23449M34036 != null ? c23449M34036.f75272 : null);
        C1297 c1297M21948 = this.f9349.m21948();
        c1297M21948.m4447(c19643M45154);
        this.f9356.mo8456(c1297M21948.m4440());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m8979() {
        if (!this.f9358) {
            return this.f9352.f66358[this.f9357];
        }
        return this.f9353.f20120[this.f9357];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m8977() {
        if (!this.f9358) {
            return this.f9352.f66357[this.f9357];
        }
        return this.f9353.f20125[this.f9359];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m8981() {
        if (!this.f9358) {
            return this.f9352.f66354[this.f9357];
        }
        return this.f9353.f20113[this.f9357];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8973() {
        int i;
        if (!this.f9358) {
            i = this.f9352.f66353[this.f9357];
        } else {
            i = this.f9353.f20116[this.f9357] ? 1 : 0;
        }
        return m8980() != null ? i | 1073741824 : i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m8978() {
        this.f9357++;
        if (!this.f9358) {
            return false;
        }
        int i = this.f9354 + 1;
        this.f9354 = i;
        int[] iArr = this.f9353.f20111;
        int i2 = this.f9359;
        if (i != iArr[i2]) {
            return true;
        }
        this.f9359 = i2 + 1;
        this.f9354 = 0;
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8974(int i, int i2) {
        C17714 c17714;
        C23449 c23449M8980 = m8980();
        if (c23449M8980 == null) {
            return 0;
        }
        int length = c23449M8980.f75273;
        C6516 c6516 = this.f9353;
        if (length != 0) {
            c17714 = c6516.f20115;
        } else {
            byte[] bArr = c23449M8980.f75270;
            String str = C3603.f11424;
            int length2 = bArr.length;
            C17714 c17715 = this.f9355;
            c17715.m41462(length2, bArr);
            length = bArr.length;
            c17714 = c17715;
        }
        boolean z = c6516.f20121 && c6516.f20117[this.f9357];
        boolean z2 = z || i2 != 0;
        C17714 c17716 = this.f9351;
        c17716.m41482()[0] = (byte) ((z2 ? 128 : 0) | length);
        c17716.m41484(0);
        InterfaceC19383 interfaceC19383 = this.f9356;
        interfaceC19383.mo8457(c17716, 1, 1);
        interfaceC19383.mo8457(c17714, length, 1);
        if (!z2) {
            return length + 1;
        }
        C17714 c17717 = this.f9350;
        if (!z) {
            c17717.m41481(8);
            byte[] bArrM41482 = c17717.m41482();
            bArrM41482[0] = 0;
            bArrM41482[1] = 1;
            bArrM41482[2] = (byte) 0;
            bArrM41482[3] = (byte) (i2 & 255);
            bArrM41482[4] = (byte) ((i >> 24) & 255);
            bArrM41482[5] = (byte) ((i >> 16) & 255);
            bArrM41482[6] = (byte) ((i >> 8) & 255);
            bArrM41482[7] = (byte) (i & 255);
            interfaceC19383.mo8457(c17717, 8, 1);
            return length + 9;
        }
        C17714 c17718 = c6516.f20115;
        int iM41464 = c17718.m41464();
        c17718.m41478(-2);
        int i3 = (iM41464 * 6) + 2;
        if (i2 != 0) {
            c17717.m41481(i3);
            byte[] bArrM41483 = c17717.m41482();
            c17718.m41461(0, i3, bArrM41483);
            int i4 = (((bArrM41483[2] & 255) << 8) | (bArrM41483[3] & 255)) + i2;
            bArrM41483[2] = (byte) ((i4 >> 8) & 255);
            bArrM41483[3] = (byte) (i4 & 255);
        } else {
            c17717 = c17718;
        }
        interfaceC19383.mo8457(c17717, i3, 1);
        return length + 1 + i3;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23449 m8980() {
        if (!this.f9358) {
            return null;
        }
        C6516 c6516 = this.f9353;
        C19882 c19882 = c6516.f20123;
        String str = C3603.f11424;
        int i = c19882.f64177;
        C23449 c23449M34036 = c6516.f20114;
        if (c23449M34036 == null) {
            c23449M34036 = this.f9352.f66352.m34036(i);
        }
        if (c23449M34036 == null || !c23449M34036.f75271) {
            return null;
        }
        return c23449M34036;
    }
}
