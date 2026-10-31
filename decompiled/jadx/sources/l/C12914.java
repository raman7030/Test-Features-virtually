package l;

import com.umeng.analytics.pro.o;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.۬ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69ZM */
/* JADX INFO: loaded from: classes4.dex */
public class C12914 extends URLConnection implements InterfaceC10196 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f38750 = C11321.m27961(C12914.class);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38751 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f38752;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38753;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2207 f38754;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f38755;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3618 f38756;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f38757;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f38758;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17729 f38759;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f38760;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38761;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f38756 != null) {
            this.f38756 = null;
            this.f38755.mo27540().getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28326(C6523 c6523, C20635 c20635) {
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m31375() {
        C3618 c3618 = this.f38756;
        if (c3618 != null && c3618.m11095()) {
            C3618 c3619 = this.f38756;
            c3619.m11088();
            return c3619;
        }
        if (this.f38756 != null) {
            this.f38755.mo27540().getClass();
        }
        C3618 c3618M7335 = this.f38754.m7335(this.f38759);
        this.f38756 = c3618M7335;
        c3618M7335.m11097();
        this.f38755.mo27540().getClass();
        return this.f38756;
    }

    public C12914(C12914 c12914, String str) throws MalformedURLException {
        URL url;
        if (m31360(c12914)) {
            m31359(str);
            url = new URL((URL) null, "smb://".concat(str), c12914.f38755.mo27537());
        } else {
            URL urlM41522 = c12914.f38759.m41522();
            m31359(str);
            url = new URL(urlM41522, str, c12914.f38755.mo27537());
        }
        this(url, c12914.f38755);
        m31358(c12914, str);
    }

    public C12914(String str, InterfaceC18663 interfaceC18663) {
        this(new URL((URL) null, str, interfaceC18663.mo27537()), interfaceC18663);
    }

    public C12914(URL url, InterfaceC18663 interfaceC18663) throws MalformedURLException {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: " + url);
        }
        this.f38755 = interfaceC18663;
        this.f38759 = new C17729(url, interfaceC18663);
        int i = C2207.f7246;
        interfaceC18663.mo27540().getClass();
        this.f38754 = new C2207(interfaceC18663);
    }

