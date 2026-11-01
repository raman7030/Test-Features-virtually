package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܰۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C15410 implements InterfaceC3341 {

    /* JADX INFO: renamed from: ۖ֫ */
    public static final InterfaceC4410 f44021 = C13128.m30022(C15410.class);

    /* JADX INFO: renamed from: ֡ */
    public EnumC22788 f44022;

    /* JADX INFO: renamed from: ֨ */
    public EnumC22788 f44023;

    /* JADX INFO: renamed from: ֫ */
    public InetAddress f44024;

    /* JADX INFO: renamed from: ֫֫ */
    public int f44025;

    /* JADX INFO: renamed from: ۖ */
    public int f44026;

    /* JADX INFO: renamed from: ۗ */
    public int f44027;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f44028;

    /* JADX INFO: renamed from: ۙ */
    public int f44029;

    /* JADX INFO: renamed from: ۚ */
    public int f44030;

    /* JADX INFO: renamed from: ۛ */
    public boolean f44031;

    /* JADX INFO: renamed from: ۜ */
    public int f44032;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f44033;

    /* JADX INFO: renamed from: ۟ */
    public long f44034;

    /* JADX INFO: renamed from: ۠ */
    public String f44035;

    /* JADX INFO: renamed from: ۡ */
    public boolean f44036;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f44037;

    /* JADX INFO: renamed from: ۢ */
    public String f44038;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f44039;

    /* JADX INFO: renamed from: ۤ */
    public SecureRandom f44040;

    /* JADX INFO: renamed from: ۧ */
    public int f44041;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f44042;

    /* JADX INFO: renamed from: ۨ */
    public ArrayList f44043;

    /* JADX INFO: renamed from: ۫ */
    public String f44044;

    /* JADX INFO: renamed from: ۬ */
    public int f44045;

    /* JADX INFO: renamed from: ܰ */
    public int f44046;

    /* JADX INFO: renamed from: ܳ */
    public HashSet f44047;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f44048;

    /* JADX INFO: renamed from: ܶ */
    public String f44049;

    /* JADX INFO: renamed from: ܺ */
    public int f44050;

    /* JADX INFO: renamed from: ܺ֫ */
    public InetAddress[] f44051;

    /* JADX INFO: renamed from: ܽ */
    public int f44052;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f44053;

    /* JADX INFO: renamed from: ܿ */
    public boolean f44054;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f44055;

    /* JADX INFO: renamed from: ᩳ */
    public long f44056;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f44057;

    /* JADX INFO: renamed from: ᩴ */
    public int f44058;

    /* JADX INFO: renamed from: ᩵ */
    public int f44059;

    /* JADX INFO: renamed from: ᩶ */
    public int f44060;

    /* JADX INFO: renamed from: ᩷ */
    public String f44061;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f44062;

    /* JADX INFO: renamed from: ᩸ */
    public int f44063;

    /* JADX INFO: renamed from: ᩹ */
    public int f44064;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f44065;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f44066;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f44067;

    static {
        new HashMap().put("TreeConnectAndX.QueryInformation", 0);
    }

    public C15410() {
        this(false);
    }

    public C15410(boolean z) throws C20777 {
        new HashMap();
        this.f44026 = -1;
        this.f44039 = true;
        this.f44036 = true;
        this.f44050 = 3;
        this.f44066 = true;
        this.f44054 = true;
        this.f44044 = "Cp850";
        this.f44032 = 0;
        this.f44052 = 0;
        this.f44046 = 250;
        this.f44055 = 30000;
        this.f44033 = 35000;
        this.f44025 = 35000;
        this.f44067 = 35000;
        this.f44058 = 10;
        this.f44048 = 65535;
        this.f44057 = 65535;
        this.f44035 = "jCIFS";
        this.f44037 = 1;
        this.f44056 = 300L;
        this.f44063 = 36000;
        this.f44045 = OpenAuthTask.Duplex;
        this.f44027 = 576;
        this.f44029 = 576;
        this.f44064 = 2;
        this.f44060 = EnumC4453.f9987;
        this.f44051 = new InetAddress[0];
        this.f44030 = 65536;
        this.f44062 = 65023;
        this.f44041 = 16;
        this.f44053 = 65435;
        this.f44042 = 200;
        this.f44034 = 5000L;
        this.f44059 = 2;
        this.f44031 = true;
        this.f44065 = true;
        this.f44038 = "GUEST";
        this.f44061 = "";
        if (z) {
            try {
                "".getBytes("Cp850");
                this.f44026 = (int) (Math.random() * 65536.0d);
                TimeZone.getDefault();
                SecureRandom secureRandom = new SecureRandom();
                this.f44040 = secureRandom;
                if (this.f44028 == null) {
                    byte[] bArr = new byte[32];
                    secureRandom.nextBytes(bArr);
                    this.f44028 = bArr;
                }
                if (this.f44049 == null) {
                    this.f44049 = System.getProperty("os.name");
                }
                if (this.f44032 == 0) {
                    this.f44032 = 51203;
                }
                if (this.f44052 == 0) {
                    this.f44052 = -2147434412;
                }
                if (this.f44024 == null) {
                    try {
                        this.f44024 = InetAddress.getByName("255.255.255.255");
                    } catch (UnknownHostException e) {
                        f44021.mo9176("Failed to get broadcast address", (Exception) e);
                    }
                }
                if (this.f44043 == null) {
                    InetAddress[] inetAddressArr = this.f44051;
                    ArrayList arrayList = new ArrayList();
                    this.f44043 = arrayList;
                    if (inetAddressArr.length == 0) {
                        arrayList.add(EnumC5353.RESOLVER_LMHOSTS);
                        this.f44043.add(EnumC5353.RESOLVER_DNS);
                        this.f44043.add(EnumC5353.RESOLVER_BCAST);
                    } else {
                        arrayList.add(EnumC5353.RESOLVER_LMHOSTS);
                        this.f44043.add(EnumC5353.RESOLVER_DNS);
                        this.f44043.add(EnumC5353.RESOLVER_WINS);
                        this.f44043.add(EnumC5353.RESOLVER_BCAST);
                    }
                }
                if (this.f44023 == null || this.f44022 == null) {
                    EnumC22788 enumC22788 = EnumC22788.SMB1;
                    this.f44023 = enumC22788;
                    this.f44022 = enumC22788;
                    if (enumC22788.m50996(enumC22788)) {
                        this.f44022 = this.f44023;
                    }
                }
                if (this.f44047 == null) {
                    this.f44047 = new HashSet(Arrays.asList("Smb2SessionSetupRequest", "Smb2TreeConnectRequest"));
                }
            } catch (UnsupportedEncodingException unused) {
                throw new C20777("The default OEM encoding Cp850 does not appear to be supported by this JRE.");
            }
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public final SecureRandom m35105() {
        return this.f44040;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m35118() {
        return this.f44025;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final int m35129() {
        return this.f44055;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final int m35107() {
        return this.f44033;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final int m35090() {
        return this.f44067;
    }

    /* JADX INFO: renamed from: ܰ */
    public final int m35111() {
        return this.f44048;
    }

    /* JADX INFO: renamed from: ۛ */
    public final int m35096() {
        return this.f44057;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m35093() {
        return this.f44058;
    }

    /* JADX INFO: renamed from: ֨ */
    public final String m35087() {
        return this.f44035;
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m35100() {
        return this.f44049;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int m35121() {
        return this.f44037;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m35120() {
        return this.f44052;
    }

    /* JADX INFO: renamed from: ۚ */
    public final EnumC22788 m35095() {
        return this.f44023;
    }

    /* JADX INFO: renamed from: ֡ */
    public final EnumC22788 m35086() {
        return this.f44022;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m35126() {
        return this.f44031;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean m35102() {
        return this.f44039;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m35112() {
        return this.f44056;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean m35113() {
        return this.f44054;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m35103() {
        return this.f44050;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean m35131() {
        return this.f44066;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InetAddress m35106() {
        return this.f44024;
    }

    /* JADX INFO: renamed from: ۨ */
    public final ArrayList m35108() {
        return this.f44043;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final InetAddress[] m35119() {
        return this.f44051;
    }

    /* JADX INFO: renamed from: ۗ */
    public final int m35092() {
        return this.f44045;
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m35114() {
        return this.f44063;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final int m35127() {
        return this.f44029;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final int m35128() {
        return this.f44064;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final int m35124() {
        return this.f44060;
    }

    /* JADX INFO: renamed from: ۙ */
    public final int m35094() {
        return this.f44027;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m35130() {
        return this.f44032;
    }

    /* JADX INFO: renamed from: ۟ */
    public final int m35099() {
        return this.f44046;
    }

    /* JADX INFO: renamed from: ۬ */
    public final String m35110() {
        return this.f44044;
    }

    /* JADX INFO: renamed from: ۫ */
    public final int m35109() {
        return this.f44026;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m35098() {
        return this.f44036;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final int m35117() {
        return this.f44062;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m35123() {
        return this.f44030;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m35116() {
        return this.f44041;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m35101() {
        return this.f44042;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m35115() {
        return this.f44053;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m35088() {
        return this.f44034;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m35122() {
        return this.f44059;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean m35104() {
        return this.f44065;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m35125() {
        return this.f44038;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m35097() {
        return this.f44061;
    }

    /* JADX INFO: renamed from: ۖ */
    public final byte[] m35091() {
        return this.f44028;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35089(String str) {
        HashSet hashSet = this.f44047;
        if (hashSet == null) {
            return true;
        }
        return !hashSet.contains(str);
    }
}
