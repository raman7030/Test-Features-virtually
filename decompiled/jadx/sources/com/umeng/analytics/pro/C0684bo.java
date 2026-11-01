package com.umeng.analytics.pro;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import p067l.C20778;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bo */
/* JADX INFO: compiled from: N62X */
/* JADX INFO: loaded from: classes.dex */
public class C0684bo extends AbstractC0690bu {

    /* JADX INFO: renamed from: d */
    public static final C0695bz f2500d = new C0695bz("");

    /* JADX INFO: renamed from: e */
    public static final C0685bp f2501e = new C0685bp("", (byte) 0, 0);

    /* JADX INFO: renamed from: f */
    public static final byte[] f2502f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* JADX INFO: renamed from: h */
    public static final byte f2503h = -126;

    /* JADX INFO: renamed from: i */
    public static final byte f2504i = 1;

    /* JADX INFO: renamed from: j */
    public static final byte f2505j = 31;

    /* JADX INFO: renamed from: k */
    public static final byte f2506k = -32;

    /* JADX INFO: renamed from: l */
    public static final int f2507l = 5;

    /* JADX INFO: renamed from: a */
    public byte[] f2508a;

    /* JADX INFO: renamed from: b */
    public byte[] f2509b;

    /* JADX INFO: renamed from: c */
    public byte[] f2510c;

    /* JADX INFO: renamed from: m */
    public C0662at f2511m;

    /* JADX INFO: renamed from: n */
    public short f2512n;

    /* JADX INFO: renamed from: o */
    public C0685bp f2513o;

    /* JADX INFO: renamed from: p */
    public Boolean f2514p;

    /* JADX INFO: renamed from: q */
    public final long f2515q;

    /* JADX INFO: renamed from: r */
    public byte[] f2516r;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bo$b */
    /* JADX INFO: compiled from: N62X */
    public class b {

        /* JADX INFO: renamed from: a */
        public static final byte f2518a = 1;

        /* JADX INFO: renamed from: b */
        public static final byte f2519b = 2;

        /* JADX INFO: renamed from: c */
        public static final byte f2520c = 3;

        /* JADX INFO: renamed from: d */
        public static final byte f2521d = 4;

        /* JADX INFO: renamed from: e */
        public static final byte f2522e = 5;

        /* JADX INFO: renamed from: f */
        public static final byte f2523f = 6;

        /* JADX INFO: renamed from: g */
        public static final byte f2524g = 7;

        /* JADX INFO: renamed from: h */
        public static final byte f2525h = 8;

        /* JADX INFO: renamed from: i */
        public static final byte f2526i = 9;

        /* JADX INFO: renamed from: j */
        public static final byte f2527j = 10;

        /* JADX INFO: renamed from: k */
        public static final byte f2528k = 11;

        /* JADX INFO: renamed from: l */
        public static final byte f2529l = 12;
    }

