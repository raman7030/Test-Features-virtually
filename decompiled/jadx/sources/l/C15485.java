package l;

import com.alipay.sdk.m.w.a;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ܶ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15485 extends AbstractC22542 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f47364 = C11321.m27962(C15485.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f47365;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f47366;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f47367;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f47368;

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2721() {
        return true;
    }

    public C15485(String str, EnumC5983 enumC5983, boolean z, int i, int i2, int i3, int i4, String str2) {
        super(str, EnumC11628.TYPE_SRV, enumC5983, z, i);
        this.f47367 = i2;
        this.f47365 = i3;
        this.f47366 = i4;
        this.f47368 = str2;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        c17603.writeShort(this.f47367);
        c17603.writeShort(this.f47365);
        c17603.writeShort(this.f47366);
        boolean z = C11254.f33725;
        String str = this.f47368;
        if (z) {
            c17603.m41143(str);
        } else {
            c17603.m41145(str.length(), str);
            c17603.writeByte(0);
        }
    }

    @Override // l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final void mo32823(DataOutputStream dataOutputStream) throws IOException {
        super.mo32823(dataOutputStream);
        dataOutputStream.writeShort(this.f47367);
        dataOutputStream.writeShort(this.f47365);
        dataOutputStream.writeShort(this.f47366);
        try {
            dataOutputStream.write(this.f47368.getBytes(a.D));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m36568() {
        return this.f47368;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m36566() {
        return this.f47367;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m36567() {
        return this.f47365;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m36569() {
        return this.f47366;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2720(AbstractC22542 abstractC22542) {
        if (!(abstractC22542 instanceof C15485)) {
            return false;
        }
        C15485 c15485 = (C15485) abstractC22542;
        return this.f47367 == c15485.f47367 && this.f47365 == c15485.f47365 && this.f47366 == c15485.f47366 && this.f47368.equals(c15485.f47368);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f A[Catch: IOException -> 0x007d, TRY_LEAVE, TryCatch #0 {IOException -> 0x007d, blocks: (B:13:0x0061, B:15:0x006f), top: B:29:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2718(C8806 c8806) {
        InterfaceC2148 interfaceC2148;
        C15485 c15485;
        int iM32821;
        C20095 c20095 = (C20095) ((ConcurrentMapC10942) c8806.m22751()).get(m32822());
        if (c20095 != null && (c20095.m46337() || c20095.m46332())) {
            if (this.f47366 == c20095.mo25454()) {
                if (!this.f47368.equalsIgnoreCase(c8806.m22739().f23907)) {
                    InetAddress inetAddressM50545 = m50545();
                    interfaceC2148 = f47364;
                    interfaceC2148.mo7100(inetAddressM50545, "handleQuery() Conflicting probe detected from: {}");
                    c15485 = new C15485(c20095.mo25450(), EnumC5983.CLASS_IN, true, C13038.f39042, c20095.mo25458(), c20095.mo25453(), c20095.mo25454(), c8806.m22739().f23907);
                    try {
                        if (c8806.m22765().equals(m50545())) {
                            interfaceC2148.mo7098("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c15485.toString());
                        }
                    } catch (IOException e) {
                        interfaceC2148.mo7083("IOException", (Throwable) e);
                    }
                    iM32821 = m32821((AbstractC22542) c15485);
                    if (iM32821 == 0) {
                        interfaceC2148.mo7088("handleQuery() Ignoring a identical service query");
                        return false;
                    }
                    if (c20095.m46339() && iM32821 > 0) {
                        String lowerCase = c20095.mo25450().toLowerCase();
                        InterfaceC1044 interfaceC1044M44664 = C19390.m44664();
                        InetAddress inetAddress = c8806.m22739().f23908;
                        c20095.m46323(((C5278) interfaceC1044M44664).m15205(c20095.getName(), EnumC0338.SERVICE));
                        ((ConcurrentMapC10942) c8806.m22751()).remove(lowerCase);
                        ((ConcurrentMapC10942) c8806.m22751()).put(c20095.mo25450().toLowerCase(), c20095);
                        interfaceC2148.mo7100(c20095.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                        c20095.m46330();
                        return true;
                    }
                }
            } else {
                InetAddress inetAddressM50546 = m50545();
                interfaceC2148 = f47364;
                interfaceC2148.mo7100(inetAddressM50546, "handleQuery() Conflicting probe detected from: {}");
                c15485 = new C15485(c20095.mo25450(), EnumC5983.CLASS_IN, true, C13038.f39042, c20095.mo25458(), c20095.mo25453(), c20095.mo25454(), c8806.m22739().f23907);
                if (c8806.m22765().equals(m50545())) {
                    interfaceC2148.mo7098("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c15485.toString());
                }
                iM32821 = m32821((AbstractC22542) c15485);
                if (iM32821 == 0) {
                    interfaceC2148.mo7088("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (c20095.m46339()) {
                    String lowerCase2 = c20095.mo25450().toLowerCase();
                    InterfaceC1044 interfaceC1044M44665 = C19390.m44664();
                    InetAddress inetAddress2 = c8806.m22739().f23908;
                    c20095.m46323(((C5278) interfaceC1044M44665).m15205(c20095.getName(), EnumC0338.SERVICE));
                    ((ConcurrentMapC10942) c8806.m22751()).remove(lowerCase2);
                    ((ConcurrentMapC10942) c8806.m22751()).put(c20095.mo25450().toLowerCase(), c20095);
                    interfaceC2148.mo7100(c20095.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                    c20095.m46330();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2719(C8806 c8806) {
        C20095 c20095 = (C20095) ((ConcurrentMapC10942) c8806.m22751()).get(m32822());
        if (c20095 == null) {
            return false;
        }
        if (this.f47366 == c20095.mo25454()) {
            if (this.f47368.equalsIgnoreCase(c8806.m22739().f23907)) {
                return false;
            }
        }
        InterfaceC2148 interfaceC2148 = f47364;
        interfaceC2148.mo7088("handleResponse() Denial detected");
        if (c20095.m46339()) {
            String lowerCase = c20095.mo25450().toLowerCase();
            InterfaceC1044 interfaceC1044M44664 = C19390.m44664();
            InetAddress inetAddress = c8806.m22739().f23908;
            c20095.m46323(((C5278) interfaceC1044M44664).m15205(c20095.getName(), EnumC0338.SERVICE));
            ((ConcurrentMapC10942) c8806.m22751()).remove(lowerCase);
            ((ConcurrentMapC10942) c8806.m22751()).put(c20095.mo25450().toLowerCase(), c20095);
            interfaceC2148.mo7100(c20095.getName(), "handleResponse() New unique name chose:{}");
        }
        c20095.m46330();
        return true;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        return new C20095(C20195.unmodifiableMap(this.f40739), this.f47366, this.f47365, this.f47367, z, null);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C15154 mo2714(C8806 c8806) {
        C20095 c20095Mo2715 = mo2715(false);
        c20095Mo2715.m46326(c8806);
        return new C15154(c8806, c20095Mo2715.mo25446(), c20095Mo2715.getName(), c20095Mo2715);
    }

    @Override // l.AbstractC22542, l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final void mo2716(StringBuilder sb) {
        super.mo2716(sb);
        sb.append(" server: '");
        sb.append(this.f47368);
        sb.append(':');
        sb.append(this.f47366);
        sb.append('\'');
    }
}
