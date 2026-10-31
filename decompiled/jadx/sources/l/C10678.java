package l;

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
public final class C10678 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f32125 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f32126;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f32127;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f32128;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final File f32129;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f32131;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f32132;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File f32133;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f32134;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10405 f32136;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f32138;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f32139;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32141;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f32142;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final File f32144;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int f32145;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public long f32137 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f32130 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public long f32140 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Runnable f32143 = new RunnableC5920(this);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC18166 f32135 = InterfaceC18166.f56475;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private synchronized void m26794() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f32131 && !this.f32141) {
            for (C7331 c7331 : (C7331[]) this.f32130.values().toArray(new C7331[this.f32130.size()])) {
                C13680 c13680 = c7331.f22522;
                if (c13680 != null) {
                    c13680.m32918();
                }
            }
            m26801();
            this.f32136.close();
            this.f32136 = null;
            this.f32141 = true;
            return;
        }
        this.f32141 = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f32131) {
            m26794();
            m26801();
            this.f32136.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.f32141;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m26799(C13680 c13680, boolean z) {
        C7331 c7331 = c13680.f40831;
        if (c7331.f22522 != c13680) {
            throw new IllegalStateException();
        }
        if (z && !c7331.f22523) {
            for (int i = 0; i < this.f32145; i++) {
                if (!c13680.f40833[i]) {
                    c13680.m32918();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f32135.mo39427(c7331.f22524[i])) {
                    c13680.m32918();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f32145; i2++) {
            File file = c7331.f22524[i2];
            if (!z) {
                this.f32135.mo39432(file);
            } else if (this.f32135.mo39427(file)) {
                File file2 = c7331.f22520[i2];
                this.f32135.mo39426(file, file2);
                long j = c7331.f22525[i2];
                long jMo39431 = this.f32135.mo39431(file2);
                c7331.f22525[i2] = jMo39431;
                this.f32137 = (this.f32137 - j) + jMo39431;
            }
        }
        this.f32139++;
        c7331.f22522 = null;
        if (c7331.f22523 || z) {
            c7331.f22523 = true;
            InterfaceC10405 interfaceC10405 = this.f32136;
            interfaceC10405.mo26251("CLEAN");
            interfaceC10405.writeByte(32);
            this.f32136.mo26251(c7331.f22526);
            InterfaceC10405 interfaceC10406 = this.f32136;
            for (long j2 : c7331.f22525) {
                interfaceC10406.writeByte(32);
                interfaceC10406.mo26249(j2);
            }
            this.f32136.writeByte(10);
            if (z) {
                long j3 = this.f32140;
                this.f32140 = 1 + j3;
                c7331.f22527 = j3;
            }
        } else {
            this.f32130.remove(c7331.f22526);
            InterfaceC10405 interfaceC10407 = this.f32136;
            interfaceC10407.mo26251("REMOVE");
            interfaceC10407.writeByte(32);
            this.f32136.mo26251(c7331.f22526);
            this.f32136.writeByte(10);
        }
        this.f32136.flush();
        if (this.f32137 > this.f32126 || m26802()) {
            this.f32127.execute(this.f32143);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C1505 m26800(String str) {
        m26797();
        m26794();
        m26792(str);
        C7331 c7331 = (C7331) this.f32130.get(str);
        if (c7331 != null && c7331.f22523) {
            C1505 c1505M19688 = c7331.m19688();
            if (c1505M19688 == null) {
                return null;
            }
            this.f32139++;
            InterfaceC10405 interfaceC10405 = this.f32136;
            interfaceC10405.mo26251("READ");
            interfaceC10405.writeByte(32);
            interfaceC10405.mo26251(str);
            interfaceC10405.writeByte(10);
            if (m26802()) {
                this.f32127.execute(this.f32143);
            }
            return c1505M19688;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26803() {
        InterfaceC10405 interfaceC10405 = this.f32136;
        if (interfaceC10405 != null) {
            interfaceC10405.close();
        }
        InterfaceC10405 interfaceC10405M52568 = C23852.m52568(this.f32135.mo39428(this.f32144));
        try {
            interfaceC10405M52568.mo26251("libcore.io.DiskLruCache");
            interfaceC10405M52568.writeByte(10);
            interfaceC10405M52568.mo26251("1");
            interfaceC10405M52568.writeByte(10);
            interfaceC10405M52568.mo26249(this.f32142);
            interfaceC10405M52568.writeByte(10);
            interfaceC10405M52568.mo26249(this.f32145);
            interfaceC10405M52568.writeByte(10);
            interfaceC10405M52568.writeByte(10);
            Iterator it = this.f32130.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7331 c7331 = (C7331) it.next();
                if (c7331.f22522 != null) {
                    interfaceC10405M52568.mo26251("DIRTY");
                    interfaceC10405M52568.writeByte(32);
                    interfaceC10405M52568.mo26251(c7331.f22526);
                    interfaceC10405M52568.writeByte(10);
                } else {
                    interfaceC10405M52568.mo26251("CLEAN");
                    interfaceC10405M52568.writeByte(32);
                    interfaceC10405M52568.mo26251(c7331.f22526);
                    for (long j : c7331.f22525) {
                        interfaceC10405M52568.writeByte(32);
                        interfaceC10405M52568.mo26249(j);
                    }
                    interfaceC10405M52568.writeByte(10);
                }
            }
            interfaceC10405M52568.close();
            if (this.f32135.mo39427(this.f32129)) {
                this.f32135.mo39426(this.f32129, this.f32133);
            }
            this.f32135.mo39426(this.f32144, this.f32129);
            this.f32135.mo39432(this.f32133);
            this.f32136 = C23852.m52568(new C11565(this, this.f32135.mo39429(this.f32129)));
            this.f32134 = false;
            this.f32132 = false;
        } catch (Throwable th) {
            interfaceC10405M52568.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26804(String str) {
        m26797();
        m26794();
        m26792(str);
        C7331 c7331 = (C7331) this.f32130.get(str);
        if (c7331 == null) {
            return;
        }
        m26798(c7331);
        if (this.f32137 <= this.f32126) {
            this.f32138 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m26797() {
        if (this.f32131) {
            return;
        }
        if (this.f32135.mo39427(this.f32133)) {
            if (this.f32135.mo39427(this.f32129)) {
                this.f32135.mo39432(this.f32133);
            } else {
                this.f32135.mo39426(this.f32133, this.f32129);
            }
        }
        if (this.f32135.mo39427(this.f32129)) {
            try {
                m26790();
                m26791();
                this.f32131 = true;
                return;
            } catch (IOException e) {
                C18872.m43580().mo43582(5, "DiskLruCache " + this.f32128 + " is corrupt: " + e.getMessage() + ", removing", e);
                try {
                    close();
                    this.f32135.mo39425(this.f32128);
                    this.f32141 = false;
                    m26803();
                    this.f32131 = true;
                } catch (Throwable th) {
                    this.f32141 = false;
                    throw th;
                }
            }
        }
        m26803();
        this.f32131 = true;
    }

    public C10678(File file, int i, int i2, long j, ThreadPoolExecutor threadPoolExecutor) {
        this.f32128 = file;
        this.f32142 = i;
        this.f32129 = new File(file, "journal");
        this.f32144 = new File(file, "journal.tmp");
        this.f32133 = new File(file, "journal.bkp");
        this.f32145 = i2;
        this.f32126 = j;
        this.f32127 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10678 m26789(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        return new C10678(file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C20032.m46177("OkHttp DiskLruCache", true)));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m26790() {
        InterfaceC18166 interfaceC18166 = this.f32135;
        File file = this.f32129;
        InterfaceC6171 interfaceC6171M52567 = C23852.m52567(interfaceC18166.mo39430(file));
        try {
            String strMo12300 = interfaceC6171M52567.mo12300();
            String strMo12301 = interfaceC6171M52567.mo12300();
            String strMo12302 = interfaceC6171M52567.mo12300();
            String strMo12303 = interfaceC6171M52567.mo12300();
            String strMo12304 = interfaceC6171M52567.mo12300();
            if (!"libcore.io.DiskLruCache".equals(strMo12300) || !"1".equals(strMo12301) || !Integer.toString(this.f32142).equals(strMo12302) || !Integer.toString(this.f32145).equals(strMo12303) || !"".equals(strMo12304)) {
                throw new IOException("unexpected journal header: [" + strMo12300 + ", " + strMo12301 + ", " + strMo12303 + ", " + strMo12304 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m26793(interfaceC6171M52567.mo12300());
                    i++;
                } catch (EOFException unused) {
                    this.f32139 = i - this.f32130.size();
                    if (!interfaceC6171M52567.mo12308()) {
                        m26803();
                    } else {
                        this.f32136 = C23852.m52568(new C11565(this, interfaceC18166.mo39429(file)));
                    }
                    C20032.m46179(interfaceC6171M52567);
                    return;
                }
            }
        } catch (Throwable th) {
            C20032.m46179(interfaceC6171M52567);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m26793(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f32130;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C7331 c7331 = (C7331) linkedHashMap.get(strSubstring);
        if (c7331 == null) {
            c7331 = new C7331(this, strSubstring);
            linkedHashMap.put(strSubstring, c7331);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c7331.f22523 = true;
            c7331.f22522 = null;
            if (strArrSplit.length != c7331.f22521.f32145) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                try {
                    c7331.f22525[i2] = Long.parseLong(strArrSplit[i2]);
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                }
            }
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c7331.f22522 = new C13680(this, c7331);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m26791() {
        File file = this.f32144;
        InterfaceC18166 interfaceC18166 = this.f32135;
        interfaceC18166.mo39432(file);
        Iterator it = this.f32130.values().iterator();
        while (it.hasNext()) {
            C7331 c7331 = (C7331) it.next();
            C13680 c13680 = c7331.f22522;
            int i = this.f32145;
            int i2 = 0;
            if (c13680 == null) {
                while (i2 < i) {
                    this.f32137 += c7331.f22525[i2];
                    i2++;
                }
            } else {
                c7331.f22522 = null;
                while (i2 < i) {
                    interfaceC18166.mo39432(c7331.f22520[i2]);
                    interfaceC18166.mo39432(c7331.f22524[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13680 m26796(String str) {
        return m26795(-1L, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C13680 m26795(long j, String str) {
        m26797();
        m26794();
        m26792(str);
        C7331 c7331 = (C7331) this.f32130.get(str);
        if (j != -1 && (c7331 == null || c7331.f22527 != j)) {
            return null;
        }
        if (c7331 != null && c7331.f22522 != null) {
            return null;
        }
        if (!this.f32138 && !this.f32132) {
            InterfaceC10405 interfaceC10405 = this.f32136;
            interfaceC10405.mo26251("DIRTY");
            interfaceC10405.writeByte(32);
            interfaceC10405.mo26251(str);
            interfaceC10405.writeByte(10);
            this.f32136.flush();
            if (this.f32134) {
                return null;
            }
            if (c7331 == null) {
                c7331 = new C7331(this, str);
                this.f32130.put(str, c7331);
            }
            C13680 c13680 = new C13680(this, c7331);
            c7331.f22522 = c13680;
            return c13680;
        }
        this.f32127.execute(this.f32143);
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26802() {
        int i = this.f32139;
        return i >= 2000 && i >= this.f32130.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26798(C7331 c7331) {
        C13680 c13680 = c7331.f22522;
        String str = c7331.f22526;
        if (c13680 != null) {
            c13680.m32920();
        }
        for (int i = 0; i < this.f32145; i++) {
            this.f32135.mo39432(c7331.f22520[i]);
            long j = this.f32137;
            long[] jArr = c7331.f22525;
            this.f32137 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f32139++;
        InterfaceC10405 interfaceC10405 = this.f32136;
        interfaceC10405.mo26251("REMOVE");
        interfaceC10405.writeByte(32);
        interfaceC10405.mo26251(str);
        interfaceC10405.writeByte(10);
        this.f32130.remove(str);
        if (m26802()) {
            this.f32127.execute(this.f32143);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m26801() {
        while (this.f32137 > this.f32126) {
            m26798((C7331) this.f32130.values().iterator().next());
        }
        this.f32138 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m26792(String str) {
        if (!f32125.matcher(str).matches()) {
            throw new IllegalArgumentException(C4860.m14172("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }
}
