package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L99C */
/* JADX INFO: loaded from: classes4.dex */
public final class C10627 extends AbstractC21023 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31919;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f31920;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23411 f31921;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31922;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20714[] f31923;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31924;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f31925;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31926;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31927;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f31928;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f31929;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31930;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f31931;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private synchronized int[] m26656(int i) {
        if (i >= 0) {
            try {
                if (i < this.f31919) {
                    this.f31921.seek(this.f31926 + this.f31920 + this.f31929[i]);
                    C15859 c15859 = new C15859();
                    while (true) {
                        try {
                            int i2 = this.f31921.readInt();
                            if (i2 == -1) {
                                return c15859.mo3586();
                            }
                            c15859.add(i2);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            return null;
                        }
                    }
                }
            } catch (IOException e) {
                throw new C7595(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized String m26657(int i) {
        int i2;
        if (i >= 0) {
            if (i < this.f31930) {
                int i3 = this.f31926 + this.f31922 + this.f31925[i];
                if (i3 >= this.f31927 && i3 < (i2 = this.f31928)) {
                    String strM47856 = m47856(this.f31921, i3, this.f31931, i2);
                    if (strM47856 == null) {
                        int iM26655 = m26655(i);
                        if (iM26655 != -1 && (strM47856 = m47856(this.f31921, iM26655, this.f31931, this.f31928)) != null) {
                            this.f31925[i] = (iM26655 - this.f31926) - this.f31922;
                        }
                        if (strM47856 == null) {
                            strM47856 = "";
                        }
                    }
                    if (strM47856.length() > 10000) {
                        strM47856 = InterfaceC12743.f38313;
                    }
                    return strM47856;
                }
                return InterfaceC12743.f38313;
            }
        }
        return C22412.m50343(i, this.f31930).toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized int m26655(int i) {
        C22412.m50341("getPreviousStringEndOffset " + i);
        if (i == 0) {
            return this.f31926 + this.f31922;
        }
        int i2 = i - 1;
        int iM47850 = AbstractC21023.m47850(this.f31921, this.f31926 + this.f31922 + this.f31925[i2], this.f31931, this.f31928);
        C22412.m50341("new offset " + iM47850);
        if (iM47850 != -1) {
            return iM47850;
        }
        int iM26655 = m26655(i2);
        if (iM26655 == -1) {
            return -1;
        }
        return AbstractC21023.m47850(this.f31921, iM26655, this.f31931, this.f31928);
    }

    public C10627(C23411 c23411) throws IOException {
        this.f31921 = c23411;
        long filePointer = c23411.getFilePointer();
        int i = (int) filePointer;
        if (filePointer != i) {
            throw new ArithmeticException();
        }
        this.f31926 = i;
        C1993 c1993M6524 = C1993.m6524(c23411);
        if (c1993M6524.f6676 == 0) {
            c23411.skipBytes(c1993M6524.f6673 - 8);
            long filePointer2 = c23411.getFilePointer();
            int i2 = (int) filePointer2;
            if (filePointer2 != i2) {
                throw new ArithmeticException();
            }
            this.f31926 = i2;
            c1993M6524 = C1993.m6524(c23411);
        }
        int i3 = c1993M6524.f6673;
        int i4 = c1993M6524.f6674;
        c1993M6524.m6526(1);
        int i5 = c23411.readInt();
        int i6 = c23411.readInt();
        this.f31919 = i6;
        this.f31924 = c23411.readInt();
        int i7 = c23411.readInt();
        int i8 = c23411.readInt();
        this.f31920 = i8;
        if (i4 > 28) {
            c23411.skipBytes(i4 - 28);
        }
        i7 = i7 < i4 ? i4 : i7;
        if ((i6 == 0 || i8 == 0) && (i5 < 0 || (i5 * 4) + i4 > i7)) {
            this.f31919 = 0;
            this.f31920 = 0;
            i5 = (i7 - i4) / 4;
        }
        this.f31930 = i5;
        this.f31922 = i7;
        int i9 = this.f31919;
        if (i9 == 0) {
            this.f31920 = 0;
        }
        if (i5 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i9 > i5) {
            this.f31919 = i5;
        }
        int i10 = this.f31926;
        this.f31927 = i4 + i10;
        int i11 = this.f31920;
        long length = c23411.length();
        this.f31928 = AbstractC21023.m47842(i10, i7, i11, i3, length <= 0 ? 0 : length >= 2147483647L ? Integer.MAX_VALUE : (int) length);
        this.f31925 = new int[i5];
        for (int i12 = 0; i12 < i5; i12++) {
            this.f31925[i12] = c23411.readInt();
        }
        int i13 = this.f31919;
        if (i13 != 0) {
            this.f31929 = new int[i13];
            for (int i14 = 0; i14 < this.f31919; i14++) {
                this.f31929[i14] = c23411.readInt();
            }
        } else {
            this.f31929 = new int[0];
        }
        this.f31923 = new C20714[i5];
        this.f31931 = (this.f31924 & 256) != 0;
        c23411.seek(this.f31926 + i3);
    }

    @Override // l.InterfaceC12743
    public final int size() {
        return this.f31930;
    }

    @Override // l.InterfaceC12743
    public final C20714 getItem(int i) {
        C20714[] c20714Arr = this.f31923;
        if (c20714Arr != null && i >= 0 && i < this.f31930) {
            C20714 c20714 = c20714Arr[i];
            if (c20714 != null) {
                return c20714;
            }
            C20714 c20715 = new C20714(this, m26657(i), m26656(i));
            c20714Arr[i] = c20715;
            return c20715;
        }
        return new C20714(this, m26657(i), m26656(i));
    }

    @Override // l.InterfaceC12743
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3571 mo3389(int i) {
        int i2 = this.f31930;
        if (i < 0 || i >= i2) {
            throw C22412.m50343(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC12743
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3391() {
        return this.f31931;
    }
}
