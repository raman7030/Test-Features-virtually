package l;

import com.thegrizzlylabs.sardineandroid.model.Allprop;
import com.thegrizzlylabs.sardineandroid.model.Propfind;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.simpleframework.xml.stream.MyPullProvider;

/* JADX INFO: renamed from: l.ۤ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10577 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17209 f31751;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31752;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile String f31753;

    static {
        MyPullProvider.inject();
    }

    public C10577(C17209 c17209, String str) {
        this.f31751 = c17209;
        this.f31752 = m26579(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26586(String str, String str2, boolean z) {
        C17915 c17915M40470 = this.f31751.m40470();
        c17915M40470.m41901(new C15514(str, str2));
        if (z) {
            c17915M40470.m41903(new C4932(str, str2));
        }
        this.f31751 = c17915M40470.m41894();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m26587() {
        return this.f31753;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26590(String str) {
        this.f31753 = m26579(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26583() {
        this.f31753 = null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m26591(String str) {
        C13864 c13864M33217;
        Propfind propfind = new Propfind();
        propfind.setAllprop(new Allprop());
        try {
            c13864M33217 = C13864.m33217("text/xml");
        } catch (IllegalArgumentException unused) {
            c13864M33217 = null;
        }
        AbstractC2393 abstractC2393M7754 = AbstractC2393.m7754(c13864M33217, C14746.m35046(propfind));
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24283("Depth", Integer.toString(1));
        c9449.m24277("PROPFIND", abstractC2393M7754);
        return (List) m26572(c9449.m24274(), new C2047());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m26581(long j, String str) {
        if (j == 0) {
            Map map = Collections.EMPTY_MAP;
            C10338 c10338M26134 = C10338.m26134();
            C9449 c9449 = new C9449();
            c9449.m24282(str);
            c9449.m24281();
            c9449.m24278(c10338M26134);
            return (InputStream) m26572(c9449.m24274(), new C14103());
        }
        C9449 c94410 = new C9449();
        c94410.m24282(str);
        c94410.m24281();
        c94410.m24278(C10338.m26132("Range", "bytes=" + j + "-"));
        return (InputStream) m26572(c94410.m24274(), new C21866());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26588(String str) {
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("DELETE", C20032.f64891);
        C8743 c8743M24274 = c9449.m24274();
        C13398 c13398M26574 = m26574(c8743M24274);
        if (c13398M26574.f40053 && c13398M26574.f40051.m43177() == 403) {
            try {
                c13398M26574.f40051.close();
            } catch (Exception unused) {
            }
            this.f31753 = null;
            c13398M26574 = m26574(c8743M24274);
        }
        m26575(c13398M26574);
        C18275.m42607(c13398M26574.f40051);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26584(String str) {
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("MKCOL", (AbstractC2393) null);
        C8743 c8743M24274 = c9449.m24274();
        C13398 c13398M26574 = m26574(c8743M24274);
        if (c13398M26574.f40053 && c13398M26574.f40051.m43177() == 403) {
            try {
                c13398M26574.f40051.close();
            } catch (Exception unused) {
            }
            this.f31753 = null;
            c13398M26574 = m26574(c8743M24274);
        }
        m26575(c13398M26574);
        C18275.m42607(c13398M26574.f40051);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26589(String str) {
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("HEAD", (AbstractC2393) null);
        return ((Boolean) m26572(c9449.m24274(), new C23276())).booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m26572(C8743 c8743, InterfaceC11220 interfaceC11220) throws ProtocolException {
        C13398 c13398M26574 = m26574(c8743);
        if (c13398M26574.f40053 && c13398M26574.f40051.m43177() == 403) {
            try {
                c13398M26574.f40051.close();
            } catch (Exception unused) {
            }
            this.f31753 = null;
            c13398M26574 = m26574(c8743);
        }
        m26575(c13398M26574);
        return interfaceC11220.mo6721(c13398M26574.f40051);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OutputStream m26582(String str, String str2, long j) throws ProtocolException {
        C12693 c12693;
        C13864 c13864M33217 = null;
        if (this.f31752 == null) {
            c12693 = new C12693(str, false);
        } else {
            String str3 = this.f31753;
            if (str3 != null) {
                String strM26577 = m26577(str, this.f31752, str3);
                c12693 = new C12693(strM26577, !strM26577.equals(str));
            } else {
                C9449 c9449 = new C9449();
                StringBuilder sb = new StringBuilder();
                String str4 = this.f31752;
                sb.append(str4);
                sb.append("/");
                c9449.m24282(sb.toString());
                c9449.m24277("HEAD", (AbstractC2393) null);
                C13398 c13398M26574 = m26574(c9449.m24274());
                C18621 c18621 = c13398M26574.f40051;
                try {
                    if (c18621.m43173()) {
                        m26575(c13398M26574);
                        String str5 = c13398M26574.f40050;
                        if (str5 != null) {
                            str4 = str5;
                        }
                    } else {
                        int iM43177 = c18621.m43177();
                        if (iM43177 == 405 || iM43177 == 501) {
                            try {
                                c18621.close();
                            } catch (Exception unused) {
                            }
                            C9449 c94410 = new C9449();
                            c94410.m24282(str4 + "/");
                            c94410.m24281();
                            C13398 c13398M26575 = m26574(c94410.m24274());
                            c18621 = c13398M26575.f40051;
                            try {
                                if (c18621.m43173()) {
                                    m26575(c13398M26575);
                                    String str6 = c13398M26575.f40050;
                                    if (str6 != null) {
                                        str4 = str6;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    c18621.close();
                                } catch (Exception unused2) {
                                }
                                throw th;
                            }
                        }
                    }
                    try {
                        c18621.close();
                    } catch (Exception unused3) {
                    }
                    String strM26578 = m26577(str, this.f31752, str4);
                    c12693 = new C12693(strM26578, (this.f31753 == null || !this.f31753.equals(str4) || strM26578.equals(str)) ? false : true);
                } catch (Throwable th2) {
                    try {
                        c18621.close();
                    } catch (Exception unused4) {
                    }
                    throw th2;
                }
            }
        }
        try {
            c13864M33217 = C13864.m33217(str2);
        } catch (IllegalArgumentException unused5) {
        }
        C0430 c0430 = new C0430(j, c13864M33217);
        C15384 c15384M1978 = c0430.m1978();
        long jM40485 = this.f31751.m40485();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c15384M1978.mo20329(jM40485);
        C9449 c94411 = new C9449();
        c94411.m24282(c12693.f38212);
        c94411.m24277("PUT", c0430);
        c94411.m24278(new C12454().m30612());
        C8743 c8743M24274 = c94411.m24274();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f31751.m40469(c8743M24274).mo39222(new C22571(this, atomicReference, c0430, c12693, atomicBoolean));
        return new C20455(c0430.m1979(), c0430, atomicBoolean, atomicReference);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13398 m26574(C8743 c8743) throws ProtocolException {
        C3521 c3521;
        String strM26573;
        String strM43169;
        C11749 c11749M28766;
        C8743 c8743M24274;
        C9449 c9449M22618;
        String strM22615;
        boolean zEquals;
        String strM22616;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zM26576 = false;
        if (this.f31752 == null || this.f31753 == null) {
            c3521 = new C3521(c8743, false);
        } else {
            String str = this.f31753;
            String string = c8743.m22622().toString();
            String strM26577 = m26577(string, this.f31752, str);
            String strM26580 = m26580(c8743.m22615("DESTINATION"), this.f31752, str);
            String strM26581 = m26580(c8743.m22615("If"), this.f31752, str);
            if (string.equals(strM26577)) {
                String strM22617 = c8743.m22615("DESTINATION");
                if (strM26580 == null) {
                    zEquals3 = strM22617 == null;
                } else {
                    zEquals3 = strM26580.equals(strM22617);
                }
                if (zEquals3) {
                    String strM22618 = c8743.m22615("If");
                    if (strM26581 == null) {
                        zEquals4 = strM22618 == null;
                    } else {
                        zEquals4 = strM26581.equals(strM22618);
                    }
                    if (zEquals4) {
                        c3521 = new C3521(c8743, false);
                    } else {
                        c9449M22618 = c8743.m22618();
                        if (!string.equals(strM26577)) {
                            c9449M22618.m24282(strM26577);
                        }
                        strM22615 = c8743.m22615("DESTINATION");
                        if (strM26580 != null) {
                            zEquals = strM26580.equals(strM22615);
                        } else if (strM22615 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals && strM26580 != null) {
                            c9449M22618.m24283("DESTINATION", strM26580);
                        }
                        strM22616 = c8743.m22615("If");
                        if (strM26581 != null) {
                            zEquals2 = strM26581.equals(strM22616);
                        } else if (strM22616 == null) {
                            zEquals2 = true;
                        } else {
                            zEquals2 = false;
                        }
                        if (!zEquals2 && strM26581 != null) {
                            c9449M22618.m24283("If", strM26581);
                        }
                        c3521 = new C3521(c9449M22618.m24274(), true);
                    }
                } else {
                    c9449M22618 = c8743.m22618();
                    if (!string.equals(strM26577)) {
                        c9449M22618.m24282(strM26577);
                    }
                    strM22615 = c8743.m22615("DESTINATION");
                    if (strM26580 != null) {
                        zEquals = strM26580.equals(strM22615);
                    } else if (strM22615 == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                    if (!zEquals) {
                        c9449M22618.m24283("DESTINATION", strM26580);
                    }
                    strM22616 = c8743.m22615("If");
                    if (strM26581 != null) {
                        zEquals2 = strM26581.equals(strM22616);
                    } else if (strM22616 == null) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                    if (!zEquals2) {
                        c9449M22618.m24283("If", strM26581);
                    }
                    c3521 = new C3521(c9449M22618.m24274(), true);
                }
            } else {
                c9449M22618 = c8743.m22618();
                if (!string.equals(strM26577)) {
                    c9449M22618.m24282(strM26577);
                }
                strM22615 = c8743.m22615("DESTINATION");
                if (strM26580 != null) {
                    zEquals = strM26580.equals(strM22615);
                } else if (strM22615 == null) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
                if (!zEquals) {
                    c9449M22618.m24283("DESTINATION", strM26580);
                }
                strM22616 = c8743.m22615("If");
                if (strM26581 != null) {
                    zEquals2 = strM26581.equals(strM22616);
                } else if (strM22616 == null) {
                    zEquals2 = true;
                } else {
                    zEquals2 = false;
                }
                if (!zEquals2) {
                    c9449M22618.m24283("If", strM26581);
                }
                c3521 = new C3521(c9449M22618.m24274(), true);
            }
        }
        C8743 c8744 = c3521.f11200;
        String string2 = c8744.m22622().toString();
        String strM26574 = null;
        if (this.f31753 == null || !m26578(string2, this.f31753)) {
            String str2 = this.f31752;
            strM26573 = (str2 == null || !m26578(string2, str2)) ? null : this.f31752;
        } else {
            strM26573 = this.f31753;
        }
        C18621 c18621Execute = this.f31751.m40469(c8744).execute();
        int i = 0;
        while (true) {
            if (c18621Execute.m43177() == 307) {
                zM26576 = true;
            }
            zM26576 = zM26576 | m26576(c18621Execute, 302) | m26576(c18621Execute, 303) | m26576(c18621Execute, 307);
            String string3 = c18621Execute.m43168().m22622().toString();
            if (strM26573 == null || !m26578(string3, strM26573)) {
                if (this.f31753 == null || !m26578(string3, this.f31753)) {
                    String str3 = this.f31752;
                    strM26573 = (str3 == null || !m26578(string3, str3)) ? null : this.f31752;
                } else {
                    strM26573 = this.f31753;
                }
            }
            int iM43177 = c18621Execute.m43177();
            if ((iM43177 != 307 && iM43177 != 308) || (strM43169 = c18621Execute.m43169("Location")) == null || (c11749M28766 = c18621Execute.m43168().m22622().m28766(strM43169)) == null) {
                c8743M24274 = null;
            } else {
                C8743 c8743M43168 = c18621Execute.m43168();
                C9449 c9449M22619 = c8743M43168.m22618();
                c9449M22619.m24280(c11749M28766);
                if (strM26573 != null) {
                    String strM26575 = m26573(strM26573, c8743M43168.m22622().toString(), c11749M28766.toString());
                    String strM26582 = m26580(c8743M43168.m22615("DESTINATION"), strM26573, strM26575);
                    if (strM26582 != null) {
                        c9449M22619.m24283("DESTINATION", strM26582);
                    }
                    String strM26583 = m26580(c8743M43168.m22615("If"), strM26573, strM26575);
                    if (strM26583 != null) {
                        c9449M22619.m24283("If", strM26583);
                    }
                }
                c8743M24274 = c9449M22619.m24274();
            }
            if (c8743M24274 == null) {
                boolean z = c3521.f11201;
                String string4 = c8743.m22622().toString();
                String string5 = c18621Execute.m43168().m22622().toString();
                String str4 = this.f31752;
                if (str4 != null && m26578(string4, str4)) {
                    strM26574 = m26573(str4, string4, string5);
                }
                return new C13398(c18621Execute, z, zM26576, strM26574);
            }
            strM26573 = strM26573 == null ? null : m26573(strM26573, string3, c8743M24274.m22622().toString());
            c18621Execute.close();
            i++;
            if (i > 20) {
                throw new ProtocolException(C19370.m44628(i, "Too many follow-up requests: "));
            }
            c18621Execute = this.f31751.m40469(c8743M24274).execute();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26575(C13398 c13398) {
        String str;
        if (!c13398.f40051.m43173() || c13398.f40052 || (str = c13398.f40050) == null) {
            return;
        }
        this.f31753 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26573(String str, String str2, String str3) {
        if (!m26578(str2, str)) {
            return null;
        }
        String strSubstring = str2.substring(str.length());
        if (str3.endsWith(strSubstring)) {
            return m26579(str3.substring(0, str3.length() - strSubstring.length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m26577(String str, String str2, String str3) {
        if (str3 == null || str2.equals(str3) || !m26578(str, str2)) {
            return str;
        }
        StringBuilder sbM15339 = C5368.m15339(str3);
        sbM15339.append(str.substring(str2.length()));
        return sbM15339.toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m26580(String str, String str2, String str3) {
        return (str == null || str3 == null || str2.equals(str3)) ? str : str.replace(str2, str3);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m26579(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            str = C11749.m28763(str).toString();
        } catch (IllegalArgumentException unused) {
        }
        while (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26585(String str, String str2) {
        try {
            str2 = C11749.m28763(str2).toString();
        } catch (IllegalArgumentException unused) {
        }
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("MOVE", (AbstractC2393) null);
        C12454 c12454 = new C12454();
        c12454.m30614("DESTINATION", str2);
        c12454.m30614("OVERWRITE", "T");
        c9449.m24278(c12454.m30612());
        C8743 c8743M24274 = c9449.m24274();
        C13398 c13398M26574 = m26574(c8743M24274);
        if (c13398M26574.f40053 && c13398M26574.f40051.m43177() == 403) {
            try {
                c13398M26574.f40051.close();
            } catch (Exception unused2) {
            }
            this.f31753 = null;
            c13398M26574 = m26574(c8743M24274);
        }
        m26575(c13398M26574);
        C18275.m42607(c13398M26574.f40051);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26578(String str, String str2) {
        char cCharAt;
        if (str2 == null || !str.startsWith(str2)) {
            return false;
        }
        return str.length() == str2.length() || (cCharAt = str.charAt(str2.length())) == '/' || cCharAt == '?' || cCharAt == '#';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26576(C18621 c18621, int i) {
        do {
            c18621 = c18621.m43178();
            if (c18621 == null) {
                return false;
            }
        } while (c18621.m43177() != i);
        return true;
    }
}
