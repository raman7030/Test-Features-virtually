package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֨۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3455 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f6913;

    /* JADX INFO: renamed from: ۖ */
    public final C4797 f6914;

    /* JADX INFO: renamed from: ۜ */
    public final C14677 f6915;

    /* JADX INFO: renamed from: ۡ */
    public int f6916;

    /* JADX INFO: renamed from: ۢ */
    public long f6917;

    /* JADX INFO: renamed from: ۧ */
    public int f6918;

    /* JADX INFO: renamed from: ܳ */
    public final long f6919;

    /* JADX INFO: renamed from: ܺ */
    public long f6920;

    /* JADX INFO: renamed from: ܽ */
    public final C2784[] f6921;

    /* JADX INFO: renamed from: ܿ */
    public final Object f6922 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f6923;

    /* JADX INFO: renamed from: ᩷ */
    public final C11996 f6924;

    /* JADX INFO: renamed from: ᩻ */
    public final CRC32 f6925;

    /* JADX INFO: renamed from: ܳ */
    private synchronized C2784 m6157() {
        int i = this.f6918;
        if (i == 0) {
            return null;
        }
        C2784[] c2784Arr = this.f6921;
        int i2 = i - 1;
        this.f6918 = i2;
        C2784 c2784 = c2784Arr[i2];
        c2784Arr[i2] = null;
        return c2784;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m6164(C2784 c2784, boolean z) {
        try {
            if (z) {
                C2784[] c2784Arr = this.f6921;
                int i = this.f6918;
                this.f6918 = i + 1;
                c2784Arr[i] = c2784;
            } else {
                this.f6916--;
                c2784.f4705.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m6166(C22902 c22902) {
        while (true) {
            long jM10121 = this.f6914.m10121();
            if (jM10121 == 0) {
                break;
            } else {
                this.f6920 -= jM10121;
            }
        }
        while (m6159()) {
        }
        boolean z = false;
        loop2: while (true) {
            Iterator it = this.f6913.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop2;
                }
                C20220 c20220 = (C20220) it.next();
                if (c20220.f62519.f28112 != c22902 || (c20220.f62518 == 0 && !c20220.f62516)) {
                }
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        Iterator it2 = this.f6913.entrySet().iterator();
        while (it2.hasNext()) {
            C20220 c20221 = (C20220) ((Map.Entry) it2.next()).getValue();
            C10161 c10161 = c20221.f62519;
            if (c10161.f28112 == c22902) {
                if (c20221.f62518 != 0 || c20221.f62516) {
                    throw new IllegalStateException("Text pages are still leased");
                }
                this.f6920 -= c10161.f28111;
                c20221.f62517 = null;
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m6167(char[] cArr) {
        if (cArr.length == 0) {
            return;
        }
        if (!this.f6914.m10122(cArr)) {
            this.f6920 -= C4797.m10119(cArr.length);
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized long m6172() {
        return this.f6920;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2784 m6161() {
        synchronized (this) {
            C2784 c2784M6157 = m6157();
            if (c2784M6157 != null) {
                return c2784M6157;
            }
            int i = this.f6916;
            if (i == this.f6921.length) {
                return null;
            }
            this.f6916 = i + 1;
            try {
                try {
                    C7479 c7479M6162 = m6162(16384L);
                    try {
                        return new C2784(c7479M6162, this.f6923.length);
                    } catch (Error | RuntimeException e) {
                        c7479M6162.close();
                        throw e;
                    }
                } catch (UncheckedIOException | C6138 unused) {
                    synchronized (this) {
                        this.f6916--;
                        return null;
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f6916--;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m6159() {
        int i = this.f6918;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f6918 = i2;
        C2784[] c2784Arr = this.f6921;
        C2784 c2784 = c2784Arr[i2];
        c2784Arr[i2] = null;
        this.f6916--;
        c2784.f4705.close();
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m6170() {
        if (!Thread.holdsLock(this.f6922)) {
            throw new IllegalStateException("Recovery I/O lock is not held");
        }
        return this.f6923;
    }

    public C3455(long j) {
        C11996 c11996 = new C11996(8240);
        this.f6924 = c11996;
        byte[] bArrM27458 = c11996.m27458();
        this.f6923 = bArrM27458;
        this.f6915 = new C14677(bArrM27458);
        this.f6925 = new CRC32();
        this.f6921 = new C2784[4];
        this.f6913 = new LinkedHashMap(16, 0.75f, true);
        this.f6920 = 16384L;
        this.f6917 = 16384L;
        if (j < X931RNG.BLOCK64_RESEED_MAX) {
            throw new IllegalArgumentException("Page cache budget is too small");
        }
        this.f6919 = j;
        this.f6914 = new C4797(j / 8);
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m6171() {
        return this.f6919;
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m6168(int i) {
        int i2;
        C7479 c7479M6162;
        if (i < 0) {
            throw new IllegalArgumentException("Negative workspace length");
        }
        if (i == 0 || i > 8192) {
            i2 = i;
        } else {
            int i3 = 16;
            while (i3 < i) {
                i3 <<= 1;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            return C4797.f10877;
        }
        synchronized (this) {
            char[] cArrM10123 = this.f6914.m10123(i2);
            if (cArrM10123 != null) {
                return cArrM10123;
            }
            long jM10119 = C4797.m10119(i2);
            long j = this.f6919;
            long j2 = this.f6920;
            if (jM10119 <= j - j2) {
                c7479M6162 = new C7479(this, jM10119);
                long j3 = j2 + jM10119;
                this.f6920 = j3;
                this.f6917 = Math.max(this.f6917, j3);
            } else {
                c7479M6162 = null;
            }
            if (c7479M6162 == null) {
                c7479M6162 = m6162(C4797.m10119(i));
            } else {
                i = i2;
            }
            try {
                char[] cArr = new char[i];
                synchronized (this) {
                    c7479M6162.f19568 = false;
                }
                c7479M6162.close();
                return cArr;
            } catch (Throwable th) {
                c7479M6162.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r0 = r8.f62519;
        r0.f28112.m51148(r0, r8.f62517);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        r13.f6913.remove(r8.f62519);
        r13.f6920 -= r8.f62519.f28111;
        r8.f62517 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        r8.f62516 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e5, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e6, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e8, code lost:
    
        r5 = new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
    
        r5.add(r8.f62519);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r8.f62516 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
    
        r8.f62516 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0107, code lost:
    
        throw r14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7479 m6162(long j) {
        C20220 c20220;
        if (j < 0 || j > this.f6919 - 16384) {
            throw new C6138();
        }
        HashSet hashSet = null;
        IOException iOException = null;
        int size = -1;
        while (true) {
            synchronized (this) {
                long j2 = this.f6919;
                long j3 = this.f6920;
                if (j <= j2 - j3) {
                    long j4 = j3 + j;
                    this.f6920 = j4;
                    this.f6917 = Math.max(this.f6917, j4);
                    return new C7479(this, j);
                }
                long jM10121 = this.f6914.m10121();
                if (jM10121 != 0) {
                    this.f6920 -= jM10121;
                } else if (!m6159()) {
                    if (size < 0) {
                        size = this.f6913.size();
                    }
                    Iterator it = this.f6913.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c20220 = null;
                            break;
                        }
                        c20220 = (C20220) it.next();
                        if (size > 0 && c20220.f62518 == 0 && !c20220.f62516 && (hashSet == null || !hashSet.contains(c20220.f62519))) {
                            size--;
                            break;
                        }
                    }
                    if (c20220 == null) {
                        if (iOException != null) {
                            throw new UncheckedIOException(iOException);
                        }
                        throw new C6138();
                    }
                    if (c20220.f62519.f28118 >= 0) {
                        this.f6913.remove(c20220.f62519);
                        this.f6920 -= c20220.f62519.f28111;
                        c20220.f62517 = null;
                    } else {
                        c20220.f62516 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6165(C10161 c10161, C12825 c12825, C7479 c7479) {
        synchronized (this) {
            if (c7479.f19567 != this || !c7479.f19568 || c7479.f19569 != c10161.f28111 || c12825.m29374() != c10161.f28111 || this.f6913.containsKey(c10161)) {
                throw new IllegalStateException("Invalid page reservation transfer");
            }
            this.f6913.put(c10161, new C20220(c10161, c12825));
            c7479.f19568 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20891 m6163(C10161 c10161) {
        c10161.f28112.m51158();
        try {
            return m6160(c10161);
        } catch (Throwable th) {
            c10161.f28112.m51159();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C20891 m6160(C10161 c10161) {
        synchronized (c10161) {
            while (true) {
                synchronized (this) {
                    C20220 c20220 = (C20220) this.f6913.get(c10161);
                    if (c20220 != null && !c20220.f62516) {
                        c20220.f62518++;
                        return new C20891(this, c20220);
                    }
                    if (c20220 != null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Interrupted while loading text page", e);
                        }
                    } else {
                        return m6158(c10161);
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    /* JADX WARN: Code duplicated, block: B:60:0x0086  */
    /* JADX INFO: renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C20891 m6158(C10161 c10161) throws Throwable {
        C7479 c7479M6162;
        C2784 c2784;
        boolean z;
        C2784 c2784M6157 = m6157();
        try {
            try {
                try {
                    c7479M6162 = m6162(c10161.f28111);
                } catch (Throwable th) {
                    th = th;
                    c2784 = c2784M6157;
                    z = false;
                    if (c2784 != null) {
                        m6164(c2784, z);
                    }
                    throw th;
                }
            } catch (UncheckedIOException | C6138 e) {
                if (c2784M6157 == null) {
                    throw e;
                }
                m6164(c2784M6157, false);
                c2784M6157 = null;
                c7479M6162 = m6162(c10161.f28111);
            }
            if (c2784M6157 == null) {
                try {
                    c2784M6157 = m6161();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c7479M6162.close();
                    } catch (Throwable th3) {
                        try {
                            th.addSuppressed(th3);
                        } catch (IOException e2) {
                            e = e2;
                            throw new UncheckedIOException(e);
                        }
                    }
                    throw th;
                }
            }
            c2784 = c2784M6157;
            try {
                C12825 c12825M51145 = c10161.f28112.m51145(c10161, c2784);
                synchronized (this) {
                    try {
                        m6165(c10161, c12825M51145, c7479M6162);
                        C20220 c20220 = (C20220) this.f6913.get(c10161);
                        c20220.f62518++;
                        try {
                            C20891 c20891 = new C20891(this, c20220);
                            try {
                                c7479M6162.close();
                                if (c2784 != null) {
                                    m6164(c2784, true);
                                }
                                return c20891;
                            } catch (IOException e3) {
                                e = e3;
                                throw new UncheckedIOException(e);
                            } catch (Throwable th4) {
                                th = th4;
                                z = true;
                                if (c2784 != null) {
                                    m6164(c2784, z);
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th6) {
                                    th = th6;
                                    c7479M6162.close();
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (IOException e4) {
            e = e4;
            throw new UncheckedIOException(e);
        } catch (Throwable th9) {
            th = th9;
            c2784 = c2784M6157;
            z = false;
            if (c2784 != null) {
                m6164(c2784, z);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6169(C10161 c10161) {
        if (c10161.f28112.f72073 != this) {
            throw new IllegalArgumentException("Page belongs to another cache");
        }
        if (c10161.f28118 < 0) {
            try {
                C20891 c20891M6163 = m6163(c10161);
                try {
                    c10161.f28112.m51148(c10161, c20891M6163.m47193());
                    c20891M6163.close();
                } catch (Throwable th) {
                    try {
                        c20891M6163.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        synchronized (this) {
            C20220 c20220 = (C20220) this.f6913.get(c10161);
            if (c20220 != null && c20220.f62518 == 0 && !c20220.f62516) {
                this.f6913.remove(c10161);
                this.f6920 -= c10161.f28111;
                c20220.f62517 = null;
            }
        }
    }
}
