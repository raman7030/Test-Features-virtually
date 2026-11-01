package p067l;

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
public final class C12421 {

    /* JADX INFO: renamed from: ֫ */
    public C18724 f34717;

    /* JADX INFO: renamed from: ۧ */
    public final String f34718;

    /* JADX INFO: renamed from: ܽ */
    public volatile String f34719;

    static {
        MyPullProvider.inject();
    }

    public C12421(C18724 c18724, String str) {
        this.f34717 = c18724;
        this.f34718 = m28613(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28620(String str, String str2, boolean z) {
        C19395 c19395M42717 = this.f34717.m42717();
        c19395M42717.m44150(new C17113(str, str2));
        if (z) {
            c19395M42717.m44152(new C7056(str, str2));
        }
        this.f34717 = c19395M42717.m44143();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m28621() {
        return this.f34719;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28624(String str) {
        this.f34719 = m28613(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28617() {
        this.f34719 = null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m28625(String str) {
        C15545 c15545M35336;
        Propfind propfind = new Propfind();
        propfind.setAllprop(new Allprop());
        try {
            c15545M35336 = C15545.m35336("text/xml");
        } catch (IllegalArgumentException unused) {
            c15545M35336 = null;
        }
        AbstractC4643 abstractC4643M9817 = AbstractC4643.m9817(c15545M35336, C16383.m37193(propfind));
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26293("Depth", Integer.toString(1));
        c11349.m26287("PROPFIND", abstractC4643M9817);
        return (List) m28606(c11349.m26284(), new C4314());
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m28615(long j, String str) {
        if (j == 0) {
            Map map = Collections.EMPTY_MAP;
            C12194 c12194M28159 = C12194.m28159();
            C11349 c11349 = new C11349();
            c11349.m26292(str);
            c11349.m26291();
            c11349.m26288(c12194M28159);
            return (InputStream) m28606(c11349.m26284(), new C15772());
        }
        C11349 c113410 = new C11349();
        c113410.m26292(str);
        c113410.m26291();
        c113410.m26288(C12194.m28157("Range", "bytes=" + j + "-"));
        return (InputStream) m28606(c113410.m26284(), new C23150());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28622(String str) {
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26287("DELETE", C21407.f67533);
        C10678 c10678M26284 = c11349.m26284();
        C15102 c15102M28608 = m28608(c10678M26284);
        if (c15102M28608.f43123 && c15102M28608.f43121.m45443() == 403) {
            try {
                c15102M28608.f43121.close();
            } catch (Exception unused) {
            }
            this.f34719 = null;
            c15102M28608 = m28608(c10678M26284);
        }
        m28609(c15102M28608);
        C19737.m44866(c15102M28608.f43121);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28618(String str) {
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26287("MKCOL", (AbstractC4643) null);
        C10678 c10678M26284 = c11349.m26284();
        C15102 c15102M28608 = m28608(c10678M26284);
        if (c15102M28608.f43123 && c15102M28608.f43121.m45443() == 403) {
            try {
                c15102M28608.f43121.close();
            } catch (Exception unused) {
            }
            this.f34719 = null;
            c15102M28608 = m28608(c10678M26284);
        }
        m28609(c15102M28608);
        C19737.m44866(c15102M28608.f43121);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m28623(String str) {
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26287("HEAD", (AbstractC4643) null);
        return ((Boolean) m28606(c11349.m26284(), new C24490())).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m28606(C10678 c10678, InterfaceC13032 interfaceC13032) throws ProtocolException {
        C15102 c15102M28608 = m28608(c10678);
        if (c15102M28608.f43123 && c15102M28608.f43121.m45443() == 403) {
            try {
                c15102M28608.f43121.close();
            } catch (Exception unused) {
            }
            this.f34719 = null;
            c15102M28608 = m28608(c10678);
        }
        m28609(c15102M28608);
        return interfaceC13032.mo8847(c15102M28608.f43121);
    }

    /* JADX INFO: renamed from: ֫ */
    public final OutputStream m28616(String str, String str2, long j) throws ProtocolException {
        C14432 c14432;
        C15545 c15545M35336 = null;
        if (this.f34718 == null) {
            c14432 = new C14432(str, false);
        } else {
            String str3 = this.f34719;
            if (str3 != null) {
                String strM28611 = m28611(str, this.f34718, str3);
                c14432 = new C14432(strM28611, !strM28611.equals(str));
            } else {
                C11349 c11349 = new C11349();
                StringBuilder sb = new StringBuilder();
                String str4 = this.f34718;
                sb.append(str4);
                sb.append("/");
                c11349.m26292(sb.toString());
                c11349.m26287("HEAD", (AbstractC4643) null);
                C15102 c15102M28608 = m28608(c11349.m26284());
                C20066 c20066 = c15102M28608.f43121;
                try {
                    if (c20066.m45439()) {
                        m28609(c15102M28608);
                        String str5 = c15102M28608.f43120;
                        if (str5 != null) {
                            str4 = str5;
                        }
                    } else {
                        int iM45443 = c20066.m45443();
                        if (iM45443 == 405 || iM45443 == 501) {
                            try {
                                c20066.close();
                            } catch (Exception unused) {
                            }
                            C11349 c113410 = new C11349();
                            c113410.m26292(str4 + "/");
                            c113410.m26291();
                            C15102 c15102M28609 = m28608(c113410.m26284());
                            c20066 = c15102M28609.f43121;
                            try {
                                if (c20066.m45439()) {
                                    m28609(c15102M28609);
                                    String str6 = c15102M28609.f43120;
                                    if (str6 != null) {
                                        str4 = str6;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    c20066.close();
                                } catch (Exception unused2) {
                                }
                                throw th;
                            }
                        }
                    }
                    try {
                        c20066.close();
                    } catch (Exception unused3) {
                    }
                    String strM28612 = m28611(str, this.f34718, str4);
                    c14432 = new C14432(strM28612, (this.f34719 == null || !this.f34719.equals(str4) || strM28612.equals(str)) ? false : true);
                } catch (Throwable th2) {
                    try {
                        c20066.close();
                    } catch (Exception unused4) {
                    }
                    throw th2;
                }
            }
        }
        try {
            c15545M35336 = C15545.m35336(str2);
        } catch (IllegalArgumentException unused5) {
        }
        C2777 c2777 = new C2777(j, c15545M35336);
        C16989 c16989M4354 = c2777.m4354();
        long jM42732 = this.f34717.m42732();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c16989M4354.mo22306(jM42732);
        C11349 c113411 = new C11349();
        c113411.m26292(c14432.f41240);
        c113411.m26287("PUT", c2777);
        c113411.m26288(new C14205().m32677());
        C10678 c10678M26284 = c113411.m26284();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f34717.m42716(c10678M26284).mo41457(new C23820(this, atomicReference, c2777, c14432, atomicBoolean));
        return new C21809(c2777.m4355(), c2777, atomicBoolean, atomicReference);
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
    /* JADX INFO: renamed from: ֫ */
    private C15102 m28608(C10678 c10678) throws ProtocolException {
        C5715 c5715;
        String strM28607;
        String strM45435;
        C13535 c13535M30813;
        C10678 c10678M26284;
        C11349 c11349M24587;
        String strM24584;
        boolean zEquals;
        String strM24585;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zM28610 = false;
        if (this.f34718 == null || this.f34719 == null) {
            c5715 = new C5715(c10678, false);
        } else {
            String str = this.f34719;
            String string = c10678.m24591().toString();
            String strM28611 = m28611(string, this.f34718, str);
            String strM28614 = m28614(c10678.m24584("DESTINATION"), this.f34718, str);
            String strM28615 = m28614(c10678.m24584("If"), this.f34718, str);
            if (string.equals(strM28611)) {
                String strM24586 = c10678.m24584("DESTINATION");
                if (strM28614 == null) {
                    zEquals3 = strM24586 == null;
                } else {
                    zEquals3 = strM28614.equals(strM24586);
                }
                if (zEquals3) {
                    String strM24587 = c10678.m24584("If");
                    if (strM28615 == null) {
                        zEquals4 = strM24587 == null;
                    } else {
                        zEquals4 = strM28615.equals(strM24587);
                    }
                    if (zEquals4) {
                        c5715 = new C5715(c10678, false);
                    } else {
                        c11349M24587 = c10678.m24587();
                        if (!string.equals(strM28611)) {
                            c11349M24587.m26292(strM28611);
                        }
                        strM24584 = c10678.m24584("DESTINATION");
                        if (strM28614 != null) {
                            zEquals = strM28614.equals(strM24584);
                        } else if (strM24584 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals && strM28614 != null) {
                            c11349M24587.m26293("DESTINATION", strM28614);
                        }
                        strM24585 = c10678.m24584("If");
                        if (strM28615 != null) {
                            zEquals2 = strM28615.equals(strM24585);
                        } else if (strM24585 == null) {
                            zEquals2 = true;
                        } else {
                            zEquals2 = false;
                        }
                        if (!zEquals2 && strM28615 != null) {
                            c11349M24587.m26293("If", strM28615);
                        }
                        c5715 = new C5715(c11349M24587.m26284(), true);
                    }
                } else {
                    c11349M24587 = c10678.m24587();
                    if (!string.equals(strM28611)) {
                        c11349M24587.m26292(strM28611);
                    }
                    strM24584 = c10678.m24584("DESTINATION");
                    if (strM28614 != null) {
                        zEquals = strM28614.equals(strM24584);
                    } else if (strM24584 == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                    if (!zEquals) {
                        c11349M24587.m26293("DESTINATION", strM28614);
                    }
                    strM24585 = c10678.m24584("If");
                    if (strM28615 != null) {
                        zEquals2 = strM28615.equals(strM24585);
                    } else if (strM24585 == null) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                    if (!zEquals2) {
                        c11349M24587.m26293("If", strM28615);
                    }
                    c5715 = new C5715(c11349M24587.m26284(), true);
                }
            } else {
                c11349M24587 = c10678.m24587();
                if (!string.equals(strM28611)) {
                    c11349M24587.m26292(strM28611);
                }
                strM24584 = c10678.m24584("DESTINATION");
                if (strM28614 != null) {
                    zEquals = strM28614.equals(strM24584);
                } else if (strM24584 == null) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
                if (!zEquals) {
                    c11349M24587.m26293("DESTINATION", strM28614);
                }
                strM24585 = c10678.m24584("If");
                if (strM28615 != null) {
                    zEquals2 = strM28615.equals(strM24585);
                } else if (strM24585 == null) {
                    zEquals2 = true;
                } else {
                    zEquals2 = false;
                }
                if (!zEquals2) {
                    c11349M24587.m26293("If", strM28615);
                }
                c5715 = new C5715(c11349M24587.m26284(), true);
            }
        }
        C10678 c10679 = c5715.f14006;
        String string2 = c10679.m24591().toString();
        String strM28608 = null;
        if (this.f34719 == null || !m28612(string2, this.f34719)) {
            String str2 = this.f34718;
            strM28607 = (str2 == null || !m28612(string2, str2)) ? null : this.f34718;
        } else {
            strM28607 = this.f34719;
        }
        C20066 c20066Execute = this.f34717.m42716(c10679).execute();
        int i = 0;
        while (true) {
            if (c20066Execute.m45443() == 307) {
                zM28610 = true;
            }
            zM28610 = zM28610 | m28610(c20066Execute, 302) | m28610(c20066Execute, 303) | m28610(c20066Execute, 307);
            String string3 = c20066Execute.m45434().m24591().toString();
            if (strM28607 == null || !m28612(string3, strM28607)) {
                if (this.f34719 == null || !m28612(string3, this.f34719)) {
                    String str3 = this.f34718;
                    strM28607 = (str3 == null || !m28612(string3, str3)) ? null : this.f34718;
                } else {
                    strM28607 = this.f34719;
                }
            }
            int iM45443 = c20066Execute.m45443();
            if ((iM45443 != 307 && iM45443 != 308) || (strM45435 = c20066Execute.m45435("Location")) == null || (c13535M30813 = c20066Execute.m45434().m24591().m30813(strM45435)) == null) {
                c10678M26284 = null;
            } else {
                C10678 c10678M45434 = c20066Execute.m45434();
                C11349 c11349M24588 = c10678M45434.m24587();
                c11349M24588.m26290(c13535M30813);
                if (strM28607 != null) {
                    String strM28609 = m28607(strM28607, c10678M45434.m24591().toString(), c13535M30813.toString());
                    String strM28616 = m28614(c10678M45434.m24584("DESTINATION"), strM28607, strM28609);
                    if (strM28616 != null) {
                        c11349M24588.m26293("DESTINATION", strM28616);
                    }
                    String strM28617 = m28614(c10678M45434.m24584("If"), strM28607, strM28609);
                    if (strM28617 != null) {
                        c11349M24588.m26293("If", strM28617);
                    }
                }
                c10678M26284 = c11349M24588.m26284();
            }
            if (c10678M26284 == null) {
                boolean z = c5715.f14007;
                String string4 = c10678.m24591().toString();
                String string5 = c20066Execute.m45434().m24591().toString();
                String str4 = this.f34718;
                if (str4 != null && m28612(string4, str4)) {
                    strM28608 = m28607(str4, string4, string5);
                }
                return new C15102(c20066Execute, z, zM28610, strM28608);
            }
            strM28607 = strM28607 == null ? null : m28607(strM28607, string3, c10678M26284.m24591().toString());
            c20066Execute.close();
            i++;
            if (i > 20) {
                throw new ProtocolException(C20778.m46922(i, "Too many follow-up requests: "));
            }
            c20066Execute = this.f34717.m42716(c10678M26284).execute();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28609(C15102 c15102) {
        String str;
        if (!c15102.f43121.m45439() || c15102.f43122 || (str = c15102.f43120) == null) {
            return;
        }
        this.f34719 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m28607(String str, String str2, String str3) {
        if (!m28612(str2, str)) {
            return null;
        }
        String strSubstring = str2.substring(str.length());
        if (str3.endsWith(strSubstring)) {
            return m28613(str3.substring(0, str3.length() - strSubstring.length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m28611(String str, String str2, String str3) {
        if (str3 == null || str2.equals(str3) || !m28612(str, str2)) {
            return str;
        }
        StringBuilder sbM17248 = C7470.m17248(str3);
        sbM17248.append(str.substring(str2.length()));
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m28614(String str, String str2, String str3) {
        return (str == null || str3 == null || str2.equals(str3)) ? str : str.replace(str2, str3);
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m28613(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            str = C13535.m30810(str).toString();
        } catch (IllegalArgumentException unused) {
        }
        while (str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28619(String str, String str2) {
        try {
            str2 = C13535.m30810(str2).toString();
        } catch (IllegalArgumentException unused) {
        }
        C11349 c11349 = new C11349();
        c11349.m26292(str);
        c11349.m26287("MOVE", (AbstractC4643) null);
        C14205 c14205 = new C14205();
        c14205.m32679("DESTINATION", str2);
        c14205.m32679("OVERWRITE", "T");
        c11349.m26288(c14205.m32677());
        C10678 c10678M26284 = c11349.m26284();
        C15102 c15102M28608 = m28608(c10678M26284);
        if (c15102M28608.f43123 && c15102M28608.f43121.m45443() == 403) {
            try {
                c15102M28608.f43121.close();
            } catch (Exception unused2) {
            }
            this.f34719 = null;
            c15102M28608 = m28608(c10678M26284);
        }
        m28609(c15102M28608);
        C19737.m44866(c15102M28608.f43121);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m28612(String str, String str2) {
        char cCharAt;
        if (str2 == null || !str.startsWith(str2)) {
            return false;
        }
        return str.length() == str2.length() || (cCharAt = str.charAt(str2.length())) == '/' || cCharAt == '?' || cCharAt == '#';
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28610(C20066 c20066, int i) {
        do {
            c20066 = c20066.m45444();
            if (c20066 == null) {
                return false;
            }
        } while (c20066.m45443() != i);
        return true;
    }
}
