package l;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۡ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f27912;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4300 f27913;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f27914;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile long f27915;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f27916;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f27917;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f27918;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f27919;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f27920;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f27921;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C9222 m23662(C2872 c2872, int i, C22213 c22213) {
        long j = this.f27915 - this.f27912.get();
        if (j < 2097152) {
            return null;
        }
        if (System.currentTimeMillis() - this.f27914 >= c22213.m49888()) {
            long jM12876 = this.f27913.m12876();
            if (jM12876 <= 0) {
                return null;
            }
            if (j / jM12876 < c22213.m49887()) {
                return null;
            }
        } else if (j <= 52428800) {
            return null;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 < 1048576) {
            j2 = 1048576;
        }
        long j3 = this.f27915 - j2;
        long j4 = this.f27915;
        this.f27915 = j3;
        return new C9222(this.f27917, this.f27919, c2872.f9143.incrementAndGet(), this.f27921, this.f27918, j3, j4, this.f27916);
    }

    public C9222(int i, String str, int i2, String str2, long j, long j2, long j3, InterfaceC7889 interfaceC7889) {
        this.f27917 = i;
        this.f27919 = str;
        this.f27921 = str2;
        this.f27918 = j;
        this.f27920 = j2;
        this.f27912 = new AtomicLong(j2);
        this.f27915 = j3;
        this.f27916 = interfaceC7889;
        C4300 c4300 = new C4300();
        c4300.m12878();
        this.f27913 = c4300;
        this.f27914 = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۢ᩻᩻] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23663(AbstractC3163 abstractC3163, C2872 c2872, C2036 c2036) {
        InputStream inputStreamMo9682;
        EnumC11772 enumC11772;
        EnumC11772 enumC11773;
        EnumC11772 enumC11774;
        long j = this.f27912.get();
        long j2 = this.f27915;
        long jMax = Math.max(0L, j2 - j);
        if (abstractC3163 instanceof InterfaceC16982) {
            inputStreamMo9682 = ((InterfaceC16982) abstractC3163).mo14222(this.f27921, j, jMax, new LongSupplier() { // from class: l.ۢ᩻᩻
                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return this.f30003.f27915;
                }
            });
        } else {
            inputStreamMo9682 = abstractC3163.mo9682(this.f27921, j, jMax);
        }
        int i = 65536;
        try {
            try {
                byte[] bArr = new byte[65536];
                long j3 = j;
                while (true) {
                    if (j3 < this.f27915 && !c2036.mo1526()) {
                        long j4 = this.f27915;
                        if (j3 >= j4) {
                            if (j4 < j2) {
                                enumC11773 = EnumC11772.EARLY_COMPLETE;
                            } else {
                                enumC11773 = EnumC11772.NORMAL_COMPLETE;
                            }
                            m23661(inputStreamMo9682, enumC11773);
                        } else {
                            int i2 = inputStreamMo9682.read(bArr, 0, (int) Math.min(i, j4 - j3));
                            if (i2 != -1) {
                                int iMin = (int) Math.min(i2, Math.max(0L, this.f27915 - j3));
                                if (iMin <= 0) {
                                    m23661(inputStreamMo9682, EnumC11772.EARLY_COMPLETE);
                                } else {
                                    synchronized (this.f27916) {
                                        if (this.f27916.isClosed()) {
                                            m23661(inputStreamMo9682, EnumC11772.EARLY_COMPLETE);
                                        } else {
                                            this.f27916.seek(j3);
                                            this.f27916.write(bArr, 0, iMin);
                                            long j5 = iMin;
                                            j3 += j5;
                                            this.f27912.set(j3);
                                            this.f27913.m12877(j5);
                                            c2872.m8798(c2036);
                                            c2036.mo6621(j5, c2872.f9154.addAndGet(j5), c2872.f9149);
                                            if (iMin < i2) {
                                                m23661(inputStreamMo9682, EnumC11772.EARLY_COMPLETE);
                                            } else {
                                                i = 65536;
                                            }
                                        }
                                    }
                                    inputStreamMo9682.close();
                                    this.f27913.m12879();
                                    return;
                                }
                            } else if (j3 >= this.f27915) {
                                if (this.f27915 < j2) {
                                    enumC11774 = EnumC11772.EARLY_COMPLETE;
                                } else {
                                    enumC11774 = EnumC11772.NORMAL_COMPLETE;
                                }
                                m23661(inputStreamMo9682, enumC11774);
                            }
                        }
                    }
                    if (j3 >= this.f27915) {
                        if (this.f27915 < j2) {
                            enumC11772 = EnumC11772.EARLY_COMPLETE;
                        } else {
                            enumC11772 = EnumC11772.NORMAL_COMPLETE;
                        }
                        m23661(inputStreamMo9682, enumC11772);
                    } else if (c2036.mo1526()) {
                        m23661(inputStreamMo9682, EnumC11772.EARLY_COMPLETE);
                    }
                    if (inputStreamMo9682 != null) {
                        inputStreamMo9682.close();
                    }
                    this.f27913.m12879();
                    return;
                }
            } catch (Throwable th) {
                if (inputStreamMo9682 == null) {
                    throw th;
                }
                try {
                    inputStreamMo9682.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f27913.m12879();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23661(InputStream inputStream, EnumC11772 enumC11772) {
        if (inputStream instanceof InterfaceC23060) {
            ((InterfaceC23060) inputStream).mo4670(enumC11772);
        }
    }
}
