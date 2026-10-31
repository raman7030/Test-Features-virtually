package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֨۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1143 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f4144;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2555 f4145;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12951 f4146;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f4147;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f4148;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4149;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f4150;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f4151;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0437[] f4152;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f4153 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f4154;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10130 f4155;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CRC32 f4156;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized C0437 m3916() {
        int i = this.f4149;
        if (i == 0) {
            return null;
        }
        C0437[] c0437Arr = this.f4152;
        int i2 = i - 1;
        this.f4149 = i2;
        C0437 c0437 = c0437Arr[i2];
        c0437Arr[i2] = null;
        return c0437;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m3923(C0437 c0437, boolean z) {
        try {
            if (z) {
                C0437[] c0437Arr = this.f4152;
                int i = this.f4149;
                this.f4149 = i + 1;
                c0437Arr[i] = c0437;
            } else {
                this.f4147--;
                c0437.f1929.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m3925(C21605 c21605) {
        while (true) {
            long jM8089 = this.f4145.m8089();
            if (jM8089 == 0) {
                break;
            } else {
                this.f4151 -= jM8089;
            }
        }
        while (m3918()) {
        }
        boolean z = false;
        loop2: while (true) {
            Iterator it = this.f4144.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop2;
                }
                C18783 c18783 = (C18783) it.next();
                if (c18783.f59298.f25202 != c21605 || (c18783.f59297 == 0 && !c18783.f59295)) {
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
        Iterator it2 = this.f4144.entrySet().iterator();
        while (it2.hasNext()) {
            C18783 c18784 = (C18783) ((Map.Entry) it2.next()).getValue();
            C8199 c8199 = c18784.f59298;
            if (c8199.f25202 == c21605) {
                if (c18784.f59297 != 0 || c18784.f59295) {
                    throw new IllegalStateException("Text pages are still leased");
                }
                this.f4151 -= c8199.f25201;
                c18784.f59296 = null;
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m3926(char[] cArr) {
        if (cArr.length == 0) {
            return;
        }
        if (!this.f4145.m8090(cArr)) {
            this.f4151 -= C2555.m8087(cArr.length);
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m3931() {
        return this.f4151;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0437 m3920() {
        synchronized (this) {
            C0437 c0437M3916 = m3916();
            if (c0437M3916 != null) {
                return c0437M3916;
            }
            int i = this.f4147;
            if (i == this.f4152.length) {
                return null;
            }
            this.f4147 = i + 1;
            try {
                try {
                    C5377 c5377M3921 = m3921(16384L);
                    try {
                        return new C0437(c5377M3921, this.f4154.length);
                    } catch (Error | RuntimeException e) {
                        c5377M3921.close();
                        throw e;
                    }
                } catch (UncheckedIOException | C3966 unused) {
                    synchronized (this) {
                        this.f4147--;
                        return null;
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f4147--;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m3918() {
        int i = this.f4149;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f4149 = i2;
        C0437[] c0437Arr = this.f4152;
        C0437 c0437 = c0437Arr[i2];
        c0437Arr[i2] = null;
        this.f4147--;
        c0437.f1929.close();
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m3929() {
        if (!Thread.holdsLock(this.f4153)) {
            throw new IllegalStateException("Recovery I/O lock is not held");
        }
        return this.f4154;
    }

    public C1143(long j) {
        C10130 c10130 = new C10130(8240);
        this.f4155 = c10130;
        byte[] bArrM25438 = c10130.m25438();
        this.f4154 = bArrM25438;
        this.f4146 = new C12951(bArrM25438);
        this.f4156 = new CRC32();
        this.f4152 = new C0437[4];
        this.f4144 = new LinkedHashMap(16, 0.75f, true);
        this.f4151 = 16384L;
        this.f4148 = 16384L;
        if (j < X931RNG.BLOCK64_RESEED_MAX) {
            throw new IllegalArgumentException("Page cache budget is too small");
        }
        this.f4150 = j;
        this.f4145 = new C2555(j / 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m3930() {
        return this.f4150;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m3927(int i) {
        int i2;
        C5377 c5377M3921;
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
            return C2555.f8087;
        }
        synchronized (this) {
            char[] cArrM8091 = this.f4145.m8091(i2);
            if (cArrM8091 != null) {
                return cArrM8091;
            }
            long jM8087 = C2555.m8087(i2);
            long j = this.f4150;
            long j2 = this.f4151;
            if (jM8087 <= j - j2) {
                c5377M3921 = new C5377(this, jM8087);
                long j3 = j2 + jM8087;
                this.f4151 = j3;
                this.f4148 = Math.max(this.f4148, j3);
            } else {
                c5377M3921 = null;
            }
            if (c5377M3921 == null) {
                c5377M3921 = m3921(C2555.m8087(i));
            } else {
                i = i2;
            }
            try {
                char[] cArr = new char[i];
                synchronized (this) {
                    c5377M3921.f16730 = false;
                }
                c5377M3921.close();
                return cArr;
            } catch (Throwable th) {
                c5377M3921.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r0 = r8.f59298;
        r0.f25202.m48801(r0, r8.f59296);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        r13.f4144.remove(r8.f59298);
        r13.f4151 -= r8.f59298.f25201;
        r8.f59296 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        r8.f59295 = false;
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
    
        r5.add(r8.f59298);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r8.f59295 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
    
        r8.f59295 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0107, code lost:
    
        throw r14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5377 m3921(long j) {
        C18783 c18783;
        if (j < 0 || j > this.f4150 - 16384) {
            throw new C3966();
        }
        HashSet hashSet = null;
        IOException iOException = null;
        int size = -1;
        while (true) {
            synchronized (this) {
                long j2 = this.f4150;
                long j3 = this.f4151;
                if (j <= j2 - j3) {
                    long j4 = j3 + j;
                    this.f4151 = j4;
                    this.f4148 = Math.max(this.f4148, j4);
                    return new C5377(this, j);
                }
                long jM8089 = this.f4145.m8089();
                if (jM8089 != 0) {
                    this.f4151 -= jM8089;
                } else if (!m3918()) {
                    if (size < 0) {
                        size = this.f4144.size();
                    }
                    Iterator it = this.f4144.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c18783 = null;
                            break;
                        }
                        c18783 = (C18783) it.next();
                        if (size > 0 && c18783.f59297 == 0 && !c18783.f59295 && (hashSet == null || !hashSet.contains(c18783.f59298))) {
                            size--;
                            break;
                        }
                    }
                    if (c18783 == null) {
                        if (iOException != null) {
                            throw new UncheckedIOException(iOException);
                        }
                        throw new C3966();
                    }
                    if (c18783.f59298.f25208 >= 0) {
                        this.f4144.remove(c18783.f59298);
                        this.f4151 -= c18783.f59298.f25201;
                        c18783.f59296 = null;
                    } else {
                        c18783.f59295 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3924(C8199 c8199, C11002 c11002, C5377 c5377) {
        synchronized (this) {
            if (c5377.f16729 != this || !c5377.f16730 || c5377.f16731 != c8199.f25201 || c11002.m27312() != c8199.f25201 || this.f4144.containsKey(c8199)) {
                throw new IllegalStateException("Invalid page reservation transfer");
            }
            this.f4144.put(c8199, new C18783(c8199, c11002));
            c5377.f16730 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19489 m3922(C8199 c8199) {
        c8199.f25202.m48811();
        try {
            return m3919(c8199);
        } catch (Throwable th) {
            c8199.f25202.m48812();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C19489 m3919(C8199 c8199) {
        synchronized (c8199) {
            while (true) {
                synchronized (this) {
                    C18783 c18783 = (C18783) this.f4144.get(c8199);
                    if (c18783 != null && !c18783.f59295) {
                        c18783.f59297++;
                        return new C19489(this, c18783);
                    }
                    if (c18783 != null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Interrupted while loading text page", e);
                        }
                    } else {
                        return m3917(c8199);
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    /* JADX WARN: Code duplicated, block: B:60:0x0086  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C19489 m3917(C8199 c8199) throws Throwable {
        C5377 c5377M3921;
        C0437 c0437;
        boolean z;
        C0437 c0437M3916 = m3916();
        try {
            try {
                try {
                    c5377M3921 = m3921(c8199.f25201);
                } catch (Throwable th) {
                    th = th;
                    c0437 = c0437M3916;
                    z = false;
                    if (c0437 != null) {
                        m3923(c0437, z);
                    }
                    throw th;
                }
            } catch (UncheckedIOException | C3966 e) {
                if (c0437M3916 == null) {
                    throw e;
                }
                m3923(c0437M3916, false);
                c0437M3916 = null;
                c5377M3921 = m3921(c8199.f25201);
            }
            if (c0437M3916 == null) {
                try {
                    c0437M3916 = m3920();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c5377M3921.close();
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
            c0437 = c0437M3916;
            try {
                C11002 c11002M48798 = c8199.f25202.m48798(c8199, c0437);
                synchronized (this) {
                    try {
                        m3924(c8199, c11002M48798, c5377M3921);
                        C18783 c18783 = (C18783) this.f4144.get(c8199);
                        c18783.f59297++;
                        try {
                            C19489 c19489 = new C19489(this, c18783);
                            try {
                                c5377M3921.close();
                                if (c0437 != null) {
                                    m3923(c0437, true);
                                }
                                return c19489;
                            } catch (IOException e3) {
                                e = e3;
                                throw new UncheckedIOException(e);
                            } catch (Throwable th4) {
                                th = th4;
                                z = true;
                                if (c0437 != null) {
                                    m3923(c0437, z);
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
                                    c5377M3921.close();
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
            c0437 = c0437M3916;
            z = false;
            if (c0437 != null) {
                m3923(c0437, z);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3928(C8199 c8199) {
        if (c8199.f25202.f69370 != this) {
            throw new IllegalArgumentException("Page belongs to another cache");
        }
        if (c8199.f25208 < 0) {
            try {
                C19489 c19489M3922 = m3922(c8199);
                try {
                    c8199.f25202.m48801(c8199, c19489M3922.m44896());
                    c19489M3922.close();
                } catch (Throwable th) {
                    try {
                        c19489M3922.close();
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
            C18783 c18783 = (C18783) this.f4144.get(c8199);
            if (c18783 != null && c18783.f59297 == 0 && !c18783.f59295) {
                this.f4144.remove(c8199);
                this.f4151 -= c8199.f25201;
                c18783.f59296 = null;
            }
        }
    }
}