    /* JADX INFO: renamed from: c */
    private int m2412c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: c */
    private long m2413c(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: c */
    private boolean m2414c(byte b2) {
        int i = b2 & 15;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: d */
    private long m2416d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: g */
    private int m2421g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2359a() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: c */
    public void mo2376c() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: e */
    public void mo2380e() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: f */
    public void mo2381f() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: g */
    public void mo2382g() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: i */
    public void mo2384i() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: m */
    public void mo2388m() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: o */
    public void mo2390o() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: q */
    public void mo2392q() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: s */
    public void mo2394s() {
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bo$a */
    /* JADX INFO: compiled from: N62X */
    public class a implements InterfaceC0692bw {

        /* JADX INFO: renamed from: a */
        public final long f2517a;

        public a() {
            this.f2517a = -1L;
        }

        public a(int i) {
            this.f2517a = i;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0692bw
        /* JADX INFO: renamed from: a */
        public AbstractC0690bu mo2402a(AbstractC0705ci abstractC0705ci) {
            return new C0684bo(abstractC0705ci, this.f2517a);
        }
    }

    public C0684bo(AbstractC0705ci abstractC0705ci, long j) {
        super(abstractC0705ci);
        this.f2511m = new C0662at(15);
        this.f2512n = (short) 0;
        this.f2513o = null;
        this.f2514p = null;
        this.f2508a = new byte[5];
        this.f2509b = new byte[10];
        this.f2516r = new byte[1];
        this.f2510c = new byte[1];
        this.f2515q = j;
    }

    public C0684bo(AbstractC0705ci abstractC0705ci) {
        this(abstractC0705ci, -1L);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: B */
    public void mo2422B() {
        this.f2511m.m2272c();
        this.f2512n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2367a(C0688bs c0688bs) {
        m2409b(f2503h);
        m2417d(((c0688bs.f2539b << 5) & (-32)) | 1);
        m2410b(c0688bs.f2540c);
        mo2370a(c0688bs.f2538a);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2369a(C0695bz c0695bz) {
        this.f2511m.m2270a(this.f2512n);
        this.f2512n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: b */
    public void mo2375b() {
        this.f2512n = this.f2511m.m2269a();
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2364a(C0685bp c0685bp) {
        if (c0685bp.f2531b == 2) {
            this.f2513o = c0685bp;
        } else {
            m2407a(c0685bp, (byte) -1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2407a(C0685bp c0685bp, byte b2) {
        if (b2 == -1) {
            b2 = m2418e(c0685bp.f2531b);
        }
        short s = c0685bp.f2532c;
        short s2 = this.f2512n;
        if (s > s2 && s - s2 <= 15) {
            m2417d(b2 | ((s - s2) << 4));
        } else {
            m2409b(b2);
            mo2372a(c0685bp.f2532c);
        }
        this.f2512n = c0685bp.f2532c;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: d */
    public void mo2378d() {
        m2409b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2366a(C0687br c0687br) {
        int i = c0687br.f2537c;
        if (i == 0) {
            m2417d(0);
            return;
        }
        m2410b(i);
        m2417d(m2418e(c0687br.f2536b) | (m2418e(c0687br.f2535a) << 4));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2365a(C0686bq c0686bq) {
        m2423a(c0686bq.f2533a, c0686bq.f2534b);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2368a(C0694by c0694by) {
        m2423a(c0694by.f2555a, c0694by.f2556b);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2373a(boolean z) {
        C0685bp c0685bp = this.f2513o;
        if (c0685bp != null) {
            m2407a(c0685bp, z ? (byte) 1 : (byte) 2);
            this.f2513o = null;
        } else {
            m2409b(z ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2360a(byte b2) {
        m2409b(b2);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2372a(short s) {
        m2410b(m2412c((int) s));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2362a(int i) {
        m2410b(m2412c(i));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2363a(long j) {
        m2411b(m2413c(j));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2361a(double d) {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m2406a(Double.doubleToLongBits(d), bArr, 0);
        this.f2545g.m2450b(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2370a(String str) {
        try {
            byte[] bytes = str.getBytes(C0233a.f1077D);
            m2408a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C0671bb("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2371a(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        m2408a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    /* JADX INFO: renamed from: a */
    private void m2408a(byte[] bArr, int i, int i2) {
        m2410b(i2);
        this.f2545g.mo2440b(bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m2423a(byte b2, int i) {
        if (i <= 14) {
            m2417d(m2418e(b2) | (i << 4));
        } else {
            m2417d(m2418e(b2) | 240);
            m2410b(i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2410b(int i) {
        int i2 = 0;
        while ((i & C0184a.f879g) != 0) {
            this.f2508a[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        byte[] bArr = this.f2508a;
        bArr[i2] = (byte) i;
        this.f2545g.mo2440b(bArr, 0, i2 + 1);
    }

    /* JADX INFO: renamed from: b */
    private void m2411b(long j) {
        int i = 0;
        while (((-128) & j) != 0) {
            this.f2509b[i] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i++;
        }
        byte[] bArr = this.f2509b;
        bArr[i] = (byte) j;
        this.f2545g.mo2440b(bArr, 0, i + 1);
    }

    /* JADX INFO: renamed from: a */
    private void m2406a(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    /* JADX INFO: renamed from: b */
    private void m2409b(byte b2) {
        byte[] bArr = this.f2516r;
        bArr[0] = b2;
        this.f2545g.m2450b(bArr);
    }

    /* JADX INFO: renamed from: d */
    private void m2417d(int i) {
        m2409b((byte) i);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: h */
    public C0688bs mo2383h() throws C0706cj, C0691bv {
        byte bMo2396u = mo2396u();
        if (bMo2396u != -126) {
            throw new C0691bv("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bMo2396u));
        }
        byte bMo2396u2 = mo2396u();
        byte b2 = (byte) (bMo2396u2 & f2505j);
        if (b2 != 1) {
            throw new C0691bv(C20778.m46922(b2, "Expected version 1 but got "));
        }
        return new C0688bs(mo2401z(), (byte) ((bMo2396u2 >> 5) & 3), m2403E());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: j */
    public C0695bz mo2385j() {
        this.f2511m.m2270a(this.f2512n);
        this.f2512n = (short) 0;
        return f2500d;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: k */
    public void mo2386k() {
        this.f2512n = this.f2511m.m2269a();
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: l */
    public C0685bp mo2387l() throws C0706cj {
        short sMo2397v;
        byte bMo2396u = mo2396u();
        if (bMo2396u == 0) {
            return f2501e;
        }
        short s = (short) ((bMo2396u & 240) >> 4);
        if (s == 0) {
            sMo2397v = mo2397v();
        } else {
            sMo2397v = (short) (this.f2512n + s);
        }
        byte b2 = (byte) (bMo2396u & 15);
        C0685bp c0685bp = new C0685bp("", m2415d(b2), sMo2397v);
        if (m2414c(bMo2396u)) {
            this.f2514p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f2512n = c0685bp.f2532c;
        return c0685bp;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: n */
    public C0687br mo2389n() throws C0706cj {
        int iM2403E = m2403E();
        byte bMo2396u = iM2403E == 0 ? (byte) 0 : mo2396u();
        return new C0687br(m2415d((byte) (bMo2396u >> 4)), m2415d((byte) (bMo2396u & 15)), iM2403E);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: p */
    public C0686bq mo2391p() throws C0706cj {
        byte bMo2396u = mo2396u();
        int iM2403E = (bMo2396u >> 4) & 15;
        if (iM2403E == 15) {
            iM2403E = m2403E();
        }
        return new C0686bq(m2415d(bMo2396u), iM2403E);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: r */
    public C0694by mo2393r() {
        return new C0694by(mo2391p());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: t */
    public boolean mo2395t() {
        Boolean bool = this.f2514p;
        if (bool == null) {
            return mo2396u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f2514p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: u */
    public byte mo2396u() throws C0706cj {
        if (this.f2545g.mo2449h() > 0) {
            byte b2 = this.f2545g.mo2447f()[this.f2545g.mo2448g()];
            this.f2545g.mo2443a(1);
            return b2;
        }
        this.f2545g.m2451d(this.f2510c, 0, 1);
        return this.f2510c[0];
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: v */
    public short mo2397v() {
        return (short) m2421g(m2403E());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: w */
    public int mo2398w() {
        return m2421g(m2403E());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: x */
    public long mo2399x() {
        return m2416d(m2404F());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: y */
    public double mo2400y() throws C0706cj {
        byte[] bArr = new byte[8];
        this.f2545g.m2451d(bArr, 0, 8);
        return Double.longBitsToDouble(m2405a(bArr));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: z */
    public String mo2401z() {
        int iM2403E = m2403E();
        m2420f(iM2403E);
        if (iM2403E == 0) {
            return "";
        }
        try {
            if (this.f2545g.mo2449h() >= iM2403E) {
                String str = new String(this.f2545g.mo2447f(), this.f2545g.mo2448g(), iM2403E, C0233a.f1077D);
                this.f2545g.mo2443a(iM2403E);
                return str;
            }
            return new String(m2419e(iM2403E), C0233a.f1077D);
        } catch (UnsupportedEncodingException unused) {
            throw new C0671bb("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: A */
    public ByteBuffer mo2358A() throws C0706cj, C0691bv {
        int iM2403E = m2403E();
        m2420f(iM2403E);
        if (iM2403E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iM2403E];
        this.f2545g.m2451d(bArr, 0, iM2403E);
        return ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: e */
    private byte[] m2419e(int i) throws C0706cj {
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        this.f2545g.m2451d(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    private void m2420f(int i) throws C0691bv {
        if (i < 0) {
            throw new C0691bv(C20778.m46922(i, "Negative length: "));
        }
        long j = this.f2515q;
        if (j != -1 && i > j) {
            throw new C0691bv(C20778.m46922(i, "Length exceeded max allowed: "));
        }
    }

    /* JADX INFO: renamed from: E */
    private int m2403E() throws C0706cj {
        int i = 0;
        if (this.f2545g.mo2449h() >= 5) {
            byte[] bArrMo2447f = this.f2545g.mo2447f();
            int iMo2448g = this.f2545g.mo2448g();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte b2 = bArrMo2447f[iMo2448g + i];
                i2 |= (b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i3;
                if ((b2 & GCMSIVBlockCipher.MASK) != 128) {
                    this.f2545g.mo2443a(i + 1);
                    return i2;
                }
                i3 += 7;
                i++;
            }
        } else {
            int i4 = 0;
            while (true) {
                byte bMo2396u = mo2396u();
                i |= (bMo2396u & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
                if ((bMo2396u & GCMSIVBlockCipher.MASK) != 128) {
                    return i;
                }
                i4 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    private long m2404F() throws C0706cj {
        int i = 0;
        long j = 0;
        if (this.f2545g.mo2449h() >= 10) {
            byte[] bArrMo2447f = this.f2545g.mo2447f();
            int iMo2448g = this.f2545g.mo2448g();
            int i2 = 0;
            while (true) {
                byte b2 = bArrMo2447f[iMo2448g + i];
                j |= ((long) (b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i2;
                if ((b2 & GCMSIVBlockCipher.MASK) != 128) {
                    this.f2545g.mo2443a(i + 1);
                    return j;
                }
                i2 += 7;
                i++;
            }
        } else {
            while (true) {
                byte bMo2396u = mo2396u();
                j |= ((long) (bMo2396u & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
                if ((bMo2396u & GCMSIVBlockCipher.MASK) != 128) {
                    return j;
                }
                i += 7;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private long m2405a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }

    /* JADX INFO: renamed from: d */
    private byte m2415d(byte b2) throws C0691bv {
        byte b3 = (byte) (b2 & 15);
        switch (b3) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return (byte) 15;
            case 10:
                return C0698cb.f2570l;
            case 11:
                return C0698cb.f2569k;
            case 12:
                return (byte) 12;
            default:
                throw new C0691bv(C20778.m46922(b3, "don't know what type: "));
        }
    }

    /* JADX INFO: renamed from: e */
    private byte m2418e(byte b2) {
        return f2502f[b2];
    }
}
