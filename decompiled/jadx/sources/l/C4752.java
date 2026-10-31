package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۙܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J55M */
/* JADX INFO: loaded from: classes2.dex */
public final class C4752 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f15067;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f15068;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10397[] f15069;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6163 f15070;

    public C4752(byte[] bArr) throws C22391 {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f15067 = byteBufferWrap;
        byte[] bArr2 = new byte[16];
        byteBufferWrap.get(bArr2);
        if (bArr2[0] != 127 || bArr2[1] != 69 || bArr2[2] != 76 || bArr2[3] != 70) {
            throw new C22391("Invalid ELF signature");
        }
        byte b = bArr2[4];
        if (b == 1) {
            this.f15068 = false;
        } else {
            if (b != 2) {
                throw new C22391("Invalid ELF class");
            }
            this.f15068 = true;
        }
        byte b2 = bArr2[5];
        if (b2 == 1) {
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            if (b2 != 2) {
                throw new C22391("Invalid ELF endian");
            }
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }
        if (bArr2[6] != 1) {
            throw new C22391("Invalid ELF version");
        }
        byteBufferWrap.getShort(16);
        byteBufferWrap.getShort(18);
        byteBufferWrap.getInt(20);
        if (this.f15068) {
            byteBufferWrap.getLong(24);
            byteBufferWrap.getInt(48);
            C10397[] c10397ArrM13899 = m13899(byteBufferWrap.getInt(40), byteBufferWrap.getShort(58) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(60) & HPKE.aead_EXPORT_ONLY);
            this.f15069 = c10397ArrM13899;
            this.f15070 = (C6163) c10397ArrM13899[byteBufferWrap.getShort(62) & HPKE.aead_EXPORT_ONLY];
            return;
        }
        byteBufferWrap.getInt(24);
        byteBufferWrap.getInt(36);
        C10397[] c10397ArrM138910 = m13899(byteBufferWrap.getInt(32), byteBufferWrap.getShort(46) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(48) & HPKE.aead_EXPORT_ONLY);
        this.f15069 = c10397ArrM138910;
        this.f15070 = (C6163) c10397ArrM138910[byteBufferWrap.getShort(50) & HPKE.aead_EXPORT_ONLY];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10397[] m13899(int i, int i2, int i3) {
        C10397 c12513;
        C10397[] c10397Arr = new C10397[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * i2) + i;
            int i6 = this.f15067.getInt(i5 + 4);
            if (i6 == 0) {
                c12513 = null;
            } else if (i6 == 9) {
                c12513 = new C12513(this, i5);
            } else if (i6 == 11 || i6 == 2) {
                c12513 = new C13923(this, i5);
            } else if (i6 == 3) {
                c12513 = new C6163(this, i5);
            } else if (i6 == 4) {
                c12513 = new C12513(this, i5);
            } else {
                c12513 = new C10397(this, i5);
            }
            c10397Arr[i4] = c12513;
        }
        return c10397Arr;
    }
}
