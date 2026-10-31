package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۖ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C7HP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2872 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9141 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C8817 f9142 = C8817.m22786(1000);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f9144;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f9146;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17558 f9147;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f9148;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f9149;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f9150;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f9151;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f9152;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f9153;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23411 f9155;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24038 f9156;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f9157;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f9159;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f9160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f9161;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f9143 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f9145 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicReference f9162 = new AtomicReference();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f9154 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f9158 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m8797(boolean z) {
        if (this.f9158) {
            return;
        }
        boolean z2 = true;
        this.f9158 = true;
        System.currentTimeMillis();
        synchronized (this.f9155) {
            C0349.m1793(this.f9155);
        }
        boolean z3 = false;
        if (z || this.f9162.get() != null || this.f9154.get() < this.f9149) {
            z2 = false;
        }
        System.currentTimeMillis();
        if (z2) {
            try {
                m8796();
            } catch (Exception e) {
                AtomicReference atomicReference = this.f9162;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                this.f9157.mo23552();
            }
        } else {
            this.f9157.mo23552();
        }
        z3 = z2;
        InterfaceC24038 interfaceC24038 = this.f9156;
        if (interfaceC24038 != null) {
            interfaceC24038.mo3587(this, z3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m8798(C2036 c2036) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f9152 >= c.a && f9142.m22791()) {
            this.f9153.set(this.f9159);
            c2036.mo6623();
            this.f9152 = jUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m8799(C9222 c9222, boolean z) {
        int iDecrementAndGet = this.f9145.decrementAndGet();
        double dCurrentTimeMillis = (System.currentTimeMillis() - c9222.f27914) / 1000.0d;
        long j = dCurrentTimeMillis > 0.0d ? (long) ((c9222.f27912.get() - c9222.f27920) / dCurrentTimeMillis) : 0L;
        if (j > 0) {
            m8795(j);
        }
        if (iDecrementAndGet == 0) {
            m8797(z);
        }
    }

    public C2872(int i, String str, String str2, String str3, AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, boolean z, C23411 c23411, long j, long j2, Object obj, C17558 c17558, boolean z2, boolean z3, ThreadLocal threadLocal, InterfaceC24038 interfaceC24038) {
        this.f9159 = str;
        this.f9153 = threadLocal;
        System.currentTimeMillis();
        this.f9148 = str3;
        this.f9150 = abstractC15440;
        this.f9157 = abstractC15441;
        this.f9160 = z;
        this.f9155 = c23411;
        this.f9149 = j;
        this.f9161 = j2;
        this.f9144 = obj;
        this.f9147 = c17558;
        this.f9146 = z2;
        this.f9151 = z3;
        this.f9156 = interfaceC24038;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8796() throws IOException {
        if (this.f9160) {
            boolean z = this.f9146;
            AbstractC15440 abstractC15440 = this.f9150;
            if (z && abstractC15440.mo23120()) {
                if (!(this.f9151 ? abstractC15440.mo29017(new C16276()) : abstractC15440.mo23552()) && abstractC15440.mo23120()) {
                    throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to replace target file: ")));
                }
            }
            if (!this.f9157.mo23551(abstractC15440)) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to rename file to target: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8795(long j) {
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            if (j < 1048576) {
                return String.format("%.2fKB", Double.valueOf(j / 1024.0d));
            }
            return j < 1073741824 ? String.format("%.2fMB", Double.valueOf(j / 1048576.0d)) : String.format("%.2fGB", Double.valueOf(j / 1.073741824E9d));
        }
        return j + "B";
    }
}
