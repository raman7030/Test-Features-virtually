package p067l;

import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStream;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24584 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C19891 f77841;

    /* JADX INFO: renamed from: ۙ */
    public byte[] f77842;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ Iterator f77843;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ int f77844;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ long f77845;

    /* JADX INFO: renamed from: ᩸ */
    public InputStream f77847;

    /* JADX INFO: renamed from: ᩶ */
    public long f77846 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public long f77848 = 0;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C24584(C19891 c19891, Iterator it, int i, long j) throws IOException {
        this.f77841 = c19891;
        this.f77843 = it;
        this.f77844 = i;
        this.f77845 = j;
        m54212();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54212() throws IOException {
        Iterator it = this.f77843;
        if (!it.hasNext()) {
            this.f77847 = null;
            return;
        }
        C4189 c4189 = (C4189) it.next();
        Iterator it2 = c4189.getDstExtentsList().iterator();
        long numBlocks = 0;
        while (it2.hasNext()) {
            numBlocks += ((C14052) it2.next()).getNumBlocks() * ((long) this.f77844);
        }
        this.f77846 = numBlocks;
        this.f77848 = 0L;
        if (c4189.getType() == EnumC9358.ZERO) {
            this.f77847 = new C7277(numBlocks);
            return;
        }
        C4468 c4468 = new C4468(this.f77841.f60425, c4189.getDataOffset() + this.f77845, c4189.getDataLength());
        int i = C21903.f68911[c4189.getType().ordinal()];
        if (i == 1) {
            this.f77847 = c4468;
            return;
        }
        if (i == 2) {
            byte[] bArr = this.f77842;
            if (bArr == null) {
                bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                this.f77842 = bArr;
            }
            this.f77847 = new C11352(new C20300(c4468, bArr));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                this.f77847 = new ZstdInputStream(c4468, RecyclingBufferPool.INSTANCE);
                return;
            } else {
                throw new IOException("Unsupported operation type: " + c4189.getType().getNumber());
            }
        }
        byte[] bArr2 = this.f77842;
        if (bArr2 == null) {
            bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            this.f77842 = bArr2;
        }
        this.f77847 = C3410.m6038(new C20300(c4468, bArr2));
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f77847;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f77847;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i == -1) {
                InputStream inputStream2 = this.f77847;
                if (inputStream2 != null) {
                    inputStream2.close();
                    if (this.f77846 != this.f77848) {
                        throw new IOException("Size check fail");
                    }
                }
                m54212();
            } else {
                this.f77848++;
                return i;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f77847 == null) {
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
            int i3 = this.f77847.read(bArr, i, i2);
            if (i3 <= 0) {
                InputStream inputStream = this.f77847;
                if (inputStream != null) {
                    inputStream.close();
                    if (this.f77846 != this.f77848) {
                        throw new IOException("Size check fail");
                    }
                }
                m54212();
            } else {
                this.f77848 += (long) i3;
                return i3;
            }
        } while (this.f77847 != null);
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f77847;
        if (inputStream != null) {
            inputStream.close();
            this.f77847 = null;
        }
    }
}
