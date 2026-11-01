package com.umeng.analytics.pro;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p067l.C20778;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bn */
/* JADX INFO: compiled from: S60M */
/* JADX INFO: loaded from: classes.dex */
public class C0683bn extends AbstractC0690bu {

    /* JADX INFO: renamed from: a */
    public static final int f2482a = -65536;

    /* JADX INFO: renamed from: b */
    public static final int f2483b = -2147418112;

    /* JADX INFO: renamed from: h */
    public static final C0695bz f2484h = new C0695bz();

    /* JADX INFO: renamed from: c */
    public boolean f2485c;

    /* JADX INFO: renamed from: d */
    public boolean f2486d;

    /* JADX INFO: renamed from: e */
    public int f2487e;

    /* JADX INFO: renamed from: f */
    public boolean f2488f;

    /* JADX INFO: renamed from: i */
    public byte[] f2489i;

    /* JADX INFO: renamed from: j */
    public byte[] f2490j;

    /* JADX INFO: renamed from: k */
    public byte[] f2491k;

    /* JADX INFO: renamed from: l */
    public byte[] f2492l;

    /* JADX INFO: renamed from: m */
    public byte[] f2493m;

    /* JADX INFO: renamed from: n */
    public byte[] f2494n;

    /* JADX INFO: renamed from: o */
    public byte[] f2495o;

