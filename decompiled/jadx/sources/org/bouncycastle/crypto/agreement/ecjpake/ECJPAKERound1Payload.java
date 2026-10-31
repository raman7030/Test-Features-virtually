package org.bouncycastle.crypto.agreement.ecjpake;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECJPAKERound1Payload {
    public final ECPoint gx1;
    public final ECPoint gx2;
    public final ECSchnorrZKP knowledgeProofForX1;
    public final ECSchnorrZKP knowledgeProofForX2;
    public final String participantId;

    public ECJPAKERound1Payload(String str, ECPoint eCPoint, ECPoint eCPoint2, ECSchnorrZKP eCSchnorrZKP, ECSchnorrZKP eCSchnorrZKP2) {
        ECJPAKEUtil.validateNotNull(str, "participantId");
        ECJPAKEUtil.validateNotNull(eCPoint, "gx1");
        ECJPAKEUtil.validateNotNull(eCPoint2, "gx2");
        ECJPAKEUtil.validateNotNull(eCSchnorrZKP, "knowledgeProofForX1");
        ECJPAKEUtil.validateNotNull(eCSchnorrZKP2, "knowledgeProofForX2");
        this.participantId = str;
        this.gx1 = eCPoint;
        this.gx2 = eCPoint2;
        this.knowledgeProofForX1 = eCSchnorrZKP;
        this.knowledgeProofForX2 = eCSchnorrZKP2;
    }

    public ECPoint getGx1() {
        return this.gx1;
    }

    public ECPoint getGx2() {
        return this.gx2;
    }

    public ECSchnorrZKP getKnowledgeProofForX1() {
        return this.knowledgeProofForX1;
    }

    public ECSchnorrZKP getKnowledgeProofForX2() {
        return this.knowledgeProofForX2;
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
