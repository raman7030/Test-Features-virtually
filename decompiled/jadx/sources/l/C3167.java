package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۗۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48KN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3167 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f9969 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -43, -59, -9, 1, 19, 79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, GCMSIVBlockCipher.MASK, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f9970 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f9972 = InterfaceC0053.f930;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f9971 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9973 = 2;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9721(C21843 c21843, List list) {
        int i;
        c21843.f69995.getClass();
        if (c21843.f69995.limit() - c21843.f69995.position() == 0) {
            return;
        }
        byte[] bArr = (this.f9973 == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null;
        ByteBuffer byteBuffer = c21843.f69995;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.f9973 == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
            i = length;
        } else {
            i = 0;
        }
        if (this.f9972.capacity() < i4) {
            this.f9972 = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f9972.clear();
        }
        ByteBuffer byteBuffer2 = this.f9972;
        if (this.f9973 == 2) {
            if (bArr == null) {
                byteBuffer2.put(f9969);
            } else {
                m9719(byteBuffer2, 0L, 0, 1, true);
                byteBuffer2.put(C12016.m29383(bArr.length));
                byteBuffer2.put(bArr);
                byteBuffer2.putInt(22, C3603.m11005(byteBuffer2.arrayOffset(), byteBuffer2.array(), bArr.length + 28, 0));
                byteBuffer2.position(bArr.length + 28);
            }
            byteBuffer2.put(f9970);
        }
        int iM11991 = this.f9971 + C3939.m11991(byteBuffer);
        this.f9971 = iM11991;
        m9719(byteBuffer2, iM11991, this.f9973, i3, false);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i2 >= 255) {
                byteBuffer2.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer2.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer2.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
        if (this.f9973 == 2) {
            byteBuffer2.putInt(i + 66, C3603.m11005(byteBuffer2.arrayOffset() + i + 44, byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        } else {
            byteBuffer2.putInt(22, C3603.m11005(byteBuffer2.arrayOffset(), byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        this.f9973++;
        this.f9972 = byteBuffer2;
        c21843.mo7();
        c21843.m49228(this.f9972.remaining());
        c21843.f69995.put(this.f9972);
        c21843.m49229();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9720() {
        this.f9972 = InterfaceC0053.f930;
        this.f9971 = 0;
        this.f9973 = 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9719(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(C12016.m29383(i2));
    }
}
