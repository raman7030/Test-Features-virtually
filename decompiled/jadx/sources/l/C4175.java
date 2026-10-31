package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4175 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f13612;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f13614;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2267 f13615;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21605 f13616;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f13617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12641 f13620;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f13622;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11999 f13623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Thread f13619 = Thread.currentThread();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2309 f13613 = new C2309();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13621 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC23015 f13618 = InterfaceC23015.f74090;

    public C4175(C21605 c21605, InterfaceC20758 interfaceC20758) {
        this.f13616 = c21605;
        this.f13622 = interfaceC20758;
        this.f13615 = C2267.m7494(c21605.f69370, new byte[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12622(C9114 c9114, C19928 c19928, int i, int i2, C4405 c4405, byte[] bArr) throws Throwable {
        m12614();
        if (this.f13623 != null || this.f13620 != null) {
            throw new IllegalStateException("Legacy editor state already supplied");
        }
        try {
            if (i < 1 || i > 1024 || i2 < 0 || i2 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C9820 c9820M23491 = c9114.m23491();
            C9114.m23481(c9820M23491.f29678);
            m12620(new C21109(c9820M23491), c9114.m23491().m24893(), c19928, c9114.m23489());
            int iM29347 = this.f13623.m29347();
            m12621(c9114.m23490(), c9114.m23488(), c9114.m23492());
            int iM12618 = m12618(i, i2, new C1909(c4405));
            C12704 c12704 = new C12704(this.f13623, 0L);
            try {
                C0646 c0646 = new C0646(c12704, iM12618, iM29347);
                try {
                    C9820 c9820M23483 = c9114.m23483(7);
                    if (c9820M23483 != null) {
                        C9114.m23481(c9820M23483.f29678);
                        C23930 c23930 = new C23930(c9820M23483.m24893(), new C21109(c9820M23483));
                        try {
                            c0646.m2659(c23930.readInt());
                            c0646.m2659(c23930.readInt());
                            c23930.m52709();
                            c23930.close();
                        } catch (Throwable th) {
                            try {
                                c23930.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    C9820[] c9820Arr = {c9114.m23482(), c9114.m23487()};
                    for (int i3 = 0; i3 < 2; i3++) {
                        C9820 c9820 = c9820Arr[i3];
                        if (c9820 != null) {
                            C9114.m23481(c9820.f29678);
                            c0646.m2660(new C21109(c9820), c9820.m24893(), new C9005());
                        }
                    }
                    c0646.close();
                    c12704.close();
                    C17580 c17580M41103 = C17580.m41103(c9114, iM12618, iM29347, bArr, this.f13616.f69370);
                    try {
                        m12619(c17580M41103.length(), c17580M41103.m41109());
                        c17580M41103.close();
                    } catch (Throwable th3) {
                        try {
                            c17580M41103.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c0646.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    c12704.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (IOException e) {
            e = e;
            this.f13614 = true;
            throw e;
        } catch (Error e2) {
            e = e2;
            this.f13614 = true;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            this.f13614 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12620(InputStream inputStream, long j, C19928 c19928, int i) {
        Integer numValueOf = Integer.valueOf(i);
        try {
            C23930 c23930 = new C23930(j, inputStream);
            m12614();
            if (this.f13623 != null) {
                throw new IllegalStateException("Legacy text already supplied");
            }
            try {
                C11999 c11999M52702 = c23930.m52702(this.f13616, new C4236(2, c19928), numValueOf);
                c23930.m52709();
                this.f13623 = c11999M52702;
                ((C21109) inputStream).f68099 = true;
            } catch (C4880 e) {
                this.f13614 = true;
                throw e;
            }
        } catch (Throwable th) {
            try {
                ((C21109) inputStream).f68099 = true;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12621(C5089 c5089, int i, int i2) {
        m12614();
        if (this.f13623 != null) {
            if (this.f13612 || this.f13617) {
                throw new IllegalStateException("Legacy history already supplied or pages joined");
            }
            if (c5089.m14642() > this.f13623.m29347() || c5089.m14640() > this.f13623.m29347()) {
                throw new IllegalArgumentException("Legacy selection exceeds text");
            }
            this.f13613 = new C2309(new C9611(), c5089, ((long) i) & 4294967295L, ((long) i2) & 4294967295L, 16777216L);
            this.f13612 = true;
            return;
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12618(int i, int i2, C1909 c1909) throws Throwable {
        String str;
        int i3;
        C11999 c11999M46730;
        int i4 = i2;
        m12614();
        C11999 c11999 = this.f13623;
        if (c11999 != null) {
            if (this.f13617) {
                throw new IllegalStateException("Legacy pages already joined");
            }
            C2309 c2309 = this.f13613;
            if (i < 1 || i > 1024 || i4 < 0 || i4 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C21605 c21605 = c11999.f35930;
            if (c21605 == null) {
                throw new IllegalArgumentException("Legacy page migration requires a page store");
            }
            C11999 c11999M29333 = C11999.m29333(c21605.f69369, c21605.f69373, c21605);
            int i5 = 0;
            int iM29347 = 0;
            while (i5 < i) {
                if (i5 == i4) {
                    iM29347 = c11999M29333.m29347();
                    c11999M46730 = c11999;
                } else {
                    C1352 c1352M4716 = C1352.m4716(((C4405) c1909.f6432).m13134(i5), c21605.f69370);
                    try {
                        c11999M46730 = C20403.m46730(c1352M4716, c21605, Integer.MAX_VALUE - c11999M29333.m29347(), null);
                        c1352M4716.close();
                    } catch (Throwable th) {
                        try {
                            c1352M4716.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                C11999 c119910 = c11999;
                if (((long) c11999M29333.m29347()) + ((long) c11999M46730.m29347()) > Integer.MAX_VALUE) {
                    throw new IOException("Legacy pages exceed migration coordinate limit");
                }
                c11999M29333 = c11999M29333.m29346(c11999M46730);
                i5++;
                i4 = i2;
                c11999 = c119910;
            }
            C9611 c9611 = new C9611();
            C5089 c5089 = c2309.f7443;
            int iM14642 = c5089.m14642();
            int i6 = -1;
            if (iM14642 == -1) {
                i3 = -1;
                str = "Legacy page coordinate exceeds limit";
            } else {
                str = "Legacy page coordinate exceeds limit";
                if (((long) iM14642) + ((long) iM29347) > 2147483647L) {
                    throw new IOException(str);
                }
                i3 = iM14642 + iM29347;
            }
            int iM14640 = c5089.m14640();
            if (iM14640 != -1) {
                if (((long) iM14640) + ((long) iM29347) > 2147483647L) {
                    throw new IOException(str);
                }
                i6 = iM14640 + iM29347;
            }
            C5586 c5586 = new C5586(c11999M29333, new C2309(c9611, new C5089(i3, i6), c2309.f7440, c2309.f7444, c2309.f7442), iM29347);
            this.f13623 = c5586.m15876();
            this.f13613 = c5586.m15875();
            this.f13617 = true;
            return c5586.m15874();
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12619(long j, InputStream inputStream) throws IOException {
        try {
            m12614();
            if (this.f13620 != null) {
                throw new IllegalStateException("Migration state already supplied");
            }
            this.f13614 = true;
            InterfaceC20758 interfaceC20758 = this.f13622;
            C21605 c21605 = this.f13616;
            this.f13620 = C6291.m17329(interfaceC20758, c21605.f69374, inputStream, j, c21605.f69370, this.f13618);
            inputStream.close();
            this.f13614 = false;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12614() {
        if (!this.f13621 || this.f13614 || this.f13619 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer is outside its converter callback or failed");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m12617(C4175 c4175) {
        C12641 c12641;
        C21605 c21605 = c4175.f13616;
        c4175.m12614();
        C11999 c11999 = c4175.f13623;
        if (c11999 == null) {
            throw new IllegalStateException("Legacy text has not been supplied");
        }
        C14260.m33906(c4175.f13613.f7441, c11999.m29347());
        C12641 c12642 = c4175.f13620;
        if (c12642 == null) {
            c12641 = new C12641(c21605.f69374, 0L, null, c4175.f13615.m7496());
        } else {
            c12641 = new C12641(c21605.f69374, c12642.f38086, c12642.f38085, c4175.f13615.m7496());
        }
        C2267 c2267M7494 = C2267.m7494(c21605.f69370, c12641.m30916());
        c4175.f13615.close();
        c4175.f13615 = c2267M7494;
        c4175.f13621 = false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f13619 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer belongs to its converter thread");
        }
        this.f13621 = false;
        this.f13623 = null;
        this.f13613 = null;
        C2267 c2267 = this.f13615;
        if (c2267 != null) {
            c2267.close();
            this.f13615 = null;
        }
    }
}
