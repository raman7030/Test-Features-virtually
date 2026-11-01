package p067l;

import android.os.SystemClock;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۖ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C7HP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5099 {

    /* JADX INFO: renamed from: ܶ */
    public static final /* synthetic */ int f11939 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public static final C10748 f11940 = C10748.m24756(1000);

    /* JADX INFO: renamed from: ֨ */
    public final Object f11942;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f11944;

    /* JADX INFO: renamed from: ۘ */
    public final C19056 f11945;

    /* JADX INFO: renamed from: ۚ */
    public final String f11946;

    /* JADX INFO: renamed from: ۜ */
    public final long f11947;

    /* JADX INFO: renamed from: ۠ */
    public final AbstractC17043 f11948;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f11949;

    /* JADX INFO: renamed from: ۢ */
    public long f11950;

    /* JADX INFO: renamed from: ۧ */
    public final ThreadLocal f11951;

    /* JADX INFO: renamed from: ܺ */
    public final C24618 f11953;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC25215 f11954;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17043 f11955;

    /* JADX INFO: renamed from: ᩴ */
    public final String f11957;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f11958;

    /* JADX INFO: renamed from: ᩷ */
    public final long f11959;

    /* JADX INFO: renamed from: ֡ */
    public final AtomicInteger f11941 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f11943 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩻ */
    public final AtomicReference f11960 = new AtomicReference();

    /* JADX INFO: renamed from: ܳ */
    public final AtomicLong f11952 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f11956 = false;

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m10864(boolean z) {
        if (this.f11956) {
            return;
        }
        boolean z2 = true;
        this.f11956 = true;
        System.currentTimeMillis();
        synchronized (this.f11953) {
            C2700.m4192(this.f11953);
        }
        boolean z3 = false;
        if (z || this.f11960.get() != null || this.f11952.get() < this.f11947) {
            z2 = false;
        }
        System.currentTimeMillis();
        if (z2) {
            try {
                m10863();
            } catch (Exception e) {
                AtomicReference atomicReference = this.f11960;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                this.f11955.mo25503();
            }
        } else {
            this.f11955.mo25503();
        }
        z3 = z2;
        InterfaceC25215 interfaceC25215 = this.f11954;
        if (interfaceC25215 != null) {
            interfaceC25215.mo5874(this, z3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m10865(C4304 c4304) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f11950 >= C0240c.f1145a && f11940.m24761()) {
            this.f11951.set(this.f11957);
            c4304.mo8749();
            this.f11950 = jUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m10866(C11134 c11134, boolean z) {
        int iDecrementAndGet = this.f11943.decrementAndGet();
        double dCurrentTimeMillis = (System.currentTimeMillis() - c11134.f30860) / 1000.0d;
        long j = dCurrentTimeMillis > 0.0d ? (long) ((c11134.f30858.get() - c11134.f30866) / dCurrentTimeMillis) : 0L;
        if (j > 0) {
            m10862(j);
        }
        if (iDecrementAndGet == 0) {
            m10864(z);
        }
    }

    public C5099(int i, String str, String str2, String str3, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z, C24618 c24618, long j, long j2, Object obj, C19056 c19056, boolean z2, boolean z3, ThreadLocal threadLocal, InterfaceC25215 interfaceC25215) {
        this.f11957 = str;
        this.f11951 = threadLocal;
        System.currentTimeMillis();
        this.f11946 = str3;
        this.f11948 = abstractC17043;
        this.f11955 = abstractC17044;
        this.f11958 = z;
        this.f11953 = c24618;
        this.f11947 = j;
        this.f11959 = j2;
        this.f11942 = obj;
        this.f11945 = c19056;
        this.f11944 = z2;
        this.f11949 = z3;
        this.f11954 = interfaceC25215;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10863() throws IOException {
        if (this.f11958) {
            boolean z = this.f11944;
            AbstractC17043 abstractC17043 = this.f11948;
            if (z && abstractC17043.mo25094()) {
                if (!(this.f11949 ? abstractC17043.mo31069(new C17838()) : abstractC17043.mo25503()) && abstractC17043.mo25094()) {
                    throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to replace target file: ")));
                }
            }
            if (!this.f11955.mo25502(abstractC17043)) {
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to rename file to target: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m10862(long j) {
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            if (j < 1048576) {
                return String.format("%.2fKB", Double.valueOf(j / 1024.0d));
            }
            return j < 1073741824 ? String.format("%.2fMB", Double.valueOf(j / 1048576.0d)) : String.format("%.2fGB", Double.valueOf(j / 1.073741824E9d));
        }
        return j + "B";
    }
}
