package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19721 extends AbstractC22542 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f63740 = C11321.m27962(AbstractC19721.class.getName());

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InetAddress f63741;

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2721() {
        return false;
    }

    public AbstractC19721(String str, EnumC11628 enumC11628, EnumC5983 enumC5983, boolean z, int i, InetAddress inetAddress) {
        super(str, enumC11628, enumC5983, z, i);
        this.f63741 = inetAddress;
    }

    public AbstractC19721(String str, EnumC11628 enumC11628, EnumC5983 enumC5983, boolean z, int i, byte[] bArr) {
        super(str, enumC11628, enumC5983, z, i);
        try {
            this.f63741 = InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            f63740.mo7083("Address() exception ", (Throwable) e);
        }
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2720(AbstractC22542 abstractC22542) {
        try {
            if (abstractC22542 instanceof AbstractC19721) {
                InetAddress inetAddress = ((AbstractC19721) abstractC22542).f63741;
                InetAddress inetAddress2 = this.f63741;
                if (inetAddress2 != null || inetAddress == null) {
                    return inetAddress2.equals(inetAddress);
                }
            }
            return false;
        } catch (Exception e) {
            f63740.mo7089("Failed to compare addresses of DNSRecords", e);
            return false;
        }
    }

    @Override // l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final void mo32823(DataOutputStream dataOutputStream) throws IOException {
        super.mo32823(dataOutputStream);
        for (byte b : this.f63741.getAddress()) {
            dataOutputStream.writeByte(b);
        }
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2718(C8806 c8806) {
        AbstractC19721 abstractC19721M20684;
        if (!c8806.m22739().m20688(this) || (abstractC19721M20684 = c8806.m22739().m20684(m32832(), m32833(), C13038.f39042)) == null) {
            return false;
        }
        int iM32821 = m32821((AbstractC22542) abstractC19721M20684);
        InterfaceC2148 interfaceC2148 = f63740;
        if (iM32821 == 0) {
            interfaceC2148.mo7088("handleQuery() Ignoring an identical address query");
            return false;
        }
        interfaceC2148.mo7088("handleQuery() Conflicting query detected.");
        if (c8806.m22757() && iM32821 > 0) {
            c8806.m22739().m20696();
            c8806.m22755().clear();
            Iterator it = ((ConcurrentMapC10942) c8806.m22751()).values().iterator();
            while (it.hasNext()) {
                ((C20095) ((AbstractC10134) it.next())).m46330();
            }
        }
        c8806.m22768();
        return true;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2719(C8806 c8806) {
        if (!c8806.m22739().m20688(this)) {
            return false;
        }
        f63740.mo7088("handleResponse() Denial detected");
        if (c8806.m22757()) {
            c8806.m22739().m20696();
            c8806.m22755().clear();
            Iterator it = ((ConcurrentMapC10942) c8806.m22751()).values().iterator();
            while (it.hasNext()) {
                ((C20095) ((AbstractC10134) it.next())).m46330();
            }
        }
        c8806.m22768();
        return true;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public C20095 mo2715(boolean z) {
        return new C20095(C20195.unmodifiableMap(this.f40739), 0, 0, 0, z, null);
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
        sb.append(" address: '");
        InetAddress inetAddress = this.f63741;
        sb.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb.append('\'');
    }
}
