package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۤ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10612 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f31872;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f31873;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f31874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31875;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31876;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f31877;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f31878;

    public C10612(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f31872 = i;
        this.f31878 = i2;
        this.f31874 = i3;
        this.f31875 = i4;
        this.f31877 = i5;
        this.f31873 = i6;
        this.f31876 = i7;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10612 m26634(int i) {
        return new C10612(i, 0, 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10612 m26632(String str, byte[] bArr) throws IOException {
        int i;
        if (bArr.length < 112) {
            throw new IOException(C20094.m46315("Invalid dex header: ", str));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C10612 c10612M26630 = m26630(str, byteBufferOrder, bArr.length);
        int length = bArr.length;
        int i2 = byteBufferOrder.getInt(52);
        if (i2 == 0) {
            return c10612M26630;
        }
        if (i2 < 112 || (i = i2 + 4) > length) {
            throw new IOException(C20094.m46315("Invalid dex map_off: ", str));
        }
        int i3 = byteBufferOrder.getInt(i2);
        long j = (((long) i3) * 12) + ((long) i2) + 4;
        if (i3 < 0 || j > length) {
            throw new IOException(C20094.m46315("Invalid dex map_list: ", str));
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = byteBufferOrder.getShort(i) & HPKE.aead_EXPORT_ONLY;
            int i8 = byteBufferOrder.getInt(i + 4);
            if (i8 < 0) {
                throw new IOException(C20094.m46315("Invalid dex map item: ", str));
            }
            if (i7 == 7) {
                i4 = i8;
            } else if (i7 == 8) {
                i5 = i8;
            }
            i += 12;
        }
        return new C10612(c10612M26630.f31872, c10612M26630.f31878, c10612M26630.f31874, c10612M26630.f31875, c10612M26630.f31877, i4, i5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10612 m26633(AbstractC15440 abstractC15440, String str) throws IOException {
        C23411 c23411M36513 = abstractC15440.m36513("r");
        try {
            long length = c23411M36513.length();
            if (length < 112 || length > 2147483647L) {
                throw new IOException("Invalid dex header: " + str);
            }
            byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
            c23411M36513.seek(0L);
            c23411M36513.m51858(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            C10612 c10612M26631 = m26631(str, c23411M36513, length, m26630(str, ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN), (int) length));
            c23411M36513.close();
            return c10612M26631;
        } catch (Throwable th) {
            try {
                c23411M36513.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10612 m26630(String str, ByteBuffer byteBuffer, int i) throws IOException {
        if (byteBuffer.get(0) != 100 || byteBuffer.get(1) != 101 || byteBuffer.get(2) != 120 || byteBuffer.get(3) != 10 || byteBuffer.get(7) != 0) {
            throw new IOException(C20094.m46315("Invalid dex header: ", str));
        }
        int i2 = (byteBuffer.get(6) + (((byteBuffer.get(5) - 48) * 10) + ((byteBuffer.get(4) - 48) * 100))) - 48;
        int iM45747 = C19893.m45747(i2);
        if (iM45747 == -1) {
            throw new IOException(C19370.m44628(i2, "Unsupported dex version: "));
        }
        int i3 = byteBuffer.getInt(32);
        int i4 = byteBuffer.getInt(36);
        int i5 = byteBuffer.getInt(40);
        if (i3 < 112 || i3 > i || i4 != 112 || i5 != 305419896) {
            throw new IOException(C20094.m46315("Invalid dex header: ", str));
        }
        return new C10612(iM45747, byteBuffer.getInt(64), byteBuffer.getInt(72), byteBuffer.getInt(80), byteBuffer.getInt(88), 0, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10612 m26631(String str, C23411 c23411, long j, C10612 c10612) throws IOException {
        c23411.seek(52L);
        int i = c23411.readInt();
        if (i == 0) {
            return c10612;
        }
        if (i >= 112) {
            long j2 = i;
            long j3 = 4 + j2;
            if (j3 <= j) {
                c23411.seek(j2);
                int i2 = c23411.readInt();
                long j4 = (((long) i2) * 12) + j3;
                if (i2 < 0 || j4 > j) {
                    throw new IOException(C20094.m46315("Invalid dex map_list: ", str));
                }
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int iMo21172 = c23411.mo21172();
                    c23411.mo21172();
                    int i6 = c23411.readInt();
                    c23411.readInt();
                    if (i6 < 0) {
                        throw new IOException(C20094.m46315("Invalid dex map item: ", str));
                    }
                    if (iMo21172 == 7) {
                        i3 = i6;
                    } else if (iMo21172 == 8) {
                        i4 = i6;
                    }
                }
                return new C10612(c10612.f31872, c10612.f31878, c10612.f31874, c10612.f31875, c10612.f31877, i3, i4);
            }
        }
        throw new IOException(C20094.m46315("Invalid dex map_off: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26635(int i) {
        return this.f31878 <= i && this.f31874 <= i && this.f31875 <= i && this.f31877 <= i && this.f31873 <= i && this.f31876 <= i;
    }
}
