package l;

import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStream;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23375 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18437 f75095;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f75096;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f75097;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75098;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f75099;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InputStream f75101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f75100 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f75102 = 0;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C23375(C18437 c18437, Iterator it, int i, long j) throws IOException {
        this.f75095 = c18437;
        this.f75097 = it;
        this.f75098 = i;
        this.f75099 = j;
        m51815();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51815() throws IOException {
        Iterator it = this.f75097;
        if (!it.hasNext()) {
            this.f75101 = null;
            return;
        }
        C1915 c1915 = (C1915) it.next();
        Iterator it2 = c1915.getDstExtentsList().iterator();
        long numBlocks = 0;
        while (it2.hasNext()) {
            numBlocks += ((C12293) it2.next()).getNumBlocks() * ((long) this.f75098);
        }
        this.f75100 = numBlocks;
        this.f75102 = 0L;
        if (c1915.getType() == EnumC7354.ZERO) {
            this.f75101 = new C5165(numBlocks);
            return;
        }
        C2209 c2209 = new C2209(this.f75095.f57207, c1915.getDataOffset() + this.f75099, c1915.getDataLength());
        int i = C20554.f66230[c1915.getType().ordinal()];
        if (i == 1) {
            this.f75101 = c2209;
            return;
        }
        if (i == 2) {
            byte[] bArr = this.f75096;
            if (bArr == null) {
                bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                this.f75096 = bArr;
            }
            this.f75101 = new C9453(new C18867(c2209, bArr));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                this.f75101 = new ZstdInputStream(c2209, RecyclingBufferPool.INSTANCE);
                return;
            } else {
                throw new IOException("Unsupported operation type: " + c1915.getType().getNumber());
            }
        }
        byte[] bArr2 = this.f75096;
        if (bArr2 == null) {
            bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            this.f75096 = bArr2;
        }
        this.f75101 = C1096.m3765(new C18867(c2209, bArr2));
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f75101;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f75101;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i == -1) {
                InputStream inputStream2 = this.f75101;
                if (inputStream2 != null) {
                    inputStream2.close();
                    if (this.f75100 != this.f75102) {
                        throw new IOException("Size check fail");
                    }
                }
                m51815();
            } else {
                this.f75102++;
                return i;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f75101 == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.f75101.read(bArr, i, i2);
            if (i3 <= 0) {
                InputStream inputStream = this.f75101;
                if (inputStream != null) {
                    inputStream.close();
                    if (this.f75100 != this.f75102) {
                        throw new IOException("Size check fail");
                    }
                }
                m51815();
            } else {
                this.f75102 += (long) i3;
                return i3;
            }
        } while (this.f75101 != null);
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f75101;
        if (inputStream != null) {
            inputStream.close();
            this.f75101 = null;
        }
    }
}
