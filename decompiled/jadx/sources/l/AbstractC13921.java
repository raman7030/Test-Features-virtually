package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13921 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41559;

    /* JADX INFO: renamed from: ֫ */
    public abstract InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889);

    /* JADX INFO: renamed from: ֫ */
    public abstract ArrayList mo7637(String str, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC17889 mo7638(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7639(MessageDigest messageDigest);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7643(C10130 c10130);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7646(boolean z);

    /* JADX INFO: renamed from: ܳ */
    public boolean mo7652() {
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo7654();

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo13919() {
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m33352() {
        return this.f41559;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m33350() {
        C10130 c10130 = new C10130();
        c10130.m25439(mo7654());
        mo7643(c10130);
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ֫ */
    public C19404 mo28347(InterfaceC17889 interfaceC17889) {
        InputStream inputStreamMo7636 = mo7636((AbstractActivityC3346) null, interfaceC17889);
        if (inputStreamMo7636 == null) {
            return null;
        }
        return new C19404(inputStreamMo7636, new C19277(interfaceC17889.getSize()), true);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo7640(Set set, InterfaceC23094 interfaceC23094) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            try {
                if (interfaceC17889.isDirectory()) {
                    interfaceC23094.mo8530(interfaceC17889, null);
                } else {
                    interfaceC23094.mo8530(interfaceC17889, mo7636((AbstractActivityC3346) null, interfaceC17889));
                }
            } catch (IOException e) {
                if (!interfaceC23094.mo8531(e)) {
                    return;
                }
            }
            if (interfaceC23094.mo1526()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo7641(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889, InterfaceC3569 interfaceC3569) throws IOException {
        InputStream inputStreamMo7636 = mo7636(abstractActivityC3346, interfaceC17889);
        try {
            if (inputStreamMo7636 == null) {
                interfaceC3569.mo10876();
                if (inputStreamMo7636 != null) {
                    inputStreamMo7636.close();
                    return;
                }
                return;
            }
            C19277 c19277 = new C19277(interfaceC17889.getSize());
            c19277.m44459(new C17951(interfaceC3569));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = inputStreamMo7636.read(bArr);
                if (i == -1) {
                    inputStreamMo7636.close();
                    return;
                } else {
                    interfaceC3569.mo10874(i, bArr);
                    c19277.m44460(i);
                }
            } while (!interfaceC3569.mo1526());
            inputStreamMo7636.close();
        } catch (Throwable th) {
            if (inputStreamMo7636 != null) {
                try {
                    inputStreamMo7636.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m33351(String str) {
        InterfaceC17889 interfaceC17889Mo7638 = mo7638(str);
        if (interfaceC17889Mo7638 != null) {
            return interfaceC17889Mo7638;
        }
        throw new IOException(C20094.m46315("Failed to get file item: ", str));
    }
}
