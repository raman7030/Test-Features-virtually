package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.engines.XoodyakEngine;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class XoodyakDigest extends BufferBaseDigest {
    public static final int PhaseDown = 1;
    public static final int PhaseUp = 2;
    public static final int TAGLEN = 16;
    public static final int mode = 1;

    /* JADX INFO: renamed from: Cd */
    public int f80945Cd;
    public int phase;
    public final byte[] state;

    /* JADX INFO: loaded from: classes.dex */
    public class Friend {
        public static final Friend INSTANCE = new Friend();
    }

    public XoodyakDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 16);
        this.DigestSize = 32;
        this.state = new byte[48];
        this.algorithmName = "Xoodyak Hash";
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i) {
        if (this.m_bufPos != 0) {
            if (this.phase != 2) {
                XoodyakEngine.m55400up(Friend.INSTANCE, 1, this.state, 0);
            }
            XoodyakEngine.down(Friend.INSTANCE, 1, this.state, this.m_buf, 0, this.m_bufPos, this.f80945Cd);
        }
        XoodyakEngine.m55400up(Friend.INSTANCE, 1, this.state, 64);
        System.arraycopy(this.state, 0, bArr, i, 16);
        XoodyakEngine.down(Friend.INSTANCE, 1, this.state, null, 0, 0, 0);
        XoodyakEngine.m55400up(Friend.INSTANCE, 1, this.state, 0);
        System.arraycopy(this.state, 0, bArr, i + 16, 16);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i) {
        if (this.phase != 2) {
            XoodyakEngine.m55400up(Friend.INSTANCE, 1, this.state, 0);
        }
        XoodyakEngine.down(Friend.INSTANCE, 1, this.state, bArr, i, this.BlockSize, this.f80945Cd);
        this.phase = 1;
        this.f80945Cd = 0;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.fill(this.state, (byte) 0);
        this.phase = 2;
        this.f80945Cd = 3;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b) {
        super.update(b);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
    }
}
