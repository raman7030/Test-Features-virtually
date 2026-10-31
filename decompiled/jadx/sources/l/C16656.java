package l;

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
public final class C16656 implements InterfaceC23712 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f51150;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f51149 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public MessageDigest f51151 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11013 f51148 = null;

    public C16656(String str) {
        this.f51150 = str;
    }

    @Override // l.InterfaceC23712
    public final String getName() {
        return this.f51150;
    }

    public final String toString() {
        return this.f51150;
    }

    @Override // l.InterfaceC23712
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo6120() {
        return C17229.readAllLines(C8763.get(this.f51150, new String[0]));
    }

    @Override // l.InterfaceC23712
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC23712 mo6121(boolean z) {
        this.f51149 = z;
        return this;
    }

    @Override // l.InterfaceC23712
    /* JADX INFO: renamed from: ۧ */
    public final MessageDigest mo6122() {
        return this.f51151;
    }

    @Override // l.InterfaceC23712
    public final int getSize() {
        C11013 c11013 = this.f51148;
        if (c11013 != null) {
            return c11013.size();
        }
        return 0;
    }

    @Override // l.InterfaceC23712
    /* JADX INFO: renamed from: ֫ */
    public final DataInputStream mo6119(C16646 c16646) throws IOException {
        String str = this.f51150;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (this.f51149) {
                this.f51148 = new C11013(fileInputStream);
                this.f51151 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(this.f51148, this.f51151));
            }
            return new DataInputStream(fileInputStream);
        } catch (IOException e) {
            if (str.matches("^[A-Za-z]+:.*")) {
                try {
                    URLConnection uRLConnectionOpenConnection = new URI(str).toURL().openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    return new DataInputStream(uRLConnectionOpenConnection.getInputStream());
                } catch (IOException | URISyntaxException e2) {
                    if (c16646.isPresent()) {
                        ((AbstractC19898) c16646.get()).mo11946("Cannot read {0}", str);
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
