package l;

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
public final class C20319 extends AbstractC13262 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f65620;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f65621;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f65622;

    public C20319(AbstractC15440 abstractC15440) {
        this.f65622 = abstractC15440;
        this.f39716 = (String) AbstractC13262.f39715.get(mo10324());
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۘ */
    public final String mo10324() {
        return this.f65622.m36517() + '*';
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo32195() {
        if (this.f39716 == null) {
            return true;
        }
        try {
            mo32190();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֫ */
    public final void mo32190() throws Exception {
        AbstractC15440 abstractC15440 = this.f65622;
        CRC32 crc32 = new CRC32();
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC15440.mo27926());
            try {
                if (dataInputStream.readInt() != -1395514454) {
                    throw new C1637("Bad file: " + abstractC15440.getName());
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                byte[] bArrM46629 = m46629(this.f39716, bArr);
                this.f65620 = bArrM46629;
                crc32.update(bArrM46629);
                byte[] bArr2 = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr2);
                byte[] bArrM466210 = m46629(this.f39716, bArr2);
                this.f65621 = bArrM466210;
                crc32.update(bArrM466210);
                if (crc32.getValue() != dataInputStream.readLong()) {
                    throw new C1637("Bad file: " + abstractC15440.getName());
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
            this.f39716 = null;
            AbstractC13262.f39715.remove(mo10324());
            throw e;
        }
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֡ */
    public final void mo14000() {
        this.f65620 = null;
        this.f65621 = null;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo10325() {
        return this.f65620;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo10326() {
        return this.f65621;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m46628(AbstractC15440 abstractC15440, String str, byte[] bArr, byte[] bArr2, String str2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        byte[] bArrM46630 = m46630(str2, bArr);
        byte[] bArrM46631 = m46630(str2, bArr2);
        if (!abstractC15440.mo23120()) {
            abstractC15440.m36508();
        }
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(str + ".aes");
        int i = 1;
        while (abstractC15440M36526.mo23120()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").aes");
            abstractC15440M36526 = abstractC15440.m36526(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC15440M36526.mo23555(false));
            try {
                dataOutputStream2.writeInt(-1395514454);
                dataOutputStream2.writeInt(bArrM46630.length);
                dataOutputStream2.write(bArrM46630);
                dataOutputStream2.writeInt(bArrM46631.length);
                dataOutputStream2.write(bArrM46631);
                dataOutputStream2.writeLong(crc32.getValue());
                C0349.m1793(dataOutputStream2);
                return abstractC15440M36526;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C0349.m1793(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m46629(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C8621 c8621 = new C8621();
        c8621.m22385(str.getBytes());
        byte[] bArrM22382 = c8621.m22382();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM22382, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c8621.m22381(bArrM22382, 0, 16);
        cipher.init(2, secretKeySpec, new IvParameterSpec(c8621.m22382()));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m46630(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C8621 c8621 = new C8621();
        c8621.m22385(str.getBytes());
        byte[] bArrM22382 = c8621.m22382();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM22382, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c8621.m22381(bArrM22382, 0, 16);
        cipher.init(1, secretKeySpec, new IvParameterSpec(c8621.m22382()));
        return cipher.doFinal(bArr);
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۖ */
    public final String mo14002() {
        return this.f65622.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۢ */
    public final String mo14004() {
        return this.f65622.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ܳ */
    public final String mo14006() {
        return this.f65622.m36517();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֫ */
    public final String mo14001(String str) {
        String strConcat = str.concat(".aes");
        AbstractC15440 abstractC15440 = this.f65622;
        return C16999.m39861(abstractC15440, abstractC15440.m36524(strConcat));
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۧ */
    public final void mo14005() {
        this.f65622.mo27929();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m46627(AbstractC13262 abstractC13262) {
        if (abstractC13262 instanceof C20319) {
            return ((C20319) abstractC13262).f65622;
        }
        throw new AssertionError();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ܿ */
    public final String mo14007() {
        return this.f65622.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo14008() throws IOException {
        AbstractC15440 abstractC15440 = this.f65622;
        byte[] bArrM36506 = abstractC15440.m36506();
        if (new DataInputStream(new ByteArrayInputStream(bArrM36506)).readInt() == -1395514454) {
            return bArrM36506;
        }
        throw new IOException("Bad file: " + abstractC15440.getName());
    }
}
