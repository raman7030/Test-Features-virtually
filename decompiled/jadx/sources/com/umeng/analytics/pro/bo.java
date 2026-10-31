package com.umeng.analytics.pro;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import l.C19370;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: compiled from: N62X */
/* JADX INFO: loaded from: classes.dex */
public class bo extends bu {
    public static final bz d = new bz("");
    public static final bp e = new bp("", (byte) 0, 0);
    public static final byte[] f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    public static final byte h = -126;
    public static final byte i = 1;
    public static final byte j = 31;
    public static final byte k = -32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77929l = 5;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public at m;
    public short n;
    public bp o;
    public Boolean p;
    public final long q;
    public byte[] r;

    /* JADX INFO: compiled from: N62X */
    public class b {
        public static final byte a = 1;
        public static final byte b = 2;
        public static final byte c = 3;
        public static final byte d = 4;
        public static final byte e = 5;
        public static final byte f = 6;
        public static final byte g = 7;
        public static final byte h = 8;
        public static final byte i = 9;
        public static final byte j = 10;
        public static final byte k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final byte f77930l = 12;
    }

    private int c(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    private long c(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private boolean c(byte b2) {
        int i2 = b2 & 15;
        return i2 == 1 || i2 == 2;
    }

    private long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private int g(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void c() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void e() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void f() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void g() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void i() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void m() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void o() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void q() {
    }

    @Override // com.umeng.analytics.pro.bu
    public void s() {
    }

    /* JADX INFO: compiled from: N62X */
    public class a implements bw {
        public final long a;

        public a() {
            this.a = -1L;
        }

        public a(int i) {
            this.a = i;
        }

        @Override // com.umeng.analytics.pro.bw
        public bu a(ci ciVar) {
            return new bo(ciVar, this.a);
        }
    }

    public bo(ci ciVar, long j2) {
        super(ciVar);
        this.m = new at(15);
        this.n = (short) 0;
        this.o = null;
        this.p = null;
        this.a = new byte[5];
        this.b = new byte[10];
        this.r = new byte[1];
        this.c = new byte[1];
        this.q = j2;
    }

    public bo(ci ciVar) {
        this(ciVar, -1L);
    }

    @Override // com.umeng.analytics.pro.bu
    public void B() {
        this.m.c();
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(bs bsVar) {
        b(h);
        d(((bsVar.b << 5) & (-32)) | 1);
        b(bsVar.c);
        a(bsVar.a);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(bz bzVar) {
        this.m.a(this.n);
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.bu
    public void b() {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(bp bpVar) {
        if (bpVar.b == 2) {
            this.o = bpVar;
        } else {
            a(bpVar, (byte) -1);
        }
    }

    private void a(bp bpVar, byte b2) {
        if (b2 == -1) {
            b2 = e(bpVar.b);
        }
        short s = bpVar.c;
        short s2 = this.n;
        if (s > s2 && s - s2 <= 15) {
            d(b2 | ((s - s2) << 4));
        } else {
            b(b2);
            a(bpVar.c);
        }
        this.n = bpVar.c;
    }

    @Override // com.umeng.analytics.pro.bu
    public void d() {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(br brVar) {
        int i2 = brVar.c;
        if (i2 == 0) {
            d(0);
            return;
        }
        b(i2);
        d(e(brVar.b) | (e(brVar.a) << 4));
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(bq bqVar) {
        a(bqVar.a, bqVar.b);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(by byVar) {
        a(byVar.a, byVar.b);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(boolean z) {
        bp bpVar = this.o;
        if (bpVar != null) {
            a(bpVar, z ? (byte) 1 : (byte) 2);
            this.o = null;
        } else {
            b(z ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(byte b2) {
        b(b2);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(short s) {
        b(c((int) s));
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(int i2) {
        b(c(i2));
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(long j2) {
        b(c(j2));
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(double d2) {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d2), bArr, 0);
        this.g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(String str) {
        try {
            byte[] bytes = str.getBytes(com.alipay.sdk.m.w.a.D);
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new bb("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.bu
    public void a(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    private void a(byte[] bArr, int i2, int i3) {
        b(i3);
        this.g.b(bArr, i2, i3);
    }

    public void a(byte b2, int i2) {
        if (i2 <= 14) {
            d(e(b2) | (i2 << 4));
        } else {
            d(e(b2) | 240);
            b(i2);
        }
    }

    private void b(int i2) {
        int i3 = 0;
        while ((i2 & com.alipay.sdk.m.p.a.g) != 0) {
            this.a[i3] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i3++;
        }
        byte[] bArr = this.a;
        bArr[i3] = (byte) i2;
        this.g.b(bArr, 0, i3 + 1);
    }

    private void b(long j2) {
        int i2 = 0;
        while (((-128) & j2) != 0) {
            this.b[i2] = (byte) ((127 & j2) | 128);
            j2 >>>= 7;
            i2++;
        }
        byte[] bArr = this.b;
        bArr[i2] = (byte) j2;
        this.g.b(bArr, 0, i2 + 1);
    }

    private void a(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) (j2 & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) ((j2 >> 24) & 255);
        bArr[i2 + 4] = (byte) ((j2 >> 32) & 255);
        bArr[i2 + 5] = (byte) ((j2 >> 40) & 255);
        bArr[i2 + 6] = (byte) ((j2 >> 48) & 255);
        bArr[i2 + 7] = (byte) ((j2 >> 56) & 255);
    }

    private void b(byte b2) {
        byte[] bArr = this.r;
        bArr[0] = b2;
        this.g.b(bArr);
    }

    private void d(int i2) {
        b((byte) i2);
    }

    @Override // com.umeng.analytics.pro.bu
    public bs h() throws cj, bv {
        byte bU = u();
        if (bU != -126) {
            throw new bv("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bU));
        }
        byte bU2 = u();
        byte b2 = (byte) (bU2 & j);
        if (b2 != 1) {
            throw new bv(C19370.m44628(b2, "Expected version 1 but got "));
        }
        return new bs(z(), (byte) ((bU2 >> 5) & 3), E());
    }

    @Override // com.umeng.analytics.pro.bu
    public bz j() {
        this.m.a(this.n);
        this.n = (short) 0;
        return d;
    }

    @Override // com.umeng.analytics.pro.bu
    public void k() {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.bu
    public bp l() throws cj {
        short sV;
        byte bU = u();
        if (bU == 0) {
            return e;
        }
        short s = (short) ((bU & 240) >> 4);
        if (s == 0) {
            sV = v();
        } else {
            sV = (short) (this.n + s);
        }
        byte b2 = (byte) (bU & 15);
        bp bpVar = new bp("", d(b2), sV);
        if (c(bU)) {
            this.p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.n = bpVar.c;
        return bpVar;
    }

    @Override // com.umeng.analytics.pro.bu
    public br n() throws cj {
        int iE = E();
        byte bU = iE == 0 ? (byte) 0 : u();
        return new br(d((byte) (bU >> 4)), d((byte) (bU & 15)), iE);
    }

    @Override // com.umeng.analytics.pro.bu
    public bq p() throws cj {
        byte bU = u();
        int iE = (bU >> 4) & 15;
        if (iE == 15) {
            iE = E();
        }
        return new bq(d(bU), iE);
    }

    @Override // com.umeng.analytics.pro.bu
    public by r() {
        return new by(p());
    }

    @Override // com.umeng.analytics.pro.bu
    public boolean t() {
        Boolean bool = this.p;
        if (bool == null) {
            return u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.bu
    public byte u() throws cj {
        if (this.g.h() > 0) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        this.g.d(this.c, 0, 1);
        return this.c[0];
    }

    @Override // com.umeng.analytics.pro.bu
    public short v() {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.bu
    public int w() {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.bu
    public long x() {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.bu
    public double y() throws cj {
        byte[] bArr = new byte[8];
        this.g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.bu
    public String z() {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return "";
        }
        try {
            if (this.g.h() >= iE) {
                String str = new String(this.g.f(), this.g.g(), iE, com.alipay.sdk.m.w.a.D);
                this.g.a(iE);
                return str;
            }
            return new String(e(iE), com.alipay.sdk.m.w.a.D);
        } catch (UnsupportedEncodingException unused) {
            throw new bb("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.bu
    public ByteBuffer A() throws cj, bv {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iE];
        this.g.d(bArr, 0, iE);
        return ByteBuffer.wrap(bArr);
    }

    private byte[] e(int i2) throws cj {
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2];
        this.g.d(bArr, 0, i2);
        return bArr;
    }

    private void f(int i2) throws bv {
        if (i2 < 0) {
            throw new bv(C19370.m44628(i2, "Negative length: "));
        }
        long j2 = this.q;
        if (j2 != -1 && i2 > j2) {
            throw new bv(C19370.m44628(i2, "Length exceeded max allowed: "));
        }
    }

    private int E() throws cj {
        int i2 = 0;
        if (this.g.h() >= 5) {
            byte[] bArrF = this.g.f();
            int iG = this.g.g();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte b2 = bArrF[iG + i2];
                i3 |= (b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
                if ((b2 & GCMSIVBlockCipher.MASK) != 128) {
                    this.g.a(i2 + 1);
                    return i3;
                }
                i4 += 7;
                i2++;
            }
        } else {
            int i5 = 0;
            while (true) {
                byte bU = u();
                i2 |= (bU & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i5;
                if ((bU & GCMSIVBlockCipher.MASK) != 128) {
                    return i2;
                }
                i5 += 7;
            }
        }
    }

    private long F() throws cj {
        int i2 = 0;
        long j2 = 0;
        if (this.g.h() >= 10) {
            byte[] bArrF = this.g.f();
            int iG = this.g.g();
            int i3 = 0;
            while (true) {
                byte b2 = bArrF[iG + i2];
                j2 |= ((long) (b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i3;
                if ((b2 & GCMSIVBlockCipher.MASK) != 128) {
                    this.g.a(i2 + 1);
                    return j2;
                }
                i3 += 7;
                i2++;
            }
        } else {
            while (true) {
                byte bU = u();
                j2 |= ((long) (bU & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i2;
                if ((bU & GCMSIVBlockCipher.MASK) != 128) {
                    return j2;
                }
                i2 += 7;
            }
        }
    }

    private long a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }

    private byte d(byte b2) throws bv {
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
                return cb.f77931l;
            case 11:
                return cb.k;
            case 12:
                return (byte) 12;
            default:
                throw new bv(C19370.m44628(b3, "don't know what type: "));
        }
    }

    private byte e(byte b2) {
        return f[b2];
    }
}
