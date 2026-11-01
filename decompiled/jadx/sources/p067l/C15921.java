package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C15921 {

    /* JADX INFO: renamed from: ֫ */
    public final Runnable f46041;

    /* JADX INFO: renamed from: ۧ */
    public final C22902 f46042;

    /* JADX INFO: renamed from: ܽ */
    public final C16454 f46043;

    /* JADX INFO: renamed from: ֫ */
    public static void m36039(C11503 c11503, int i) {
        C19275.m43915(c11503.f32103, i, false, (Runnable) new RunnableC3043());
        C19275.m43915(c11503.f32102, i, true, (Runnable) new RunnableC3043());
    }

    public C15921(C22902 c22902, C16454 c16454, Runnable runnable) {
        this.f46042 = c22902;
        this.f46043 = c16454;
        this.f46041 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m36042(C4563 c4563) throws IOException {
        long jM51156;
        long jM36035 = m36035(c4563.f10227.f32103.f51603, true);
        long jM36036 = m36035(c4563.f10227.f32102.f51603, true);
        synchronized (this.f46042.f72073.f6922) {
            C11996 c11996 = new C11996(72);
            c11996.writeInt(1);
            c11996.writeInt(1);
            c11996.m27451(jM36035);
            c11996.m27451(jM36036);
            c11996.m27451(c4563.f10227.f32101);
            c11996.m27451(c4563.f10226);
            c11996.m27451(c4563.f10230);
            c11996.m27451(c4563.f10228);
            c11996.writeInt(c4563.f10229.m16550());
            c11996.writeInt(c4563.f10229.m16548());
            c11996.writeInt(c4563.f10227.f32100 ? 1 : 0);
            c11996.writeInt(0);
            C22902 c22902 = this.f46042;
            jM51156 = c22902.m51156(c22902.m51157(), c11996.m27458(), 5, c11996.size());
        }
        return jM51156;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m36035(C11269 c11269, boolean z) throws IOException {
        long jM51156;
        long jM51157;
        this.f46041.run();
        if (c11269 == null) {
            return 0L;
        }
        long j = c11269.f31392;
        m36038(j, c11269.f31391);
        if (j >= 0) {
            return j;
        }
        Object obj = c11269.f31388;
        if (obj != null) {
            long jM36034 = z ? m36034((C10832) obj) : m36036((C24441) obj);
            synchronized (this.f46042.f72073.f6922) {
                C11996 c11996 = new C11996(12);
                c11996.writeInt(z ? 2 : 4);
                c11996.m27451(jM36034);
                C22902 c22902 = this.f46042;
                jM51157 = c22902.m51156(c22902.m51157(), c11996.m27458(), 5, c11996.size());
                c11269.f31391 = this.f46042;
                c11269.f31392 = jM51157;
            }
            return jM51157;
        }
        long jM36035 = m36035(c11269.f31390, z);
        long jM36036 = m36035(c11269.f31389, z);
        synchronized (this.f46042.f72073.f6922) {
            C11996 c11997 = new C11996(28);
            c11997.writeInt(z ? 3 : 5);
            c11997.writeInt(c11269.f31387);
            c11997.writeInt(c11269.f31393);
            c11997.m27451(jM36035);
            c11997.m27451(jM36036);
            C22902 c22903 = this.f46042;
            jM51156 = c22903.m51156(c22903.m51157(), c11997.m27458(), 5, c11997.size());
            c11269.f31391 = this.f46042;
            c11269.f31392 = jM51156;
        }
        return jM51156;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m36034(C10832 c10832) throws IOException {
        long jM51156;
        long j = c10832.f30009;
        m36038(j, c10832.f30008);
        if (j >= 0) {
            return j;
        }
        int i = 0;
        long jM36035 = m36035(c10832.f30004.f51603, false);
        synchronized (this.f46042.f72073.f6922) {
            C11996 c11996 = new C11996(36);
            c11996.writeInt(6);
            c11996.m27451(c10832.f30005);
            c11996.m27451(c10832.f30006);
            if (c10832.f30007 != EnumC15723.USER) {
                i = 1;
            }
            c11996.writeInt(i);
            c11996.m27451(jM36035);
            c11996.writeInt(c10832.f30004.m39213());
            C22902 c22902 = this.f46042;
            jM51156 = c22902.m51156(c22902.m51157(), c11996.m27458(), 5, c11996.size());
            c10832.f30008 = this.f46042;
            c10832.f30009 = jM51156;
        }
        return jM51156;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m36036(C24441 c24441) throws IOException {
        long jM51156;
        long j = c24441.f77385;
        m36038(j, c24441.f77384);
        if (j >= 0) {
            return j;
        }
        C13773 c13773 = c24441.f77382;
        C22902 c22902 = c13773.f38940;
        C22902 c22903 = this.f46042;
        if (c22902 != c22903 || c24441.f77379.f38940 != c22903) {
            throw new IOException("History belongs to another store");
        }
        long jM37372 = this.f46043.m37372(c13773);
        long jM37373 = this.f46043.m37372(c24441.f77379);
        synchronized (this.f46042.f72073.f6922) {
            C11996 c11996 = new C11996(72);
            c11996.writeInt(7);
            c11996.writeInt(c24441.f77380);
            c11996.m27451(c24441.f77383);
            c11996.m27451(c24441.f77381);
            c11996.writeInt(c24441.f77386.m16550());
            c11996.writeInt(c24441.f77386.m16548());
            C13773 c13774 = c24441.f77382;
            c11996.m27451(jM37372);
            c11996.writeInt(c13774.m31402());
            c11996.writeInt(c13774.m31404());
            c11996.writeInt(c13774.m31396());
            C13773 c13775 = c24441.f77379;
            c11996.m27451(jM37373);
            c11996.writeInt(c13775.m31402());
            c11996.writeInt(c13775.m31404());
            c11996.writeInt(c13775.m31396());
            C22902 c22904 = this.f46042;
            jM51156 = c22904.m51156(c22904.m51157(), c11996.m27458(), 5, c11996.size());
            c24441.f77384 = this.f46042;
            c24441.f77385 = jM51156;
        }
        return jM51156;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36038(long j, C22902 c22902) throws IOException {
        if (j >= 0 && c22902 != this.f46042) {
            throw new IOException("History offset belongs to another store");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4563 m36043(long j, long j2, int i, C19137 c19137) throws C15524 {
        Runnable runnable = this.f46041;
        C19275 c19275 = new C19275(this, c19137);
        c19137.m43538();
        C12570 c12570M43921 = c19275.m43921(j, j2);
        try {
            C14677 c14677 = c12570M43921.f35321;
            if (c12570M43921.f35320 != 72 || c14677.readInt() != 1 || c14677.readInt() != 1) {
                throw new IOException("Invalid history state shape");
            }
            long j3 = c14677.readLong();
            long j4 = c14677.readLong();
            long j5 = c14677.readLong();
            long j6 = c14677.readLong();
            long j7 = c14677.readLong();
            long j8 = c14677.readLong();
            C7205 c7205M43917 = c19275.m43917(c14677);
            int i2 = c14677.readInt();
            if (j5 <= 0 || j6 < 0 || j7 < j6 || j8 < 0 || i2 < 0 || i2 > 1 || c7205M43917.m16550() > i || c7205M43917.m16548() > i || c14677.readInt() != 0 || c14677.available() != 0) {
                throw new IOException("Invalid history state metadata");
            }
            C17302 c17302 = new C17302(c19275.m43918(0, j3, j, true));
            C17302 c17303 = new C17302(c19275.m43918(0, j4, j, true));
            c19275.m43920(c17302, c17303, j5, j7);
            C19275.m43915(c17302, i, false, runnable);
            C19275.m43915(c17303, i, true, runnable);
            C4563 c4563 = new C4563(new C11503(c17302, c17303, j5, i2 == 1), c7205M43917, j6, j7, j8);
            c12570M43921.close();
            return c4563;
        } catch (Throwable th) {
            try {
                c12570M43921.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