    /* JADX INFO: renamed from: p */
    public byte[] f2496p;

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2359a() {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2369a(C0695bz c0695bz) {
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: b */
    public void mo2375b() {
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
    /* JADX INFO: renamed from: k */
    public void mo2386k() {
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

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bn$a */
    /* JADX INFO: compiled from: S60M */
    public class a implements InterfaceC0692bw {

        /* JADX INFO: renamed from: a */
        public boolean f2497a;

        /* JADX INFO: renamed from: b */
        public boolean f2498b;

        /* JADX INFO: renamed from: c */
        public int f2499c;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f2497a = z;
            this.f2498b = z2;
            this.f2499c = i;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0692bw
        /* JADX INFO: renamed from: a */
        public AbstractC0690bu mo2402a(AbstractC0705ci abstractC0705ci) {
            C0683bn c0683bn = new C0683bn(abstractC0705ci, this.f2497a, this.f2498b);
            int i = this.f2499c;
            if (i != 0) {
                c0683bn.m2377c(i);
            }
            return c0683bn;
        }
    }

    public C0683bn(AbstractC0705ci abstractC0705ci) {
        this(abstractC0705ci, false, true);
    }

    public C0683bn(AbstractC0705ci abstractC0705ci, boolean z, boolean z2) {
        super(abstractC0705ci);
        this.f2488f = false;
        this.f2489i = new byte[1];
        this.f2490j = new byte[2];
        this.f2491k = new byte[4];
        this.f2492l = new byte[8];
        this.f2493m = new byte[1];
        this.f2494n = new byte[2];
        this.f2495o = new byte[4];
        this.f2496p = new byte[8];
        this.f2485c = z;
        this.f2486d = z2;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2367a(C0688bs c0688bs) throws C0671bb {
        if (this.f2486d) {
            mo2362a((-2147418112) | c0688bs.f2539b);
            mo2370a(c0688bs.f2538a);
            mo2362a(c0688bs.f2540c);
        } else {
            mo2370a(c0688bs.f2538a);
            mo2360a(c0688bs.f2539b);
            mo2362a(c0688bs.f2540c);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2364a(C0685bp c0685bp) {
        mo2360a(c0685bp.f2531b);
        mo2372a(c0685bp.f2532c);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: d */
    public void mo2378d() {
        mo2360a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2366a(C0687br c0687br) {
        mo2360a(c0687br.f2535a);
        mo2360a(c0687br.f2536b);
        mo2362a(c0687br.f2537c);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2365a(C0686bq c0686bq) {
        mo2360a(c0686bq.f2533a);
        mo2362a(c0686bq.f2534b);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2368a(C0694by c0694by) {
        mo2360a(c0694by.f2555a);
        mo2362a(c0694by.f2556b);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2373a(boolean z) {
        mo2360a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2360a(byte b) {
        byte[] bArr = this.f2489i;
        bArr[0] = b;
        this.f2545g.mo2440b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2372a(short s) {
        byte[] bArr = this.f2490j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f2545g.mo2440b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2362a(int i) {
        byte[] bArr = this.f2491k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f2545g.mo2440b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2363a(long j) {
        byte[] bArr = this.f2492l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f2545g.mo2440b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2361a(double d) {
        mo2363a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2370a(String str) throws C0671bb {
        try {
            byte[] bytes = str.getBytes(C0233a.f1077D);
            mo2362a(bytes.length);
            this.f2545g.mo2440b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C0671bb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: a */
    public void mo2371a(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        mo2362a(iLimit);
        this.f2545g.mo2440b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: h */
    public C0688bs mo2383h() throws C0691bv {
        int iMo2398w = mo2398w();
        if (iMo2398w < 0) {
            if (((-65536) & iMo2398w) != -2147418112) {
                throw new C0691bv(4, "Bad version in readMessageBegin");
            }
            return new C0688bs(mo2401z(), (byte) (iMo2398w & 255), mo2398w());
        }
        if (this.f2485c) {
            throw new C0691bv(4, "Missing version in readMessageBegin, old client?");
        }
        return new C0688bs(m2374b(iMo2398w), mo2396u(), mo2398w());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: j */
    public C0695bz mo2385j() {
        return f2484h;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: l */
    public C0685bp mo2387l() throws C0691bv {
        byte bMo2396u = mo2396u();
        return new C0685bp("", bMo2396u, bMo2396u == 0 ? (short) 0 : mo2397v());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: n */
    public C0687br mo2389n() {
        return new C0687br(mo2396u(), mo2396u(), mo2398w());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: p */
    public C0686bq mo2391p() {
        return new C0686bq(mo2396u(), mo2398w());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: r */
    public C0694by mo2393r() {
        return new C0694by(mo2396u(), mo2398w());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: t */
    public boolean mo2395t() {
        return mo2396u() == 1;
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: u */
    public byte mo2396u() throws C0691bv {
        if (this.f2545g.mo2449h() >= 1) {
            byte b = this.f2545g.mo2447f()[this.f2545g.mo2448g()];
            this.f2545g.mo2443a(1);
            return b;
        }
        m2357a(this.f2493m, 0, 1);
        return this.f2493m[0];
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: v */
    public short mo2397v() throws C0691bv {
        int iMo2448g;
        byte[] bArrMo2447f = this.f2494n;
        if (this.f2545g.mo2449h() >= 2) {
            bArrMo2447f = this.f2545g.mo2447f();
            iMo2448g = this.f2545g.mo2448g();
            this.f2545g.mo2443a(2);
        } else {
            m2357a(this.f2494n, 0, 2);
            iMo2448g = 0;
        }
        return (short) ((bArrMo2447f[iMo2448g + 1] & 255) | ((bArrMo2447f[iMo2448g] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: w */
    public int mo2398w() throws C0691bv {
        int iMo2448g;
        byte[] bArrMo2447f = this.f2495o;
        if (this.f2545g.mo2449h() >= 4) {
            bArrMo2447f = this.f2545g.mo2447f();
            iMo2448g = this.f2545g.mo2448g();
            this.f2545g.mo2443a(4);
        } else {
            m2357a(this.f2495o, 0, 4);
            iMo2448g = 0;
        }
        return (bArrMo2447f[iMo2448g + 3] & 255) | ((bArrMo2447f[iMo2448g] & 255) << 24) | ((bArrMo2447f[iMo2448g + 1] & 255) << 16) | ((bArrMo2447f[iMo2448g + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: x */
    public long mo2399x() throws C0691bv {
        int iMo2448g;
        byte[] bArrMo2447f = this.f2496p;
        if (this.f2545g.mo2449h() >= 8) {
            bArrMo2447f = this.f2545g.mo2447f();
            iMo2448g = this.f2545g.mo2448g();
            this.f2545g.mo2443a(8);
        } else {
            m2357a(this.f2496p, 0, 8);
            iMo2448g = 0;
        }
        return ((long) (bArrMo2447f[iMo2448g + 7] & 255)) | (((long) (bArrMo2447f[iMo2448g] & 255)) << 56) | (((long) (bArrMo2447f[iMo2448g + 1] & 255)) << 48) | (((long) (bArrMo2447f[iMo2448g + 2] & 255)) << 40) | (((long) (bArrMo2447f[iMo2448g + 3] & 255)) << 32) | (((long) (bArrMo2447f[iMo2448g + 4] & 255)) << 24) | (((long) (bArrMo2447f[iMo2448g + 5] & 255)) << 16) | (((long) (bArrMo2447f[iMo2448g + 6] & 255)) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: y */
    public double mo2400y() {
        return Double.longBitsToDouble(mo2399x());
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: z */
    public String mo2401z() throws C0671bb {
        int iMo2398w = mo2398w();
        if (this.f2545g.mo2449h() >= iMo2398w) {
            try {
                String str = new String(this.f2545g.mo2447f(), this.f2545g.mo2448g(), iMo2398w, C0233a.f1077D);
                this.f2545g.mo2443a(iMo2398w);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new C0671bb("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return m2374b(iMo2398w);
    }

    /* JADX INFO: renamed from: b */
    public String m2374b(int i) throws C0671bb {
        try {
            m2379d(i);
            byte[] bArr = new byte[i];
            this.f2545g.m2451d(bArr, 0, i);
            return new String(bArr, C0233a.f1077D);
        } catch (UnsupportedEncodingException unused) {
            throw new C0671bb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: A */
    public ByteBuffer mo2358A() throws C0706cj, C0691bv {
        int iMo2398w = mo2398w();
        m2379d(iMo2398w);
        if (this.f2545g.mo2449h() >= iMo2398w) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f2545g.mo2447f(), this.f2545g.mo2448g(), iMo2398w);
            this.f2545g.mo2443a(iMo2398w);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo2398w];
        this.f2545g.m2451d(bArr, 0, iMo2398w);
        return ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    private int m2357a(byte[] bArr, int i, int i2) throws C0691bv {
        m2379d(i2);
        return this.f2545g.m2451d(bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m2377c(int i) {
        this.f2487e = i;
        this.f2488f = true;
    }

    /* JADX INFO: renamed from: d */
    public void m2379d(int i) throws C0691bv {
        if (i < 0) {
            throw new C0691bv(C20778.m46922(i, "Negative length: "));
        }
        if (this.f2488f) {
            int i2 = this.f2487e - i;
            this.f2487e = i2;
            if (i2 < 0) {
                throw new C0691bv(C20778.m46922(i, "Message length exceeded: "));
            }
        }
    }
}
