package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12647 extends AbstractC1733 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f38091;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SeekableByteChannel f38092;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10531 f38093;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f38094;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f38095;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1358 f38096;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12647(C10531 c10531, C1358 c1358, C23411 c23411, List list) throws IOException {
        super(c1358.m4750(), c1358.m4765());
        this.f38093 = c10531;
        if (c23411.length() - c1358.m4729() < c1358.m4750()) {
            throw new IOException("entry size exceeds archive size");
        }
        this.f38096 = c1358;
        this.f38092 = c23411;
        this.f38094 = list;
    }

    @Override // l.AbstractC1733
    /* JADX INFO: renamed from: ֫ */
    public final int mo5783(long j, ByteBuffer byteBuffer) throws IOException {
        int iM30926;
        long j2 = this.f38095;
        C1358 c1358 = this.f38096;
        if (j2 >= c1358.m4765()) {
            return -1;
        }
        if (c1358.m4753()) {
            iM30926 = m30925(byteBuffer.limit(), this.f38095, byteBuffer);
        } else {
            iM30926 = m30926(j, byteBuffer);
        }
        if (iM30926 == -1) {
            if (byteBuffer.array().length > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.f38093.m26456();
            return iM30926;
        }
        this.f38095 += (long) iM30926;
        byteBuffer.flip();
        return iM30926;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m30926(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f38092) {
            this.f38092.position(j);
            i = this.f38092.read(byteBuffer);
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m30925(int i, long j, ByteBuffer byteBuffer) throws IOException {
        List list = this.f38094;
        if (list.isEmpty()) {
            return m30926(this.f38096.m4750() + j, byteBuffer);
        }
        if (this.f38091 >= list.size()) {
            return -1;
        }
        byte[] bArr = new byte[i];
        int i2 = ((InputStream) list.get(this.f38091)).read(bArr);
        if (i2 != -1) {
            byteBuffer.put(bArr, 0, i2);
        }
        if (this.f38091 == list.size() - 1) {
            return i2;
        }
        if (i2 == -1) {
            this.f38091++;
            return m30925(i, j, byteBuffer);
        }
        if (i2 >= i) {
            return i2;
        }
        this.f38091++;
        int iM30925 = m30925(i - i2, j + ((long) i2), byteBuffer);
        return iM30925 == -1 ? i2 : i2 + iM30925;
    }
}
