package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܽۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18106 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f54054 = new C19203(10);

    /* JADX INFO: renamed from: ֫ */
    public final C25079 m41182(InterfaceC10375 interfaceC10375, InterfaceC18281 interfaceC18281) {
        C19203 c19203 = this.f54054;
        C25079 c25079M43080 = null;
        int i = 0;
        while (true) {
            try {
                interfaceC10375.mo24031(0, 10, c19203.m43728());
                c19203.m43730(0);
                if (c19203.m43737() != 4801587) {
                    break;
                }
                c19203.m43724(3);
                int iM43713 = c19203.m43713();
                int i2 = iM43713 + 10;
                if (c25079M43080 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c19203.m43728(), 0, bArr, 0, 10);
                    interfaceC10375.mo24031(10, iM43713, bArr);
                    c25079M43080 = new C18952(interfaceC18281).m43080(i2, bArr);
                } else {
                    interfaceC10375.mo24030(iM43713);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC10375.mo24036();
        interfaceC10375.mo24030(i);
        return c25079M43080;
    }
}
