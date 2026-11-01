package p067l;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17984 implements InterfaceC16716, InterfaceC3962 {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final AbstractC17043 f53702 = C17853.f53281.m38684(".media");

    /* JADX INFO: renamed from: ܿ֫ */
    public static final AtomicInteger f53703 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f53704;

    /* JADX INFO: renamed from: ۗ */
    public final C24905 f53705;

    /* JADX INFO: renamed from: ۙ */
    public volatile int f53706;

    /* JADX INFO: renamed from: ۛ */
    public InterfaceC8054 f53707;

    /* JADX INFO: renamed from: ۟ */
    public volatile boolean f53708;

    /* JADX INFO: renamed from: ۤ */
    public IOException f53709;

    /* JADX INFO: renamed from: ۧ֫ */
    public final AbstractC17043 f53710;

    /* JADX INFO: renamed from: ۬ */
    public final C19326 f53713;

    /* JADX INFO: renamed from: ܰ */
    public final EnumC12621 f53714;

    /* JADX INFO: renamed from: ܽ֫ */
    public final AbstractC15599 f53715;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final String f53716;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractActivityC5549 f53717;

    /* JADX INFO: renamed from: ᩸ */
    public String f53718;

    /* JADX INFO: renamed from: ᩹ */
    public volatile int f53719;

    /* JADX INFO: renamed from: ᩺ */
    public final AtomicInteger f53720 = new AtomicInteger();

    /* JADX INFO: renamed from: ۨ */
    public final HashMap f53711 = new HashMap();

    /* JADX INFO: renamed from: ۫ */
    public EnumC9129 f53712 = EnumC9129.UNKNOWN;

    public C17984(ActivityC12088 activityC12088, AbstractC15599 abstractC15599, C19326 c19326, EnumC12621 enumC12621, C24905 c24905) {
        this.f53717 = activityC12088;
        this.f53715 = abstractC15599;
        this.f53713 = c19326;
        this.f53714 = enumC12621;
        this.f53705 = c24905;
        if (abstractC15599 instanceof C4744) {
            this.f53710 = null;
            this.f53716 = "local";
            return;
        }
        MessageDigest messageDigestM36660 = C16111.m36660();
        abstractC15599.mo9710(messageDigestM36660);
        String strSubstring = C16111.m36665(messageDigestM36660.digest()).substring(0, 8);
        this.f53716 = strSubstring;
        AbstractC17043 abstractC17043M38684 = f53702.m38684(strSubstring);
        if (abstractC15599 instanceof AbstractC5375) {
            this.f53710 = abstractC17043M38684;
            return;
        }
        this.f53710 = abstractC17043M38684.m38684(Integer.toHexString(f53703.incrementAndGet()) + "-" + Long.toHexString(System.nanoTime()));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15599 m40968() {
        return this.f53715;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40960(InterfaceC8054 interfaceC8054) {
        this.f53707 = interfaceC8054;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40964() {
        int i = this.f53719;
        this.f53719 = this.f53720.incrementAndGet();
        m40932(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m40946(int i) {
        return (i == 0 || this.f53708 || i != this.f53719) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40932(int i) {
        if (i == 0 || this.f53706 != i) {
            return;
        }
        this.f53706 = 0;
        InterfaceC8054 interfaceC8054 = this.f53707;
        if (interfaceC8054 != null) {
            C7050.m16212(new RunnableC15185(1, this, interfaceC8054));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40937(C17984 c17984, InterfaceC8054 interfaceC8054) {
        if (c17984.f53706 == 0) {
            interfaceC8054.accept(-2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40944(final C17984 c17984, final int i) {
        if (!c17984.m40946(i) || c17984.f53706 == i) {
            return;
        }
        c17984.f53706 = i;
        final InterfaceC8054 interfaceC8054 = c17984.f53707;
        if (interfaceC8054 != null) {
            C7050.m16212(new Runnable() { // from class: l.᩹֡ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C17984.m40935(this.f72940, i, interfaceC8054);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40935(C17984 c17984, int i, InterfaceC8054 interfaceC8054) {
        if (c17984.f53706 == i) {
            interfaceC8054.accept(-1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40934(final C17984 c17984, final int i, final int i2) {
        final InterfaceC8054 interfaceC8054;
        if (c17984.m40946(i) && (interfaceC8054 = c17984.f53707) != null) {
            C7050.m16212(new Runnable() { // from class: l.᩸֡ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C17984.m40936(this.f71101, i, interfaceC8054, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40936(C17984 c17984, int i, InterfaceC8054 interfaceC8054, int i2) {
        if (c17984.m40946(i)) {
            interfaceC8054.accept(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ܽۚۜ] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.֫ۚۜ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ܰܺܳ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ܽ */
    public final void m40966(InterfaceC19370 interfaceC19370) throws Throwable {
        ?? r1;
        ?? r14;
        boolean z;
        boolean z2;
        IOException iOException;
        if (this.f53710 == null) {
            return;
        }
        String strM40949 = m40949(interfaceC19370);
        AbstractC17043 abstractC17043M38684 = this.f53710.m38684(strM40949);
        if (this.f53715 instanceof AbstractC5375) {
            if (m40941(interfaceC19370, abstractC17043M38684)) {
                m40951(interfaceC19370, strM40949);
                return;
            } else if (m40942(interfaceC19370, false)) {
                return;
            }
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f53717;
        if (abstractActivityC5549 != null && (abstractActivityC5549.isFinishing() || this.f53717.isDestroyed())) {
            return;
        }
        synchronized (this) {
            C3903 c3903M40927 = m40927(abstractC17043M38684, interfaceC19370, strM40949);
            if (c3903M40927 == null) {
                return;
            }
            if (abstractC17043M38684.mo25094()) {
                abstractC17043M38684.mo29990();
            }
            int i = this.f53719;
            int iIncrementAndGet = this.f53720.incrementAndGet();
            this.f53719 = iIncrementAndGet;
            m40932(i);
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean[] zArr = {false};
            try {
                r1 = this.f53715;
                AbstractActivityC5549 abstractActivityC55410 = this.f53717;
                InputStream inputStreamMo9707 = r1.mo9707(abstractActivityC55410, interfaceC19370);
                try {
                    if (inputStreamMo9707 == null) {
                        throw new C4435(interfaceC19370.getName());
                    }
                    try {
                        try {
                            abstractC17043M38684.m38652(inputStreamMo9707, interfaceC19370.getSize(), new C21200(this, jUptimeMillis, iIncrementAndGet, zArr));
                            if (zArr[0] || !m40946(iIncrementAndGet)) {
                                throw new C5776(interfaceC19370.getName());
                            }
                            try {
                                inputStreamMo9707.close();
                                if (zArr[0] || !m40946(iIncrementAndGet)) {
                                    z2 = true;
                                    iOException = null;
                                } else {
                                    iOException = null;
                                    z2 = false;
                                }
                                m40933(strM40949, c3903M40927, iOException, z2);
                                m40932(iIncrementAndGet);
                            } catch (IOException e) {
                                e = e;
                                r1 = c3903M40927;
                                r14 = e;
                                try {
                                    abstractC17043M38684.mo29990();
                                    throw r14;
                                } catch (Throwable th) {
                                    th = th;
                                    if (zArr[0] && m40946(iIncrementAndGet)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    m40933(strM40949, r1, r14, z);
                                    m40932(iIncrementAndGet);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = c3903M40927;
                                abstractActivityC55410 = null;
                                r14 = abstractActivityC55410;
                                if (zArr[0]) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                m40933(strM40949, r1, r14, z);
                                m40932(iIncrementAndGet);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r1 = c3903M40927;
                            abstractActivityC55410 = null;
                            Throwable th4 = th;
                            if (inputStreamMo9707 == null) {
                                throw th4;
                            }
                            try {
                                inputStreamMo9707.close();
                                throw th4;
                            } catch (Throwable th5) {
                                try {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                } catch (IOException e2) {
                                    e = e2;
                                    r14 = e;
                                    abstractC17043M38684.mo29990();
                                    throw r14;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r14 = abstractActivityC55410;
                                    if (zArr[0]) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    m40933(strM40949, r1, r14, z);
                                    m40932(iIncrementAndGet);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r1 = c3903M40927;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException e3) {
                e = e3;
                r1 = c3903M40927;
            } catch (Throwable th9) {
                th = th9;
                r1 = c3903M40927;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C3903 m40927(AbstractC17043 abstractC17043, InterfaceC19370 interfaceC19370, String str) throws IOException {
        C3903 c3903;
        while (true) {
            boolean z = false;
            while (true) {
                if (this.f53708) {
                    throw new C5776(interfaceC19370.getName());
                }
                c3903 = (C3903) this.f53711.get(str);
                if (c3903 == null) {
                    if (interfaceC19370.getSize() > 0 && m40941(interfaceC19370, abstractC17043)) {
                        C3903 c3904 = new C3903(0);
                        c3904.f8457 = true;
                        this.f53711.put(str, c3904);
                        return null;
                    }
                    C3903 c3905 = new C3903(0);
                    c3905.f8459 = true;
                    this.f53711.put(str, c3905);
                    return c3905;
                }
                if (c3903.f8459) {
                    c3903.f8458++;
                    try {
                        wait();
                        c3903.f8458--;
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("Interrupted while waiting for media cache");
                    }
                }
            }
            if (c3903.f8457) {
                if (m40941(interfaceC19370, abstractC17043)) {
                    return null;
                }
                this.f53711.remove(str);
            } else {
                IOException iOException = c3903.f8456;
                if (iOException != null) {
                    if (z || c3903.f8458 > 0) {
                        if (c3903.f8458 == 0) {
                            this.f53711.remove(str);
                            throw iOException;
                        }
                        throw iOException;
                    }
                    this.f53711.remove(str);
                } else if (c3903.f8455) {
                    if (z || c3903.f8458 > 0) {
                        if (c3903.f8458 == 0) {
                            this.f53711.remove(str);
                        }
                        throw new C5776(interfaceC19370.getName());
                    }
                    this.f53711.remove(str);
                } else {
                    this.f53711.remove(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40933(String str, C3903 c3903, IOException iOException, boolean z) {
        synchronized (this) {
            if (((C3903) this.f53711.get(str)) == c3903) {
                c3903.f8459 = false;
                if (this.f53708 || z || (iOException instanceof C5776)) {
                    c3903.f8455 = true;
                    c3903.f8456 = null;
                    c3903.f8457 = false;
                } else if (iOException != null) {
                    c3903.f8456 = iOException;
                    c3903.f8455 = false;
                    c3903.f8457 = false;
                } else {
                    c3903.f8457 = true;
                    c3903.f8456 = null;
                    c3903.f8455 = false;
                }
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m40952(C17984 c17984, InterfaceC19370 interfaceC19370) throws IOException {
        if (c17984.f53710 == null) {
            return false;
        }
        AbstractC17043 abstractC17043M38684 = c17984.f53710.m38684(m40949(interfaceC19370));
        synchronized (c17984) {
            if (abstractC17043M38684.mo25094()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC15599 abstractC15599 = c17984.f53715;
                if ((abstractC15599 instanceof AbstractC5375) && ((AbstractC5375) abstractC15599).mo11733()) {
                    return true;
                }
            }
            try {
                InputStream inputStreamMo9707 = c17984.f53715.mo9707(c17984.f53717, interfaceC19370);
                try {
                    if (inputStreamMo9707 == null) {
                        throw new C4435(interfaceC19370.getName());
                    }
                    abstractC17043M38684.m38652(inputStreamMo9707, interfaceC19370.getSize(), (InterfaceC7717) null);
                    inputStreamMo9707.close();
                    return false;
                } catch (Throwable th) {
                    if (inputStreamMo9707 != null) {
                        try {
                            inputStreamMo9707.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                abstractC17043M38684.mo29990();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m40948(C17984 c17984, InterfaceC19370 interfaceC19370) {
        return c17984.m40942(interfaceC19370, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m40942(InterfaceC19370 interfaceC19370, boolean z) throws IOException {
        EnumC9129 enumC9129;
        boolean zMo11733 = false;
        if (z || Build.VERSION.SDK_INT >= 23) {
            AbstractC15599 abstractC15599 = this.f53715;
            if (abstractC15599 instanceof AbstractC5375) {
                AbstractC5375 abstractC5375 = (AbstractC5375) abstractC15599;
                synchronized (this) {
                    while (!this.f53708) {
                        EnumC9129 enumC91210 = this.f53712;
                        if (enumC91210 == EnumC9129.RANGE_SUPPORTED) {
                            return true;
                        }
                        if (enumC91210 == EnumC9129.RANGE_UNSUPPORTED) {
                            return false;
                        }
                        if (enumC91210 == EnumC9129.ERROR) {
                            IOException iOException = this.f53709;
                            if (iOException == null) {
                                throw new IOException("Network range support probe failed");
                            }
                            throw iOException;
                        }
                        EnumC9129 enumC91211 = EnumC9129.PROBING;
                        if (enumC91210 == enumC91211) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException("Interrupted while probing network range support");
                            }
                        } else {
                            this.f53712 = enumC91211;
                            try {
                                zMo11733 = abstractC5375.mo11733();
                                e = null;
                            } catch (IOException e) {
                                e = e;
                            }
                            synchronized (this) {
                                if (this.f53708) {
                                    this.f53712 = EnumC9129.UNKNOWN;
                                    this.f53709 = null;
                                    notifyAll();
                                    throw new C5776(interfaceC19370.getName());
                                }
                                this.f53709 = e;
                                if (e != null) {
                                    enumC9129 = EnumC9129.ERROR;
                                } else {
                                    enumC9129 = zMo11733 ? EnumC9129.RANGE_SUPPORTED : EnumC9129.RANGE_UNSUPPORTED;
                                }
                                this.f53712 = enumC9129;
                                notifyAll();
                            }
                            if (e == null) {
                                return zMo11733;
                            }
                            throw e;
                        }
                    }
                    throw new C5776(interfaceC19370.getName());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40938(C17984 c17984, InterfaceC19370 interfaceC19370) throws C23762 {
        if ((c17984.f53715 instanceof AbstractC5375) && !c17984.m40942(interfaceC19370, true)) {
            throw new C23762("Network storage does not support HLS range requests");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static IOException m40926(C17984 c17984, IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof C8397) {
                synchronized (c17984) {
                    c17984.f53712 = EnumC9129.RANGE_UNSUPPORTED;
                    c17984.f53709 = null;
                    c17984.notifyAll();
                }
                return new C23762("Network storage does not support HLS range requests", iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m40949(InterfaceC19370 interfaceC19370) {
        MessageDigest messageDigestM36660 = C16111.m36660();
        C16111.m36662(messageDigestM36660, interfaceC19370.getPath());
        messageDigestM36660.update((byte) 58);
        messageDigestM36660.update(String.valueOf(interfaceC19370.getSize()).getBytes());
        messageDigestM36660.update((byte) 58);
        messageDigestM36660.update(String.valueOf(interfaceC19370.getTime()).getBytes());
        return C16111.m36665(messageDigestM36660.digest()).substring(0, 24);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13823 m40958(InterfaceC19370 interfaceC19370) {
        if (this.f53710 == null) {
            return C13823.m31490(interfaceC19370.mo26445(), C13823.m31492(interfaceC19370.getPath()));
        }
        if (!(this.f53715 instanceof AbstractC5375)) {
            return m40955(interfaceC19370);
        }
        String strM40949 = m40949(interfaceC19370);
        AbstractC17043 abstractC17043M38684 = this.f53710.m38684(strM40949);
        synchronized (this) {
            if (!m40941(interfaceC19370, abstractC17043M38684)) {
                if (this.f53708) {
                    return C13823.f39054;
                }
                C3903 c3903 = (C3903) this.f53711.get(strM40949);
                if (c3903 != null) {
                    if (c3903.f8459) {
                        return C13823.f39054;
                    }
                    if (c3903.f8457) {
                        this.f53711.remove(strM40949);
                    } else if (c3903.f8456 != null || c3903.f8455) {
                        return C13823.f39055;
                    }
                }
                C24905 c24905 = this.f53705;
                if (c24905 != null && c24905.m54692()) {
                    String strM50055 = C22224.m50055(this.f53715, interfaceC19370, this.f53705.m54689());
                    if ((interfaceC19370.getSize() >= 0 && this.f53705.m54691() != null && this.f53705.m54691().m40360(strM50055, 0L, interfaceC19370.getSize())) || this.f53712 == EnumC9129.RANGE_SUPPORTED) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return C13823.m31491(new C23881(this, interfaceC19370, strM40949, strM50055));
                        }
                    }
                } else if (this.f53712 == EnumC9129.RANGE_SUPPORTED && Build.VERSION.SDK_INT >= 23) {
                    return C13823.m31491(new C23881(this, interfaceC19370, strM40949, "network:" + this.f53716 + ":" + strM40949));
                }
                if (this.f53712 == EnumC9129.ERROR) {
                    return C13823.f39055;
                }
                return C13823.f39054;
            }
            if (strM40949.equals(this.f53718)) {
                this.f53718 = null;
            }
            interfaceC19370.mo39141(R.id.MT_Protector, null);
            return C13823.m31490(abstractC17043M38684, C13823.m31492(interfaceC19370.getPath()));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private C13823 m40955(InterfaceC19370 interfaceC19370) {
        String strM40949 = m40949(interfaceC19370);
        AbstractC17043 abstractC17043M38684 = this.f53710.m38684(strM40949);
        synchronized (this) {
            if (this.f53708) {
                return C13823.f39054;
            }
            C3903 c3903 = (C3903) this.f53711.get(strM40949);
            if (c3903 != null) {
                if (c3903.f8459) {
                    return C13823.f39054;
                }
                if (c3903.f8457) {
                    if (m40941(interfaceC19370, abstractC17043M38684)) {
                        return C13823.m31490(abstractC17043M38684, C13823.m31492(interfaceC19370.getPath()));
                    }
                    this.f53711.remove(strM40949);
                }
            }
            if (interfaceC19370.getSize() > 0 && m40941(interfaceC19370, abstractC17043M38684)) {
                C3903 c3904 = new C3903(0);
                c3904.f8457 = true;
                this.f53711.put(strM40949, c3904);
                return C13823.m31490(abstractC17043M38684, C13823.m31492(interfaceC19370.getPath()));
            }
            return C13823.f39054;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m40967() {
        synchronized (this) {
            if (this.f53708) {
                return;
            }
            this.f53708 = true;
            int i = this.f53719;
            this.f53719 = this.f53720.incrementAndGet();
            m40932(i);
            for (C3903 c3903 : this.f53711.values()) {
                if (c3903.f8459) {
                    c3903.f8459 = false;
                    c3903.f8455 = true;
                    c3903.f8456 = null;
                    c3903.f8457 = false;
                }
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40965() {
        AbstractC17043 abstractC17043;
        synchronized (this) {
            if (!this.f53704 && (abstractC17043 = this.f53710) != null && !(this.f53715 instanceof AbstractC5375)) {
                this.f53704 = true;
                abstractC17043.mo25503();
            }
        }
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 mo8449() {
        return this.f53714 == EnumC12621.HLS_DIRECT ? new C5106(this) : new C11812(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m40956(C5318 c5318, C24905 c24905) throws IOException {
        return C22224.m50055(this.f53715, m40962(c5318.f12514), c24905.m54689());
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9501 m40957(Uri uri) throws IOException {
        InterfaceC19370 interfaceC19370M40962 = m40962(uri);
        AbstractC17043 abstractC17043 = this.f53710;
        if (abstractC17043 == null) {
            return new C6447(interfaceC19370M40962.mo26445());
        }
        String strM40949 = m40949(interfaceC19370M40962);
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(strM40949);
        if (m40941(interfaceC19370M40962, abstractC17043M38684)) {
            m40951(interfaceC19370M40962, strM40949);
            return new C6447(abstractC17043M38684);
        }
        if (this.f53715 instanceof AbstractC5375) {
            try {
                if (m40942(interfaceC19370M40962, false)) {
                    return new C13153(m40930(interfaceC19370M40962, strM40949, false));
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19370 m40962(Uri uri) throws IOException {
        C13010 c13010M44060;
        C19326 c19326 = this.f53713;
        c19326.getClass();
        InterfaceC19370 interfaceC19370M44058 = (uri == null || (c13010M44060 = c19326.m44060(uri.getPath())) == null) ? null : C19326.m44058(c13010M44060);
        if (interfaceC19370M44058 != null) {
            return interfaceC19370M44058;
        }
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            throw new IOException("Media path is null");
        }
        InterfaceC19370 interfaceC19370Mo9709 = this.f53715.mo9709(path);
        if (interfaceC19370Mo9709 == null || !((C17278) interfaceC19370Mo9709).mo39135()) {
            throw new IOException("Media item not found: ".concat(path));
        }
        return interfaceC19370Mo9709;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24618 m40963(InterfaceC19370 interfaceC19370) {
        AbstractC17043 abstractC17043 = this.f53710;
        if (abstractC17043 == null) {
            return interfaceC19370.mo26445().m38671("r");
        }
        String strM40949 = m40949(interfaceC19370);
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(strM40949);
        if (!m40941(interfaceC19370, abstractC17043M38684)) {
            if (m40942(interfaceC19370, false)) {
                return C2489.m3601(m40930(interfaceC19370, strM40949, true).m35923());
            }
            return abstractC17043M38684.m38671("r");
        }
        m40951(interfaceC19370, strM40949);
        return abstractC17043M38684.m38671("r");
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m40931(C17984 c17984, String str) {
        return c17984.f53710.m38684(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m40941(InterfaceC19370 interfaceC19370, AbstractC17043 abstractC17043) {
        boolean z;
        if (!abstractC17043.mo25094()) {
            return false;
        }
        if (interfaceC19370.getSize() > 0 && abstractC17043.mo25101() != interfaceC19370.getSize()) {
            return false;
        }
        if (this.f53715 instanceof AbstractC5375) {
            long size = interfaceC19370.getSize();
            if (!abstractC17043.mo25094() || abstractC17043.mo25101() < 12) {
                z = false;
            } else {
                try {
                    C24618 c24618M38671 = abstractC17043.m38671("r");
                    try {
                        z = c24618M38671.readInt() == 358818181 && c24618M38671.readLong() == size;
                        c24618M38671.close();
                    } catch (Throwable th) {
                        try {
                            c24618M38671.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    z = false;
                }
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܶ֡ۜ] */
    /* JADX INFO: renamed from: ֫ */
    public C15826 m40930(final InterfaceC19370 interfaceC19370, String str, boolean z) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC15599 abstractC15599 = this.f53715;
            if (abstractC15599 instanceof AbstractC5375) {
                final AbstractC5375 abstractC5375 = (AbstractC5375) abstractC15599;
                synchronized (this) {
                    if (this.f53708) {
                        throw new C5776(interfaceC19370.getName());
                    }
                    if (this.f53712 != EnumC9129.RANGE_SUPPORTED) {
                        IOException iOException = this.f53709;
                        if (iOException == null) {
                            throw new IOException("Network range cache is not ready");
                        }
                        throw iOException;
                    }
                    Object objMo39136 = interfaceC19370.mo39136(R.id.MT_Protector);
                    if (objMo39136 instanceof WeakReference) {
                        Object obj = ((WeakReference) objMo39136).get();
                        if (obj instanceof C15826) {
                            C15826 c15826 = (C15826) obj;
                            if (c15826.m35925()) {
                                if (z) {
                                    this.f53718 = str;
                                }
                                return c15826;
                            }
                            interfaceC19370.mo39141(R.id.MT_Protector, null);
                        }
                    }
                    C15826 c15827 = new C15826(new InterfaceC24544() { // from class: l.ܶ֡ۜ
                        @Override // p067l.InterfaceC24544
                        /* JADX INFO: renamed from: ֫ */
                        public final InputStream mo37461(long j) {
                            return abstractC5375.mo11725(j, interfaceC19370.getPath());
                        }
                    }, interfaceC19370.getName(), interfaceC19370.getSize(), this.f53710.m38684(str + ".page"));
                    interfaceC19370.mo39141(R.id.MT_Protector, new WeakReference(c15827));
                    if (z) {
                        this.f53718 = str;
                    }
                    return c15827;
                }
            }
        }
        throw new IOException("Network range cache is not available");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40969(InterfaceC19370 interfaceC19370) {
        String strM40949 = m40949(interfaceC19370);
        synchronized (this) {
            if (strM40949.equals(this.f53718)) {
                Object objMo39136 = interfaceC19370.mo39136(R.id.MT_Protector);
                if (objMo39136 instanceof WeakReference) {
                    Object obj = ((WeakReference) objMo39136).get();
                    if (obj instanceof C15826) {
                        C15826 c15826 = (C15826) obj;
                        try {
                            c15826.m35921();
                        } catch (IllegalStateException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m40951(InterfaceC19370 interfaceC19370, String str) {
        synchronized (this) {
            if (str.equals(this.f53718)) {
                this.f53718 = null;
            }
            interfaceC19370.mo39141(R.id.MT_Protector, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15163 m40959(InterfaceC19370 interfaceC19370, String str) throws IOException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IOException("Network preview data source is not available");
        }
        C24905 c24905 = this.f53705;
        if (c24905 != null && c24905.m54692()) {
            return new C15163(new C8339(m40943(interfaceC19370)));
        }
        C15826 c15826M40930 = m40930(interfaceC19370, str, false);
        try {
            return new C15163(c15826M40930.m35919());
        } catch (RuntimeException e) {
            c15826M40930.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC9501 m40961(InterfaceC19370 interfaceC19370, String str) {
        C24905 c24905 = this.f53705;
        if (c24905 != null && c24905.m54692()) {
            return m40943(interfaceC19370);
        }
        return new C13153(m40930(interfaceC19370, str, false));
    }

    /* JADX INFO: renamed from: ۜ */
    private C6998 m40943(InterfaceC19370 interfaceC19370) throws IOException {
        C13660 c13660;
        C24905 c24905 = this.f53705;
        if (c24905 == null || !c24905.m54692() || interfaceC19370.getSize() < 0) {
            throw new IOException("Unified preview cache is not available");
        }
        String strM50055 = C22224.m50055(this.f53715, interfaceC19370, c24905.m54689());
        boolean z = false;
        boolean z2 = c24905.m54691() != null && c24905.m54691().m40360(strM50055, 0L, interfaceC19370.getSize());
        C16245 c16245 = new C16245(this);
        if (!z2 && this.f53712 == EnumC9129.RANGE_SUPPORTED) {
            z = true;
        }
        C18596 c18596 = new C18596(c24905, new C11221(c24905, c16245, new C9057(strM50055)), strM50055, z);
        C13010 c13010M44060 = this.f53713.m44060(interfaceC19370.getPath());
        Uri uri = (c13010M44060 == null || (c13660 = c13010M44060.f36611) == null) ? null : c13660.f38436;
        if (uri == null) {
            throw new IOException("Media URI is missing");
        }
        return new C6998(c18596, uri, strM50055, interfaceC19370.getSize());
    }
}
