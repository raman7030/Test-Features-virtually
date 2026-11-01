package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsconBaseDigest extends BufferBaseDigest {
    public int ASCON_PB_ROUNDS;

    /* JADX INFO: renamed from: p */
    public AsconPermutationFriend.AsconPermutation f80789p;

    /* JADX INFO: loaded from: classes.dex */
    public class Friend {
        public static final Friend INSTANCE = new Friend();
    }

    public AsconBaseDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.ASCON_PB_ROUNDS = 12;
        this.f80789p = AsconPermutationFriend.getAsconPermutation(ISAPDigest.Friend.getFriend(Friend.INSTANCE));
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
        this.f80789p.f80983x0 ^= loadBytes(this.m_buf, 0, this.m_bufPos) ^ pad(this.m_bufPos);
        this.f80789p.m55366p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f80789p;
        asconPermutation.f80983x0 = loadBytes(bArr, i) ^ asconPermutation.f80983x0;
        this.f80789p.m55366p(this.ASCON_PB_ROUNDS);
    }

    public abstract void setBytes(long j, byte[] bArr, int i);

    public abstract void setBytes(long j, byte[] bArr, int i, int i2);

    public void squeeze(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 > this.BlockSize) {
            setBytes(this.f80789p.f80983x0, bArr, i3);
            this.f80789p.m55366p(this.ASCON_PB_ROUNDS);
            int i5 = this.BlockSize;
            i3 += i5;
            i4 -= i5;
        }
        setBytes(this.f80789p.f80983x0, bArr, i3, i4);
    }
}
