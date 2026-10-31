package l;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.R;
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
public final class C16431 implements InterfaceC15097, InterfaceC1677 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50522 = C16293.f50114.m36526(".media");

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f50523 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f50524;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23713 f50525;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f50526;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC5982 f50527;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f50528;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public IOException f50529;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f50530;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17843 f50533;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC10788 f50534;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f50535;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final String f50536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f50537;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f50538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f50539;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f50540 = new AtomicInteger();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f50531 = new HashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC7114 f50532 = EnumC7114.UNKNOWN;

    public C16431(ActivityC10227 activityC10227, AbstractC13921 abstractC13921, C17843 c17843, EnumC10788 enumC10788, C23713 c23713) {
        this.f50537 = activityC10227;
        this.f50535 = abstractC13921;
        this.f50533 = c17843;
        this.f50534 = enumC10788;
        this.f50525 = c23713;
        if (abstractC13921 instanceof C2499) {
            this.f50530 = null;
            this.f50536 = "local";
            return;
        }
        MessageDigest messageDigestM34526 = C14460.m34526();
        abstractC13921.mo7639(messageDigestM34526);
        String strSubstring = C14460.m34531(messageDigestM34526.digest()).substring(0, 8);
        this.f50536 = strSubstring;
        AbstractC15440 abstractC15440M36526 = f50522.m36526(strSubstring);
        if (abstractC13921 instanceof AbstractC3163) {
            this.f50530 = abstractC15440M36526;
            return;
        }
        this.f50530 = abstractC15440M36526.m36526(Integer.toHexString(f50523.incrementAndGet()) + "-" + Long.toHexString(System.nanoTime()));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m38743() {
        return this.f50535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38735(InterfaceC5982 interfaceC5982) {
        this.f50527 = interfaceC5982;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38739() {
        int i = this.f50539;
        this.f50539 = this.f50540.incrementAndGet();
        m38707(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m38721(int i) {
        return (i == 0 || this.f50528 || i != this.f50539) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38707(int i) {
        if (i == 0 || this.f50526 != i) {
            return;
        }
        this.f50526 = 0;
        InterfaceC5982 interfaceC5982 = this.f50527;
        if (interfaceC5982 != null) {
            C4925.m14315(new RunnableC13486(1, this, interfaceC5982));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38712(C16431 c16431, InterfaceC5982 interfaceC5982) {
        if (c16431.f50526 == 0) {
            interfaceC5982.accept(-2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38719(final C16431 c16431, final int i) {
        if (!c16431.m38721(i) || c16431.f50526 == i) {
            return;
        }
        c16431.f50526 = i;
        final InterfaceC5982 interfaceC5982 = c16431.f50527;
        if (interfaceC5982 != null) {
            C4925.m14315(new Runnable() { // from class: l.᩹֡ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C16431.m38710(this.f70228, i, interfaceC5982);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38710(C16431 c16431, int i, InterfaceC5982 interfaceC5982) {
        if (c16431.f50526 == i) {
            interfaceC5982.accept(-1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38709(final C16431 c16431, final int i, final int i2) {
        final InterfaceC5982 interfaceC5982;
        if (c16431.m38721(i) && (interfaceC5982 = c16431.f50527) != null) {
            C4925.m14315(new Runnable() { // from class: l.᩸֡ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C16431.m38711(this.f68418, i, interfaceC5982, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38711(C16431 c16431, int i, InterfaceC5982 interfaceC5982, int i2) {
        if (c16431.m38721(i)) {
            interfaceC5982.accept(i2);
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38741(InterfaceC17889 interfaceC17889) throws Throwable {
        ?? r1;
        ?? r14;
        boolean z;
        boolean z2;
        IOException iOException;
        if (this.f50530 == null) {
            return;
        }
        String strM38724 = m38724(interfaceC17889);
        AbstractC15440 abstractC15440M36526 = this.f50530.m36526(strM38724);
        if (this.f50535 instanceof AbstractC3163) {
            if (m38716(interfaceC17889, abstractC15440M36526)) {
                m38726(interfaceC17889, strM38724);
                return;
            } else if (m38717(interfaceC17889, false)) {
                return;
            }
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f50537;
        if (abstractActivityC3346 != null && (abstractActivityC3346.isFinishing() || this.f50537.isDestroyed())) {
            return;
        }
        synchronized (this) {
            C1615 c1615M38702 = m38702(abstractC15440M36526, interfaceC17889, strM38724);
            if (c1615M38702 == null) {
                return;
            }
            if (abstractC15440M36526.mo23120()) {
                abstractC15440M36526.mo27929();
            }
            int i = this.f50539;
            int iIncrementAndGet = this.f50540.incrementAndGet();
            this.f50539 = iIncrementAndGet;
            m38707(i);
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean[] zArr = {false};
            try {
                r1 = this.f50535;
                AbstractActivityC3346 abstractActivityC3347 = this.f50537;
                InputStream inputStreamMo7636 = r1.mo7636(abstractActivityC3347, interfaceC17889);
                try {
                    if (inputStreamMo7636 == null) {
                        throw new C2175(interfaceC17889.getName());
                    }
                    try {
                        try {
                            abstractC15440M36526.m36494(inputStreamMo7636, interfaceC17889.getSize(), new C19815(this, jUptimeMillis, iIncrementAndGet, zArr));
                            if (zArr[0] || !m38721(iIncrementAndGet)) {
                                throw new C3586(interfaceC17889.getName());
                            }
                            try {
                                inputStreamMo7636.close();
                                if (zArr[0] || !m38721(iIncrementAndGet)) {
                                    z2 = true;
                                    iOException = null;
                                } else {
                                    iOException = null;
                                    z2 = false;
                                }
                                m38708(strM38724, c1615M38702, iOException, z2);
                                m38707(iIncrementAndGet);
                            } catch (IOException e) {
                                e = e;
                                r1 = c1615M38702;
                                r14 = e;
                                try {
                                    abstractC15440M36526.mo27929();
                                    throw r14;
                                } catch (Throwable th) {
                                    th = th;
                                    if (zArr[0] && m38721(iIncrementAndGet)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    m38708(strM38724, r1, r14, z);
                                    m38707(iIncrementAndGet);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = c1615M38702;
                                abstractActivityC3347 = null;
                                r14 = abstractActivityC3347;
                                if (zArr[0]) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                m38708(strM38724, r1, r14, z);
                                m38707(iIncrementAndGet);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r1 = c1615M38702;
                            abstractActivityC3347 = null;
                            Throwable th4 = th;
                            if (inputStreamMo7636 == null) {
                                throw th4;
                            }
                            try {
                                inputStreamMo7636.close();
                                throw th4;
                            } catch (Throwable th5) {
                                try {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                } catch (IOException e2) {
                                    e = e2;
                                    r14 = e;
                                    abstractC15440M36526.mo27929();
                                    throw r14;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r14 = abstractActivityC3347;
                                    if (zArr[0]) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    m38708(strM38724, r1, r14, z);
                                    m38707(iIncrementAndGet);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r1 = c1615M38702;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException e3) {
                e = e3;
                r1 = c1615M38702;
            } catch (Throwable th9) {
                th = th9;
                r1 = c1615M38702;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C1615 m38702(AbstractC15440 abstractC15440, InterfaceC17889 interfaceC17889, String str) throws IOException {
        C1615 c1615;
        while (true) {
            boolean z = false;
            while (true) {
                if (this.f50528) {
                    throw new C3586(interfaceC17889.getName());
                }
                c1615 = (C1615) this.f50531.get(str);
                if (c1615 == null) {
                    if (interfaceC17889.getSize() > 0 && m38716(interfaceC17889, abstractC15440)) {
                        C1615 c1616 = new C1615(0);
                        c1616.f5677 = true;
                        this.f50531.put(str, c1616);
                        return null;
                    }
                    C1615 c1617 = new C1615(0);
                    c1617.f5679 = true;
                    this.f50531.put(str, c1617);
                    return c1617;
                }
                if (c1615.f5679) {
                    c1615.f5678++;
                    try {
                        wait();
                        c1615.f5678--;
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("Interrupted while waiting for media cache");
                    }
                }
            }
            if (c1615.f5677) {
                if (m38716(interfaceC17889, abstractC15440)) {
                    return null;
                }
                this.f50531.remove(str);
            } else {
                IOException iOException = c1615.f5676;
                if (iOException != null) {
                    if (z || c1615.f5678 > 0) {
                        if (c1615.f5678 == 0) {
                            this.f50531.remove(str);
                            throw iOException;
                        }
                        throw iOException;
                    }
                    this.f50531.remove(str);
                } else if (c1615.f5675) {
                    if (z || c1615.f5678 > 0) {
                        if (c1615.f5678 == 0) {
                            this.f50531.remove(str);
                        }
                        throw new C3586(interfaceC17889.getName());
                    }
                    this.f50531.remove(str);
                } else {
                    this.f50531.remove(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38708(String str, C1615 c1615, IOException iOException, boolean z) {
        synchronized (this) {
            if (((C1615) this.f50531.get(str)) == c1615) {
                c1615.f5679 = false;
                if (this.f50528 || z || (iOException instanceof C3586)) {
                    c1615.f5675 = true;
                    c1615.f5676 = null;
                    c1615.f5677 = false;
                } else if (iOException != null) {
                    c1615.f5676 = iOException;
                    c1615.f5675 = false;
                    c1615.f5677 = false;
                } else {
                    c1615.f5677 = true;
                    c1615.f5676 = null;
                    c1615.f5675 = false;
                }
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m38727(C16431 c16431, InterfaceC17889 interfaceC17889) throws IOException {
        if (c16431.f50530 == null) {
            return false;
        }
        AbstractC15440 abstractC15440M36526 = c16431.f50530.m36526(m38724(interfaceC17889));
        synchronized (c16431) {
            if (abstractC15440M36526.mo23120()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC13921 abstractC13921 = c16431.f50535;
                if ((abstractC13921 instanceof AbstractC3163) && ((AbstractC3163) abstractC13921).mo9689()) {
                    return true;
                }
            }
            try {
                InputStream inputStreamMo7636 = c16431.f50535.mo7636(c16431.f50537, interfaceC17889);
                try {
                    if (inputStreamMo7636 == null) {
                        throw new C2175(interfaceC17889.getName());
                    }
                    abstractC15440M36526.m36494(inputStreamMo7636, interfaceC17889.getSize(), (InterfaceC5627) null);
                    inputStreamMo7636.close();
                    return false;
                } catch (Throwable th) {
                    if (inputStreamMo7636 != null) {
                        try {
                            inputStreamMo7636.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                abstractC15440M36526.mo27929();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m38723(C16431 c16431, InterfaceC17889 interfaceC17889) {
        return c16431.m38717(interfaceC17889, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m38717(InterfaceC17889 interfaceC17889, boolean z) throws IOException {
        EnumC7114 enumC7114;
        boolean zMo9689 = false;
        if (z || Build.VERSION.SDK_INT >= 23) {
            AbstractC13921 abstractC13921 = this.f50535;
            if (abstractC13921 instanceof AbstractC3163) {
                AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                synchronized (this) {
                    while (!this.f50528) {
                        EnumC7114 enumC7115 = this.f50532;
                        if (enumC7115 == EnumC7114.RANGE_SUPPORTED) {
                            return true;
                        }
                        if (enumC7115 == EnumC7114.RANGE_UNSUPPORTED) {
                            return false;
                        }
                        if (enumC7115 == EnumC7114.ERROR) {
                            IOException iOException = this.f50529;
                            if (iOException == null) {
                                throw new IOException("Network range support probe failed");
                            }
                            throw iOException;
                        }
                        EnumC7114 enumC7116 = EnumC7114.PROBING;
                        if (enumC7115 == enumC7116) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException("Interrupted while probing network range support");
                            }
                        } else {
                            this.f50532 = enumC7116;
                            try {
                                zMo9689 = abstractC3163.mo9689();
                                e = null;
                            } catch (IOException e) {
                                e = e;
                            }
                            synchronized (this) {
                                if (this.f50528) {
                                    this.f50532 = EnumC7114.UNKNOWN;
                                    this.f50529 = null;
                                    notifyAll();
                                    throw new C3586(interfaceC17889.getName());
                                }
                                this.f50529 = e;
                                if (e != null) {
                                    enumC7114 = EnumC7114.ERROR;
                                } else {
                                    enumC7114 = zMo9689 ? EnumC7114.RANGE_SUPPORTED : EnumC7114.RANGE_UNSUPPORTED;
                                }
                                this.f50532 = enumC7114;
                                notifyAll();
                            }
                            if (e == null) {
                                return zMo9689;
                            }
                            throw e;
                        }
                    }
                    throw new C3586(interfaceC17889.getName());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38713(C16431 c16431, InterfaceC17889 interfaceC17889) throws C22510 {
        if ((c16431.f50535 instanceof AbstractC3163) && !c16431.m38717(interfaceC17889, true)) {
            throw new C22510("Network storage does not support HLS range requests");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m38701(C16431 c16431, IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof C6343) {
                synchronized (c16431) {
                    c16431.f50532 = EnumC7114.RANGE_UNSUPPORTED;
                    c16431.f50529 = null;
                    c16431.notifyAll();
                }
                return new C22510("Network storage does not support HLS range requests", iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m38724(InterfaceC17889 interfaceC17889) {
        MessageDigest messageDigestM34526 = C14460.m34526();
        C14460.m34528(messageDigestM34526, interfaceC17889.getPath());
        messageDigestM34526.update((byte) 58);
        messageDigestM34526.update(String.valueOf(interfaceC17889.getSize()).getBytes());
        messageDigestM34526.update((byte) 58);
        messageDigestM34526.update(String.valueOf(interfaceC17889.getTime()).getBytes());
        return C14460.m34531(messageDigestM34526.digest()).substring(0, 24);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12053 m38733(InterfaceC17889 interfaceC17889) {
        if (this.f50530 == null) {
            return C12053.m29428(interfaceC17889.mo24433(), C12053.m29430(interfaceC17889.getPath()));
        }
        if (!(this.f50535 instanceof AbstractC3163)) {
            return m38730(interfaceC17889);
        }
        String strM38724 = m38724(interfaceC17889);
        AbstractC15440 abstractC15440M36526 = this.f50530.m36526(strM38724);
        synchronized (this) {
            if (!m38716(interfaceC17889, abstractC15440M36526)) {
                if (this.f50528) {
                    return C12053.f36043;
                }
                C1615 c1615 = (C1615) this.f50531.get(strM38724);
                if (c1615 != null) {
                    if (c1615.f5679) {
                        return C12053.f36043;
                    }
                    if (c1615.f5677) {
                        this.f50531.remove(strM38724);
                    } else if (c1615.f5676 != null || c1615.f5675) {
                        return C12053.f36044;
                    }
                }
                C23713 c23713 = this.f50525;
                if (c23713 != null && c23713.m52289()) {
                    String strM47725 = C20892.m47725(this.f50535, interfaceC17889, this.f50525.m52286());
                    if ((interfaceC17889.getSize() >= 0 && this.f50525.m52288() != null && this.f50525.m52288().m38148(strM47725, 0L, interfaceC17889.getSize())) || this.f50532 == EnumC7114.RANGE_SUPPORTED) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return C12053.m29429(new C22636(this, interfaceC17889, strM38724, strM47725));
                        }
                    }
                } else if (this.f50532 == EnumC7114.RANGE_SUPPORTED && Build.VERSION.SDK_INT >= 23) {
                    return C12053.m29429(new C22636(this, interfaceC17889, strM38724, "network:" + this.f50536 + ":" + strM38724));
                }
                if (this.f50532 == EnumC7114.ERROR) {
                    return C12053.f36044;
                }
                return C12053.f36043;
            }
            if (strM38724.equals(this.f50538)) {
                this.f50538 = null;
            }
            interfaceC17889.mo36975(R.id.MT_Protector, null);
            return C12053.m29428(abstractC15440M36526, C12053.m29430(interfaceC17889.getPath()));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C12053 m38730(InterfaceC17889 interfaceC17889) {
        String strM38724 = m38724(interfaceC17889);
        AbstractC15440 abstractC15440M36526 = this.f50530.m36526(strM38724);
        synchronized (this) {
            if (this.f50528) {
                return C12053.f36043;
            }
            C1615 c1615 = (C1615) this.f50531.get(strM38724);
            if (c1615 != null) {
                if (c1615.f5679) {
                    return C12053.f36043;
                }
                if (c1615.f5677) {
                    if (m38716(interfaceC17889, abstractC15440M36526)) {
                        return C12053.m29428(abstractC15440M36526, C12053.m29430(interfaceC17889.getPath()));
                    }
                    this.f50531.remove(strM38724);
                }
            }
            if (interfaceC17889.getSize() > 0 && m38716(interfaceC17889, abstractC15440M36526)) {
                C1615 c1616 = new C1615(0);
                c1616.f5677 = true;
                this.f50531.put(strM38724, c1616);
                return C12053.m29428(abstractC15440M36526, C12053.m29430(interfaceC17889.getPath()));
            }
            return C12053.f36043;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m38742() {
        synchronized (this) {
            if (this.f50528) {
                return;
            }
            this.f50528 = true;
            int i = this.f50539;
            this.f50539 = this.f50540.incrementAndGet();
            m38707(i);
            for (C1615 c1615 : this.f50531.values()) {
                if (c1615.f5679) {
                    c1615.f5679 = false;
                    c1615.f5675 = true;
                    c1615.f5676 = null;
                    c1615.f5677 = false;
                }
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38740() {
        AbstractC15440 abstractC15440;
        synchronized (this) {
            if (!this.f50524 && (abstractC15440 = this.f50530) != null && !(this.f50535 instanceof AbstractC3163)) {
                this.f50524 = true;
                abstractC15440.mo23552();
            }
        }
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21449 mo6247() {
        return this.f50534 == EnumC10788.HLS_DIRECT ? new C2881(this) : new C9937(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38731(C3104 c3104, C23713 c23713) throws IOException {
        return C20892.m47725(this.f50535, m38737(c3104.f9711), c23713.m52286());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m38732(Uri uri) throws IOException {
        InterfaceC17889 interfaceC17889M38737 = m38737(uri);
        AbstractC15440 abstractC15440 = this.f50530;
        if (abstractC15440 == null) {
            return new C4292(interfaceC17889M38737.mo24433());
        }
        String strM38724 = m38724(interfaceC17889M38737);
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(strM38724);
        if (m38716(interfaceC17889M38737, abstractC15440M36526)) {
            m38726(interfaceC17889M38737, strM38724);
            return new C4292(abstractC15440M36526);
        }
        if (this.f50535 instanceof AbstractC3163) {
            try {
                if (m38717(interfaceC17889M38737, false)) {
                    return new C11348(m38705(interfaceC17889M38737, strM38724, false));
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m38737(Uri uri) throws IOException {
        C11197 c11197M41814;
        C17843 c17843 = this.f50533;
        c17843.getClass();
        InterfaceC17889 interfaceC17889M41812 = (uri == null || (c11197M41814 = c17843.m41814(uri.getPath())) == null) ? null : C17843.m41812(c11197M41814);
        if (interfaceC17889M41812 != null) {
            return interfaceC17889M41812;
        }
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            throw new IOException("Media path is null");
        }
        InterfaceC17889 interfaceC17889Mo7638 = this.f50535.mo7638(path);
        if (interfaceC17889Mo7638 == null || !((C15688) interfaceC17889Mo7638).mo36969()) {
            throw new IOException("Media item not found: ".concat(path));
        }
        return interfaceC17889Mo7638;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23411 m38738(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440 = this.f50530;
        if (abstractC15440 == null) {
            return interfaceC17889.mo24433().m36513("r");
        }
        String strM38724 = m38724(interfaceC17889);
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(strM38724);
        if (!m38716(interfaceC17889, abstractC15440M36526)) {
            if (m38717(interfaceC17889, false)) {
                return C0127.m1200(m38705(interfaceC17889, strM38724, true).m33791());
            }
            return abstractC15440M36526.m36513("r");
        }
        m38726(interfaceC17889, strM38724);
        return abstractC15440M36526.m36513("r");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m38706(C16431 c16431, String str) {
        return c16431.f50530.m36526(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m38716(InterfaceC17889 interfaceC17889, AbstractC15440 abstractC15440) {
        boolean z;
        if (!abstractC15440.mo23120()) {
            return false;
        }
        if (interfaceC17889.getSize() > 0 && abstractC15440.mo23127() != interfaceC17889.getSize()) {
            return false;
        }
        if (this.f50535 instanceof AbstractC3163) {
            long size = interfaceC17889.getSize();
            if (!abstractC15440.mo23120() || abstractC15440.mo23127() < 12) {
                z = false;
            } else {
                try {
                    C23411 c23411M36513 = abstractC15440.m36513("r");
                    try {
                        z = c23411M36513.readInt() == 358818181 && c23411M36513.readLong() == size;
                        c23411M36513.close();
                    } catch (Throwable th) {
                        try {
                            c23411M36513.close();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14159 m38705(final InterfaceC17889 interfaceC17889, String str, boolean z) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC13921 abstractC13921 = this.f50535;
            if (abstractC13921 instanceof AbstractC3163) {
                final AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                synchronized (this) {
                    if (this.f50528) {
                        throw new C3586(interfaceC17889.getName());
                    }
                    if (this.f50532 != EnumC7114.RANGE_SUPPORTED) {
                        IOException iOException = this.f50529;
                        if (iOException == null) {
                            throw new IOException("Network range cache is not ready");
                        }
                        throw iOException;
                    }
                    Object objMo36970 = interfaceC17889.mo36970(R.id.MT_Protector);
                    if (objMo36970 instanceof WeakReference) {
                        Object obj = ((WeakReference) objMo36970).get();
                        if (obj instanceof C14159) {
                            C14159 c14159 = (C14159) obj;
                            if (c14159.m33793()) {
                                if (z) {
                                    this.f50538 = str;
                                }
                                return c14159;
                            }
                            interfaceC17889.mo36975(R.id.MT_Protector, null);
                        }
                    }
                    C14159 c141510 = new C14159(new InterfaceC23332() { // from class: l.ܶ֡ۜ
                        @Override // l.InterfaceC23332
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final InputStream mo35309(long j) {
                            return abstractC3163.mo9681(j, interfaceC17889.getPath());
                        }
                    }, interfaceC17889.getName(), interfaceC17889.getSize(), this.f50530.m36526(str + ".page"));
                    interfaceC17889.mo36975(R.id.MT_Protector, new WeakReference(c141510));
                    if (z) {
                        this.f50538 = str;
                    }
                    return c141510;
                }
            }
        }
        throw new IOException("Network range cache is not available");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38744(InterfaceC17889 interfaceC17889) {
        String strM38724 = m38724(interfaceC17889);
        synchronized (this) {
            if (strM38724.equals(this.f50538)) {
                Object objMo36970 = interfaceC17889.mo36970(R.id.MT_Protector);
                if (objMo36970 instanceof WeakReference) {
                    Object obj = ((WeakReference) objMo36970).get();
                    if (obj instanceof C14159) {
                        C14159 c14159 = (C14159) obj;
                        try {
                            c14159.m33789();
                        } catch (IllegalStateException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m38726(InterfaceC17889 interfaceC17889, String str) {
        synchronized (this) {
            if (str.equals(this.f50538)) {
                this.f50538 = null;
            }
            interfaceC17889.mo36975(R.id.MT_Protector, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13463 m38734(InterfaceC17889 interfaceC17889, String str) throws IOException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IOException("Network preview data source is not available");
        }
        C23713 c23713 = this.f50525;
        if (c23713 != null && c23713.m52289()) {
            return new C13463(new C6282(m38718(interfaceC17889)));
        }
        C14159 c14159M38705 = m38705(interfaceC17889, str, false);
        try {
            return new C13463(c14159M38705.m33787());
        } catch (RuntimeException e) {
            c14159M38705.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m38736(InterfaceC17889 interfaceC17889, String str) {
        C23713 c23713 = this.f50525;
        if (c23713 != null && c23713.m52289()) {
            return m38718(interfaceC17889);
        }
        return new C11348(m38705(interfaceC17889, str, false));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C4871 m38718(InterfaceC17889 interfaceC17889) throws IOException {
        C11881 c11881;
        C23713 c23713 = this.f50525;
        if (c23713 == null || !c23713.m52289() || interfaceC17889.getSize() < 0) {
            throw new IOException("Unified preview cache is not available");
        }
        String strM47725 = C20892.m47725(this.f50535, interfaceC17889, c23713.m52286());
        boolean z = false;
        boolean z2 = c23713.m52288() != null && c23713.m52288().m38148(strM47725, 0L, interfaceC17889.getSize());
        C14601 c14601 = new C14601(this);
        if (!z2 && this.f50532 == EnumC7114.RANGE_SUPPORTED) {
            z = true;
        }
        C17075 c17075 = new C17075(c23713, new C9315(c23713, c14601, new C7037(strM47725)), strM47725, z);
        C11197 c11197M41814 = this.f50533.m41814(interfaceC17889.getPath());
        Uri uri = (c11197M41814 == null || (c11881 = c11197M41814.f33612) == null) ? null : c11881.f35426;
        if (uri == null) {
            throw new IOException("Media URI is missing");
        }
        return new C4871(c17075, uri, strM47725, interfaceC17889.getSize());
    }
}
