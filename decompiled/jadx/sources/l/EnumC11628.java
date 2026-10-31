package l;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.am;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۨۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9W5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11628 {
    TYPE_IGNORE("ignore", 0),
    TYPE_A(am.av, 1),
    TYPE_NS("ns", 2),
    TYPE_MD("md", 3),
    TYPE_MF("mf", 4),
    TYPE_CNAME("cname", 5),
    TYPE_SOA("soa", 6),
    TYPE_MB("mb", 7),
    TYPE_MG("mg", 8),
    TYPE_MR("mr", 9),
    TYPE_NULL("null", 10),
    TYPE_WKS("wks", 11),
    TYPE_PTR("ptr", 12),
    TYPE_HINFO("hinfo", 13),
    TYPE_MINFO("minfo", 14),
    TYPE_MX("mx", 15),
    TYPE_TXT("txt", 16),
    TYPE_RP("rp", 17),
    TYPE_AFSDB("afsdb", 18),
    TYPE_X25("x25", 19),
    TYPE_ISDN("isdn", 20),
    TYPE_RT("rt", 21),
    TYPE_NSAP("nsap", 22),
    TYPE_NSAP_PTR("nsap-otr", 23),
    TYPE_SIG("sig", 24),
    TYPE_KEY("key", 25),
    TYPE_PX("px", 26),
    TYPE_GPOS("gpos", 27),
    TYPE_AAAA("aaaa", 28),
    TYPE_LOC("loc", 29),
    TYPE_NXT("nxt", 30),
    TYPE_EID("eid", 31),
    TYPE_NIMLOC("nimloc", 32),
    TYPE_SRV("srv", 33),
    TYPE_ATMA("atma", 34),
    TYPE_NAPTR("naptr", 35),
    TYPE_KX("kx", 36),
    TYPE_CERT("cert", 37),
    TYPE_A6("a6", 38),
    TYPE_DNAME("dname", 39),
    TYPE_SINK("sink", 40),
    TYPE_OPT("opt", 41),
    TYPE_APL("apl", 42),
    TYPE_DS("ds", 43),
    TYPE_SSHFP("sshfp", 44),
    TYPE_RRSIG("rrsig", 46),
    TYPE_NSEC("nsec", 47),
    TYPE_DNSKEY("dnskey", 48),
    TYPE_UINFO("uinfo", 100),
    TYPE_UID(DhizukuVariables.PARAM_CLIENT_UID, 101),
    TYPE_GID("gid", IShizukuService.Stub.TRANSACTION_attachUserService),
    TYPE_UNSPEC("unspec", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged),
    TYPE_TKEY("tkey", 249),
    TYPE_TSIG("tsig", 250),
    TYPE_IXFR("ixfr", 251),
    TYPE_AXFR("axfr", 252),
    TYPE_MAILA("mails", 253),
    TYPE_MAILB("mailb", Scalar25519.TARGET_LENGTH),
    TYPE_ANY("any", 255);


    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f34699 = C11321.m27962(EnumC11628.class.getName());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f34710;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f34711;

    EnumC11628(String str, int i) {
        this.f34710 = str;
        this.f34711 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m28521() {
        return this.f34710;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m28522() {
        return this.f34711;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC11628 m28519(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (EnumC11628 enumC11628 : values()) {
                if (enumC11628.f34710.equals(lowerCase)) {
                    return enumC11628;
                }
            }
        }
        f34699.mo7103(str, "Could not find record type for name: {}");
        return TYPE_IGNORE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC11628 m28518(int i) {
        for (EnumC11628 enumC11628 : values()) {
            if (enumC11628.f34711 == i) {
                return enumC11628;
            }
        }
        f34699.mo7103(Integer.valueOf(i), "Could not find record type for index: {}");
        return TYPE_IGNORE;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m28522();
    }
}