    public C12914(InterfaceC10196 interfaceC10196, String str, boolean z, int i, int i2, long j, long j2) throws MalformedURLException {
        URL url;
        if (m31360(interfaceC10196)) {
            StringBuilder sb = new StringBuilder("smb://");
            m31359(str);
            url = new URL((URL) null, C9045.m23341(sb, str, "/"), interfaceC10196.getContext().mo27537());
        } else {
            URL urlM41522 = ((C17729) interfaceC10196.mo25594()).m41522();
            m31359(str);
            url = new URL(urlM41522, str.concat((i2 & 16) > 0 ? "/" : ""));
        }
        this(url, interfaceC10196.getContext());
        if (!m31360(interfaceC10196)) {
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append((i2 & 16) > 0 ? "/" : "");
            m31358(interfaceC10196, sbM15339.toString());
        }
        this.f38759.m41516(i);
        this.f38761 = i2;
        this.f38752 = j;
        this.f38758 = j2;
        this.f38753 = true;
        if (z) {
            long jM32974 = ((C13722) this.f38755.mo27540()).m32974() + System.currentTimeMillis();
            this.f38757 = jM32974;
            this.f38760 = jM32974;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31360(InterfaceC10196 interfaceC10196) {
        try {
            return ((C17729) interfaceC10196.mo25594()).m41519();
        } catch (C19369 e) {
            f38750.mo7081("Failed to check for workgroup", (Exception) e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        C3618 c3618M31375 = m31375();
        if (c3618M31375 != null) {
            c3618M31375.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31358(InterfaceC10196 interfaceC10196, String str) {
        this.f38759.m41517(interfaceC10196.mo25594(), str);
        if (((C17729) interfaceC10196.mo25594()).m41523() != null && (interfaceC10196 instanceof C12914)) {
            this.f38754 = C2207.m7324(((C12914) interfaceC10196).f38754);
            return;
        }
        InterfaceC18663 context = interfaceC10196.getContext();
        int i = C2207.f7246;
        context.mo27540().getClass();
        this.f38754 = new C2207(context);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31359(String str) throws MalformedURLException {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31370() {
        this.f38754.getClass();
    }

    @Override // l.InterfaceC10196
    public final InterfaceC18663 getContext() {
        return this.f38755;
    }

    @Override // l.InterfaceC10196
    /* JADX INFO: renamed from: ۚۧ */
    public final InterfaceC5962 mo25594() {
        return this.f38759;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01be A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:3:0x000a, B:5:0x0016, B:6:0x003b, B:8:0x0047, B:10:0x0057, B:12:0x005b, B:22:0x007a, B:41:0x01af, B:43:0x01be, B:45:0x01c4, B:46:0x01d4, B:14:0x0061, B:15:0x0065, B:17:0x006b, B:18:0x006f, B:20:0x0073, B:21:0x0077, B:25:0x00b1, B:28:0x00bf, B:30:0x0113, B:31:0x0150, B:33:0x015b, B:35:0x0163, B:36:0x017f, B:40:0x018c, B:39:0x0186), top: B:60:0x000a, inners: #1 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12209 m31363(String str, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        C12209 c12209;
        long j;
        InterfaceC14242 interfaceC14242;
        long jM47220;
        long jCurrentTimeMillis;
        InterfaceC14242 interfaceC14243;
        InterfaceC2148 interfaceC2148 = f38750;
        C3618 c3618M31375 = m31375();
        try {
            boolean z3 = false;
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088(String.format("openUnshared: %s flags: %x access: %x attrs: %x options: %x", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            InterfaceC1023 interfaceC1023M11094 = c3618M31375.m11094();
            if (c3618M31375.m11100()) {
                C2039 c2039 = new C2039(str, interfaceC1023M11094);
                c2039.m6633(i2);
                int i6 = i & 64;
                if (i6 == 64 && (i & 16) == 16) {
                    c2039.m6636(5);
                } else if (i6 == 64) {
                    c2039.m6636(4);
                } else if ((i & 32) == 32) {
                    c2039.m6636(2);
                } else if ((i & 16) == 16) {
                    c2039.m6636(3);
                } else {
                    c2039.m6636(1);
                }
                c2039.m6642(i3);
                c2039.m6640(i4);
                C11212 c11212 = (C11212) c3618M31375.m11087(c2039, null, new EnumC0214[0]);
                long jM27781 = c11212.m27781();
                c12209 = new C12209(interfaceC1023M11094, c11212.m27780(), c3618M31375, str, i, i2, c11212.m27781());
                jM47220 = jM27781;
                interfaceC14243 = c11212;
            } else {
                boolean zM11089 = c3618M31375.m11089(16);
                C17729 c17729 = this.f38759;
                if (zM11089) {
                    C20635 c20635 = new C20635(interfaceC1023M11094);
                    C6523 c6523 = new C6523(interfaceC1023M11094, str, i, i2, i3, i4, i5);
                    mo28326(c6523, c20635);
                    c3618M31375.m11087(c6523, c20635, new EnumC0214[0]);
                    jM47220 = c20635.m47220();
                    c17729.m41516(c20635.m47219());
                    c12209 = new C12209(interfaceC1023M11094, c20635.m47218(), c3618M31375, str, i, i2, i4, i5, c20635.m47220());
                    interfaceC14243 = c20635;
                } else {
                    C2290 c2290 = new C2290(interfaceC1023M11094);
                    c3618M31375.m11087(new C15694(i2, i3, i, i4, str, interfaceC1023M11094), c2290, new EnumC0214[0]);
                    c17729.m41516(c2290.m7548());
                    long jM7550 = c2290.m7550();
                    C0878 c0878 = new C0878(interfaceC1023M11094);
                    c0878.m3221();
                    C7934 c7934 = new C7934(interfaceC1023M11094);
                    c0878.m3222(c2290.m7547());
                    try {
                        c3618M31375.m11087(c0878, c7934, new EnumC0214[0]);
                        if (interfaceC2148.mo7086() && c7934.m21241() != jM7550) {
                            interfaceC2148.mo7088(String.format("Open returned wrong size %d != %d", Long.valueOf(jM7550), Long.valueOf(c7934.m21241())));
                        }
                        jM7550 = c7934.m21241();
                        z = true;
                    } catch (Exception e) {
                        interfaceC2148.mo7081("Seek failed", e);
                        z = false;
                    }
                    long j2 = jM7550;
                    z2 = z;
                    c12209 = new C12209(interfaceC1023M11094, c2290.m7547(), c3618M31375, str, i, i2, 0, 0, j2);
                    j = j2;
                    interfaceC14242 = c2290;
                    jCurrentTimeMillis = System.currentTimeMillis() + ((C13722) interfaceC1023M11094).m32974();
                    if (z2) {
                        this.f38758 = j;
                        this.f38757 = jCurrentTimeMillis;
                    }
                    if (z3) {
                        this.f38752 = interfaceC14242.mo7549();
                        this.f38761 = interfaceC14242.getAttributes() & EnumC5983.f18409;
                        this.f38760 = jCurrentTimeMillis;
                    }
                    this.f38753 = true;
                    c3618M31375.close();
                    return c12209;
                }
            }
            z2 = true;
            j = jM47220;
            z3 = true;
            interfaceC14242 = interfaceC14243;
            jCurrentTimeMillis = System.currentTimeMillis() + ((C13722) interfaceC1023M11094).m32974();
            if (z2) {
                this.f38758 = j;
                this.f38757 = jCurrentTimeMillis;
            }
            if (z3) {
                this.f38752 = interfaceC14242.mo7549();
                this.f38761 = interfaceC14242.getAttributes() & EnumC5983.f18409;
                this.f38760 = jCurrentTimeMillis;
            }
            this.f38753 = true;
            c3618M31375.close();
            return c12209;
        } catch (Throwable th) {
            if (c3618M31375 == null) {
                throw th;
            }
            try {
                c3618M31375.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12209 m31362(int i, int i2, int i3, int i4, int i5) {
        return m31363(this.f38759.m41529(), i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31368(C3618 c3618, String str, int i) {
        InterfaceC2148 interfaceC2148 = f38750;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("queryPath: " + str);
        }
        if (c3618.m11100()) {
            return;
        }
        if (c3618.m11089(16)) {
            C21774 c21774 = (C21774) c3618.m11087(new C15422(c3618.m11094(), str, i), new C21774(c3618.m11094(), i), new EnumC0214[0]);
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Path information " + c21774);
            }
            InterfaceC0131 interfaceC0131 = (InterfaceC0131) c21774.m49103();
            this.f38753 = true;
            if (interfaceC0131 instanceof C5071) {
                C5071 c5071 = (C5071) interfaceC0131;
                this.f38761 = c5071.getAttributes() & EnumC5983.f18409;
                this.f38752 = c5071.mo7549();
                this.f38760 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
                return;
            }
            if (interfaceC0131 instanceof C2955) {
                this.f38758 = ((C2955) interfaceC0131).getSize();
                this.f38757 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
                return;
            }
            return;
        }
        C18518 c18518 = (C18518) c3618.m11087(new C3701(str, c3618.m11094()), new C18518(c3618.m11094(), c3618.m11092()), new EnumC0214[0]);
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Legacy path information " + c18518);
        }
        this.f38753 = true;
        this.f38761 = c18518.getAttributes() & EnumC5983.f18409;
        this.f38752 = c18518.mo7549();
        this.f38760 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
        this.f38758 = c18518.getSize();
        this.f38757 = ((C13722) c3618.m11094()).m32974() + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31373() throws C3037 {
        InterfaceC18663 interfaceC18663 = this.f38755;
        C17729 c17729 = this.f38759;
        long j = this.f38760;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC2148 interfaceC2148 = f38750;
        if (j > jCurrentTimeMillis) {
            interfaceC2148.mo7101("Using cached attributes");
            return this.f38753;
        }
        this.f38761 = 17;
        this.f38752 = 0L;
        this.f38753 = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (c17729.m41523() == null) {
                    if (c17729.m41520() == 2) {
                        C0068 c0068 = ((RunnableC9242) interfaceC18663.mo27539()).m23703(((URLConnection) this).url.getHost(), true)[0];
                    } else {
                        ((RunnableC9242) interfaceC18663.mo27539()).m23703(((URLConnection) this).url.getHost(), false)[0].mo1015();
                    }
                } else {
                    C3618 c3618M31375 = m31375();
                    try {
                        if (c17729.m41520() == 8) {
                            C3618 c3618M31376 = m31375();
                            if (c3618M31376 != null) {
                                c3618M31376.close();
                            }
                        } else {
                            m31368(c3618M31375, c17729.m41529(), 4);
                        }
                        if (c3618M31375 != null) {
                            c3618M31375.close();
                        }
                    } catch (Throwable th) {
                        if (c3618M31375 != null) {
                            try {
                                c3618M31375.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            this.f38753 = true;
        } catch (UnknownHostException e) {
            interfaceC2148.mo7081("Unknown host", (Exception) e);
        } catch (C3037 e2) {
            interfaceC2148.mo7097("exists:", e2);
            switch (e2.m9291()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e2;
            }
        } catch (C19369 e3) {
            throw C3037.m9289(e3);
        }
        this.f38760 = ((C13722) interfaceC18663.mo27540()).m32974() + System.currentTimeMillis();
        return this.f38753;
    }

    /* JADX INFO: renamed from: ᩻ */
    public int mo28329() throws C3037 {
        C17729 c17729 = this.f38759;
        try {
            int iM41520 = c17729.m41520();
            if (iM41520 != 8) {
                return iM41520;
            }
            C3618 c3618M31375 = m31375();
            try {
                c17729.m41516(c3618M31375.m11086());
                c3618M31375.close();
                return iM41520;
            } catch (Throwable th) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    @Override // l.InterfaceC10196
    public final String getName() {
        return this.f38759.getName();
    }

    @Override // l.InterfaceC10196
    public final boolean isDirectory() {
        if (this.f38759.m41518()) {
            return true;
        }
        return m31373() && (this.f38761 & 16) == 16;
    }

    @Override // l.InterfaceC10196
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo25592() throws C3037 {
        C17729 c17729 = this.f38759;
        if (c17729.m41523() == null) {
            return false;
        }
        if (c17729.m41518()) {
            return c17729.m41523().endsWith("$");
        }
        m31373();
        return (this.f38761 & 2) == 2;
    }

    @Override // l.InterfaceC10196
    /* JADX INFO: renamed from: ۚ */
    public final long mo25593() throws C3037 {
        if (this.f38759.m41518()) {
            return 0L;
        }
        m31373();
        return this.f38752;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5257 m31361() {
        return C4448.m13195(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31369(InterfaceC10196 interfaceC10196) throws C3037 {
        C17729 c17729 = this.f38759;
        if (!(interfaceC10196 instanceof C12914)) {
            throw new C3037("Invalid target resource");
        }
        C12914 c12914 = (C12914) interfaceC10196;
        C17729 c177210 = c12914.f38759;
        try {
            C3618 c3618M31375 = m31375();
            try {
                InterfaceC18435 interfaceC18435M31375 = c12914.m31375();
                try {
                    if (!m31373()) {
                        throw new C3037(-1073741772);
                    }
                    c12914.m31373();
                    if (c17729.m41518() || c177210.m41518()) {
                        throw new C3037("Invalid operation for workgroups, servers, or shares");
                    }
                    if (!c3618M31375.m11090(interfaceC18435M31375)) {
                        m31373();
                        c12914.m31373();
                        if (!C11003.equals(c17729.m41526(), c177210.m41526()) || !C11003.equals(c17729.m41523(), c177210.m41523())) {
                            throw new C3037("Cannot rename between different trees");
                        }
                    }
                    InterfaceC2148 interfaceC2148 = f38750;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("renameTo: " + c17729.m41529() + " -> " + c177210.m41529());
                    }
                    c12914.f38757 = 0L;
                    c12914.f38760 = 0L;
                    if (c3618M31375.m11100()) {
                        C23911 c23911 = new C23911(c3618M31375.m11094());
                        c23911.m52666(new C4366(c177210.m41529().substring(1)));
                        m31364(c3618M31375, 65792, c23911, new AbstractC13306[0]);
                    } else {
                        c3618M31375.m11087(new C5112(c3618M31375.m11094(), c17729.m41529(), c177210.m41529()), new C7188(c3618M31375.m11094()), new EnumC0214[0]);
                    }
                    this.f38757 = 0L;
                    this.f38760 = 0L;
                    if (interfaceC18435M31375 != null) {
                        interfaceC18435M31375.close();
                    }
                    c3618M31375.close();
                } catch (Throwable th) {
                    if (interfaceC18435M31375 != null) {
                        try {
                            interfaceC18435M31375.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31374() {
        this.f38760 = 0L;
        this.f38757 = 0L;
    }

    @Override // l.InterfaceC10196
    public final void delete() throws C3037 {
        try {
            m31367(this.f38759.m41529());
            close();
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31367(String str) throws C3037 {
        InterfaceC2148 interfaceC2148 = f38750;
        if (this.f38759.m41518()) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        C3618 c3618M31375 = m31375();
        try {
            if (!m31373()) {
                throw new C3037(-1073741772);
            }
            if ((this.f38761 & 1) != 0) {
                m31371();
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("delete: " + str);
            }
            if ((this.f38761 & 16) != 0) {
                try {
                    InterfaceC5257 interfaceC5257M13195 = C4448.m13195(this);
                    while (interfaceC5257M13195.hasNext()) {
                        try {
                            InterfaceC10196 interfaceC10196 = (InterfaceC10196) interfaceC5257M13195.next();
                            try {
                                try {
                                    interfaceC10196.delete();
                                    interfaceC10196.close();
                                } catch (C19369 e) {
                                    throw C3037.m9289(e);
                                }
                            } catch (Throwable th) {
                                if (interfaceC10196 != null) {
                                    try {
                                        interfaceC10196.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                interfaceC5257M13195.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    interfaceC5257M13195.close();
                } catch (C3037 e2) {
                    interfaceC2148.mo7081("delete", (Exception) e2);
                    if (e2.m9291() != -1073741809) {
                        throw e2;
                    }
                }
                if (c3618M31375.m11100()) {
                    C2039 c2039 = new C2039(str, c3618M31375.m11094());
                    c2039.m6633(65536);
                    c2039.m6632(o.a.a);
                    c2039.m6636(1);
                    c2039.mo10438(new C14011(str, c3618M31375.m11094()));
                    c3618M31375.m11087(c2039, null, new EnumC0214[0]);
                } else {
                    c3618M31375.m11087(new C17812(str, c3618M31375.m11094()), new C7188(c3618M31375.m11094()), new EnumC0214[0]);
                }
            } else if (c3618M31375.m11100()) {
                C2039 c20310 = new C2039(str.substring(1), c3618M31375.m11094());
                c20310.m6633(65536);
                c20310.m6632(4096);
                c20310.mo10438(new C14011(str, c3618M31375.m11094()));
                c3618M31375.m11087(c20310, null, new EnumC0214[0]);
            } else {
                c3618M31375.m11087(new C16400(str, c3618M31375.m11094()), new C7188(c3618M31375.m11094()), new EnumC0214[0]);
            }
            this.f38757 = 0L;
            this.f38760 = 0L;
            if (c3618M31375 != null) {
                c3618M31375.close();
            }
        } catch (Throwable th5) {
            if (c3618M31375 != null) {
                try {
                    c3618M31375.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // l.InterfaceC10196
    public final long length() throws C3037 {
        boolean z;
        InterfaceC23100 interfaceC23100;
        C17729 c17729 = this.f38759;
        if (this.f38757 > System.currentTimeMillis()) {
            return this.f38758;
        }
        try {
            C3618 c3618M31375 = m31375();
            try {
                int iMo28329 = mo28329();
                if (iMo28329 != 8) {
                    if (c17729.m41523() == null) {
                        z = true;
                        if (c17729.m41529().length() > 1) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z && iMo28329 != 16) {
                        m31368(c3618M31375, c17729.m41529(), 5);
                    } else {
                        this.f38758 = 0L;
                    }
                } else {
                    try {
                        interfaceC23100 = (InterfaceC23100) m31357(c3618M31375, (byte) 3);
                    } catch (C3037 e) {
                        f38750.mo7081("getDiskFreeSpace", (Exception) e);
                        int iM9291 = e.m9291();
                        if ((iM9291 == -1073741823 || iM9291 == -1073741821) && !c3618M31375.m11100()) {
                            interfaceC23100 = (InterfaceC23100) m31357(c3618M31375, (byte) -1);
                        } else {
                            throw e;
                        }
                    }
                    this.f38758 = interfaceC23100.mo29550();
                }
                this.f38757 = System.currentTimeMillis() + ((C13722) this.f38755.mo27540()).m32974();
                long j = this.f38758;
                if (c3618M31375 != null) {
                    c3618M31375.close();
                }
                return j;
            } catch (Throwable th) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C19369 e2) {
            throw C3037.m9289(e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12832 m31357(C3618 c3618, byte b) {
        if (c3618.m11100()) {
            C17561 c17561 = new C17561(c3618.m11094());
            c17561.m41053(b);
            return (InterfaceC12832) ((C14738) m31364(c3618, 128, c17561, new AbstractC13306[0])).m35042();
        }
        C8368 c8368 = new C8368(c3618.m11094(), b);
        c3618.m11087(new C1312(c3618.m11094(), b), c8368, new EnumC0214[0]);
        return c8368.m21970();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m31372() throws C3037 {
        C17729 c17729 = this.f38759;
        if (c17729.m41529().length() == 1) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        try {
            C3618 c3618M31375 = m31375();
            try {
                m31373();
                String strM41529 = c17729.m41529();
                InterfaceC2148 interfaceC2148 = f38750;
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("mkdir: " + strM41529);
                }
                if (c3618M31375.m11100()) {
                    C2039 c2039 = new C2039(strM41529, c3618M31375.m11094());
                    c2039.m6636(2);
                    c2039.m6632(1);
                    c2039.mo10438(new C14011(strM41529, c3618M31375.m11094()));
                    c3618M31375.m11087(c2039, null, new EnumC0214[0]);
                } else {
                    c3618M31375.m11087(new C10757(strM41529, c3618M31375.m11094()), new C7188(c3618M31375.m11094()), new EnumC0214[0]);
                }
                this.f38757 = 0L;
                this.f38760 = 0L;
                c3618M31375.close();
            } catch (Throwable th) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12601 m31364(C3618 c3618, int i, AbstractC13306 abstractC13306, AbstractC13306... abstractC13306Arr) {
        InterfaceC1023 interfaceC1023M11094 = c3618.m11094();
        C17729 c17729 = this.f38759;
        C2039 c2039 = new C2039(c17729.m41529(), interfaceC1023M11094);
        try {
            c2039.m6636(1);
            c2039.m6632(0);
            c2039.m6640(128);
            c2039.m6633(i);
            c2039.m6642(3);
            if (abstractC13306 != null) {
                c2039.mo10438(abstractC13306);
                int length = abstractC13306Arr.length;
                int i2 = 0;
                while (i2 < length) {
                    AbstractC13306 abstractC13307 = abstractC13306Arr[i2];
                    abstractC13306.mo10438(abstractC13307);
                    i2++;
                    abstractC13306 = abstractC13307;
                }
            } else {
                abstractC13306 = c2039;
            }
            C14011 c14011 = new C14011(c17729.m41529(), c3618.m11094());
            c14011.m33605();
            abstractC13306.mo10438(c14011);
            C11212 c11212 = (C11212) c3618.m11087(c2039, null, new EnumC0214[0]);
            C7662 c7662 = (C7662) c14011.mo5429();
            InterfaceC14242 interfaceC14242 = (c7662.m20461() & 1) != 0 ? c7662 : c11212;
            this.f38753 = true;
            interfaceC14242.getClass();
            this.f38752 = interfaceC14242.mo7549();
            this.f38761 = interfaceC14242.getAttributes() & EnumC5983.f18409;
            this.f38760 = System.currentTimeMillis() + ((C13722) c3618.m11094()).m32974();
            this.f38758 = interfaceC14242.getSize();
            this.f38757 = System.currentTimeMillis() + ((C13722) c3618.m11094()).m32974();
            return (AbstractC12601) c11212.m10466();
        } catch (RuntimeException | C19369 e) {
            try {
                C11212 c11213 = (C11212) c2039.mo5429();
                if (c11213.mo28213() && c11213.m10446() == 0) {
                    c3618.m11087(new C14011(c3618.m11094(), c11213.m27780()), null, EnumC0214.NO_RETRY);
                }
            } catch (Exception e2) {
                f38750.mo7081("Failed to close after failure", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31365(int i, long j, long j2, long j3) {
        C3618 c3618M31375 = m31375();
        try {
            if (!m31373()) {
                throw new C3037(-1073741772);
            }
            int i2 = this.f38761 & 16;
            if (c3618M31375.m11100()) {
                C23911 c23911 = new C23911(c3618M31375.m11094());
                c23911.m52666(new C5071(i | i2, j, j3, j2));
                m31364(c3618M31375, 256, c23911, new AbstractC13306[0]);
            } else if (c3618M31375.m11089(16)) {
                C12209 c12209M31362 = m31362(1, 256, 3, i2, i2 != 0 ? 1 : 64);
                try {
                    c3618M31375.m11087(new C22479(c3618M31375.m11094(), c12209M31362.m29692(), i | i2, j, j2, j3), new C20363(c3618M31375.m11094()), EnumC0214.NO_RETRY);
                    c12209M31362.m29688();
                } catch (Throwable th) {
                    try {
                        c12209M31362.m29688();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                if (j != 0 || j3 != 0) {
                    throw new C0089("Cannot set creation or access time without CAP_NT_SMBS");
                }
                c3618M31375.m11087(new C22046(c3618M31375.m11094(), this.f38759.m41529(), i, j2 - c3618M31375.m11092()), new C19930(c3618M31375.m11094()), new EnumC0214[0]);
            }
            this.f38760 = 0L;
            c3618M31375.close();
        } catch (Throwable th3) {
            if (c3618M31375 == null) {
                throw th3;
            }
            try {
                c3618M31375.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31366(long j, long j2, long j3) throws C3037 {
        if (this.f38759.m41518()) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m31365(0, j, j2, j3);
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m31371() throws C3037 {
        int i;
        C17729 c17729 = this.f38759;
        if (c17729.m41518()) {
            i = 0;
        } else {
            m31373();
            i = this.f38761 & EnumC5983.f18409;
        }
        if (c17729.m41518()) {
            throw new C3037("Invalid operation for workgroups, servers, or shares");
        }
        try {
            m31365(i & 12454, 0L, 0L, 0L);
        } catch (C3037 e) {
            if (e.m9291() != -1073741637) {
                throw e;
            }
            throw new C0089("Attribute not supported by server");
        } catch (C19369 e2) {
            throw C3037.m9289(e2);
        }
    }

    public final int hashCode() {
        return this.f38759.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12914)) {
            return false;
        }
        InterfaceC10196 interfaceC10196 = (InterfaceC10196) obj;
        if (this == interfaceC10196) {
            return true;
        }
        return this.f38759.equals(interfaceC10196.mo25594());
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
        } catch (C3037 e) {
            f38750.mo7081("getContentLength", (Exception) e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        try {
            return length();
        } catch (C3037 e) {
            f38750.mo7081("getContentLength", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        try {
            return mo25593();
        } catch (C3037 e) {
            f38750.mo7081("getDate", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        try {
            return mo25593();
        } catch (C3037 e) {
            f38750.mo7081("getLastModified", (Exception) e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return new C10093(this);
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return new C5859(this);
    }
}
