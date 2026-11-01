package p067l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۙܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J55M */
/* JADX INFO: loaded from: classes2.dex */
public final class C6885 {

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer f17898;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f17899;

    /* JADX INFO: renamed from: ܽ */
    public final C12250[] f17900;

    /* JADX INFO: renamed from: ᩳ */
    public final C8226 f17901;

    public C6885(byte[] bArr) throws C23649 {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f17898 = byteBufferWrap;
        byte[] bArr2 = new byte[16];
        byteBufferWrap.get(bArr2);
        if (bArr2[0] != 127 || bArr2[1] != 69 || bArr2[2] != 76 || bArr2[3] != 70) {
            throw new C23649("Invalid ELF signature");
        }
        byte b = bArr2[4];
        if (b == 1) {
            this.f17899 = false;
        } else {
            if (b != 2) {
                throw new C23649("Invalid ELF class");
            }
            this.f17899 = true;
        }
        byte b2 = bArr2[5];
        if (b2 == 1) {
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            if (b2 != 2) {
                throw new C23649("Invalid ELF endian");
            }
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }
        if (bArr2[6] != 1) {
            throw new C23649("Invalid ELF version");
        }
        byteBufferWrap.getShort(16);
        byteBufferWrap.getShort(18);
        byteBufferWrap.getInt(20);
        if (this.f17899) {
            byteBufferWrap.getLong(24);
            byteBufferWrap.getInt(48);
            C12250[] c12250ArrM15779 = m15779(byteBufferWrap.getInt(40), byteBufferWrap.getShort(58) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(60) & HPKE.aead_EXPORT_ONLY);
            this.f17900 = c12250ArrM15779;
            this.f17901 = (C8226) c12250ArrM15779[byteBufferWrap.getShort(62) & HPKE.aead_EXPORT_ONLY];
            return;
        }
        byteBufferWrap.getInt(24);
        byteBufferWrap.getInt(36);
        C12250[] c12250ArrM157710 = m15779(byteBufferWrap.getInt(32), byteBufferWrap.getShort(46) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(48) & HPKE.aead_EXPORT_ONLY);
        this.f17900 = c12250ArrM157710;
        this.f17901 = (C8226) c12250ArrM157710[byteBufferWrap.getShort(50) & HPKE.aead_EXPORT_ONLY];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX INFO: renamed from: ֫ */
    private C12250[] m15779(int i, int i2, int i3) {
        C12250 c14261;
        C12250[] c12250Arr = new C12250[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * i2) + i;
            int i6 = this.f17898.getInt(i5 + 4);
            if (i6 == 0) {
                c14261 = null;
            } else if (i6 == 9) {
                c14261 = new C14261(this, i5);
            } else if (i6 == 11 || i6 == 2) {
                c14261 = new C15601(this, i5);
            } else if (i6 == 3) {
                c14261 = new C8226(this, i5);
            } else if (i6 == 4) {
                c14261 = new C14261(this, i5);
            } else {
                c14261 = new C12250(this, i5);
            }
            c12250Arr[i4] = c14261;
        }
        return c12250Arr;
    }
}
