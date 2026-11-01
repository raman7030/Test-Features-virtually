package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11326 extends AbstractC22349 {

    /* JADX INFO: renamed from: ۖ */
    public int f31535;

    /* JADX INFO: renamed from: ۘ */
    public final int f31536;

    /* JADX INFO: renamed from: ۜ */
    public boolean f31537;

    /* JADX INFO: renamed from: ۡ */
    public int f31538;

    /* JADX INFO: renamed from: ۢ */
    public C22055[] f31539;

    /* JADX INFO: renamed from: ܳ */
    public final int f31540;

    /* JADX INFO: renamed from: ܺ */
    public final int f31541;

    /* JADX INFO: renamed from: ܽ */
    public int f31542;

    /* JADX INFO: renamed from: ܿ */
    public final Object f31543 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public final C5290 f31544;

    /* JADX INFO: renamed from: ᩴ */
    public int f31545;

    /* JADX INFO: renamed from: ᩵ */
    public int[] f31546;

    /* JADX INFO: renamed from: ᩷ */
    public int f31547;

    /* JADX INFO: renamed from: ᩻ */
    public final int f31548;

    public C11326(C7972 c7972) throws IOException {
        C5290 c5290 = c7972.f20961;
        this.f31544 = c5290;
        this.f31542 = c7972.m18455();
        C4263 c4263M8665 = C4263.m8665(c7972);
        if (c4263M8665.f9456 == 0) {
            c7972.m18462(c4263M8665.f9453 - 8);
            this.f31542 = c7972.m18455();
            c4263M8665 = C4263.m8665(c7972);
        }
        int i = c4263M8665.f9454;
        int i2 = c4263M8665.f9453;
        c4263M8665.m8668(1);
        int iM18461 = c7972.m18461();
        int iM18462 = c7972.m18461();
        this.f31535 = iM18462;
        int iM18463 = c7972.m18461();
        int iM18464 = c7972.m18461();
        int iM18465 = c7972.m18461();
        this.f31545 = iM18465;
        if (i > 28) {
            c7972.m18462(i - 28);
        }
        iM18464 = iM18464 < i ? i : iM18464;
        if ((iM18462 == 0 || iM18465 == 0) && (iM18461 < 0 || (iM18461 * 4) + i > iM18464)) {
            this.f31535 = 0;
            this.f31545 = 0;
            iM18461 = (iM18464 - i) / 4;
        }
        this.f31547 = iM18461;
        this.f31538 = iM18464;
        int i3 = this.f31535;
        if (i3 == 0) {
            this.f31545 = 0;
        }
        if (iM18461 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i3 > iM18461) {
            this.f31535 = iM18461;
        }
        int i4 = this.f31542;
        this.f31548 = i + i4;
        this.f31540 = AbstractC22349.m50172(i4, iM18464, this.f31545, i2, c5290.m11438().length);
        this.f31536 = (int) Math.min(((long) this.f31542) + ((long) i2), c5290.m11438().length);
        this.f31541 = c7972.m18455();
        c7972.m18462(iM18461 * 4);
        int i5 = this.f31535;
        if (i5 != 0) {
            this.f31546 = c7972.m18453(i5);
        } else {
            this.f31546 = new int[0];
        }
        this.f31539 = new C22055[iM18461];
        this.f31537 = (iM18463 & 256) != 0;
        c7972.m18459(this.f31542 + i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11326 m26265(C14677 c14677) {
        C7972 c7972M11445 = new C5290(c14677.f41893).m11445(c14677.m33575());
        C11326 c11326 = new C11326(c7972M11445);
        c14677.seek(c7972M11445.m18455());
        return c11326;
    }

    @Override // p067l.InterfaceC14480
    public final int size() {
        return this.f31547;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26269() {
        synchronized (this.f31543) {
            this.f31539 = null;
        }
    }

    @Override // p067l.InterfaceC14480
    public final C22055 getItem(int i) {
        if (i >= 0 && i < this.f31547) {
            synchronized (this.f31543) {
                C22055[] c22055Arr = this.f31539;
                C22055 c22055 = c22055Arr == null ? null : c22055Arr[i];
                if (c22055 != null) {
                    return c22055;
                }
                C22055 c22056 = new C22055(this, m26268(i), m26267(i));
                C22055[] c22055Arr2 = this.f31539;
                if (c22055Arr2 != null) {
                    c22055Arr2[i] = c22056;
                }
                return c22056;
            }
        }
        return new C22055(this, m26268(i), m26267(i));
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5763 mo5708(int i) {
        int i2 = this.f31547;
        if (i < 0 || i >= i2) {
            throw C23669.m52683(i, i2);
        }
        return getItem(i);
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5710() {
        return this.f31537;
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m26268(int i) {
        int i2;
        int iM11442;
        int i3;
        if (i < 0 || i >= this.f31547) {
            return C23669.m52683(i, this.f31547).toString();
        }
        synchronized (this.f31543) {
            i2 = i * 4;
            iM11442 = this.f31542 + this.f31538 + this.f31544.m11442(this.f31541 + i2);
        }
        if (iM11442 < this.f31548 || iM11442 >= (i3 = this.f31540)) {
            return "";
        }
        String strM50185 = m50185(this.f31544, iM11442, this.f31537, i3);
        if (strM50185 != null) {
            return strM50185;
        }
        synchronized (this.f31543) {
            int iM26266 = m26266(i);
            if (iM26266 != -1 && (strM50185 = m50185(this.f31544, iM26266, this.f31537, this.f31540)) != null) {
                C17548.m39930(i2 + this.f31541, (iM26266 - this.f31542) - this.f31538, this.f31544.m11438());
            }
        }
        return strM50185 == null ? "" : strM50185;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m26266(int i) {
        C23669.m52681("getPreviousStringEndOffset " + i);
        int i2 = this.f31542 + this.f31538;
        if (i == 0) {
            return i2;
        }
        int i3 = i - 1;
        int i4 = (i3 * 4) + this.f31541;
        C5290 c5290 = this.f31544;
        int iM11442 = c5290.m11442(i4) + i2;
        boolean z = this.f31537;
        int i5 = this.f31540;
        int iM50179 = AbstractC22349.m50179(c5290, iM11442, z, i5);
        C23669.m52681("new offset " + iM50179);
        if (iM50179 != -1) {
            return iM50179;
        }
        int iM26266 = m26266(i3);
        if (iM26266 == -1) {
            return -1;
        }
        return AbstractC22349.m50179(c5290, iM26266, z, i5);
    }

    /* JADX INFO: renamed from: ܿ */
    private int[] m26267(int i) {
        int i2;
        if (i >= 0 && i < this.f31535 && (i2 = this.f31545) > 0 && i2 >= this.f31538) {
            long j = ((long) this.f31542) + ((long) i2);
            long j2 = (((long) this.f31546[i]) & 4294967295L) + j;
            if (j >= this.f31548) {
                int i3 = this.f31536;
                if (j2 <= ((long) i3) - 4) {
                    C17441 c17441 = new C17441();
                    for (int i4 = (int) j2; i4 <= i3 - 4; i4 += 12) {
                        C5290 c5290 = this.f31544;
                        int iM11442 = c5290.m11442(i4);
                        int i5 = i4 + 4;
                        if (iM11442 == -1) {
                            return c17441.mo5873();
                        }
                        if (i5 > i3 - 8) {
                            return null;
                        }
                        c17441.add(iM11442);
                        c17441.add(c5290.m11442(i5));
                        c17441.add(c5290.m11442(i4 + 8));
                    }
                }
            }
        }
        return null;
    }
}
