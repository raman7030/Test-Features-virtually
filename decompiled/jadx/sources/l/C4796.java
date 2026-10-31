package l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۙܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4796 extends AbstractC13262 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f15197;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f15198;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f15199;

    public C4796(AbstractC15440 abstractC15440) {
        this.f15199 = abstractC15440;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۘ */
    public final String mo10324() {
        return this.f15199.m36517();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo10325() throws IOException {
        if (this.f15197 == null) {
            m14003();
        }
        return this.f15197;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo10326() throws IOException {
        if (this.f15198 == null) {
            m14003();
        }
        return this.f15198;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14003() throws IOException {
        CRC32 crc32 = new CRC32();
        AbstractC15440 abstractC15440 = this.f15199;
        DataInputStream dataInputStream = new DataInputStream(abstractC15440.mo27926());
        try {
            if (dataInputStream.readInt() != -1395514453) {
                throw new IOException("Bad file: " + abstractC15440.getName());
            }
            byte[] bArr = new byte[dataInputStream.readInt()];
            this.f15197 = bArr;
            dataInputStream.readFully(bArr);
            crc32.update(this.f15197);
            byte[] bArr2 = new byte[dataInputStream.readInt()];
            this.f15198 = bArr2;
            dataInputStream.readFully(bArr2);
            crc32.update(this.f15198);
            if (crc32.getValue() != dataInputStream.readLong()) {
                throw new IOException("Bad file: " + abstractC15440.getName());
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
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void mo14000() {
        this.f15197 = null;
        this.f15198 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m13999(AbstractC15440 abstractC15440, String str, byte[] bArr, byte[] bArr2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        if (!abstractC15440.mo23120()) {
            abstractC15440.m36508();
        }
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(str + ".key");
        int i = 1;
        while (abstractC15440M36526.mo23120()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").key");
            abstractC15440M36526 = abstractC15440.m36526(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC15440M36526.mo23555(false));
            try {
                dataOutputStream2.writeInt(-1395514453);
                dataOutputStream2.writeInt(bArr.length);
                dataOutputStream2.write(bArr);
                dataOutputStream2.writeInt(bArr2.length);
                dataOutputStream2.write(bArr2);
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

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo14002() {
        return this.f15199.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String mo14004() {
        return this.f15199.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo14006() {
        return this.f15199.m36517();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo14001(String str) {
        String strConcat = str.concat(".key");
        AbstractC15440 abstractC15440 = this.f15199;
        return C16999.m39861(abstractC15440, abstractC15440.m36524(strConcat));
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo14005() {
        this.f15199.mo27929();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String mo14007() {
        return this.f15199.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] mo14008() throws IOException {
        m14003();
        mo14000();
        return this.f15199.m36506();
    }
}
