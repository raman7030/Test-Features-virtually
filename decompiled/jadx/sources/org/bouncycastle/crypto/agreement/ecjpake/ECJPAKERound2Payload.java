package org.bouncycastle.crypto.agreement.ecjpake;

import com.umeng.analytics.pro.C0655am;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECJPAKERound2Payload {

    /* JADX INFO: renamed from: a */
    public final ECPoint f80748a;
    public final ECSchnorrZKP knowledgeProofForX2s;
    public final String participantId;

    public ECJPAKERound2Payload(String str, ECPoint eCPoint, ECSchnorrZKP eCSchnorrZKP) {
        ECJPAKEUtil.validateNotNull(str, "participantId");
        ECJPAKEUtil.validateNotNull(eCPoint, C0655am.f2320av);
        ECJPAKEUtil.validateNotNull(eCSchnorrZKP, "knowledgeProofForX2s");
        this.participantId = str;
        this.f80748a = eCPoint;
        this.knowledgeProofForX2s = eCSchnorrZKP;
    }

    public ECPoint getA() {
        return this.f80748a;
    }

    public ECSchnorrZKP getKnowledgeProofForX2s() {
        return this.knowledgeProofForX2s;
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
