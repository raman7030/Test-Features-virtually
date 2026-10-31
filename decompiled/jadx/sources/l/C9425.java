package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9425 extends AbstractC21023 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28588;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f28589;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f28590;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f28591;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20714[] f28592;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f28593;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f28594;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28595;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f28596 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3074 f28597;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f28598;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int[] f28599;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f28600;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f28601;

    public C9425(C5896 c5896) throws IOException {
        C3074 c3074 = c5896.f18106;
        this.f28597 = c3074;
        this.f28595 = c5896.m16529();
        C1993 c1993M6523 = C1993.m6523(c5896);
        if (c1993M6523.f6676 == 0) {
            c5896.m16536(c1993M6523.f6673 - 8);
            this.f28595 = c5896.m16529();
            c1993M6523 = C1993.m6523(c5896);
        }
        int i = c1993M6523.f6674;
        int i2 = c1993M6523.f6673;
        c1993M6523.m6526(1);
        int iM16535 = c5896.m16535();
        int iM16536 = c5896.m16535();
        this.f28588 = iM16536;
        int iM16537 = c5896.m16535();
        int iM16538 = c5896.m16535();
        int iM16539 = c5896.m16535();
        this.f28598 = iM16539;
        if (i > 28) {
            c5896.m16536(i - 28);
        }
        iM16538 = iM16538 < i ? i : iM16538;
        if ((iM16536 == 0 || iM16539 == 0) && (iM16535 < 0 || (iM16535 * 4) + i > iM16538)) {
            this.f28588 = 0;
            this.f28598 = 0;
            iM16535 = (iM16538 - i) / 4;
        }
        this.f28600 = iM16535;
        this.f28591 = iM16538;
        int i3 = this.f28588;
        if (i3 == 0) {
            this.f28598 = 0;
        }
        if (iM16535 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i3 > iM16535) {
            this.f28588 = iM16535;
        }
        int i4 = this.f28595;
        this.f28601 = i + i4;
        this.f28593 = AbstractC21023.m47842(i4, iM16538, this.f28598, i2, c3074.m9396().length);
        this.f28589 = (int) Math.min(((long) this.f28595) + ((long) i2), c3074.m9396().length);
        this.f28594 = c5896.m16529();
        c5896.m16536(iM16535 * 4);
        int i5 = this.f28588;
        if (i5 != 0) {
            this.f28599 = c5896.m16527(i5);
        } else {
            this.f28599 = new int[0];
        }
        this.f28592 = new C20714[iM16535];
        this.f28590 = (iM16537 & 256) != 0;
        c5896.m16533(this.f28595 + i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9425 m24255(C12951 c12951) {
        C5896 c5896M9403 = new C3074(c12951.f38849).m9403(c12951.m31488());
        C9425 c9425 = new C9425(c5896M9403);
        c12951.seek(c5896M9403.m16529());
        return c9425;
    }

    @Override // l.InterfaceC12743
    public final int size() {
        return this.f28600;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24259() {
        synchronized (this.f28596) {
            this.f28592 = null;
        }
    }

    @Override // l.InterfaceC12743
    public final C20714 getItem(int i) {
        if (i >= 0 && i < this.f28600) {
            synchronized (this.f28596) {
                C20714[] c20714Arr = this.f28592;
                C20714 c20714 = c20714Arr == null ? null : c20714Arr[i];
                if (c20714 != null) {
                    return c20714;
                }
                C20714 c20715 = new C20714(this, m24258(i), m24257(i));
                C20714[] c20714Arr2 = this.f28592;
                if (c20714Arr2 != null) {
                    c20714Arr2[i] = c20715;
                }
                return c20715;
            }
        }
        return new C20714(this, m24258(i), m24257(i));
    }

    @Override // l.InterfaceC12743
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3571 mo3389(int i) {
        int i2 = this.f28600;
        if (i < 0 || i >= i2) {
            throw C22412.m50343(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC12743
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3391() {
        return this.f28590;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m24258(int i) {
        int i2;
        int iM9400;
        int i3;
        if (i < 0 || i >= this.f28600) {
            return C22412.m50343(i, this.f28600).toString();
        }
        synchronized (this.f28596) {
            i2 = i * 4;
            iM9400 = this.f28595 + this.f28591 + this.f28597.m9400(this.f28594 + i2);
        }
        if (iM9400 < this.f28601 || iM9400 >= (i3 = this.f28593)) {
            return "";
        }
        String strM47855 = m47855(this.f28597, iM9400, this.f28590, i3);
        if (strM47855 != null) {
            return strM47855;
        }
        synchronized (this.f28596) {
            int iM24256 = m24256(i);
            if (iM24256 != -1 && (strM47855 = m47855(this.f28597, iM24256, this.f28590, this.f28593)) != null) {
                C15972.m37746(i2 + this.f28594, (iM24256 - this.f28595) - this.f28591, this.f28597.m9396());
            }
        }
        return strM47855 == null ? "" : strM47855;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m24256(int i) {
        C22412.m50341("getPreviousStringEndOffset " + i);
        int i2 = this.f28595 + this.f28591;
        if (i == 0) {
            return i2;
        }
        int i3 = i - 1;
        int i4 = (i3 * 4) + this.f28594;
        C3074 c3074 = this.f28597;
        int iM9400 = c3074.m9400(i4) + i2;
        boolean z = this.f28590;
        int i5 = this.f28593;
        int iM47849 = AbstractC21023.m47849(c3074, iM9400, z, i5);
        C22412.m50341("new offset " + iM47849);
        if (iM47849 != -1) {
            return iM47849;
        }
        int iM24256 = m24256(i3);
        if (iM24256 == -1) {
            return -1;
        }
        return AbstractC21023.m47849(c3074, iM24256, z, i5);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int[] m24257(int i) {
        int i2;
        if (i >= 0 && i < this.f28588 && (i2 = this.f28598) > 0 && i2 >= this.f28591) {
            long j = ((long) this.f28595) + ((long) i2);
            long j2 = (((long) this.f28599[i]) & 4294967295L) + j;
            if (j >= this.f28601) {
                int i3 = this.f28589;
                if (j2 <= ((long) i3) - 4) {
                    C15859 c15859 = new C15859();
                    for (int i4 = (int) j2; i4 <= i3 - 4; i4 += 12) {
                        C3074 c3074 = this.f28597;
                        int iM9400 = c3074.m9400(i4);
                        int i5 = i4 + 4;
                        if (iM9400 == -1) {
                            return c15859.mo3586();
                        }
                        if (i5 > i3 - 8) {
                            return null;
                        }
                        c15859.add(iM9400);
                        c15859.add(c3074.m9400(i5));
                        c15859.add(c3074.m9400(i4 + 8));
                    }
                }
            }
        }
        return null;
    }
}
