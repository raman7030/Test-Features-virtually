package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsconBaseDigest extends BufferBaseDigest {
    public int ASCON_PB_ROUNDS;
    public AsconPermutationFriend.AsconPermutation p;

    /* JADX INFO: loaded from: classes.dex */
    public class Friend {
        public static final Friend INSTANCE = new Friend();
    }

    public AsconBaseDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.ASCON_PB_ROUNDS = 12;
        this.p = AsconPermutationFriend.getAsconPermutation(ISAPDigest.Friend.getFriend(Friend.INSTANCE));
        this.DigestSize = 32;
    }

    public void ensureSufficientOutputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i) {
        padAndAbsorb();
        squeeze(bArr, i, this.DigestSize);
    }

    public int hash(byte[] bArr, int i, int i2) {
        ensureSufficientOutputBuffer(bArr, i, i2);
        padAndAbsorb();
        squeeze(bArr, i, i2);
        return i2;
    }

    public abstract long loadBytes(byte[] bArr, int i);

    public abstract long loadBytes(byte[] bArr, int i, int i2);

    public abstract long pad(int i);

    public void padAndAbsorb() {
        this.p.x0 ^= loadBytes(this.m_buf, 0, this.m_bufPos) ^ pad(this.m_bufPos);
        this.p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.p;
        asconPermutation.x0 = loadBytes(bArr, i) ^ asconPermutation.x0;
        this.p.p(this.ASCON_PB_ROUNDS);
    }

    public abstract void setBytes(long j, byte[] bArr, int i);

    public abstract void setBytes(long j, byte[] bArr, int i, int i2);

    public void squeeze(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 > this.BlockSize) {
            setBytes(this.p.x0, bArr, i3);
            this.p.p(this.ASCON_PB_ROUNDS);
            int i5 = this.BlockSize;
            i3 += i5;
            i4 -= i5;
        }
        setBytes(this.p.x0, bArr, i3, i4);
    }
}
