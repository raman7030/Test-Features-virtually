package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܰ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CA02 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13474 implements InterfaceC15133 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C8599 f40223 = new C8599();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f40222 = C11321.m27961(C13474.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11359 f40224 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f40229 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f40225 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f40227 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11359 f40228 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f40226 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m32496(InterfaceC18663 interfaceC18663, String str, C8599 c8599) {
        interfaceC18663.mo27540().getClass();
        InterfaceC2148 interfaceC2148 = f40222;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Inserting referral for " + str);
        }
        int iIndexOf = str.indexOf(92, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(92, i);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            String strSubstring = str.substring(1, iIndexOf);
            Locale locale = Locale.ROOT;
            String lowerCase = strSubstring.toLowerCase(locale);
            String strSubstring2 = str.substring(i, iIndexOf2);
            String lowerCase2 = str.substring(0, c8599.mo22336()).toLowerCase(locale);
            interfaceC18663.mo27540().getClass();
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Adding key " + lowerCase2 + " to " + c8599);
            }
            c8599.mo22330(lowerCase.length() + 2 + strSubstring2.length());
            if (lowerCase2.charAt(lowerCase2.length() - 1) != '\\') {
                lowerCase2 = lowerCase2.concat("\\");
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Key is " + lowerCase2);
            }
            C11359 c11359 = this.f40228;
            synchronized (this.f40226) {
                if (c11359 != null) {
                    if (System.currentTimeMillis() + 10000 > c11359.f33997) {
                    }
                    this.f40228 = c11359;
                }
                c11359 = new C11359(((C13722) interfaceC18663.mo27540()).m32998());
                this.f40228 = c11359;
            }
            c11359.f33998.put(lowerCase2, c8599);
            return;
        }
        interfaceC2148.mo7080("Invalid UNC path ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00e5, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ConcurrentMapC10942 m32487(InterfaceC18663 interfaceC18663) {
        C20552 c20552;
        InterfaceC2148 interfaceC2148 = f40222;
        interfaceC18663.mo27540().getClass();
        if (interfaceC18663.mo6355().mo16138() != null && !interfaceC18663.mo6355().mo16138().isEmpty()) {
            if (this.f40224 != null && System.currentTimeMillis() > this.f40224.f33997) {
                this.f40224 = null;
            }
            C11359 c11359 = this.f40224;
            if (c11359 != null) {
                return c11359.f33998;
            }
            try {
                String strMo16138 = interfaceC18663.mo6355().mo16138();
                Object objM32494 = m32494(strMo16138, interfaceC18663);
                try {
                    C11359 c113510 = new C11359(((C13722) interfaceC18663.mo27540()).m32998() * 10);
                    if (objM32494 != null) {
                        C20552 c20553 = (C20552) objM32494;
                        c20553.m47101(InterfaceC9263.class);
                        c20552 = c20553;
                    } else {
                        c20552 = null;
                    }
                    C8599 c8599M47100 = c20552 != null ? c20552.m47100(interfaceC18663.mo6358(), "", c20552.m47108(), strMo16138, 0) : null;
                    if (c8599M47100 != null) {
                        c8599M47100.mo22338();
                        C8599 c8599Mo22347 = c8599M47100;
                        do {
                            String lowerCase = c8599Mo22347.mo22329().toLowerCase();
                            c113510.f33998.put(lowerCase, new HashMap());
                            if (interfaceC2148.mo7099()) {
                                interfaceC2148.mo7101("Inserting cache entry for domain " + lowerCase + ": " + c8599Mo22347);
                            }
                            c8599Mo22347 = c8599Mo22347.mo22347();
                        } while (c8599Mo22347 != c8599M47100);
                        this.f40224 = c113510;
                        ConcurrentMapC10942 concurrentMapC10942 = c113510.f33998;
                        if (objM32494 != null) {
                            ((AbstractRunnableC7146) objM32494).m19171();
                        }
                        return concurrentMapC10942;
                    }
                    if (objM32494 != null) {
                        ((AbstractRunnableC7146) objM32494).m19171();
                        return null;
                    }
                } catch (Throwable th) {
                    if (objM32494 != null) {
                        try {
                            ((AbstractRunnableC7146) objM32494).m19171();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7081("getting trusted domains failed: " + interfaceC18663.mo6355().mo16138(), (Exception) e);
                }
                this.f40224 = new C11359(((C13722) interfaceC18663.mo27540()).m32998() * 10);
                interfaceC18663.mo27540().getClass();
                return this.f40224.f33998;
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7081("getting trusted domains failed: " + interfaceC18663.mo6355().mo16138(), (Exception) e);
            }
            this.f40224 = new C11359(((C13722) interfaceC18663.mo27540()).m32998() * 10);
            interfaceC18663.mo27540().getClass();
            return this.f40224.f33998;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32497(String str, InterfaceC18663 interfaceC18663) {
        synchronized (this.f40229) {
            ConcurrentMapC10942 concurrentMapC10942M32487 = m32487(interfaceC18663);
            if (concurrentMapC10942M32487 == null) {
                return false;
            }
            return concurrentMapC10942M32487.get(str.toLowerCase(Locale.ROOT)) != null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00d5 */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC9263 m32494(String str, InterfaceC18663 interfaceC18663) {
        Throwable th;
        InterfaceC15653 interfaceC15653;
        C20552 c20552M32492;
        InterfaceC2148 interfaceC2148;
        C13474 c13474 = this;
        interfaceC18663.mo27540().getClass();
        interfaceC18663.mo27540().getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        synchronized (c13474.f40227) {
            C11359 c11359 = (C11359) c13474.f40225.get(lowerCase);
            C8599 c8599 = null;
            if (c11359 != null && System.currentTimeMillis() > c11359.f33997) {
                c11359 = null;
            }
            if (c11359 != null) {
                interfaceC15653 = (InterfaceC15653) c11359.f33998.get("dc");
                if (interfaceC15653 != f40223) {
                    interfaceC18663 = interfaceC18663;
                }
            } else {
                C11359 c113510 = new C11359(((C13722) interfaceC18663.mo27540()).m32998());
                try {
                    C20552 c20552 = (C20552) ((C15611) interfaceC18663.mo27538()).m36794(interfaceC18663, str, 0, false, false);
                    c20552.m47101(InterfaceC9263.class);
                    try {
                        synchronized (c20552) {
                            try {
                                C8599 c8599M47100 = c20552.m47100(interfaceC18663.mo6358(), "\\" + lowerCase, str, lowerCase, 1);
                                if (c8599M47100 == null) {
                                    c20552.m19171();
                                    interfaceC18663 = interfaceC18663;
                                    c13474 = c13474;
                                    c113510.f33998.put("dc", f40223);
                                    c13474.f40225.put(lowerCase, c113510);
                                } else {
                                    InterfaceC2148 interfaceC2149 = f40222;
                                    if (interfaceC2149.mo7086()) {
                                        interfaceC2149.mo7088("Got DC referral " + c8599M47100);
                                    }
                                    c8599M47100.mo22338();
                                    c113510.f33998.put("dc", c8599M47100);
                                    c13474.f40225.put(lowerCase, c113510);
                                    c20552.m19171();
                                    c8599 = c8599M47100;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            c20552.m19171();
                                            throw th;
                                        } catch (Throwable th4) {
                                            try {
                                                th.addSuppressed(th4);
                                                throw th;
                                            } catch (IOException e) {
                                                e = e;
                                                InterfaceC2148 interfaceC21410 = f40222;
                                                if (interfaceC21410.mo7086()) {
                                                    interfaceC21410.mo7081("Getting domain controller for " + str + " failed", (Exception) e);
                                                }
                                                c113510.f33998.put("dc", f40223);
                                                interfaceC18663.mo27540().getClass();
                                                c113510.f33998.put("dc", f40223);
                                                c13474.f40225.put(lowerCase, c113510);
                                                interfaceC15653 = c8599;
                                                c20552M32492 = m32492(interfaceC18663, interfaceC15653);
                                                if (c20552M32492 == null) {
                                                    interfaceC2148 = f40222;
                                                    if (interfaceC2148.mo7086()) {
                                                        interfaceC2148.mo7088("Failed to connect to domain controller for ".concat(str));
                                                    }
                                                }
                                                return c20552M32492;
                                            }
                                        }
                                    }
                                }
                                throw th;
                            }
                        }
                        interfaceC15653 = c8599;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (IOException e2) {
                    e = e2;
                    interfaceC18663 = interfaceC18663;
                    c13474 = c13474;
                }
            }
            interfaceC18663 = interfaceC18663;
            interfaceC15653 = c8599;
        }
        c20552M32492 = m32492(interfaceC18663, interfaceC15653);
        if (c20552M32492 == null) {
            interfaceC2148 = f40222;
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Failed to connect to domain controller for ".concat(str));
            }
        }
        return c20552M32492;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20552 m32492(InterfaceC18663 interfaceC18663, InterfaceC15653 interfaceC15653) {
        if (interfaceC15653 != null) {
            InterfaceC15653 next = interfaceC15653;
            do {
                try {
                    String strMo22329 = next.mo22329();
                    InterfaceC2148 interfaceC2148 = f40222;
                    if (strMo22329 != null && !next.mo22329().isEmpty()) {
                        try {
                            InterfaceC11607 interfaceC11607Mo27538 = interfaceC18663.mo27538();
                            String strMo223210 = next.mo22329();
                            if (!interfaceC18663.mo6355().mo16137()) {
                                interfaceC18663.mo27540().getClass();
                            }
                            C20552 c20552 = (C20552) ((C15611) interfaceC11607Mo27538).m36794(interfaceC18663, strMo223210, 0, false, false);
                            c20552.m47101(C20552.class);
                            c20552.m47114();
                            return c20552;
                        } catch (IOException e) {
                            interfaceC2148.mo7081("Connection failed " + next.mo22329(), (Exception) e);
                            next = next.next();
                        }
                    } else {
                        interfaceC2148.mo7088("No server name in referral");
                    }
                } catch (IOException unused) {
                    interfaceC18663.mo27540().getClass();
                }
            } while (next != interfaceC15653);
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15653 m32491(InterfaceC18663 interfaceC18663, InterfaceC9263 interfaceC9263, String str, String str2, String str3, String str4, String str5) {
        InterfaceC2148 interfaceC2148 = f40222;
        interfaceC18663.mo27540().getClass();
        String strM37867 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            strM37867 = C16014.m37867(strM37867, str5);
        }
        try {
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Fetching referral for " + strM37867);
            }
            C8599 c8599M47100 = ((C20552) interfaceC9263).m47100(interfaceC18663, strM37867, str3, str2, 0);
            if (c8599M47100 == null) {
                return null;
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Referral for " + strM37867 + ": " + c8599M47100);
            }
            c8599M47100.mo22338();
            return c8599M47100;
        } catch (IOException e) {
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7081("Getting referral for " + strM37867 + " failed", (Exception) e);
            }
            interfaceC18663.mo27540().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15653 m32495(InterfaceC18663 interfaceC18663, String str, String str2, String str3) {
        return m32489(interfaceC18663, str, str2, str3, 5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC15653 m32489(InterfaceC18663 interfaceC18663, String str, String str2, String str3, int i) {
        String str4;
        InterfaceC15653 interfaceC15653M32488;
        C8599 c8599Mo22347;
        String str5;
        interfaceC18663.mo27540().getClass();
        C8599 c8599M22339 = null;
        if (str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        InterfaceC2148 interfaceC2148 = f40222;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101(C20087.m46306("Resolving \\", lowerCase, "\\", str2, str3 != null ? str3 : ""));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f40229) {
            ConcurrentMapC10942 concurrentMapC10942M32487 = m32487(interfaceC18663);
            if (concurrentMapC10942M32487 != null) {
                if (interfaceC2148.mo7099()) {
                    m32493(concurrentMapC10942M32487);
                }
                String lowerCase2 = str2.toLowerCase();
                Map map = (Map) concurrentMapC10942M32487.get(lowerCase);
                interfaceC15653M32488 = map != null ? m32490(interfaceC18663, lowerCase, lowerCase2, str3, jCurrentTimeMillis, map) : null;
                interfaceC18663.mo27540().getClass();
                str4 = lowerCase2;
            } else {
                str4 = str2;
                interfaceC15653M32488 = null;
            }
        }
        if (interfaceC15653M32488 == null && str3 != null) {
            interfaceC15653M32488 = m32488(jCurrentTimeMillis, lowerCase, str4, str3);
        }
        if (interfaceC15653M32488 != null && interfaceC15653M32488.mo22344()) {
            do {
                c8599Mo22347 = interfaceC15653M32488.mo22347();
                if (interfaceC15653M32488.getPath() != null) {
                    str5 = "\\" + interfaceC15653M32488.getPath();
                } else {
                    str5 = "";
                }
                StringBuilder sbM15339 = C5368.m15339(str5);
                sbM15339.append(str3 != null ? str3.substring(c8599Mo22347.mo22336()) : "");
                String string = sbM15339.toString();
                InterfaceC2148 interfaceC2149 = f40222;
                if (interfaceC2149.mo7086()) {
                    String strMo22329 = c8599Mo22347.mo22329();
                    String strMo22341 = c8599Mo22347.mo22341();
                    String path = c8599Mo22347.getPath();
                    StringBuilder sbM10501 = C3435.m10501("Intermediate referral, server ", strMo22329, " share ", strMo22341, " refPath ");
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10501, path, " origPath ", str3, " nextPath ");
                    sbM10501.append(string);
                    interfaceC2149.mo7088(sbM10501.toString());
                }
                InterfaceC15653 interfaceC15653M32489 = m32489(interfaceC18663, c8599Mo22347.mo22329(), c8599Mo22347.mo22341(), string, i - 1);
                if (interfaceC15653M32489 != null) {
                    if (interfaceC2149.mo7086()) {
                        interfaceC2149.mo7088("Next referral is " + interfaceC15653M32489);
                    }
                    if (c8599M22339 == null) {
                        c8599M22339 = c8599Mo22347.m22339(interfaceC15653M32489);
                    } else {
                        c8599M22339.m22333(c8599Mo22347.m22339(interfaceC15653M32489));
                    }
                }
            } while (c8599Mo22347 != interfaceC15653M32488);
            if (c8599M22339 != null) {
                return c8599M22339;
            }
        }
        return interfaceC15653M32488;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32493(ConcurrentMapC10942 concurrentMapC10942) {
        for (Map.Entry entry : concurrentMapC10942.entrySet()) {
            String str = "Domain " + ((String) entry.getKey());
            InterfaceC2148 interfaceC2148 = f40222;
            interfaceC2148.mo7101(str);
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                interfaceC2148.mo7101("  Root " + ((String) entry2.getKey()));
                if (((C11359) entry2.getValue()).f33998 != null) {
                    for (Map.Entry entry3 : ((C11359) entry2.getValue()).f33998.entrySet()) {
                        InterfaceC15653 interfaceC15653 = (InterfaceC15653) entry3.getValue();
                        InterfaceC15653 interfaceC15653Mo22347 = interfaceC15653;
                        do {
                            interfaceC2148.mo7101(ASN1Dump.TAB + ((String) entry3.getKey()) + " => " + entry3.getValue());
                            interfaceC15653Mo22347 = interfaceC15653Mo22347.mo22347();
                        } while (interfaceC15653Mo22347 != interfaceC15653);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0138, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC15653 m32490(InterfaceC18663 interfaceC18663, String str, String str2, String str3, long j, Map map) {
        C11359 c11359;
        InterfaceC15653 interfaceC15653M32491;
        String strSubstring;
        InterfaceC15653 interfaceC15653;
        String strM47108;
        C11359 c113510;
        InterfaceC15653 interfaceC15653Mo22347;
        InterfaceC2148 interfaceC2148;
        InterfaceC2148 interfaceC2149 = f40222;
        if (interfaceC2149.mo7099()) {
            interfaceC2149.mo7101("Is a domain referral for " + str);
        }
        if (interfaceC2149.mo7099()) {
            interfaceC2149.mo7101("Resolving root " + str2);
        }
        C11359 c113511 = (C11359) map.get(str2);
        InterfaceC15653 interfaceC15654 = null;
        if (c113511 == null || j <= c113511.f33997) {
            c11359 = c113511;
        } else {
            if (interfaceC2149.mo7086()) {
                interfaceC2149.mo7088("Removing expired " + c113511.f33998);
            }
            map.remove(str2);
            c11359 = null;
        }
        if (c11359 == null) {
            interfaceC2149.mo7101("Loadings roots");
            Object objM32494 = m32494(str, interfaceC18663);
            try {
                if (objM32494 == null) {
                    if (interfaceC2149.mo7086()) {
                        interfaceC2149.mo7088("Failed to get domain controller for ".concat(str));
                    }
                    if (objM32494 != null) {
                        ((AbstractRunnableC7146) objM32494).m19171();
                    }
                } else {
                    C20552 c20552 = (C20552) objM32494;
                    c20552.m47101(InterfaceC9263.class);
                    synchronized (c20552) {
                        try {
                            c20552.m47114();
                            strM47108 = c20552.m47108();
                        } catch (IOException e) {
                            f40222.mo7083("Failed to connect to domain controller", (Throwable) e);
                            strM47108 = str;
                        }
                        interfaceC15653M32491 = m32491(interfaceC18663, c20552, str, str, strM47108, str2, null);
                    }
                    ((AbstractRunnableC7146) objM32494).m19171();
                    InterfaceC2148 interfaceC21410 = f40222;
                    if (interfaceC21410.mo7099()) {
                        interfaceC21410.mo7101("Have DC referral " + interfaceC15653M32491);
                    }
                    if (interfaceC15653M32491 != null) {
                        C8599 c8599 = (C8599) interfaceC15653M32491;
                        if (str.equals(c8599.mo22329()) && str2.equals(c8599.mo22341())) {
                            interfaceC21410.mo7104("Dropping self-referential referral " + interfaceC15653M32491);
                        }
                    }
                    if (interfaceC15653M32491 != null) {
                        c113510 = new C11359(((C13722) interfaceC18663.mo27540()).m32998());
                        c113510.f33998.put("\\", interfaceC15653M32491);
                        interfaceC15653Mo22347 = interfaceC15653M32491;
                        do {
                            C8599 c85910 = (C8599) interfaceC15653Mo22347;
                            c85910.m22332(c113510.f33998);
                            c85910.mo22335();
                            interfaceC15653Mo22347 = c85910.mo22347();
                        } while (interfaceC15653Mo22347 != interfaceC15653M32491);
                        interfaceC2148 = f40222;
                        if (interfaceC2148.mo7086()) {
                            interfaceC2148.mo7088("Have referral " + interfaceC15653M32491);
                        }
                        map.put(str2, c113510);
                        c11359 = c113510;
                    } else {
                        map.put(str2, new C22647(((C13722) interfaceC18663.mo27540()).m32998()));
                    }
                }
                interfaceC15653M32491 = null;
                if (interfaceC15653M32491 != null) {
                    c113510 = new C11359(((C13722) interfaceC18663.mo27540()).m32998());
                    c113510.f33998.put("\\", interfaceC15653M32491);
                    interfaceC15653Mo22347 = interfaceC15653M32491;
                    do {
                        C8599 c85911 = (C8599) interfaceC15653Mo22347;
                        c85911.m22332(c113510.f33998);
                        c85911.mo22335();
                        interfaceC15653Mo22347 = c85911.mo22347();
                    } while (interfaceC15653Mo22347 != interfaceC15653M32491);
                    interfaceC2148 = f40222;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Have referral " + interfaceC15653M32491);
                    }
                    map.put(str2, c113510);
                    c11359 = c113510;
                } else {
                    map.put(str2, new C22647(((C13722) interfaceC18663.mo27540()).m32998()));
                }
            } catch (Throwable th) {
                if (objM32494 == null) {
                    throw th;
                }
                try {
                    ((AbstractRunnableC7146) objM32494).m19171();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (c11359 instanceof C22647) {
            interfaceC15653M32491 = null;
            c11359 = null;
        } else {
            interfaceC15653M32491 = (InterfaceC15653) c11359.f33998.get("\\");
        }
        if (c11359 == null) {
            return interfaceC15653M32491;
        }
        String strSubstring2 = "\\";
        InterfaceC2148 interfaceC21411 = f40222;
        if (str3 == null || str3.length() <= 1) {
            strSubstring = "\\";
        } else {
            strSubstring = C7416.m19937(1, str3) == '\\' ? C15472.m36561(1, 0, str3) : str3;
        }
        if (interfaceC21411.mo7099()) {
            interfaceC21411.mo7101("Initial link is " + strSubstring);
        }
        if (interfaceC15653M32491 == null || !strSubstring.equals(interfaceC15653M32491.mo22337())) {
            while (true) {
                interfaceC15653 = (InterfaceC15653) c11359.f33998.get(strSubstring);
                if (interfaceC15653 == null) {
                    int iLastIndexOf = strSubstring.lastIndexOf(92);
                    if (iLastIndexOf <= 0) {
                        if (!interfaceC21411.mo7099()) {
                            break;
                        }
                        interfaceC21411.mo7101("Not found ".concat(strSubstring));
                        break;
                    }
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                } else {
                    if (!interfaceC21411.mo7099()) {
                        break;
                    }
                    interfaceC21411.mo7101("Found at " + strSubstring);
                    break;
                }
            }
        } else {
            interfaceC15653 = interfaceC15653M32491;
        }
        String str4 = strSubstring;
        if (interfaceC15653 != null && j > interfaceC15653.mo22345()) {
            if (interfaceC21411.mo7099()) {
                interfaceC21411.mo7101("Expiring links " + str4);
            }
            c11359.f33998.remove(str4);
            interfaceC15653 = null;
        }
        if (interfaceC15653 != null) {
            if (interfaceC21411.mo7099()) {
                interfaceC21411.mo7101("Have cached referral for " + interfaceC15653.mo22337() + " " + interfaceC15653);
            }
            return interfaceC15653;
        }
        interfaceC18663.mo27540().getClass();
        C20552 c20552M32492 = m32492(interfaceC18663, interfaceC15653M32491);
        if (c20552M32492 != null) {
            try {
                InterfaceC15653 interfaceC15653M32492 = m32491(interfaceC18663, c20552M32492, str, str, c20552M32492.m47108(), str2, str3);
                if (interfaceC15653M32492 != null) {
                    interfaceC18663.mo27540().getClass();
                    C8599 c85912 = (C8599) interfaceC15653M32492;
                    c85912.mo22330(str.length() + 2 + str2.length());
                    if (c85912.mo22336() > (str3 != null ? str3.length() : 0)) {
                        interfaceC21411.mo7080("Consumed more than we provided");
                    }
                    if (str3 != null && c85912.mo22336() > 0) {
                        strSubstring2 = str3.substring(0, c85912.mo22336());
                    }
                    c85912.m22340(strSubstring2);
                    if (interfaceC21411.mo7099()) {
                        interfaceC21411.mo7101("Have referral " + interfaceC15653M32492);
                    }
                    c11359.f33998.put(strSubstring2, interfaceC15653M32492);
                } else {
                    interfaceC21411.mo7088("No referral found for " + str4);
                }
                interfaceC15654 = interfaceC15653M32492;
            } catch (Throwable th3) {
                try {
                    c20552M32492.m19171();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else if (c20552M32492 == null) {
            return null;
        }
        c20552M32492.m19171();
        return interfaceC15654;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC15653 m32488(long j, String str, String str2, String str3) {
        C11359 c11359;
        boolean zStartsWith;
        InterfaceC2148 interfaceC2148 = f40222;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("No match for domain based root, checking standalone " + str);
        }
        synchronized (this.f40226) {
            c11359 = this.f40228;
            if (c11359 == null || j > c11359.f33997) {
                c11359 = new C11359(0L);
            }
            this.f40228 = c11359;
        }
        String strM44858 = C19462.m44858("\\", str, "\\", str2);
        if (!str3.equals("\\")) {
            strM44858 = C16014.m37867(strM44858, str3);
        }
        String lowerCase = strM44858.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str4 : c11359.f33998.keySet()) {
            int length2 = str4.length();
            if (length2 == length) {
                zStartsWith = str4.equals(lowerCase);
            } else if (length2 < length) {
                zStartsWith = lowerCase.startsWith(str4);
            } else {
                InterfaceC2148 interfaceC2149 = f40222;
                if (interfaceC2149.mo7099()) {
                    interfaceC2149.mo7101(lowerCase + " vs. " + str4);
                }
                zStartsWith = false;
            }
            if (zStartsWith) {
                InterfaceC2148 interfaceC21410 = f40222;
                if (interfaceC21410.mo7086()) {
                    interfaceC21410.mo7088("Matched ".concat(str4));
                }
                return (InterfaceC15653) c11359.f33998.get(str4);
            }
        }
        InterfaceC2148 interfaceC21411 = f40222;
        if (!interfaceC21411.mo7099()) {
            return null;
        }
        interfaceC21411.mo7101("No match for ".concat(lowerCase));
        return null;
    }
}
