package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsconBaseEngine extends AEADBaseEngine {
    public long ASCON_IV;

    /* JADX INFO: renamed from: K0 */
    public long f80976K0;

    /* JADX INFO: renamed from: K1 */
    public long f80977K1;

    /* JADX INFO: renamed from: N0 */
    public long f80978N0;

    /* JADX INFO: renamed from: N1 */
    public long f80979N1;
    public long dsep;

    /* JADX INFO: renamed from: nr */
    public int f80980nr;

    /* JADX INFO: renamed from: p */
    public AsconPermutationFriend.AsconPermutation f80981p = new AsconPermutationFriend.AsconPermutation();

    public abstract void ascon_aeadinit();

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        int i = this.m_state.ord;
        if (i == 2 || i == 6) {
            processFinalAAD();
            this.f80981p.m55366p(this.f80980nr);
        }
        this.f80981p.f80987x4 ^= this.dsep;
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public abstract String getAlgorithmVersion();

    public abstract long loadBytes(byte[] bArr, int i);

    public abstract long pad(int i);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        this.f80981p.f80983x0 ^= loadBytes(bArr, i);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f80981p;
            asconPermutation.f80984x1 = loadBytes(bArr, i + 8) ^ asconPermutation.f80984x1;
        }
        this.f80981p.m55366p(this.f80980nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jLoadBytes = loadBytes(bArr, i);
        setBytes(this.f80981p.f80983x0 ^ jLoadBytes, bArr2, i2);
        this.f80981p.f80983x0 = jLoadBytes;
        if (this.BlockSize == 16) {
            long jLoadBytes2 = loadBytes(bArr, i + 8);
            setBytes(this.f80981p.f80984x1 ^ jLoadBytes2, bArr2, i2 + 8);
            this.f80981p.f80984x1 = jLoadBytes2;
        }
        this.f80981p.m55366p(this.f80980nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f80981p.f80983x0 ^= loadBytes(bArr, i);
        setBytes(this.f80981p.f80983x0, bArr2, i2);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f80981p;
            asconPermutation.f80984x1 = loadBytes(bArr, i + 8) ^ asconPermutation.f80984x1;
            setBytes(this.f80981p.f80984x1, bArr2, i2 + 8);
        }
        this.f80981p.m55366p(this.f80980nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        if (this.forEncryption) {
            processFinalEncrypt(this.m_buf, this.m_bufPos, bArr, i);
        } else {
            processFinalDecrypt(this.m_buf, this.m_bufPos, bArr, i);
        }
        setBytes(this.f80981p.f80986x3, this.mac, 0);
        setBytes(this.f80981p.f80987x4, this.mac, 8);
    }

    public abstract void processFinalDecrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void processFinalEncrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        ascon_aeadinit();
    }

    public abstract void setBytes(long j, byte[] bArr, int i);
}
