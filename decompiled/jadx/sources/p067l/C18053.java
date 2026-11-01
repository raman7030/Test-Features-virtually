package p067l;

import java.io.IOException;
import java.net.Socket;
import java.util.Comparator;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ܽ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18053 extends AbstractC10007 {
    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final void mo23319(C14205 c14205, String str) {
        c14205.m32678(str);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final void mo23320(C14205 c14205, String str, String str2) {
        c14205.m32681(str, str2);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23322(C10853 c10853, C24585 c24585) {
        return c10853.m25008(c24585);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final C24585 mo23317(C10853 c10853, C7088 c7088, C17208 c17208, C7325 c7325) {
        return c10853.m25007(c7088, c17208, c7325);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23321(C7088 c7088, C7088 c7089) {
        return c7088.m16307(c7089);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final Socket mo23315(C10853 c10853, C7088 c7088, C17208 c17208) {
        return c10853.m25006(c7088, c17208);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final void mo23318(C4818 c4818, SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        String[] strArr = c4818.f10950;
        String[] strArr2 = c4818.f10947;
        if (strArr2 != null) {
            enabledCipherSuites = C21407.m48501(C22253.f70356, sSLSocket.getEnabledCipherSuites(), strArr2);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            enabledProtocols = C21407.m48501(C21407.f67537, sSLSocket.getEnabledProtocols(), strArr);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Comparator comparator = C22253.f70356;
        byte[] bArr = C21407.f67526;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((C8841) comparator).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            int length2 = enabledCipherSuites.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
            strArr3[length2] = str;
            enabledCipherSuites = strArr3;
        }
        C17557 c17557 = new C17557();
        c17557.f52487 = c4818.f10949;
        c17557.f52485 = strArr2;
        c17557.f52488 = strArr;
        c17557.f52486 = c4818.f10948;
        c17557.m39966(enabledCipherSuites);
        c17557.m39969(enabledProtocols);
        C4818 c4819 = new C4818(c17557);
        String[] strArr4 = c4819.f10950;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = c4819.f10947;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ۧ */
    public final void mo23323(C10853 c10853, C24585 c24585) {
        c10853.m25009(c24585);
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final C10996 mo23316(C10853 c10853) {
        return c10853.f30077;
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final int mo23313(C5984 c5984) {
        return c5984.f14806;
    }

    @Override // p067l.AbstractC10007
    /* JADX INFO: renamed from: ֫ */
    public final IOException mo23314(InterfaceC18228 interfaceC18228, IOException iOException) {
        return ((C22078) interfaceC18228).m49699(iOException);
    }
}
