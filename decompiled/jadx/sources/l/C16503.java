package l;

import java.io.IOException;
import java.net.Socket;
import java.util.Comparator;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ܽ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16503 extends AbstractC8037 {
    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final void mo21352(C12454 c12454, String str) {
        c12454.m30613(str);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final void mo21353(C12454 c12454, String str, String str2) {
        c12454.m30616(str, str2);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21355(C8927 c8927, C23377 c23377) {
        return c8927.m23034(c23377);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final C23377 mo21350(C8927 c8927, C4965 c4965, C15615 c15615, C5215 c5215) {
        return c8927.m23033(c4965, c15615, c5215);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21354(C4965 c4965, C4965 c4966) {
        return c4965.m14403(c4966);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final Socket mo21348(C8927 c8927, C4965 c4965, C15615 c15615) {
        return c8927.m23032(c4965, c15615);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final void mo21351(C2577 c2577, SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        String[] strArr = c2577.f8158;
        String[] strArr2 = c2577.f8155;
        if (strArr2 != null) {
            enabledCipherSuites = C20032.m46185(C20922.f67671, sSLSocket.getEnabledCipherSuites(), strArr2);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            enabledProtocols = C20032.m46185(C20032.f64895, sSLSocket.getEnabledProtocols(), strArr);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Comparator comparator = C20922.f67671;
        byte[] bArr = C20032.f64884;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((C6810) comparator).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        C15981 c15981 = new C15981();
        c15981.f49324 = c2577.f8157;
        c15981.f49322 = strArr2;
        c15981.f49325 = strArr;
        c15981.f49323 = c2577.f8156;
        c15981.m37781(enabledCipherSuites);
        c15981.m37784(enabledProtocols);
        C2577 c2578 = new C2577(c15981);
        String[] strArr4 = c2578.f8158;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = c2578.f8155;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ۧ */
    public final void mo21356(C8927 c8927, C23377 c23377) {
        c8927.m23035(c23377);
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final C9078 mo21349(C8927 c8927) {
        return c8927.f27142;
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final int mo21346(C3804 c3804) {
        return c3804.f11998;
    }

    @Override // l.AbstractC8037
    /* JADX INFO: renamed from: ֫ */
    public final IOException mo21347(InterfaceC16687 interfaceC16687, IOException iOException) {
        return ((C20738) interfaceC16687).m47372(iOException);
    }
}
