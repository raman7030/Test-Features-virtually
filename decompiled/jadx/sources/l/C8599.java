package l;

import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8599 implements InterfaceC15653 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f26260 = C11321.m27961(C8599.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f26261;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f26262;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f26263;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f26264;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f26265;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26266;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Map f26267;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f26268;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f26269;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f26270;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f26271;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f26272;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8599 f26273 = this;

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8599 mo22338() {
        if (InterfaceC15653.class.isAssignableFrom(C8599.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo22345() {
        return this.f26266;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo22336() {
        return this.f26272;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo22343() {
        return this.f26261;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22331(String str) {
        this.f26261 = str;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String mo22337() {
        return this.f26270;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22340(String str) {
        this.f26270 = str;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo22335() {
        this.f26271 = "\\";
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo22329() {
        return this.f26264;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo22341() {
        return this.f26268;
    }

    @Override // l.InterfaceC15653
    public final String getPath() {
        return this.f26263;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m22342() {
        return this.f26265;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22332(Map map) {
        this.f26267 = map;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo22346() {
        String str;
        Map map = this.f26267;
        if (map == null || (str = this.f26271) == null) {
            return;
        }
        map.put(str, this);
    }

    @Override // l.InterfaceC15653
    public final C8599 next() {
        return this.f26273;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8599 mo22347() {
        return this.f26273;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22333(InterfaceC15653 interfaceC15653) {
        C8599 c8599 = (C8599) interfaceC15653;
        c8599.f26273 = this.f26273;
        this.f26273 = c8599;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22330(int i) {
        int i2 = this.f26272;
        if (i > i2) {
            throw new IllegalArgumentException("Stripping more than consumed");
        }
        this.f26272 = i2 - i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22334() {
        this.f26269 = true;
    }

    @Override // l.InterfaceC15653
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo22344() {
        return this.f26269;
    }

    public final String toString() {
        return "DfsReferralData[pathConsumed=" + this.f26272 + ",server=" + this.f26264 + ",share=" + this.f26268 + ",link=" + this.f26270 + ",path=" + this.f26263 + ",ttl=" + this.f26262 + ",expiration=" + this.f26266 + ",remain=" + (this.f26266 - System.currentTimeMillis()) + "]";
    }

    public final int hashCode() {
        return C11003.hash(this.f26264, this.f26268, this.f26263, Integer.valueOf(this.f26272));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC15653)) {
            return false;
        }
        InterfaceC15653 interfaceC15653 = (InterfaceC15653) obj;
        return C11003.equals(this.f26264, interfaceC15653.mo22329()) && C11003.equals(this.f26268, interfaceC15653.mo22341()) && C11003.equals(this.f26263, interfaceC15653.getPath()) && Integer.valueOf(this.f26272).equals(Integer.valueOf(interfaceC15653.mo22336()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8599 m22328(C3660 c3660, String str, long j, int i) {
        C8599 c8599 = new C8599();
        String[] strArr = new String[4];
        c8599.f26262 = c3660.f11541;
        int i2 = c3660.f11537;
        c8599.f26265 = i2;
        c8599.f26266 = j;
        int i3 = i2 & 2;
        InterfaceC2148 interfaceC2148 = f26260;
        if (i3 == 2) {
            String[] strArr2 = c3660.f11546;
            if (strArr2.length > 0) {
                c8599.f26264 = strArr2[0].substring(1).toLowerCase();
            } else {
                c8599.f26264 = c3660.f11539.substring(1).toLowerCase();
            }
            if (interfaceC2148.mo7086()) {
                StringBuilder sb = new StringBuilder("Server ");
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, c8599.f26264, " path ", str, " remain ");
                sb.append(str.substring(i));
                sb.append(" path consumed ");
                sb.append(i);
                interfaceC2148.mo7088(sb.toString());
            }
            c8599.f26272 = i;
            return c8599;
        }
        if (interfaceC2148.mo7086()) {
            StringBuilder sb2 = new StringBuilder("Node ");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb2, c3660.f11544, " path ", str, " remain ");
            sb2.append(str.substring(i));
            sb2.append(" path consumed ");
            sb2.append(i);
            interfaceC2148.mo7088(sb2.toString());
        }
        String str2 = c3660.f11544;
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
        c8599.f26264 = strArr[1];
        c8599.f26268 = strArr[2];
        c8599.f26263 = strArr[3];
        c8599.f26272 = i;
        if (str.charAt(i - 1) == '\\') {
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Server consumed trailing slash of request path, adjusting");
            }
            c8599.f26272--;
        }
        if (interfaceC2148.mo7086()) {
            String strSubstring = str.substring(0, i);
            StringBuilder sbM9834 = C3200.m9834("Request ", str, " ref path ");
            sbM9834.append(c8599.f26263);
            sbM9834.append(" consumed ");
            sbM9834.append(c8599.f26272);
            sbM9834.append(": ");
            sbM9834.append(strSubstring);
            interfaceC2148.mo7088(sbM9834.toString());
        }
        return c8599;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8599 m22339(InterfaceC15653 interfaceC15653) {
        C8599 c8599 = new C8599();
        c8599.f26264 = interfaceC15653.mo22329();
        c8599.f26268 = interfaceC15653.mo22341();
        c8599.f26266 = interfaceC15653.mo22345();
        c8599.f26263 = interfaceC15653.getPath();
        int iMo22336 = interfaceC15653.mo22336() + this.f26272;
        c8599.f26272 = iMo22336;
        String str = this.f26263;
        if (str != null) {
            c8599.f26272 = iMo22336 - (str.length() + 1);
        }
        c8599.f26261 = interfaceC15653.mo22343();
        return c8599;
    }
}
