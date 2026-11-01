package p067l;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܽ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18198 implements InterfaceC24904 {

    /* JADX INFO: renamed from: ܽ */
    public final String f54332;

    /* JADX INFO: renamed from: ۧ */
    public boolean f54331 = false;

    /* JADX INFO: renamed from: ᩳ */
    public MessageDigest f54333 = null;

    /* JADX INFO: renamed from: ֫ */
    public C12835 f54330 = null;

    public C18198(String str) {
        this.f54332 = str;
    }

    @Override // p067l.InterfaceC24904
    public final String getName() {
        return this.f54332;
    }

    public final String toString() {
        return this.f54332;
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8318() {
        return C18743.readAllLines(C10697.get(this.f54332, new String[0]));
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24904 mo8319(boolean z) {
        this.f54331 = z;
        return this;
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ۧ */
    public final MessageDigest mo8320() {
        return this.f54333;
    }

    @Override // p067l.InterfaceC24904
    public final int getSize() {
        C12835 c12835 = this.f54330;
        if (c12835 != null) {
            return c12835.size();
        }
        return 0;
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ֫ */
    public final DataInputStream mo8317(C18189 c18189) throws IOException {
        String str = this.f54332;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (this.f54331) {
                this.f54330 = new C12835(fileInputStream);
                this.f54333 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(this.f54330, this.f54333));
            }
            return new DataInputStream(fileInputStream);
        } catch (IOException e) {
            if (str.matches("^[A-Za-z]+:.*")) {
                try {
                    URLConnection uRLConnectionOpenConnection = new URI(str).toURL().openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    return new DataInputStream(uRLConnectionOpenConnection.getInputStream());
                } catch (IOException | URISyntaxException e2) {
                    if (c18189.isPresent()) {
                        ((AbstractC21279) c18189.get()).mo13866("Cannot read {0}", str);
                    }
                    throw e2;
                }
            }
            throw e;
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }
}
