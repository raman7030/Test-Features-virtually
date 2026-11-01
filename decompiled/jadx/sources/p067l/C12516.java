package p067l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۧ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12516 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۜ֫ */
    public static final Pattern f35096 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: ֫֫ */
    public long f35097;

    /* JADX INFO: renamed from: ۗ */
    public final ThreadPoolExecutor f35098;

    /* JADX INFO: renamed from: ۙ */
    public final File f35099;

    /* JADX INFO: renamed from: ۛ */
    public final File f35100;

    /* JADX INFO: renamed from: ۤ */
    public boolean f35102;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f35103;

    /* JADX INFO: renamed from: ۨ */
    public final File f35104;

    /* JADX INFO: renamed from: ۫ */
    public boolean f35105;

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC12257 f35107;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f35109;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f35110;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f35112;

    /* JADX INFO: renamed from: ᩸ */
    public final int f35113;

    /* JADX INFO: renamed from: ᩺ */
    public final File f35115;

    /* JADX INFO: renamed from: ᩻֫ */
    public final int f35116;

    /* JADX INFO: renamed from: ܳ֫ */
    public long f35108 = 0;

    /* JADX INFO: renamed from: ۟ */
    public final LinkedHashMap f35101 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ᩳ֫ */
    public long f35111 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final Runnable f35114 = new RunnableC7995(this);

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC19633 f35106 = InterfaceC19633.f59689;

    /* JADX INFO: renamed from: ᩻ */
    private synchronized void m28833() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f35102 && !this.f35112) {
            for (C9336 c9336 : (C9336[]) this.f35101.values().toArray(new C9336[this.f35101.size()])) {
                C15370 c15370 = c9336.f25435;
                if (c15370 != null) {
                    c15370.m35033();
                }
            }
            m28840();
            this.f35107.close();
            this.f35107 = null;
            this.f35112 = true;
            return;
        }
        this.f35112 = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f35102) {
            m28833();
            m28840();
            this.f35107.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.f35112;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m28838(C15370 c15370, boolean z) {
        C9336 c9336 = c15370.f43913;
        if (c9336.f25435 != c15370) {
            throw new IllegalStateException();
        }
        if (z && !c9336.f25436) {
            for (int i = 0; i < this.f35116; i++) {
                if (!c15370.f43915[i]) {
                    c15370.m35033();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f35106.mo41663(c9336.f25437[i])) {
                    c15370.m35033();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f35116; i2++) {
            File file = c9336.f25437[i2];
            if (!z) {
                this.f35106.mo41668(file);
            } else if (this.f35106.mo41663(file)) {
                File file2 = c9336.f25433[i2];
                this.f35106.mo41662(file, file2);
                long j = c9336.f25438[i2];
                long jMo41667 = this.f35106.mo41667(file2);
                c9336.f25438[i2] = jMo41667;
                this.f35108 = (this.f35108 - j) + jMo41667;
            }
        }
        this.f35110++;
        c9336.f25435 = null;
        if (c9336.f25436 || z) {
            c9336.f25436 = true;
            InterfaceC12257 interfaceC12257 = this.f35107;
            interfaceC12257.mo28280("CLEAN");
            interfaceC12257.writeByte(32);
            this.f35107.mo28280(c9336.f25439);
            InterfaceC12257 interfaceC12258 = this.f35107;
            for (long j2 : c9336.f25438) {
                interfaceC12258.writeByte(32);
                interfaceC12258.mo28278(j2);
            }
            this.f35107.writeByte(10);
            if (z) {
                long j3 = this.f35111;
                this.f35111 = 1 + j3;
                c9336.f25440 = j3;
            }
        } else {
            this.f35101.remove(c9336.f25439);
            InterfaceC12257 interfaceC12259 = this.f35107;
            interfaceC12259.mo28280("REMOVE");
            interfaceC12259.writeByte(32);
            this.f35107.mo28280(c9336.f25439);
            this.f35107.writeByte(10);
        }
        this.f35107.flush();
        if (this.f35108 > this.f35097 || m28841()) {
            this.f35098.execute(this.f35114);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C3798 m28839(String str) {
        m28836();
        m28833();
        m28831(str);
        C9336 c9336 = (C9336) this.f35101.get(str);
        if (c9336 != null && c9336.f25436) {
            C3798 c3798M21661 = c9336.m21661();
            if (c3798M21661 == null) {
                return null;
            }
            this.f35110++;
            InterfaceC12257 interfaceC12257 = this.f35107;
            interfaceC12257.mo28280("READ");
            interfaceC12257.writeByte(32);
            interfaceC12257.mo28280(str);
            interfaceC12257.writeByte(10);
            if (m28841()) {
                this.f35098.execute(this.f35114);
            }
            return c3798M21661;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m28842() {
        InterfaceC12257 interfaceC12257 = this.f35107;
        if (interfaceC12257 != null) {
            interfaceC12257.close();
        }
        InterfaceC12257 interfaceC12257M54977 = C25037.m54977(this.f35106.mo41664(this.f35115));
        try {
            interfaceC12257M54977.mo28280("libcore.io.DiskLruCache");
            interfaceC12257M54977.writeByte(10);
            interfaceC12257M54977.mo28280("1");
            interfaceC12257M54977.writeByte(10);
            interfaceC12257M54977.mo28278(this.f35113);
            interfaceC12257M54977.writeByte(10);
            interfaceC12257M54977.mo28278(this.f35116);
            interfaceC12257M54977.writeByte(10);
            interfaceC12257M54977.writeByte(10);
            Iterator it = this.f35101.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9336 c9336 = (C9336) it.next();
                if (c9336.f25435 != null) {
                    interfaceC12257M54977.mo28280("DIRTY");
                    interfaceC12257M54977.writeByte(32);
                    interfaceC12257M54977.mo28280(c9336.f25439);
                    interfaceC12257M54977.writeByte(10);
                } else {
                    interfaceC12257M54977.mo28280("CLEAN");
                    interfaceC12257M54977.writeByte(32);
                    interfaceC12257M54977.mo28280(c9336.f25439);
                    for (long j : c9336.f25438) {
                        interfaceC12257M54977.writeByte(32);
                        interfaceC12257M54977.mo28278(j);
                    }
                    interfaceC12257M54977.writeByte(10);
                }
            }
            interfaceC12257M54977.close();
            if (this.f35106.mo41663(this.f35100)) {
                this.f35106.mo41662(this.f35100, this.f35104);
            }
            this.f35106.mo41662(this.f35115, this.f35100);
            this.f35106.mo41668(this.f35104);
            this.f35107 = C25037.m54977(new C13360(this, this.f35106.mo41665(this.f35100)));
            this.f35105 = false;
            this.f35103 = false;
        } catch (Throwable th) {
            interfaceC12257M54977.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m28843(String str) {
        m28836();
        m28833();
        m28831(str);
        C9336 c9336 = (C9336) this.f35101.get(str);
        if (c9336 == null) {
            return;
        }
        m28837(c9336);
        if (this.f35108 <= this.f35097) {
            this.f35109 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m28836() {
        if (this.f35102) {
            return;
        }
        if (this.f35106.mo41663(this.f35104)) {
            if (this.f35106.mo41663(this.f35100)) {
                this.f35106.mo41668(this.f35104);
            } else {
                this.f35106.mo41662(this.f35104, this.f35100);
            }
        }
        if (this.f35106.mo41663(this.f35100)) {
            try {
                m28829();
                m28830();
                this.f35102 = true;
                return;
            } catch (IOException e) {
                C20304.m45846().mo45848(5, "DiskLruCache " + this.f35099 + " is corrupt: " + e.getMessage() + ", removing", e);
                try {
                    close();
                    this.f35106.mo41661(this.f35099);
                    this.f35112 = false;
                    m28842();
                    this.f35102 = true;
                } catch (Throwable th) {
                    this.f35112 = false;
                    throw th;
                }
            }
        }
        m28842();
        this.f35102 = true;
    }

    public C12516(File file, int i, int i2, long j, ThreadPoolExecutor threadPoolExecutor) {
        this.f35099 = file;
        this.f35113 = i;
        this.f35100 = new File(file, "journal");
        this.f35115 = new File(file, "journal.tmp");
        this.f35104 = new File(file, "journal.bkp");
        this.f35116 = i2;
        this.f35097 = j;
        this.f35098 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12516 m28828(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        return new C12516(file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C21407.m48493("OkHttp DiskLruCache", true)));
    }

    /* JADX INFO: renamed from: ۖ */
    private void m28829() {
        InterfaceC19633 interfaceC19633 = this.f35106;
        File file = this.f35100;
        InterfaceC8233 interfaceC8233M54976 = C25037.m54976(interfaceC19633.mo41666(file));
        try {
            String strMo14205 = interfaceC8233M54976.mo14205();
            String strMo14206 = interfaceC8233M54976.mo14205();
            String strMo14207 = interfaceC8233M54976.mo14205();
            String strMo14208 = interfaceC8233M54976.mo14205();
            String strMo14209 = interfaceC8233M54976.mo14205();
            if (!"libcore.io.DiskLruCache".equals(strMo14205) || !"1".equals(strMo14206) || !Integer.toString(this.f35113).equals(strMo14207) || !Integer.toString(this.f35116).equals(strMo14208) || !"".equals(strMo14209)) {
                throw new IOException("unexpected journal header: [" + strMo14205 + ", " + strMo14206 + ", " + strMo14208 + ", " + strMo14209 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m28832(interfaceC8233M54976.mo14205());
                    i++;
                } catch (EOFException unused) {
                    this.f35110 = i - this.f35101.size();
                    if (!interfaceC8233M54976.mo14213()) {
                        m28842();
                    } else {
                        this.f35107 = C25037.m54977(new C13360(this, interfaceC19633.mo41665(file)));
                    }
                    C21407.m48495(interfaceC8233M54976);
                    return;
                }
            }
        } catch (Throwable th) {
            C21407.m48495(interfaceC8233M54976);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m28832(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f35101;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C9336 c9336 = (C9336) linkedHashMap.get(strSubstring);
        if (c9336 == null) {
            c9336 = new C9336(this, strSubstring);
            linkedHashMap.put(strSubstring, c9336);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c9336.f25436 = true;
            c9336.f25435 = null;
            if (strArrSplit.length != c9336.f25434.f35116) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                try {
                    c9336.f25438[i2] = Long.parseLong(strArrSplit[i2]);
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                }
            }
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c9336.f25435 = new C15370(this, c9336);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m28830() {
        File file = this.f35115;
        InterfaceC19633 interfaceC19633 = this.f35106;
        interfaceC19633.mo41668(file);
        Iterator it = this.f35101.values().iterator();
        while (it.hasNext()) {
            C9336 c9336 = (C9336) it.next();
            C15370 c15370 = c9336.f25435;
            int i = this.f35116;
            int i2 = 0;
            if (c15370 == null) {
                while (i2 < i) {
                    this.f35108 += c9336.f25438[i2];
                    i2++;
                }
            } else {
                c9336.f25435 = null;
                while (i2 < i) {
                    interfaceC19633.mo41668(c9336.f25433[i2]);
                    interfaceC19633.mo41668(c9336.f25437[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15370 m28835(String str) {
        return m28834(-1L, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C15370 m28834(long j, String str) {
        m28836();
        m28833();
        m28831(str);
        C9336 c9336 = (C9336) this.f35101.get(str);
        if (j != -1 && (c9336 == null || c9336.f25440 != j)) {
            return null;
        }
        if (c9336 != null && c9336.f25435 != null) {
            return null;
        }
        if (!this.f35109 && !this.f35103) {
            InterfaceC12257 interfaceC12257 = this.f35107;
            interfaceC12257.mo28280("DIRTY");
            interfaceC12257.writeByte(32);
            interfaceC12257.mo28280(str);
            interfaceC12257.writeByte(10);
            this.f35107.flush();
            if (this.f35105) {
                return null;
            }
            if (c9336 == null) {
                c9336 = new C9336(this, str);
                this.f35101.put(str, c9336);
            }
            C15370 c15370 = new C15370(this, c9336);
            c9336.f25435 = c15370;
            return c15370;
        }
        this.f35098.execute(this.f35114);
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m28841() {
        int i = this.f35110;
        return i >= 2000 && i >= this.f35101.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28837(C9336 c9336) {
        C15370 c15370 = c9336.f25435;
        String str = c9336.f25439;
        if (c15370 != null) {
            c15370.m35035();
        }
        for (int i = 0; i < this.f35116; i++) {
            this.f35106.mo41668(c9336.f25433[i]);
            long j = this.f35108;
            long[] jArr = c9336.f25438;
            this.f35108 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f35110++;
        InterfaceC12257 interfaceC12257 = this.f35107;
        interfaceC12257.mo28280("REMOVE");
        interfaceC12257.writeByte(32);
        interfaceC12257.mo28280(str);
        interfaceC12257.writeByte(10);
        this.f35101.remove(str);
        if (m28841()) {
            this.f35098.execute(this.f35114);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m28840() {
        while (this.f35108 > this.f35097) {
            m28837((C9336) this.f35101.values().iterator().next());
        }
        this.f35109 = false;
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m28831(String str) {
        if (!f35096.matcher(str).matches()) {
            throw new IllegalArgumentException(C6988.m16053("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }
}
