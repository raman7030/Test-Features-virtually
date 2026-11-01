package p067l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܰ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CA02 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15174 implements InterfaceC16751 {

    /* JADX INFO: renamed from: ᩻ */
    public static final C10541 f43293 = new C10541();

    /* JADX INFO: renamed from: ۜ */
    public static final InterfaceC4410 f43292 = C13128.m30022(C15174.class);

    /* JADX INFO: renamed from: ֫ */
    public C13164 f43294 = null;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f43299 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f43295 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final Object f43297 = new Object();

    /* JADX INFO: renamed from: ܿ */
    public C13164 f43298 = null;

    /* JADX INFO: renamed from: ܳ */
    public final Object f43296 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m34598(InterfaceC20106 interfaceC20106, String str, C10541 c10541) {
        interfaceC20106.mo29602().getClass();
        InterfaceC4410 interfaceC4410 = f43292;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Inserting referral for " + str);
        }
        int iIndexOf = str.indexOf(92, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(92, i);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            String strSubstring = str.substring(1, iIndexOf);
            Locale locale = Locale.ROOT;
            String lowerCase = strSubstring.toLowerCase(locale);
            String strSubstring2 = str.substring(i, iIndexOf2);
            String lowerCase2 = str.substring(0, c10541.mo24305()).toLowerCase(locale);
            interfaceC20106.mo29602().getClass();
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Adding key " + lowerCase2 + " to " + c10541);
            }
            c10541.mo24299(lowerCase.length() + 2 + strSubstring2.length());
            if (lowerCase2.charAt(lowerCase2.length() - 1) != '\\') {
                lowerCase2 = lowerCase2.concat("\\");
            }
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Key is " + lowerCase2);
            }
            C13164 c13164 = this.f43298;
            synchronized (this.f43296) {
                if (c13164 != null) {
                    if (System.currentTimeMillis() + 10000 > c13164.f36994) {
                    }
                    this.f43298 = c13164;
                }
                c13164 = new C13164(((C15410) interfaceC20106.mo29602()).m35112());
                this.f43298 = c13164;
            }
            c13164.f36995.put(lowerCase2, c10541);
            return;
        }
        interfaceC4410.mo9175("Invalid UNC path ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00e5, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    private ConcurrentMapC12768 m34589(InterfaceC20106 interfaceC20106) {
        C21901 c21901;
        InterfaceC4410 interfaceC4410 = f43292;
        interfaceC20106.mo29602().getClass();
        if (interfaceC20106.mo8528().mo18057() != null && !interfaceC20106.mo8528().mo18057().isEmpty()) {
            if (this.f43294 != null && System.currentTimeMillis() > this.f43294.f36994) {
                this.f43294 = null;
            }
            C13164 c13164 = this.f43294;
            if (c13164 != null) {
                return c13164.f36995;
            }
            try {
                String strMo18057 = interfaceC20106.mo8528().mo18057();
                Object objM34596 = m34596(strMo18057, interfaceC20106);
                try {
                    C13164 c13165 = new C13164(((C15410) interfaceC20106.mo29602()).m35112() * 10);
                    if (objM34596 != null) {
                        C21901 c21902 = (C21901) objM34596;
                        c21902.m49425(InterfaceC11172.class);
                        c21901 = c21902;
                    } else {
                        c21901 = null;
                    }
                    C10541 c10541M49424 = c21901 != null ? c21901.m49424(interfaceC20106.mo8531(), "", c21901.m49432(), strMo18057, 0) : null;
                    if (c10541M49424 != null) {
                        c10541M49424.mo24307();
                        C10541 c10541Mo24316 = c10541M49424;
                        do {
                            String lowerCase = c10541Mo24316.mo24298().toLowerCase();
                            c13165.f36995.put(lowerCase, new HashMap());
                            if (interfaceC4410.mo9194()) {
                                interfaceC4410.mo9196("Inserting cache entry for domain " + lowerCase + ": " + c10541Mo24316);
                            }
                            c10541Mo24316 = c10541Mo24316.mo24316();
                        } while (c10541Mo24316 != c10541M49424);
                        this.f43294 = c13165;
                        ConcurrentMapC12768 concurrentMapC12768 = c13165.f36995;
                        if (objM34596 != null) {
                            ((AbstractRunnableC9160) objM34596).m21114();
                        }
                        return concurrentMapC12768;
                    }
                    if (objM34596 != null) {
                        ((AbstractRunnableC9160) objM34596).m21114();
                        return null;
                    }
                } catch (Throwable th) {
                    if (objM34596 != null) {
                        try {
                            ((AbstractRunnableC9160) objM34596).m21114();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9176("getting trusted domains failed: " + interfaceC20106.mo8528().mo18057(), (Exception) e);
                }
                this.f43294 = new C13164(((C15410) interfaceC20106.mo29602()).m35112() * 10);
                interfaceC20106.mo29602().getClass();
                return this.f43294.f36995;
            }
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9176("getting trusted domains failed: " + interfaceC20106.mo8528().mo18057(), (Exception) e);
            }
            this.f43294 = new C13164(((C15410) interfaceC20106.mo29602()).m35112() * 10);
            interfaceC20106.mo29602().getClass();
            return this.f43294.f36995;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m34599(String str, InterfaceC20106 interfaceC20106) {
        synchronized (this.f43299) {
            ConcurrentMapC12768 concurrentMapC12768M34589 = m34589(interfaceC20106);
            if (concurrentMapC12768M34589 == null) {
                return false;
            }
            return concurrentMapC12768M34589.get(str.toLowerCase(Locale.ROOT)) != null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00d5 */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC11172 m34596(String str, InterfaceC20106 interfaceC20106) {
        Throwable th;
        InterfaceC17245 interfaceC17245;
        C21901 c21901M34594;
        InterfaceC4410 interfaceC4410;
        C15174 c15174 = this;
        interfaceC20106.mo29602().getClass();
        interfaceC20106.mo29602().getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        synchronized (c15174.f43297) {
            C13164 c13164 = (C13164) c15174.f43295.get(lowerCase);
            C10541 c10541 = null;
            if (c13164 != null && System.currentTimeMillis() > c13164.f36994) {
                c13164 = null;
            }
            if (c13164 != null) {
                interfaceC17245 = (InterfaceC17245) c13164.f36995.get("dc");
                if (interfaceC17245 != f43293) {
                    interfaceC20106 = interfaceC20106;
                }
            } else {
                C13164 c13165 = new C13164(((C15410) interfaceC20106.mo29602()).m35112());
                try {
                    C21901 c21901 = (C21901) ((C17205) interfaceC20106.mo29600()).m38960(interfaceC20106, str, 0, false, false);
                    c21901.m49425(InterfaceC11172.class);
                    try {
                        synchronized (c21901) {
                            try {
                                C10541 c10541M49424 = c21901.m49424(interfaceC20106.mo8531(), "\\" + lowerCase, str, lowerCase, 1);
                                if (c10541M49424 == null) {
                                    c21901.m21114();
                                    interfaceC20106 = interfaceC20106;
                                    c15174 = c15174;
                                    c13165.f36995.put("dc", f43293);
                                    c15174.f43295.put(lowerCase, c13165);
                                } else {
                                    InterfaceC4410 interfaceC4411 = f43292;
                                    if (interfaceC4411.mo9181()) {
                                        interfaceC4411.mo9183("Got DC referral " + c10541M49424);
                                    }
                                    c10541M49424.mo24307();
                                    c13165.f36995.put("dc", c10541M49424);
                                    c15174.f43295.put(lowerCase, c13165);
                                    c21901.m21114();
                                    c10541 = c10541M49424;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            c21901.m21114();
                                            throw th;
                                        } catch (Throwable th4) {
                                            try {
                                                th.addSuppressed(th4);
                                                throw th;
                                            } catch (IOException e) {
                                                e = e;
                                                InterfaceC4410 interfaceC4412 = f43292;
                                                if (interfaceC4412.mo9181()) {
                                                    interfaceC4412.mo9176("Getting domain controller for " + str + " failed", (Exception) e);
                                                }
                                                c13165.f36995.put("dc", f43293);
                                                interfaceC20106.mo29602().getClass();
                                                c13165.f36995.put("dc", f43293);
                                                c15174.f43295.put(lowerCase, c13165);
                                                interfaceC17245 = c10541;
                                                c21901M34594 = m34594(interfaceC20106, interfaceC17245);
                                                if (c21901M34594 == null) {
                                                    interfaceC4410 = f43292;
                                                    if (interfaceC4410.mo9181()) {
                                                        interfaceC4410.mo9183("Failed to connect to domain controller for ".concat(str));
                                                    }
                                                }
                                                return c21901M34594;
                                            }
                                        }
                                    }
                                }
                                throw th;
                            }
                        }
                        interfaceC17245 = c10541;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (IOException e2) {
                    e = e2;
                    interfaceC20106 = interfaceC20106;
                    c15174 = c15174;
                }
            }
            interfaceC20106 = interfaceC20106;
            interfaceC17245 = c10541;
        }
        c21901M34594 = m34594(interfaceC20106, interfaceC17245);
        if (c21901M34594 == null) {
            interfaceC4410 = f43292;
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Failed to connect to domain controller for ".concat(str));
            }
        }
        return c21901M34594;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21901 m34594(InterfaceC20106 interfaceC20106, InterfaceC17245 interfaceC17245) {
        if (interfaceC17245 != null) {
            InterfaceC17245 next = interfaceC17245;
            do {
                try {
                    String strMo24298 = next.mo24298();
                    InterfaceC4410 interfaceC4410 = f43292;
                    if (strMo24298 != null && !next.mo24298().isEmpty()) {
                        try {
                            InterfaceC13400 interfaceC13400Mo29600 = interfaceC20106.mo29600();
                            String strMo24299 = next.mo24298();
                            if (!interfaceC20106.mo8528().mo18056()) {
                                interfaceC20106.mo29602().getClass();
                            }
                            C21901 c21901 = (C21901) ((C17205) interfaceC13400Mo29600).m38960(interfaceC20106, strMo24299, 0, false, false);
                            c21901.m49425(C21901.class);
                            c21901.m49438();
                            return c21901;
                        } catch (IOException e) {
                            interfaceC4410.mo9176("Connection failed " + next.mo24298(), (Exception) e);
                            next = next.next();
                        }
                    } else {
                        interfaceC4410.mo9183("No server name in referral");
                    }
                } catch (IOException unused) {
                    interfaceC20106.mo29602().getClass();
                }
            } while (next != interfaceC17245);
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC17245 m34593(InterfaceC20106 interfaceC20106, InterfaceC11172 interfaceC11172, String str, String str2, String str3, String str4, String str5) {
        InterfaceC4410 interfaceC4410 = f43292;
        interfaceC20106.mo29602().getClass();
        String strM40053 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            strM40053 = C17588.m40053(strM40053, str5);
        }
        try {
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Fetching referral for " + strM40053);
            }
            C10541 c10541M49424 = ((C21901) interfaceC11172).m49424(interfaceC20106, strM40053, str3, str2, 0);
            if (c10541M49424 == null) {
                return null;
            }
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Referral for " + strM40053 + ": " + c10541M49424);
            }
            c10541M49424.mo24307();
            return c10541M49424;
        } catch (IOException e) {
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9176("Getting referral for " + strM40053 + " failed", (Exception) e);
            }
            interfaceC20106.mo29602().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17245 m34597(InterfaceC20106 interfaceC20106, String str, String str2, String str3) {
        return m34591(interfaceC20106, str, str2, str3, 5);
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC17245 m34591(InterfaceC20106 interfaceC20106, String str, String str2, String str3, int i) {
        String str4;
        InterfaceC17245 interfaceC17245M34590;
        C10541 c10541Mo24316;
        String str5;
        interfaceC20106.mo29602().getClass();
        C10541 c10541M24308 = null;
        if (str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        InterfaceC4410 interfaceC4410 = f43292;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196(C21459.m48622("Resolving \\", lowerCase, "\\", str2, str3 != null ? str3 : ""));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f43299) {
            ConcurrentMapC12768 concurrentMapC12768M34589 = m34589(interfaceC20106);
            if (concurrentMapC12768M34589 != null) {
                if (interfaceC4410.mo9194()) {
                    m34595(concurrentMapC12768M34589);
                }
                String lowerCase2 = str2.toLowerCase();
                Map map = (Map) concurrentMapC12768M34589.get(lowerCase);
                interfaceC17245M34590 = map != null ? m34592(interfaceC20106, lowerCase, lowerCase2, str3, jCurrentTimeMillis, map) : null;
                interfaceC20106.mo29602().getClass();
                str4 = lowerCase2;
            } else {
                str4 = str2;
                interfaceC17245M34590 = null;
            }
        }
        if (interfaceC17245M34590 == null && str3 != null) {
            interfaceC17245M34590 = m34590(jCurrentTimeMillis, lowerCase, str4, str3);
        }
        if (interfaceC17245M34590 != null && interfaceC17245M34590.mo24313()) {
            do {
                c10541Mo24316 = interfaceC17245M34590.mo24316();
                if (interfaceC17245M34590.getPath() != null) {
                    str5 = "\\" + interfaceC17245M34590.getPath();
                } else {
                    str5 = "";
                }
                StringBuilder sbM17248 = C7470.m17248(str5);
                sbM17248.append(str3 != null ? str3.substring(c10541Mo24316.mo24305()) : "");
                String string = sbM17248.toString();
                InterfaceC4410 interfaceC4411 = f43292;
                if (interfaceC4411.mo9181()) {
                    String strMo24298 = c10541Mo24316.mo24298();
                    String strMo24310 = c10541Mo24316.mo24310();
                    String path = c10541Mo24316.getPath();
                    StringBuilder sbM12525 = C5633.m12525("Intermediate referral, server ", strMo24298, " share ", strMo24310, " refPath ");
                    ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, path, " origPath ", str3, " nextPath ");
                    sbM12525.append(string);
                    interfaceC4411.mo9183(sbM12525.toString());
                }
                InterfaceC17245 interfaceC17245M34591 = m34591(interfaceC20106, c10541Mo24316.mo24298(), c10541Mo24316.mo24310(), string, i - 1);
                if (interfaceC17245M34591 != null) {
                    if (interfaceC4411.mo9181()) {
                        interfaceC4411.mo9183("Next referral is " + interfaceC17245M34591);
                    }
                    if (c10541M24308 == null) {
                        c10541M24308 = c10541Mo24316.m24308(interfaceC17245M34591);
                    } else {
                        c10541M24308.m24302(c10541Mo24316.m24308(interfaceC17245M34591));
                    }
                }
            } while (c10541Mo24316 != interfaceC17245M34590);
            if (c10541M24308 != null) {
                return c10541M24308;
            }
        }
        return interfaceC17245M34590;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34595(ConcurrentMapC12768 concurrentMapC12768) {
        for (Map.Entry entry : concurrentMapC12768.entrySet()) {
            String str = "Domain " + ((String) entry.getKey());
            InterfaceC4410 interfaceC4410 = f43292;
            interfaceC4410.mo9196(str);
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                interfaceC4410.mo9196("  Root " + ((String) entry2.getKey()));
                if (((C13164) entry2.getValue()).f36995 != null) {
                    for (Map.Entry entry3 : ((C13164) entry2.getValue()).f36995.entrySet()) {
                        InterfaceC17245 interfaceC17245 = (InterfaceC17245) entry3.getValue();
                        InterfaceC17245 interfaceC17245Mo24316 = interfaceC17245;
                        do {
                            interfaceC4410.mo9196(ASN1Dump.TAB + ((String) entry3.getKey()) + " => " + entry3.getValue());
                            interfaceC17245Mo24316 = interfaceC17245Mo24316.mo24316();
                        } while (interfaceC17245Mo24316 != interfaceC17245);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0138, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC17245 m34592(InterfaceC20106 interfaceC20106, String str, String str2, String str3, long j, Map map) {
        C13164 c13164;
        InterfaceC17245 interfaceC17245M34593;
        String strSubstring;
        InterfaceC17245 interfaceC17245;
        String strM49432;
        C13164 c13165;
        InterfaceC17245 interfaceC17245Mo24316;
        InterfaceC4410 interfaceC4410;
        InterfaceC4410 interfaceC4411 = f43292;
        if (interfaceC4411.mo9194()) {
            interfaceC4411.mo9196("Is a domain referral for " + str);
        }
        if (interfaceC4411.mo9194()) {
            interfaceC4411.mo9196("Resolving root " + str2);
        }
        C13164 c13166 = (C13164) map.get(str2);
        InterfaceC17245 interfaceC17246 = null;
        if (c13166 == null || j <= c13166.f36994) {
            c13164 = c13166;
        } else {
            if (interfaceC4411.mo9181()) {
                interfaceC4411.mo9183("Removing expired " + c13166.f36995);
            }
            map.remove(str2);
            c13164 = null;
        }
        if (c13164 == null) {
            interfaceC4411.mo9196("Loadings roots");
            Object objM34596 = m34596(str, interfaceC20106);
            try {
                if (objM34596 == null) {
                    if (interfaceC4411.mo9181()) {
                        interfaceC4411.mo9183("Failed to get domain controller for ".concat(str));
                    }
                    if (objM34596 != null) {
                        ((AbstractRunnableC9160) objM34596).m21114();
                    }
                } else {
                    C21901 c21901 = (C21901) objM34596;
                    c21901.m49425(InterfaceC11172.class);
                    synchronized (c21901) {
                        try {
                            c21901.m49438();
                            strM49432 = c21901.m49432();
                        } catch (IOException e) {
                            f43292.mo9178("Failed to connect to domain controller", (Throwable) e);
                            strM49432 = str;
                        }
                        interfaceC17245M34593 = m34593(interfaceC20106, c21901, str, str, strM49432, str2, null);
                    }
                    ((AbstractRunnableC9160) objM34596).m21114();
                    InterfaceC4410 interfaceC4412 = f43292;
                    if (interfaceC4412.mo9194()) {
                        interfaceC4412.mo9196("Have DC referral " + interfaceC17245M34593);
                    }
                    if (interfaceC17245M34593 != null) {
                        C10541 c10541 = (C10541) interfaceC17245M34593;
                        if (str.equals(c10541.mo24298()) && str2.equals(c10541.mo24310())) {
                            interfaceC4412.mo9199("Dropping self-referential referral " + interfaceC17245M34593);
                        }
                    }
                    if (interfaceC17245M34593 != null) {
                        c13165 = new C13164(((C15410) interfaceC20106.mo29602()).m35112());
                        c13165.f36995.put("\\", interfaceC17245M34593);
                        interfaceC17245Mo24316 = interfaceC17245M34593;
                        do {
                            C10541 c10542 = (C10541) interfaceC17245Mo24316;
                            c10542.m24301(c13165.f36995);
                            c10542.mo24304();
                            interfaceC17245Mo24316 = c10542.mo24316();
                        } while (interfaceC17245Mo24316 != interfaceC17245M34593);
                        interfaceC4410 = f43292;
                        if (interfaceC4410.mo9181()) {
                            interfaceC4410.mo9183("Have referral " + interfaceC17245M34593);
                        }
                        map.put(str2, c13165);
                        c13164 = c13165;
                    } else {
                        map.put(str2, new C23892(((C15410) interfaceC20106.mo29602()).m35112()));
                    }
                }
                interfaceC17245M34593 = null;
                if (interfaceC17245M34593 != null) {
                    c13165 = new C13164(((C15410) interfaceC20106.mo29602()).m35112());
                    c13165.f36995.put("\\", interfaceC17245M34593);
                    interfaceC17245Mo24316 = interfaceC17245M34593;
                    do {
                        C10541 c10543 = (C10541) interfaceC17245Mo24316;
                        c10543.m24301(c13165.f36995);
                        c10543.mo24304();
                        interfaceC17245Mo24316 = c10543.mo24316();
                    } while (interfaceC17245Mo24316 != interfaceC17245M34593);
                    interfaceC4410 = f43292;
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Have referral " + interfaceC17245M34593);
                    }
                    map.put(str2, c13165);
                    c13164 = c13165;
                } else {
                    map.put(str2, new C23892(((C15410) interfaceC20106.mo29602()).m35112()));
                }
            } catch (Throwable th) {
                if (objM34596 == null) {
                    throw th;
                }
                try {
                    ((AbstractRunnableC9160) objM34596).m21114();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (c13164 instanceof C23892) {
            interfaceC17245M34593 = null;
            c13164 = null;
        } else {
            interfaceC17245M34593 = (InterfaceC17245) c13164.f36995.get("\\");
        }
        if (c13164 == null) {
            return interfaceC17245M34593;
        }
        String strSubstring2 = "\\";
        InterfaceC4410 interfaceC4413 = f43292;
        if (str3 == null || str3.length() <= 1) {
            strSubstring = "\\";
        } else {
            strSubstring = C9417.m21911(1, str3) == '\\' ? C17073.m38720(1, 0, str3) : str3;
        }
        if (interfaceC4413.mo9194()) {
            interfaceC4413.mo9196("Initial link is " + strSubstring);
        }
        if (interfaceC17245M34593 == null || !strSubstring.equals(interfaceC17245M34593.mo24306())) {
            while (true) {
                interfaceC17245 = (InterfaceC17245) c13164.f36995.get(strSubstring);
                if (interfaceC17245 == null) {
                    int iLastIndexOf = strSubstring.lastIndexOf(92);
                    if (iLastIndexOf <= 0) {
                        if (!interfaceC4413.mo9194()) {
                            break;
                        }
                        interfaceC4413.mo9196("Not found ".concat(strSubstring));
                        break;
                    }
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                } else {
                    if (!interfaceC4413.mo9194()) {
                        break;
                    }
                    interfaceC4413.mo9196("Found at " + strSubstring);
                    break;
                }
            }
        } else {
            interfaceC17245 = interfaceC17245M34593;
        }
        String str4 = strSubstring;
        if (interfaceC17245 != null && j > interfaceC17245.mo24314()) {
            if (interfaceC4413.mo9194()) {
                interfaceC4413.mo9196("Expiring links " + str4);
            }
            c13164.f36995.remove(str4);
            interfaceC17245 = null;
        }
        if (interfaceC17245 != null) {
            if (interfaceC4413.mo9194()) {
                interfaceC4413.mo9196("Have cached referral for " + interfaceC17245.mo24306() + " " + interfaceC17245);
            }
            return interfaceC17245;
        }
        interfaceC20106.mo29602().getClass();
        C21901 c21901M34594 = m34594(interfaceC20106, interfaceC17245M34593);
        if (c21901M34594 != null) {
            try {
                InterfaceC17245 interfaceC17245M34594 = m34593(interfaceC20106, c21901M34594, str, str, c21901M34594.m49432(), str2, str3);
                if (interfaceC17245M34594 != null) {
                    interfaceC20106.mo29602().getClass();
                    C10541 c10544 = (C10541) interfaceC17245M34594;
                    c10544.mo24299(str.length() + 2 + str2.length());
                    if (c10544.mo24305() > (str3 != null ? str3.length() : 0)) {
                        interfaceC4413.mo9175("Consumed more than we provided");
                    }
                    if (str3 != null && c10544.mo24305() > 0) {
                        strSubstring2 = str3.substring(0, c10544.mo24305());
                    }
                    c10544.m24309(strSubstring2);
                    if (interfaceC4413.mo9194()) {
                        interfaceC4413.mo9196("Have referral " + interfaceC17245M34594);
                    }
                    c13164.f36995.put(strSubstring2, interfaceC17245M34594);
                } else {
                    interfaceC4413.mo9183("No referral found for " + str4);
                }
                interfaceC17246 = interfaceC17245M34594;
            } catch (Throwable th3) {
                try {
                    c21901M34594.m21114();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else if (c21901M34594 == null) {
            return null;
        }
        c21901M34594.m21114();
        return interfaceC17246;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC17245 m34590(long j, String str, String str2, String str3) {
        C13164 c13164;
        boolean zStartsWith;
        InterfaceC4410 interfaceC4410 = f43292;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("No match for domain based root, checking standalone " + str);
        }
        synchronized (this.f43296) {
            c13164 = this.f43298;
            if (c13164 == null || j > c13164.f36994) {
                c13164 = new C13164(0L);
            }
            this.f43298 = c13164;
        }
        String strM47154 = C20865.m47154("\\", str, "\\", str2);
        if (!str3.equals("\\")) {
            strM47154 = C17588.m40053(strM47154, str3);
        }
        String lowerCase = strM47154.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str4 : c13164.f36995.keySet()) {
            int length2 = str4.length();
            if (length2 == length) {
                zStartsWith = str4.equals(lowerCase);
            } else if (length2 < length) {
                zStartsWith = lowerCase.startsWith(str4);
            } else {
                InterfaceC4410 interfaceC4411 = f43292;
                if (interfaceC4411.mo9194()) {
                    interfaceC4411.mo9196(lowerCase + " vs. " + str4);
                }
                zStartsWith = false;
            }
            if (zStartsWith) {
                InterfaceC4410 interfaceC4412 = f43292;
                if (interfaceC4412.mo9181()) {
                    interfaceC4412.mo9183("Matched ".concat(str4));
                }
                return (InterfaceC17245) c13164.f36995.get(str4);
            }
        }
        InterfaceC4410 interfaceC4413 = f43292;
        if (!interfaceC4413.mo9194()) {
            return null;
        }
        interfaceC4413.mo9196("No match for ".concat(lowerCase));
        return null;
    }
}
