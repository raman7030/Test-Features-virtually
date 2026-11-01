package p067l;

import com.umeng.analytics.pro.C0719o;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.۬ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69ZM */
/* JADX INFO: loaded from: classes4.dex */
public class C14642 extends URLConnection implements InterfaceC12059 {

    /* JADX INFO: renamed from: ܰ */
    public static InterfaceC4410 f41792 = C13128.m30022(C14642.class);

    /* JADX INFO: renamed from: ᩺ */
    public static final /* synthetic */ int f41793 = 0;

    /* JADX INFO: renamed from: ۗ */
    public long f41794;

    /* JADX INFO: renamed from: ۙ */
    public boolean f41795;

    /* JADX INFO: renamed from: ۛ */
    public C4466 f41796;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC20106 f41797;

    /* JADX INFO: renamed from: ۨ */
    public C5807 f41798;

    /* JADX INFO: renamed from: ۫ */
    public long f41799;

    /* JADX INFO: renamed from: ۬ */
    public long f41800;

    /* JADX INFO: renamed from: ᩶ */
    public final C19218 f41801;

    /* JADX INFO: renamed from: ᩸ */
    public long f41802;

    /* JADX INFO: renamed from: ᩹ */
    public int f41803;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f41798 != null) {
            this.f41798 = null;
            this.f41797.mo29602().getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30370(C8568 c8568, C21980 c21980) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized C5807 m33461() {
        C5807 c5807 = this.f41798;
        if (c5807 != null && c5807.m13071()) {
            C5807 c5808 = this.f41798;
            c5808.m13064();
            return c5808;
        }
        if (this.f41798 != null) {
            this.f41797.mo29602().getClass();
        }
        C5807 c5807M9418 = this.f41796.m9418(this.f41801);
        this.f41798 = c5807M9418;
        c5807M9418.m13073();
        this.f41797.mo29602().getClass();
        return this.f41798;
    }

    public C14642(C14642 c14642, String str) throws MalformedURLException {
        URL url;
        if (m33446(c14642)) {
            m33445(str);
            url = new URL((URL) null, "smb://".concat(str), c14642.f41797.mo29599());
        } else {
            URL urlM43768 = c14642.f41801.m43768();
            m33445(str);
            url = new URL(urlM43768, str, c14642.f41797.mo29599());
        }
        this(url, c14642.f41797);
        m33444(c14642, str);
    }

    public C14642(String str, InterfaceC20106 interfaceC20106) {
        this(new URL((URL) null, str, interfaceC20106.mo29599()), interfaceC20106);
    }

    public C14642(URL url, InterfaceC20106 interfaceC20106) throws MalformedURLException {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: " + url);
        }
        this.f41797 = interfaceC20106;
        this.f41801 = new C19218(url, interfaceC20106);
        int i = C4466.f10034;
        interfaceC20106.mo29602().getClass();
        this.f41796 = new C4466(interfaceC20106);
    }

    public C14642(InterfaceC12059 interfaceC12059, String str, boolean z, int i, int i2, long j, long j2) throws MalformedURLException {
        URL url;
        if (m33446(interfaceC12059)) {
            StringBuilder sb = new StringBuilder("smb://");
            m33445(str);
            url = new URL((URL) null, C10965.m25286(sb, str, "/"), interfaceC12059.getContext().mo29599());
        } else {
            URL urlM43768 = ((C19218) interfaceC12059.mo27616()).m43768();
            m33445(str);
            url = new URL(urlM43768, str.concat((i2 & 16) > 0 ? "/" : ""));
        }
        this(url, interfaceC12059.getContext());
        if (!m33446(interfaceC12059)) {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append((i2 & 16) > 0 ? "/" : "");
            m33444(interfaceC12059, sbM17248.toString());
        }
        this.f41801.m43762(i);
        this.f41803 = i2;
        this.f41794 = j;
        this.f41800 = j2;
        this.f41795 = true;
        if (z) {
            long jM35088 = ((C15410) this.f41797.mo29602()).m35088() + System.currentTimeMillis();
            this.f41799 = jM35088;
            this.f41802 = jM35088;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m33446(InterfaceC12059 interfaceC12059) {
        try {
            return ((C19218) interfaceC12059.mo27616()).m43765();
        } catch (C20777 e) {
            f41792.mo9176("Failed to check for workgroup", (Exception) e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        C5807 c5807M33461 = m33461();
        if (c5807M33461 != null) {
            c5807M33461.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33444(InterfaceC12059 interfaceC12059, String str) {
        this.f41801.m43763(interfaceC12059.mo27616(), str);
        if (((C19218) interfaceC12059.mo27616()).m43769() != null && (interfaceC12059 instanceof C14642)) {
            this.f41796 = C4466.m9407(((C14642) interfaceC12059).f41796);
            return;
        }
        InterfaceC20106 context = interfaceC12059.getContext();
        int i = C4466.f10034;
        context.mo29602().getClass();
        this.f41796 = new C4466(context);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33445(String str) throws MalformedURLException {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m33456() {
        this.f41796.getClass();
    }

    @Override // p067l.InterfaceC12059
    public final InterfaceC20106 getContext() {
        return this.f41797;
    }

    @Override // p067l.InterfaceC12059
    /* JADX INFO: renamed from: ۚۧ */
    public final InterfaceC8035 mo27616() {
        return this.f41801;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01be A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX INFO: renamed from: ֫ */
    public final C13972 m33449(String str, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        C13972 c13972;
        long j;
        InterfaceC15904 interfaceC15904;
        long jM49547;
        long jCurrentTimeMillis;
        InterfaceC15904 interfaceC15905;
        InterfaceC4410 interfaceC4410 = f41792;
        C5807 c5807M33461 = m33461();
        try {
            boolean z3 = false;
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183(String.format("openUnshared: %s flags: %x access: %x attrs: %x options: %x", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            InterfaceC3341 interfaceC3341M13070 = c5807M33461.m13070();
            if (c5807M33461.m13076()) {
                C4307 c4307 = new C4307(str, interfaceC3341M13070);
                c4307.m8759(i2);
                int i6 = i & 64;
                if (i6 == 64 && (i & 16) == 16) {
                    c4307.m8762(5);
                } else if (i6 == 64) {
                    c4307.m8762(4);
                } else if ((i & 32) == 32) {
                    c4307.m8762(2);
                } else if ((i & 16) == 16) {
                    c4307.m8762(3);
                } else {
                    c4307.m8762(1);
                }
                c4307.m8768(i3);
                c4307.m8766(i4);
                C13025 c13025 = (C13025) c5807M33461.m13063(c4307, null, new EnumC2572[0]);
                long jM29843 = c13025.m29843();
                c13972 = new C13972(interfaceC3341M13070, c13025.m29842(), c5807M33461, str, i, i2, c13025.m29843());
                jM49547 = jM29843;
                interfaceC15905 = c13025;
            } else {
                boolean zM13065 = c5807M33461.m13065(16);
                C19218 c19218 = this.f41801;
                if (zM13065) {
                    C21980 c21980 = new C21980(interfaceC3341M13070);
                    C8568 c8568 = new C8568(interfaceC3341M13070, str, i, i2, i3, i4, i5);
                    mo30370(c8568, c21980);
                    c5807M33461.m13063(c8568, c21980, new EnumC2572[0]);
                    jM49547 = c21980.m49547();
                    c19218.m43762(c21980.m49546());
                    c13972 = new C13972(interfaceC3341M13070, c21980.m49545(), c5807M33461, str, i, i2, i4, i5, c21980.m49547());
                    interfaceC15905 = c21980;
                } else {
                    C4545 c4545 = new C4545(interfaceC3341M13070);
                    c5807M33461.m13063(new C17284(i2, i3, i, i4, str, interfaceC3341M13070), c4545, new EnumC2572[0]);
                    c19218.m43762(c4545.m9616());
                    long jM9618 = c4545.m9618();
                    C3203 c3203 = new C3203(interfaceC3341M13070);
                    c3203.m5535();
                    C9909 c9909 = new C9909(interfaceC3341M13070);
                    c3203.m5536(c4545.m9615());
                    try {
                        c5807M33461.m13063(c3203, c9909, new EnumC2572[0]);
                        if (interfaceC4410.mo9181() && c9909.m23207() != jM9618) {
                            interfaceC4410.mo9183(String.format("Open returned wrong size %d != %d", Long.valueOf(jM9618), Long.valueOf(c9909.m23207())));
                        }
                        jM9618 = c9909.m23207();
                        z = true;
                    } catch (Exception e) {
                        interfaceC4410.mo9176("Seek failed", e);
                        z = false;
                    }
                    long j2 = jM9618;
                    z2 = z;
                    c13972 = new C13972(interfaceC3341M13070, c4545.m9615(), c5807M33461, str, i, i2, 0, 0, j2);
                    j = j2;
                    interfaceC15904 = c4545;
                    jCurrentTimeMillis = System.currentTimeMillis() + ((C15410) interfaceC3341M13070).m35088();
                    if (z2) {
                        this.f41800 = j;
                        this.f41799 = jCurrentTimeMillis;
                    }
                    if (z3) {
                        this.f41794 = interfaceC15904.mo9617();
                        this.f41803 = interfaceC15904.getAttributes() & EnumC8055.f21261;
                        this.f41802 = jCurrentTimeMillis;
                    }
                    this.f41795 = true;
                    c5807M33461.close();
                    return c13972;
                }
            }
            z2 = true;
            j = jM49547;
            z3 = true;
            interfaceC15904 = interfaceC15905;
            jCurrentTimeMillis = System.currentTimeMillis() + ((C15410) interfaceC3341M13070).m35088();
            if (z2) {
                this.f41800 = j;
                this.f41799 = jCurrentTimeMillis;
            }
            if (z3) {
                this.f41794 = interfaceC15904.mo9617();
                this.f41803 = interfaceC15904.getAttributes() & EnumC8055.f21261;
                this.f41802 = jCurrentTimeMillis;
            }
            this.f41795 = true;
            c5807M33461.close();
            return c13972;
        } catch (Throwable th) {
            if (c5807M33461 == null) {
                throw th;
            }
            try {
                c5807M33461.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13972 m33448(int i, int i2, int i3, int i4, int i5) {
        return m33449(this.f41801.m43775(), i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33454(C5807 c5807, String str, int i) {
        InterfaceC4410 interfaceC4410 = f41792;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("queryPath: " + str);
        }
        if (c5807.m13076()) {
            return;
        }
        if (c5807.m13065(16)) {
            C23063 c23063 = (C23063) c5807.m13063(new C17026(c5807.m13070(), str, i), new C23063(c5807.m13070(), i), new EnumC2572[0]);
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Path information " + c23063);
            }
            InterfaceC2493 interfaceC2493 = (InterfaceC2493) c23063.m51453();
            this.f41795 = true;
            if (interfaceC2493 instanceof C7188) {
                C7188 c7188 = (C7188) interfaceC2493;
                this.f41803 = c7188.getAttributes() & EnumC8055.f21261;
                this.f41794 = c7188.mo9617();
                this.f41802 = ((C15410) c5807.m13070()).m35088() + System.currentTimeMillis();
                return;
            }
            if (interfaceC2493 instanceof C5177) {
                this.f41800 = ((C5177) interfaceC2493).getSize();
                this.f41799 = ((C15410) c5807.m13070()).m35088() + System.currentTimeMillis();
                return;
            }
            return;
        }
        C19968 c19968 = (C19968) c5807.m13063(new C5886(str, c5807.m13070()), new C19968(c5807.m13070(), c5807.m13068()), new EnumC2572[0]);
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Legacy path information " + c19968);
        }
        this.f41795 = true;
        this.f41803 = c19968.getAttributes() & EnumC8055.f21261;
        this.f41794 = c19968.mo9617();
        this.f41802 = ((C15410) c5807.m13070()).m35088() + System.currentTimeMillis();
        this.f41800 = c19968.getSize();
        this.f41799 = ((C15410) c5807.m13070()).m35088() + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m33459() throws C5255 {
        InterfaceC20106 interfaceC20106 = this.f41797;
        C19218 c19218 = this.f41801;
        long j = this.f41802;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC4410 interfaceC4410 = f41792;
        if (j > jCurrentTimeMillis) {
            interfaceC4410.mo9196("Using cached attributes");
            return this.f41795;
        }
        this.f41803 = 17;
        this.f41794 = 0L;
        this.f41795 = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (c19218.m43769() == null) {
                    if (c19218.m43766() == 2) {
                        C2433 c2433 = ((RunnableC11152) interfaceC20106.mo29601()).m25703(((URLConnection) this).url.getHost(), true)[0];
                    } else {
                        ((RunnableC11152) interfaceC20106.mo29601()).m25703(((URLConnection) this).url.getHost(), false)[0].mo3411();
                    }
                } else {
                    C5807 c5807M33461 = m33461();
                    try {
                        if (c19218.m43766() == 8) {
                            C5807 c5807M33462 = m33461();
                            if (c5807M33462 != null) {
                                c5807M33462.close();
                            }
                        } else {
                            m33454(c5807M33461, c19218.m43775(), 4);
                        }
                        if (c5807M33461 != null) {
                            c5807M33461.close();
                        }
                    } catch (Throwable th) {
                        if (c5807M33461 != null) {
                            try {
                                c5807M33461.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            this.f41795 = true;
        } catch (UnknownHostException e) {
            interfaceC4410.mo9176("Unknown host", (Exception) e);
        } catch (C5255 e2) {
            interfaceC4410.mo9192("exists:", e2);
            switch (e2.m11333()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e2;
            }
        } catch (C20777 e3) {
            throw C5255.m11331(e3);
        }
        this.f41802 = ((C15410) interfaceC20106.mo29602()).m35088() + System.currentTimeMillis();
        return this.f41795;
    }

    /* JADX INFO: renamed from: ᩻ */
    public int mo30373() throws C5255 {
        C19218 c19218 = this.f41801;
        try {
            int iM43766 = c19218.m43766();
            if (iM43766 != 8) {
                return iM43766;
            }
            C5807 c5807M33461 = m33461();
            try {
                c19218.m43762(c5807M33461.m13062());
                c5807M33461.close();
                return iM43766;
            } catch (Throwable th) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    @Override // p067l.InterfaceC12059
    public final String getName() {
        return this.f41801.getName();
    }

    @Override // p067l.InterfaceC12059
    public final boolean isDirectory() {
        if (this.f41801.m43764()) {
            return true;
        }
        return m33459() && (this.f41803 & 16) == 16;
    }

    @Override // p067l.InterfaceC12059
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo27614() throws C5255 {
        C19218 c19218 = this.f41801;
        if (c19218.m43769() == null) {
            return false;
        }
        if (c19218.m43764()) {
            return c19218.m43769().endsWith("$");
        }
        m33459();
        return (this.f41803 & 2) == 2;
    }

    @Override // p067l.InterfaceC12059
    /* JADX INFO: renamed from: ۚ */
    public final long mo27615() throws C5255 {
        if (this.f41801.m43764()) {
            return 0L;
        }
        m33459();
        return this.f41794;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7365 m33447() {
        return C6596.m15076(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33455(InterfaceC12059 interfaceC12059) throws C5255 {
        C19218 c19218 = this.f41801;
        if (!(interfaceC12059 instanceof C14642)) {
            throw new C5255("Invalid target resource");
        }
        C14642 c14642 = (C14642) interfaceC12059;
        C19218 c19219 = c14642.f41801;
        try {
            C5807 c5807M33461 = m33461();
            try {
                InterfaceC19889 interfaceC19889M33461 = c14642.m33461();
                try {
                    if (!m33459()) {
                        throw new C5255(-1073741772);
                    }
                    c14642.m33459();
                    if (c19218.m43764() || c19219.m43764()) {
                        throw new C5255("Invalid operation for workgroups, servers, or shares");
                    }
                    if (!c5807M33461.m13066(interfaceC19889M33461)) {
                        m33459();
                        c14642.m33459();
                        if (!C12826.equals(c19218.m43772(), c19219.m43772()) || !C12826.equals(c19218.m43769(), c19219.m43769())) {
                            throw new C5255("Cannot rename between different trees");
                        }
                    }
                    InterfaceC4410 interfaceC4410 = f41792;
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("renameTo: " + c19218.m43775() + " -> " + c19219.m43775());
                    }
                    c14642.f41799 = 0L;
                    c14642.f41802 = 0L;
                    if (c5807M33461.m13076()) {
                        C25094 c25094 = new C25094(c5807M33461.m13070());
                        c25094.m55072(new C6518(c19219.m43775().substring(1)));
                        m33450(c5807M33461, 65792, c25094, new AbstractC15015[0]);
                    } else {
                        c5807M33461.m13063(new C7227(c5807M33461.m13070(), c19218.m43775(), c19219.m43775()), new C9200(c5807M33461.m13070()), new EnumC2572[0]);
                    }
                    this.f41799 = 0L;
                    this.f41802 = 0L;
                    if (interfaceC19889M33461 != null) {
                        interfaceC19889M33461.close();
                    }
                    c5807M33461.close();
                } catch (Throwable th) {
                    if (interfaceC19889M33461 != null) {
                        try {
                            interfaceC19889M33461.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33460() {
        this.f41802 = 0L;
        this.f41799 = 0L;
    }

    @Override // p067l.InterfaceC12059
    public final void delete() throws C5255 {
        try {
            m33453(this.f41801.m43775());
            close();
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006c */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m33453(String str) throws C5255 {
        InterfaceC4410 interfaceC4410 = f41792;
        if (this.f41801.m43764()) {
            throw new C5255("Invalid operation for workgroups, servers, or shares");
        }
        C5807 c5807M33461 = m33461();
        try {
            if (!m33459()) {
                throw new C5255(-1073741772);
            }
            if ((this.f41803 & 1) != 0) {
                m33457();
            }
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("delete: " + str);
            }
            if ((this.f41803 & 16) != 0) {
                try {
                    InterfaceC7365 interfaceC7365M15076 = C6596.m15076(this);
                    while (interfaceC7365M15076.hasNext()) {
                        InterfaceC12059 interfaceC12059 = (InterfaceC12059) interfaceC7365M15076.next();
                        try {
                            try {
                                interfaceC12059.delete();
                                interfaceC12059.close();
                            } catch (C20777 e) {
                                throw C5255.m11331(e);
                            }
                        } catch (Throwable th) {
                            if (interfaceC12059 != null) {
                                try {
                                    interfaceC12059.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    interfaceC7365M15076.close();
                } catch (C5255 e2) {
                    interfaceC4410.mo9176("delete", (Exception) e2);
                    if (e2.m11333() != -1073741809) {
                        throw e2;
                    }
                }
                if (c5807M33461.m13076()) {
                    C4307 c4307 = new C4307(str, c5807M33461.m13070());
                    c4307.m8759(65536);
                    c4307.m8758(C0719o.a.f2895a);
                    c4307.m8762(1);
                    c4307.mo12477(new C15685(str, c5807M33461.m13070()));
                    c5807M33461.m13063(c4307, null, new EnumC2572[0]);
                } else {
                    c5807M33461.m13063(new C19297(str, c5807M33461.m13070()), new C9200(c5807M33461.m13070()), new EnumC2572[0]);
                }
            } else if (c5807M33461.m13076()) {
                C4307 c4308 = new C4307(str.substring(1), c5807M33461.m13070());
                c4308.m8759(65536);
                c4308.m8758(4096);
                c4308.mo12477(new C15685(str, c5807M33461.m13070()));
                c5807M33461.m13063(c4308, null, new EnumC2572[0]);
            } else {
                c5807M33461.m13063(new C17955(str, c5807M33461.m13070()), new C9200(c5807M33461.m13070()), new EnumC2572[0]);
            }
            this.f41799 = 0L;
            this.f41802 = 0L;
            if (c5807M33461 != null) {
                c5807M33461.close();
            }
        } catch (Throwable th3) {
            if (c5807M33461 != null) {
                try {
                    c5807M33461.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // p067l.InterfaceC12059
    public final long length() throws C5255 {
        boolean z;
        InterfaceC24323 interfaceC24323;
        C19218 c19218 = this.f41801;
        if (this.f41799 > System.currentTimeMillis()) {
            return this.f41800;
        }
        try {
            C5807 c5807M33461 = m33461();
            try {
                int iMo30373 = mo30373();
                if (iMo30373 != 8) {
                    if (c19218.m43769() == null) {
                        z = true;
                        if (c19218.m43775().length() > 1) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z && iMo30373 != 16) {
                        m33454(c5807M33461, c19218.m43775(), 5);
                    } else {
                        this.f41800 = 0L;
                    }
                } else {
                    try {
                        interfaceC24323 = (InterfaceC24323) m33443(c5807M33461, (byte) 3);
                    } catch (C5255 e) {
                        f41792.mo9176("getDiskFreeSpace", (Exception) e);
                        int iM11333 = e.m11333();
                        if ((iM11333 == -1073741823 || iM11333 == -1073741821) && !c5807M33461.m13076()) {
                            interfaceC24323 = (InterfaceC24323) m33443(c5807M33461, (byte) -1);
                        } else {
                            throw e;
                        }
                    }
                    this.f41800 = interfaceC24323.mo31614();
                }
                this.f41799 = System.currentTimeMillis() + ((C15410) this.f41797.mo29602()).m35088();
                long j = this.f41800;
                if (c5807M33461 != null) {
                    c5807M33461.close();
                }
                return j;
            } catch (Throwable th) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20777 e2) {
            throw C5255.m11331(e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC14564 m33443(C5807 c5807, byte b) {
        if (c5807.m13076()) {
            C19059 c19059 = new C19059(c5807.m13070());
            c19059.m43299(b);
            return (InterfaceC14564) ((C16376) m33450(c5807, 128, c19059, new AbstractC15015[0])).m37189();
        }
        C10322 c10322 = new C10322(c5807.m13070(), b);
        c5807.m13063(new C3616(c5807.m13070(), b), c10322, new EnumC2572[0]);
        return c10322.m23941();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m33458() throws C5255 {
        C19218 c19218 = this.f41801;
        if (c19218.m43775().length() == 1) {
            throw new C5255("Invalid operation for workgroups, servers, or shares");
        }
        try {
            C5807 c5807M33461 = m33461();
            try {
                m33459();
                String strM43775 = c19218.m43775();
                InterfaceC4410 interfaceC4410 = f41792;
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("mkdir: " + strM43775);
                }
                if (c5807M33461.m13076()) {
                    C4307 c4307 = new C4307(strM43775, c5807M33461.m13070());
                    c4307.m8762(2);
                    c4307.m8758(1);
                    c4307.mo12477(new C15685(strM43775, c5807M33461.m13070()));
                    c5807M33461.m13063(c4307, null, new EnumC2572[0]);
                } else {
                    c5807M33461.m13063(new C12592(strM43775, c5807M33461.m13070()), new C9200(c5807M33461.m13070()), new EnumC2572[0]);
                }
                this.f41799 = 0L;
                this.f41802 = 0L;
                c5807M33461.close();
            } catch (Throwable th) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14345 m33450(C5807 c5807, int i, AbstractC15015 abstractC15015, AbstractC15015... abstractC15015Arr) {
        InterfaceC3341 interfaceC3341M13070 = c5807.m13070();
        C19218 c19218 = this.f41801;
        C4307 c4307 = new C4307(c19218.m43775(), interfaceC3341M13070);
        try {
            c4307.m8762(1);
            c4307.m8758(0);
            c4307.m8766(128);
            c4307.m8759(i);
            c4307.m8768(3);
            if (abstractC15015 != null) {
                c4307.mo12477(abstractC15015);
                int length = abstractC15015Arr.length;
                int i2 = 0;
                while (i2 < length) {
                    AbstractC15015 abstractC15016 = abstractC15015Arr[i2];
                    abstractC15015.mo12477(abstractC15016);
                    i2++;
                    abstractC15015 = abstractC15016;
                }
            } else {
                abstractC15015 = c4307;
            }
            C15685 c15685 = new C15685(c19218.m43775(), c5807.m13070());
            c15685.m35725();
            abstractC15015.mo12477(c15685);
            C13025 c13025 = (C13025) c5807.m13063(c4307, null, new EnumC2572[0]);
            C9651 c9651 = (C9651) c15685.mo7658();
            InterfaceC15904 interfaceC15904 = (c9651.m22441() & 1) != 0 ? c9651 : c13025;
            this.f41795 = true;
            interfaceC15904.getClass();
            this.f41794 = interfaceC15904.mo9617();
            this.f41803 = interfaceC15904.getAttributes() & EnumC8055.f21261;
            this.f41802 = System.currentTimeMillis() + ((C15410) c5807.m13070()).m35088();
            this.f41800 = interfaceC15904.getSize();
            this.f41799 = System.currentTimeMillis() + ((C15410) c5807.m13070()).m35088();
            return (AbstractC14345) c13025.m12505();
        } catch (RuntimeException | C20777 e) {
            try {
                C13025 c13026 = (C13025) c4307.mo7658();
                if (c13026.mo30257() && c13026.m12485() == 0) {
                    c5807.m13063(new C15685(c5807.m13070(), c13026.m29842()), null, EnumC2572.NO_RETRY);
                }
            } catch (Exception e2) {
                f41792.mo9176("Failed to close after failure", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33451(int i, long j, long j2, long j3) {
        C5807 c5807M33461 = m33461();
        try {
            if (!m33459()) {
                throw new C5255(-1073741772);
            }
            int i2 = this.f41803 & 16;
            if (c5807M33461.m13076()) {
                C25094 c25094 = new C25094(c5807M33461.m13070());
                c25094.m55072(new C7188(i | i2, j, j3, j2));
                m33450(c5807M33461, 256, c25094, new AbstractC15015[0]);
            } else if (c5807M33461.m13065(16)) {
                C13972 c13972M33448 = m33448(1, 256, 3, i2, i2 != 0 ? 1 : 64);
                try {
                    c5807M33461.m13063(new C23733(c5807M33461.m13070(), c13972M33448.m31754(), i | i2, j, j2, j3), new C21722(c5807M33461.m13070()), EnumC2572.NO_RETRY);
                    c13972M33448.m31750();
                } catch (Throwable th) {
                    try {
                        c13972M33448.m31750();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                if (j != 0 || j3 != 0) {
                    throw new C2453("Cannot set creation or access time without CAP_NT_SMBS");
                }
                c5807M33461.m13063(new C23321(c5807M33461.m13070(), this.f41801.m43775(), i, j2 - c5807M33461.m13068()), new C21310(c5807M33461.m13070()), new EnumC2572[0]);
            }
            this.f41802 = 0L;
            c5807M33461.close();
        } catch (Throwable th3) {
            if (c5807M33461 == null) {
                throw th3;
            }
            try {
                c5807M33461.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33452(long j, long j2, long j3) throws C5255 {
        if (this.f41801.m43764()) {
            throw new C5255("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m33451(0, j, j2, j3);
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m33457() throws C5255 {
        int i;
        C19218 c19218 = this.f41801;
        if (c19218.m43764()) {
            i = 0;
        } else {
            m33459();
            i = this.f41803 & EnumC8055.f21261;
        }
        if (c19218.m43764()) {
            throw new C5255("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m33451(i & 12454, 0L, 0L, 0L);
        } catch (C5255 e) {
            if (e.m11333() != -1073741637) {
                throw e;
            }
            throw new C2453("Attribute not supported by server");
        } catch (C20777 e2) {
            throw C5255.m11331(e2);
        }
    }

    public final int hashCode() {
        return this.f41801.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14642)) {
            return false;
        }
        InterfaceC12059 interfaceC12059 = (InterfaceC12059) obj;
        if (this == interfaceC12059) {
            return true;
        }
        return this.f41801.equals(interfaceC12059.mo27616());
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return ((URLConnection) this).url.toString();
    }

    @Override // java.net.URLConnection
    @Deprecated
    public final int getContentLength() {
        try {
            return (int) (length() & 4294967295L);
        } catch (C5255 e) {
            f41792.mo9176("getContentLength", (Exception) e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        try {
            return length();
        } catch (C5255 e) {
            f41792.mo9176("getContentLength", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        try {
            return mo27615();
        } catch (C5255 e) {
            f41792.mo9176("getDate", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        try {
            return mo27615();
        } catch (C5255 e) {
            f41792.mo9176("getLastModified", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return new C11961(this);
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return new C7937(this);
    }
}
