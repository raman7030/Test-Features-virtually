package org.bouncycastle.crypto.agreement.ecjpake;

import com.umeng.analytics.pro.am;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECJPAKERound2Payload {
    public final ECPoint a;
    public final ECSchnorrZKP knowledgeProofForX2s;
    public final String participantId;

    public ECJPAKERound2Payload(String str, ECPoint eCPoint, ECSchnorrZKP eCSchnorrZKP) {
        ECJPAKEUtil.validateNotNull(str, "participantId");
        ECJPAKEUtil.validateNotNull(eCPoint, am.av);
        ECJPAKEUtil.validateNotNull(eCSchnorrZKP, "knowledgeProofForX2s");
        this.participantId = str;
        this.a = eCPoint;
        this.knowledgeProofForX2s = eCSchnorrZKP;
    }

    public ECPoint getA() {
        return this.a;
    }

    public ECSchnorrZKP getKnowledgeProofForX2s() {
        return this.knowledgeProofForX2s;
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
