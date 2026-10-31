package l;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.֨۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1139 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f4117;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4118;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f4119 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f4120;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f4121;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18264 f4122;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f4123;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f4124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f4125;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f4126;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f4127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f4128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f4129;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f4130;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f4131;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f4132;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f4133;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f4134;

    /* JADX INFO: renamed from: ֫ */
    public abstract C0433 mo1983();

    /* JADX INFO: renamed from: ۧ */
    public abstract C5373 mo1987();

    public AbstractC1139(boolean z) {
        this.f4118 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3883(C8055 c8055, boolean z) {
        if (this.f4118) {
            if (z) {
                c8055.m21436(m3890());
            }
            c8055.m21436(m3892());
            Iterator it = mo1983().m1988().iterator();
            while (it.hasNext()) {
                ((AbstractC1139) it.next()).m3883(c8055, z);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m3888() {
        return this.f4118;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m3887() {
        return this.f4117;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3894(long j) {
        this.f4117 = j;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m3913() {
        return this.f4124;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3881(long j) {
        this.f4124 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3886(boolean z) {
        this.f4125 = z;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m3909() {
        return this.f4125;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3882(String str) {
        this.f4130 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m3906() {
        return this.f4130;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m3910() {
        String str = this.f4127;
        if (str != null) {
            return str;
        }
        AbstractC15440 abstractC15440 = this.f4123;
        C11003.requireNonNull(abstractC15440);
        return abstractC15440.mo23554();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m3890() {
        AbstractC15440 abstractC15440 = this.f4123;
        if (abstractC15440 != null) {
            return abstractC15440;
        }
        String str = this.f4127;
        C11003.requireNonNull(str);
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        this.f4123 = abstractC15440M39866;
        return abstractC15440M39866;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3884(AbstractC15440 abstractC15440) {
        this.f4123 = abstractC15440;
        this.f4127 = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3902(String str) {
        this.f4127 = str;
        this.f4123 = null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m3900() {
        String str = this.f4132;
        if (str != null) {
            return str;
        }
        AbstractC15440 abstractC15440 = this.f4131;
        C11003.requireNonNull(abstractC15440);
        return abstractC15440.mo23554();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m3892() {
        AbstractC15440 abstractC15440 = this.f4131;
        if (abstractC15440 != null) {
            return abstractC15440;
        }
        String str = this.f4132;
        C11003.requireNonNull(str);
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        this.f4131 = abstractC15440M39866;
        return abstractC15440M39866;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3896(AbstractC15440 abstractC15440) {
        this.f4131 = abstractC15440;
        this.f4132 = null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m3905(String str) {
        this.f4132 = str;
        this.f4131 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m3898() {
        return this.f4133;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3895(String str) {
        this.f4133 = str;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m3879() {
        return this.f4120;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3903(boolean z) {
        this.f4120 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3908() {
        return this.f4128;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m3911() {
        this.f4128 = true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m3880() {
        return this.f4134;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3897(boolean z) {
        this.f4134 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m3889() {
        return this.f4121;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m3912() {
        this.f4121 = true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object m3893() {
        return this.f4119;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m3907(String str) {
        this.f4119 = str;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18264 m3904() {
        return this.f4122;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17558 m3901() {
        C18264 c18264 = this.f4122;
        if (c18264 == null) {
            return null;
        }
        return new C17558(c18264);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3885(C18264 c18264) {
        this.f4122 = c18264;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1984(CountDownLatch countDownLatch) {
        this.f4126 = countDownLatch;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m3899() {
        CountDownLatch countDownLatch = this.f4126;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m3891() {
        CountDownLatch countDownLatch = this.f4129;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
