package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes2.dex */
public class Signature {
    public final byte[] challengeBits;
    public final Proof[] proofs;
    public final byte[] salt = new byte[32];

    public class Proof {
        public final byte[] communicatedBits;
        public final int[] inputShare;
        public final byte[] seed1;
        public final byte[] seed2;
        public final byte[] view3Commitment;
        public final byte[] view3UnruhG;

        public Proof(PicnicEngine picnicEngine) {
            int i = picnicEngine.seedSizeBytes;
            this.seed1 = new byte[i];
            this.seed2 = new byte[i];
            this.inputShare = new int[picnicEngine.stateSizeWords];
            this.communicatedBits = new byte[picnicEngine.andSizeBytes];
            this.view3Commitment = new byte[picnicEngine.digestSizeBytes];
            int i2 = picnicEngine.UnruhGWithInputBytes;
            if (i2 > 0) {
                this.view3UnruhG = new byte[i2];
            } else {
                this.view3UnruhG = null;
            }
        }
    }

    public Signature(PicnicEngine picnicEngine) {
        this.challengeBits = new byte[Utils.numBytes(picnicEngine.numMPCRounds * 2)];
        this.proofs = new Proof[picnicEngine.numMPCRounds];
        int i = 0;
        while (true) {
            Proof[] proofArr = this.proofs;
            if (i >= proofArr.length) {
                return;
            }
            proofArr[i] = new Proof(picnicEngine);
            i++;
        }
    }
}
