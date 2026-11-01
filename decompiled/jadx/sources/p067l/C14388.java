package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14388 extends AbstractC4015 {

    /* JADX INFO: renamed from: ۗ */
    public int f41119;

    /* JADX INFO: renamed from: ۙ */
    public final SeekableByteChannel f41120;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C12377 f41121;

    /* JADX INFO: renamed from: ۤ */
    public final List f41122;

    /* JADX INFO: renamed from: ۫ */
    public long f41123;

    /* JADX INFO: renamed from: ۬ */
    public final C3659 f41124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14388(C12377 c12377, C3659 c3659, C24618 c24618, List list) throws IOException {
        super(c3659.m6988(), c3659.m7003());
        this.f41121 = c12377;
        if (c24618.length() - c3659.m6967() < c3659.m6988()) {
            throw new IOException("entry size exceeds archive size");
        }
        this.f41124 = c3659;
        this.f41120 = c24618;
        this.f41122 = list;
    }

    @Override // p067l.AbstractC4015
    /* JADX INFO: renamed from: ֫ */
    public final int mo7993(long j, ByteBuffer byteBuffer) throws IOException {
        int iM33004;
        long j2 = this.f41123;
        C3659 c3659 = this.f41124;
        if (j2 >= c3659.m7003()) {
            return -1;
        }
        if (c3659.m6991()) {
            iM33004 = m33003(byteBuffer.limit(), this.f41123, byteBuffer);
        } else {
            iM33004 = m33004(j, byteBuffer);
        }
        if (iM33004 == -1) {
            if (byteBuffer.array().length > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.f41121.m28489();
            return iM33004;
        }
        this.f41123 += (long) iM33004;
        byteBuffer.flip();
        return iM33004;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m33004(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f41120) {
            this.f41120.position(j);
            i = this.f41120.read(byteBuffer);
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33003(int i, long j, ByteBuffer byteBuffer) throws IOException {
        List list = this.f41122;
        if (list.isEmpty()) {
            return m33004(this.f41124.m6988() + j, byteBuffer);
        }
        if (this.f41119 >= list.size()) {
            return -1;
        }
        byte[] bArr = new byte[i];
        int i2 = ((InputStream) list.get(this.f41119)).read(bArr);
        if (i2 != -1) {
            byteBuffer.put(bArr, 0, i2);
        }
        if (this.f41119 == list.size() - 1) {
            return i2;
        }
        if (i2 == -1) {
            this.f41119++;
            return m33003(i, j, byteBuffer);
        }
        if (i2 >= i) {
            return i2;
        }
        this.f41119++;
        int iM33003 = m33003(i - i2, j + ((long) i2), byteBuffer);
        return iM33003 == -1 ? i2 : i2 + iM33003;
    }
}
