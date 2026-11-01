package p067l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21112 extends AbstractC23793 {

    /* JADX INFO: renamed from: ᩴ */
    public static InterfaceC4410 f66371 = C13128.m30023(AbstractC21112.class.getName());

    /* JADX INFO: renamed from: ۘ */
    public InetAddress f66372;

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5060() {
        return false;
    }

    public AbstractC21112(String str, EnumC13420 enumC13420, EnumC8055 enumC8055, boolean z, int i, InetAddress inetAddress) {
        super(str, enumC13420, enumC8055, z, i);
        this.f66372 = inetAddress;
    }

    public AbstractC21112(String str, EnumC13420 enumC13420, EnumC8055 enumC8055, boolean z, int i, byte[] bArr) {
        super(str, enumC13420, enumC8055, z, i);
        try {
            this.f66372 = InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            f66371.mo9178("Address() exception ", (Throwable) e);
        }
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5059(AbstractC23793 abstractC23793) {
        try {
            if (abstractC23793 instanceof AbstractC21112) {
                InetAddress inetAddress = ((AbstractC21112) abstractC23793).f66372;
                InetAddress inetAddress2 = this.f66372;
                if (inetAddress2 != null || inetAddress == null) {
                    return inetAddress2.equals(inetAddress);
                }
            }
            return false;
        } catch (Exception e) {
            f66371.mo9184("Failed to compare addresses of DNSRecords", e);
            return false;
        }
    }

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo34938(DataOutputStream dataOutputStream) throws IOException {
        super.mo34938(dataOutputStream);
        for (byte b : this.f66372.getAddress()) {
            dataOutputStream.writeByte(b);
        }
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5057(C10738 c10738) {
        AbstractC21112 abstractC21112M22664;
        if (!c10738.m24709().m22668(this) || (abstractC21112M22664 = c10738.m24709().m22664(m34947(), m34948(), C14760.f42088)) == null) {
            return false;
        }
        int iM34936 = m34936((AbstractC23793) abstractC21112M22664);
        InterfaceC4410 interfaceC4410 = f66371;
        if (iM34936 == 0) {
            interfaceC4410.mo9183("handleQuery() Ignoring an identical address query");
            return false;
        }
        interfaceC4410.mo9183("handleQuery() Conflicting query detected.");
        if (c10738.m24727() && iM34936 > 0) {
            c10738.m24709().m22676();
            c10738.m24725().clear();
            Iterator it = ((ConcurrentMapC12768) c10738.m24721()).values().iterator();
            while (it.hasNext()) {
                ((C21467) ((AbstractC12000) it.next())).m48646();
            }
        }
        c10738.m24738();
        return true;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5058(C10738 c10738) {
        if (!c10738.m24709().m22668(this)) {
            return false;
        }
        f66371.mo9183("handleResponse() Denial detected");
        if (c10738.m24727()) {
            c10738.m24709().m22676();
            c10738.m24725().clear();
            Iterator it = ((ConcurrentMapC12768) c10738.m24721()).values().iterator();
            while (it.hasNext()) {
                ((C21467) ((AbstractC12000) it.next())).m48646();
            }
        }
        c10738.m24738();
        return true;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public C21467 mo5054(boolean z) {
        return new C21467(C21562.unmodifiableMap(this.f43820), 0, 0, 0, z, null);
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
        sb.append(" address: '");
        InetAddress inetAddress = this.f66372;
        sb.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb.append('\'');
    }
}
