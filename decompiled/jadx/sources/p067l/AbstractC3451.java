package p067l;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.֨۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3451 {

    /* JADX INFO: renamed from: ֡ */
    public long f6886;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f6887;

    /* JADX INFO: renamed from: ۖ */
    public Object f6888 = null;

    /* JADX INFO: renamed from: ۘ */
    public boolean f6889;

    /* JADX INFO: renamed from: ۚ */
    public boolean f6890;

    /* JADX INFO: renamed from: ۜ */
    public C19727 f6891;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC17043 f6892;

    /* JADX INFO: renamed from: ۢ */
    public long f6893;

    /* JADX INFO: renamed from: ۧ */
    public boolean f6894;

    /* JADX INFO: renamed from: ܳ */
    public CountDownLatch f6895;

    /* JADX INFO: renamed from: ܺ */
    public String f6896;

    /* JADX INFO: renamed from: ܽ */
    public boolean f6897;

    /* JADX INFO: renamed from: ܿ */
    public CountDownLatch f6898;

    /* JADX INFO: renamed from: ᩳ */
    public String f6899;

    /* JADX INFO: renamed from: ᩴ */
    public AbstractC17043 f6900;

    /* JADX INFO: renamed from: ᩵ */
    public String f6901;

    /* JADX INFO: renamed from: ᩷ */
    public String f6902;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f6903;

    /* JADX INFO: renamed from: ֫ */
    public abstract C2780 mo4359();

    /* JADX INFO: renamed from: ۧ */
    public abstract C7475 mo4363();

    public AbstractC3451(boolean z) {
        this.f6887 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6124(C10024 c10024, boolean z) {
        if (this.f6887) {
            if (z) {
                c10024.m23403(m6131());
            }
            c10024.m23403(m6133());
            Iterator it = mo4359().m4364().iterator();
            while (it.hasNext()) {
                ((AbstractC3451) it.next()).m6124(c10024, z);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m6129() {
        return this.f6887;
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m6128() {
        return this.f6886;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6135(long j) {
        this.f6886 = j;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final long m6154() {
        return this.f6893;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6122(long j) {
        this.f6893 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6127(boolean z) {
        this.f6894 = z;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m6150() {
        return this.f6894;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6123(String str) {
        this.f6899 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m6147() {
        return this.f6899;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m6151() {
        String str = this.f6896;
        if (str != null) {
            return str;
        }
        AbstractC17043 abstractC17043 = this.f6892;
        C12826.requireNonNull(abstractC17043);
        return abstractC17043.mo25505();
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC17043 m6131() {
        AbstractC17043 abstractC17043 = this.f6892;
        if (abstractC17043 != null) {
            return abstractC17043;
        }
        String str = this.f6896;
        C12826.requireNonNull(str);
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        this.f6892 = abstractC17043M42109;
        return abstractC17043M42109;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6125(AbstractC17043 abstractC17043) {
        this.f6892 = abstractC17043;
        this.f6896 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m6143(String str) {
        this.f6896 = str;
        this.f6892 = null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m6141() {
        String str = this.f6901;
        if (str != null) {
            return str;
        }
        AbstractC17043 abstractC17043 = this.f6900;
        C12826.requireNonNull(abstractC17043);
        return abstractC17043.mo25505();
    }

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC17043 m6133() {
        AbstractC17043 abstractC17043 = this.f6900;
        if (abstractC17043 != null) {
            return abstractC17043;
        }
        String str = this.f6901;
        C12826.requireNonNull(str);
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        this.f6900 = abstractC17043M42109;
        return abstractC17043M42109;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6137(AbstractC17043 abstractC17043) {
        this.f6900 = abstractC17043;
        this.f6901 = null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m6146(String str) {
        this.f6901 = str;
        this.f6900 = null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m6139() {
        return this.f6902;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6136(String str) {
        this.f6902 = str;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m6120() {
        return this.f6889;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m6144(boolean z) {
        this.f6889 = z;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m6149() {
        return this.f6897;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m6152() {
        this.f6897 = true;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m6121() {
        return this.f6903;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6138(boolean z) {
        this.f6903 = z;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m6130() {
        return this.f6890;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m6153() {
        this.f6890 = true;
    }

    /* JADX INFO: renamed from: ۢ */
    public final Object m6134() {
        return this.f6888;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m6148(String str) {
        this.f6888 = str;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C19727 m6145() {
        return this.f6891;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C19056 m6142() {
        C19727 c19727 = this.f6891;
        if (c19727 == null) {
            return null;
        }
        return new C19056(c19727);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6126(C19727 c19727) {
        this.f6891 = c19727;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4360(CountDownLatch countDownLatch) {
        this.f6895 = countDownLatch;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m6140() {
        CountDownLatch countDownLatch = this.f6895;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m6132() {
        CountDownLatch countDownLatch = this.f6898;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
