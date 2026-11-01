package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15599 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f44640;

    /* JADX INFO: renamed from: ֫ */
    public abstract InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370);

    /* JADX INFO: renamed from: ֫ */
    public abstract ArrayList mo9708(String str, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC19370 mo9709(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9710(MessageDigest messageDigest);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9714(C11996 c11996);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9717(boolean z);

    /* JADX INFO: renamed from: ܳ */
    public boolean mo9723() {
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo9725();

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo15799() {
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m35471() {
        return this.f44640;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m35469() {
        C11996 c11996 = new C11996();
        c11996.m27459(mo9725());
        mo9714(c11996);
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public C20810 mo30393(InterfaceC19370 interfaceC19370) {
        InputStream inputStreamMo9707 = mo9707((AbstractActivityC5549) null, interfaceC19370);
        if (inputStreamMo9707 == null) {
            return null;
        }
        return new C20810(inputStreamMo9707, new C20689(interfaceC19370.getSize()), true);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9711(Set set, InterfaceC24317 interfaceC24317) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            try {
                if (interfaceC19370.isDirectory()) {
                    interfaceC24317.mo10593(interfaceC19370, null);
                } else {
                    interfaceC24317.mo10593(interfaceC19370, mo9707((AbstractActivityC5549) null, interfaceC19370));
                }
            } catch (IOException e) {
                if (!interfaceC24317.mo10594(e)) {
                    return;
                }
            }
            if (interfaceC24317.mo3924()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9712(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370, InterfaceC5761 interfaceC5761) throws IOException {
        InputStream inputStreamMo9707 = mo9707(abstractActivityC5549, interfaceC19370);
        try {
            if (inputStreamMo9707 == null) {
                interfaceC5761.mo12856();
                if (inputStreamMo9707 != null) {
                    inputStreamMo9707.close();
                    return;
                }
                return;
            }
            C20689 c20689 = new C20689(interfaceC19370.getSize());
            c20689.m46753(new C19429(interfaceC5761));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = inputStreamMo9707.read(bArr);
                if (i == -1) {
                    inputStreamMo9707.close();
                    return;
                } else {
                    interfaceC5761.mo12854(i, bArr);
                    c20689.m46754(i);
                }
            } while (!interfaceC5761.mo3924());
            inputStreamMo9707.close();
        } catch (Throwable th) {
            if (inputStreamMo9707 != null) {
                try {
                    inputStreamMo9707.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19370 m35470(String str) {
        InterfaceC19370 interfaceC19370Mo9709 = mo9709(str);
        if (interfaceC19370Mo9709 != null) {
            return interfaceC19370Mo9709;
        }
        throw new IOException(C21466.m48631("Failed to get file item: ", str));
    }
}
