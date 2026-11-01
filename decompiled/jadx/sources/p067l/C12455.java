package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۤ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12455 {

    /* JADX INFO: renamed from: ֫ */
    public final int f34844;

    /* JADX INFO: renamed from: ۧ */
    public final int f34845;

    /* JADX INFO: renamed from: ܳ */
    public final int f34846;

    /* JADX INFO: renamed from: ܽ */
    public final int f34847;

    /* JADX INFO: renamed from: ܿ */
    public final int f34848;

    /* JADX INFO: renamed from: ᩳ */
    public final int f34849;

    /* JADX INFO: renamed from: ᩻ */
    public final int f34850;

    public C12455(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f34844 = i;
        this.f34850 = i2;
        this.f34846 = i3;
        this.f34847 = i4;
        this.f34849 = i5;
        this.f34845 = i6;
        this.f34848 = i7;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C12455 m28674(int i) {
        return new C12455(i, 0, 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12455 m28672(String str, byte[] bArr) throws IOException {
        int i;
        if (bArr.length < 112) {
            throw new IOException(C21466.m48631("Invalid dex header: ", str));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C12455 c12455M28670 = m28670(str, byteBufferOrder, bArr.length);
        int length = bArr.length;
        int i2 = byteBufferOrder.getInt(52);
        if (i2 == 0) {
            return c12455M28670;
        }
        if (i2 < 112 || (i = i2 + 4) > length) {
            throw new IOException(C21466.m48631("Invalid dex map_off: ", str));
        }
        int i3 = byteBufferOrder.getInt(i2);
        long j = (((long) i3) * 12) + ((long) i2) + 4;
        if (i3 < 0 || j > length) {
            throw new IOException(C21466.m48631("Invalid dex map_list: ", str));
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = byteBufferOrder.getShort(i) & HPKE.aead_EXPORT_ONLY;
            int i8 = byteBufferOrder.getInt(i + 4);
            if (i8 < 0) {
                throw new IOException(C21466.m48631("Invalid dex map item: ", str));
            }
            if (i7 == 7) {
                i4 = i8;
            } else if (i7 == 8) {
                i5 = i8;
            }
            i += 12;
        }
        return new C12455(c12455M28670.f34844, c12455M28670.f34850, c12455M28670.f34846, c12455M28670.f34847, c12455M28670.f34849, i4, i5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12455 m28673(AbstractC17043 abstractC17043, String str) throws IOException {
        C24618 c24618M38671 = abstractC17043.m38671("r");
        try {
            long length = c24618M38671.length();
            if (length < 112 || length > 2147483647L) {
                throw new IOException("Invalid dex header: " + str);
            }
            byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
            c24618M38671.seek(0L);
            c24618M38671.m54256(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            C12455 c12455M28671 = m28671(str, c24618M38671, length, m28670(str, ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN), (int) length));
            c24618M38671.close();
            return c12455M28671;
        } catch (Throwable th) {
            try {
                c24618M38671.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12455 m28670(String str, ByteBuffer byteBuffer, int i) throws IOException {
        if (byteBuffer.get(0) != 100 || byteBuffer.get(1) != 101 || byteBuffer.get(2) != 120 || byteBuffer.get(3) != 10 || byteBuffer.get(7) != 0) {
            throw new IOException(C21466.m48631("Invalid dex header: ", str));
        }
        int i2 = (byteBuffer.get(6) + (((byteBuffer.get(5) - 48) * 10) + ((byteBuffer.get(4) - 48) * 100))) - 48;
        int iM48058 = C21274.m48058(i2);
        if (iM48058 == -1) {
            throw new IOException(C20778.m46922(i2, "Unsupported dex version: "));
        }
        int i3 = byteBuffer.getInt(32);
        int i4 = byteBuffer.getInt(36);
        int i5 = byteBuffer.getInt(40);
        if (i3 < 112 || i3 > i || i4 != 112 || i5 != 305419896) {
            throw new IOException(C21466.m48631("Invalid dex header: ", str));
        }
        return new C12455(iM48058, byteBuffer.getInt(64), byteBuffer.getInt(72), byteBuffer.getInt(80), byteBuffer.getInt(88), 0, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12455 m28671(String str, C24618 c24618, long j, C12455 c12455) throws IOException {
        c24618.seek(52L);
        int i = c24618.readInt();
        if (i == 0) {
            return c12455;
        }
        if (i >= 112) {
            long j2 = i;
            long j3 = 4 + j2;
            if (j3 <= j) {
                c24618.seek(j2);
                int i2 = c24618.readInt();
                long j4 = (((long) i2) * 12) + j3;
                if (i2 < 0 || j4 > j) {
                    throw new IOException(C21466.m48631("Invalid dex map_list: ", str));
                }
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int iMo23137 = c24618.mo23137();
                    c24618.mo23137();
                    int i6 = c24618.readInt();
                    c24618.readInt();
                    if (i6 < 0) {
                        throw new IOException(C21466.m48631("Invalid dex map item: ", str));
                    }
                    if (iMo23137 == 7) {
                        i3 = i6;
                    } else if (iMo23137 == 8) {
                        i4 = i6;
                    }
                }
                return new C12455(c12455.f34844, c12455.f34850, c12455.f34846, c12455.f34847, c12455.f34849, i3, i4);
            }
        }
        throw new IOException(C21466.m48631("Invalid dex map_off: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28675(int i) {
        return this.f34850 <= i && this.f34846 <= i && this.f34847 <= i && this.f34849 <= i && this.f34845 <= i && this.f34848 <= i;
    }
}
