package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes2.dex */
public class Signature2 {
    public int[] challengeC;
    public byte[] challengeHash;
    public int[] challengeP;
    public byte[] cvInfo;
    public int cvInfoLen;
    public byte[] iSeedInfo;
    public int iSeedInfoLen;
    public Proof2[] proofs;
    public byte[] salt = new byte[32];

    public class Proof2 {
        public byte[] C;
        public byte[] aux;
        public byte[] input;
        public byte[] msgs;
        public byte[] seedInfo = null;
        public int seedInfoLen = 0;

        public Proof2(PicnicEngine picnicEngine) {
            this.C = new byte[picnicEngine.digestSizeBytes];
            this.input = new byte[picnicEngine.stateSizeBytes];
            int i = picnicEngine.andSizeBytes;
            this.aux = new byte[i];
            this.msgs = new byte[i];
        }
    }

    public Signature2(PicnicEngine picnicEngine) {
        this.challengeHash = new byte[picnicEngine.digestSizeBytes];
        int i = picnicEngine.numOpenedRounds;
        this.challengeC = new int[i];
        this.challengeP = new int[i];
        this.proofs = new Proof2[picnicEngine.numMPCRounds];
    }
}
