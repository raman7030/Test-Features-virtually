package p067l;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۡ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11134 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicLong f30858;

    /* JADX INFO: renamed from: ۜ */
    public final C6455 f30859;

    /* JADX INFO: renamed from: ۢ */
    public final long f30860;

    /* JADX INFO: renamed from: ۧ */
    public volatile long f30861;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC9866 f30862;

    /* JADX INFO: renamed from: ܽ */
    public final int f30863;

    /* JADX INFO: renamed from: ܿ */
    public final long f30864;

    /* JADX INFO: renamed from: ᩳ */
    public final String f30865;

    /* JADX INFO: renamed from: ᩷ */
    public final long f30866;

    /* JADX INFO: renamed from: ᩻ */
    public final String f30867;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C11134 m25661(C5099 c5099, int i, C23480 c23480) {
        long j = this.f30861 - this.f30858.get();
        if (j < 2097152) {
            return null;
        }
        if (System.currentTimeMillis() - this.f30860 >= c23480.m52215()) {
            long jM14740 = this.f30859.m14740();
            if (jM14740 <= 0) {
                return null;
            }
            if (j / jM14740 < c23480.m52214()) {
                return null;
            }
        } else if (j <= 52428800) {
            return null;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 < 1048576) {
            j2 = 1048576;
        }
        long j3 = this.f30861 - j2;
        long j4 = this.f30861;
        this.f30861 = j3;
        return new C11134(this.f30863, this.f30865, c5099.f11941.incrementAndGet(), this.f30867, this.f30864, j3, j4, this.f30862);
    }

    public C11134(int i, String str, int i2, String str2, long j, long j2, long j3, InterfaceC9866 interfaceC9866) {
        this.f30863 = i;
        this.f30865 = str;
        this.f30867 = str2;
        this.f30864 = j;
        this.f30866 = j2;
        this.f30858 = new AtomicLong(j2);
        this.f30861 = j3;
        this.f30862 = interfaceC9866;
        C6455 c6455 = new C6455();
        c6455.m14742();
        this.f30859 = c6455;
        this.f30860 = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۢ᩻᩻] */
    /* JADX INFO: renamed from: ֫ */
    public final void m25662(AbstractC5375 abstractC5375, C5099 c5099, C4304 c4304) {
        InputStream inputStreamMo11726;
        EnumC13557 enumC13557;
        EnumC13557 enumC13558;
        EnumC13557 enumC13559;
        long j = this.f30858.get();
        long j2 = this.f30861;
        long jMax = Math.max(0L, j2 - j);
        if (abstractC5375 instanceof InterfaceC18509) {
            inputStreamMo11726 = ((InterfaceC18509) abstractC5375).mo16103(this.f30867, j, jMax, new LongSupplier() { // from class: l.ۢ᩻᩻
                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return this.f32961.f30861;
                }
            });
        } else {
            inputStreamMo11726 = abstractC5375.mo11726(this.f30867, j, jMax);
        }
        int i = 65536;
        try {
            try {
                byte[] bArr = new byte[65536];
                long j3 = j;
                while (true) {
                    if (j3 < this.f30861 && !c4304.mo3924()) {
                        long j4 = this.f30861;
                        if (j3 >= j4) {
                            if (j4 < j2) {
                                enumC13558 = EnumC13557.EARLY_COMPLETE;
                            } else {
                                enumC13558 = EnumC13557.NORMAL_COMPLETE;
                            }
                            m25660(inputStreamMo11726, enumC13558);
                        } else {
                            int i2 = inputStreamMo11726.read(bArr, 0, (int) Math.min(i, j4 - j3));
                            if (i2 != -1) {
                                int iMin = (int) Math.min(i2, Math.max(0L, this.f30861 - j3));
                                if (iMin <= 0) {
                                    m25660(inputStreamMo11726, EnumC13557.EARLY_COMPLETE);
                                } else {
                                    synchronized (this.f30862) {
                                        if (this.f30862.isClosed()) {
                                            m25660(inputStreamMo11726, EnumC13557.EARLY_COMPLETE);
                                        } else {
                                            this.f30862.seek(j3);
                                            this.f30862.write(bArr, 0, iMin);
                                            long j5 = iMin;
                                            j3 += j5;
                                            this.f30858.set(j3);
                                            this.f30859.m14741(j5);
                                            c5099.m10865(c4304);
                                            c4304.mo8747(j5, c5099.f11952.addAndGet(j5), c5099.f11947);
                                            if (iMin < i2) {
                                                m25660(inputStreamMo11726, EnumC13557.EARLY_COMPLETE);
                                            } else {
                                                i = 65536;
                                            }
                                        }
                                    }
                                    inputStreamMo11726.close();
                                    this.f30859.m14743();
                                    return;
                                }
                            } else if (j3 >= this.f30861) {
                                if (this.f30861 < j2) {
                                    enumC13559 = EnumC13557.EARLY_COMPLETE;
                                } else {
                                    enumC13559 = EnumC13557.NORMAL_COMPLETE;
                                }
                                m25660(inputStreamMo11726, enumC13559);
                            }
                        }
                    }
                    if (j3 >= this.f30861) {
                        if (this.f30861 < j2) {
                            enumC13557 = EnumC13557.EARLY_COMPLETE;
                        } else {
                            enumC13557 = EnumC13557.NORMAL_COMPLETE;
                        }
                        m25660(inputStreamMo11726, enumC13557);
                    } else if (c4304.mo3924()) {
                        m25660(inputStreamMo11726, EnumC13557.EARLY_COMPLETE);
                    }
                    if (inputStreamMo11726 != null) {
                        inputStreamMo11726.close();
                    }
                    this.f30859.m14743();
                    return;
                }
            } catch (Throwable th) {
                if (inputStreamMo11726 == null) {
                    throw th;
                }
                try {
                    inputStreamMo11726.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f30859.m14743();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m25660(InputStream inputStream, EnumC13557 enumC13557) {
        if (inputStream instanceof InterfaceC24285) {
            ((InterfaceC24285) inputStream).mo6902(enumC13557);
        }
    }
}
