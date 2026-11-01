package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۗۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48KN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5378 {

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f12772 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -43, -59, -9, 1, 19, 79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, GCMSIVBlockCipher.MASK, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ᩳ */
    public static final byte[] f12773 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۧ */
    public ByteBuffer f12775 = InterfaceC2418.f3706;

    /* JADX INFO: renamed from: ֫ */
    public int f12774 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f12776 = 2;

    /* JADX INFO: renamed from: ֫ */
    public final void m11765(C23128 c23128, List list) {
        int i;
        c23128.f72704.getClass();
        if (c23128.f72704.limit() - c23128.f72704.position() == 0) {
            return;
        }
        byte[] bArr = (this.f12776 == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null;
        ByteBuffer byteBuffer = c23128.f72704;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.f12776 == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
            i = length;
        } else {
            i = 0;
        }
        if (this.f12775.capacity() < i4) {
            this.f12775 = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f12775.clear();
        }
        ByteBuffer byteBuffer2 = this.f12775;
        if (this.f12776 == 2) {
            if (bArr == null) {
                byteBuffer2.put(f12772);
            } else {
                m11763(byteBuffer2, 0L, 0, 1, true);
                byteBuffer2.put(C13789.m31443(bArr.length));
                byteBuffer2.put(bArr);
                byteBuffer2.putInt(22, C5792.m12981(byteBuffer2.arrayOffset(), byteBuffer2.array(), bArr.length + 28, 0));
                byteBuffer2.position(bArr.length + 28);
            }
            byteBuffer2.put(f12773);
        }
        int iM13911 = this.f12774 + C6112.m13911(byteBuffer);
        this.f12774 = iM13911;
        m11763(byteBuffer2, iM13911, this.f12776, i3, false);
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
        if (this.f12776 == 2) {
            byteBuffer2.putInt(i + 66, C5792.m12981(byteBuffer2.arrayOffset() + i + 44, byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        } else {
            byteBuffer2.putInt(22, C5792.m12981(byteBuffer2.arrayOffset(), byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        this.f12776++;
        this.f12775 = byteBuffer2;
        c23128.mo7();
        c23128.m51579(this.f12775.remaining());
        c23128.f72704.put(this.f12775);
        c23128.m51580();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11764() {
        this.f12775 = InterfaceC2418.f3706;
        this.f12774 = 0;
        this.f12776 = 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11763(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
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
        byteBuffer.put(C13789.m31443(i2));
    }
}
