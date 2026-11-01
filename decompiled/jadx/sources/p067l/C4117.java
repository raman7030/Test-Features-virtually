package p067l;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.֫۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBHF */
/* JADX INFO: loaded from: classes2.dex */
public class C4117 implements InterfaceC24904 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f9074;

    /* JADX INFO: renamed from: ۧ */
    public boolean f9075 = false;

    /* JADX INFO: renamed from: ܽ */
    public MessageDigest f9076 = null;

    @Override // p067l.InterfaceC24904
    public String getName() {
        return "bytes/bytes";
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo8321() {
    }

    public C4117(byte[] bArr) {
        this.f9074 = bArr;
    }

    public C4117() {
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24904 mo8319(boolean z) {
        this.f9075 = z;
        return this;
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ۧ */
    public final MessageDigest mo8320() {
        return this.f9076;
    }

    @Override // p067l.InterfaceC24904
    public final int getSize() {
        return this.f9074.length;
    }

    public final String toString() {
        return getName();
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ֫ */
    public final DataInputStream mo8317(C18189 c18189) {
        mo8321();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f9074);
            if (this.f9075) {
                this.f9076 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(byteArrayInputStream, this.f9076));
            }
            return new DataInputStream(byteArrayInputStream);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.InterfaceC24904
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8318() throws IOException {
        mo8321();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.f9074), "utf-8"));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    arrayList.add(line);
                } else {
                    bufferedReader.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
