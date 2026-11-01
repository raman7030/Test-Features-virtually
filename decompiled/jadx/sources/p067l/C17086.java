package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ܶ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17086 extends AbstractC23793 {

    /* JADX INFO: renamed from: ۚ */
    public static InterfaceC4410 f50495 = C13128.m30023(C17086.class.getName());

    /* JADX INFO: renamed from: ֡ */
    public final int f50496;

    /* JADX INFO: renamed from: ۘ */
    public final int f50497;

    /* JADX INFO: renamed from: ᩴ */
    public final int f50498;

    /* JADX INFO: renamed from: ᩵ */
    public final String f50499;

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5060() {
        return true;
    }

    public C17086(String str, EnumC8055 enumC8055, boolean z, int i, int i2, int i3, int i4, String str2) {
        super(str, EnumC13420.TYPE_SRV, enumC8055, z, i);
        this.f50498 = i2;
        this.f50496 = i3;
        this.f50497 = i4;
        this.f50499 = str2;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final void mo5056(C19099 c19099) {
        c19099.writeShort(this.f50498);
        c19099.writeShort(this.f50496);
        c19099.writeShort(this.f50497);
        boolean z = C13065.f36725;
        String str = this.f50499;
        if (z) {
            c19099.m43389(str);
        } else {
            c19099.m43391(str.length(), str);
            c19099.writeByte(0);
        }
    }

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo34938(DataOutputStream dataOutputStream) throws IOException {
        super.mo34938(dataOutputStream);
        dataOutputStream.writeShort(this.f50498);
        dataOutputStream.writeShort(this.f50496);
        dataOutputStream.writeShort(this.f50497);
        try {
            dataOutputStream.write(this.f50499.getBytes(C0233a.f1077D));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final String m38727() {
        return this.f50499;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m38725() {
        return this.f50498;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m38726() {
        return this.f50496;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m38728() {
        return this.f50497;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5059(AbstractC23793 abstractC23793) {
        if (!(abstractC23793 instanceof C17086)) {
            return false;
        }
        C17086 c17086 = (C17086) abstractC23793;
        return this.f50498 == c17086.f50498 && this.f50496 == c17086.f50496 && this.f50497 == c17086.f50497 && this.f50499.equals(c17086.f50499);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f A[Catch: IOException -> 0x007d, TRY_LEAVE, TryCatch #0 {IOException -> 0x007d, blocks: (B:13:0x0061, B:15:0x006f), top: B:29:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5057(C10738 c10738) {
        InterfaceC4410 interfaceC4410;
        C17086 c17086;
        int iM34936;
        C21467 c21467 = (C21467) ((ConcurrentMapC12768) c10738.m24721()).get(m34937());
        if (c21467 != null && (c21467.m48653() || c21467.m48648())) {
            if (this.f50497 == c21467.mo27474()) {
                if (!this.f50499.equalsIgnoreCase(c10738.m24709().f26820)) {
                    InetAddress inetAddressM52887 = m52887();
                    interfaceC4410 = f50495;
                    interfaceC4410.mo9195(inetAddressM52887, "handleQuery() Conflicting probe detected from: {}");
                    c17086 = new C17086(c21467.mo27470(), EnumC8055.CLASS_IN, true, C14760.f42088, c21467.mo27478(), c21467.mo27473(), c21467.mo27474(), c10738.m24709().f26820);
                    try {
                        if (c10738.m24735().equals(m52887())) {
                            interfaceC4410.mo9193("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c17086.toString());
                        }
                    } catch (IOException e) {
                        interfaceC4410.mo9178("IOException", (Throwable) e);
                    }
                    iM34936 = m34936((AbstractC23793) c17086);
                    if (iM34936 == 0) {
                        interfaceC4410.mo9183("handleQuery() Ignoring a identical service query");
                        return false;
                    }
                    if (c21467.m48655() && iM34936 > 0) {
                        String lowerCase = c21467.mo27470().toLowerCase();
                        InterfaceC3361 interfaceC3361M46958 = C20797.m46958();
                        InetAddress inetAddress = c10738.m24709().f26821;
                        c21467.m48639(((C7385) interfaceC3361M46958).m17108(c21467.getName(), EnumC2690.SERVICE));
                        ((ConcurrentMapC12768) c10738.m24721()).remove(lowerCase);
                        ((ConcurrentMapC12768) c10738.m24721()).put(c21467.mo27470().toLowerCase(), c21467);
                        interfaceC4410.mo9195(c21467.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                        c21467.m48646();
                        return true;
                    }
                }
            } else {
                InetAddress inetAddressM52888 = m52887();
                interfaceC4410 = f50495;
                interfaceC4410.mo9195(inetAddressM52888, "handleQuery() Conflicting probe detected from: {}");
                c17086 = new C17086(c21467.mo27470(), EnumC8055.CLASS_IN, true, C14760.f42088, c21467.mo27478(), c21467.mo27473(), c21467.mo27474(), c10738.m24709().f26820);
                if (c10738.m24735().equals(m52887())) {
                    interfaceC4410.mo9193("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c17086.toString());
                }
                iM34936 = m34936((AbstractC23793) c17086);
                if (iM34936 == 0) {
                    interfaceC4410.mo9183("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (c21467.m48655()) {
                    String lowerCase2 = c21467.mo27470().toLowerCase();
                    InterfaceC3361 interfaceC3361M46959 = C20797.m46958();
                    InetAddress inetAddress2 = c10738.m24709().f26821;
                    c21467.m48639(((C7385) interfaceC3361M46959).m17108(c21467.getName(), EnumC2690.SERVICE));
                    ((ConcurrentMapC12768) c10738.m24721()).remove(lowerCase2);
                    ((ConcurrentMapC12768) c10738.m24721()).put(c21467.mo27470().toLowerCase(), c21467);
                    interfaceC4410.mo9195(c21467.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                    c21467.m48646();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5058(C10738 c10738) {
        C21467 c21467 = (C21467) ((ConcurrentMapC12768) c10738.m24721()).get(m34937());
        if (c21467 == null) {
            return false;
        }
        if (this.f50497 == c21467.mo27474()) {
            if (this.f50499.equalsIgnoreCase(c10738.m24709().f26820)) {
                return false;
            }
        }
        InterfaceC4410 interfaceC4410 = f50495;
        interfaceC4410.mo9183("handleResponse() Denial detected");
        if (c21467.m48655()) {
            String lowerCase = c21467.mo27470().toLowerCase();
            InterfaceC3361 interfaceC3361M46958 = C20797.m46958();
            InetAddress inetAddress = c10738.m24709().f26821;
            c21467.m48639(((C7385) interfaceC3361M46958).m17108(c21467.getName(), EnumC2690.SERVICE));
            ((ConcurrentMapC12768) c10738.m24721()).remove(lowerCase);
            ((ConcurrentMapC12768) c10738.m24721()).put(c21467.mo27470().toLowerCase(), c21467);
            interfaceC4410.mo9195(c21467.getName(), "handleResponse() New unique name chose:{}");
        }
        c21467.m48646();
        return true;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C21467 mo5054(boolean z) {
        return new C21467(C21562.unmodifiableMap(this.f43820), this.f50497, this.f50496, this.f50498, z, null);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C16771 mo5053(C10738 c10738) {
        C21467 c21467Mo5054 = mo5054(false);
        c21467Mo5054.m48642(c10738);
        return new C16771(c10738, c21467Mo5054.mo27466(), c21467Mo5054.getName(), c21467Mo5054);
    }

    @Override // p067l.AbstractC23793, p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo5055(StringBuilder sb) {
        super.mo5055(sb);
        sb.append(" server: '");
        sb.append(this.f50499);
        sb.append(':');
        sb.append(this.f50497);
        sb.append('\'');
    }
}
