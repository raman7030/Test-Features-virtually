package p067l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۙܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6927 extends AbstractC14973 {

    /* JADX INFO: renamed from: ܽ */
    public byte[] f18029;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f18030;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f18031;

    public C6927(AbstractC17043 abstractC17043) {
        this.f18031 = abstractC17043;
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۘ */
    public final String mo12362() {
        return this.f18031.m38675();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo12363() throws IOException {
        if (this.f18029 == null) {
            m15883();
        }
        return this.f18029;
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo12364() throws IOException {
        if (this.f18030 == null) {
            m15883();
        }
        return this.f18030;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m15883() throws IOException {
        CRC32 crc32 = new CRC32();
        AbstractC17043 abstractC17043 = this.f18031;
        DataInputStream dataInputStream = new DataInputStream(abstractC17043.mo29987());
        try {
            if (dataInputStream.readInt() != -1395514453) {
                throw new IOException("Bad file: " + abstractC17043.getName());
            }
            byte[] bArr = new byte[dataInputStream.readInt()];
            this.f18029 = bArr;
            dataInputStream.readFully(bArr);
            crc32.update(this.f18029);
            byte[] bArr2 = new byte[dataInputStream.readInt()];
            this.f18030 = bArr2;
            dataInputStream.readFully(bArr2);
            crc32.update(this.f18030);
            if (crc32.getValue() != dataInputStream.readLong()) {
                throw new IOException("Bad file: " + abstractC17043.getName());
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

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ֡ */
    public final void mo15880() {
        this.f18029 = null;
        this.f18030 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m15879(AbstractC17043 abstractC17043, String str, byte[] bArr, byte[] bArr2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        if (!abstractC17043.mo25094()) {
            abstractC17043.m38666();
        }
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(str + ".key");
        int i = 1;
        while (abstractC17043M38684.mo25094()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").key");
            abstractC17043M38684 = abstractC17043.m38684(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC17043M38684.mo25506(false));
            try {
                dataOutputStream2.writeInt(-1395514453);
                dataOutputStream2.writeInt(bArr.length);
                dataOutputStream2.write(bArr);
                dataOutputStream2.writeInt(bArr2.length);
                dataOutputStream2.write(bArr2);
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

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۖ */
    public final String mo15882() {
        return this.f18031.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۢ */
    public final String mo15884() {
        return this.f18031.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ܳ */
    public final String mo15886() {
        return this.f18031.m38675();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ֫ */
    public final String mo15881(String str) {
        String strConcat = str.concat(".key");
        AbstractC17043 abstractC17043 = this.f18031;
        return C18524.m42104(abstractC17043, abstractC17043.m38682(strConcat));
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۧ */
    public final void mo15885() {
        this.f18031.mo29990();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ܿ */
    public final String mo15887() {
        return this.f18031.getName();
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo15888() throws IOException {
        m15883();
        mo15880();
        return this.f18031.m38664();
    }
}
