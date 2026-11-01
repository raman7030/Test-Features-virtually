package p067l;

import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10541 implements InterfaceC17245 {

    /* JADX INFO: renamed from: ۘ */
    public static final InterfaceC4410 f29176 = C13128.m30022(C10541.class);

    /* JADX INFO: renamed from: ֫ */
    public String f29177;

    /* JADX INFO: renamed from: ۖ */
    public long f29178;

    /* JADX INFO: renamed from: ۜ */
    public String f29179;

    /* JADX INFO: renamed from: ۡ */
    public String f29180;

    /* JADX INFO: renamed from: ۢ */
    public int f29181;

    /* JADX INFO: renamed from: ۧ */
    public long f29182;

    /* JADX INFO: renamed from: ܳ */
    public Map f29183;

    /* JADX INFO: renamed from: ܺ */
    public String f29184;

    /* JADX INFO: renamed from: ܽ */
    public boolean f29185;

    /* JADX INFO: renamed from: ܿ */
    public String f29186;

    /* JADX INFO: renamed from: ᩳ */
    public String f29187;

    /* JADX INFO: renamed from: ᩷ */
    public int f29188;

    /* JADX INFO: renamed from: ᩻ */
    public C10541 f29189 = this;

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ۧ */
    public final C10541 mo24307() {
        if (InterfaceC17245.class.isAssignableFrom(C10541.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ᩳ */
    public final long mo24314() {
        return this.f29182;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ۡ */
    public final int mo24305() {
        return this.f29188;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ܽ */
    public final String mo24312() {
        return this.f29177;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24300(String str) {
        this.f29177 = str;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ۢ */
    public final String mo24306() {
        return this.f29186;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24309(String str) {
        this.f29186 = str;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ۜ */
    public final void mo24304() {
        this.f29187 = "\\";
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ֫ */
    public final String mo24298() {
        return this.f29180;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ܳ */
    public final String mo24310() {
        return this.f29184;
    }

    @Override // p067l.InterfaceC17245
    public final String getPath() {
        return this.f29179;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m24311() {
        return this.f29181;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24301(Map map) {
        this.f29183 = map;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ᩷ */
    public final void mo24315() {
        String str;
        Map map = this.f29183;
        if (map == null || (str = this.f29187) == null) {
            return;
        }
        map.put(str, this);
    }

    @Override // p067l.InterfaceC17245
    public final C10541 next() {
        return this.f29189;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ᩻ */
    public final C10541 mo24316() {
        return this.f29189;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24302(InterfaceC17245 interfaceC17245) {
        C10541 c10541 = (C10541) interfaceC17245;
        c10541.f29189 = this.f29189;
        this.f29189 = c10541;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ֫ */
    public final void mo24299(int i) {
        int i2 = this.f29188;
        if (i > i2) {
            throw new IllegalArgumentException("Stripping more than consumed");
        }
        this.f29188 = i2 - i;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m24303() {
        this.f29185 = true;
    }

    @Override // p067l.InterfaceC17245
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24313() {
        return this.f29185;
    }

    public final String toString() {
        return "DfsReferralData[pathConsumed=" + this.f29188 + ",server=" + this.f29180 + ",share=" + this.f29184 + ",link=" + this.f29186 + ",path=" + this.f29179 + ",ttl=" + this.f29178 + ",expiration=" + this.f29182 + ",remain=" + (this.f29182 - System.currentTimeMillis()) + "]";
    }

    public final int hashCode() {
        return C12826.hash(this.f29180, this.f29184, this.f29179, Integer.valueOf(this.f29188));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC17245)) {
            return false;
        }
        InterfaceC17245 interfaceC17245 = (InterfaceC17245) obj;
        return C12826.equals(this.f29180, interfaceC17245.mo24298()) && C12826.equals(this.f29184, interfaceC17245.mo24310()) && C12826.equals(this.f29179, interfaceC17245.getPath()) && Integer.valueOf(this.f29188).equals(Integer.valueOf(interfaceC17245.mo24305()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10541 m24297(C5847 c5847, String str, long j, int i) {
        C10541 c10541 = new C10541();
        String[] strArr = new String[4];
        c10541.f29178 = c5847.f14347;
        int i2 = c5847.f14343;
        c10541.f29181 = i2;
        c10541.f29182 = j;
        int i3 = i2 & 2;
        InterfaceC4410 interfaceC4410 = f29176;
        if (i3 == 2) {
            String[] strArr2 = c5847.f14352;
            if (strArr2.length > 0) {
                c10541.f29180 = strArr2[0].substring(1).toLowerCase();
            } else {
                c10541.f29180 = c5847.f14345.substring(1).toLowerCase();
            }
            if (interfaceC4410.mo9181()) {
                StringBuilder sb = new StringBuilder("Server ");
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, c10541.f29180, " path ", str, " remain ");
                sb.append(str.substring(i));
                sb.append(" path consumed ");
                sb.append(i);
                interfaceC4410.mo9183(sb.toString());
            }
            c10541.f29188 = i;
            return c10541;
        }
        if (interfaceC4410.mo9181()) {
            StringBuilder sb2 = new StringBuilder("Node ");
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb2, c5847.f14350, " path ", str, " remain ");
            sb2.append(str.substring(i));
            sb2.append(" path consumed ");
            sb2.append(i);
            interfaceC4410.mo9183(sb2.toString());
        }
        String str2 = c5847.f14350;
        int length = str2.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 == 3) {
                strArr[3] = str2.substring(i6);
                strArr[3] = str2.substring(i6);
                break;
            }
            if (i5 == length || str2.charAt(i5) == '\\') {
                strArr[i4] = str2.substring(i6, i5);
                i6 = i5 + 1;
                i4++;
            }
            int i7 = i5 + 1;
            if (i5 >= length) {
                while (i4 < 4) {
                    strArr[i4] = "";
                    i4++;
                }
                break;
            }
            i5 = i7;
        }
        c10541.f29180 = strArr[1];
        c10541.f29184 = strArr[2];
        c10541.f29179 = strArr[3];
        c10541.f29188 = i;
        if (str.charAt(i - 1) == '\\') {
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Server consumed trailing slash of request path, adjusting");
            }
            c10541.f29188--;
        }
        if (interfaceC4410.mo9181()) {
            String strSubstring = str.substring(0, i);
            StringBuilder sbM11879 = C5410.m11879("Request ", str, " ref path ");
            sbM11879.append(c10541.f29179);
            sbM11879.append(" consumed ");
            sbM11879.append(c10541.f29188);
            sbM11879.append(": ");
            sbM11879.append(strSubstring);
            interfaceC4410.mo9183(sbM11879.toString());
        }
        return c10541;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10541 m24308(InterfaceC17245 interfaceC17245) {
        C10541 c10541 = new C10541();
        c10541.f29180 = interfaceC17245.mo24298();
        c10541.f29184 = interfaceC17245.mo24310();
        c10541.f29182 = interfaceC17245.mo24314();
        c10541.f29179 = interfaceC17245.getPath();
        int iMo24305 = interfaceC17245.mo24305() + this.f29188;
        c10541.f29188 = iMo24305;
        String str = this.f29179;
        if (str != null) {
            c10541.f29188 = iMo24305 - (str.length() + 1);
        }
        c10541.f29177 = interfaceC17245.mo24312();
        return c10541;
    }
}
