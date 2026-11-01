package p067l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۫ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14303 extends AbstractC14973 {

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f40884;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f40885;

    public C14303(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        this.f40885 = abstractC17043;
        this.f40884 = abstractC17044;
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۘ */
    public final String mo12362() {
        return this.f40884.m38675();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo12363() {
        return this.f40885.m38664();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo12364() {
        return this.f40884.m38664();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۖ */
    public final String mo15882() {
        return this.f40884.getName() + "\n" + this.f40885.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۢ */
    public final String mo15884() {
        return this.f40884.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ܳ */
    public final String mo15886() {
        return this.f40884.m38675();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ֫ */
    public final String mo15881(String str) {
        String strConcat = str.concat(".pk8");
        AbstractC17043 abstractC17043 = this.f40884;
        AbstractC17043 abstractC17043M38682 = abstractC17043.m38682(strConcat);
        String strConcat2 = str.concat(".x509.pem");
        AbstractC17043 abstractC17044 = this.f40885;
        AbstractC17043 abstractC17043M38683 = abstractC17044.m38682(strConcat2);
        String strM42104 = C18524.m42104(abstractC17043, abstractC17043M38682);
        if (strM42104 != null) {
            return strM42104;
        }
        String strM42105 = C18524.m42104(abstractC17044, abstractC17043M38683);
        if (strM42105 == null) {
            return null;
        }
        C18524.m42104(abstractC17043M38682, abstractC17043);
        return strM42105;
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۧ */
    public final void mo15885() {
        this.f40884.mo29990();
        this.f40885.mo29990();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ܿ */
    public final String mo15887() {
        return this.f40884.m38675() + ".key";
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo15888() throws IOException, CertificateEncodingException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] encoded = m34296().getEncoded();
        byte[] encoded2 = m34292().getEncoded();
        CRC32 crc32 = new CRC32();
        crc32.update(encoded);
        crc32.update(encoded2);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(-1395514453);
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
            dataOutputStream.writeInt(encoded2.length);
            dataOutputStream.write(encoded2);
            dataOutputStream.writeLong(crc32.getValue());
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
