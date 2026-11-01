package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsconXofBase extends AsconBaseDigest implements Xof {
    public final byte[] buffer = new byte[this.BlockSize];
    public int bytesInBuffer;
    public boolean m_squeezing;

    private void ensureNoAbsorbWhileSqueezing(boolean z) {
        if (z) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public int doFinal(byte[] bArr, int i, int i2) {
        int iDoOutput = doOutput(bArr, i, i2);
        reset();
        return iDoOutput;
    }

    public int doOutput(byte[] bArr, int i, int i2) {
        int iHash;
        ensureSufficientOutputBuffer(bArr, i, i2);
        int i3 = this.bytesInBuffer;
        if (i3 != 0) {
            int i4 = this.BlockSize - i3;
            iHash = Math.min(i2, i3);
            System.arraycopy(this.buffer, i4, bArr, i, iHash);
            this.bytesInBuffer -= iHash;
        } else {
            iHash = 0;
        }
        int i5 = i2 - iHash;
        int i6 = this.BlockSize;
        if (i5 >= i6) {
            iHash += hash(bArr, i + iHash, i5 - (i5 % i6));
        }
        if (iHash >= i2) {
            return iHash;
        }
        hash(this.buffer, 0, this.BlockSize);
        int i7 = i2 - iHash;
        System.arraycopy(this.buffer, 0, bArr, i + iHash, i7);
        this.bytesInBuffer = this.buffer.length - i7;
        return iHash + i7;
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void padAndAbsorb() {
        if (this.m_squeezing) {
            this.f80789p.m55366p(this.ASCON_PB_ROUNDS);
        } else {
            this.m_squeezing = true;
            super.padAndAbsorb();
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        this.m_squeezing = false;
        this.bytesInBuffer = 0;
        super.reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte b) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(b);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(bArr, i, i2);
    }
}
