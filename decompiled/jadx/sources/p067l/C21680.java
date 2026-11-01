package p067l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩶ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5CA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21680 extends AbstractC14973 {

    /* JADX INFO: renamed from: ܽ */
    public byte[] f68295;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f68296;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f68297;

    public C21680(AbstractC17043 abstractC17043) {
        this.f68297 = abstractC17043;
        this.f42780 = (String) AbstractC14973.f42779.get(mo12362());
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۘ */
    public final String mo12362() {
        return this.f68297.m38675() + '*';
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo34294() {
        if (this.f42780 == null) {
            return true;
        }
        try {
            mo34289();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ֫ */
    public final void mo34289() throws Exception {
        AbstractC17043 abstractC17043 = this.f68297;
        CRC32 crc32 = new CRC32();
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC17043.mo29987());
            try {
                if (dataInputStream.readInt() != -1395514454) {
                    throw new C3924("Bad file: " + abstractC17043.getName());
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                byte[] bArrM48952 = m48952(this.f42780, bArr);
                this.f68295 = bArrM48952;
                crc32.update(bArrM48952);
                byte[] bArr2 = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr2);
                byte[] bArrM48953 = m48952(this.f42780, bArr2);
                this.f68296 = bArrM48953;
                crc32.update(bArrM48953);
                if (crc32.getValue() != dataInputStream.readLong()) {
                    throw new C3924("Bad file: " + abstractC17043.getName());
                }
                dataInputStream.close();
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.f42780 = null;
            AbstractC14973.f42779.remove(mo12362());
            throw e;
        }
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ֡ */
    public final void mo15880() {
        this.f68295 = null;
        this.f68296 = null;
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo12363() {
        return this.f68295;
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo12364() {
        return this.f68296;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m48951(AbstractC17043 abstractC17043, String str, byte[] bArr, byte[] bArr2, String str2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        byte[] bArrM48953 = m48953(str2, bArr);
        byte[] bArrM48954 = m48953(str2, bArr2);
        if (!abstractC17043.mo25094()) {
            abstractC17043.m38666();
        }
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(str + ".aes");
        int i = 1;
        while (abstractC17043M38684.mo25094()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").aes");
            abstractC17043M38684 = abstractC17043.m38684(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC17043M38684.mo25506(false));
            try {
                dataOutputStream2.writeInt(-1395514454);
                dataOutputStream2.writeInt(bArrM48953.length);
                dataOutputStream2.write(bArrM48953);
                dataOutputStream2.writeInt(bArrM48954.length);
                dataOutputStream2.write(bArrM48954);
                dataOutputStream2.writeLong(crc32.getValue());
                C2700.m4192(dataOutputStream2);
                return abstractC17043M38684;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C2700.m4192(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m48952(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C10562 c10562 = new C10562();
        c10562.m24354(str.getBytes());
        byte[] bArrM24351 = c10562.m24351();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM24351, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c10562.m24350(bArrM24351, 0, 16);
        cipher.init(2, secretKeySpec, new IvParameterSpec(c10562.m24351()));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m48953(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C10562 c10562 = new C10562();
        c10562.m24354(str.getBytes());
        byte[] bArrM24351 = c10562.m24351();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM24351, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c10562.m24350(bArrM24351, 0, 16);
        cipher.init(1, secretKeySpec, new IvParameterSpec(c10562.m24351()));
        return cipher.doFinal(bArr);
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۖ */
    public final String mo15882() {
        return this.f68297.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۢ */
    public final String mo15884() {
        return this.f68297.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ܳ */
    public final String mo15886() {
        return this.f68297.m38675();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ֫ */
    public final String mo15881(String str) {
        String strConcat = str.concat(".aes");
        AbstractC17043 abstractC17043 = this.f68297;
        return C18524.m42104(abstractC17043, abstractC17043.m38682(strConcat));
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۧ */
    public final void mo15885() {
        this.f68297.mo29990();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m48950(AbstractC14973 abstractC14973) {
        if (abstractC14973 instanceof C21680) {
            return ((C21680) abstractC14973).f68297;
        }
        throw new AssertionError();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ܿ */
    public final String mo15887() {
        return this.f68297.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo15888() throws IOException {
        AbstractC17043 abstractC17043 = this.f68297;
        byte[] bArrM38664 = abstractC17043.m38664();
        if (new DataInputStream(new ByteArrayInputStream(bArrM38664)).readInt() == -1395514454) {
            return bArrM38664;
        }
        throw new IOException("Bad file: " + abstractC17043.getName());
    }
}
