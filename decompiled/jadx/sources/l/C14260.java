package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C14260 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f42949;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21605 f42950;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14820 f42951;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33906(C9611 c9611, int i) {
        C17789.m41669(c9611.f29156, i, false, (Runnable) new RunnableC0709());
        C17789.m41669(c9611.f29155, i, true, (Runnable) new RunnableC0709());
    }

    public C14260(C21605 c21605, C14820 c14820, Runnable runnable) {
        this.f42950 = c21605;
        this.f42951 = c14820;
        this.f42949 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m33909(C2309 c2309) throws IOException {
        long jM48809;
        long jM33902 = m33902(c2309.f7441.f29156.f48465, true);
        long jM33903 = m33902(c2309.f7441.f29155.f48465, true);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10130 = new C10130(72);
            c10130.writeInt(1);
            c10130.writeInt(1);
            c10130.m25431(jM33902);
            c10130.m25431(jM33903);
            c10130.m25431(c2309.f7441.f29154);
            c10130.m25431(c2309.f7440);
            c10130.m25431(c2309.f7444);
            c10130.m25431(c2309.f7442);
            c10130.writeInt(c2309.f7443.m14642());
            c10130.writeInt(c2309.f7443.m14640());
            c10130.writeInt(c2309.f7441.f29153 ? 1 : 0);
            c10130.writeInt(0);
            C21605 c21605 = this.f42950;
            jM48809 = c21605.m48809(c21605.m48810(), c10130.m25438(), 5, c10130.size());
        }
        return jM48809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33902(C9365 c9365, boolean z) throws IOException {
        long jM48809;
        long jM488010;
        this.f42949.run();
        if (c9365 == null) {
            return 0L;
        }
        long j = c9365.f28443;
        m33905(j, c9365.f28442);
        if (j >= 0) {
            return j;
        }
        Object obj = c9365.f28439;
        if (obj != null) {
            long jM33901 = z ? m33901((C8905) obj) : m33903((C23224) obj);
            synchronized (this.f42950.f69370.f4153) {
                C10130 c10130 = new C10130(12);
                c10130.writeInt(z ? 2 : 4);
                c10130.m25431(jM33901);
                C21605 c21605 = this.f42950;
                jM488010 = c21605.m48809(c21605.m48810(), c10130.m25438(), 5, c10130.size());
                c9365.f28442 = this.f42950;
                c9365.f28443 = jM488010;
            }
            return jM488010;
        }
        long jM33902 = m33902(c9365.f28441, z);
        long jM33903 = m33902(c9365.f28440, z);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10131 = new C10130(28);
            c10131.writeInt(z ? 3 : 5);
            c10131.writeInt(c9365.f28438);
            c10131.writeInt(c9365.f28444);
            c10131.m25431(jM33902);
            c10131.m25431(jM33903);
            C21605 c21606 = this.f42950;
            jM48809 = c21606.m48809(c21606.m48810(), c10131.m25438(), 5, c10131.size());
            c9365.f28442 = this.f42950;
            c9365.f28443 = jM48809;
        }
        return jM48809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33901(C8905 c8905) throws IOException {
        long jM48809;
        long j = c8905.f27086;
        m33905(j, c8905.f27085);
        if (j >= 0) {
            return j;
        }
        int i = 0;
        long jM33902 = m33902(c8905.f27081.f48465, false);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10130 = new C10130(36);
            c10130.writeInt(6);
            c10130.m25431(c8905.f27082);
            c10130.m25431(c8905.f27083);
            if (c8905.f27084 != EnumC14051.USER) {
                i = 1;
            }
            c10130.writeInt(i);
            c10130.m25431(jM33902);
            c10130.writeInt(c8905.f27081.m37046());
            C21605 c21605 = this.f42950;
            jM48809 = c21605.m48809(c21605.m48810(), c10130.m25438(), 5, c10130.size());
            c8905.f27085 = this.f42950;
            c8905.f27086 = jM48809;
        }
        return jM48809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33903(C23224 c23224) throws IOException {
        long jM48809;
        long j = c23224.f74642;
        m33905(j, c23224.f74641);
        if (j >= 0) {
            return j;
        }
        C11999 c11999 = c23224.f74639;
        C21605 c21605 = c11999.f35930;
        C21605 c21606 = this.f42950;
        if (c21605 != c21606 || c23224.f74636.f35930 != c21606) {
            throw new IOException("History belongs to another store");
        }
        long jM35224 = this.f42951.m35224(c11999);
        long jM35225 = this.f42951.m35224(c23224.f74636);
        synchronized (this.f42950.f69370.f4153) {
            C10130 c10130 = new C10130(72);
            c10130.writeInt(7);
            c10130.writeInt(c23224.f74637);
            c10130.m25431(c23224.f74640);
            c10130.m25431(c23224.f74638);
            c10130.writeInt(c23224.f74643.m14642());
            c10130.writeInt(c23224.f74643.m14640());
            C11999 c119910 = c23224.f74639;
            c10130.m25431(jM35224);
            c10130.writeInt(c119910.m29347());
            c10130.writeInt(c119910.m29349());
            c10130.writeInt(c119910.m29341());
            C11999 c119911 = c23224.f74636;
            c10130.m25431(jM35225);
            c10130.writeInt(c119911.m29347());
            c10130.writeInt(c119911.m29349());
            c10130.writeInt(c119911.m29341());
            C21605 c21607 = this.f42950;
            jM48809 = c21607.m48809(c21607.m48810(), c10130.m25438(), 5, c10130.size());
            c23224.f74641 = this.f42950;
            c23224.f74642 = jM48809;
        }
        return jM48809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33905(long j, C21605 c21605) throws IOException {
        if (j >= 0 && c21605 != this.f42950) {
            throw new IOException("History offset belongs to another store");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2309 m33910(long j, long j2, int i, C17643 c17643) throws C13842 {
        Runnable runnable = this.f42949;
        C17789 c17789 = new C17789(this, c17643);
        c17643.m41292();
        C10734 c10734M41675 = c17789.m41675(j, j2);
        try {
            C12951 c12951 = c10734M41675.f32348;
            if (c10734M41675.f32347 != 72 || c12951.readInt() != 1 || c12951.readInt() != 1) {
                throw new IOException("Invalid history state shape");
            }
            long j3 = c12951.readLong();
            long j4 = c12951.readLong();
            long j5 = c12951.readLong();
            long j6 = c12951.readLong();
            long j7 = c12951.readLong();
            long j8 = c12951.readLong();
            C5089 c5089M41671 = c17789.m41671(c12951);
            int i2 = c12951.readInt();
            if (j5 <= 0 || j6 < 0 || j7 < j6 || j8 < 0 || i2 < 0 || i2 > 1 || c5089M41671.m14642() > i || c5089M41671.m14640() > i || c12951.readInt() != 0 || c12951.available() != 0) {
                throw new IOException("Invalid history state metadata");
            }
            C15713 c15713 = new C15713(c17789.m41672(0, j3, j, true));
            C15713 c15714 = new C15713(c17789.m41672(0, j4, j, true));
            c17789.m41674(c15713, c15714, j5, j7);
            C17789.m41669(c15713, i, false, runnable);
            C17789.m41669(c15714, i, true, runnable);
            C2309 c2309 = new C2309(new C9611(c15713, c15714, j5, i2 == 1), c5089M41671, j6, j7, j8);
            c10734M41675.close();
            return c2309;
        } catch (Throwable th) {
            try {
                c10734M41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
